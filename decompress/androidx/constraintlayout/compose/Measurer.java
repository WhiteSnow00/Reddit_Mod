// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import java.util.Iterator;
import y2.g;
import androidx.compose.ui.layout.AlignmentLineKt;
import c3.c;
import c2.e0;
import mj2.c0;
import c2.r;
import f3.b$a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import kotlin.a;
import kotlin.LazyThreadSafetyMode;
import pg2.j;
import pg2.f;
import c2.u;
import u2.b;
import java.util.LinkedHashMap;
import androidx.constraintlayout.core.widgets.d;
import f3.b$b;

public final class Measurer implements b$b
{
    public final d a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public b e;
    public u f;
    public final f g;
    public final int[] h;
    public final int[] i;
    
    public Measurer() {
        final d a = new d(0);
        a.s0 = (b$b)this;
        a.q0.e = (b$b)this;
        final j a2 = j.a;
        this.a = a;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.g = kotlin.a.a(LazyThreadSafetyMode.NONE, (zg2.a)new Measurer$state$2(this));
        this.h = new int[2];
        this.i = new int[2];
        new ArrayList();
    }
    
    public static void d(final ConstraintWidget.DimensionBehaviour dimensionBehaviour, int n, int n2, int n3, final boolean b, final boolean b2, final int n4, final int[] array) {
        final int n5 = a.a[dimensionBehaviour.ordinal()];
        if (n5 != 1) {
            if (n5 != 2) {
                if (n5 != 3) {
                    if (n5 != 4) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(dimensionBehaviour);
                        sb.append(" is not supported");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    array[1] = (array[0] = n4);
                }
                else {
                    Label_0129: {
                        Label_0127: {
                            if (!b2) {
                                if (n3 == 1 || n3 == 2) {
                                    if (n3 == 2 || n2 != 1) {
                                        break Label_0127;
                                    }
                                    if (b) {
                                        break Label_0127;
                                    }
                                }
                                n2 = 0;
                                break Label_0129;
                            }
                        }
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    array[0] = n3;
                    if (n2 == 0) {
                        n = n4;
                    }
                    array[1] = n;
                }
            }
            else {
                array[0] = 0;
                array[1] = n4;
            }
        }
        else {
            array[1] = (array[0] = n);
        }
    }
    
    public final void a(final ConstraintWidget constraintWidget, final b$a b$a) {
        ah2.f.f((Object)constraintWidget, "constraintWidget");
        ah2.f.f((Object)b$a, "measure");
        final Object e0 = constraintWidget.e0;
        if (!(e0 instanceof r)) {
            return;
        }
        final Integer[] array = this.c.get(e0);
        final ConstraintWidget.DimensionBehaviour[] r = constraintWidget.R;
        final boolean b = false;
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[0];
        ah2.f.e((Object)dimensionBehaviour, "constraintWidget.horizontalDimensionBehaviour");
        final int l = constraintWidget.l();
        final int s = constraintWidget.s;
        final int j = b$a.j;
        int intValue = 0;
        Label_0110: {
            if (array != null) {
                final Integer n = array[1];
                if (n != null) {
                    intValue = n;
                    break Label_0110;
                }
            }
            intValue = 0;
        }
        d(dimensionBehaviour, l, s, j, intValue == constraintWidget.i(), constraintWidget.u(), u2.a.h(this.c().g), this.h);
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.R[1];
        ah2.f.e((Object)dimensionBehaviour2, "constraintWidget.verticalDimensionBehaviour");
        final int i = constraintWidget.i();
        final int t = constraintWidget.t;
        final int k = b$a.j;
        int intValue2 = 0;
        Label_0224: {
            if (array != null) {
                final Integer n2 = array[0];
                if (n2 != null) {
                    intValue2 = n2;
                    break Label_0224;
                }
            }
            intValue2 = 0;
        }
        d(dimensionBehaviour2, i, t, k, intValue2 == constraintWidget.l(), constraintWidget.v(), u2.a.g(this.c().g), this.i);
        final int[] h = this.h;
        final int n3 = h[0];
        final int n4 = h[1];
        final int[] m = this.i;
        long n5 = c0.a(n3, n4, m[0], m[1]);
        final int j2 = b$a.j;
        Label_0728: {
            if (j2 != 1 && j2 != 2) {
                final ConstraintWidget.DimensionBehaviour[] r2 = constraintWidget.R;
                final ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = r2[0];
                final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == match_CONSTRAINT && constraintWidget.s == 0 && r2[1] == match_CONSTRAINT && constraintWidget.t == 0) {
                    break Label_0728;
                }
            }
            final r r3 = (r)e0;
            final e0 i2 = r3.I(n5);
            this.b.put(e0, i2);
            constraintWidget.g = false;
            final int f = i2.f;
            Integer value = constraintWidget.a0;
            if (value.intValue() <= 0) {
                value = null;
            }
            Integer value2 = constraintWidget.D[0];
            if (value2.intValue() <= 0) {
                value2 = null;
            }
            final int intValue3 = ((Number)yl.a.Q(Integer.valueOf(f), value, value2)).intValue();
            final int g = i2.g;
            Integer value3 = constraintWidget.b0;
            if (value3.intValue() <= 0) {
                value3 = null;
            }
            Integer value4 = constraintWidget.D[1];
            if (value4.intValue() <= 0) {
                value4 = null;
            }
            final int intValue4 = ((Number)yl.a.Q(Integer.valueOf(g), value3, value4)).intValue();
            boolean b2;
            if (intValue3 != i2.f) {
                n5 = c0.a(intValue3, intValue3, u2.a.i(n5), u2.a.g(n5));
                b2 = true;
            }
            else {
                b2 = false;
            }
            long a = n5;
            if (intValue4 != i2.g) {
                a = c0.a(u2.a.j(n5), u2.a.h(n5), intValue4, intValue4);
                b2 = true;
            }
            if (b2) {
                this.b.put(e0, r3.I(a));
                constraintWidget.g = false;
            }
        }
        final e0 e2 = this.b.get(e0);
        Integer value5;
        if (e2 == null) {
            value5 = null;
        }
        else {
            value5 = e2.f;
        }
        int e3;
        if (value5 == null) {
            e3 = constraintWidget.l();
        }
        else {
            e3 = value5;
        }
        b$a.e = e3;
        Integer value6;
        if (e2 == null) {
            value6 = null;
        }
        else {
            value6 = e2.g;
        }
        int f2;
        if (value6 == null) {
            f2 = constraintWidget.i();
        }
        else {
            f2 = value6;
        }
        b$a.f = f2;
        int p2 = 0;
        Label_0997: {
            if (e2 != null) {
                final g c = this.c();
                c.getClass();
                if (c.j) {
                    c.k.clear();
                    final Iterator iterator = c.i.iterator();
                    while (iterator.hasNext()) {
                        final c c2 = c.a.get(iterator.next());
                        Object a2;
                        if (c2 == null) {
                            a2 = null;
                        }
                        else {
                            a2 = c2.a();
                        }
                        if (a2 != null) {
                            c.k.add(a2);
                        }
                    }
                    c.j = false;
                }
                if (c.k.contains(constraintWidget)) {
                    p2 = e2.p(AlignmentLineKt.a);
                    break Label_0997;
                }
            }
            p2 = Integer.MIN_VALUE;
        }
        b$a.h = (p2 != Integer.MIN_VALUE);
        b$a.g = p2;
        final LinkedHashMap c3 = this.c;
        Object value7;
        if ((value7 = c3.get(e0)) == null) {
            value7 = new Integer[] { 0, 0, Integer.MIN_VALUE };
            c3.put(e0, value7);
        }
        final Integer[] array2 = (Integer[])value7;
        array2[0] = b$a.e;
        array2[1] = b$a.f;
        array2[2] = b$a.g;
        boolean i3 = false;
        Label_1150: {
            if (b$a.e == b$a.c) {
                i3 = b;
                if (b$a.f == b$a.d) {
                    break Label_1150;
                }
            }
            i3 = true;
        }
        b$a.i = i3;
    }
    
    public final void b() {
    }
    
    public final g c() {
        return (g)this.g.getValue();
    }
}
