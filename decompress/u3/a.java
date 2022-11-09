// 
// Decompiled by Procyon v0.6.0
// 

package u3;

import android.net.ConnectivityManager;

public final class a
{
    public static boolean a(final ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
