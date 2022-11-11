// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import l0.f0;
import zg2.l;
import l0.d;
import androidx.compose.animation.core.Animatable;
import l0.q;
import at1.a;
import l0.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import kotlin.Metadata;
import mj2.z0;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lmj2/z0;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
final class RippleAnimation$fadeOut$2 extends SuspendLambda implements p<b0, c<? super z0>, Object>
{
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RippleAnimation this$0;
    
    public RippleAnimation$fadeOut$2(final RippleAnimation this$0, final c<? super RippleAnimation$fadeOut$2> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.this$0, (c<? super RippleAnimation$fadeOut$2>)c);
        rippleAnimation$fadeOut$2.L$0 = l$0;
        return (c<j>)rippleAnimation$fadeOut$2;
    }
    
    public final Object invoke(final b0 b0, final c<? super z0> c) {
        return ((RippleAnimation$fadeOut$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            aj2.c.Q0(o);
            return g.i((b0)this.L$0, (CoroutineContext)null, (CoroutineStart)null, (p)new p<b0, c<? super j>, Object>() {
                public int label;
                public final /* synthetic */ RippleAnimation this$0;
                
                public final c<j> create(final Object o, final c<?> c) {
                    return (c<j>)new p<b0, c<? super j>, Object>() {
                        public int label;
                        public final /* synthetic */ RippleAnimation this$0 = this.this$0;
                    };
                }
                
                public final Object invoke(final b0 b0, final c<? super j> c) {
                    return ((RippleAnimation$fadeOut$2$1)this.create(b0, c)).invokeSuspend(j.a);
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
                        final Animatable g = this.this$0.g;
                        final Float n = new Float(0.0f);
                        final f0 k2 = a.k2(150, 0, (q)r.r$a.a, 2);
                        this.label = 1;
                        if (Animatable.c(g, (Object)n, (d)k2, (Float)null, (l)null, (c)this, 12) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    return j.a;
                }
            }, 3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
