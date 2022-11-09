// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import mj2.b0;
import n0.k;
import androidx.compose.foundation.gestures.ScrollableKt;
import gn.a;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.foundation.gestures.Orientation;
import pg2.j;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import z0.l;
import a2.b;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import mk2.e;
import ah2.f;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ScrollKt$scroll$2 extends Lambda implements q<d, z0.d, Integer, d>
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
    
    public final d invoke(d f0, final z0.d d, int n) {
        f.f((Object)f0, "$this$composed");
        d.A(1478351300);
        final m0.q i = e.I(d);
        d.A(773894976);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == d$a.a) {
            o = b.p(s.i(EmptyCoroutineContext.INSTANCE, d), d);
        }
        d.I();
        final b0 f2 = ((l)o).f;
        d.I();
        final d.a f3 = j1.d.a.f;
        final ScrollKt$scroll$2$semantics.ScrollKt$scroll$2$semantics$1 scrollKt$scroll$2$semantics$1 = new ScrollKt$scroll$2$semantics.ScrollKt$scroll$2$semantics$1(this.$reverseScrolling, this.$isVertical, this.$isScrollable, this.$state, f2);
        n = 0;
        final d b = SemanticsModifierKt.b((d)f3, false, (zg2.l<? super h2.q, j>)scrollKt$scroll$2$semantics$1);
        final boolean $isVertical = this.$isVertical;
        Orientation orientation;
        if ($isVertical) {
            orientation = Orientation.Vertical;
        }
        else {
            orientation = Orientation.Horizontal;
        }
        boolean b2 = this.$reverseScrolling ^ true;
        if (d.t(CompositionLocalsKt.k) == LayoutDirection.Rtl) {
            n = 1;
        }
        if (n != 0 && !$isVertical) {
            b2 ^= true;
        }
        final ScrollState $state = this.$state;
        f0 = a.K1(m0.f.a(b, orientation), i).f0(ScrollableKt.b((d)f3, $state, orientation, i, this.$isScrollable, b2, this.$flingBehavior, $state.b)).f0((d)new ScrollingLayoutModifier(this.$state, this.$reverseScrolling, this.$isVertical, i));
        d.I();
        return f0;
    }
}
