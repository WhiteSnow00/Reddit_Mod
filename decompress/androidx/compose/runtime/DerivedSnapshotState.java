// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import i1.f$a;
import a1.b;
import cg2.j;
import kotlin.Pair;
import z0.a1;
import a1.d;
import i1.f;
import mg2.l;
import i1.x;
import androidx.compose.runtime.snapshots.SnapshotKt;
import ng2.e;
import z0.z0;
import mg2.a;
import z0.n;
import i1.w;

public final class DerivedSnapshotState<T> implements w, n<T>
{
    public final a<T> f;
    public final z0<T> g;
    public DerivedSnapshotState.DerivedSnapshotState$a<T> h;
    
    public DerivedSnapshotState(final a f) {
        e.f((Object)f, "calculation");
        this.f = (a<T>)f;
        this.g = null;
        this.h = (DerivedSnapshotState.DerivedSnapshotState$a<T>)new DerivedSnapshotState.DerivedSnapshotState$a();
    }
    
    public final z0<T> c() {
        return this.g;
    }
    
    public final T g() {
        return (T)this.i((DerivedSnapshotState.DerivedSnapshotState$a<T>)SnapshotKt.h((x)this.h), SnapshotKt.j(), false, (a<? extends T>)this.f).d;
    }
    
    public final T getValue() {
        final l f = SnapshotKt.j().f();
        if (f != null) {
            f.invoke((Object)this);
        }
        return (T)this.i((DerivedSnapshotState.DerivedSnapshotState$a<T>)SnapshotKt.h((x)this.h), SnapshotKt.j(), true, (a<? extends T>)this.f).d;
    }
    
    public final DerivedSnapshotState.DerivedSnapshotState$a<T> i(DerivedSnapshotState.DerivedSnapshotState$a<T> derivedSnapshotState$a, f f, final boolean b, a<? extends T> d) {
        final Object d2 = derivedSnapshotState$a.d;
        final Object f2 = DerivedSnapshotState.DerivedSnapshotState$a.f;
        int h = 0;
        final boolean b2 = false;
        final int n = 0;
        final int n2 = 0;
        if (d2 != f2 && derivedSnapshotState$a.e == derivedSnapshotState$a.c((n)this, f)) {
            if (b) {
                if ((d = (d)a1.b.k()) == null) {
                    d = new d((Object[])new Pair[0]);
                }
                final int h2 = d.h;
                if (h2 > 0) {
                    final Object[] f3 = d.f;
                    e.d((Object)f3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int n3 = 0;
                    do {
                        ((l)((Pair)f3[n3]).component1()).invoke((Object)this);
                    } while (++n3 < h2);
                }
                try {
                    final b c = derivedSnapshotState$a.c;
                    final Integer n4 = (Integer)a1.a.k();
                    int intValue;
                    if (n4 != null) {
                        intValue = n4;
                    }
                    else {
                        intValue = 0;
                    }
                    if (c != null) {
                        for (int c2 = c.c, i = 0; i < c2; ++i) {
                            final Object o = c.a[i];
                            e.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            final int intValue2 = ((Number)c.b[i]).intValue();
                            final w w = (w)o;
                            a1.a.r((Object)(intValue2 + intValue));
                            final l f4 = f.f();
                            if (f4 != null) {
                                f4.invoke((Object)w);
                            }
                        }
                    }
                    a1.a.r((Object)intValue);
                    final j a = j.a;
                    h = d.h;
                    if (h > 0) {
                        final Object[] f5 = d.f;
                        e.d((Object)f5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n5 = n2;
                        do {
                            ((l)((Pair)f5[n5]).component2()).invoke((Object)this);
                        } while (++n5 < h);
                    }
                }
                finally {
                    final int h3 = d.h;
                    if (h3 > 0) {
                        final Object[] f6 = d.f;
                        e.d((Object)f6, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n6 = h;
                        do {
                            ((l)((Pair)f6[n6]).component2()).invoke((Object)this);
                        } while (++n6 < h3);
                    }
                }
            }
            return (DerivedSnapshotState.DerivedSnapshotState$a<T>)derivedSnapshotState$a;
        }
        final Integer n7 = (Integer)a1.a.k();
        int intValue3;
        if (n7 != null) {
            intValue3 = n7;
        }
        else {
            intValue3 = 0;
        }
        final b b3 = new b();
        if ((f = (f)a1.b.k()) == null) {
            f = (f)new d((Object[])new Pair[0]);
        }
        final int h4 = ((d)f).h;
        if (h4 > 0) {
            final Object[] f7 = ((d)f).f;
            e.d((Object)f7, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n8 = 0;
            do {
                ((l)((Pair)f7[n8]).component1()).invoke((Object)this);
            } while (++n8 < h4);
        }
        try {
            final oe2.e a2 = a1.a;
            a2.r((Object)(intValue3 + 1));
            final Object b4 = f$a.b((a)d, (l)new DerivedSnapshotState$currentRecord$result$1$result$1(this, b3, intValue3));
            a2.r((Object)intValue3);
            final int h5 = ((d)f).h;
            if (h5 > 0) {
                f = (f)((d)f).f;
                e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n9 = 0;
                do {
                    ((l)((Pair)f[n9]).component2()).invoke((Object)this);
                } while (++n9 < h5);
            }
            synchronized (SnapshotKt.c) {
                final f j = SnapshotKt.j();
                final Object d3 = derivedSnapshotState$a.d;
                Label_0816: {
                    if (d3 != DerivedSnapshotState.DerivedSnapshotState$a.f) {
                        final z0<T> g = this.g;
                        int n10 = b2 ? 1 : 0;
                        if (g != null) {
                            n10 = (b2 ? 1 : 0);
                            if (g.a((T)b4, (T)d3)) {
                                n10 = 1;
                            }
                        }
                        if (n10 != 0) {
                            derivedSnapshotState$a.c = b3;
                            derivedSnapshotState$a.e = derivedSnapshotState$a.c((n)this, j);
                            break Label_0816;
                        }
                    }
                    derivedSnapshotState$a = (DerivedSnapshotState.DerivedSnapshotState$a)SnapshotKt.m((x)this.h, (w)this, j);
                    derivedSnapshotState$a.c = b3;
                    derivedSnapshotState$a.e = derivedSnapshotState$a.c((n)this, j);
                    derivedSnapshotState$a.d = b4;
                }
                monitorexit(SnapshotKt.c);
                if (intValue3 == 0) {
                    SnapshotKt.j().l();
                }
                return (DerivedSnapshotState.DerivedSnapshotState$a<T>)derivedSnapshotState$a;
            }
        }
        finally {
            final int h6 = ((d)f).h;
            if (h6 > 0) {
                final Object[] f8 = ((d)f).f;
                e.d((Object)f8, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n11 = n;
                do {
                    ((l)((Pair)f8[n11]).component2()).invoke((Object)this);
                } while (++n11 < h6);
            }
        }
    }
    
    public final Object[] j() {
        final b c = this.i((DerivedSnapshotState.DerivedSnapshotState$a<T>)SnapshotKt.h((x)this.h), SnapshotKt.j(), false, (a<? extends T>)this.f).c;
        Object[] a;
        if (c == null || (a = c.a) == null) {
            a = new Object[0];
        }
        return a;
    }
    
    public final x q() {
        return (x)this.h;
    }
    
    @Override
    public final String toString() {
        final DerivedSnapshotState.DerivedSnapshotState$a derivedSnapshotState$a = (DerivedSnapshotState.DerivedSnapshotState$a)SnapshotKt.h((x)this.h);
        final StringBuilder t = a.t("DerivedState(value=");
        final DerivedSnapshotState.DerivedSnapshotState$a derivedSnapshotState$a2 = (DerivedSnapshotState.DerivedSnapshotState$a)SnapshotKt.h((x)this.h);
        final f j = SnapshotKt.j();
        String value;
        if (derivedSnapshotState$a2.d != DerivedSnapshotState.DerivedSnapshotState$a.f && derivedSnapshotState$a2.e == derivedSnapshotState$a2.c((n)this, j)) {
            value = String.valueOf(derivedSnapshotState$a2.d);
        }
        else {
            value = "<Not calculated>";
        }
        t.append(value);
        t.append(")@");
        t.append(this.hashCode());
        return t.toString();
    }
    
    public final void u(final x x) {
        this.h = (DerivedSnapshotState.DerivedSnapshotState$a<T>)x;
    }
}
