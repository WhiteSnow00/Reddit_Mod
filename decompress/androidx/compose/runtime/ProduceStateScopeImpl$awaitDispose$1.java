// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import zg2.a;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = { 227 }, m = "awaitDispose")
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ androidx.compose.runtime.c<Object> this$0;
    
    public ProduceStateScopeImpl$awaitDispose$1(final androidx.compose.runtime.c<Object> this$0, final tg2.c<? super ProduceStateScopeImpl$awaitDispose$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Fn(null, (tg2.c)this);
    }
}
