// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.State;
import c3.a;
import y2.f;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import y2.g;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Ly2/g;", "state", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class ConstrainScope$width$1 extends Lambda implements l<g, j>
{
    public final /* synthetic */ c $value;
    public final /* synthetic */ ConstrainScope this$0;
    
    public ConstrainScope$width$1(final ConstrainScope this$0, final c $value) {
        this.this$0 = this$0;
        this.$value = $value;
        super(1);
    }
    
    public final void invoke(final g g) {
        e.f((Object)g, "state");
        final androidx.constraintlayout.core.state.a a = ((State)g).a(this.this$0.a);
        final f f = (f)this.$value;
        f.getClass();
        a.A = (a)f.a.invoke(g);
    }
}
