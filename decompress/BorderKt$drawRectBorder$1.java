// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import q1.e;
import q1.f;
import o1.n;
import kotlin.Metadata;
import pg2.j;
import q1.c;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lq1/c;", "Lpg2/j;", "invoke", "(Lq1/c;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class BorderKt$drawRectBorder$1 extends Lambda implements l<c, j>
{
    public final /* synthetic */ n $brush;
    public final /* synthetic */ long $rectTopLeft;
    public final /* synthetic */ long $size;
    public final /* synthetic */ f $style;
    
    public BorderKt$drawRectBorder$1(final n $brush, final long $rectTopLeft, final long $size, final f $style) {
        this.$brush = $brush;
        this.$rectTopLeft = $rectTopLeft;
        this.$size = $size;
        this.$style = $style;
        super(1);
    }
    
    public final void invoke(final c c) {
        ah2.f.f((Object)c, "$this$onDrawWithContent");
        c.c0();
        e.G(c, this.$brush, this.$rectTopLeft, this.$size, 0.0f, this.$style, 0, 104);
    }
}
