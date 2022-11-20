// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyListScopeImpl$item$2 extends Lambda implements l<Integer, Object>
{
    public final Object $contentType;
    
    public LazyListScopeImpl$item$2(final Object $contentType) {
        this.$contentType = $contentType;
        super(1);
    }
    
    public final Object invoke(final int n) {
        return this.$contentType;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke(((Number)o).intValue());
    }
}
