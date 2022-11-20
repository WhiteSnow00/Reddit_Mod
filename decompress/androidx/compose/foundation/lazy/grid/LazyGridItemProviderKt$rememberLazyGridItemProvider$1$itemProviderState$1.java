// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import tg2.i;
import cg2.j;
import r0.r;
import mg2.l;
import z0.c1;
import kotlin.Metadata;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyGridItemProviderKt$rememberLazyGridItemProvider$1$itemProviderState$1 extends Lambda implements a<LazyGridItemProviderImpl>
{
    public final c1<l<r, j>> $latestContent;
    public final c1<i> $nearestItemsRangeState;
    
    public LazyGridItemProviderKt$rememberLazyGridItemProvider$1$itemProviderState$1(final c1<? extends l<? super r, j>> $latestContent, final c1<i> $nearestItemsRangeState) {
        this.$latestContent = (c1<l<r, j>>)$latestContent;
        this.$nearestItemsRangeState = $nearestItemsRangeState;
        super(0);
    }
    
    public final LazyGridItemProviderImpl invoke() {
        final LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl();
        ((l)this.$latestContent.getValue()).invoke((Object)lazyGridScopeImpl);
        return new LazyGridItemProviderImpl(lazyGridScopeImpl.a, lazyGridScopeImpl.b, (i)this.$nearestItemsRangeState.getValue());
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}
