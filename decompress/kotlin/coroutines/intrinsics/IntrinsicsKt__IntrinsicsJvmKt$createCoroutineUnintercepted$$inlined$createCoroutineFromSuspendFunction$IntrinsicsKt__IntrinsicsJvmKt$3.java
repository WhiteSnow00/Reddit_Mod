// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.coroutines.intrinsics;

import sg2.k;
import yd.b;
import sg2.e;
import lg2.c;
import rg2.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n" }, d2 = { "kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "label", "I", "kotlin-stdlib" }, k = 1, mv = { 1, 7, 1 })
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 extends RestrictedContinuationImpl
{
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
    private int label;
    
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(final c c, final p $this_createCoroutineUnintercepted$inlined, final Object $receiver$inlined) {
        this.$this_createCoroutineUnintercepted$inlined = $this_createCoroutineUnintercepted$inlined;
        this.$receiver$inlined = $receiver$inlined;
        e.d((Object)c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(c);
    }
    
    public Object invokeSuspend(Object invoke) {
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 2;
            b.k0(invoke);
        }
        else {
            this.label = 1;
            b.k0(invoke);
            e.d((Object)this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            final p $this_createCoroutineUnintercepted$inlined = this.$this_createCoroutineUnintercepted$inlined;
            k.e(2, (Object)$this_createCoroutineUnintercepted$inlined);
            invoke = $this_createCoroutineUnintercepted$inlined.invoke(this.$receiver$inlined, this);
        }
        return invoke;
    }
}
