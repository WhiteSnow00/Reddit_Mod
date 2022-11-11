// 
// Decompiled by Procyon v0.6.0
// 

package k;

import java.util.Iterator;
import yg.a;
import a4.u1;
import android.view.animation.Interpolator;
import a4.t1;
import java.util.ArrayList;

public final class h
{
    public final ArrayList<t1> a;
    public long b;
    public Interpolator c;
    public u1 d;
    public boolean e;
    public final h$a f;
    
    public h() {
        this.b = -1L;
        this.f = new a() {
            public boolean s = false;
            public int t = 0;
            
            public final void e() {
                if (this.s) {
                    return;
                }
                this.s = true;
                final u1 d = h.this.d;
                if (d != null) {
                    d.e();
                }
            }
            
            public final void o() {
                final int t = this.t + 1;
                this.t = t;
                if (t == h.this.a.size()) {
                    final u1 d = h.this.d;
                    if (d != null) {
                        d.o();
                    }
                    this.t = 0;
                    this.s = false;
                    h.this.e = false;
                }
            }
        };
        this.a = new ArrayList<t1>();
    }
    
    public final void a() {
        if (!this.e) {
            return;
        }
        final Iterator<t1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
        this.e = false;
    }
    
    public final void b() {
        if (this.e) {
            return;
        }
        for (final t1 t1 : this.a) {
            final long b = this.b;
            if (b >= 0L) {
                t1.c(b);
            }
            final Interpolator c = this.c;
            if (c != null) {
                t1.d(c);
            }
            if (this.d != null) {
                t1.e((u1)this.f);
            }
            t1.g();
        }
        this.e = true;
    }
}
