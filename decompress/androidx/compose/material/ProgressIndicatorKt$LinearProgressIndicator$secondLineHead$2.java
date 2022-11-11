// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import l0.q;
import l0.y$a;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import l0.y$b;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2 extends Lambda implements l<y$b<Float>, j>
{
    public static final ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2 INSTANCE;
    
    static {
        INSTANCE = new ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2();
    }
    
    public ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2() {
        super(1);
    }
    
    public final void invoke(final y$b<Float> y$b) {
        e.f((Object)y$b, "$this$keyframes");
        y$b.a = 1800;
        final y$a a = y$b.a(1000, Float.valueOf(0.0f));
        final l0.l f = ProgressIndicatorKt.f;
        e.f((Object)f, "easing");
        a.b = (q)f;
        y$b.a(1567, Float.valueOf(1.0f));
    }
}
