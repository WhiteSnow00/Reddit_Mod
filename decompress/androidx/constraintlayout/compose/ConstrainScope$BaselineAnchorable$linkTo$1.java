// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.State;
import rg2.p;
import u2.d;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import y2.g;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Ly2/g;", "state", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class ConstrainScope$BaselineAnchorable$linkTo$1 extends Lambda implements l<g, j>
{
    public final /* synthetic */ a.a $anchor;
    public final /* synthetic */ float $margin;
    public final /* synthetic */ ConstrainScope.a this$0;
    
    public ConstrainScope$BaselineAnchorable$linkTo$1(final ConstrainScope.a this$0, final a.a $anchor, final float $margin) {
        this.this$0 = this$0;
        this.$anchor = $anchor;
        this.$margin = $margin;
        super(1);
    }
    
    public final void invoke(final g g) {
        e.f((Object)g, "state");
        final ConstrainScope.a this$0 = this.this$0;
        final a.a $anchor = this.$anchor;
        final Object a = this$0.a;
        e.f(a, "id");
        g.i.add(a);
        g.j = true;
        final Object a2 = $anchor.a;
        e.f(a2, "id");
        g.i.add(a2);
        g.j = true;
        final androidx.constraintlayout.core.state.a a3 = ((State)g).a(this.this$0.a);
        final a.a $anchor2 = this.$anchor;
        final float $margin = this.$margin;
        final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a> k = ConstrainScope.k;
        e.e((Object)a3, "this");
        k.invoke(a3, $anchor2.a).f(new u2.d($margin));
    }
}
