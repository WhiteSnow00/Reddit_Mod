// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.internal;

import kotlin.jvm.internal.Lambda;
import z0.p0;
import androidx.compose.runtime.ComposerImpl;
import xd.a;
import z0.d;
import java.util.ArrayList;
import z0.o0;
import mg2.n;
import mg2.m;
import mg2.k;
import mg2.j;
import mg2.i;
import mg2.h;
import mg2.g;
import mg2.f;
import mg2.e;
import mg2.c;
import mg2.b;
import mg2.w;
import mg2.v;
import mg2.u;
import mg2.t;
import mg2.s;
import mg2.r;
import mg2.q;
import mg2.p;

public final class ComposableLambdaImpl implements p, q, r, s, t, u, v, w, b, c, e, f, g, h, i, j, k, m, n
{
    public final int f;
    public final boolean g;
    public Object h;
    public o0 i;
    public ArrayList j;
    
    public ComposableLambdaImpl(final int f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3, final Object o4, final d d, final int n) {
        ng2.e.f((Object)d, "c");
        final ComposerImpl s = d.s(this.f);
        this.e((d)s);
        int n2;
        if (s.m((Object)this)) {
            n2 = a.x(2, 4);
        }
        else {
            n2 = a.x(1, 4);
        }
        final Object h = this.h;
        ng2.e.d(h, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        ng2.k.e(6, h);
        final Object invoke = ((t)h).invoke(o, o2, o3, o4, (Object)s, (Object)(n2 | n));
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new ComposableLambdaImpl$invoke$4(this, o, o2, o3, o4, n);
        }
        return invoke;
    }
    
    public final Object b(final Object o, final Object o2, final Object o3, final d d, final int n) {
        ng2.e.f((Object)d, "c");
        final ComposerImpl s = d.s(this.f);
        this.e((d)s);
        int n2;
        if (s.m((Object)this)) {
            n2 = a.x(2, 3);
        }
        else {
            n2 = a.x(1, 3);
        }
        final Object h = this.h;
        ng2.e.d(h, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        ng2.k.e(5, h);
        final Object invoke = ((s)h).invoke(o, o2, o3, (Object)s, (Object)(n2 | n));
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new ComposableLambdaImpl$invoke$3(this, o, o2, o3, n);
        }
        return invoke;
    }
    
    public final Object c(final Object o, final Object o2, final d d, final int n) {
        ng2.e.f((Object)d, "c");
        final ComposerImpl s = d.s(this.f);
        this.e((d)s);
        int n2;
        if (s.m((Object)this)) {
            n2 = a.x(2, 2);
        }
        else {
            n2 = a.x(1, 2);
        }
        final Object h = this.h;
        ng2.e.d(h, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        ng2.k.e(4, h);
        final Object invoke = ((r)h).invoke(o, o2, (Object)s, (Object)(n2 | n));
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new ComposableLambdaImpl$invoke$2(this, o, o2, n);
        }
        return invoke;
    }
    
    public final Object d(final Object o, final d d, final int n) {
        ng2.e.f((Object)d, "c");
        final ComposerImpl s = d.s(this.f);
        this.e((d)s);
        int n2;
        if (s.m((Object)this)) {
            n2 = a.x(2, 1);
        }
        else {
            n2 = a.x(1, 1);
        }
        final Object h = this.h;
        ng2.e.d(h, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        ng2.k.e(3, h);
        final Object invoke = ((q)h).invoke(o, (Object)s, (Object)(n2 | n));
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new ComposableLambdaImpl$invoke$1(this, o, n);
        }
        return invoke;
    }
    
    public final void e(final d d) {
        if (this.g) {
            final p0 y = d.y();
            if (y != null) {
                d.e((o0)y);
                if (a.a1(this.i, (o0)y)) {
                    this.i = (o0)y;
                }
                else {
                    final ArrayList j = this.j;
                    if (j == null) {
                        (this.j = new ArrayList()).add(y);
                    }
                    else {
                        for (int i = 0; i < j.size(); ++i) {
                            if (a.a1((o0)j.get(i), (o0)y)) {
                                j.set(i, y);
                                return;
                            }
                        }
                        j.add(y);
                    }
                }
            }
        }
    }
    
    public final void f(final Lambda h) {
        ng2.e.f((Object)h, "block");
        if (!ng2.e.a(this.h, (Object)h)) {
            final Object h2 = this.h;
            final int n = 0;
            final boolean b = h2 == null;
            this.h = h;
            if (!b && this.g) {
                final o0 i = this.i;
                if (i != null) {
                    i.invalidate();
                    this.i = null;
                }
                final ArrayList j = this.j;
                if (j != null) {
                    for (int size = j.size(), k = n; k < size; ++k) {
                        ((o0)j.get(k)).invalidate();
                    }
                    j.clear();
                }
            }
        }
    }
    
    public final Object invoke(Object o, final Object o2) {
        final d d = (d)o;
        final int intValue = ((Number)o2).intValue();
        ng2.e.f((Object)d, "c");
        final ComposerImpl s = d.s(this.f);
        this.e((d)s);
        int n;
        if (s.m((Object)this)) {
            n = a.x(2, 0);
        }
        else {
            n = a.x(1, 0);
        }
        o = this.h;
        ng2.e.d(o, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        ng2.k.e(2, o);
        o = ((p)o).invoke((Object)s, (Object)(intValue | n));
        final p0 v = s.V();
        if (v != null) {
            ng2.k.e(2, (Object)this);
            v.d = (p)this;
        }
        return o;
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.d(o, (d)o2, ((Number)o3).intValue());
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4) {
        return this.c(o, o2, (d)o3, ((Number)o4).intValue());
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return this.b(o, o2, o3, (d)o4, ((Number)o5).intValue());
    }
    
    public final /* bridge */ Object invoke(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        return this.a(o, o2, o3, o4, (d)o5, ((Number)o6).intValue());
    }
}
