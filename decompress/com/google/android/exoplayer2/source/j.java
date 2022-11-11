// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import ac.o;
import ac.k;
import ac.m;
import java.util.Iterator;
import v7.l;
import com.google.android.exoplayer2.n;
import ad.c0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.IOException;
import ac.i;
import ac.h;

public interface j
{
    default void G(final int n, final i$b i$b, final h h, final i i) {
    }
    
    default void H(final int n, final i$b i$b, final h h, final i i) {
    }
    
    default void j(final int n, final i$b i$b, final i i) {
    }
    
    default void u(final int n, final i$b i$b, final h h, final i i, final IOException ex, final boolean b) {
    }
    
    default void x(final int n, final i$b i$b, final i i) {
    }
    
    default void z(final int n, final i$b i$b, final h h, final i i) {
    }
    
    public static final class a
    {
        public final int a;
        public final i$b b;
        public final CopyOnWriteArrayList<j.a.a> c;
        public final long d;
        
        public a() {
            this(new CopyOnWriteArrayList<j.a.a>(), 0, null, 0L);
        }
        
        public a(final CopyOnWriteArrayList<j.a.a> c, final int a, final i$b b, final long d) {
            this.c = c;
            this.a = a;
            this.b = b;
            this.d = d;
        }
        
        public final long a(long n) {
            final long u = c0.U(n);
            n = -9223372036854775807L;
            if (u != -9223372036854775807L) {
                n = this.d + u;
            }
            return n;
        }
        
        public final void b(final int n, final n n2, final int n3, final Object o, final long n4) {
            this.c(new i(1, n, n2, n3, o, this.a(n4), -9223372036854775807L));
        }
        
        public final void c(final i i) {
            for (final j.a.a a : this.c) {
                c0.N(a.a, (Runnable)new l((Object)this, 3, (Object)a.b, (Object)i));
            }
        }
        
        public final void d(final h h, final int n) {
            this.e(h, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void e(final h h, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.f(h, new i(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void f(final h h, final i i) {
            for (final j.a.a a : this.c) {
                c0.N(a.a, new ac.n(this, a.b, h, i, 0));
            }
        }
        
        public final void g(final h h, final int n) {
            this.h(h, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void h(final h h, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.i(h, new i(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void i(final h h, final i i) {
            for (final j.a.a a : this.c) {
                c0.N(a.a, new m(this, a.b, h, i));
            }
        }
        
        public final void j(final h h, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6, final IOException ex, final boolean b) {
            this.l(h, new i(n, n2, n3, n4, o, this.a(n5), this.a(n6)), ex, b);
        }
        
        public final void k(final h h, final int n, final IOException ex, final boolean b) {
            this.j(h, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ex, b);
        }
        
        public final void l(final h h, final i i, final IOException ex, final boolean b) {
            for (final j.a.a a : this.c) {
                c0.N(a.a, new ac.l(this, a.b, h, i, ex, b));
            }
        }
        
        public final void m(final h h, final int n) {
            this.n(h, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
        
        public final void n(final h h, final int n, final int n2, final n n3, final int n4, final Object o, final long n5, final long n6) {
            this.o(h, new i(n, n2, n3, n4, o, this.a(n5), this.a(n6)));
        }
        
        public final void o(final h h, final i i) {
            for (final j.a.a a : this.c) {
                c0.N(a.a, new k(this, a.b, h, i, 0));
            }
        }
        
        public final void p(final i i) {
            final i$b b = this.b;
            b.getClass();
            for (final j.a.a a : this.c) {
                c0.N(a.a, new o(this, a.b, b, i, 0));
            }
        }
        
        public static final class a
        {
            public Handler a;
            public j b;
            
            public a(final Handler a, final j b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
