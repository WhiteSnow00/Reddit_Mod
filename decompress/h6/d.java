// 
// Decompiled by Procyon v0.6.0
// 

package h6;

import java.util.Collection;
import i6.e;
import i6.f;
import i6.g;
import i6.b;
import n6.a;
import android.content.Context;
import c6.h;
import i6.c;

public final class d implements a
{
    public static final String d;
    public final h6.c a;
    public final c<?>[] b;
    public final Object c;
    
    static {
        d = h.e("WorkConstraintsTracker");
    }
    
    public d(Context applicationContext, final n6.a a, final h6.c a2) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = a2;
        this.b = (c<?>[])new c[] { new i6.a(applicationContext, a), new b(applicationContext, a), (c)new i6.h(applicationContext, a), new i6.d(applicationContext, a), (c)new g(applicationContext, a), (c)new f(applicationContext, a), (c)new e(applicationContext, a) };
        this.c = new Object();
    }
    
    public final boolean a(final String s) {
        synchronized (this.c) {
            for (final c<?> c : this.b) {
                final Object b2 = c.b;
                if (b2 != null && c.c(b2) && c.a.contains(s)) {
                    h.c().a(h6.d.d, String.format("Work %s constrained by %s", s, c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
    
    public final void b(final Collection collection) {
        synchronized (this.c) {
            final c<?>[] b = this.b;
            final int length = b.length;
            final int n = 0;
            for (final c<?> c : b) {
                if (c.d != null) {
                    c.e(c.d = null, c.b);
                }
            }
            final c<?>[] b2 = this.b;
            for (int length2 = b2.length, j = 0; j < length2; ++j) {
                b2[j].d(collection);
            }
            final c<?>[] b3 = this.b;
            for (int length3 = b3.length, k = n; k < length3; ++k) {
                final c<?> c2 = b3[k];
                if (c2.d != this) {
                    c2.e(c2.d = this, c2.b);
                }
            }
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            for (final c<?> c : this.b) {
                if (!c.a.isEmpty()) {
                    c.a.clear();
                    final j6.d c2 = c.c;
                    synchronized (c2.c) {
                        if (c2.d.remove(c) && c2.d.isEmpty()) {
                            c2.d();
                        }
                    }
                }
            }
        }
    }
}
