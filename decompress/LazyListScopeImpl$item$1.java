// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "<anonymous parameter 0>", "", "invoke" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyListScopeImpl$item$1 extends Lambda implements l<Integer, Object>
{
    public final /* synthetic */ Object $key;
    
    public LazyListScopeImpl$item$1(final Object $key) {
        this.$key = $key;
        super(1);
    }
    
    public final Object invoke(final int n) {
        return this.$key;
    }
}
