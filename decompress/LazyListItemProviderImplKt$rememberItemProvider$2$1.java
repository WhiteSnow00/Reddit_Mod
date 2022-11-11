// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.EmptyList;
import gh2.i;
import z0.h0;
import pg2.j;
import zg2.l;
import z0.e1;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazyListItemProviderImplKt$rememberItemProvider$2$1 extends Lambda implements a<LazyListItemsSnapshot>
{
    public final /* synthetic */ e1<l<b, j>> $latestContent;
    public final /* synthetic */ h0<i> $nearestItemsRangeState;
    
    public LazyListItemProviderImplKt$rememberItemProvider$2$1(final e1<? extends l<? super b, j>> $latestContent, final h0<i> $nearestItemsRangeState) {
        this.$latestContent = (e1<l<b, j>>)$latestContent;
        this.$nearestItemsRangeState = $nearestItemsRangeState;
        super(0);
    }
    
    public final LazyListItemsSnapshot invoke() {
        final c c = new c();
        this.$latestContent.getValue().invoke((Object)c);
        final s0.j b = c.b;
        Object o;
        if ((o = c.c) == null) {
            o = EmptyList.INSTANCE;
        }
        return new LazyListItemsSnapshot(b, (List)o, this.$nearestItemsRangeState.getValue());
    }
}
