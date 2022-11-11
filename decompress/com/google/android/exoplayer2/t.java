// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.i;
import android.os.Handler$Callback;
import android.os.Looper;
import va.b0;
import java.util.Iterator;
import va.d0;
import java.util.List;
import android.os.Handler;
import wa.a;
import yc.s;
import ac.q;
import java.util.HashSet;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.j;
import java.util.HashMap;
import com.google.android.exoplayer2.source.h;
import java.util.IdentityHashMap;
import java.util.ArrayList;
import wa.c0;

public final class t
{
    public final c0 a;
    public final ArrayList b;
    public final IdentityHashMap<h, t.t$c> c;
    public final HashMap d;
    public final d e;
    public final j.a f;
    public final c.a g;
    public final HashMap<t.t$c, b> h;
    public final HashSet i;
    public q j;
    public boolean k;
    public s l;
    
    public t(final d e, final a a, final Handler handler, final c0 a2) {
        this.a = a2;
        this.e = e;
        this.j = new q.a();
        this.c = new IdentityHashMap<h, t.t$c>();
        this.d = new HashMap();
        this.b = new ArrayList();
        final j.a f = new j.a();
        this.f = f;
        final c.a g = new c.a();
        this.g = g;
        this.h = new HashMap<t.t$c, b>();
        this.i = new HashSet();
        a.getClass();
        f.c.add(new j.a.a(handler, a));
        g.c.add(new c.a.a(handler, a));
    }
    
    public final e0 a(final int n, final List<t.t$c> list, final q j) {
        if (!list.isEmpty()) {
            this.j = j;
            for (int i = n; i < list.size() + n; ++i) {
                final t.t$c t$c = list.get(i - n);
                if (i > 0) {
                    final t.t$c t$c2 = this.b.get(i - 1);
                    t$c.d = ((ac.g)t$c2.a.t).o() + t$c2.d;
                    t$c.e = false;
                    t$c.c.clear();
                }
                else {
                    t$c.d = 0;
                    t$c.e = false;
                    t$c.c.clear();
                }
                this.b(i, ((ac.g)t$c.a.t).o());
                this.b.add(i, t$c);
                this.d.put(t$c.b, t$c);
                if (this.k) {
                    this.f(t$c);
                    if (this.c.isEmpty()) {
                        this.i.add(t$c);
                    }
                    else {
                        final b b = this.h.get(t$c);
                        if (b != null) {
                            b.a.i(b.b);
                        }
                    }
                }
            }
        }
        return this.c();
    }
    
    public final void b(int i, final int n) {
        while (i < this.b.size()) {
            final t.t$c t$c = this.b.get(i);
            t$c.d += n;
            ++i;
        }
    }
    
    public final e0 c() {
        if (this.b.isEmpty()) {
            return e0.f;
        }
        int i = 0;
        int d = 0;
        while (i < this.b.size()) {
            final t.t$c t$c = this.b.get(i);
            t$c.d = d;
            d += ((ac.g)t$c.a.t).o();
            ++i;
        }
        return new d0(this.b, this.j);
    }
    
    public final void d() {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final t.t$c t$c = (t.t$c)iterator.next();
            if (t$c.c.isEmpty()) {
                final b b = this.h.get(t$c);
                if (b != null) {
                    b.a.i(b.b);
                }
                iterator.remove();
            }
        }
    }
    
    public final void e(final t.t$c t$c) {
        if (t$c.e && t$c.c.isEmpty()) {
            final b b = this.h.remove(t$c);
            b.getClass();
            b.a.a(b.b);
            b.a.b((j)b.c);
            b.a.k((c)b.c);
            this.i.remove(t$c);
        }
    }
    
    public final void f(final t.t$c t$c) {
        final g a = t$c.a;
        final b0 b0 = new b0(this);
        final t$a t$a = new t$a(this, t$c);
        this.h.put(t$c, new b(a, b0, t$a));
        final int a2 = ad.c0.a;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        ((com.google.android.exoplayer2.source.a)a).e(new Handler(looper, (Handler$Callback)null), (j)t$a);
        Looper looper2 = Looper.myLooper();
        if (looper2 == null) {
            looper2 = Looper.getMainLooper();
        }
        ((com.google.android.exoplayer2.source.a)a).j(new Handler(looper2, (Handler$Callback)null), (c)t$a);
        ((com.google.android.exoplayer2.source.a)a).l((i.c)b0, this.l, this.a);
    }
    
    public final void g(final h h) {
        final t.t$c t$c = this.c.remove(h);
        t$c.getClass();
        t$c.a.g(h);
        t$c.c.remove(((f)h).f);
        if (!this.c.isEmpty()) {
            this.d();
        }
        this.e(t$c);
    }
    
    public final void h(final int n, int i) {
        --i;
        while (i >= n) {
            final t.t$c t$c = this.b.remove(i);
            this.d.remove(t$c.b);
            this.b(i, -((ac.g)t$c.a.t).o());
            t$c.e = true;
            if (this.k) {
                this.e(t$c);
            }
            --i;
        }
    }
    
    public static final class b
    {
        public final i a;
        public final i.c b;
        public final t$a c;
        
        public b(final g a, final b0 b, final t$a c) {
            this.a = (i)a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface d
    {
    }
}
