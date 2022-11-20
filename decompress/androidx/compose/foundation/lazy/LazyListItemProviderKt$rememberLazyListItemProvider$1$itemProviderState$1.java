// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.EmptyList;
import tg2.i;
import cg2.j;
import mg2.l;
import z0.c1;
import q0.f;
import kotlin.Metadata;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class LazyListItemProviderKt$rememberLazyListItemProvider$1$itemProviderState$1 extends Lambda implements a<LazyListItemProviderImpl>
{
    public final f $itemScope;
    public final c1<l<b, j>> $latestContent;
    public final c1<i> $nearestItemsRangeState;
    
    public LazyListItemProviderKt$rememberLazyListItemProvider$1$itemProviderState$1(final c1<? extends l<? super b, j>> $latestContent, final c1<i> $nearestItemsRangeState, final f $itemScope) {
        this.$latestContent = (c1<l<b, j>>)$latestContent;
        this.$nearestItemsRangeState = $nearestItemsRangeState;
        this.$itemScope = $itemScope;
        super(0);
    }
    
    public final LazyListItemProviderImpl invoke() {
        final c c = new c();
        ((l)this.$latestContent.getValue()).invoke((Object)c);
        final s0.l b = c.b;
        final i i = (i)this.$nearestItemsRangeState.getValue();
        Object o;
        if ((o = c.c) == null) {
            o = EmptyList.INSTANCE;
        }
        return new LazyListItemProviderImpl(b, i, (List)o, this.$itemScope);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}
