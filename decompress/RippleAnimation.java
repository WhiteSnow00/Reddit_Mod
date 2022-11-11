// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import rg2.p;
import ej2.g;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import bg.d;
import ej2.z0;
import wd.a;
import z0.l0;
import ej2.s;
import l0.f;
import androidx.compose.animation.core.Animatable;
import n1.c;

public final class RippleAnimation
{
    public c a;
    public final float b;
    public final boolean c;
    public Float d;
    public Float e;
    public c f;
    public final Animatable<Float, f> g;
    public final Animatable<Float, f> h;
    public final Animatable<Float, f> i;
    public final s j;
    public final l0 k;
    public final l0 l;
    
    public RippleAnimation(final c a, final float b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = (Animatable<Float, f>)wd.a.c(0.0f);
        this.h = (Animatable<Float, f>)wd.a.c(0.0f);
        this.i = (Animatable<Float, f>)wd.a.c(0.0f);
        this.j = new s((z0)null);
        final Boolean false = Boolean.FALSE;
        this.k = bg.d.t0((Object)false);
        this.l = bg.d.t0((Object)false);
    }
    
    public final Object a(final lg2.c<? super j> c) {
        RippleAnimation$animate.RippleAnimation$animate$1 rippleAnimation$animate$1 = null;
        Label_0045: {
            if (c instanceof RippleAnimation$animate.RippleAnimation$animate$1) {
                rippleAnimation$animate$1 = (RippleAnimation$animate.RippleAnimation$animate$1)c;
                final int label = rippleAnimation$animate$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    rippleAnimation$animate$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            rippleAnimation$animate$1 = new RippleAnimation$animate.RippleAnimation$animate$1(this, (lg2.c)c);
        }
        final Object result = rippleAnimation$animate$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = rippleAnimation$animate$1.label;
        RippleAnimation l$0 = null;
        Label_0223: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$0 = (RippleAnimation)rippleAnimation$animate$1.L$0;
                        yd.b.k0(result);
                        break Label_0223;
                    }
                    if (label2 == 3) {
                        yd.b.k0(result);
                        return hg2.j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$0 = (RippleAnimation)rippleAnimation$animate$1.L$0;
                    yd.b.k0(result);
                }
            }
            else {
                yd.b.k0(result);
                rippleAnimation$animate$1.L$0 = this;
                rippleAnimation$animate$1.label = 1;
                Object o = ej2.g.e((p)new RippleAnimation$fadeIn$2(this, (lg2.c)null), (lg2.c)rippleAnimation$animate$1);
                if (o != coroutine_SUSPENDED) {
                    o = hg2.j.a;
                }
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$0 = this;
            }
            ((SnapshotMutableStateImpl)l$0.k).setValue((Object)Boolean.TRUE);
            final s j = l$0.j;
            rippleAnimation$animate$1.L$0 = l$0;
            rippleAnimation$animate$1.label = 2;
            if (j.s((lg2.c)rippleAnimation$animate$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        rippleAnimation$animate$1.L$0 = null;
        rippleAnimation$animate$1.label = 3;
        l$0.getClass();
        Object o2 = ej2.g.e((p)new RippleAnimation$fadeOut$2(l$0, (lg2.c)null), (lg2.c)rippleAnimation$animate$1);
        if (o2 != coroutine_SUSPENDED) {
            o2 = hg2.j.a;
        }
        if (o2 == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return hg2.j.a;
    }
}
