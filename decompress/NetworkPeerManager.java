// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import android.content.Context;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class NetworkPeerManager extends ChromePeerManager
{
    private static NetworkPeerManager sInstance;
    private AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
    private AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
    private final ResponseBodyFileManager mResponseBodyFileManager;
    private final PeersRegisteredListener mTempFileCleanup;
    
    public NetworkPeerManager(final ResponseBodyFileManager mResponseBodyFileManager) {
        final NetworkPeerManager$1 networkPeerManager$1 = new NetworkPeerManager$1(this);
        this.mTempFileCleanup = (PeersRegisteredListener)networkPeerManager$1;
        this.mResponseBodyFileManager = mResponseBodyFileManager;
        this.setListener((PeerRegistrationListener)networkPeerManager$1);
    }
    
    public static NetworkPeerManager getInstanceOrNull() {
        synchronized (NetworkPeerManager.class) {
            return NetworkPeerManager.sInstance;
        }
    }
    
    public static NetworkPeerManager getOrCreateInstance(final Context context) {
        synchronized (NetworkPeerManager.class) {
            if (NetworkPeerManager.sInstance == null) {
                NetworkPeerManager.sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
            }
            return NetworkPeerManager.sInstance;
        }
    }
    
    public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry() {
        return this.mAsyncPrettyPrinterRegistry;
    }
    
    public ResponseBodyFileManager getResponseBodyFileManager() {
        return this.mResponseBodyFileManager;
    }
    
    public void setPrettyPrinterInitializer(final AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
        Util.throwIfNotNull(this.mPrettyPrinterInitializer);
        this.mPrettyPrinterInitializer = Util.throwIfNull(asyncPrettyPrinterInitializer);
    }
}
