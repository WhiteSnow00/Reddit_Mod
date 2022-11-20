// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.ConnectivityManager$NetworkCallback;
import m6.a;
import android.content.Context;
import b6.j;
import android.net.ConnectivityManager;
import g6.b;

public final class e extends d<b>
{
    public static final String i;
    public final ConnectivityManager g;
    public e.e$a h;
    
    static {
        i = j.e("NetworkStateTracker");
    }
    
    public e(final Context context, final a a) {
        super(context, a);
        this.g = (ConnectivityManager)super.b.getSystemService("connectivity");
        this.h = new e.e$a(this);
    }
    
    public final Object a() {
        return this.e();
    }
    
    public final void c() {
        try {
            j.c().a(e.i, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final SecurityException ex;
        j.c().b(e.i, "Received exception while registering network callback", new Throwable[] { ex });
    }
    
    public final void d() {
        try {
            j.c().a(e.i, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final SecurityException ex;
        j.c().b(e.i, "Received exception while unregistering network callback", new Throwable[] { ex });
    }
    
    public final b e() {
        final NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean b = true;
        boolean b2;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3;
        while (true) {
            try {
                final NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
            }
            catch (final SecurityException ex) {
                j.c().b(e.i, "Unable to validate active network", new Throwable[] { ex });
                continue;
            }
            break;
        }
        final boolean a = u3.a.a(this.g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new b(b2, b3, a, b);
    }
}
