// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import mk2.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import n2.s;
import android.content.Context;
import kotlin.Metadata;
import android.graphics.Typeface;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Landroid/graphics/Typeface;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements p<b0, c<? super Typeface>, Object>
{
    public final /* synthetic */ Context $context;
    public final /* synthetic */ s $this_loadAsync;
    public int label;
    
    public AndroidFontLoader_androidKt$loadAsync$2(final s $this_loadAsync, final Context $context, final c<? super AndroidFontLoader_androidKt$loadAsync$2> c) {
        this.$this_loadAsync = $this_loadAsync;
        this.$context = $context;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, (c<? super AndroidFontLoader_androidKt$loadAsync$2>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super Typeface> c) {
        return ((AndroidFontLoader_androidKt$loadAsync$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            aj2.c.Q0(o);
            return e.l(this.$context, this.$this_loadAsync);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
