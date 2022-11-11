// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.Util;
import java.nio.channels.NotYetConnectedException;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.util.HashMap;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Map;

public class ChromePeerManager
{
    private static final String TAG = "ChromePeerManager";
    private PeerRegistrationListener mListener;
    private final Map<JsonRpcPeer, DisconnectReceiver> mReceivingPeers;
    private JsonRpcPeer[] mReceivingPeersSnapshot;
    
    public ChromePeerManager() {
        this.mReceivingPeers = new HashMap<JsonRpcPeer, DisconnectReceiver>();
    }
    
    private JsonRpcPeer[] getReceivingPeersSnapshot() {
        synchronized (this) {
            if (this.mReceivingPeersSnapshot == null) {
                this.mReceivingPeersSnapshot = this.mReceivingPeers.keySet().toArray(new JsonRpcPeer[this.mReceivingPeers.size()]);
            }
            return this.mReceivingPeersSnapshot;
        }
    }
    
    private void sendMessageToPeers(final String s, final Object o, final PendingRequestCallback pendingRequestCallback) {
        for (final JsonRpcPeer jsonRpcPeer : this.getReceivingPeersSnapshot()) {
            try {
                jsonRpcPeer.invokeMethod(s, o, pendingRequestCallback);
            }
            catch (final NotYetConnectedException ex) {
                LogRedirector.e("ChromePeerManager", "Error delivering data to Chrome", (Throwable)ex);
            }
        }
    }
    
    public boolean addPeer(final JsonRpcPeer jsonRpcPeer) {
        synchronized (this) {
            if (this.mReceivingPeers.containsKey(jsonRpcPeer)) {
                return false;
            }
            final ChromePeerManager.ChromePeerManager$UnregisterOnDisconnect chromePeerManager$UnregisterOnDisconnect = new ChromePeerManager.ChromePeerManager$UnregisterOnDisconnect(this, jsonRpcPeer);
            jsonRpcPeer.registerDisconnectReceiver((DisconnectReceiver)chromePeerManager$UnregisterOnDisconnect);
            this.mReceivingPeers.put(jsonRpcPeer, (DisconnectReceiver)chromePeerManager$UnregisterOnDisconnect);
            this.mReceivingPeersSnapshot = null;
            final PeerRegistrationListener mListener = this.mListener;
            if (mListener != null) {
                mListener.onPeerRegistered(jsonRpcPeer);
            }
            return true;
        }
    }
    
    public boolean hasRegisteredPeers() {
        synchronized (this) {
            return this.mReceivingPeers.isEmpty() ^ true;
        }
    }
    
    public void invokeMethodOnPeers(final String s, final Object o, final PendingRequestCallback pendingRequestCallback) {
        Util.throwIfNull((Object)pendingRequestCallback);
        this.sendMessageToPeers(s, o, pendingRequestCallback);
    }
    
    public void removePeer(final JsonRpcPeer jsonRpcPeer) {
        synchronized (this) {
            if (this.mReceivingPeers.remove(jsonRpcPeer) != null) {
                this.mReceivingPeersSnapshot = null;
                final PeerRegistrationListener mListener = this.mListener;
                if (mListener != null) {
                    mListener.onPeerUnregistered(jsonRpcPeer);
                }
            }
        }
    }
    
    public void sendNotificationToPeers(final String s, final Object o) {
        this.sendMessageToPeers(s, o, null);
    }
    
    public void setListener(final PeerRegistrationListener mListener) {
        synchronized (this) {
            this.mListener = mListener;
        }
    }
}
