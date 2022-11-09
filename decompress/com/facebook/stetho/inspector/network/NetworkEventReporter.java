// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.InputStream;

public interface NetworkEventReporter
{
    void dataReceived(final String p0, final int p1, final int p2);
    
    void dataSent(final String p0, final int p1, final int p2);
    
    void httpExchangeFailed(final String p0, final String p1);
    
    InputStream interpretResponseStream(final String p0, final String p1, final String p2, final InputStream p3, final ResponseHandler p4);
    
    boolean isEnabled();
    
    String nextRequestId();
    
    void requestWillBeSent(final NetworkEventReporter.NetworkEventReporter$InspectorRequest p0);
    
    void responseHeadersReceived(final NetworkEventReporter.NetworkEventReporter$InspectorResponse p0);
    
    void responseReadFailed(final String p0, final String p1);
    
    void responseReadFinished(final String p0);
    
    void webSocketClosed(final String p0);
    
    void webSocketCreated(final String p0, final String p1);
    
    void webSocketFrameError(final String p0, final String p1);
    
    void webSocketFrameReceived(final InspectorWebSocketFrame p0);
    
    void webSocketFrameSent(final InspectorWebSocketFrame p0);
    
    void webSocketHandshakeResponseReceived(final NetworkEventReporter.NetworkEventReporter$InspectorWebSocketResponse p0);
    
    void webSocketWillSendHandshakeRequest(final NetworkEventReporter.NetworkEventReporter$InspectorWebSocketRequest p0);
    
    public interface InspectorHeaders
    {
        String firstHeaderValue(final String p0);
        
        int headerCount();
        
        String headerName(final int p0);
        
        String headerValue(final int p0);
    }
    
    public interface InspectorRequestCommon extends InspectorHeaders
    {
        String friendlyName();
        
        String id();
    }
    
    public interface InspectorResponseCommon extends InspectorHeaders
    {
        String reasonPhrase();
        
        String requestId();
        
        int statusCode();
    }
    
    public interface InspectorWebSocketFrame
    {
        public static final int OPCODE_BINARY = 2;
        public static final int OPCODE_CONNECTION_CLOSE = 8;
        public static final int OPCODE_CONTINUATION = 0;
        public static final int OPCODE_PING = 9;
        public static final int OPCODE_PONG = 10;
        public static final int OPCODE_TEXT = 1;
        
        boolean mask();
        
        int opcode();
        
        String payloadData();
        
        String requestId();
    }
}
