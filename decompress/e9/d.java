// 
// Decompiled by Procyon v0.6.0
// 

package e9;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.util.Log;
import ng.f0;
import android.net.ConnectivityManager;
import com.bumptech.glide.j$c;
import android.content.Context;

public final class d implements b
{
    public final Context f;
    public final b$a g;
    public boolean h;
    public boolean i;
    public final d$a j;
    
    public d(final Context context, final j$c g) {
        this.j = new d$a(this);
        this.f = context.getApplicationContext();
        this.g = (b$a)g;
    }
    
    public static boolean a(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        f0.a2(connectivityManager);
        boolean b = true;
        try {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                b = false;
            }
            return b;
        }
        catch (final RuntimeException ex) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", (Throwable)ex);
            }
            return true;
        }
    }
    
    public final void onDestroy() {
    }
    
    public final void onStart() {
        if (!this.i) {
            this.h = a(this.f);
            try {
                this.f.registerReceiver((BroadcastReceiver)this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.i = true;
            }
            catch (final SecurityException ex) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", (Throwable)ex);
                }
            }
        }
    }
    
    public final void onStop() {
        if (this.i) {
            this.f.unregisterReceiver((BroadcastReceiver)this.j);
            this.i = false;
        }
    }
}
