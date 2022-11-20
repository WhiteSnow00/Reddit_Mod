// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import r0.s;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.k;
import java.util.Iterator;
import u2.a$a;
import java.util.Map;
import r0.a0;
import java.util.Collection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import r0.t;
import r0.v;
import kotlin.collections.EmptyList;
import c2.h0;
import mg2.q;
import i1.f;
import cg2.j;
import i1.f$a;
import r0.c;
import kotlin.Pair;
import java.util.ArrayList;
import r0.x;
import mg2.l;
import r0.w;
import r0.u;
import cg.d;
import androidx.compose.foundation.gestures.Orientation;
import ng2.e;
import androidx.compose.foundation.layout.a$k;
import java.util.List;
import u2.b;
import m0.r;
import r0.i;
import androidx.compose.foundation.layout.a$d;
import p0.z;
import kotlin.Metadata;
import r0.o;
import u2.a;
import s0.g;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements p<g, a, o>
{
    public final z $contentPadding;
    public final a$d $horizontalArrangement;
    public final boolean $isVertical;
    public final i $itemProvider;
    public final r $overscrollEffect;
    public final LazyGridItemPlacementAnimator $placementAnimator;
    public final boolean $reverseLayout;
    public final p<b, a, List<Integer>> $slotSizesSums;
    public final LazyGridState $state;
    public final a$k $verticalArrangement;
    
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(final boolean $isVertical, final z $contentPadding, final boolean $reverseLayout, final LazyGridState $state, final i $itemProvider, final p<? super b, ? super a, ? extends List<Integer>> $slotSizesSums, final a$k $verticalArrangement, final a$d $horizontalArrangement, final LazyGridItemPlacementAnimator $placementAnimator, final r $overscrollEffect) {
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
    
    public Object invoke(final Object o, final Object o2) {
        return this.invoke-0kLqBqw((g)o, ((a)o2).a);
    }
    
    public final o invoke-0kLqBqw(final g value, long n) {
        e.f((Object)value, "$this$null");
        Orientation orientation;
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        }
        else {
            orientation = Orientation.Horizontal;
        }
        vl.a.m1(n, orientation);
        int n2;
        if (this.$isVertical) {
            n2 = ((b)value).w0(this.$contentPadding.b(((k)value).getLayoutDirection()));
        }
        else {
            n2 = ((b)value).w0(vl.a.g1(this.$contentPadding, ((k)value).getLayoutDirection()));
        }
        int n3;
        if (this.$isVertical) {
            n3 = ((b)value).w0(this.$contentPadding.c(((k)value).getLayoutDirection()));
        }
        else {
            n3 = ((b)value).w0(vl.a.f1(this.$contentPadding, ((k)value).getLayoutDirection()));
        }
        final int w0 = ((b)value).w0(this.$contentPadding.d());
        final int w2 = ((b)value).w0(this.$contentPadding.a());
        final int n4 = w0 + w2;
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
            n3 = w0;
        }
        else if ($isVertical && this.$reverseLayout) {
            n3 = w2;
        }
        else if (!$isVertical && !this.$reverseLayout) {
            n3 = n2;
        }
        final int n7 = n6 - n3;
        final long v3 = d.v3(-n5, -n4, n);
        this.$state.j(this.$itemProvider);
        final LazyGridSpanLayoutProvider i = this.$itemProvider.i();
        final List list = (List)this.$slotSizesSums.invoke((Object)value, (Object)new a(n));
        final int size = list.size();
        if (size != i.i) {
            i.i = size;
            i.b.clear();
            i.b.add(new LazyGridSpanLayoutProvider$a(0, 0));
            i.c = 0;
            i.d = 0;
            i.f = -1;
            i.g.clear();
        }
        final LazyGridState $state = this.$state;
        $state.getClass();
        ((SnapshotMutableStateImpl)$state.f).setValue((Object)value);
        ((SnapshotMutableStateImpl)this.$state.e).setValue((Object)list.size());
        float n8;
        if (this.$isVertical) {
            final a$k $verticalArrangement = this.$verticalArrangement;
            if ($verticalArrangement == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n8 = $verticalArrangement.a();
        }
        else {
            final a$d $horizontalArrangement = this.$horizontalArrangement;
            if ($horizontalArrangement == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            n8 = $horizontalArrangement.a();
        }
        final int w3 = ((b)value).w0(n8);
        float n9 = 0.0f;
        Label_0588: {
            if (this.$isVertical) {
                final a$d $horizontalArrangement2 = this.$horizontalArrangement;
                if ($horizontalArrangement2 != null) {
                    n9 = $horizontalArrangement2.a();
                    break Label_0588;
                }
            }
            else {
                final a$k $verticalArrangement2 = this.$verticalArrangement;
                if ($verticalArrangement2 != null) {
                    n9 = $verticalArrangement2.a();
                    break Label_0588;
                }
            }
            n9 = 0;
        }
        final int w4 = ((b)value).w0(n9);
        final int m = ((s0.e)this.$itemProvider).M();
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
            int n11 = w0;
            if ($isVertical2) {
                n11 = w0 + n10;
            }
            n12 = xd.a.g(n2, n11);
        }
        else {
            n12 = xd.a.g(n2, w0);
        }
        final i $itemProvider = this.$itemProvider;
        final boolean $isVertical3 = this.$isVertical;
        final boolean $reverseLayout = this.$reverseLayout;
        final LazyGridItemPlacementAnimator $placementAnimator = this.$placementAnimator;
        final int n13 = n10;
        final u u = new u($itemProvider, value, w3, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a(value, $isVertical3, $reverseLayout, n3, n7, $placementAnimator, n12));
        final boolean $isVertical4 = this.$isVertical;
        final w w5 = new w($isVertical4, list, w4, m, w3, u, i, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b($isVertical4, list, value, w4));
        final LazyGridState $state2 = this.$state;
        final l<x, ArrayList<Pair<? extends Integer, ? extends a>>> value2 = (l<x, ArrayList<Pair<? extends Integer, ? extends a>>>)new l<x, ArrayList<Pair<? extends Integer, ? extends a>>>(i, w5) {
            public final w $measuredLineProvider;
            public final LazyGridSpanLayoutProvider $spanLayoutProvider;
            
            public Object invoke(final Object o) {
                return this.invoke-bKFJvoY(((x)o).a);
            }
            
            public final ArrayList<Pair<Integer, a>> invoke-bKFJvoY(int i) {
                final LazyGridSpanLayoutProvider$c b = this.$spanLayoutProvider.b(i);
                int a = b.a;
                final ArrayList list = new ArrayList<Pair>(b.b.size());
                final List b2 = b.b;
                final w $measuredLineProvider = this.$measuredLineProvider;
                final int size = b2.size();
                i = 0;
                int n = 0;
                while (i < size) {
                    final int n2 = (int)b2.get(i).a;
                    list.add(new Pair((Object)a, (Object)new a($measuredLineProvider.a(n, n2))));
                    ++a;
                    n += n2;
                    ++i;
                }
                return (ArrayList<Pair<Integer, a>>)list;
            }
        };
        $state2.getClass();
        ((SnapshotMutableStateImpl)$state2.p).setValue((Object)value2);
        final LazyGridState $state3 = this.$state;
        Object o = f$a.a();
        try {
            Object o2 = ((f)o).i();
            try {
                int n14;
                int f;
                if ($state3.e() >= m && m > 0) {
                    n14 = i.c(m - 1);
                    f = 0;
                }
                else {
                    n14 = i.c($state3.e());
                    f = $state3.f();
                }
                final j a = j.a;
                i1.f.o((f)o2);
                ((f)o).c();
                final float d = this.$state.d;
                final boolean $isVertical5 = this.$isVertical;
                final a$k $verticalArrangement3 = this.$verticalArrangement;
                final a$d $horizontalArrangement3 = this.$horizontalArrangement;
                final boolean $reverseLayout2 = this.$reverseLayout;
                final LazyGridItemPlacementAnimator $placementAnimator2 = this.$placementAnimator;
                final LazyGridSpanLayoutProvider j = this.$itemProvider.i();
                final q<Integer, Integer, l<? super h0.a, ? extends j>, c2.w> q = (q<Integer, Integer, l<? super h0.a, ? extends j>, c2.w>)new q<Integer, Integer, l<? super h0.a, ? extends j>, c2.w>(value, n, n5, n4) {
                    public final long $containerConstraints;
                    public final g $this_null;
                    public final int $totalHorizontalPadding;
                    public final int $totalVerticalPadding;
                    
                    public final c2.w invoke(int s1, final int n, final l<? super h0.a, j> l) {
                        e.f((Object)l, "placement");
                        final g $this_null = this.$this_null;
                        s1 = cg.d.s1(s1 + this.$totalHorizontalPadding, this.$containerConstraints);
                        return ((c2.x)$this_null).J(s1, cg.d.q1(n + this.$totalVerticalPadding, this.$containerConstraints), kotlin.collections.c.u4(), (l)l);
                    }
                    
                    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
                        return this.invoke(((Number)o).intValue(), ((Number)o2).intValue(), (l<? super h0.a, j>)o3);
                    }
                };
                e.f((Object)$placementAnimator2, "placementAnimator");
                e.f((Object)j, "spanLayoutProvider");
                final boolean b = n3 >= 0;
                o2 = "Failed requirement.";
                if (!b) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (n7 >= 0) {
                    o value3 = null;
                    Label_4469: {
                        if (m <= 0) {
                            final c2.w w6 = (c2.w)((q)q).invoke((Object)u2.a.j(v3), (Object)u2.a.i(v3), (Object)LazyGridMeasureKt$measureLazyGrid$1.INSTANCE);
                            final EmptyList instance = EmptyList.INSTANCE;
                            Orientation orientation2;
                            if ($isVertical5) {
                                orientation2 = Orientation.Vertical;
                            }
                            else {
                                orientation2 = Orientation.Horizontal;
                            }
                            value3 = new o(null, 0, false, 0.0f, w6, (List)instance, 0, orientation2);
                        }
                        else {
                            final int w7 = p7.a.W(d);
                            final int n15 = f - w7;
                            final boolean b2 = n14 == 0;
                            int n16 = w7;
                            int n17 = n15;
                            if (b2) {
                                n16 = w7;
                                if ((n17 = n15) < 0) {
                                    n16 = w7 + n15;
                                    n17 = 0;
                                }
                            }
                            final ArrayList<f> list2 = new ArrayList<f>();
                            final int n18 = -n3;
                            int n19;
                            if (w3 < 0) {
                                n19 = w3;
                            }
                            else {
                                n19 = 0;
                            }
                            final int n20 = n18 + n19;
                            int n21;
                            for (n21 = n17 + n20; n21 < 0 && n14 + 0 > 0; n21 += ((v)o).j) {
                                --n14;
                                o = w5.b(n14);
                                list2.add(0, (f)o);
                            }
                            final int n22 = 0;
                            int n23 = n16;
                            int n24;
                            if ((n24 = n21) < n20) {
                                n23 = n16 + n21;
                                n24 = n20;
                            }
                            final int n25 = n24 - n20;
                            int n26 = n13 + n7;
                            int n27 = n14;
                            if (n26 < 0) {
                                n26 = n22;
                            }
                            int n28 = -n25;
                            final int size2 = list2.size();
                            int k = 0;
                            int n29 = n27;
                            while (k < size2) {
                                o = list2.get(k);
                                ++n29;
                                n28 += ((v)o).j;
                                ++k;
                            }
                            final int n30 = n20;
                            int n31 = n28;
                            final int n32 = n29;
                            final int n33 = n13;
                            o = q;
                            int n34 = n25;
                            final int n35 = m;
                            final w w8 = w5;
                            int n36 = n32;
                            LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = j;
                            while (n31 <= n26 || list2.isEmpty()) {
                                final v b3 = w8.b(n36);
                                final t[] b4 = b3.b;
                                if (b4.length == 0) {
                                    break;
                                }
                                n31 += b3.j;
                                if (n31 <= n30 && ((t)kotlin.collections.b.s2((Object[])b4)).a != n35 - 1) {
                                    n27 = n36 + 1;
                                    n34 -= b3.j;
                                }
                                else {
                                    list2.add((f)b3);
                                }
                                ++n36;
                            }
                            int n40 = 0;
                            int n42 = 0;
                            int n43 = 0;
                            Label_1640: {
                                if (n31 < n33) {
                                    final int n37 = n33 - n31;
                                    final int n38 = n31 + n37;
                                    final int n39 = n34 - n37;
                                    n40 = n35;
                                    int n41;
                                    v b5;
                                    for (n41 = n39; n41 < n3 && n27 + 0 > 0; n41 += b5.j) {
                                        --n27;
                                        b5 = w8.b(n27);
                                        list2.add(0, (f)b5);
                                    }
                                    n23 += n37;
                                    if (n41 < 0) {
                                        n23 += n41;
                                        n42 = n38 + n41;
                                        n43 = 0;
                                        break Label_1640;
                                    }
                                    n42 = n38;
                                    n34 = n41;
                                }
                                else {
                                    n40 = n35;
                                    n42 = n31;
                                }
                                n43 = n34;
                            }
                            float n44 = d;
                            if (p7.a.u(p7.a.W(d)) == p7.a.u(n23)) {
                                n44 = d;
                                if (Math.abs(p7.a.W(d)) >= Math.abs(n23)) {
                                    n44 = (float)n23;
                                }
                            }
                            if (n43 < 0) {
                                throw new IllegalArgumentException(o2.toString());
                            }
                            final int n45 = -n43;
                            v v4 = (v)CollectionsKt___CollectionsKt.S4((List)list2);
                        Label_1740:
                            while (true) {
                                Label_1743: {
                                    if (n3 > 0) {
                                        break Label_1743;
                                    }
                                    final int n46 = n43;
                                    o2 = v4;
                                    if (w3 < 0) {
                                        break Label_1743;
                                    }
                                    int n47;
                                    if ($isVertical5) {
                                        n47 = u2.a.h(v3);
                                    }
                                    else {
                                        n47 = cg.d.s1(n42, v3);
                                    }
                                    int n48;
                                    if ($isVertical5) {
                                        n48 = cg.d.q1(n42, v3);
                                    }
                                    else {
                                        n48 = u2.a.g(v3);
                                    }
                                    int n49;
                                    if ($isVertical5) {
                                        n49 = n48;
                                    }
                                    else {
                                        n49 = n47;
                                    }
                                    final boolean b6 = n42 < Math.min(n49, n33);
                                    if (b6 && n45 != 0) {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                    final int size3 = list2.size();
                                    int l = 0;
                                    int n50 = 0;
                                    while (l < size3) {
                                        n50 += ((v)list2.get(l)).b.length;
                                        ++l;
                                    }
                                    final ArrayList list3 = new ArrayList(n50);
                                    ArrayList list5 = null;
                                    Label_2487: {
                                        if (b6) {
                                            final int size4 = list2.size();
                                            final int[] array = new int[size4];
                                            for (int n51 = 0; n51 < size4; ++n51) {
                                                int n52;
                                                if (!$reverseLayout2) {
                                                    n52 = n51;
                                                }
                                                else {
                                                    n52 = size4 - n51 - 1;
                                                }
                                                array[n51] = ((v)list2.get(n52)).i;
                                            }
                                            final int[] array2 = new int[size4];
                                            for (int n53 = 0; n53 < size4; ++n53) {
                                                array2[n53] = 0;
                                            }
                                            if ($isVertical5) {
                                                if ($verticalArrangement3 == null) {
                                                    throw new IllegalArgumentException("Required value was null.".toString());
                                                }
                                                $verticalArrangement3.b((b)value, n49, array, array2);
                                            }
                                            else {
                                                if ($horizontalArrangement3 == null) {
                                                    throw new IllegalArgumentException("Required value was null.".toString());
                                                }
                                                $horizontalArrangement3.c(n49, array, LayoutDirection.Ltr, (b)value, array2);
                                            }
                                            final ArrayList list4 = list3;
                                            Object o3;
                                            final tg2.i i2 = (tg2.i)(o3 = new tg2.i(0, size4 - 1));
                                            if ($reverseLayout2) {
                                                o3 = new tg2.g(((tg2.g)i2).g, 0, -((tg2.g)i2).h);
                                            }
                                            final int f2 = ((tg2.g)o3).f;
                                            final int g = ((tg2.g)o3).g;
                                            final int h = ((tg2.g)o3).h;
                                            int n54;
                                            if (h <= 0 || (n54 = f2) > g) {
                                                list5 = list4;
                                                if (h >= 0) {
                                                    break Label_2487;
                                                }
                                                list5 = list4;
                                                if (g > f2) {
                                                    break Label_2487;
                                                }
                                                n54 = f2;
                                            }
                                            while (true) {
                                                final int n55 = array2[n54];
                                                int n56;
                                                if (!$reverseLayout2) {
                                                    n56 = n54;
                                                }
                                                else {
                                                    n56 = size4 - n54 - 1;
                                                }
                                                final v v5 = (v)list2.get(n56);
                                                int n57 = n55;
                                                if ($reverseLayout2) {
                                                    n57 = n49 - n55 - v5.i;
                                                }
                                                list4.addAll(v5.a(n57, n47, n48));
                                                list5 = list4;
                                                if (n54 == g) {
                                                    break;
                                                }
                                                n54 += h;
                                            }
                                        }
                                        else {
                                            final ArrayList list6 = list3;
                                            final int size5 = list2.size();
                                            int n58 = 0;
                                            int n59 = n45;
                                            while (true) {
                                                list5 = list6;
                                                if (n58 >= size5) {
                                                    break;
                                                }
                                                final v v6 = (v)list2.get(n58);
                                                list6.addAll(v6.a(n59, n47, n48));
                                                n59 += v6.j;
                                                ++n58;
                                            }
                                        }
                                    }
                                    final f f3 = (f)o;
                                    int n60 = n33;
                                    final int n61 = (int)n44;
                                    while (true) {
                                        for (int size6 = list5.size(), n62 = 0; n62 < size6; ++n62) {
                                            if (((r0.q)list5.get(n62)).p) {
                                                final boolean b7 = true;
                                                ArrayList list7;
                                                int n63;
                                                int n64;
                                                if (!b7) {
                                                    $placementAnimator2.c.clear();
                                                    $placementAnimator2.d = kotlin.collections.c.u4();
                                                    $placementAnimator2.e = -1;
                                                    $placementAnimator2.f = 0;
                                                    $placementAnimator2.g = -1;
                                                    $placementAnimator2.h = 0;
                                                    o = f3;
                                                    list7 = list5;
                                                    n63 = n42;
                                                    n64 = n47;
                                                }
                                                else {
                                                    final boolean b8 = $placementAnimator2.b;
                                                    int n65;
                                                    if (b8) {
                                                        n65 = n48;
                                                    }
                                                    else {
                                                        n65 = n47;
                                                    }
                                                    int n66 = n61;
                                                    if ($reverseLayout2) {
                                                        n66 = -n61;
                                                    }
                                                    int n67;
                                                    if (b8) {
                                                        n67 = 0;
                                                    }
                                                    else {
                                                        n67 = n66;
                                                    }
                                                    if (!b8) {
                                                        n66 = 0;
                                                    }
                                                    final long g2 = xd.a.g(n67, n66);
                                                    final r0.q q2 = (r0.q)CollectionsKt___CollectionsKt.S4((List)list5);
                                                    final r0.q q3 = (r0.q)CollectionsKt___CollectionsKt.c5((List)list5);
                                                    for (int size7 = list5.size(), n68 = 0; n68 < size7; ++n68) {
                                                        o = list5.get(n68);
                                                        final r0.e e = $placementAnimator2.c.get(((r0.q)o).d);
                                                        if (e != null) {
                                                            int b9;
                                                            if (((r0.q)o).l) {
                                                                b9 = (int)(((r0.q)o).g >> 32);
                                                            }
                                                            else {
                                                                b9 = u2.i.b(((r0.q)o).g);
                                                            }
                                                            e.a = b9;
                                                            int c2;
                                                            if (((r0.q)o).l) {
                                                                n = ((r0.q)o).a;
                                                                final int c = u2.g.c;
                                                                c2 = (int)(n >> 32);
                                                            }
                                                            else {
                                                                c2 = u2.g.c(((r0.q)o).a);
                                                            }
                                                            e.b = c2;
                                                        }
                                                    }
                                                    n64 = n47;
                                                    o = f3;
                                                    final int n69 = n42;
                                                    final LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 = new LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1($placementAnimator2, list5);
                                                    int n70 = 0;
                                                    int n71 = 0;
                                                    int n72 = 0;
                                                    final int n73 = n60;
                                                    while (n70 < list5.size()) {
                                                        final int intValue = ((Number)((l)lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1).invoke((Object)n70)).intValue();
                                                        if (intValue == -1) {
                                                            ++n70;
                                                        }
                                                        else {
                                                            int max = 0;
                                                            while (n70 < list5.size() && ((Number)((l)lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1).invoke((Object)n70)).intValue() == intValue) {
                                                                max = Math.max(max, ((r0.q)list5.get(n70)).f());
                                                                ++n70;
                                                            }
                                                            n71 += max;
                                                            ++n72;
                                                        }
                                                    }
                                                    final int n74 = n71 / n72;
                                                    $placementAnimator2.i.clear();
                                                    final int size8 = list5.size();
                                                    int n75 = 0;
                                                    final r0.q q4 = q3;
                                                    while (n75 < size8) {
                                                        final r0.q q5 = (r0.q)list5.get(n75);
                                                        $placementAnimator2.i.add(q5.d);
                                                        final r0.e e2 = $placementAnimator2.c.get(q5.d);
                                                        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2;
                                                        ArrayList list9;
                                                        if (e2 == null) {
                                                            if (q5.p) {
                                                                int b10;
                                                                if (q5.l) {
                                                                    b10 = (int)(q5.g >> 32);
                                                                }
                                                                else {
                                                                    b10 = u2.i.b(q5.g);
                                                                }
                                                                int c4;
                                                                if (q5.l) {
                                                                    n = q5.a;
                                                                    final int c3 = u2.g.c;
                                                                    c4 = (int)(n >> 32);
                                                                }
                                                                else {
                                                                    c4 = u2.g.c(q5.a);
                                                                }
                                                                final r0.e e3 = new r0.e(b10, c4);
                                                                final Integer n76 = $placementAnimator2.d.get(q5.d);
                                                                n = q5.b;
                                                                int n77;
                                                                if (n76 == null) {
                                                                    n77 = $placementAnimator2.b(n);
                                                                }
                                                                else {
                                                                    int b11;
                                                                    if (!$reverseLayout2) {
                                                                        b11 = $placementAnimator2.b(n);
                                                                    }
                                                                    else {
                                                                        b11 = $placementAnimator2.b(n) - q5.f();
                                                                    }
                                                                    n77 = $placementAnimator2.a((int)n76, q5.f(), n74, g2, $reverseLayout2, n65, b11, (ArrayList)list5, lazyGridSpanLayoutProvider);
                                                                }
                                                                if ($placementAnimator2.b) {
                                                                    n = u2.g.a(0, n77, n, 1);
                                                                }
                                                                else {
                                                                    n = u2.g.a(n77, 0, n, 2);
                                                                }
                                                                for (int size9 = q5.m.size(), n78 = 0; n78 < size9; ++n78) {
                                                                    final ArrayList d2 = e3.d;
                                                                    final h0 a2 = q5.m.get(n78).a;
                                                                    int n79;
                                                                    if (q5.l) {
                                                                        n79 = a2.g;
                                                                    }
                                                                    else {
                                                                        n79 = a2.f;
                                                                    }
                                                                    d2.add(new a0(n79, n));
                                                                    final j a3 = cg2.j.a;
                                                                }
                                                                final ArrayList list8 = list5;
                                                                lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
                                                                $placementAnimator2.c.put(q5.d, e3);
                                                                $placementAnimator2.c(q5, e3);
                                                                list9 = list8;
                                                            }
                                                            else {
                                                                final ArrayList list10 = list5;
                                                                lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
                                                                list9 = list10;
                                                            }
                                                        }
                                                        else {
                                                            final ArrayList list11 = list5;
                                                            lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
                                                            if (q5.p) {
                                                                n = e2.c;
                                                                e2.c = xd.a.g((int)(n >> 32) + (int)(g2 >> 32), u2.g.c(g2) + u2.g.c(n));
                                                                $placementAnimator2.c(q5, e2);
                                                                list9 = list11;
                                                            }
                                                            else {
                                                                $placementAnimator2.c.remove(q5.d);
                                                                list9 = list11;
                                                            }
                                                        }
                                                        ++n75;
                                                        final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider3 = lazyGridSpanLayoutProvider2;
                                                        list5 = list9;
                                                        lazyGridSpanLayoutProvider = lazyGridSpanLayoutProvider3;
                                                    }
                                                    if (!$reverseLayout2) {
                                                        $placementAnimator2.e = q2.c;
                                                        $placementAnimator2.f = $placementAnimator2.b(q2.a);
                                                        $placementAnimator2.g = q4.c;
                                                        $placementAnimator2.h = q4.i + q4.h + $placementAnimator2.b(q4.a) - n65;
                                                    }
                                                    else {
                                                        $placementAnimator2.e = q4.c;
                                                        $placementAnimator2.f = n65 - $placementAnimator2.b(q4.a) - q4.h;
                                                        $placementAnimator2.g = q2.c;
                                                        final int n80 = -$placementAnimator2.b(q2.a);
                                                        final int i3 = q2.i;
                                                        final int h2 = q2.h;
                                                        int b12;
                                                        if ($placementAnimator2.b) {
                                                            b12 = u2.i.b(q2.g);
                                                        }
                                                        else {
                                                            b12 = (int)(q2.g >> 32);
                                                        }
                                                        $placementAnimator2.h = i3 + h2 - b12 + n80;
                                                    }
                                                    final Iterator iterator = $placementAnimator2.c.entrySet().iterator();
                                                    list7 = list5;
                                                    n = g2;
                                                    final Iterator iterator2 = iterator;
                                                Label_3810:
                                                    while (iterator2.hasNext()) {
                                                        final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator2.next();
                                                        if (!$placementAnimator2.i.contains(entry.getKey())) {
                                                            final r0.e e4 = (r0.e)entry.getValue();
                                                            final long c5 = e4.c;
                                                            e4.c = xd.a.g((int)(c5 >> 32) + (int)(n >> 32), u2.g.c(n) + u2.g.c(c5));
                                                            final Integer n81 = ((s0.e)u.b).d().get(entry.getKey());
                                                            final ArrayList d3 = e4.d;
                                                            while (true) {
                                                                for (int size10 = d3.size(), n82 = 0; n82 < size10; ++n82) {
                                                                    final a0 a4 = (a0)d3.get(n82);
                                                                    final long c6 = a4.c;
                                                                    final long c7 = e4.c;
                                                                    final long g3 = xd.a.g((int)(c6 >> 32) + (int)(c7 >> 32), u2.g.c(c7) + u2.g.c(c6));
                                                                    if ($placementAnimator2.b(g3) + a4.a > 0 && $placementAnimator2.b(g3) < n65) {
                                                                        final boolean b13 = true;
                                                                        final ArrayList d4 = e4.d;
                                                                        while (true) {
                                                                            for (int size11 = d4.size(), n83 = 0; n83 < size11; ++n83) {
                                                                                if (((SnapshotMutableStateImpl)((a0)d4.get(n83)).d).getValue()) {
                                                                                    final int n84 = 1;
                                                                                    if ((b13 || (n84 ^ 0x1) == 0x0) && n81 != null && !e4.d.isEmpty()) {
                                                                                        final int intValue2 = n81;
                                                                                        long n85;
                                                                                        if ($placementAnimator2.b) {
                                                                                            n85 = a$a.e(e4.a);
                                                                                        }
                                                                                        else {
                                                                                            n85 = a$a.d(e4.a);
                                                                                        }
                                                                                        final t a5 = u.a(intValue2, u.a, n85);
                                                                                        int a6 = $placementAnimator2.a((int)n81, a5.n, n74, n, $reverseLayout2, n65, n65, (ArrayList)list7, lazyGridSpanLayoutProvider);
                                                                                        if ($reverseLayout2) {
                                                                                            a6 = n65 - a6 - a5.m;
                                                                                        }
                                                                                        final r0.q a7 = a5.a(a6, e4.b, n64, n48, -1, -1, a5.m);
                                                                                        list7.add(a7);
                                                                                        $placementAnimator2.c(a7, e4);
                                                                                    }
                                                                                    else {
                                                                                        iterator2.remove();
                                                                                    }
                                                                                    continue Label_3810;
                                                                                }
                                                                            }
                                                                            final int n84 = 0;
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                final boolean b13 = false;
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    $placementAnimator2.d = ((s0.e)u.b).d();
                                                    n63 = n69;
                                                    n60 = n73;
                                                }
                                                final boolean b14 = n63 > n60;
                                                final c2.w w9 = (c2.w)((q)o).invoke((Object)n64, (Object)n48, (Object)new LazyGridMeasureKt$measureLazyGrid$3((List)list7));
                                                Orientation orientation3;
                                                if ($isVertical5) {
                                                    orientation3 = Orientation.Vertical;
                                                }
                                                else {
                                                    orientation3 = Orientation.Horizontal;
                                                }
                                                value3 = new o((v)o2, n46, b14, n44, w9, list7, n40, orientation3);
                                                break Label_4469;
                                            }
                                        }
                                        final boolean b7 = false;
                                        continue;
                                    }
                                }
                                final int size12 = list2.size();
                                int n86 = 0;
                                while (true) {
                                    int n46 = n43;
                                    o2 = v4;
                                    if (n86 >= size12) {
                                        continue Label_1740;
                                    }
                                    final int j2 = ((v)list2.get(n86)).j;
                                    n46 = n43;
                                    o2 = v4;
                                    if (n43 == 0) {
                                        continue Label_1740;
                                    }
                                    n46 = n43;
                                    o2 = v4;
                                    if (j2 > n43) {
                                        continue Label_1740;
                                    }
                                    n46 = n43;
                                    o2 = v4;
                                    if (n86 == cg.d.R2((List)list2)) {
                                        continue Label_1740;
                                    }
                                    n43 -= j2;
                                    ++n86;
                                    v4 = (v)list2.get(n86);
                                }
                                break;
                            }
                        }
                    }
                    final LazyGridState $state4 = this.$state;
                    final r $overscrollEffect = this.$overscrollEffect;
                    $state4.getClass();
                    o = $state4.a;
                    o.getClass();
                    final v a8 = value3.a;
                    Object d5 = null;
                    Label_4551: {
                        if (a8 != null) {
                            final t[] b15 = a8.b;
                            if (b15 != null) {
                                final t t = (t)kotlin.collections.b.i2((Object[])b15);
                                if (t != null) {
                                    d5 = t.b;
                                    break Label_4551;
                                }
                            }
                        }
                        d5 = null;
                    }
                    ((s)o).d = d5;
                    final int b16;
                    Label_4694: {
                        if (!((s)o).a && value3.f <= 0) {
                            break Label_4694;
                        }
                        ((s)o).a = true;
                        b16 = value3.b;
                        if (b16 < 0.0f) {
                            throw new IllegalStateException(m5.a.d("scrollOffset should be non-negative (", b16, ')').toString());
                        }
                        d5 = f$a.a();
                        try {
                            o2 = ((f)d5).i();
                            try {
                                final v a9 = value3.a;
                                int a10 = 0;
                                Label_4670: {
                                    if (a9 != null) {
                                        final t[] b17 = a9.b;
                                        if (b17 != null) {
                                            final t t2 = (t)kotlin.collections.b.i2((Object[])b17);
                                            if (t2 != null) {
                                                a10 = t2.a;
                                                break Label_4670;
                                            }
                                        }
                                    }
                                    a10 = 0;
                                }
                                ((s)o).b(a10, b16);
                                o = cg2.j.a;
                                i1.f.o((f)o2);
                                ((f)d5).c();
                                $state4.d -= value3.d;
                                ((SnapshotMutableStateImpl)$state4.b).setValue((Object)value3);
                                $state4.s = value3.c;
                                d5 = value3.a;
                                int a11;
                                if (d5 != null) {
                                    a11 = ((v)d5).a;
                                }
                                else {
                                    a11 = 0;
                                }
                                $state4.r = (a11 != 0 || value3.b != 0);
                                if ($state4.j != -1 && (value3.e.isEmpty() ^ true)) {
                                    int n87;
                                    if ($state4.l) {
                                        d5 = CollectionsKt___CollectionsKt.c5((List)value3.e);
                                        if ($state4.h()) {
                                            n87 = ((r0.g)d5).d();
                                        }
                                        else {
                                            n87 = ((r0.g)d5).b();
                                        }
                                        ++n87;
                                    }
                                    else {
                                        d5 = CollectionsKt___CollectionsKt.S4((List)value3.e);
                                        if ($state4.h()) {
                                            n87 = ((r0.g)d5).d();
                                        }
                                        else {
                                            n87 = ((r0.g)d5).b();
                                        }
                                        --n87;
                                    }
                                    if ($state4.j != n87) {
                                        $state4.j = -1;
                                        d5 = $state4.k;
                                        final int h3 = ((a1.d)d5).h;
                                        if (h3 > 0) {
                                            d5 = ((a1.d)d5).f;
                                            e.d(d5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                                            int n88 = 0;
                                            do {
                                                ((s0.i.a)d5[n88]).cancel();
                                            } while (++n88 < h3);
                                        }
                                        $state4.k.f();
                                    }
                                }
                                final boolean b18 = true;
                                final boolean c8 = value3.c;
                                d5 = value3.a;
                                Label_5060: {
                                    if (d5 != null) {
                                        d5 = ((v)d5).b;
                                        if (d5 != null) {
                                            d5 = kotlin.collections.b.i2((Object[])d5);
                                            if (d5 != null) {
                                                break Label_5060;
                                            }
                                        }
                                    }
                                    d5 = 0;
                                }
                                final boolean b19 = !e.a(d5, (Object)0) || value3.b != 0;
                                boolean enabled = b18;
                                if (!c8) {
                                    enabled = (b19 && b18);
                                }
                                $overscrollEffect.setEnabled(enabled);
                                return value3;
                            }
                            finally {
                                i1.f.o((f)o2);
                            }
                        }
                        finally {
                            ((f)d5).c();
                        }
                    }
                    throw new IllegalStateException(m5.a.d("scrollOffset should be non-negative (", b16, ')').toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            finally {
                f.o((f)o2);
            }
        }
        finally {
            ((f)o).c();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
