// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import o1.b0;
import q1.h;
import q1.i;
import n1.c;
import q1.e;
import kotlin.a;
import u2.d;
import ah0.b;
import o1.r;
import cg2.f;
import z0.k0;
import androidx.compose.ui.graphics.painter.Painter;

public final class CircularProgressPainter extends Painter
{
    public final k0 k;
    public final k0 l;
    public final k0 m;
    public final k0 n;
    public final k0 o;
    public final k0 p;
    public final k0 q;
    public final k0 r;
    public final f s;
    public final k0 t;
    public final k0 u;
    public final k0 v;
    
    public CircularProgressPainter() {
        this.k = b.Z0((Object)new r(o1.r.l));
        final Float value = 1.0f;
        this.l = b.Z0((Object)value);
        final float n = 0;
        this.m = b.Z0((Object)new d(n));
        this.n = b.Z0((Object)new d((float)5));
        this.o = b.Z0((Object)Boolean.FALSE);
        this.p = b.Z0((Object)new d(n));
        this.q = b.Z0((Object)new d(n));
        this.r = b.Z0((Object)value);
        this.s = a.b((mg2.a)CircularProgressPainter$arrow$2.INSTANCE);
        final Float value2 = 0.0f;
        this.t = b.Z0((Object)value2);
        this.u = b.Z0((Object)value2);
        this.v = b.Z0((Object)value2);
    }
    
    public final boolean b(final float n) {
        ((SnapshotMutableStateImpl)this.l).setValue((Object)n);
        return true;
    }
    
    public final long h() {
        final int d = n1.f.d;
        return n1.f.c;
    }
    
    public final void i(final e e) {
        ng2.e.f((Object)e, "<this>");
        final float floatValue = ((Number)((SnapshotMutableStateImpl)this.v).getValue()).floatValue();
        final long e2 = e.e0();
        final q1.d c0 = (q1.d)e.c0();
        final long e3 = c0.e();
        c0.a().save();
        c0.a.d(floatValue, e2);
        final float n = ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.n).getValue()).f) / 2.0f + ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.m).getValue()).f);
        final float n2 = c.e(vl.a.M1(e.e())) - n;
        final float n3 = c.f(vl.a.M1(e.e())) - n;
        final float n4 = c.e(vl.a.M1(e.e())) + n;
        final float n5 = c.f(vl.a.M1(e.e())) + n;
        final n1.d d = new n1.d(n2, n3, n4, n5);
        final float floatValue2 = ((Number)((SnapshotMutableStateImpl)this.t).getValue()).floatValue();
        final float floatValue3 = ((Number)((SnapshotMutableStateImpl)this.v).getValue()).floatValue();
        final float n6 = 360;
        final float n7 = (floatValue3 + floatValue2) * n6;
        final float n8 = (((Number)((SnapshotMutableStateImpl)this.v).getValue()).floatValue() + ((Number)((SnapshotMutableStateImpl)this.u).getValue()).floatValue()) * n6 - n7;
        e.L0(e, ((r)((SnapshotMutableStateImpl)this.k).getValue()).a, n7, n8, vl.a.T(n2, n3), vl.a.d0(n4 - n2, n5 - n3), ((Number)((SnapshotMutableStateImpl)this.l).getValue()).floatValue(), new i(((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.n).getValue()).f), 0.0f, 2, 0, 26), 768);
        if (((SnapshotMutableStateImpl)this.o).getValue()) {
            this.j().reset();
            this.j().a(0.0f, 0.0f);
            this.j().b(this.k() * ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.p).getValue()).f), 0.0f);
            this.j().b(this.k() * ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.p).getValue()).f) / 2, this.k() * ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.q).getValue()).f));
            this.j().i(vl.a.T(c.e(d.b()) + Math.min(n4 - n2, n5 - n3) / 2.0f - this.k() * ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.p).getValue()).f) / 2.0f, ((u2.b)e).M0(((d)((SnapshotMutableStateImpl)this.n).getValue()).f) / 2.0f + c.f(d.b())));
            this.j().close();
            final long e4 = e.e0();
            final q1.d c2 = (q1.d)e.c0();
            final long e5 = c2.e();
            c2.a().save();
            c2.a.d(n7 + n8, e4);
            e.n0(e, this.j(), ((r)((SnapshotMutableStateImpl)this.k).getValue()).a, ((Number)((SnapshotMutableStateImpl)this.l).getValue()).floatValue(), null, 56);
            c2.a().restore();
            c2.b(e5);
        }
        c0.a().restore();
        c0.b(e3);
    }
    
    public final b0 j() {
        return (b0)this.s.getValue();
    }
    
    public final float k() {
        return ((Number)((SnapshotMutableStateImpl)this.r).getValue()).floatValue();
    }
}
