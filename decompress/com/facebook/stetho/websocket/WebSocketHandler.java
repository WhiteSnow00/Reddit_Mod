// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import com.facebook.stetho.server.http.LightHttpBody;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import com.facebook.stetho.server.http.LightHttpServer;
import com.facebook.stetho.server.http.LightHttpServer$HttpMessageWriter;
import java.io.BufferedOutputStream;
import com.facebook.stetho.server.http.LightHttpMessage;
import com.facebook.stetho.server.http.LightHttpResponse;
import com.facebook.stetho.server.http.LightHttpRequest;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.HttpHandler;

public class WebSocketHandler implements HttpHandler
{
    private static final String HEADER_CONNECTION = "Connection";
    private static final String HEADER_CONNECTION_UPGRADE = "Upgrade";
    private static final String HEADER_SEC_WEBSOCKET_ACCEPT = "Sec-WebSocket-Accept";
    private static final String HEADER_SEC_WEBSOCKET_KEY = "Sec-WebSocket-Key";
    private static final String HEADER_SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";
    private static final String HEADER_SEC_WEBSOCKET_VERSION = "Sec-WebSocket-Version";
    private static final String HEADER_SEC_WEBSOCKET_VERSION_13 = "13";
    private static final String HEADER_UPGRADE = "Upgrade";
    private static final String HEADER_UPGRADE_WEBSOCKET = "websocket";
    private static final String SERVER_KEY_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private final SimpleEndpoint mEndpoint;
    
    public WebSocketHandler(final SimpleEndpoint mEndpoint) {
        this.mEndpoint = mEndpoint;
    }
    
    private void doUpgrade(final SocketLike socketLike, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) throws IOException {
        lightHttpResponse.code = 101;
        lightHttpResponse.reasonPhrase = "Switching Protocols";
        lightHttpResponse.addHeader("Upgrade", "websocket");
        lightHttpResponse.addHeader("Connection", "Upgrade");
        lightHttpResponse.body = null;
        final String firstHeaderValue = getFirstHeaderValue(lightHttpRequest, "Sec-WebSocket-Key");
        if (firstHeaderValue != null) {
            lightHttpResponse.addHeader("Sec-WebSocket-Accept", generateServerKey(firstHeaderValue));
        }
        final InputStream input = socketLike.getInput();
        final OutputStream output = socketLike.getOutput();
        LightHttpServer.writeResponseMessage(lightHttpResponse, new LightHttpServer$HttpMessageWriter(new BufferedOutputStream(output)));
        new WebSocketSession(input, output, this.mEndpoint).handle();
    }
    
    private static String generateServerKey(String s) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
            s = sb.toString();
            final MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(Utf8Charset.encodeUTF8(s));
            s = Base64.encodeToString(instance.digest(), 2);
            return s;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static String getFirstHeaderValue(final LightHttpMessage lightHttpMessage, final String s) {
        return lightHttpMessage.getFirstHeaderValue(s);
    }
    
    private static boolean isSupportableUpgradeRequest(final LightHttpRequest lightHttpRequest) {
        return "websocket".equalsIgnoreCase(getFirstHeaderValue(lightHttpRequest, "Upgrade")) && "Upgrade".equals(getFirstHeaderValue(lightHttpRequest, "Connection")) && "13".equals(getFirstHeaderValue(lightHttpRequest, "Sec-WebSocket-Version"));
    }
    
    public boolean handleRequest(final SocketLike socketLike, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) throws IOException {
        if (!isSupportableUpgradeRequest(lightHttpRequest)) {
            lightHttpResponse.code = 501;
            lightHttpResponse.reasonPhrase = "Not Implemented";
            lightHttpResponse.body = LightHttpBody.create("Not a supported WebSocket upgrade request\n", "text/plain");
            return true;
        }
        this.doUpgrade(socketLike, lightHttpRequest, lightHttpResponse);
        return false;
    }
}
