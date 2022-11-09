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
final class ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 extends Lambda implements l<y.b<Float>, j>
{
    public static final ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 INSTANCE;
    
    static {
        INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2();
    }
    
    public ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2() {
        super(1);
    }
    
    public final void invoke(final y.b<Float> b) {
        f.f((Object)b, "$this$keyframes");
        b.a = 1800;
        final y.a a = b.a(1267, 0.0f);
        final l0.l g = ProgressIndicatorKt.g;
        f.f((Object)g, "easing");
        a.b = g;
        b.a(1800, 1.0f);
    }
}
