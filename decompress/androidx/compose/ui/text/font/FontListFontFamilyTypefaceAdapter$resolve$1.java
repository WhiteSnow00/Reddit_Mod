// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = { 151 }, m = "invokeSuspend")
final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ AsyncFontListLoader $asyncLoader;
    public int label;
    
    public FontListFontFamilyTypefaceAdapter$resolve$1(final AsyncFontListLoader $asyncLoader, final c<? super FontListFontFamilyTypefaceAdapter$resolve$1> c) {
        this.$asyncLoader = $asyncLoader;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new FontListFontFamilyTypefaceAdapter$resolve$1(this.$asyncLoader, (c<? super FontListFontFamilyTypefaceAdapter$resolve$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final AsyncFontListLoader $asyncLoader = this.$asyncLoader;
            this.label = 1;
            if ($asyncLoader.a((c<? super j>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
