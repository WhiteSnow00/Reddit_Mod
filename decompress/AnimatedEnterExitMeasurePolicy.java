// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import jj2.k;
import kotlin.sequences.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import zg2.l;
import u2.i;
import yl.a;
import c2.e0;
import java.util.ArrayList;
import qg2.m;
import c2.t;
import c2.r;
import java.util.List;
import c2.u;
import ah2.f;
import k0.c;
import c2.s;

public final class AnimatedEnterExitMeasurePolicy implements s
{
    public final c a;
    
    public AnimatedEnterExitMeasurePolicy(final c a) {
        f.f((Object)a, "scope");
        this.a = a;
    }
    
    @Override
    public final t c(final u u, final List<? extends r> list, final long n) {
        f.f((Object)u, "$this$measure");
        f.f((Object)list, "measurables");
        final ArrayList list2 = new ArrayList<e0>(m.P0((Iterable)list, 10));
        final Iterator<r> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().I(n));
        }
        final boolean empty = list2.isEmpty();
        final e0 e0 = null;
        final int n2 = 0;
        final int n3 = 1;
        e0 e2;
        if (empty) {
            e2 = null;
        }
        else {
            e0 value = list2.get(0);
            int f = value.f;
            final int l = ah2.c.L((List)list2);
            e2 = value;
            if (1 <= l) {
                int n4 = 1;
                while (true) {
                    final e0 value2 = list2.get(n4);
                    final int f2 = value2.f;
                    int n5 = f;
                    if (f < f2) {
                        value = value2;
                        n5 = f2;
                    }
                    e2 = value;
                    if (n4 == l) {
                        break;
                    }
                    ++n4;
                    f = n5;
                }
            }
        }
        final e0 e3 = e2;
        int f3;
        if (e3 != null) {
            f3 = e3.f;
        }
        else {
            f3 = 0;
        }
        e0 e4;
        if (list2.isEmpty()) {
            e4 = e0;
        }
        else {
            e0 value3 = list2.get(0);
            int g = value3.g;
            final int i = ah2.c.L((List)list2);
            e4 = value3;
            if (1 <= i) {
                int n6 = n3;
                while (true) {
                    final e0 value4 = list2.get(n6);
                    final int g2 = value4.g;
                    int n7 = g;
                    if (g < g2) {
                        value3 = value4;
                        n7 = g2;
                    }
                    e4 = value3;
                    if (n6 == i) {
                        break;
                    }
                    ++n6;
                    g = n7;
                }
            }
        }
        final e0 e5 = e4;
        int g3 = n2;
        if (e5 != null) {
            g3 = e5.g;
        }
        ((SnapshotMutableStateImpl<i>)this.a.b).setValue(new i(yl.a.c(f3, g3)));
        return u.E0(u, f3, g3, (l)new AnimatedEnterExitMeasurePolicy$measure$1((List)list2));
    }
    
    @Override
    public final int d(final LayoutNode.LayoutNode$f u, final List list, int intValue) {
        f.f((Object)u, "<this>");
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int f(final LayoutNode.LayoutNode$f u, final List list, int intValue) {
        f.f((Object)u, "<this>");
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int g(final LayoutNode.LayoutNode$f u, final List list, int intValue) {
        f.f((Object)u, "<this>");
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int h(final LayoutNode.LayoutNode$f u, final List list, int intValue) {
        f.f((Object)u, "<this>");
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
}
