// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;

public final class j3 extends b7
{
    public j3(final g7 g7) {
        super(g7);
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final boolean Q() {
        this.N();
        final ConnectivityManager connectivityManager = (ConnectivityManager)((h4)super.f).f.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        final NetworkInfo networkInfo = activeNetworkInfo = null;
        Label_0036: {
            if (connectivityManager == null) {
                break Label_0036;
            }
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
            catch (final SecurityException ex) {
                activeNetworkInfo = networkInfo;
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
        }
    }
}
