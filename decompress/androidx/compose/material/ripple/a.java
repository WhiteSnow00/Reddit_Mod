// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import java.util.List;
import java.util.Map;
import zi2.c0;
import o0.m;
import o1.p;
import y0.g;
import y0.d;
import n1.f;
import ah0.b;
import z0.g0;
import cg2.j;
import z0.k0;
import y0.e;
import y0.c;
import o1.r;
import z0.c1;
import z0.s0;
import y0.h;

public final class a extends h implements s0
{
    public final boolean g;
    public final float h;
    public final c1<r> i;
    public final c1<c> j;
    public final e k;
    public final k0 l;
    public final k0 m;
    public long n;
    public int o;
    public final mg2.a<j> p;
    
    public a() {
        throw null;
    }
    
    public a(final boolean g, final float h, final g0 i, final g0 j, final e k) {
        super(g, j);
        this.g = g;
        this.h = h;
        this.i = (c1<r>)i;
        this.j = (c1<c>)j;
        this.k = k;
        this.l = b.Z0((Object)null);
        this.m = b.Z0((Object)Boolean.TRUE);
        this.n = f.b;
        this.o = -1;
        this.p = (mg2.a<j>)new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }
    
    public final void a() {
    }
    
    public final void b(final q1.c c) {
        ng2.e.f((Object)c, "<this>");
        this.n = ((q1.e)c).e();
        int o;
        if (Float.isNaN(this.h)) {
            o = p7.a.W(d.a((u2.b)c, this.g, ((q1.e)c).e()));
        }
        else {
            o = ((u2.b)c).w0(this.h);
        }
        this.o = o;
        final long a = ((r)this.i.getValue()).a;
        final float d = ((c)this.j.getValue()).d;
        c.i0();
        this.f(this.h, a, (q1.e)c);
        final p a2 = ((q1.e)c).c0().a();
        ((Boolean)((SnapshotMutableStateImpl)this.m).getValue()).booleanValue();
        final g g = (g)((SnapshotMutableStateImpl)this.l).getValue();
        if (g != null) {
            g.e(((q1.e)c).e(), a, d, this.o);
            ((View)g).draw(o1.c.a(a2));
        }
    }
    
    public final void c() {
        this.h();
    }
    
    public final void d() {
        this.h();
    }
    
    public final void e(final m m, final c0 c0) {
        ng2.e.f((Object)m, "interaction");
        ng2.e.f((Object)c0, "scope");
        final e k = this.k;
        k.getClass();
        final y0.f i = k.i;
        i.getClass();
        g value = ((Map)i.g).get(this);
        if (value == null) {
            final ArrayList h = k.h;
            ng2.e.f((Object)h, "<this>");
            Object remove;
            if (h.isEmpty()) {
                remove = null;
            }
            else {
                remove = h.remove(0);
            }
            if ((value = (g)remove) == null) {
                if (k.j > cg.d.R2((List)k.g)) {
                    final Context context = ((View)k).getContext();
                    ng2.e.e((Object)context, "context");
                    value = new g(context);
                    ((ViewGroup)k).addView((View)value);
                    k.g.add(value);
                }
                else {
                    final g g = k.g.get(k.j);
                    final y0.f j = k.i;
                    j.getClass();
                    ng2.e.f((Object)g, "rippleHostView");
                    final a a = ((Map)j.h).get(g);
                    value = g;
                    if (a != null) {
                        ((SnapshotMutableStateImpl)a.l).setValue((Object)null);
                        k.i.e(a);
                        g.c();
                        value = g;
                    }
                }
                final int l = k.j;
                if (l < k.f - 1) {
                    k.j = l + 1;
                }
                else {
                    k.j = 0;
                }
            }
            final y0.f i2 = k.i;
            i2.getClass();
            ((Map)i2.g).put(this, value);
            ((Map)i2.h).put(value, this);
        }
        value.b(m, this.g, this.n, this.o, ((r)this.i.getValue()).a, ((c)this.j.getValue()).d, (mg2.a)this.p);
        ((SnapshotMutableStateImpl)this.l).setValue((Object)value);
    }
    
    public final void g(final m m) {
        ng2.e.f((Object)m, "interaction");
        final g g = (g)((SnapshotMutableStateImpl)this.l).getValue();
        if (g != null) {
            g.d();
        }
    }
    
    public final void h() {
        final e k = this.k;
        k.getClass();
        ((SnapshotMutableStateImpl)this.l).setValue((Object)null);
        final y0.f i = k.i;
        i.getClass();
        final g g = ((Map)i.g).get(this);
        if (g != null) {
            g.c();
            k.i.e(this);
            k.h.add(g);
        }
    }
}
