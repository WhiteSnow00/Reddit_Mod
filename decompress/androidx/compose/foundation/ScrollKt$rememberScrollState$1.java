// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ScrollKt$rememberScrollState$1 extends Lambda implements a<ScrollState>
{
    public final /* synthetic */ int $initial;
    
    public ScrollKt$rememberScrollState$1(final int $initial) {
        this.$initial = $initial;
        super(0);
    }
    
    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
