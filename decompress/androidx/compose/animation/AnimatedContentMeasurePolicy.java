// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import jj2.k;
import kotlin.sequences.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import androidx.compose.ui.node.LayoutNode;
import zg2.l;
import u2.i;
import yl.a;
import c2.e0;
import ah2.f;
import c2.t;
import c2.r;
import java.util.List;
import c2.u;
import c2.s;

public final class AnimatedContentMeasurePolicy implements s
{
    public final AnimatedContentScope<?> a;
    
    public AnimatedContentMeasurePolicy(final AnimatedContentScope<?> a) {
        this.a = a;
    }
    
    @Override
    public final t c(final u u, final List<? extends r> list, long c) {
        f.f((Object)u, "$this$measure");
        f.f((Object)list, "measurables");
        int size = list.size();
        final e0[] array = new e0[size];
        final int size2 = list.size();
        final int n = 0;
        int n2 = 0;
        e0 e0;
        int n3;
        while (true) {
            e0 = null;
            AnimatedContentScope$a animatedContentScope$a = null;
            n3 = 1;
            boolean b = true;
            if (n2 >= size2) {
                break;
            }
            final r r = list.get(n2);
            final Object c2 = r.c();
            if (c2 instanceof AnimatedContentScope$a) {
                animatedContentScope$a = (AnimatedContentScope$a)c2;
            }
            if (animatedContentScope$a == null || !animatedContentScope$a.f) {
                b = false;
            }
            if (b) {
                array[n2] = r.I(c);
            }
            ++n2;
        }
        for (int size3 = list.size(), i = 0; i < size3; ++i) {
            final r r2 = list.get(i);
            if (array[i] == null) {
                array[i] = r2.I(c);
            }
        }
        e0 e2;
        if (size == 0) {
            e2 = null;
        }
        else {
            e0 e3 = array[0];
            final int n4 = size - 1;
            if (n4 == 0) {
                e2 = e3;
            }
            else {
                int f;
                if (e3 != null) {
                    f = e3.f;
                }
                else {
                    f = 0;
                }
                e2 = e3;
                if (1 <= n4) {
                    int n5 = 1;
                    int n6 = f;
                    while (true) {
                        final e0 e4 = array[n5];
                        int f2;
                        if (e4 != null) {
                            f2 = e4.f;
                        }
                        else {
                            f2 = 0;
                        }
                        int n7 = n6;
                        if (n6 < f2) {
                            e3 = e4;
                            n7 = f2;
                        }
                        e2 = e3;
                        if (n5 == n4) {
                            break;
                        }
                        ++n5;
                        n6 = n7;
                    }
                }
            }
        }
        int f3;
        if (e2 != null) {
            f3 = e2.f;
        }
        else {
            f3 = 0;
        }
        e0 e5;
        if (size == 0) {
            e5 = e0;
        }
        else {
            e0 e6 = array[0];
            if (--size == 0) {
                e5 = e6;
            }
            else {
                int g;
                if (e6 != null) {
                    g = e6.g;
                }
                else {
                    g = 0;
                }
                e5 = e6;
                if (1 <= size) {
                    int n8 = g;
                    int n9 = n3;
                    while (true) {
                        final e0 e7 = array[n9];
                        int g2;
                        if (e7 != null) {
                            g2 = e7.g;
                        }
                        else {
                            g2 = 0;
                        }
                        int n10 = n8;
                        if (n8 < g2) {
                            e6 = e7;
                            n10 = g2;
                        }
                        e5 = e6;
                        if (n9 == size) {
                            break;
                        }
                        ++n9;
                        n8 = n10;
                    }
                }
            }
        }
        int g3 = n;
        if (e5 != null) {
            g3 = e5.g;
        }
        final AnimatedContentScope<?> a = this.a;
        c = yl.a.c(f3, g3);
        ((SnapshotMutableStateImpl<i>)a.c).setValue(new i(c));
        return u.E0(u, f3, g3, (l)new AnimatedContentMeasurePolicy$measure$3(array, this, f3, g3));
    }
    
    @Override
    public final int d(final LayoutNode.LayoutNode$f u, final List list, int intValue) {
        f.f((Object)u, "<this>");
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(intValue)));
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
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(intValue)));
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
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(intValue)));
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
        final Integer n = (Integer)b.f1(b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)list), (l)new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
}
