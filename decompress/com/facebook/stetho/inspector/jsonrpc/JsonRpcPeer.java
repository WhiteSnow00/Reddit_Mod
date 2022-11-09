// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import java.nio.channels.NotYetConnectedException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import org.json.JSONObject;
import com.facebook.stetho.common.Util;
import java.util.HashMap;
import java.util.Map;
import com.facebook.stetho.websocket.SimpleSession;
import com.facebook.stetho.json.ObjectMapper;

public class JsonRpcPeer
{
    private final DisconnectObservable mDisconnectObservable;
    private long mNextRequestId;
    private final ObjectMapper mObjectMapper;
    private final SimpleSession mPeer;
    private final Map<Long, PendingRequest> mPendingRequests;
    
    public JsonRpcPeer(final ObjectMapper mObjectMapper, final SimpleSession simpleSession) {
        this.mPendingRequests = new HashMap<Long, PendingRequest>();
        this.mDisconnectObservable = new DisconnectObservable(null);
        this.mObjectMapper = mObjectMapper;
        this.mPeer = Util.throwIfNull(simpleSession);
    }
    
    private long preparePendingRequest(final PendingRequestCallback pendingRequestCallback) {
        synchronized (this) {
            final long mNextRequestId = this.mNextRequestId;
            this.mNextRequestId = 1L + mNextRequestId;
            this.mPendingRequests.put(mNextRequestId, new PendingRequest(mNextRequestId, pendingRequestCallback));
            return mNextRequestId;
        }
    }
    
    public PendingRequest getAndRemovePendingRequest(final long n) {
        synchronized (this) {
            return this.mPendingRequests.remove(n);
        }
    }
    
    public SimpleSession getWebSocket() {
        return this.mPeer;
    }
    
    public void invokeDisconnectReceivers() {
        this.mDisconnectObservable.onDisconnect();
    }
    
    public void invokeMethod(String string, final Object o, final PendingRequestCallback pendingRequestCallback) throws NotYetConnectedException {
        Util.throwIfNull(string);
        Long value;
        if (pendingRequestCallback != null) {
            value = this.preparePendingRequest(pendingRequestCallback);
        }
        else {
            value = null;
        }
        string = this.mObjectMapper.convertValue(new JsonRpcRequest(value, string, this.mObjectMapper.convertValue(o, JSONObject.class)), JSONObject.class).toString();
        this.mPeer.sendText(string);
    }
    
    public void registerDisconnectReceiver(final DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.registerObserver((Object)disconnectReceiver);
    }
    
    public void unregisterDisconnectReceiver(final DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.unregisterObserver((Object)disconnectReceiver);
    }
    
    public static class DisconnectObservable extends Observable<DisconnectReceiver>
    {
        private DisconnectObservable() {
        }
        
        public void onDisconnect() {
            for (int size = super.mObservers.size(), i = 0; i < size; ++i) {
                ((DisconnectReceiver)super.mObservers.get(i)).onDisconnect();
            }
        }
    }
}
