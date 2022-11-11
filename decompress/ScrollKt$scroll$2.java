// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import ej2.b0;
import m0.p;
import n0.k;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.foundation.gestures.Orientation;
import hg2.j;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import z0.l;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import ml0.a;
import sg2.e;
import kotlin.Metadata;
import j1.d;
import rg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ScrollKt$scroll$2 extends Lambda implements q<j1.d, z0.d, Integer, j1.d>
{
    public final /* synthetic */ n0.d $flingBehavior;
    public final /* synthetic */ boolean $isScrollable;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ boolean $reverseScrolling;
    public final /* synthetic */ ScrollState $state;
    
    public ScrollKt$scroll$2(final boolean $isVertical, final ScrollState $state, final boolean $isScrollable, final n0.d $flingBehavior, final boolean $reverseScrolling) {
        this.$isVertical = $isVertical;
        this.$state = $state;
        this.$isScrollable = $isScrollable;
        this.$flingBehavior = $flingBehavior;
        this.$reverseScrolling = $reverseScrolling;
        super(3);
    }
    
    public final j1.d invoke(j1.d j0, final z0.d d, int n) {
        e.f((Object)j0, "$this$composed");
        d.A(1478351300);
        final p n2 = a.n0(d);
        d.A(773894976);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == d$a.a) {
            o = al0.a.t(s.i(EmptyCoroutineContext.INSTANCE, d), d);
        }
        d.I();
        final b0 f = ((l)o).f;
        d.I();
        final j1.d.a f2 = j1.d.a.f;
        final ScrollKt$scroll$2$semantics.ScrollKt$scroll$2$semantics$1 scrollKt$scroll$2$semantics$1 = new ScrollKt$scroll$2$semantics.ScrollKt$scroll$2$semantics$1(this.$reverseScrolling, this.$isVertical, this.$isScrollable, this.$state, f);
        n = 0;
        final j1.d b = SemanticsModifierKt.b((j1.d)f2, false, (rg2.l<? super h2.q, j>)scrollKt$scroll$2$semantics$1);
        final boolean $isVertical = this.$isVertical;
        Orientation orientation;
        if ($isVertical) {
            orientation = Orientation.Vertical;
        }
        else {
            orientation = Orientation.Horizontal;
        }
        boolean b2 = this.$reverseScrolling ^ true;
        if (d.u((o0)CompositionLocalsKt.k) == LayoutDirection.Rtl) {
            n = 1;
        }
        if (n != 0 && !$isVertical) {
            b2 ^= true;
        }
        final ScrollState $state = this.$state;
        j0 = yg.a.g1(m0.e.a(b, orientation), n2).j0(ScrollableKt.b((j1.d)f2, (k)$state, orientation, n2, this.$isScrollable, b2, this.$flingBehavior, (o0.j)$state.b)).j0((j1.d)new ScrollingLayoutModifier(this.$state, this.$reverseScrolling, this.$isVertical, n2));
        d.I();
        return j0;
    }
}
