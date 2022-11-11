// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import q1.e;
import ah2.f;
import n1.d;
import o1.s;
import o1.w;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.Metadata;
import pg2.j;
import q1.c;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lq1/c;", "Lpg2/j;", "invoke", "(Lq1/c;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class BorderKt$drawGenericBorder$3 extends Lambda implements l<c, j>
{
    public final /* synthetic */ Ref$ObjectRef<w> $cacheImageBitmap;
    public final /* synthetic */ s $colorFilter;
    public final /* synthetic */ d $pathBounds;
    public final /* synthetic */ long $pathBoundsSize;
    
    public BorderKt$drawGenericBorder$3(final d $pathBounds, final Ref$ObjectRef<w> $cacheImageBitmap, final long $pathBoundsSize, final s $colorFilter) {
        this.$pathBounds = $pathBounds;
        this.$cacheImageBitmap = $cacheImageBitmap;
        this.$pathBoundsSize = $pathBoundsSize;
        this.$colorFilter = $colorFilter;
        super(1);
    }
    
    public final void invoke(final c c) {
        f.f((Object)c, "$this$onDrawWithContent");
        c.c0();
        final d $pathBounds = this.$pathBounds;
        final float a = $pathBounds.a;
        final float b = $pathBounds.b;
        final Ref$ObjectRef<w> $cacheImageBitmap = this.$cacheImageBitmap;
        final long $pathBoundsSize = this.$pathBoundsSize;
        final s $colorFilter = this.$colorFilter;
        c.Y().a.g(a, b);
        e.H(c, (w)$cacheImageBitmap.element, 0L, $pathBoundsSize, 0L, 0L, 0.0f, null, $colorFilter, 0, 0, 890);
        c.Y().a.g(-a, -b);
    }
}
