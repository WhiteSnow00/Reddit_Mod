// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.coroutines;

import com.apollographql.apollo.ApolloCall;
import kotlin.Metadata;
import pg2.j;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n" }, d2 = { "T", "", "it", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class CoroutinesExtensionsKt$await$2$1 extends Lambda implements l<Throwable, j>
{
    public final /* synthetic */ ApolloCall<Object> $this_await;
    
    public CoroutinesExtensionsKt$await$2$1(final ApolloCall<Object> $this_await) {
        this.$this_await = $this_await;
        super(1);
    }
    
    public final void invoke(final Throwable t) {
        this.$this_await.cancel();
    }
}
