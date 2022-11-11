// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ah2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = { 233 }, m = "invokeSuspend")
final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ Recomposer $newRecomposer;
    public final /* synthetic */ View $rootView;
    public int label;
    
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(final Recomposer $newRecomposer, final View $rootView, final c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> c) {
        this.$newRecomposer = $newRecomposer;
        this.$rootView = $rootView;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, (c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object x) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0035: {
            if (label == 0) {
                break Label_0035;
            }
            Label_0025: {
                if (label != 1) {
                    break Label_0025;
                }
                try {
                    aj2.c.Q0(x);
                    Label_0062: {
                        return j.a;
                    }
                    aj2.c.Q0(x);
                    final Recomposer $newRecomposer = this.$newRecomposer;
                    this.label = 1;
                    x = $newRecomposer.x((c)this);
                    iftrue(Label_0062:)(x != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    if (w1.b(this.$rootView) == this.$newRecomposer) {
                        final View $rootView = this.$rootView;
                        f.f((Object)$rootView, "<this>");
                        $rootView.setTag(2131427616, (Object)null);
                    }
                }
            }
        }
    }
}
