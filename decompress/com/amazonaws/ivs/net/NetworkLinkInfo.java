// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import android.net.NetworkRequest$Builder;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.net.Network;
import android.util.Log;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager$NetworkCallback;

public class NetworkLinkInfo
{
    private ConnectivityManager$NetworkCallback callback;
    private ConnectivityManager connectivityManager;
    private final Context context;
    private Boolean isOnline;
    private final Object lock;
    private long nativeListener;
    
    public NetworkLinkInfo(final Context context) {
        this.isOnline = null;
        this.lock = new Object();
        this.context = context;
        if (context == null) {
            Log.w("AmazonIVS", "NetworkConnectivity null context, info not available");
        }
        else {
            this.connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        }
    }
    
    public static /* synthetic */ Object access$000(final NetworkLinkInfo networkLinkInfo) {
        return networkLinkInfo.lock;
    }
    
    public static /* synthetic */ Boolean access$102(final NetworkLinkInfo networkLinkInfo, final Boolean isOnline) {
        return networkLinkInfo.isOnline = isOnline;
    }
    
    public static /* synthetic */ long access$200(final NetworkLinkInfo networkLinkInfo) {
        return networkLinkInfo.nativeListener;
    }
    
    private Network getActiveNetwork() {
        if (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        return this.connectivityManager.getActiveNetwork();
    }
    
    private int getCellularMaxLinkSpeedKbps() {
        final int networkType = ((TelephonyManager)this.context.getSystemService("phone")).getNetworkType();
        if (networkType != 1) {
            if (networkType != 2) {
                if (networkType == 15) {
                    return 21000;
                }
                if (networkType != 16) {
                    if (networkType == 19) {
                        return 300000;
                    }
                    if (networkType == 20) {
                        return 1000000;
                    }
                    switch (networkType) {
                        default: {
                            return 1000;
                        }
                        case 13: {
                            return 50000;
                        }
                        case 12: {
                            return 3000;
                        }
                        case 10: {
                            return 7000;
                        }
                        case 8:
                        case 9: {
                            return 14000;
                        }
                        case 6: {
                            return 2000;
                        }
                        case 11: {
                            break;
                        }
                        case 7: {
                            return 100;
                        }
                    }
                }
            }
            return 300;
        }
        return 100;
    }
    
    private CellularNetworkType getCellularNetworkType() {
        final int networkType = ((TelephonyManager)this.context.getSystemService("phone")).getNetworkType();
        if (networkType == 0 || networkType == 1 || networkType == 2 || networkType == 7 || networkType == 11) {
            return CellularNetworkType.TYPE_2G;
        }
        if (networkType == 13 || networkType == 19) {
            return CellularNetworkType.TYPE_4G;
        }
        if (networkType != 20) {
            return CellularNetworkType.TYPE_3G;
        }
        return CellularNetworkType.TYPE_5G;
    }
    
    private native void onNetworkAvailable(final long p0);
    
    private native void onNetworkLost(final long p0);
    
    public int getDownlinkBandwidth() {
        if (this.context != null) {
            final NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.getActiveNetwork());
            if (networkCapabilities != null) {
                Label_0102: {
                    if (!networkCapabilities.hasTransport(1)) {
                        break Label_0102;
                    }
                    final WifiManager wifiManager = (WifiManager)this.context.getApplicationContext().getSystemService("wifi");
                    if (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0) {
                        Log.w("AmazonIVS", "No permission for ACCESS_WIFI_STATE");
                        break Label_0102;
                    }
                    WifiInfo connectionInfo;
                    if (wifiManager == null) {
                        connectionInfo = null;
                    }
                    else {
                        connectionInfo = wifiManager.getConnectionInfo();
                    }
                    if (connectionInfo == null) {
                        break Label_0102;
                    }
                    final int n = connectionInfo.getLinkSpeed() * 1000;
                    return n * 1000;
                }
                if (networkCapabilities.hasTransport(0)) {
                    final int n = Math.min(this.getCellularMaxLinkSpeedKbps(), networkCapabilities.getLinkDownstreamBandwidthKbps());
                    return n * 1000;
                }
                final int n = networkCapabilities.getLinkDownstreamBandwidthKbps();
                return n * 1000;
            }
        }
        return -1;
    }
    
    public boolean getNetworkOnline() {
        final Boolean isOnline = this.isOnline;
        if (isOnline != null) {
            return isOnline;
        }
        final NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    public String getNetworkType() {
        if (this.context != null) {
            final Network activeNetwork = this.getActiveNetwork();
            if (activeNetwork == null) {
                return "Unknown";
            }
            final NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return "Unknown";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "Ethernet";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "Wifi";
            }
            if (networkCapabilities.hasTransport(2)) {
                return "Bluetooth";
            }
            if (networkCapabilities.hasTransport(0)) {
                if (this.context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                    return "Cellular";
                }
                final int n = NetworkLinkInfo$2.$SwitchMap$com$amazonaws$ivs$net$NetworkLinkInfo$CellularNetworkType[this.getCellularNetworkType().ordinal()];
                if (n == 1) {
                    return "Cellular_2g";
                }
                if (n == 3) {
                    return "Cellular_4g";
                }
                if (n != 4) {
                    return "Cellular_3g";
                }
                return "Cellular_5g";
            }
        }
        return "Unknown";
    }
    
    public void setListener(final long nativeListener) {
        synchronized (this.lock) {
            this.nativeListener = nativeListener;
            final ConnectivityManager$NetworkCallback callback = this.callback;
            if (callback != null) {
                try {
                    this.connectivityManager.unregisterNetworkCallback(callback);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("AmazonIVS", "NetworkCallback was already unregistered");
                }
                this.callback = null;
            }
            if (this.nativeListener != 0L) {
                this.callback = new ConnectivityManager$NetworkCallback() {
                    public void onAvailable(final Network network) {
                        synchronized (NetworkLinkInfo.access$000(NetworkLinkInfo.this)) {
                            NetworkLinkInfo.access$102(NetworkLinkInfo.this, Boolean.TRUE);
                            if (NetworkLinkInfo.access$200(NetworkLinkInfo.this) != 0L) {
                                final NetworkLinkInfo this$0 = NetworkLinkInfo.this;
                                this$0.onNetworkAvailable(NetworkLinkInfo.access$200(this$0));
                            }
                        }
                    }
                    
                    public void onLost(final Network network) {
                        synchronized (NetworkLinkInfo.access$000(NetworkLinkInfo.this)) {
                            NetworkLinkInfo.access$102(NetworkLinkInfo.this, Boolean.FALSE);
                            if (NetworkLinkInfo.access$200(NetworkLinkInfo.this) != 0L) {
                                final NetworkLinkInfo this$0 = NetworkLinkInfo.this;
                                this$0.onNetworkLost(NetworkLinkInfo.access$200(this$0));
                            }
                        }
                    }
                };
                this.connectivityManager.registerNetworkCallback(new NetworkRequest$Builder().build(), this.callback);
            }
        }
    }
    
    public enum CellularNetworkType
    {
        TYPE_2G, 
        TYPE_3G, 
        TYPE_4G, 
        TYPE_5G;
    }
}
