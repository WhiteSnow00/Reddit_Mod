// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.compose;

import kotlin.Metadata;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LottieAnimatableImpl$doFrame$3 extends Lambda implements l<Long, Boolean>
{
    public final /* synthetic */ int $iterations;
    public final /* synthetic */ LottieAnimatableImpl this$0;
    
    public LottieAnimatableImpl$doFrame$3(final LottieAnimatableImpl this$0, final int $iterations) {
        this.this$0 = this$0;
        this.$iterations = $iterations;
        super(1);
    }
    
    public final Boolean invoke(final long n) {
        return LottieAnimatableImpl.a(this.this$0, this.$iterations, n);
    }
}
