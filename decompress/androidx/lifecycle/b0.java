// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import androidx.appcompat.widget.l0;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import android.os.Handler;

public final class b0 implements q
{
    public static final b0 n;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public Handler j;
    public final r k;
    public b0$a l;
    public b0$b m;
    
    static {
        n = new b0();
    }
    
    public b0() {
        this.f = 0;
        this.g = 0;
        this.h = true;
        this.i = true;
        this.k = new r((q)this);
        this.l = new Runnable() {
            @Override
            public final void run() {
                final b0 f = b0.this;
                if (f.g == 0) {
                    f.h = true;
                    f.k.f(Lifecycle.Event.ON_PAUSE);
                }
                final b0 f2 = b0.this;
                if (f2.f == 0 && f2.h) {
                    f2.k.f(Lifecycle.Event.ON_STOP);
                    f2.i = true;
                }
            }
        };
        this.m = new d0.a() {};
    }
    
    public final void a() {
        final int g = this.g + 1;
        this.g = g;
        if (g == 1) {
            if (this.h) {
                this.k.f(Lifecycle.Event.ON_RESUME);
                this.h = false;
            }
            else {
                this.j.removeCallbacks((Runnable)this.l);
            }
        }
    }
    
    @Override
    public final Lifecycle getLifecycle() {
        return (Lifecycle)this.k;
    }
    
    public static final class c
    {
        public static void a(final Activity activity, final Application$ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks) {
            l0.b(activity, application$ActivityLifecycleCallbacks);
        }
    }
}
