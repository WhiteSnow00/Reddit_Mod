// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 5, 1 }, xi = 48)
@c(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = { 97 }, m = "awaitClose")
final class SimpleProducerScopeImpl$awaitClose$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ h<Object> this$0;
    
    public SimpleProducerScopeImpl$awaitClose$1(final h<Object> this$0, final lg2.c<? super SimpleProducerScopeImpl$awaitClose$1> c) {
        this.this$0 = this$0;
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Rh((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$3)null, (lg2.c)this);
    }
}
