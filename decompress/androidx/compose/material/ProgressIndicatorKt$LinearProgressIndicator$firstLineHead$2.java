// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import ah2.f;
import kotlin.Metadata;
import pg2.j;
import l0.y;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 extends Lambda implements l<y.b<Float>, j>
{
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 INSTANCE;
    
    static {
        INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2();
    }
    
    public ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2() {
        super(1);
    }
    
    public final void invoke(final y.b<Float> b) {
        f.f((Object)b, "$this$keyframes");
        b.a = 1800;
        final y.a a = b.a(0, 0.0f);
        final l0.l d = ProgressIndicatorKt.d;
        f.f((Object)d, "easing");
        a.b = d;
        b.a(750, 1.0f);
    }
}
