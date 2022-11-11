// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.compose;

import u6.d;
import android.content.Context;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = { 125, 126, 127 }, m = "lottieComposition")
final class RememberLottieCompositionKt$lottieComposition$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    
    public RememberLottieCompositionKt$lottieComposition$1(final tg2.c<? super RememberLottieCompositionKt$lottieComposition$1> c) {
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return com.airbnb.lottie.compose.c.b((Context)null, (d)null, (String)null, (String)null, (String)null, (String)null, (tg2.c)this);
    }
}
