// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import com.facebook.stetho.server.LeakyBufferedInputStream;
import java.io.OutputStream;
import android.net.Uri;
import ak0.m;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.facebook.stetho.server.SocketLike;

public class LightHttpServer
{
    private static final String TAG = "LightHttpServer";
    private final HandlerRegistry mHandlerRegistry;
    
    public LightHttpServer(final HandlerRegistry mHandlerRegistry) {
        this.mHandlerRegistry = mHandlerRegistry;
    }
    
    private boolean dispatchToHandler(SocketLike socketLike, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) throws IOException {
        final HttpHandler lookup = this.mHandlerRegistry.lookup(lightHttpRequest.uri.getPath());
        if (lookup == null) {
            lightHttpResponse.code = 404;
            lightHttpResponse.reasonPhrase = "Not found";
            lightHttpResponse.body = LightHttpBody.create("No handler found\n", "text/plain");
            return true;
        }
        try {
            return lookup.handleRequest(socketLike, lightHttpRequest, lightHttpResponse);
        }
        catch (final RuntimeException ex) {
            lightHttpResponse.code = 500;
            lightHttpResponse.reasonPhrase = "Internal Server Error";
            final StringWriter stringWriter = new StringWriter();
            socketLike = (SocketLike)new PrintWriter(stringWriter);
            try {
                ex.printStackTrace((PrintWriter)socketLike);
                ((PrintWriter)socketLike).close();
                lightHttpResponse.body = LightHttpBody.create(stringWriter.toString(), "text/plain");
                return true;
            }
            finally {
                ((PrintWriter)socketLike).close();
            }
        }
    }
    
    private static void readHeaders(final LightHttpMessage lightHttpMessage, final HttpMessageReader httpMessageReader) throws IOException {
        while (true) {
            final String line = httpMessageReader.readLine();
            if (line == null) {
                throw new EOFException();
            }
            if ("".equals(line)) {
                return;
            }
            final String[] split = line.split(": ", 2);
            if (split.length != 2) {
                throw new IOException(m.l("Malformed header: ", line));
            }
            final String s = split[0];
            final String s2 = split[1];
            lightHttpMessage.headerNames.add(s);
            lightHttpMessage.headerValues.add(s2);
        }
    }
    
    private static LightHttpRequest readRequestMessage(final LightHttpRequest lightHttpRequest, final HttpMessageReader httpMessageReader) throws IOException {
        lightHttpRequest.reset();
        final String line = httpMessageReader.readLine();
        if (line == null) {
            return null;
        }
        final String[] split = line.split(" ", 3);
        if (split.length == 3) {
            lightHttpRequest.method = split[0];
            lightHttpRequest.uri = Uri.parse(split[1]);
            lightHttpRequest.protocol = split[2];
            readHeaders((LightHttpMessage)lightHttpRequest, httpMessageReader);
            return lightHttpRequest;
        }
        throw new IOException(m.l("Invalid request line: ", line));
    }
    
    private static void writeFullResponse(final LightHttpResponse lightHttpResponse, final HttpMessageWriter httpMessageWriter, final OutputStream outputStream) throws IOException {
        lightHttpResponse.prepare();
        writeResponseMessage(lightHttpResponse, httpMessageWriter);
        final LightHttpBody body = lightHttpResponse.body;
        if (body != null) {
            body.writeTo(outputStream);
        }
    }
    
    public static void writeResponseMessage(final LightHttpResponse lightHttpResponse, final HttpMessageWriter httpMessageWriter) throws IOException {
        final StringBuilder k = a.k("HTTP/1.1 ");
        k.append(lightHttpResponse.code);
        k.append(" ");
        k.append(lightHttpResponse.reasonPhrase);
        httpMessageWriter.writeLine(k.toString());
        for (int size = ((LightHttpMessage)lightHttpResponse).headerNames.size(), i = 0; i < size; ++i) {
            final String s = ((LightHttpMessage)lightHttpResponse).headerNames.get(i);
            final String s2 = ((LightHttpMessage)lightHttpResponse).headerValues.get(i);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(": ");
            sb.append(s2);
            httpMessageWriter.writeLine(sb.toString());
        }
        httpMessageWriter.writeLine();
        httpMessageWriter.flush();
    }
    
    public void serve(final SocketLike socketLike) throws IOException {
        final LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(socketLike.getInput(), 1024);
        final OutputStream output = socketLike.getOutput();
        final HttpMessageReader httpMessageReader = new HttpMessageReader(leakyBufferedInputStream);
        final HttpMessageWriter httpMessageWriter = new HttpMessageWriter(new BufferedOutputStream(output));
        final SocketLike socketLike2 = new SocketLike(socketLike, leakyBufferedInputStream);
        final LightHttpRequest lightHttpRequest = new LightHttpRequest();
        final LightHttpResponse lightHttpResponse = new LightHttpResponse();
        while (true) {
            final LightHttpRequest requestMessage = readRequestMessage(lightHttpRequest, httpMessageReader);
            if (requestMessage == null) {
                break;
            }
            lightHttpResponse.reset();
            if (!this.dispatchToHandler(socketLike2, requestMessage, lightHttpResponse)) {
                break;
            }
            writeFullResponse(lightHttpResponse, httpMessageWriter, output);
        }
    }
    
    public static class HttpMessageReader
    {
        private final StringBuilder mBuffer;
        private final BufferedInputStream mIn;
        private final NewLineDetector mNewLineDetector;
        
        public HttpMessageReader(final BufferedInputStream mIn) {
            this.mBuffer = new StringBuilder();
            this.mNewLineDetector = new NewLineDetector(null);
            this.mIn = mIn;
        }
        
        public String readLine() throws IOException {
            while (true) {
                final int read = this.mIn.read();
                if (read < 0) {
                    return null;
                }
                final char c = (char)read;
                this.mNewLineDetector.accept(c);
                final int state = this.mNewLineDetector.state();
                if (state != 1) {
                    if (state != 3) {
                        continue;
                    }
                    final String string = this.mBuffer.toString();
                    this.mBuffer.setLength(0);
                    return string;
                }
                else {
                    this.mBuffer.append(c);
                }
            }
        }
        
        public static class NewLineDetector
        {
            private static final int STATE_ON_CR = 2;
            private static final int STATE_ON_CRLF = 3;
            private static final int STATE_ON_OTHER = 1;
            private int state;
            
            private NewLineDetector() {
                this.state = 1;
            }
            
            public void accept(final char c) {
                final int state = this.state;
                if (state != 1) {
                    if (state != 2) {
                        if (state != 3) {
                            final StringBuilder k = a.k("Unknown state: ");
                            k.append(this.state);
                            throw new IllegalArgumentException(k.toString());
                        }
                        if (c == '\r') {
                            this.state = 2;
                        }
                        else {
                            this.state = 1;
                        }
                    }
                    else if (c == '\n') {
                        this.state = 3;
                    }
                    else {
                        this.state = 1;
                    }
                }
                else if (c == '\r') {
                    this.state = 2;
                }
            }
            
            public int state() {
                return this.state;
            }
        }
    }
    
    public static class HttpMessageWriter
    {
        private static final byte[] CRLF;
        private final BufferedOutputStream mOut;
        
        static {
            CRLF = "\r\n".getBytes();
        }
        
        public HttpMessageWriter(final BufferedOutputStream mOut) {
            this.mOut = mOut;
        }
        
        public void flush() throws IOException {
            this.mOut.flush();
        }
        
        public void writeLine() throws IOException {
            this.mOut.write(HttpMessageWriter.CRLF);
        }
        
        public void writeLine(final String s) throws IOException {
            for (int length = s.length(), i = 0; i < length; ++i) {
                this.mOut.write(s.charAt(i));
            }
            this.mOut.write(HttpMessageWriter.CRLF);
        }
    }
}
