// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import c2.x;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import q0.s;
import java.util.Iterator;
import q0.k;
import java.util.Map;
import tg2.i;
import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.List;
import q0.t;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import c2.w;
import c2.h0;
import mg2.l;
import mg2.q;
import i1.f;
import cg2.j;
import i1.f$a;
import q0.u;
import cg.d;
import androidx.compose.foundation.gestures.Orientation;
import ng2.e;
import androidx.compose.foundation.layout.a$k;
import j1.a$c;
import m0.r;
import q0.m;
import androidx.compose.foundation.layout.a$d;
import j1.a$b;
import p0.z;
import q0.h;
import kotlin.Metadata;
import u2.a;
import s0.g;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements p<g, a, q0.p>
{
    public final h $beyondBoundsInfo;
    public final z $contentPadding;
    public final a$b $horizontalAlignment;
    public final a$d $horizontalArrangement;
    public final boolean $isVertical;
    public final m $itemProvider;
    public final r $overscrollEffect;
    public final LazyListItemPlacementAnimator $placementAnimator;
    public final boolean $reverseLayout;
    public final LazyListState $state;
    public final a$c $verticalAlignment;
    public final a$k $verticalArrangement;
    
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(final boolean $isVertical, final z $contentPadding, final boolean $reverseLayout, final LazyListState $state, final m $itemProvider, final a$k $verticalArrangement, final a$d $horizontalArrangement, final LazyListItemPlacementAnimator $placementAnimator, final h $beyondBoundsInfo, final a$b $horizontalAlignment, final a$c $verticalAlignment, final r $overscrollEffect) {
        this.$isVertical = $isVertical;
        this.$contentPadding = $contentPadding;
        this.$reverseLayout = $reverseLayout;
        this.$state = $state;
        this.$itemProvider = $itemProvider;
        this.$verticalArrangement = $verticalArrangement;
        this.$horizontalArrangement = $horizontalArrangement;
        this.$placementAnimator = $placementAnimator;
        this.$beyondBoundsInfo = $beyondBoundsInfo;
        this.$horizontalAlignment = $horizontalAlignment;
        this.$verticalAlignment = $verticalAlignment;
        this.$overscrollEffect = $overscrollEffect;
        super(2);
    }
    
    public Object invoke(final Object o, final Object o2) {
        return this.invoke-0kLqBqw((g)o, ((a)o2).a);
    }
    
    public final q0.p invoke-0kLqBqw(final g value, long n) {
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
            n2 = ((b)value).w0(this.$contentPadding.b(((c2.k)value).getLayoutDirection()));
        }
        else {
            n2 = ((b)value).w0(vl.a.g1(this.$contentPadding, ((c2.k)value).getLayoutDirection()));
        }
        int n3;
        if (this.$isVertical) {
            n3 = ((b)value).w0(this.$contentPadding.c(((c2.k)value).getLayoutDirection()));
        }
        else {
            n3 = ((b)value).w0(vl.a.f1(this.$contentPadding, ((c2.k)value).getLayoutDirection()));
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
        this.$state.k(this.$itemProvider);
        final LazyListState $state = this.$state;
        $state.getClass();
        ((SnapshotMutableStateImpl)$state.f).setValue((Object)value);
        final q0.f f = this.$itemProvider.f();
        final int h = a.h(v3);
        final int g = a.g(v3);
        ((SnapshotMutableStateImpl)f.a).setValue((Object)h);
        ((SnapshotMutableStateImpl)f.b).setValue((Object)g);
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
        final int m = this.$itemProvider.M();
        int n9;
        if (this.$isVertical) {
            n9 = a.g(n) - n4;
        }
        else {
            n9 = a.h(n) - n5;
        }
        long n11;
        if (this.$reverseLayout && n9 <= 0) {
            final boolean $isVertical2 = this.$isVertical;
            if (!$isVertical2) {
                n2 += n9;
            }
            int n10 = w0;
            if ($isVertical2) {
                n10 = w0 + n9;
            }
            n11 = xd.a.g(n2, n10);
        }
        else {
            n11 = xd.a.g(n2, w0);
        }
        final boolean $isVertical3 = this.$isVertical;
        final u u = new u(v3, $isVertical3, this.$itemProvider, value, new LazyListKt$rememberLazyListMeasurePolicy$1$1$a(m, w3, value, $isVertical3, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, n3, n7, this.$placementAnimator, n11));
        ((SnapshotMutableStateImpl)this.$state.p).setValue((Object)new a(u.d));
        final LazyListState $state2 = this.$state;
        Object o = f$a.a();
        try {
            Object o2 = ((f)o).i();
            try {
                final int f2 = $state2.f();
                int g2 = $state2.g();
                final j a = j.a;
                i1.f.o((f)o2);
                ((f)o).c();
                final float e = this.$state.e;
                final boolean $isVertical4 = this.$isVertical;
                final List<Integer> b = this.$itemProvider.b();
                final a$k $verticalArrangement2 = this.$verticalArrangement;
                final a$d $horizontalArrangement2 = this.$horizontalArrangement;
                final boolean $reverseLayout = this.$reverseLayout;
                o = this.$placementAnimator;
                final h $beyondBoundsInfo = this.$beyondBoundsInfo;
                final q<Integer, Integer, l<? super h0.a, ? extends j>, w> q = (q<Integer, Integer, l<? super h0.a, ? extends j>, w>)new q<Integer, Integer, l<? super h0.a, ? extends j>, w>(value, n, n5, n4) {
                    public final long $containerConstraints;
                    public final g $this_null;
                    public final int $totalHorizontalPadding;
                    public final int $totalVerticalPadding;
                    
                    public final w invoke(int s1, final int n, final l<? super h0.a, j> l) {
                        ng2.e.f((Object)l, "placement");
                        final g $this_null = this.$this_null;
                        s1 = d.s1(s1 + this.$totalHorizontalPadding, this.$containerConstraints);
                        return ((x)$this_null).J(s1, d.q1(n + this.$totalVerticalPadding, this.$containerConstraints), c.u4(), (l)l);
                    }
                    
                    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
                        return this.invoke(((Number)o).intValue(), ((Number)o2).intValue(), (l<? super h0.a, j>)o3);
                    }
                };
                ng2.e.f((Object)b, "headerIndexes");
                ng2.e.f(o, "placementAnimator");
                ng2.e.f((Object)$beyondBoundsInfo, "beyondBoundsInfo");
                if (n3 < 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (n7 >= 0) {
                    q0.p value2 = null;
                    Label_0911: {
                        if (m <= 0) {
                            o = ((q)q).invoke((Object)u2.a.j(v3), (Object)u2.a.i(v3), (Object)LazyListMeasureKt$measureLazyList$1.INSTANCE);
                            final EmptyList instance = EmptyList.INSTANCE;
                            final int n12 = -n3;
                            Orientation orientation2;
                            if ($isVertical4) {
                                orientation2 = Orientation.Vertical;
                            }
                            else {
                                orientation2 = Orientation.Horizontal;
                            }
                            value2 = new q0.p(null, 0, false, 0.0f, (w)o, (List)instance, n12, n9 + n7, 0, orientation2);
                        }
                        else {
                            int n13;
                            if (f2 >= m) {
                                n13 = m - 1;
                                g2 = 0;
                            }
                            else {
                                n13 = f2;
                            }
                            final int w4 = p7.a.W(e);
                            final int n14 = g2 - w4;
                            final boolean b2 = n13 == 0;
                            int n15 = n14;
                            int n16 = w4;
                            if (b2) {
                                n15 = n14;
                                n16 = w4;
                                if (n14 < 0) {
                                    n16 = w4 + n14;
                                    n15 = 0;
                                }
                            }
                            final ArrayList list = new ArrayList<q0.w>();
                            final int n17 = -n3;
                            int n18;
                            if (w3 < 0) {
                                n18 = w3;
                            }
                            else {
                                n18 = 0;
                            }
                            final int n19 = n18 + n17;
                            int n20 = n15 + n19;
                            int n21 = 0;
                            while (n20 < 0 && n13 + 0 > 0) {
                                --n13;
                                o2 = u.a(n13);
                                list.add(0, (q0.w)o2);
                                n21 = Math.max(n21, ((t)o2).p);
                                n20 += ((t)o2).o;
                            }
                            int n22 = n20;
                            int n23 = n16;
                            if (n20 < n19) {
                                n23 = n16 + n20;
                                n22 = n19;
                            }
                            final int n24 = n22 - n19;
                            final int n25 = n9 + n7;
                            int n26;
                            if (n25 < 0) {
                                n26 = 0;
                            }
                            else {
                                n26 = n25;
                            }
                            int n27 = -n24;
                            final int size = list.size();
                            int i = 0;
                            int n28 = n13;
                            while (i < size) {
                                o2 = list.get(i);
                                ++n28;
                                n27 += ((t)o2).o;
                                ++i;
                            }
                            final int n29 = n24;
                            final int n30 = n13;
                            int n31 = n28;
                            int n32 = n30;
                            int n33 = n27;
                            final int n34 = n19;
                            int n35 = n29;
                            while ((n33 <= n26 || list.isEmpty()) && n31 < m) {
                                o2 = u.a(n31);
                                final int o3 = ((t)o2).o;
                                n33 += o3;
                                if (n33 <= n34 && n31 != m - 1) {
                                    n35 -= o3;
                                    n32 = n31 + 1;
                                }
                                else {
                                    n21 = Math.max(n21, ((t)o2).p);
                                    list.add((q0.w)o2);
                                }
                                ++n31;
                            }
                            int n36 = n35;
                            int n37 = n23;
                            int n38 = n33;
                            int n39 = n21;
                            if (n33 < n9) {
                                final int n40 = n9 - n33;
                                final int n41 = n35 - n40;
                                final int n42 = n33 + n40;
                                int n43;
                                int n44;
                                for (n43 = n32, n44 = n41; n44 < n3 && n43 + 0 > 0; n44 += ((t)o2).o) {
                                    --n43;
                                    o2 = u.a(n43);
                                    list.add(0, (q0.w)o2);
                                    n21 = Math.max(n21, ((t)o2).p);
                                }
                                final int n45 = n23 + n40;
                                n36 = n44;
                                n37 = n45;
                                n38 = n42;
                                n39 = n21;
                                if (n44 < 0) {
                                    n37 = n45 + n44;
                                    n38 = n42 + n44;
                                    n36 = 0;
                                    n39 = n21;
                                }
                            }
                            final int n46 = n38;
                            float n47 = e;
                            if (p7.a.u(p7.a.W(e)) == p7.a.u(n37)) {
                                n47 = e;
                                if (Math.abs(p7.a.W(e)) >= Math.abs(n37)) {
                                    n47 = (float)n37;
                                }
                            }
                            if (n36 < 0) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            final int n48 = -n36;
                            o2 = CollectionsKt___CollectionsKt.S4((List)list);
                            int n49 = 0;
                            Object j = null;
                            Label_1722: {
                                if (n3 <= 0) {
                                    n49 = n36;
                                    j = o2;
                                    if (w3 >= 0) {
                                        break Label_1722;
                                    }
                                }
                                final int size2 = list.size();
                                int n50 = 0;
                                while (true) {
                                    n49 = n36;
                                    j = o2;
                                    if (n50 >= size2) {
                                        break;
                                    }
                                    final int o4 = ((t)list.get(n50)).o;
                                    n49 = n36;
                                    j = o2;
                                    if (n36 == 0) {
                                        break;
                                    }
                                    n49 = n36;
                                    j = o2;
                                    if (o4 > n36) {
                                        break;
                                    }
                                    n49 = n36;
                                    j = o2;
                                    if (n50 == d.R2((List)list)) {
                                        break;
                                    }
                                    n36 -= o4;
                                    ++n50;
                                    o2 = list.get(n50);
                                }
                            }
                            Label_1853: {
                                if ($beyondBoundsInfo.a.k()) {
                                    final int a2 = ((t)CollectionsKt___CollectionsKt.S4((List)list)).a;
                                    final int b3 = $beyondBoundsInfo.b();
                                    final int n51 = m - 1;
                                    if (a2 > Math.min(b3, n51)) {
                                        o2 = new ArrayList<q0.w>();
                                        int n52 = ((t)CollectionsKt___CollectionsKt.S4((List)list)).a - 1;
                                        final int min = Math.min($beyondBoundsInfo.b(), n51);
                                        if (min <= n52) {
                                            while (true) {
                                                ((ArrayList<q0.w>)o2).add((q0.w)u.a(n52));
                                                if (n52 == min) {
                                                    break;
                                                }
                                                --n52;
                                            }
                                        }
                                        final j a3 = cg2.j.a;
                                        break Label_1853;
                                    }
                                }
                                o2 = EmptyList.INSTANCE;
                            }
                            Object instance2 = null;
                            Label_1975: {
                                if ($beyondBoundsInfo.a.k()) {
                                    final int a4 = ((t)CollectionsKt___CollectionsKt.c5((List)list)).a;
                                    final int a5 = $beyondBoundsInfo.a();
                                    final int n53 = m - 1;
                                    if (a4 < Math.min(a5, n53)) {
                                        instance2 = new ArrayList<t>();
                                        int k = ((t)CollectionsKt___CollectionsKt.c5((List)list)).a;
                                        while (k < Math.min($beyondBoundsInfo.a(), n53)) {
                                            ++k;
                                            ((ArrayList<t>)instance2).add(u.a(k));
                                        }
                                        final j a6 = cg2.j.a;
                                        break Label_1975;
                                    }
                                }
                                instance2 = EmptyList.INSTANCE;
                            }
                            final boolean b4 = ng2.e.a(j, CollectionsKt___CollectionsKt.S4((List)list)) && ((List)o2).isEmpty() && ((List)instance2).isEmpty();
                            int n54;
                            if ($isVertical4) {
                                n54 = n39;
                            }
                            else {
                                n54 = n46;
                            }
                            final int s1 = d.s1(n54, v3);
                            int n55;
                            if ($isVertical4) {
                                n55 = n46;
                            }
                            else {
                                n55 = n39;
                            }
                            int q2 = d.q1(n55, v3);
                            int n56;
                            if ($isVertical4) {
                                n56 = q2;
                            }
                            else {
                                n56 = s1;
                            }
                            final boolean b5 = n46 < Math.min(n56, n9);
                            if (b5 && n48 != 0) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            final ArrayList list2 = new ArrayList<t>(((List)instance2).size() + (((List)o2).size() + list.size()));
                            ArrayList<q0.w> list3 = null;
                            int n66 = 0;
                            Label_2851: {
                                if (b5) {
                                    if (!((List)o2).isEmpty() || !((List)instance2).isEmpty()) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    final int size3 = list.size();
                                    o2 = new int[size3];
                                    for (int l = 0; l < size3; ++l) {
                                        int n57;
                                        if (!$reverseLayout) {
                                            n57 = l;
                                        }
                                        else {
                                            n57 = size3 - l - 1;
                                        }
                                        o2[l] = ((t)list.get(n57)).n;
                                    }
                                    final int[] array = new int[size3];
                                    for (int n58 = 0; n58 < size3; ++n58) {
                                        array[n58] = 0;
                                    }
                                    if ($isVertical4) {
                                        if ($verticalArrangement2 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        $verticalArrangement2.b((b)value, n56, (int[])o2, array);
                                    }
                                    else {
                                        if ($horizontalArrangement2 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        $horizontalArrangement2.c(n56, (int[])o2, LayoutDirection.Ltr, (b)value, array);
                                    }
                                    list3 = (ArrayList<q0.w>)list;
                                    final int n59 = s1;
                                    o2 = new i(0, size3 - 1);
                                    if ($reverseLayout) {
                                        o2 = new tg2.g(((tg2.g)o2).g, 0, -((tg2.g)o2).h);
                                    }
                                    final int f3 = ((tg2.g)o2).f;
                                    final int g3 = ((tg2.g)o2).g;
                                    final int h2 = ((tg2.g)o2).h;
                                    while (true) {
                                        Label_2474: {
                                            if (h2 <= 0) {
                                                break Label_2474;
                                            }
                                            int n60 = f3;
                                            int n61 = n59;
                                            o2 = list3;
                                            if (f3 > g3) {
                                                break Label_2474;
                                            }
                                            while (true) {
                                                final int n62 = array[n60];
                                                int n63;
                                                if (!$reverseLayout) {
                                                    n63 = n60;
                                                }
                                                else {
                                                    n63 = size3 - n60 - 1;
                                                }
                                                final t t = (t)((ArrayList<q0.w>)o2).get(n63);
                                                int n64 = n62;
                                                if ($reverseLayout) {
                                                    n64 = n56 - n62 - t.n;
                                                }
                                                final int n65 = n61;
                                                list2.add((t)t.a(n64, n65, q2));
                                                n66 = n65;
                                                list3 = (ArrayList<q0.w>)o2;
                                                if (n60 == g3) {
                                                    break Label_2851;
                                                }
                                                n60 += h2;
                                                n61 = n65;
                                            }
                                        }
                                        if (h2 < 0 && g3 <= f3) {
                                            o2 = list3;
                                            final int n61 = n59;
                                            final int n60 = f3;
                                            continue;
                                        }
                                        break;
                                    }
                                    n66 = n59;
                                }
                                else {
                                    final int n67 = s1;
                                    int n68 = 0;
                                    final int size4 = ((List)o2).size();
                                    int n69 = n48;
                                    while (n68 < size4) {
                                        final t t2 = ((List<t>)o2).get(n68);
                                        n69 -= t2.o;
                                        list2.add((t)t2.a(n69, n67, q2));
                                        ++n68;
                                    }
                                    final int size5 = list.size();
                                    final int n70 = 0;
                                    int n71 = n48;
                                    for (int n72 = n70; n72 < size5; ++n72) {
                                        final t t3 = (t)list.get(n72);
                                        list2.add((t)t3.a(n71, n67, q2));
                                        n71 += t3.o;
                                    }
                                    final int size6 = ((List)instance2).size();
                                    int n73 = 0;
                                    int n74 = n71;
                                    while (true) {
                                        n66 = n67;
                                        list3 = (ArrayList<q0.w>)list;
                                        if (n73 >= size6) {
                                            break;
                                        }
                                        final t t4 = ((List<t>)instance2).get(n73);
                                        list2.add((t)t4.a(n74, n67, q2));
                                        n74 += t4.o;
                                        ++n73;
                                    }
                                }
                            }
                            final int n75 = (int)n47;
                            while (true) {
                                for (int size7 = list2.size(), n76 = 0; n76 < size7; ++n76) {
                                    if (((androidx.compose.foundation.lazy.a)list2.get(n76)).l) {
                                        final boolean b6 = true;
                                        ArrayList<q0.w> list4;
                                        List<E> list5;
                                        int n77;
                                        u u2;
                                        if (!b6) {
                                            ((LazyListItemPlacementAnimator)o).c.clear();
                                            ((LazyListItemPlacementAnimator)o).d = c.u4();
                                            ((LazyListItemPlacementAnimator)o).e = -1;
                                            ((LazyListItemPlacementAnimator)o).f = 0;
                                            ((LazyListItemPlacementAnimator)o).g = -1;
                                            ((LazyListItemPlacementAnimator)o).h = 0;
                                            list4 = list3;
                                            list5 = list2;
                                            n77 = n66;
                                            u2 = u;
                                        }
                                        else {
                                            final boolean b7 = ((LazyListItemPlacementAnimator)o).b;
                                            int n78;
                                            if (b7) {
                                                n78 = q2;
                                            }
                                            else {
                                                n78 = n66;
                                            }
                                            int n79 = n75;
                                            if ($reverseLayout) {
                                                n79 = -n75;
                                            }
                                            int n80;
                                            if (b7) {
                                                n80 = 0;
                                            }
                                            else {
                                                n80 = n79;
                                            }
                                            if (!b7) {
                                                n79 = 0;
                                            }
                                            final long g4 = xd.a.g(n80, n79);
                                            final androidx.compose.foundation.lazy.a a7 = (androidx.compose.foundation.lazy.a)CollectionsKt___CollectionsKt.S4((List)list2);
                                            final androidx.compose.foundation.lazy.a a8 = (androidx.compose.foundation.lazy.a)CollectionsKt___CollectionsKt.c5((List)list2);
                                            final int size8 = list2.size();
                                            int n81 = 0;
                                            for (int n82 = 0; n82 < size8; ++n82) {
                                                o2 = list2.get(n82);
                                                final q0.d d = ((LazyListItemPlacementAnimator)o).c.get(((androidx.compose.foundation.lazy.a)o2).c);
                                                n81 += ((androidx.compose.foundation.lazy.a)o2).e;
                                            }
                                            list4 = list3;
                                            final int n83 = n81 / list2.size();
                                            ((LazyListItemPlacementAnimator)o).i.clear();
                                            final int size9 = list2.size();
                                            int n84 = 0;
                                            o2 = o;
                                            final int n85 = n9;
                                            final int n86 = n66;
                                            list5 = list2;
                                            while (n84 < size9) {
                                                final androidx.compose.foundation.lazy.a a9 = (androidx.compose.foundation.lazy.a)((ArrayList)list5).get(n84);
                                                ((LazyListItemPlacementAnimator)o2).i.add(a9.c);
                                                final q0.d d2 = ((LazyListItemPlacementAnimator)o2).c.get(a9.c);
                                                int n90;
                                                if (d2 == null) {
                                                    if (a9.l) {
                                                        final q0.d d3 = new q0.d();
                                                        final Integer n87 = ((LazyListItemPlacementAnimator)o2).d.get(a9.c);
                                                        final long c = a9.c(0);
                                                        final int b8 = a9.b(0);
                                                        int c2;
                                                        if (n87 == null) {
                                                            c2 = ((LazyListItemPlacementAnimator)o2).c(c);
                                                        }
                                                        else {
                                                            int c3;
                                                            if (!$reverseLayout) {
                                                                c3 = ((LazyListItemPlacementAnimator)o2).c(c);
                                                            }
                                                            else {
                                                                c3 = ((LazyListItemPlacementAnimator)o2).c(c) - a9.e + b8;
                                                            }
                                                            final int a10 = ((LazyListItemPlacementAnimator)o).a((int)n87, a9.e, n83, g4, $reverseLayout, n78, c3, (ArrayList)list5);
                                                            int n88;
                                                            if ($reverseLayout) {
                                                                n88 = a9.d - b8;
                                                            }
                                                            else {
                                                                n88 = 0;
                                                            }
                                                            c2 = n88 + a10;
                                                        }
                                                        if (((LazyListItemPlacementAnimator)o2).b) {
                                                            n = u2.g.a(0, c2, c, 1);
                                                        }
                                                        else {
                                                            n = u2.g.a(c2, 0, c, 2);
                                                        }
                                                        for (int size10 = a9.i.size(), n89 = 0; n89 < size10; ++n89, o2 = o) {
                                                            final long c4 = a9.c(n89);
                                                            final long g5 = xd.a.g((int)(c4 >> 32) - (int)(c >> 32), u2.g.c(c4) - u2.g.c(c));
                                                            o2 = d3.b;
                                                            ((ArrayList<q0.w>)o2).add(new q0.w(a9.b(n89), xd.a.g((int)(n >> 32) + (int)(g5 >> 32), u2.g.c(g5) + u2.g.c(n))));
                                                            o2 = cg2.j.a;
                                                        }
                                                        n90 = q2;
                                                        ((LazyListItemPlacementAnimator)o2).c.put(a9.c, d3);
                                                        ((LazyListItemPlacementAnimator)o2).d(a9, d3);
                                                    }
                                                    else {
                                                        n90 = q2;
                                                    }
                                                }
                                                else {
                                                    n90 = q2;
                                                    if (a9.l) {
                                                        n = d2.a;
                                                        d2.a = xd.a.g((int)(n >> 32) + (int)(g4 >> 32), u2.g.c(g4) + u2.g.c(n));
                                                        ((LazyListItemPlacementAnimator)o2).d(a9, d2);
                                                    }
                                                    else {
                                                        ((LazyListItemPlacementAnimator)o2).c.remove(a9.c);
                                                    }
                                                }
                                                ++n84;
                                                q2 = n90;
                                            }
                                            final int n91 = n86;
                                            u2 = u;
                                            if (!$reverseLayout) {
                                                ((LazyListItemPlacementAnimator)o2).e = a7.b;
                                                ((LazyListItemPlacementAnimator)o2).f = a7.a;
                                                ((LazyListItemPlacementAnimator)o2).g = a8.b;
                                                ((LazyListItemPlacementAnimator)o2).h = a8.a + a8.e - n78;
                                            }
                                            else {
                                                ((LazyListItemPlacementAnimator)o2).e = a8.b;
                                                ((LazyListItemPlacementAnimator)o2).f = n78 - a8.a - a8.d;
                                                ((LazyListItemPlacementAnimator)o2).g = a7.b;
                                                ((LazyListItemPlacementAnimator)o2).h = a7.e - a7.d + -a7.a;
                                            }
                                            Iterator iterator = ((LazyListItemPlacementAnimator)o2).c.entrySet().iterator();
                                            n = g4;
                                        Label_3853:
                                            while (iterator.hasNext()) {
                                                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
                                                if (!((LazyListItemPlacementAnimator)o2).i.contains(entry.getKey())) {
                                                    final q0.d d4 = (q0.d)entry.getValue();
                                                    final long a11 = d4.a;
                                                    d4.a = xd.a.g((int)(a11 >> 32) + (int)(n >> 32), u2.g.c(n) + u2.g.c(a11));
                                                    final Integer n92 = u2.a.d().get(entry.getKey());
                                                    final ArrayList b9 = d4.b;
                                                    final int size11 = b9.size();
                                                    int n93 = 0;
                                                    final List<E> list6 = list5;
                                                    final Iterator iterator2 = iterator;
                                                    while (true) {
                                                        while (n93 < size11) {
                                                            final q0.w w5 = (q0.w)b9.get(n93);
                                                            final long c5 = w5.c;
                                                            final long a12 = d4.a;
                                                            final long g6 = xd.a.g((int)(c5 >> 32) + (int)(a12 >> 32), u2.g.c(a12) + u2.g.c(c5));
                                                            if (((LazyListItemPlacementAnimator)o2).c(g6) + w5.a > 0 && ((LazyListItemPlacementAnimator)o2).c(g6) < n78) {
                                                                final boolean b10 = true;
                                                                final ArrayList b11 = d4.b;
                                                                while (true) {
                                                                    for (int size12 = b11.size(), n94 = 0; n94 < size12; ++n94) {
                                                                        if (((SnapshotMutableStateImpl)((q0.w)b11.get(n94)).d).getValue()) {
                                                                            final int n95 = 1;
                                                                            if ((b10 || (n95 ^ 0x1) == 0x0) && n92 != null && !d4.b.isEmpty()) {
                                                                                final t a13 = u2.a((int)n92);
                                                                                int a14 = ((LazyListItemPlacementAnimator)o).a((int)n92, a13.o, n83, n, $reverseLayout, n78, n78, (ArrayList)list6);
                                                                                if ($reverseLayout) {
                                                                                    a14 = n78 - a14 - a13.n;
                                                                                }
                                                                                final androidx.compose.foundation.lazy.a a15 = a13.a(a14, n91, q2);
                                                                                ((ArrayList<androidx.compose.foundation.lazy.a>)list6).add(a15);
                                                                                ((LazyListItemPlacementAnimator)o2).d(a15, d4);
                                                                            }
                                                                            else {
                                                                                iterator2.remove();
                                                                            }
                                                                            iterator = iterator2;
                                                                            list5 = list6;
                                                                            continue Label_3853;
                                                                        }
                                                                    }
                                                                    final int n95 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                            ++n93;
                                                        }
                                                        final boolean b10 = false;
                                                        continue;
                                                    }
                                                }
                                            }
                                            ((LazyListItemPlacementAnimator)o2).d = u2.a.d();
                                            n9 = n85;
                                            n77 = n91;
                                        }
                                        Object a19;
                                        if (b.isEmpty() ^ true) {
                                            final int b12 = ((androidx.compose.foundation.lazy.a)CollectionsKt___CollectionsKt.S4((List)list5)).b;
                                            final int size13 = b.size();
                                            int intValue = -1;
                                            int intValue2 = -1;
                                            int n96 = 0;
                                            while (n96 < size13 && ((Number)b.get(n96)).intValue() <= b12) {
                                                intValue = ((Number)b.get(n96)).intValue();
                                                Object o5;
                                                if (++n96 >= 0 && n96 <= d.R2((List)b)) {
                                                    o5 = b.get(n96);
                                                }
                                                else {
                                                    o5 = -1;
                                                }
                                                intValue2 = ((Number)o5).intValue();
                                            }
                                            final int size14 = ((ArrayList)list5).size();
                                            int n97 = -1;
                                            int n98 = 0;
                                            int n99 = Integer.MIN_VALUE;
                                            int a16 = Integer.MIN_VALUE;
                                            while (n98 < size14) {
                                                final androidx.compose.foundation.lazy.a a17 = (androidx.compose.foundation.lazy.a)((ArrayList)list5).get(n98);
                                                final int b13 = a17.b;
                                                int a18;
                                                int n100;
                                                if (b13 == intValue) {
                                                    a18 = a17.a;
                                                    n100 = n98;
                                                }
                                                else {
                                                    n100 = n97;
                                                    a18 = n99;
                                                    if (b13 == intValue2) {
                                                        a16 = a17.a;
                                                        a18 = n99;
                                                        n100 = n97;
                                                    }
                                                }
                                                ++n98;
                                                n97 = n100;
                                                n99 = a18;
                                            }
                                            if (intValue == -1) {
                                                a19 = null;
                                            }
                                            else {
                                                final t a20 = u2.a(intValue);
                                                int max;
                                                if (n99 != Integer.MIN_VALUE) {
                                                    max = Math.max(n17, n99);
                                                }
                                                else {
                                                    max = n17;
                                                }
                                                int min2 = max;
                                                if (a16 != Integer.MIN_VALUE) {
                                                    min2 = Math.min(max, a16 - a20.n);
                                                }
                                                a19 = a20.a(min2, n77, q2);
                                                if (n97 != -1) {
                                                    ((ArrayList)list5).set(n97, a19);
                                                }
                                                else {
                                                    ((ArrayList)list5).add(0, a19);
                                                }
                                            }
                                        }
                                        else {
                                            a19 = null;
                                        }
                                        final boolean b14 = n46 > n9;
                                        o2 = ((q)q).invoke((Object)n77, (Object)q2, (Object)new LazyListMeasureKt$measureLazyList$3((List<androidx.compose.foundation.lazy.a>)list5, (androidx.compose.foundation.lazy.a)a19));
                                        if (!b4) {
                                            o = new ArrayList(((ArrayList)list5).size());
                                            for (int size15 = ((ArrayList)list5).size(), n101 = 0; n101 < size15; ++n101) {
                                                final Object value3 = ((ArrayList)list5).get(n101);
                                                final androidx.compose.foundation.lazy.a a21 = (androidx.compose.foundation.lazy.a)value3;
                                                if ((a21.b >= ((t)CollectionsKt___CollectionsKt.S4((List)list4)).a && a21.b <= ((t)CollectionsKt___CollectionsKt.c5((List)list4)).a) || a21 == a19) {
                                                    ((ArrayList<t>)o).add((t)value3);
                                                }
                                            }
                                            list5 = (List<E>)o;
                                        }
                                        Orientation orientation3;
                                        if ($isVertical4) {
                                            orientation3 = Orientation.Vertical;
                                        }
                                        else {
                                            orientation3 = Orientation.Horizontal;
                                        }
                                        value2 = new q0.p((t)j, n49, b14, n47, (w)o2, list5, n17, n25, m, orientation3);
                                        break Label_0911;
                                    }
                                }
                                final boolean b6 = false;
                                continue;
                            }
                        }
                    }
                    final boolean b15 = false;
                    o2 = this.$state;
                    o = this.$overscrollEffect;
                    o2.getClass();
                    final s a22 = ((LazyListState)o2).a;
                    a22.getClass();
                    final t a23 = value2.a;
                    Object d5;
                    if (a23 != null) {
                        d5 = a23.m;
                    }
                    else {
                        d5 = null;
                    }
                    a22.d = d5;
                    final int b16;
                    Label_5133: {
                        if (!a22.c && value2.h <= 0) {
                            break Label_5133;
                        }
                        a22.c = true;
                        b16 = value2.b;
                        if (b16 < 0.0f) {
                            throw new IllegalStateException(m5.a.d("scrollOffset should be non-negative (", b16, ')').toString());
                        }
                        d5 = f$a.a();
                        try {
                            final Object j = ((f)d5).i();
                            try {
                                final t a24 = value2.a;
                                int a25;
                                if (a24 != null) {
                                    a25 = a24.a;
                                }
                                else {
                                    a25 = 0;
                                }
                                a22.a(a25, b16);
                                final j a26 = cg2.j.a;
                                i1.f.o((f)j);
                                ((f)d5).c();
                                ((LazyListState)o2).e -= value2.d;
                                ((SnapshotMutableStateImpl)((LazyListState)o2).c).setValue((Object)value2);
                                ((LazyListState)o2).r = value2.c;
                                d5 = value2.a;
                                int a27;
                                if (d5 != null) {
                                    a27 = ((t)d5).a;
                                }
                                else {
                                    a27 = 0;
                                }
                                ((LazyListState)o2).q = (a27 != 0 || value2.b != 0);
                                if (((LazyListState)o2).i != -1 && (value2.e.isEmpty() ^ true)) {
                                    int n102;
                                    if (((LazyListState)o2).k) {
                                        n102 = ((k)CollectionsKt___CollectionsKt.c5((List)value2.e)).getIndex() + 1;
                                    }
                                    else {
                                        n102 = ((k)CollectionsKt___CollectionsKt.S4((List)value2.e)).getIndex() - 1;
                                    }
                                    if (((LazyListState)o2).i != n102) {
                                        ((LazyListState)o2).i = -1;
                                        d5 = ((LazyListState)o2).j;
                                        if (d5 != null) {
                                            ((s0.i.a)d5).cancel();
                                        }
                                        ((LazyListState)o2).j = null;
                                    }
                                }
                                final boolean c6 = value2.c;
                                d5 = value2.a;
                                int a28;
                                if (d5 != null) {
                                    a28 = ((t)d5).a;
                                }
                                else {
                                    a28 = 0;
                                }
                                final boolean b17 = a28 != 0 || value2.b != 0;
                                boolean enabled = false;
                                Label_5408: {
                                    if (!c6) {
                                        enabled = b15;
                                        if (!b17) {
                                            break Label_5408;
                                        }
                                    }
                                    enabled = true;
                                }
                                ((r)o).setEnabled(enabled);
                                return value2;
                            }
                            finally {
                                i1.f.o((f)j);
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
                try {
                    i1.f.o((f)o2);
                }
                finally {}
            }
        }
        finally {}
        ((f)o).c();
    }
}
