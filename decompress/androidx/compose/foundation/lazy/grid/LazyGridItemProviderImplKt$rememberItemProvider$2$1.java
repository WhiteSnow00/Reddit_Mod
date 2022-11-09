// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import gh2.i;
import z0.h0;
import pg2.j;
import r0.q;
import zg2.l;
import z0.e1;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyGridItemProviderImplKt$rememberItemProvider$2$1 extends Lambda implements a<LazyGridItemsSnapshot>
{
    public final /* synthetic */ e1<l<q, j>> $latestContent;
    public final /* synthetic */ h0<i> $nearestItemsRangeState;
    
    public LazyGridItemProviderImplKt$rememberItemProvider$2$1(final e1<? extends l<? super q, j>> $latestContent, final h0<i> $nearestItemsRangeState) {
        this.$latestContent = (e1<l<q, j>>)$latestContent;
        this.$nearestItemsRangeState = $nearestItemsRangeState;
        super(0);
    }
    
    public final LazyGridItemsSnapshot invoke() {
        final LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
        this.$latestContent.getValue().invoke((Object)lazyGridScopeImpl);
        return new LazyGridItemsSnapshot(lazyGridScopeImpl.a, lazyGridScopeImpl.b, this.$nearestItemsRangeState.getValue());
    }
}
