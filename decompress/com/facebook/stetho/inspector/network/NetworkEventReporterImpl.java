// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.util.ArrayList;
import java.io.InputStream;
import android.os.SystemClock;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.IOException;
import com.facebook.stetho.common.Utf8Charset;
import org.json.JSONException;
import org.json.JSONObject;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Network;
import java.util.concurrent.atomic.AtomicInteger;

public class NetworkEventReporterImpl implements NetworkEventReporter
{
    private static NetworkEventReporter sInstance;
    private final AtomicInteger mNextRequestId;
    private ResourceTypeHelper mResourceTypeHelper;
    
    private NetworkEventReporterImpl() {
        this.mNextRequestId = new AtomicInteger(0);
    }
    
    private static Network.WebSocketFrame convertFrame(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final Network.WebSocketFrame webSocketFrame = new Network.WebSocketFrame();
        webSocketFrame.opcode = inspectorWebSocketFrame.opcode();
        webSocketFrame.mask = inspectorWebSocketFrame.mask();
        webSocketFrame.payloadData = inspectorWebSocketFrame.payloadData();
        return webSocketFrame;
    }
    
    public static AsyncPrettyPrinter createPrettyPrinterForResponse(final NetworkEventReporter$InspectorResponse networkEventReporter$InspectorResponse, final AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
        if (asyncPrettyPrinterRegistry != null) {
            for (int i = 0; i < ((InspectorHeaders)networkEventReporter$InspectorResponse).headerCount(); ++i) {
                final AsyncPrettyPrinterFactory lookup = asyncPrettyPrinterRegistry.lookup(((InspectorHeaders)networkEventReporter$InspectorResponse).headerName(i));
                if (lookup != null) {
                    return lookup.getInstance(((InspectorHeaders)networkEventReporter$InspectorResponse).headerName(i), ((InspectorHeaders)networkEventReporter$InspectorResponse).headerValue(i));
                }
            }
        }
        return null;
    }
    
    private static Page.ResourceType determineResourceType(final AsyncPrettyPrinter asyncPrettyPrinter, final String s, final ResourceTypeHelper resourceTypeHelper) {
        if (asyncPrettyPrinter != null) {
            return asyncPrettyPrinter.getPrettifiedType().getResourceType();
        }
        Object o;
        if (s != null) {
            o = resourceTypeHelper.determineResourceType(s);
        }
        else {
            o = Page.ResourceType.OTHER;
        }
        return (Page.ResourceType)o;
    }
    
    private static JSONObject formatHeadersAsJSON(final InspectorHeaders inspectorHeaders) {
        final JSONObject jsonObject = new JSONObject();
        int i = 0;
        while (i < inspectorHeaders.headerCount()) {
            final String headerName = inspectorHeaders.headerName(i);
            final String headerValue = inspectorHeaders.headerValue(i);
            try {
                if (jsonObject.has(headerName)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(jsonObject.getString(headerName));
                    sb.append("\n");
                    sb.append(headerValue);
                    jsonObject.put(headerName, (Object)sb.toString());
                }
                else {
                    jsonObject.put(headerName, (Object)headerValue);
                }
                ++i;
                continue;
            }
            catch (final JSONException ex) {
                throw new RuntimeException((Throwable)ex);
            }
            break;
        }
        return jsonObject;
    }
    
    public static NetworkEventReporter get() {
        synchronized (NetworkEventReporterImpl.class) {
            if (NetworkEventReporterImpl.sInstance == null) {
                NetworkEventReporterImpl.sInstance = new NetworkEventReporterImpl();
            }
            return NetworkEventReporterImpl.sInstance;
        }
    }
    
    private String getContentType(final InspectorHeaders inspectorHeaders) {
        return inspectorHeaders.firstHeaderValue("Content-Type");
    }
    
    private NetworkPeerManager getPeerManagerIfEnabled() {
        final NetworkPeerManager instanceOrNull = NetworkPeerManager.getInstanceOrNull();
        if (instanceOrNull != null && instanceOrNull.hasRegisteredPeers()) {
            return instanceOrNull;
        }
        return null;
    }
    
    private ResourceTypeHelper getResourceTypeHelper() {
        if (this.mResourceTypeHelper == null) {
            this.mResourceTypeHelper = new ResourceTypeHelper();
        }
        return this.mResourceTypeHelper;
    }
    
    private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(final NetworkEventReporter$InspectorResponse networkEventReporter$InspectorResponse, final NetworkPeerManager networkPeerManager) {
        final AsyncPrettyPrinter prettyPrinterForResponse = createPrettyPrinterForResponse(networkEventReporter$InspectorResponse, networkPeerManager.getAsyncPrettyPrinterRegistry());
        if (prettyPrinterForResponse != null) {
            networkPeerManager.getResponseBodyFileManager().associateAsyncPrettyPrinterWithId(((InspectorResponseCommon)networkEventReporter$InspectorResponse).requestId(), prettyPrinterForResponse);
        }
        return prettyPrinterForResponse;
    }
    
    private void loadingFailed(final String requestId, final String errorText) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.LoadingFailedParams loadingFailedParams = new Network.LoadingFailedParams();
            loadingFailedParams.requestId = requestId;
            loadingFailedParams.timestamp = stethoNow() / 1000.0;
            loadingFailedParams.errorText = errorText;
            loadingFailedParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFailed", loadingFailedParams);
        }
    }
    
    private void loadingFinished(final String requestId) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.LoadingFinishedParams loadingFinishedParams = new Network.LoadingFinishedParams();
            loadingFinishedParams.requestId = requestId;
            loadingFinishedParams.timestamp = stethoNow() / 1000.0;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFinished", loadingFinishedParams);
        }
    }
    
    private static String readBodyAsString(final NetworkPeerManager networkPeerManager, NetworkEventReporter$InspectorRequest body) {
        try {
            body = (OutOfMemoryError)(Object)((NetworkEventReporter$InspectorRequest)body).body();
            if (body != null) {
                body = (OutOfMemoryError)new String((byte[])(Object)body, Utf8Charset.INSTANCE);
                return (String)body;
            }
            return null;
        }
        catch (final OutOfMemoryError body) {}
        catch (final IOException ex) {}
        final Console.MessageLevel warning = Console.MessageLevel.WARNING;
        final Console.MessageSource network = Console.MessageSource.NETWORK;
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not reproduce POST body: ");
        sb.append(body);
        CLog.writeToConsole(networkPeerManager, warning, network, sb.toString());
        return null;
    }
    
    private static long stethoNow() {
        return SystemClock.elapsedRealtime();
    }
    
    @Override
    public void dataReceived(final String requestId, final int dataLength, final int encodedDataLength) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.DataReceivedParams dataReceivedParams = new Network.DataReceivedParams();
            dataReceivedParams.requestId = requestId;
            dataReceivedParams.timestamp = stethoNow() / 1000.0;
            dataReceivedParams.dataLength = dataLength;
            dataReceivedParams.encodedDataLength = encodedDataLength;
            peerManagerIfEnabled.sendNotificationToPeers("Network.dataReceived", dataReceivedParams);
        }
    }
    
    @Override
    public void dataSent(final String s, final int n, final int n2) {
        this.dataReceived(s, n, n2);
    }
    
    @Override
    public void httpExchangeFailed(final String s, final String s2) {
        this.loadingFailed(s, s2);
    }
    
    @Override
    public InputStream interpretResponseStream(final String s, final String s2, final String s3, final InputStream inputStream, final ResponseHandler responseHandler) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Object determineResourceType = null;
            if (inputStream == null) {
                responseHandler.onEOF();
                return null;
            }
            if (s2 != null) {
                determineResourceType = this.getResourceTypeHelper().determineResourceType(s2);
            }
            boolean b = false;
            if (determineResourceType != null) {
                b = b;
                if (determineResourceType == Page.ResourceType.IMAGE) {
                    b = true;
                }
            }
            try {
                return DecompressionHelper.teeInputWithDecompression(peerManagerIfEnabled, s, inputStream, peerManagerIfEnabled.getResponseBodyFileManager().openResponseBodyFile(s, b), s3, responseHandler);
            }
            catch (final IOException ex) {
                final Console.MessageLevel error = Console.MessageLevel.ERROR;
                final Console.MessageSource network = Console.MessageSource.NETWORK;
                final StringBuilder sb = new StringBuilder();
                sb.append("Error writing response body data for request #");
                sb.append(s);
                CLog.writeToConsole(peerManagerIfEnabled, error, network, sb.toString());
            }
        }
        return inputStream;
    }
    
    @Override
    public boolean isEnabled() {
        return this.getPeerManagerIfEnabled() != null;
    }
    
    @Override
    public String nextRequestId() {
        return String.valueOf(this.mNextRequestId.getAndIncrement());
    }
    
    @Override
    public void requestWillBeSent(final NetworkEventReporter$InspectorRequest networkEventReporter$InspectorRequest) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.Request request = new Network.Request();
            request.url = networkEventReporter$InspectorRequest.url();
            request.method = networkEventReporter$InspectorRequest.method();
            request.headers = formatHeadersAsJSON((InspectorHeaders)networkEventReporter$InspectorRequest);
            request.postData = readBodyAsString(peerManagerIfEnabled, networkEventReporter$InspectorRequest);
            final String friendlyName = ((InspectorRequestCommon)networkEventReporter$InspectorRequest).friendlyName();
            final Integer friendlyNameExtra = networkEventReporter$InspectorRequest.friendlyNameExtra();
            final Network.Initiator initiator = new Network.Initiator();
            initiator.type = Network.InitiatorType.SCRIPT;
            final ArrayList stackTrace = new ArrayList();
            initiator.stackTrace = stackTrace;
            int intValue;
            if (friendlyNameExtra != null) {
                intValue = friendlyNameExtra;
            }
            else {
                intValue = 0;
            }
            stackTrace.add(new Console.CallFrame(friendlyName, friendlyName, intValue, 0));
            final Network.RequestWillBeSentParams requestWillBeSentParams = new Network.RequestWillBeSentParams();
            requestWillBeSentParams.requestId = ((InspectorRequestCommon)networkEventReporter$InspectorRequest).id();
            requestWillBeSentParams.frameId = "1";
            requestWillBeSentParams.loaderId = "1";
            requestWillBeSentParams.documentURL = networkEventReporter$InspectorRequest.url();
            requestWillBeSentParams.request = request;
            requestWillBeSentParams.timestamp = stethoNow() / 1000.0;
            requestWillBeSentParams.initiator = initiator;
            requestWillBeSentParams.redirectResponse = null;
            requestWillBeSentParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.requestWillBeSent", requestWillBeSentParams);
        }
    }
    
    @Override
    public void responseHeadersReceived(final NetworkEventReporter$InspectorResponse networkEventReporter$InspectorResponse) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.Response response = new Network.Response();
            response.url = networkEventReporter$InspectorResponse.url();
            response.status = ((InspectorResponseCommon)networkEventReporter$InspectorResponse).statusCode();
            response.statusText = ((InspectorResponseCommon)networkEventReporter$InspectorResponse).reasonPhrase();
            response.headers = formatHeadersAsJSON((InspectorHeaders)networkEventReporter$InspectorResponse);
            final String contentType = this.getContentType((InspectorHeaders)networkEventReporter$InspectorResponse);
            String stripContentExtras;
            if (contentType != null) {
                stripContentExtras = this.getResourceTypeHelper().stripContentExtras(contentType);
            }
            else {
                stripContentExtras = "application/octet-stream";
            }
            response.mimeType = stripContentExtras;
            response.connectionReused = networkEventReporter$InspectorResponse.connectionReused();
            response.connectionId = networkEventReporter$InspectorResponse.connectionId();
            response.fromDiskCache = networkEventReporter$InspectorResponse.fromDiskCache();
            final Network.ResponseReceivedParams responseReceivedParams = new Network.ResponseReceivedParams();
            responseReceivedParams.requestId = ((InspectorResponseCommon)networkEventReporter$InspectorResponse).requestId();
            responseReceivedParams.frameId = "1";
            responseReceivedParams.loaderId = "1";
            responseReceivedParams.timestamp = stethoNow() / 1000.0;
            responseReceivedParams.response = response;
            responseReceivedParams.type = determineResourceType(initAsyncPrettyPrinterForResponse(networkEventReporter$InspectorResponse, peerManagerIfEnabled), contentType, this.getResourceTypeHelper());
            peerManagerIfEnabled.sendNotificationToPeers("Network.responseReceived", responseReceivedParams);
        }
    }
    
    @Override
    public void responseReadFailed(final String s, final String s2) {
        this.loadingFailed(s, s2);
    }
    
    @Override
    public void responseReadFinished(final String s) {
        this.loadingFinished(s);
    }
    
    @Override
    public void webSocketClosed(final String requestId) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketClosedParams webSocketClosedParams = new Network.WebSocketClosedParams();
            webSocketClosedParams.requestId = requestId;
            webSocketClosedParams.timestamp = stethoNow() / 1000.0;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketClosed", webSocketClosedParams);
        }
    }
    
    @Override
    public void webSocketCreated(final String requestId, final String url) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketCreatedParams webSocketCreatedParams = new Network.WebSocketCreatedParams();
            webSocketCreatedParams.requestId = requestId;
            webSocketCreatedParams.url = url;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketCreated", webSocketCreatedParams);
        }
    }
    
    @Override
    public void webSocketFrameError(final String requestId, final String errorMessage) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameErrorParams webSocketFrameErrorParams = new Network.WebSocketFrameErrorParams();
            webSocketFrameErrorParams.requestId = requestId;
            webSocketFrameErrorParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameErrorParams.errorMessage = errorMessage;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameError", webSocketFrameErrorParams);
        }
    }
    
    @Override
    public void webSocketFrameReceived(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameReceivedParams webSocketFrameReceivedParams = new Network.WebSocketFrameReceivedParams();
            webSocketFrameReceivedParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameReceivedParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameReceivedParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameReceived", webSocketFrameReceivedParams);
        }
    }
    
    @Override
    public void webSocketFrameSent(final InspectorWebSocketFrame inspectorWebSocketFrame) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketFrameSentParams webSocketFrameSentParams = new Network.WebSocketFrameSentParams();
            webSocketFrameSentParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameSentParams.timestamp = stethoNow() / 1000.0;
            webSocketFrameSentParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameSent", webSocketFrameSentParams);
        }
    }
    
    @Override
    public void webSocketHandshakeResponseReceived(final NetworkEventReporter$InspectorWebSocketResponse networkEventReporter$InspectorWebSocketResponse) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketHandshakeResponseReceivedParams webSocketHandshakeResponseReceivedParams = new Network.WebSocketHandshakeResponseReceivedParams();
            webSocketHandshakeResponseReceivedParams.requestId = ((InspectorResponseCommon)networkEventReporter$InspectorWebSocketResponse).requestId();
            webSocketHandshakeResponseReceivedParams.timestamp = stethoNow() / 1000.0;
            final Network.WebSocketResponse response = new Network.WebSocketResponse();
            response.headers = formatHeadersAsJSON((InspectorHeaders)networkEventReporter$InspectorWebSocketResponse);
            response.headersText = null;
            if (networkEventReporter$InspectorWebSocketResponse.requestHeaders() != null) {
                response.requestHeaders = formatHeadersAsJSON(networkEventReporter$InspectorWebSocketResponse.requestHeaders());
                response.requestHeadersText = null;
            }
            response.status = ((InspectorResponseCommon)networkEventReporter$InspectorWebSocketResponse).statusCode();
            response.statusText = ((InspectorResponseCommon)networkEventReporter$InspectorWebSocketResponse).reasonPhrase();
            webSocketHandshakeResponseReceivedParams.response = response;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketHandshakeResponseReceived", webSocketHandshakeResponseReceivedParams);
        }
    }
    
    @Override
    public void webSocketWillSendHandshakeRequest(final NetworkEventReporter$InspectorWebSocketRequest networkEventReporter$InspectorWebSocketRequest) {
        final NetworkPeerManager peerManagerIfEnabled = this.getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            final Network.WebSocketWillSendHandshakeRequestParams webSocketWillSendHandshakeRequestParams = new Network.WebSocketWillSendHandshakeRequestParams();
            webSocketWillSendHandshakeRequestParams.requestId = ((InspectorRequestCommon)networkEventReporter$InspectorWebSocketRequest).id();
            webSocketWillSendHandshakeRequestParams.timestamp = stethoNow() / 1000.0;
            webSocketWillSendHandshakeRequestParams.wallTime = System.currentTimeMillis() / 1000.0;
            final Network.WebSocketRequest request = new Network.WebSocketRequest();
            request.headers = formatHeadersAsJSON((InspectorHeaders)networkEventReporter$InspectorWebSocketRequest);
            webSocketWillSendHandshakeRequestParams.request = request;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketWillSendHandshakeRequest", webSocketWillSendHandshakeRequestParams);
        }
    }
}
