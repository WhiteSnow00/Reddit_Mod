// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import wa.c0;
import ac.b;
import ad.d0;
import com.google.android.exoplayer2.e0;
import java.io.IOException;
import java.util.Iterator;
import yc.s;
import android.os.Handler;
import java.util.HashMap;

public abstract class c<T> extends a
{
    public final HashMap<T, b<T>> m;
    public Handler n;
    public s o;
    
    public c() {
        this.m = new HashMap<T, b<T>>();
    }
    
    public void d() throws IOException {
        final Iterator<b<T>> iterator = this.m.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a.d();
        }
    }
    
    public final void p() {
        for (final b b : this.m.values()) {
            b.a.i(b.b);
        }
    }
    
    public final void r() {
        for (final b b : this.m.values()) {
            b.a.h(b.b);
        }
    }
    
    public void u() {
        for (final b b : this.m.values()) {
            b.a.a(b.b);
            b.a.b((j)b.c);
            b.a.k((com.google.android.exoplayer2.drm.c)b.c);
        }
        this.m.clear();
    }
    
    public i$b v(final T t, final i$b i$b) {
        return i$b;
    }
    
    public abstract void w(final T p0, final i p1, final e0 p2);
    
    public final void x(final T t, final i i) {
        d0.c(this.m.containsKey(t) ^ true);
        final ac.b b = new ac.b(this, t);
        final c$a c$a = new c$a(this, (Object)t);
        this.m.put(t, new b<T>(i, b, c$a));
        final Handler n = this.n;
        n.getClass();
        i.e(n, (j)c$a);
        final Handler n2 = this.n;
        n2.getClass();
        i.j(n2, (com.google.android.exoplayer2.drm.c)c$a);
        final s o = this.o;
        final c0 l = super.l;
        d0.g(l);
        i.l((i.c)b, o, l);
        if (!(super.g.isEmpty() ^ true)) {
            i.i((i.c)b);
        }
    }
    
    public static final class b<T>
    {
        public final i a;
        public final i.c b;
        public final c$a c;
        
        public b(final i a, final ac.b b, final c$a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
