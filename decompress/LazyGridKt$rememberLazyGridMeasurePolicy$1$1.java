// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import java.util.Iterator;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import r0.r;
import r0.y;
import r0.o;
import r0.e;
import java.util.Collection;
import gh2.g;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import r0.s;
import r0.u;
import kotlin.collections.EmptyList;
import java.util.Map;
import c2.e0;
import pg2.j;
import i1.f$a;
import r0.c;
import kotlin.Pair;
import java.util.ArrayList;
import r0.v;
import zg2.l;
import r0.t;
import mj2.c0;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import u2.b;
import m0.q;
import r0.i;
import p0.z;
import kotlin.Metadata;
import r0.n;
import u2.a;
import s0.f;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements p<f, a, n>
{
    public final /* synthetic */ z $contentPadding;
    public final /* synthetic */ androidx.compose.foundation.layout.a.d $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ i $itemProvider;
    public final /* synthetic */ q $overscrollEffect;
    public final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ p<b, a, List<Integer>> $slotSizesSums;
    public final /* synthetic */ LazyGridState $state;
    public final /* synthetic */ androidx.compose.foundation.layout.a.k $verticalArrangement;
    
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(final boolean $isVertical, final z $contentPadding, final boolean $reverseLayout, final LazyGridState $state, final i $itemProvider, final p<? super b, ? super a, ? extends List<Integer>> $slotSizesSums, final androidx.compose.foundation.layout.a.k $verticalArrangement, final androidx.compose.foundation.layout.a.d $horizontalArrangement, final LazyGridItemPlacementAnimator $placementAnimator, final q $overscrollEffect) {
        this.$isVertical = $isVertical;
        this.$contentPadding = $contentPadding;
        this.$reverseLayout = $reverseLayout;
        this.$state = $state;
        this.$itemProvider = $itemProvider;
        this.$slotSizesSums = (p<b, a, List<Integer>>)$slotSizesSums;
        this.$verticalArrangement = $verticalArrangement;
        this.$horizontalArrangement = $horizontalArrangement;
        this.$placementAnimator = $placementAnimator;
        this.$overscrollEffect = $overscrollEffect;
        super(2);
    }
    
    public final n invoke-0kLqBqw(final f value, long n) {
        ah2.f.f((Object)value, "$this$null");
        Orientation orientation;
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        }
        else {
            orientation = Orientation.Horizontal;
        }
        at1.a.V(n, orientation);
        int n2;
        if (this.$isVertical) {
            n2 = value.s0(this.$contentPadding.b(value.getLayoutDirection()));
        }
        else {
            n2 = value.s0(at1.a.M(this.$contentPadding, value.getLayoutDirection()));
        }
        int n3;
        if (this.$isVertical) {
            n3 = value.s0(this.$contentPadding.c(value.getLayoutDirection()));
        }
        else {
            n3 = value.s0(at1.a.L(this.$contentPadding, value.getLayoutDirection()));
        }
        final int s0 = value.s0(this.$contentPadding.d());
        final int s2 = value.s0(this.$contentPadding.a());
        final int n4 = s0 + s2;
        final int n5 = n2 + n3;
        final boolean $isVertical = this.$isVertical;
        int n6;
        if ($isVertical) {
            n6 = n4;
        }
        else {
            n6 = n5;
        }
        if ($isVertical && !this.$reverseLayout) {
            n3 = s0;
        }
        else if ($isVertical && this.$reverseLayout) {
            n3 = s2;
        }
        else if (!$isVertical && !this.$reverseLayout) {
            n3 = n2;
        }
        final int n7 = n6 - n3;
        final long m = c0.M(-n5, -n4, n);
        this.$state.f(this.$itemProvider);
        final LazyGridSpanLayoutProvider g = this.$itemProvider.g();
        final List list = (List)this.$slotSizesSums.invoke((Object)value, (Object)new a(n));
        final int size = list.size();
        if (size != g.i) {
            g.i = size;
            g.b.clear();
            g.b.add(new LazyGridSpanLayoutProvider.a(0, 0));
            g.c = 0;
            g.d = 0;
            g.f = -1;
            g.g.clear();
        }
        final LazyGridState $state = this.$state;
        $state.getClass();
        ((SnapshotMutableStateImpl<f>)$state.f).setValue(value);
        ((SnapshotMutableStateImpl<Integer>)this.$state.e).setValue(Integer.valueOf(list.size()));
        float n8;
        if (this.$isVertical) {
            final androidx.compose.foundation.layout.a.k $verticalArrangement = this.$verticalArrangement;
            if ($verticalArrangement == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n8 = $verticalArrangement.a();
        }
        else {
            final androidx.compose.foundation.layout.a.d $horizontalArrangement = this.$horizontalArrangement;
            if ($horizontalArrangement == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n8 = $horizontalArrangement.a();
        }
        final int s3 = value.s0(n8);
        float n9 = 0.0f;
        Label_0601: {
            if (this.$isVertical) {
                final androidx.compose.foundation.layout.a.d $horizontalArrangement2 = this.$horizontalArrangement;
                if ($horizontalArrangement2 != null) {
                    n9 = $horizontalArrangement2.a();
                    break Label_0601;
                }
            }
            else {
                final androidx.compose.foundation.layout.a.k $verticalArrangement2 = this.$verticalArrangement;
                if ($verticalArrangement2 != null) {
                    n9 = $verticalArrangement2.a();
                    break Label_0601;
                }
            }
            n9 = 0;
        }
        final int s4 = value.s0(n9);
        final int k0 = this.$itemProvider.K0();
        int n10;
        if (this.$isVertical) {
            n10 = a.g(n) - n4;
        }
        else {
            n10 = a.h(n) - n5;
        }
        long n12;
        if (this.$reverseLayout && n10 <= 0) {
            final boolean $isVertical2 = this.$isVertical;
            if (!$isVertical2) {
                n2 += n10;
            }
            int n11 = s0;
            if ($isVertical2) {
                n11 = s0 + n10;
            }
            n12 = at1.a.h(n2, n11);
        }
        else {
            n12 = at1.a.h(n2, s0);
        }
        final i $itemProvider = this.$itemProvider;
        final boolean $isVertical3 = this.$isVertical;
        final boolean $reverseLayout = this.$reverseLayout;
        final LazyGridItemPlacementAnimator $placementAnimator = this.$placementAnimator;
        final int n13 = n10;
        final t t = new t($itemProvider, value, s3, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a(value, $isVertical3, $reverseLayout, n3, n7, $placementAnimator, n12));
        final boolean $isVertical4 = this.$isVertical;
        final androidx.compose.foundation.lazy.grid.b b = new androidx.compose.foundation.lazy.grid.b($isVertical4, list, s4, k0, s3, t, g, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b($isVertical4, list, value, s4));
        final LazyGridState $state2 = this.$state;
        final l<v, ArrayList<Pair<? extends Integer, ? extends a>>> value2 = (l<v, ArrayList<Pair<? extends Integer, ? extends a>>>)new l<v, ArrayList<Pair<? extends Integer, ? extends a>>>() {
            public final ArrayList<Pair<Integer, a>> invoke-bKFJvoY(int n) {
                final LazyGridSpanLayoutProvider.c b = g.b(n);
                int a = b.a;
                final ArrayList list = new ArrayList<Pair>(b.b.size());
                final List<c> b2 = b.b;
                final androidx.compose.foundation.lazy.grid.b $measuredLineProvider = b;
                final int size = b2.size();
                int i = 0;
                n = 0;
                while (i < size) {
                    final int n2 = (int)b2.get(i).a;
                    list.add(new Pair((Object)a, $measuredLineProvider.g.invoke((Object)n, (Object)n2)));
                    ++a;
                    n += n2;
                    ++i;
                }
                return (ArrayList<Pair<Integer, a>>)list;
            }
        };
        $state2.getClass();
        ((SnapshotMutableStateImpl<LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1>)$state2.p).setValue(value2);
        final LazyGridState $state3 = this.$state;
        Object o = f$a.a();
        try {
            Object o2 = ((i1.f)o).i();
            try {
                int n14;
                int intValue;
                if ($state3.e() >= k0 && k0 > 0) {
                    n14 = g.c(k0 - 1);
                    intValue = 0;
                }
                else {
                    n14 = g.c($state3.e());
                    intValue = ((SnapshotMutableStateImpl<Number>)$state3.a.b).getValue().intValue();
                }
                Object o3 = j.a;
                i1.f.o((i1.f)o2);
                ((i1.f)o).c();
                final int size2 = list.size();
                final float d = this.$state.d;
                final boolean $isVertical5 = this.$isVertical;
                o2 = this.$verticalArrangement;
                final androidx.compose.foundation.layout.a.d $horizontalArrangement3 = this.$horizontalArrangement;
                final boolean $reverseLayout2 = this.$reverseLayout;
                final LazyGridItemPlacementAnimator $placementAnimator2 = this.$placementAnimator;
                o = t;
                Object o4 = new zg2.q<Integer, Integer, l<? super e0.a, ? extends j>, c2.t>() {
                    public final c2.t invoke(int x, final int n, final l<? super e0.a, j> l) {
                        ah2.f.f((Object)l, "placement");
                        final f $this_null = value;
                        x = c0.x(x + n5, n);
                        return $this_null.Q(x, c0.w(n + n4, n), kotlin.collections.c.N1(), l);
                    }
                };
                ah2.f.f((Object)$placementAnimator2, "placementAnimator");
                if (n3 < 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (n7 >= 0) {
                    n value3 = null;
                    Label_1157: {
                        if (k0 <= 0) {
                            o = ((zg2.q)o4).invoke((Object)a.j(m), (Object)a.i(m), (Object)LazyGridMeasureKt$measureLazyGrid$1.INSTANCE);
                            final EmptyList instance = EmptyList.INSTANCE;
                            Orientation orientation2;
                            if ($isVertical5) {
                                orientation2 = Orientation.Vertical;
                            }
                            else {
                                orientation2 = Orientation.Horizontal;
                            }
                            value3 = new n(null, 0, false, 0.0f, (c2.t)o, (List)instance, 0, orientation2);
                        }
                        else {
                            final int d2 = at1.a.D1(d);
                            final int n15 = intValue - d2;
                            final boolean b2 = n14 == 0;
                            int n16 = d2;
                            int n17 = n15;
                            if (b2) {
                                n16 = d2;
                                if ((n17 = n15) < 0) {
                                    n16 = d2 + n15;
                                    n17 = 0;
                                }
                            }
                            o3 = new ArrayList<Object>();
                            int n18 = n17 - n3;
                            final int n19 = -n3;
                            while (n18 < 0 && n14 + 0 > 0) {
                                --n14;
                                final u a = b.a(n14);
                                ((ArrayList<u>)o3).add(0, a);
                                n18 += a.j;
                            }
                            int n20 = n16;
                            int n21;
                            if ((n21 = n18) < n19) {
                                n20 = n16 + n18;
                                n21 = n19;
                            }
                            final int n22 = n21 + n3;
                            int n23;
                            if ((n23 = n13 + n7) < 0) {
                                n23 = 0;
                            }
                            int n24 = -n22;
                            final int size3 = ((ArrayList)o3).size();
                            int n25 = n14;
                            int i = 0;
                            int n26 = n25;
                            while (i < size3) {
                                final u u = ((ArrayList<u>)o3).get(i);
                                ++n26;
                                n24 += u.j;
                                ++i;
                            }
                            final int n27 = n24;
                            n = m;
                            final int n28 = n13;
                            int n29 = n22;
                            int n30 = n26;
                            int n31 = k0;
                            final int n32 = n23;
                            int n33 = n27;
                            while (n33 <= n32 || ((ArrayList)o3).isEmpty()) {
                                final u a2 = b.a(n30);
                                final s[] b3 = a2.b;
                                if (b3.length == 0) {
                                    break;
                                }
                                n33 += a2.j;
                                if (n33 <= n19 && ((s)kotlin.collections.b.N1((Object[])b3)).a != n31 - 1) {
                                    n25 = n30 + 1;
                                    n29 -= a2.j;
                                }
                                else {
                                    ((ArrayList<u>)o3).add(a2);
                                }
                                ++n30;
                            }
                            int n39 = 0;
                            int n44 = 0;
                            int n45 = 0;
                            Label_1644: {
                                int n41;
                                if (n33 < n28) {
                                    final int n34 = n28 - n33;
                                    final int n35 = n29 - n34;
                                    final int n36 = n33 + n34;
                                    int n37;
                                    int n38;
                                    u a3;
                                    for (n37 = n25, n38 = n35; n38 < n3 && n37 + 0 > 0; n38 += a3.j) {
                                        --n37;
                                        a3 = b.a(n37);
                                        ((ArrayList<u>)o3).add(0, a3);
                                    }
                                    n39 = n31;
                                    final int n40 = n20 += n34;
                                    n41 = n36;
                                    n29 = n38;
                                    n31 = n39;
                                    if (n38 < 0) {
                                        n20 = n40 + n38;
                                        final int n42 = 0;
                                        final int n43 = n36 + n38;
                                        n44 = n42;
                                        n45 = n43;
                                        break Label_1644;
                                    }
                                }
                                else {
                                    n41 = n33;
                                }
                                n44 = n29;
                                n39 = n31;
                                n45 = n41;
                            }
                            float n46 = d;
                            if (at1.a.J0(at1.a.D1(d)) == at1.a.J0(n20)) {
                                n46 = d;
                                if (Math.abs(at1.a.D1(d)) >= Math.abs(n20)) {
                                    n46 = (float)n20;
                                }
                            }
                            final int n47 = -n44;
                            u u3;
                            u u2 = u3 = (u)CollectionsKt___CollectionsKt.p1((List)o3);
                            int n48 = n44;
                            if (n3 > 0) {
                                final int size4 = ((ArrayList)o3).size();
                                int n49 = 0;
                                while (true) {
                                    u3 = u2;
                                    n48 = n44;
                                    if (n49 >= size4) {
                                        break;
                                    }
                                    final int j = ((ArrayList<u>)o3).get(n49).j;
                                    u3 = u2;
                                    if ((n48 = n44) == 0) {
                                        break;
                                    }
                                    u3 = u2;
                                    if (j > (n48 = n44)) {
                                        break;
                                    }
                                    u3 = u2;
                                    n48 = n44;
                                    if (n49 == ah2.c.L((List)o3)) {
                                        break;
                                    }
                                    n44 -= j;
                                    ++n49;
                                    u2 = ((ArrayList<u>)o3).get(n49);
                                }
                            }
                            int n50;
                            if ($isVertical5) {
                                n50 = a.h(n);
                            }
                            else {
                                n50 = c0.x(n45, n);
                            }
                            int n51;
                            if ($isVertical5) {
                                n51 = c0.w(n45, n);
                            }
                            else {
                                n51 = a.g(n);
                            }
                            int n52;
                            if ($isVertical5) {
                                n52 = n51;
                            }
                            else {
                                n52 = n50;
                            }
                            final boolean b4 = n45 < Math.min(n52, n28);
                            if (b4 && n47 != 0) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            final int size5 = ((ArrayList)o3).size();
                            int n53 = 0;
                            for (int l = 0; l < size5; ++l) {
                                n53 += ((ArrayList<u>)o3).get(l).b.length;
                            }
                            final ArrayList list2 = new ArrayList<c2.t>(n53);
                            ArrayList list3 = null;
                            Label_2444: {
                                if (b4) {
                                    final int size6 = ((ArrayList)o3).size();
                                    final int[] array = new int[size6];
                                    for (int n54 = 0; n54 < size6; ++n54) {
                                        int n55;
                                        if (!$reverseLayout2) {
                                            n55 = n54;
                                        }
                                        else {
                                            n55 = size6 - n54 - 1;
                                        }
                                        array[n54] = ((ArrayList<u>)o3).get(n55).i;
                                    }
                                    final int[] array2 = new int[size6];
                                    for (int n56 = 0; n56 < size6; ++n56) {
                                        array2[n56] = 0;
                                    }
                                    if ($isVertical5) {
                                        if (o2 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        ((androidx.compose.foundation.layout.a.k)o2).b(value, n52, array, array2);
                                    }
                                    else {
                                        if ($horizontalArrangement3 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        $horizontalArrangement3.c(n52, array, LayoutDirection.Ltr, value, array2);
                                    }
                                    Object o5;
                                    o2 = (o5 = new gh2.i(0, size6 - 1));
                                    if ($reverseLayout2) {
                                        o5 = new g(((g)o2).g, 0, -((g)o2).h);
                                    }
                                    final int f = ((g)o5).f;
                                    final int g2 = ((g)o5).g;
                                    final int h = ((g)o5).h;
                                    int n57;
                                    if (h <= 0 || (n57 = f) > g2) {
                                        list3 = list2;
                                        if (h >= 0) {
                                            break Label_2444;
                                        }
                                        list3 = list2;
                                        if (g2 > f) {
                                            break Label_2444;
                                        }
                                        n57 = f;
                                    }
                                    while (true) {
                                        final int n58 = array2[n57];
                                        int n59;
                                        if (!$reverseLayout2) {
                                            n59 = n57;
                                        }
                                        else {
                                            n59 = size6 - n57 - 1;
                                        }
                                        final u u4 = ((ArrayList<u>)o3).get(n59);
                                        int n60 = n58;
                                        if ($reverseLayout2) {
                                            n60 = n52 - n58 - u4.i;
                                        }
                                        list2.addAll(u4.a(n60, n50, n51));
                                        list3 = list2;
                                        if (n57 == g2) {
                                            break;
                                        }
                                        n57 += h;
                                    }
                                }
                                else {
                                    list3 = list2;
                                    final int size7 = ((ArrayList)o3).size();
                                    int n61 = 0;
                                    int n62 = n47;
                                    while (n61 < size7) {
                                        final u u5 = ((ArrayList<u>)o3).get(n61);
                                        list3.addAll(u5.a(n62, n50, n51));
                                        n62 += u5.j;
                                        ++n61;
                                    }
                                }
                            }
                            final int n63 = 1;
                            final int n64 = (int)n46;
                            while (true) {
                                for (int size8 = list3.size(), n65 = 0; n65 < size8; ++n65) {
                                    if (((r0.p)list3.get(n65)).p) {
                                        final int n66 = n63;
                                        int n67;
                                        int n68;
                                        if (n66 == 0) {
                                            $placementAnimator2.d.clear();
                                            $placementAnimator2.e = kotlin.collections.c.N1();
                                            $placementAnimator2.f = -1;
                                            $placementAnimator2.g = 0;
                                            $placementAnimator2.h = -1;
                                            $placementAnimator2.i = 0;
                                            n67 = n28;
                                            n68 = n45;
                                        }
                                        else {
                                            $placementAnimator2.c = size2;
                                            final boolean b5 = $placementAnimator2.b;
                                            int n69;
                                            if (b5) {
                                                n69 = n51;
                                            }
                                            else {
                                                n69 = n50;
                                            }
                                            int n70 = n64;
                                            if ($reverseLayout2) {
                                                n70 = -n64;
                                            }
                                            int n71;
                                            if (b5) {
                                                n71 = 0;
                                            }
                                            else {
                                                n71 = n70;
                                            }
                                            if (!b5) {
                                                n70 = 0;
                                            }
                                            final long h2 = at1.a.h(n71, n70);
                                            final r0.p p2 = (r0.p)CollectionsKt___CollectionsKt.p1((List)list3);
                                            o2 = CollectionsKt___CollectionsKt.A1((List)list3);
                                            for (int size9 = list3.size(), n72 = 0; n72 < size9; ++n72) {
                                                final r0.p p3 = (r0.p)list3.get(n72);
                                                final e e = $placementAnimator2.d.get(p3.d);
                                                if (e != null) {
                                                    int b6;
                                                    if (p3.l) {
                                                        b6 = (int)(p3.g >> 32);
                                                    }
                                                    else {
                                                        b6 = u2.i.b(p3.g);
                                                    }
                                                    e.a = b6;
                                                    int b7;
                                                    if (p3.l) {
                                                        n = p3.a;
                                                        final int c = u2.g.c;
                                                        b7 = (int)(n >> 32);
                                                    }
                                                    else {
                                                        b7 = u2.g.b(p3.a);
                                                    }
                                                    e.b = b7;
                                                }
                                            }
                                            final int n73 = n51;
                                            final LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 = new LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1($placementAnimator2, list3);
                                            int n74 = 0;
                                            int n75 = 0;
                                            int n76 = 0;
                                            while (n74 < list3.size()) {
                                                final int intValue2 = ((Number)((l)lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1).invoke((Object)n74)).intValue();
                                                if (intValue2 == -1) {
                                                    ++n74;
                                                }
                                                else {
                                                    int max = 0;
                                                    while (n74 < list3.size() && ((Number)((l)lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1).invoke((Object)n74)).intValue() == intValue2) {
                                                        max = Math.max(max, ((r0.p)list3.get(n74)).d());
                                                        ++n74;
                                                    }
                                                    n75 += max;
                                                    ++n76;
                                                }
                                            }
                                            n68 = n45;
                                            final zg2.q q = (zg2.q)o4;
                                            final int n77 = n75 / n76;
                                            $placementAnimator2.j.clear();
                                            final int size10 = list3.size();
                                            int n78 = 0;
                                            int n79 = n28;
                                            while (n78 < size10) {
                                                final r0.p p4 = (r0.p)list3.get(n78);
                                                $placementAnimator2.j.add(p4.d);
                                                final e e2 = $placementAnimator2.d.get(p4.d);
                                                int n85;
                                                int n86;
                                                if (e2 == null) {
                                                    if (p4.p) {
                                                        int b8;
                                                        if (p4.l) {
                                                            b8 = (int)(p4.g >> 32);
                                                        }
                                                        else {
                                                            b8 = u2.i.b(p4.g);
                                                        }
                                                        int b9;
                                                        if (p4.l) {
                                                            n = p4.a;
                                                            final int c2 = u2.g.c;
                                                            b9 = (int)(n >> 32);
                                                        }
                                                        else {
                                                            b9 = u2.g.b(p4.a);
                                                        }
                                                        final e e3 = new e(b8, b9);
                                                        final Integer n80 = $placementAnimator2.e.get(p4.d);
                                                        n = p4.b;
                                                        int n81;
                                                        if (n80 == null) {
                                                            n81 = $placementAnimator2.b(n);
                                                        }
                                                        else {
                                                            int b10;
                                                            if (!$reverseLayout2) {
                                                                b10 = $placementAnimator2.b(n);
                                                            }
                                                            else {
                                                                b10 = $placementAnimator2.b(n) - p4.d();
                                                            }
                                                            n81 = $placementAnimator2.a(n80, p4.d(), n77, h2, $reverseLayout2, n69, b10);
                                                        }
                                                        if ($placementAnimator2.b) {
                                                            n = u2.g.a(0, n81, n, 1);
                                                        }
                                                        else {
                                                            n = u2.g.a(n81, 0, n, 2);
                                                        }
                                                        for (int size11 = p4.m.size(), n82 = 0; n82 < size11; ++n82) {
                                                            final ArrayList d3 = e3.d;
                                                            final e0 a4 = p4.m.get(n82).a;
                                                            int n83;
                                                            if (p4.l) {
                                                                n83 = a4.g;
                                                            }
                                                            else {
                                                                n83 = a4.f;
                                                            }
                                                            d3.add(new y(n83, n));
                                                            final j a5 = j.a;
                                                        }
                                                        final int n84 = n50;
                                                        $placementAnimator2.d.put(p4.d, e3);
                                                        $placementAnimator2.c(p4, e3);
                                                        n85 = n79;
                                                        n86 = n84;
                                                    }
                                                    else {
                                                        final int n87 = n50;
                                                        n85 = n79;
                                                        n86 = n87;
                                                    }
                                                }
                                                else {
                                                    final int n88 = n79;
                                                    n86 = n50;
                                                    if (p4.p) {
                                                        n = e2.c;
                                                        e2.c = at1.a.h((int)(n >> 32) + (int)(h2 >> 32), u2.g.b(h2) + u2.g.b(n));
                                                        $placementAnimator2.c(p4, e2);
                                                        n85 = n88;
                                                    }
                                                    else {
                                                        $placementAnimator2.d.remove(p4.d);
                                                        n85 = n88;
                                                    }
                                                }
                                                ++n78;
                                                final int n89 = n85;
                                                n50 = n86;
                                                n79 = n89;
                                            }
                                            if (!$reverseLayout2) {
                                                $placementAnimator2.f = p2.c;
                                                $placementAnimator2.g = $placementAnimator2.b(p2.a);
                                                $placementAnimator2.h = ((r0.p)o2).c;
                                                $placementAnimator2.i = ((r0.p)o2).i + ((r0.p)o2).h + $placementAnimator2.b(((r0.p)o2).a) - n69;
                                            }
                                            else {
                                                $placementAnimator2.f = ((r0.p)o2).c;
                                                $placementAnimator2.g = n69 - $placementAnimator2.b(((r0.p)o2).a) - ((r0.p)o2).h;
                                                $placementAnimator2.h = p2.c;
                                                final int n90 = -$placementAnimator2.b(p2.a);
                                                final int i2 = p2.i;
                                                final int h3 = p2.h;
                                                int b11;
                                                if ($placementAnimator2.b) {
                                                    b11 = u2.i.b(p2.g);
                                                }
                                                else {
                                                    b11 = (int)(p2.g >> 32);
                                                }
                                                $placementAnimator2.i = i2 + h3 - b11 + n90;
                                            }
                                            o3 = $placementAnimator2.d.entrySet().iterator();
                                            n = h2;
                                        Label_3745:
                                            while (((Iterator)o3).hasNext()) {
                                                final Map.Entry<K, e> entry = ((Iterator<Map.Entry<K, e>>)o3).next();
                                                if (!$placementAnimator2.j.contains(entry.getKey())) {
                                                    o2 = entry.getValue();
                                                    final long c3 = ((e)o2).c;
                                                    ((e)o2).c = at1.a.h((int)(c3 >> 32) + (int)(n >> 32), u2.g.b(n) + u2.g.b(c3));
                                                    final c2.t t2 = (c2.t)o;
                                                    final Integer n91 = ((i)((t)t2).b).d().get(entry.getKey());
                                                    o = ((e)o2).d;
                                                    while (true) {
                                                        for (int size12 = ((ArrayList)o).size(), n92 = 0; n92 < size12; ++n92) {
                                                            final y y = (y)((List)o).get(n92);
                                                            final long c4 = y.c;
                                                            final long c5 = ((e)o2).c;
                                                            final long h4 = at1.a.h((int)(c4 >> 32) + (int)(c5 >> 32), u2.g.b(c5) + u2.g.b(c4));
                                                            if ($placementAnimator2.b(h4) + y.a > 0 && $placementAnimator2.b(h4) < n69) {
                                                                final boolean b12 = true;
                                                                o = ((e)o2).d;
                                                                while (true) {
                                                                    for (int size13 = ((ArrayList)o).size(), n93 = 0; n93 < size13; ++n93) {
                                                                        if (((SnapshotMutableStateImpl<Object>)((y)((List)o).get(n93)).d).getValue()) {
                                                                            final int n94 = 1;
                                                                            if ((b12 || (n94 ^ 0x1) == 0x0) && n91 != null && !((e)o2).d.isEmpty()) {
                                                                                final int intValue3 = n91;
                                                                                long n95;
                                                                                if ($placementAnimator2.b) {
                                                                                    n95 = a.a.e(((e)o2).a);
                                                                                }
                                                                                else {
                                                                                    n95 = a.a.d(((e)o2).a);
                                                                                }
                                                                                o = t2;
                                                                                o = ((t)o).a(intValue3, ((t)o).a, n95);
                                                                                int a6 = $placementAnimator2.a(n91, ((s)o).n, n77, n, $reverseLayout2, n69, n69);
                                                                                if ($reverseLayout2) {
                                                                                    a6 = n69 - a6 - ((s)o).m;
                                                                                }
                                                                                o = ((s)o).a(a6, ((e)o2).b, n50, n73, -1, -1, ((s)o).m);
                                                                                list3.add(o);
                                                                                $placementAnimator2.c((r0.p)o, (e)o2);
                                                                            }
                                                                            else {
                                                                                ((Iterator)o3).remove();
                                                                            }
                                                                            o = t2;
                                                                            continue Label_3745;
                                                                        }
                                                                    }
                                                                    final int n94 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                        final boolean b12 = false;
                                                        continue;
                                                    }
                                                }
                                            }
                                            $placementAnimator2.e = ((i)((t)o).b).d();
                                            o4 = q;
                                            n51 = n73;
                                            n67 = n79;
                                        }
                                        final boolean b13 = n68 > n67;
                                        o = ((zg2.q)o4).invoke((Object)n50, (Object)n51, (Object)new LazyGridMeasureKt$measureLazyGrid$3(list3));
                                        Orientation orientation3;
                                        if ($isVertical5) {
                                            orientation3 = Orientation.Vertical;
                                        }
                                        else {
                                            orientation3 = Orientation.Horizontal;
                                        }
                                        value3 = new n(u3, n48, b13, n46, (c2.t)o, list3, n39, orientation3);
                                        break Label_1157;
                                    }
                                }
                                final int n66 = 0;
                                continue;
                            }
                        }
                    }
                    final LazyGridState $state4 = this.$state;
                    o = this.$overscrollEffect;
                    $state4.getClass();
                    final r a7 = $state4.a;
                    a7.getClass();
                    final u a8 = value3.a;
                    Object d4 = null;
                    Label_4499: {
                        if (a8 != null) {
                            final s[] b14 = a8.b;
                            if (b14 != null) {
                                final s s5 = (s)kotlin.collections.b.D1((Object[])b14);
                                if (s5 != null) {
                                    d4 = s5.b;
                                    break Label_4499;
                                }
                            }
                        }
                        d4 = null;
                    }
                    a7.d = d4;
                    final int b15;
                    Label_4648: {
                        if (!a7.c && value3.f <= 0) {
                            break Label_4648;
                        }
                        a7.c = true;
                        b15 = value3.b;
                        if (b15 < 0.0f) {
                            throw new IllegalStateException(a.g("scrollOffset should be non-negative (", b15, ')').toString());
                        }
                        d4 = f$a.a();
                        try {
                            o3 = ((i1.f)d4).i();
                            try {
                                o2 = value3.a;
                                int a9 = 0;
                                Label_4624: {
                                    if (o2 != null) {
                                        o2 = ((u)o2).b;
                                        if (o2 != null) {
                                            o2 = kotlin.collections.b.D1((Object[])o2);
                                            if (o2 != null) {
                                                a9 = ((s)o2).a;
                                                break Label_4624;
                                            }
                                        }
                                    }
                                    a9 = 0;
                                }
                                a7.a(a9, b15);
                                final j a10 = j.a;
                                i1.f.o((i1.f)o3);
                                ((i1.f)d4).c();
                                final boolean b16 = true;
                                $state4.d -= value3.d;
                                ((SnapshotMutableStateImpl<n>)$state4.b).setValue(value3);
                                final boolean c6 = value3.c;
                                $state4.s = c6;
                                d4 = value3.a;
                                int a11;
                                if (d4 != null) {
                                    a11 = ((u)d4).a;
                                }
                                else {
                                    a11 = 0;
                                }
                                $state4.r = (a11 != 0 || value3.b != 0);
                                Label_4787: {
                                    if (d4 != null) {
                                        d4 = ((u)d4).b;
                                        if (d4 != null) {
                                            d4 = kotlin.collections.b.D1((Object[])d4);
                                            if (d4 != null) {
                                                break Label_4787;
                                            }
                                        }
                                    }
                                    d4 = 0;
                                }
                                final boolean b17 = !ah2.f.a(d4, (Object)0) || value3.b != 0;
                                boolean enabled = b16;
                                if (!c6) {
                                    enabled = (b17 && b16);
                                }
                                ((q)o).setEnabled(enabled);
                                return value3;
                            }
                            finally {
                                i1.f.o((i1.f)o3);
                            }
                        }
                        finally {
                            ((i1.f)d4).c();
                        }
                    }
                    throw new IllegalStateException(a.g("scrollOffset should be non-negative (", b15, ')').toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            finally {
                i1.f.o((i1.f)o2);
            }
        }
        finally {
            ((i1.f)o).c();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
