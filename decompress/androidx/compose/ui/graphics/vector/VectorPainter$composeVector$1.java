// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.graphics.vector;

import mg2.q;
import androidx.compose.runtime.ComposerKt;
import mg2.r;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b?\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lcg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class VectorPainter$composeVector$1 extends Lambda implements p<d, Integer, j>
{
    public final r<Float, Float, d, Integer, j> $composable;
    public final VectorPainter this$0;
    
    public VectorPainter$composeVector$1(final r<? super Float, ? super Float, ? super d, ? super Integer, j> $composable, final VectorPainter this$0) {
        this.$composable = (r<Float, Float, d, Integer, j>)$composable;
        this.this$0 = this$0;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, final int n) {
        if ((n & 0xB) == 0x2 && d.d()) {
            d.j();
        }
        else {
            final q a = ComposerKt.a;
            this.$composable.invoke((Object)this.this$0.m.g, (Object)this.this$0.m.h, (Object)d, (Object)0);
        }
    }
}
