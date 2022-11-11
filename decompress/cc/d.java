// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import ad.s;
import java.io.IOException;
import ad.c0;
import cb.w$a;
import cb.g;
import cb.w;
import ad.d0;
import ja.k;
import cb.u;
import android.util.SparseArray;
import com.google.android.exoplayer2.n;
import cb.h;
import cb.t;
import cb.j;

public final class d implements j, f
{
    public static final t o;
    public final h f;
    public final int g;
    public final n h;
    public final SparseArray<a> i;
    public boolean j;
    public f$a k;
    public long l;
    public u m;
    public n[] n;
    
    static {
        new k(10);
        o = new t();
    }
    
    public d(final h f, final int g, final n h) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (SparseArray<a>)new SparseArray();
    }
    
    public final void a(final f$a k, final long n, final long l) {
        this.k = k;
        this.l = l;
        if (!this.j) {
            this.f.e(this);
            if (n != -9223372036854775807L) {
                this.f.a(0L, n);
            }
            this.j = true;
        }
        else {
            final h f = this.f;
            long n2 = n;
            if (n == -9223372036854775807L) {
                n2 = 0L;
            }
            f.a(0L, n2);
            for (int i = 0; i < this.i.size(); ++i) {
                ((a)this.i.valueAt(i)).g(k, l);
            }
        }
    }
    
    @Override
    public final void b() {
        final n[] n = new n[this.i.size()];
        for (int i = 0; i < this.i.size(); ++i) {
            final n d = ((a)this.i.valueAt(i)).d;
            d0.g(d);
            n[i] = d;
        }
        this.n = n;
    }
    
    @Override
    public final w i(final int n, final int n2) {
        a a;
        if ((a = (a)this.i.get(n)) == null) {
            d0.f(this.n == null);
            n h;
            if (n2 == this.g) {
                h = this.h;
            }
            else {
                h = null;
            }
            a = new a(n, n2, h);
            a.g(this.k, this.l);
            this.i.put(n, (Object)a);
        }
        return (w)a;
    }
    
    @Override
    public final void l(final u m) {
        this.m = m;
    }
    
    public static final class a implements w
    {
        public final int a;
        public final n b;
        public final g c;
        public n d;
        public w e;
        public long f;
        
        public a(final int n, final int a, final n b) {
            this.a = a;
            this.b = b;
            this.c = new g();
        }
        
        public final void a(final long n, final int n2, final int n3, final int n4, final w$a w$a) {
            final long f = this.f;
            if (f != -9223372036854775807L && n >= f) {
                this.e = (w)this.c;
            }
            final w e = this.e;
            final int a = c0.a;
            e.a(n, n2, n3, n4, w$a);
        }
        
        public final void b(final n n) {
            final n b = this.b;
            n g = n;
            if (b != null) {
                g = n.g(b);
            }
            this.d = g;
            final w e = this.e;
            final int a = c0.a;
            e.b(g);
        }
        
        public final int c(final yc.f f, final int n, final boolean b) throws IOException {
            final w e = this.e;
            final int a = c0.a;
            return e.d(f, n, b);
        }
        
        public final void f(final s s, final int n) {
            final w e = this.e;
            final int a = c0.a;
            e.e(n, s);
        }
        
        public final void g(final f$a f$a, final long f) {
            if (f$a == null) {
                this.e = (w)this.c;
                return;
            }
            this.f = f;
            final w a = ((c)f$a).a(this.a);
            this.e = a;
            final n d = this.d;
            if (d != null) {
                a.b(d);
            }
        }
    }
}
