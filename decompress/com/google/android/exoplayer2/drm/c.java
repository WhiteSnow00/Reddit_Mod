// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import android.os.Handler;
import h.r;
import v7.l;
import ab.a;
import h5.f;
import androidx.lifecycle.d;
import java.util.Iterator;
import ad.c0;
import j5.k;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.android.exoplayer2.source.i$b;

public interface c
{
    default void A(final int n, final i$b i$b) {
    }
    
    default void B(final int n, final i$b i$b, final int n2) {
    }
    
    default void C(final int n, final i$b i$b) {
    }
    
    default void E(final int n, final i$b i$b) {
    }
    
    default void F(final int n, final i$b i$b, final Exception ex) {
    }
    
    default void I(final int n, final i$b i$b) {
    }
    
    public static final class a
    {
        public final int a;
        public final i$b b;
        public final CopyOnWriteArrayList<c.a.a> c;
        
        public a() {
            this(new CopyOnWriteArrayList<c.a.a>(), 0, null);
        }
        
        public a(final CopyOnWriteArrayList<c.a.a> c, final int a, final i$b b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        public final void a() {
            for (final c.a.a a : this.c) {
                c0.N(a.a, (Runnable)new k(2, (Object)this, (Object)a.b));
            }
        }
        
        public final void b() {
            for (final c.a.a a : this.c) {
                c0.N(a.a, new d(3, this, a.b));
            }
        }
        
        public final void c() {
            for (final c.a.a a : this.c) {
                c0.N(a.a, new f(3, this, a.b));
            }
        }
        
        public final void d(final int n) {
            for (final c.a.a a : this.c) {
                c0.N(a.a, new a(this, a.b, n));
            }
        }
        
        public final void e(final Exception ex) {
            for (final c.a.a a : this.c) {
                c0.N(a.a, (Runnable)new l((Object)this, 2, (Object)a.b, (Object)ex));
            }
        }
        
        public final void f() {
            for (final c.a.a a : this.c) {
                c0.N(a.a, new r(3, this, a.b));
            }
        }
        
        public static final class a
        {
            public Handler a;
            public c b;
            
            public a(final Handler a, final c b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
