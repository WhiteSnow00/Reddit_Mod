// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.io.OutputStream;
import java.nio.channels.Channels;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import java.io.Closeable;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.net.HttpURLConnection;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class HttpUrlConnectionClient implements HttpClient
{
    private static final int BUFFER_SIZE = 16384;
    private static final int DEFAULT_CONNECT_TIMEOUT_MS = 10000;
    private static final int DEFAULT_READ_TIMEOUT_MS = 10000;
    private final ExecutorService executor;
    
    public HttpUrlConnectionClient() {
        this.executor = Executors.newFixedThreadPool(3);
    }
    
    public static void access$000(final HttpUrlConnectionClient httpUrlConnectionClient, final Request request, final ResponseCallback responseCallback) {
        httpUrlConnectionClient.executeSync(request, responseCallback);
    }
    
    private Response blockingExecute(final HttpURLConnection httpURLConnection, final Request request, final ResponseCallback responseCallback) throws IOException {
        httpURLConnection.setRequestMethod(request.getMethod().toString().toUpperCase(Locale.ROOT));
        httpURLConnection.setInstanceFollowRedirects(true);
        if (request.getTimeout() > 0) {
            httpURLConnection.setConnectTimeout((int)TimeUnit.SECONDS.toMillis(request.getTimeout()));
            httpURLConnection.setReadTimeout(10000);
        }
        else {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
        }
        for (final Map.Entry<String, V> entry : request.getHeaders().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
        this.writeRequestContent(httpURLConnection, request, responseCallback);
        httpURLConnection.connect();
        final int responseCode = httpURLConnection.getResponseCode();
        final Response response = new Response(responseCode);
        for (final Map.Entry<K, List> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
            final List list = entry2.getValue();
            if (!list.isEmpty()) {
                final String s = (String)entry2.getKey();
                String s2;
                if (list.isEmpty()) {
                    s2 = "";
                }
                else {
                    s2 = (String)list.get(0);
                }
                response.setHeader(s, s2);
            }
        }
        if (responseCode == 302 || responseCode == 301) {
            final String header = response.getHeader("Location");
            if (header != null) {
                final Request request2 = new Request(header, request.getMethod());
                request2.getHeaders().putAll(request.getHeaders());
                disconnect(httpURLConnection);
                return this.blockingExecute(this.openConnection(request2), request2, responseCallback);
            }
        }
        response.setConsumer(this.executor, (StreamConsumer)new InputStreamConsumer(request, (InputStreamConsumer.InputStreamConsumer$Provider)new InputStreamConsumer$Provider(this, httpURLConnection) {
            public final HttpUrlConnectionClient this$0;
            public final HttpURLConnection val$connection;
            
            public InputStream getInputStream(final int n) throws IOException {
                if (n > 0) {
                    this.val$connection.setReadTimeout((int)TimeUnit.SECONDS.toMillis(n));
                }
                InputStream inputStream;
                if ((inputStream = this.val$connection.getErrorStream()) == null) {
                    inputStream = this.val$connection.getInputStream();
                }
                return inputStream;
            }
        }));
        return response;
    }
    
    private static void close(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static void disconnect(final HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void executeAsync(final Request request, final ResponseCallback responseCallback) {
        request.setFuture((Future)this.executor.submit((Runnable)new HttpUrlConnectionClient$1(this, request, responseCallback)));
    }
    
    private void executeSync(final Request request, final ResponseCallback responseCallback) {
        HttpURLConnection openConnection;
        try {
            openConnection = this.openConnection(request);
            try {
                final Response blockingExecute = this.blockingExecute(openConnection, request, responseCallback);
                synchronized (request.lock()) {
                    if (!request.isCancelled()) {
                        responseCallback.onResponse(blockingExecute);
                    }
                }
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex) {
            openConnection = null;
        }
        disconnect(openConnection);
        final IOException ex;
        ex.printStackTrace();
        synchronized (request.lock()) {
            if (!request.isCancelled()) {
                responseCallback.onError((Exception)ex);
            }
        }
    }
    
    private HttpURLConnection openConnection(final Request request) throws IOException {
        return (HttpURLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(request.getUrl()).openConnection());
    }
    
    private void writeRequestContent(HttpURLConnection outputStream, final Request request, final ResponseCallback responseCallback) throws IOException {
        if (request.getContent() != null) {
            outputStream.setDoOutput(true);
            outputStream = (HttpURLConnection)outputStream.getOutputStream();
            try {
                try {
                    Channels.newChannel((OutputStream)outputStream).write(request.getContent());
                    close((Closeable)outputStream);
                }
                finally {}
            }
            catch (final IOException ex) {
                ex.printStackTrace();
                synchronized (request.lock()) {
                    if (!request.isCancelled()) {
                        responseCallback.onError((Exception)ex);
                    }
                }
            }
            close((Closeable)outputStream);
        }
    }
    
    public void execute(final Request request, final ResponseCallback responseCallback) {
        this.executeAsync(request, responseCallback);
    }
    
    public void release() {
        this.executor.shutdown();
    }
}
