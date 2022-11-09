// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.view;

import jj2.n;
import android.view.ViewGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import android.view.View;
import jj2.m;
import zg2.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@" }, d2 = { "Ljj2/m;", "Landroid/view/View;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@ug2.c(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = { 414, 416 }, m = "invokeSuspend")
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements p<m<? super View>, c<? super j>, Object>
{
    public final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    public int label;
    
    public ViewKt$allViews$1(final View $this_allViews, final c<? super ViewKt$allViews$1> c) {
        this.$this_allViews = $this_allViews;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, (c<? super ViewKt$allViews$1>)c);
        viewKt$allViews$1.L$0 = l$0;
        return (c<j>)viewKt$allViews$1;
    }
    
    public final Object invoke(final m<? super View> m, final c<? super j> c) {
        return ((ViewKt$allViews$1)this.create(m, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        m i;
        if (label != 0) {
            if (label != 1) {
                if (label == 2) {
                    aj2.c.Q0(o);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                final m m = (m)this.L$0;
                aj2.c.Q0(o);
                i = m;
            }
        }
        else {
            aj2.c.Q0(o);
            final m l$0 = (m)this.L$0;
            final View $this_allViews = this.$this_allViews;
            this.L$0 = l$0;
            this.label = 1;
            i = l$0;
            if (l$0.a((Object)$this_allViews, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final View $this_allViews2 = this.$this_allViews;
        if ($this_allViews2 instanceof ViewGroup) {
            final n b = a.b((ViewGroup)$this_allViews2);
            this.L$0 = null;
            this.label = 2;
            i.getClass();
            o = i.b(b.iterator(), (c)this);
            if (o != coroutine_SUSPENDED) {
                o = j.a;
            }
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
