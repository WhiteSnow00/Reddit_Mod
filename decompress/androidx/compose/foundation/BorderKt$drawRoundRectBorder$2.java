// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import q1.i;
import q1.e;
import ah2.f;
import o1.b0;
import o1.n;
import kotlin.Metadata;
import pg2.j;
import q1.c;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lq1/c;", "Lpg2/j;", "invoke", "(Lq1/c;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class BorderKt$drawRoundRectBorder$2 extends Lambda implements l<c, j>
{
    public final /* synthetic */ n $brush;
    public final /* synthetic */ b0 $roundedRectPath;
    
    public BorderKt$drawRoundRectBorder$2(final b0 $roundedRectPath, final n $brush) {
        this.$roundedRectPath = $roundedRectPath;
        this.$brush = $brush;
        super(1);
    }
    
    public final void invoke(final c c) {
        f.f((Object)c, "$this$onDrawWithContent");
        c.c0();
        e.T(c, this.$roundedRectPath, this.$brush, 0.0f, null, 60);
    }
}
