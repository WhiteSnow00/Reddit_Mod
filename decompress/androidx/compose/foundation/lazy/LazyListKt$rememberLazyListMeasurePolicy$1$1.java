// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.Iterator;
import q0.v;
import gh2.i;
import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.List;
import q0.s;
import kotlin.collections.EmptyList;
import java.util.Map;
import kotlin.collections.c;
import c2.e0;
import pg2.j;
import i1.f$a;
import q0.t;
import u2.d;
import mj2.c0;
import androidx.compose.foundation.gestures.Orientation;
import j1.a$c;
import m0.q;
import q0.l;
import j1.a$b;
import p0.z;
import q0.g;
import kotlin.Metadata;
import q0.n;
import u2.a;
import s0.f;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements p<f, a, n>
{
    public final /* synthetic */ g $beyondBoundsInfo;
    public final /* synthetic */ z $contentPadding;
    public final /* synthetic */ a$b $horizontalAlignment;
    public final /* synthetic */ androidx.compose.foundation.layout.a.d $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ l $itemProvider;
    public final /* synthetic */ q $overscrollEffect;
    public final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ a$c $verticalAlignment;
    public final /* synthetic */ androidx.compose.foundation.layout.a.k $verticalArrangement;
    
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(final boolean $isVertical, final z $contentPadding, final boolean $reverseLayout, final LazyListState $state, final l $itemProvider, final androidx.compose.foundation.layout.a.k $verticalArrangement, final androidx.compose.foundation.layout.a.d $horizontalArrangement, final LazyListItemPlacementAnimator $placementAnimator, final g $beyondBoundsInfo, final a$b $horizontalAlignment, final a$c $verticalAlignment, final q $overscrollEffect) {
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
        int s2 = value.s0(this.$contentPadding.a());
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
            s2 = s0;
        }
        else if (!$isVertical || !this.$reverseLayout) {
            if (!$isVertical && !this.$reverseLayout) {
                s2 = n2;
            }
            else {
                s2 = n3;
            }
        }
        final int n7 = n6 - s2;
        final long m = c0.M(-n5, -n4, n);
        this.$state.k(this.$itemProvider);
        final LazyListState $state = this.$state;
        $state.getClass();
        ((SnapshotMutableStateImpl<f>)$state.e).setValue(value);
        ((SnapshotMutableStateImpl<d>)this.$itemProvider.e().a).setValue(new d(value.q(a.h(m))));
        ((SnapshotMutableStateImpl<d>)this.$itemProvider.e().b).setValue(new d(value.q(a.g(m))));
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
        final int k0 = this.$itemProvider.K0();
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
            int n10 = s0;
            if ($isVertical2) {
                n10 = s0 + n9;
            }
            n11 = at1.a.h(n2, n10);
        }
        else {
            n11 = at1.a.h(n2, s0);
        }
        final boolean $isVertical3 = this.$isVertical;
        final t t = new t(m, $isVertical3, this.$itemProvider, value, new LazyListKt$rememberLazyListMeasurePolicy$1$1$a(k0, s3, value, $isVertical3, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, s2, n7, this.$placementAnimator, n11));
        ((SnapshotMutableStateImpl<a>)this.$state.o).setValue(new a(t.d));
        final LazyListState $state2 = this.$state;
        Object d = f$a.a();
        try {
            Object o = ((i1.f)d).i();
            try {
                final int f = $state2.f();
                int g = $state2.g();
                final j a = j.a;
                i1.f.o((i1.f)o);
                ((i1.f)d).c();
                final float d2 = this.$state.d;
                final boolean $isVertical4 = this.$isVertical;
                d = this.$itemProvider.b();
                final androidx.compose.foundation.layout.a.k $verticalArrangement2 = this.$verticalArrangement;
                final androidx.compose.foundation.layout.a.d $horizontalArrangement2 = this.$horizontalArrangement;
                final boolean $reverseLayout = this.$reverseLayout;
                final LazyListItemPlacementAnimator $placementAnimator = this.$placementAnimator;
                final g $beyondBoundsInfo = this.$beyondBoundsInfo;
                Object o2 = new zg2.q<Integer, Integer, zg2.l<? super e0.a, ? extends j>, c2.t>() {
                    public final c2.t invoke(int x, final int n, final zg2.l<? super e0.a, j> l) {
                        ah2.f.f((Object)l, "placement");
                        final f $this_null = value;
                        x = c0.x(x + n5, n);
                        return $this_null.Q(x, c0.w(n + n4, n), c.N1(), l);
                    }
                };
                ah2.f.f(d, "headerIndexes");
                ah2.f.f((Object)$placementAnimator, "placementAnimator");
                ah2.f.f((Object)$beyondBoundsInfo, "beyondBoundsInfo");
                final int n12 = 0;
                if (s2 < 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (n7 >= 0) {
                    n value2 = null;
                    Label_4936: {
                        if (k0 <= 0) {
                            o = ((zg2.q)o2).invoke((Object)u2.a.j(m), (Object)u2.a.i(m), (Object)LazyListMeasureKt$measureLazyList$1.INSTANCE);
                            d = EmptyList.INSTANCE;
                            final int n13 = -s2;
                            Orientation orientation2;
                            if ($isVertical4) {
                                orientation2 = Orientation.Vertical;
                            }
                            else {
                                orientation2 = Orientation.Horizontal;
                            }
                            value2 = new n(null, 0, false, 0.0f, (c2.t)o, (List)d, n13, n9 + n7, 0, orientation2);
                        }
                        else {
                            int n14;
                            if ((n14 = f) >= k0) {
                                n14 = k0 - 1;
                                g = 0;
                            }
                            final int d3 = at1.a.D1(d2);
                            final int n15 = g - d3;
                            final boolean b = n14 == 0;
                            int n16 = d3;
                            int n17 = n15;
                            if (b) {
                                n16 = d3;
                                if ((n17 = n15) < 0) {
                                    n16 = d3 + n15;
                                    n17 = 0;
                                }
                            }
                            o = new ArrayList<androidx.compose.foundation.lazy.a>();
                            final int n18 = -s2;
                            int n19 = n17 - s2;
                            int max = n12;
                            while (n19 < 0 && n14 + 0 > 0) {
                                --n14;
                                final s a2 = t.a(n14);
                                ((ArrayList<androidx.compose.foundation.lazy.a>)o).add(0, (androidx.compose.foundation.lazy.a)a2);
                                max = Math.max(max, a2.p);
                                n19 += a2.o;
                            }
                            int n20 = n16;
                            int n21;
                            if ((n21 = n19) < n18) {
                                n20 = n16 + n19;
                                n21 = n18;
                            }
                            int n22 = n21 + s2;
                            final int n23 = n9 + n7;
                            int n24;
                            if (n23 < 0) {
                                n24 = 0;
                            }
                            else {
                                n24 = n23;
                            }
                            int n25 = -n22;
                            final int size = ((ArrayList)o).size();
                            int n26 = n14;
                            for (int i = 0; i < size; ++i) {
                                final s s4 = (s)((ArrayList<androidx.compose.foundation.lazy.a>)o).get(i);
                                ++n26;
                                n25 += s4.o;
                            }
                            int n27 = n14;
                            int n28 = n26;
                            final int n29 = n18;
                            int n30 = max;
                            while ((n25 <= n24 || ((ArrayList)o).isEmpty()) && n28 < k0) {
                                final s a3 = t.a(n28);
                                final int o3 = a3.o;
                                n25 += o3;
                                if (n25 <= n29 && n28 != k0 - 1) {
                                    n22 -= o3;
                                    n27 = n28 + 1;
                                }
                                else {
                                    n30 = Math.max(n30, a3.p);
                                    ((ArrayList<androidx.compose.foundation.lazy.a>)o).add((androidx.compose.foundation.lazy.a)a3);
                                }
                                ++n28;
                            }
                            final List list = (List)d;
                            int n31 = n30;
                            int n32 = n20;
                            int n33 = n25;
                            int n34 = n22;
                            if (n25 < n9) {
                                final int n35 = n9 - n25;
                                final int n36 = n22 - n35;
                                final int n37 = n25 + n35;
                                int n38;
                                int n39;
                                for (n38 = n27, n39 = n36; n39 < s2 && n38 + 0 > 0; n39 += ((s)d).o) {
                                    --n38;
                                    d = t.a(n38);
                                    ((ArrayList<androidx.compose.foundation.lazy.a>)o).add(0, (androidx.compose.foundation.lazy.a)d);
                                    n30 = Math.max(n30, ((s)d).p);
                                }
                                final int n40 = n20 + n35;
                                n31 = n30;
                                n32 = n40;
                                n33 = n37;
                                if ((n34 = n39) < 0) {
                                    n32 = n40 + n39;
                                    n33 = n37 + n39;
                                    n34 = 0;
                                    n31 = n30;
                                }
                            }
                            float n41 = d2;
                            if (at1.a.J0(at1.a.D1(d2)) == at1.a.J0(n32)) {
                                n41 = d2;
                                if (Math.abs(at1.a.D1(d2)) >= Math.abs(n32)) {
                                    n41 = (float)n32;
                                }
                            }
                            final int n42 = -n34;
                            s s5;
                            d = (s5 = (s)CollectionsKt___CollectionsKt.p1((List)o));
                            int n43 = n34;
                            if (s2 > 0) {
                                final int size2 = ((ArrayList)o).size();
                                int n44 = 0;
                                while (true) {
                                    s5 = (s)d;
                                    n43 = n34;
                                    if (n44 >= size2) {
                                        break;
                                    }
                                    final int o4 = ((s)((ArrayList<androidx.compose.foundation.lazy.a>)o).get(n44)).o;
                                    s5 = (s)d;
                                    if ((n43 = n34) == 0) {
                                        break;
                                    }
                                    s5 = (s)d;
                                    if (o4 > (n43 = n34)) {
                                        break;
                                    }
                                    s5 = (s)d;
                                    n43 = n34;
                                    if (n44 == ah2.c.L((List)o)) {
                                        break;
                                    }
                                    n34 -= o4;
                                    ++n44;
                                    d = ((ArrayList<androidx.compose.foundation.lazy.a>)o).get(n44);
                                }
                            }
                            Label_1824: {
                                if ($beyondBoundsInfo.a.k()) {
                                    final int a4 = ((s)CollectionsKt___CollectionsKt.p1((List)o)).a;
                                    final int b2 = $beyondBoundsInfo.b();
                                    final int n45 = k0 - 1;
                                    if (a4 > Math.min(b2, n45)) {
                                        d = new ArrayList<androidx.compose.foundation.lazy.a>();
                                        int n46 = ((s)CollectionsKt___CollectionsKt.p1((List)o)).a - 1;
                                        final int min = Math.min($beyondBoundsInfo.b(), n45);
                                        if (min <= n46) {
                                            while (true) {
                                                ((ArrayList<androidx.compose.foundation.lazy.a>)d).add((androidx.compose.foundation.lazy.a)t.a(n46));
                                                if (n46 == min) {
                                                    break;
                                                }
                                                --n46;
                                            }
                                        }
                                        final j a5 = j.a;
                                        break Label_1824;
                                    }
                                }
                                d = EmptyList.INSTANCE;
                            }
                            Object instance = null;
                            Label_1946: {
                                if ($beyondBoundsInfo.a.k()) {
                                    final int a6 = ((s)CollectionsKt___CollectionsKt.A1((List)o)).a;
                                    final int a7 = $beyondBoundsInfo.a();
                                    final int n47 = k0 - 1;
                                    if (a6 < Math.min(a7, n47)) {
                                        instance = new ArrayList<s>();
                                        int j = ((s)CollectionsKt___CollectionsKt.A1((List)o)).a;
                                        while (j < Math.min($beyondBoundsInfo.a(), n47)) {
                                            ++j;
                                            ((ArrayList<s>)instance).add(t.a(j));
                                        }
                                        final j a8 = pg2.j.a;
                                        break Label_1946;
                                    }
                                }
                                instance = EmptyList.INSTANCE;
                            }
                            final boolean b3 = ah2.f.a((Object)s5, CollectionsKt___CollectionsKt.p1((List)o)) && ((List)d).isEmpty() && ((List)instance).isEmpty();
                            int n48;
                            if ($isVertical4) {
                                n48 = n31;
                            }
                            else {
                                n48 = n33;
                            }
                            final int x = c0.x(n48, m);
                            int n49;
                            if ($isVertical4) {
                                n49 = n33;
                            }
                            else {
                                n49 = n31;
                            }
                            int w = c0.w(n49, m);
                            int n50;
                            if ($isVertical4) {
                                n50 = w;
                            }
                            else {
                                n50 = x;
                            }
                            final boolean b4 = n33 < Math.min(n50, n9);
                            if (b4 && n42 != 0) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            final ArrayList list2 = new ArrayList<androidx.compose.foundation.lazy.a>(((List)instance).size() + (((List)d).size() + ((ArrayList)o).size()));
                            ArrayList<androidx.compose.foundation.lazy.a> list3 = null;
                            int n60 = 0;
                            Label_2818: {
                                if (b4) {
                                    if (!((List)d).isEmpty() || !((List)instance).isEmpty()) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    final int size3 = ((ArrayList)o).size();
                                    d = new int[size3];
                                    for (int l = 0; l < size3; ++l) {
                                        int n51;
                                        if (!$reverseLayout) {
                                            n51 = l;
                                        }
                                        else {
                                            n51 = size3 - l - 1;
                                        }
                                        d[l] = ((s)((ArrayList)o).get(n51)).n;
                                    }
                                    final int[] array = new int[size3];
                                    for (int n52 = 0; n52 < size3; ++n52) {
                                        array[n52] = 0;
                                    }
                                    if ($isVertical4) {
                                        if ($verticalArrangement2 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        $verticalArrangement2.b(value, n50, (int[])d, array);
                                    }
                                    else {
                                        if ($horizontalArrangement2 == null) {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                        $horizontalArrangement2.c(n50, (int[])d, LayoutDirection.Ltr, value, array);
                                    }
                                    final int n53 = x;
                                    list3 = (ArrayList<androidx.compose.foundation.lazy.a>)o;
                                    d = new i(0, size3 - 1);
                                    if ($reverseLayout) {
                                        d = new gh2.g(((gh2.g)d).g, 0, -((gh2.g)d).h);
                                    }
                                    final int f2 = ((gh2.g)d).f;
                                    final int g2 = ((gh2.g)d).g;
                                    final int h = ((gh2.g)d).h;
                                    while (true) {
                                        Label_2445: {
                                            if (h <= 0) {
                                                break Label_2445;
                                            }
                                            int n54 = f2;
                                            d = list3;
                                            int n55 = n53;
                                            if (f2 > g2) {
                                                break Label_2445;
                                            }
                                            while (true) {
                                                final int n56 = array[n54];
                                                int n57;
                                                if (!$reverseLayout) {
                                                    n57 = n54;
                                                }
                                                else {
                                                    n57 = size3 - n54 - 1;
                                                }
                                                final s s6 = (s)((ArrayList<androidx.compose.foundation.lazy.a>)d).get(n57);
                                                int n58 = n56;
                                                if ($reverseLayout) {
                                                    n58 = n50 - n56 - s6.n;
                                                }
                                                final int n59 = n55;
                                                list2.add(s6.a(n58, n59, w));
                                                n60 = n59;
                                                list3 = (ArrayList<androidx.compose.foundation.lazy.a>)d;
                                                if (n54 == g2) {
                                                    break Label_2818;
                                                }
                                                n54 += h;
                                                n55 = n59;
                                            }
                                        }
                                        if (h < 0 && g2 <= f2) {
                                            final int n55 = n53;
                                            d = list3;
                                            final int n54 = f2;
                                            continue;
                                        }
                                        break;
                                    }
                                    n60 = n53;
                                }
                                else {
                                    final int n61 = x;
                                    final int size4 = ((List)d).size();
                                    int n62 = n42;
                                    for (int n63 = 0; n63 < size4; ++n63) {
                                        final s s7 = ((List<s>)d).get(n63);
                                        n62 -= s7.o;
                                        list2.add(s7.a(n62, n61, w));
                                    }
                                    final int size5 = ((ArrayList)o).size();
                                    int n64 = n42;
                                    for (int n65 = 0; n65 < size5; ++n65) {
                                        final s s8 = (s)((ArrayList)o).get(n65);
                                        list2.add(s8.a(n64, n61, w));
                                        n64 += s8.o;
                                    }
                                    final int size6 = ((List)instance).size();
                                    int n66 = 0;
                                    int n67 = n64;
                                    while (true) {
                                        n60 = n61;
                                        list3 = (ArrayList<androidx.compose.foundation.lazy.a>)o;
                                        if (n66 >= size6) {
                                            break;
                                        }
                                        final s s9 = ((List<s>)instance).get(n66);
                                        list2.add(s9.a(n67, n61, w));
                                        n67 += s9.o;
                                        ++n66;
                                    }
                                }
                            }
                            int n68 = 0;
                            androidx.compose.foundation.lazy.a a12 = null;
                            androidx.compose.foundation.lazy.a a13 = null;
                            Label_3196: {
                                if (list.isEmpty() ^ true) {
                                    final int b5 = ((androidx.compose.foundation.lazy.a)CollectionsKt___CollectionsKt.p1((List)list2)).b;
                                    final int size7 = list.size();
                                    int intValue = -1;
                                    int intValue2 = -1;
                                    int n69 = 0;
                                    while (n69 < size7 && ((Number)list.get(n69)).intValue() <= b5) {
                                        intValue2 = ((Number)list.get(n69)).intValue();
                                        if (++n69 >= 0 && n69 <= ah2.c.L(list)) {
                                            d = list.get(n69);
                                        }
                                        else {
                                            d = -1;
                                        }
                                        intValue = ((Number)d).intValue();
                                    }
                                    final int size8 = list2.size();
                                    int a9 = Integer.MIN_VALUE;
                                    int n70 = Integer.MIN_VALUE;
                                    int n71 = -1;
                                    while (n68 < size8) {
                                        d = list2.get(n68);
                                        final int b6 = ((androidx.compose.foundation.lazy.a)d).b;
                                        int a10;
                                        int n72;
                                        if (b6 == intValue2) {
                                            a10 = ((androidx.compose.foundation.lazy.a)d).a;
                                            n72 = n68;
                                        }
                                        else {
                                            n72 = n71;
                                            a10 = n70;
                                            if (b6 == intValue) {
                                                a9 = ((androidx.compose.foundation.lazy.a)d).a;
                                                a10 = n70;
                                                n72 = n71;
                                            }
                                        }
                                        ++n68;
                                        n71 = n72;
                                        n70 = a10;
                                    }
                                    d = list3;
                                    if (intValue2 != -1) {
                                        final s a11 = t.a(intValue2);
                                        int max2;
                                        if (n70 != Integer.MIN_VALUE) {
                                            max2 = Math.max(n29, n70);
                                        }
                                        else {
                                            max2 = n29;
                                        }
                                        int min2 = max2;
                                        if (a9 != Integer.MIN_VALUE) {
                                            min2 = Math.min(max2, a9 - a11.n);
                                        }
                                        a12 = a11.a(min2, n60, w);
                                        if (n71 != -1) {
                                            list2.set(n71, a12);
                                            a13 = (androidx.compose.foundation.lazy.a)d;
                                            break Label_3196;
                                        }
                                        list2.add(0, a12);
                                        a13 = (androidx.compose.foundation.lazy.a)d;
                                        break Label_3196;
                                    }
                                }
                                else {
                                    d = list3;
                                }
                                a12 = null;
                                a13 = (androidx.compose.foundation.lazy.a)d;
                            }
                            final int n73 = n29;
                            final int n74 = (int)n41;
                            while (true) {
                                for (int size9 = list2.size(), n75 = 0; n75 < size9; ++n75) {
                                    if (list2.get(n75).l) {
                                        final boolean b7 = true;
                                        ArrayList<androidx.compose.foundation.lazy.a> list4;
                                        boolean b8;
                                        int n76;
                                        int n77;
                                        if (!b7) {
                                            $placementAnimator.c.clear();
                                            $placementAnimator.d = c.N1();
                                            $placementAnimator.e = -1;
                                            $placementAnimator.f = 0;
                                            $placementAnimator.g = -1;
                                            $placementAnimator.h = 0;
                                            o = a12;
                                            list4 = (ArrayList<androidx.compose.foundation.lazy.a>)list2;
                                            b8 = b3;
                                            n76 = n33;
                                            n77 = n73;
                                        }
                                        else {
                                            final boolean b9 = $placementAnimator.b;
                                            int n78;
                                            if (b9) {
                                                n78 = w;
                                            }
                                            else {
                                                n78 = n60;
                                            }
                                            int n79 = n74;
                                            if ($reverseLayout) {
                                                n79 = -n74;
                                            }
                                            int n80;
                                            if (b9) {
                                                n80 = 0;
                                            }
                                            else {
                                                n80 = n79;
                                            }
                                            if (!b9) {
                                                n79 = 0;
                                            }
                                            final long h2 = at1.a.h(n80, n79);
                                            final androidx.compose.foundation.lazy.a a14 = (androidx.compose.foundation.lazy.a)CollectionsKt___CollectionsKt.p1((List)list2);
                                            d = CollectionsKt___CollectionsKt.A1((List)list2);
                                            final int size10 = list2.size();
                                            int n81 = 0;
                                            int n82 = 0;
                                            while (n81 < size10) {
                                                final androidx.compose.foundation.lazy.a a15 = list2.get(n81);
                                                o = $placementAnimator.c.get(a15.c);
                                                n82 += a15.e;
                                                ++n81;
                                            }
                                            n77 = n73;
                                            final int n83 = n82 / list2.size();
                                            $placementAnimator.i.clear();
                                            final int size11 = list2.size();
                                            int n84 = 0;
                                            b8 = b3;
                                            final int n85 = n33;
                                            final int n86 = n78;
                                            final int n87 = size11;
                                            o = a12;
                                            list4 = (ArrayList<androidx.compose.foundation.lazy.a>)list2;
                                            while (n84 < n87) {
                                                final androidx.compose.foundation.lazy.a a16 = list4.get(n84);
                                                $placementAnimator.i.add(a16.c);
                                                final q0.d d4 = $placementAnimator.c.get(a16.c);
                                                int n91;
                                                if (d4 == null) {
                                                    if (a16.l) {
                                                        final q0.d d5 = new q0.d();
                                                        final Integer n88 = $placementAnimator.d.get(a16.c);
                                                        final long c = a16.c(0);
                                                        final int b10 = a16.b(0);
                                                        int c2;
                                                        if (n88 == null) {
                                                            c2 = $placementAnimator.c(c);
                                                        }
                                                        else {
                                                            int c3;
                                                            if (!$reverseLayout) {
                                                                c3 = $placementAnimator.c(c);
                                                            }
                                                            else {
                                                                c3 = $placementAnimator.c(c) - a16.e + b10;
                                                            }
                                                            final int a17 = $placementAnimator.a(n88, a16.e, n83, h2, $reverseLayout, n86, c3, list4);
                                                            int n89;
                                                            if ($reverseLayout) {
                                                                n89 = a16.d - b10;
                                                            }
                                                            else {
                                                                n89 = 0;
                                                            }
                                                            c2 = n89 + a17;
                                                        }
                                                        if ($placementAnimator.b) {
                                                            n = u2.g.a(0, c2, c, 1);
                                                        }
                                                        else {
                                                            n = u2.g.a(c2, 0, c, 2);
                                                        }
                                                        for (int n90 = 0; n90 < a16.i.size(); ++n90) {
                                                            final long c4 = a16.c(n90);
                                                            final long h3 = at1.a.h((int)(c4 >> 32) - (int)(c >> 32), u2.g.b(c4) - u2.g.b(c));
                                                            d5.b.add(new v(a16.b(n90), at1.a.h((int)(n >> 32) + (int)(h3 >> 32), u2.g.b(h3) + u2.g.b(n))));
                                                            final j a18 = j.a;
                                                        }
                                                        n91 = n60;
                                                        $placementAnimator.c.put(a16.c, d5);
                                                        $placementAnimator.d(a16, d5);
                                                    }
                                                    else {
                                                        n91 = n60;
                                                    }
                                                }
                                                else {
                                                    n91 = n60;
                                                    if (a16.l) {
                                                        n = d4.a;
                                                        d4.a = at1.a.h((int)(n >> 32) + (int)(h2 >> 32), u2.g.b(h2) + u2.g.b(n));
                                                        $placementAnimator.d(a16, d4);
                                                    }
                                                    else {
                                                        $placementAnimator.c.remove(a16.c);
                                                    }
                                                }
                                                ++n84;
                                                n60 = n91;
                                            }
                                            if (!$reverseLayout) {
                                                $placementAnimator.e = a14.b;
                                                $placementAnimator.f = a14.a;
                                                $placementAnimator.g = ((androidx.compose.foundation.lazy.a)d).b;
                                                $placementAnimator.h = ((androidx.compose.foundation.lazy.a)d).a + ((androidx.compose.foundation.lazy.a)d).e - n86;
                                            }
                                            else {
                                                $placementAnimator.e = ((androidx.compose.foundation.lazy.a)d).b;
                                                $placementAnimator.f = n86 - ((androidx.compose.foundation.lazy.a)d).a - ((androidx.compose.foundation.lazy.a)d).d;
                                                $placementAnimator.g = a14.b;
                                                $placementAnimator.h = a14.e - a14.d + -a14.a;
                                            }
                                            final Iterator iterator = $placementAnimator.c.entrySet().iterator();
                                            d = t;
                                            final int n92 = w;
                                            while (iterator.hasNext()) {
                                                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
                                                if (!$placementAnimator.i.contains(entry.getKey())) {
                                                    final q0.d d6 = (q0.d)entry.getValue();
                                                    n = d6.a;
                                                    d6.a = at1.a.h((int)(n >> 32) + (int)(h2 >> 32), u2.g.b(h2) + u2.g.b(n));
                                                    final androidx.compose.foundation.lazy.a a19 = (androidx.compose.foundation.lazy.a)d;
                                                    final Integer n93 = ((t)a19).a.d().get(entry.getKey());
                                                    final ArrayList b11 = d6.b;
                                                    while (true) {
                                                        for (int size12 = b11.size(), n94 = 0; n94 < size12; ++n94) {
                                                            final v v = (v)b11.get(n94);
                                                            n = v.c;
                                                            final long a20 = d6.a;
                                                            n = at1.a.h((int)(n >> 32) + (int)(a20 >> 32), u2.g.b(a20) + u2.g.b(n));
                                                            if ($placementAnimator.c(n) + v.a > 0 && $placementAnimator.c(n) < n86) {
                                                                final boolean b12 = true;
                                                                final ArrayList b13 = d6.b;
                                                                final int size13 = b13.size();
                                                                int n95 = 0;
                                                                while (true) {
                                                                    while (n95 < size13) {
                                                                        if (((SnapshotMutableStateImpl<Object>)((v)b13.get(n95)).d).getValue()) {
                                                                            final int n96 = 1;
                                                                            if ((b12 || (n96 ^ 0x1) == 0x0) && n93 != null && !d6.b.isEmpty()) {
                                                                                final s a21 = ((t)a19).a(n93);
                                                                                int a22 = $placementAnimator.a(n93, a21.o, n83, h2, $reverseLayout, n86, n86, list4);
                                                                                if ($reverseLayout) {
                                                                                    a22 = n86 - a22 - a21.n;
                                                                                }
                                                                                final androidx.compose.foundation.lazy.a a23 = a21.a(a22, n60, n92);
                                                                                list4.add(a23);
                                                                                $placementAnimator.d(a23, d6);
                                                                                continue Label_4689;
                                                                            }
                                                                            iterator.remove();
                                                                            continue Label_4689;
                                                                        }
                                                                        else {
                                                                            ++n95;
                                                                        }
                                                                    }
                                                                    final int n96 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                        final boolean b12 = false;
                                                        continue;
                                                    }
                                                }
                                                continue;
                                                Label_4689:;
                                            }
                                            $placementAnimator.d = ((t)d).a.d();
                                            n76 = n85;
                                            w = n92;
                                        }
                                        final boolean b14 = n76 > n9;
                                        final c2.t t2 = (c2.t)((zg2.q)o2).invoke((Object)n60, (Object)w, (Object)new LazyListMeasureKt$measureLazyList$3(list4, (androidx.compose.foundation.lazy.a)o));
                                        if (!b8) {
                                            d = new ArrayList<androidx.compose.foundation.lazy.a>(list4.size());
                                            for (int size14 = list4.size(), n97 = 0; n97 < size14; ++n97) {
                                                o2 = list4.get(n97);
                                                final androidx.compose.foundation.lazy.a a24 = (androidx.compose.foundation.lazy.a)o2;
                                                if ((a24.b >= ((s)CollectionsKt___CollectionsKt.p1((List)a13)).a && a24.b <= ((s)CollectionsKt___CollectionsKt.A1((List)a13)).a) || a24 == o) {
                                                    ((ArrayList<androidx.compose.foundation.lazy.a>)d).add((androidx.compose.foundation.lazy.a)o2);
                                                }
                                            }
                                            list4 = (ArrayList<androidx.compose.foundation.lazy.a>)d;
                                        }
                                        if ($isVertical4) {
                                            d = Orientation.Vertical;
                                        }
                                        else {
                                            d = Orientation.Horizontal;
                                        }
                                        value2 = new n(s5, n43, b14, n41, t2, list4, n77, n23, k0, (Orientation)d);
                                        break Label_4936;
                                    }
                                }
                                final boolean b7 = false;
                                continue;
                            }
                        }
                    }
                    final LazyListState $state3 = this.$state;
                    o = this.$overscrollEffect;
                    $state3.getClass();
                    final q0.q a25 = $state3.a;
                    a25.getClass();
                    d = value2.a;
                    if (d != null) {
                        d = ((s)d).m;
                    }
                    else {
                        d = null;
                    }
                    a25.d = d;
                    final int b15;
                    Label_5113: {
                        if (!a25.c && value2.h <= 0) {
                            break Label_5113;
                        }
                        a25.c = true;
                        b15 = value2.b;
                        if (b15 < 0.0f) {
                            throw new IllegalStateException(a.g("scrollOffset should be non-negative (", b15, ')').toString());
                        }
                        d = f$a.a();
                        try {
                            o2 = ((i1.f)d).i();
                            try {
                                final s a26 = value2.a;
                                int a27;
                                if (a26 != null) {
                                    a27 = a26.a;
                                }
                                else {
                                    a27 = 0;
                                }
                                a25.a(a27, b15);
                                final j a28 = j.a;
                                i1.f.o((i1.f)o2);
                                ((i1.f)d).c();
                                final boolean b16 = true;
                                $state3.d -= value2.d;
                                ((SnapshotMutableStateImpl<n>)$state3.b).setValue(value2);
                                final boolean c5 = value2.c;
                                $state3.q = c5;
                                d = value2.a;
                                int a29;
                                if (d != null) {
                                    a29 = ((s)d).a;
                                }
                                else {
                                    a29 = 0;
                                }
                                $state3.p = (a29 != 0 || value2.b != 0);
                                int a30;
                                if (d != null) {
                                    a30 = ((s)d).a;
                                }
                                else {
                                    a30 = 0;
                                }
                                final boolean b17 = a30 != 0 || value2.b != 0;
                                boolean enabled = b16;
                                if (!c5) {
                                    enabled = (b17 && b16);
                                }
                                ((q)o).setEnabled(enabled);
                                return value2;
                            }
                            finally {
                                i1.f.o((i1.f)o2);
                            }
                        }
                        finally {
                            ((i1.f)d).c();
                        }
                    }
                    throw new IllegalStateException(a.g("scrollOffset should be non-negative (", b15, ')').toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            finally {
                try {
                    i1.f.o((i1.f)o);
                }
                finally {}
            }
        }
        finally {}
        ((i1.f)d).c();
    }
}
