// 
// Decompiled by Procyon v0.6.0
// 

package i6;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import m6.a;
import android.content.Context;
import b6.j;

public abstract class c<T> extends d<T>
{
    public static final String h;
    public final c$a g;
    
    static {
        h = j.e("BrdcstRcvrCnstrntTrckr");
    }
    
    public c(final Context context, final a a) {
        super(context, a);
        this.g = new c$a(this);
    }
    
    public final void c() {
        j.c().a(c.h, String.format("%s: registering receiver", this.getClass().getSimpleName()), new Throwable[0]);
        super.b.registerReceiver((BroadcastReceiver)this.g, this.e());
    }
    
    public final void d() {
        j.c().a(c.h, String.format("%s: unregistering receiver", this.getClass().getSimpleName()), new Throwable[0]);
        super.b.unregisterReceiver((BroadcastReceiver)this.g);
    }
    
    public abstract IntentFilter e();
    
    public abstract void f(final Intent p0);
}
