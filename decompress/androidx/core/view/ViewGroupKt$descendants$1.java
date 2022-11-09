// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.view;

import jj2.n;
import ah2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import android.view.ViewGroup;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import android.view.View;
import jj2.m;
import zg2.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@" }, d2 = { "Ljj2/m;", "Landroid/view/View;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@ug2.c(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = { 119, 121 }, m = "invokeSuspend")
final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements p<m<? super View>, c<? super j>, Object>
{
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    
    public ViewGroupKt$descendants$1(final ViewGroup $this_descendants, final c<? super ViewGroupKt$descendants$1> c) {
        this.$this_descendants = $this_descendants;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, (c<? super ViewGroupKt$descendants$1>)c);
        viewGroupKt$descendants$1.L$0 = l$0;
        return (c<j>)viewGroupKt$descendants$1;
    }
    
    public final Object invoke(final m<? super View> m, final c<? super j> c) {
        return ((ViewGroupKt$descendants$1)this.create(m, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        while (true) {
            int n2 = 0;
            Label_0339: {
                int n = 0;
                View child = null;
                ViewGroup l$1 = null;
                m m = null;
                ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = null;
                Label_0235: {
                    Object o2;
                    ViewGroup $this_descendants;
                    if (label != 0) {
                        if (label == 1) {
                            n = this.I$1;
                            n2 = this.I$0;
                            child = (View)this.L$2;
                            l$1 = (ViewGroup)this.L$1;
                            m = (m)this.L$0;
                            aj2.c.Q0(o);
                            viewGroupKt$descendants$1 = this;
                            break Label_0235;
                        }
                        if (label == 2) {
                            n = this.I$1;
                            n2 = this.I$0;
                            final ViewGroup viewGroup = (ViewGroup)this.L$1;
                            m = (m)this.L$0;
                            aj2.c.Q0(o);
                            o2 = this;
                            $this_descendants = viewGroup;
                            break Label_0339;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        aj2.c.Q0(o);
                        m = (m)this.L$0;
                        $this_descendants = this.$this_descendants;
                        n2 = 0;
                        n = $this_descendants.getChildCount();
                        o2 = this;
                    }
                    if (n2 >= n) {
                        return j.a;
                    }
                    child = $this_descendants.getChildAt(n2);
                    f.e((Object)child, "getChildAt(index)");
                    ((ViewGroupKt$descendants$1)o2).L$0 = m;
                    ((ViewGroupKt$descendants$1)o2).L$1 = $this_descendants;
                    ((ViewGroupKt$descendants$1)o2).L$2 = child;
                    ((ViewGroupKt$descendants$1)o2).I$0 = n2;
                    ((ViewGroupKt$descendants$1)o2).I$1 = n;
                    ((ViewGroupKt$descendants$1)o2).label = 1;
                    if (m.a((Object)child, (c)o2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final c c = (c)o2;
                    l$1 = $this_descendants;
                    viewGroupKt$descendants$1 = (ViewGroupKt$descendants$1)c;
                }
                if (child instanceof ViewGroup) {
                    final n b = a.b((ViewGroup)child);
                    viewGroupKt$descendants$1.L$0 = m;
                    viewGroupKt$descendants$1.L$1 = l$1;
                    viewGroupKt$descendants$1.L$2 = null;
                    viewGroupKt$descendants$1.I$0 = n2;
                    viewGroupKt$descendants$1.I$1 = n;
                    viewGroupKt$descendants$1.label = 2;
                    m.getClass();
                    Object o3 = m.b(b.iterator(), (c)viewGroupKt$descendants$1);
                    if (o3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        o3 = j.a;
                    }
                    if (o3 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final ViewGroup viewGroup2 = l$1;
                    final Object o2 = viewGroupKt$descendants$1;
                    final ViewGroup $this_descendants = viewGroup2;
                }
                else {
                    final ViewGroup viewGroup3 = l$1;
                    final Object o2 = viewGroupKt$descendants$1;
                    final ViewGroup $this_descendants = viewGroup3;
                }
            }
            ++n2;
            continue;
        }
    }
}
