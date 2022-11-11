// 
// Decompiled by Procyon v0.6.0
// 

package dev.chrisbanes.snapper;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import n0.j;
import l0.c;
import sg2.e;
import z0.l0;
import rg2.l;
import rg2.q;
import l0.n;
import ue2.b;
import n0.d;

public final class SnapperFlingBehavior implements d
{
    public final b a;
    public final n<Float> b;
    public final l0.d<Float> c;
    public final q<b, Integer, Integer, Integer> d;
    public final l<b, Float> e;
    public final l0 f;
    
    public SnapperFlingBehavior() {
        throw null;
    }
    
    public SnapperFlingBehavior(final a a, final n b, final l0.d c, final q d) {
        sg2.e.f((Object)a, "layoutInfo");
        sg2.e.f((Object)b, "decayAnimationSpec");
        sg2.e.f((Object)c, "springAnimationSpec");
        sg2.e.f((Object)d, "snapIndex");
        final l b2 = SnapperFlingBehaviorDefaults.b;
        this.a = a;
        this.b = (n<Float>)b;
        this.c = (l0.d<Float>)c;
        this.d = d;
        this.e = b2;
        this.f = bg.d.t0((Object)null);
    }
    
    public static final boolean b(final SnapperFlingBehavior snapperFlingBehavior, final c c, final ue2.c c2, int n, final l l) {
        snapperFlingBehavior.getClass();
        final float floatValue = ((Number)c.c()).floatValue();
        boolean b = true;
        if (floatValue > 0.0f && c2.a() >= n) {
            n = snapperFlingBehavior.a.d(c2.a());
        }
        else if (floatValue < 0.0f && c2.a() <= n - 1) {
            n = snapperFlingBehavior.a.d(c2.a() + 1);
        }
        else {
            n = 0;
        }
        if (n != 0) {
            l.invoke(n);
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final Object a(final j j, final float n, final lg2.c<? super Float> c) {
        if (!this.a.b() || !this.a.a()) {
            return new Float(n);
        }
        final float floatValue = this.e.invoke(this.a).floatValue();
        final int n2 = 1;
        if (floatValue <= 0.0f) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        final ue2.c e = this.a.e();
        if (e == null) {
            return new Float(n);
        }
        final int c2 = this.a.c(n, floatValue, (n)this.b);
        final q<b, Integer, Integer, Integer> d = this.d;
        final b a = this.a;
        int a2;
        if (n < 0.0f) {
            a2 = e.a() + 1;
        }
        else {
            a2 = e.a();
        }
        final int intValue = d.invoke(a, new Integer(a2), new Integer(c2)).intValue();
        int n3;
        if (intValue >= 0 && intValue < this.a.h()) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            return this.d(j, intValue, n, c);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final float c(final float n) {
        if (n < 0.0f && !this.a.b()) {
            return n;
        }
        if (n > 0.0f && !this.a.a()) {
            return n;
        }
        return 0.0f;
    }
    
    public final Object d(final j l$1, int i$0, float floatValue, final lg2.c<? super Float> c) {
        SnapperFlingBehavior$flingToIndex$1 snapperFlingBehavior$flingToIndex$1 = null;
        Label_0055: {
            if (c instanceof SnapperFlingBehavior$flingToIndex$1) {
                snapperFlingBehavior$flingToIndex$1 = (SnapperFlingBehavior$flingToIndex$1)c;
                final int label = snapperFlingBehavior$flingToIndex$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    snapperFlingBehavior$flingToIndex$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            snapperFlingBehavior$flingToIndex$1 = new SnapperFlingBehavior$flingToIndex$1(this, (lg2.c)c);
        }
        Object o = snapperFlingBehavior$flingToIndex$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = snapperFlingBehavior$flingToIndex$1.label;
        SnapperFlingBehavior l$2 = null;
        Label_0506: {
            j j = null;
            float n2 = 0.0f;
            Label_0410: {
                float f$0;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            l$2 = (SnapperFlingBehavior)snapperFlingBehavior$flingToIndex$1.L$0;
                            yd.b.k0(o);
                            break Label_0506;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        f$0 = snapperFlingBehavior$flingToIndex$1.F$0;
                        i$0 = snapperFlingBehavior$flingToIndex$1.I$0;
                        j = (j)snapperFlingBehavior$flingToIndex$1.L$1;
                        l$2 = (SnapperFlingBehavior)snapperFlingBehavior$flingToIndex$1.L$0;
                        yd.b.k0(o);
                    }
                }
                else {
                    yd.b.k0(o);
                    final ue2.c e = this.a.e();
                    if (e == null) {
                        return new Float(floatValue);
                    }
                    if (e.a() == i$0 && this.a.d(e.a()) == 0) {
                        return new Float(this.c(floatValue));
                    }
                    final n<Float> b = this.b;
                    final float abs = Math.abs(floatValue);
                    boolean b2 = false;
                    Label_0309: {
                        if (abs >= 0.5f) {
                            final float q = wd.a.q(floatValue, (n)b);
                            if (floatValue < 0.0f) {
                                if (q > this.a.d(e.a())) {
                                    break Label_0309;
                                }
                            }
                            else if (q < this.a.d(e.a() + 1)) {
                                break Label_0309;
                            }
                            b2 = true;
                        }
                    }
                    if (!b2) {
                        j = l$1;
                        final float n = floatValue;
                        l$2 = this;
                        n2 = floatValue;
                        floatValue = n;
                        break Label_0410;
                    }
                    snapperFlingBehavior$flingToIndex$1.L$0 = this;
                    snapperFlingBehavior$flingToIndex$1.L$1 = l$1;
                    snapperFlingBehavior$flingToIndex$1.I$0 = i$0;
                    snapperFlingBehavior$flingToIndex$1.F$0 = floatValue;
                    snapperFlingBehavior$flingToIndex$1.label = 1;
                    o = this.e(l$1, e, i$0, floatValue, true, (lg2.c<? super Float>)snapperFlingBehavior$flingToIndex$1);
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    f$0 = floatValue;
                    j = l$1;
                    l$2 = this;
                }
                floatValue = ((Number)o).floatValue();
                n2 = f$0;
            }
            final ue2.c e2 = l$2.a.e();
            if (e2 == null) {
                return new Float(n2);
            }
            if (e2.a() == i$0) {
                final float floatValue2 = floatValue;
                final SnapperFlingBehavior snapperFlingBehavior = l$2;
                if (l$2.a.d(i$0) == 0) {
                    return new Float(snapperFlingBehavior.c(floatValue2));
                }
            }
            snapperFlingBehavior$flingToIndex$1.L$0 = l$2;
            snapperFlingBehavior$flingToIndex$1.L$1 = null;
            snapperFlingBehavior$flingToIndex$1.label = 2;
            if ((o = l$2.f(j, e2, i$0, floatValue, (lg2.c<? super Float>)snapperFlingBehavior$flingToIndex$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final float floatValue2 = ((Number)o).floatValue();
        final SnapperFlingBehavior snapperFlingBehavior = l$2;
        return new Float(snapperFlingBehavior.c(floatValue2));
    }
    
    public final Object e(j j, final ue2.c c, final int n, final float element, final boolean b, final lg2.c<? super Float> c2) {
        SnapperFlingBehavior$performDecayFling$1 snapperFlingBehavior$performDecayFling$2 = null;
        Label_0059: {
            if (c2 instanceof SnapperFlingBehavior$performDecayFling$1) {
                final SnapperFlingBehavior$performDecayFling$1 snapperFlingBehavior$performDecayFling$1 = (SnapperFlingBehavior$performDecayFling$1)c2;
                final int label = snapperFlingBehavior$performDecayFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    snapperFlingBehavior$performDecayFling$1.label = label + Integer.MIN_VALUE;
                    snapperFlingBehavior$performDecayFling$2 = snapperFlingBehavior$performDecayFling$1;
                    break Label_0059;
                }
            }
            snapperFlingBehavior$performDecayFling$2 = new SnapperFlingBehavior$performDecayFling$1(this, (lg2.c)c2);
        }
        final Object result = snapperFlingBehavior$performDecayFling$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = snapperFlingBehavior$performDecayFling$2.label;
        final Ref$FloatRef ref$FloatRef3;
        Label_0222: {
            Ref$FloatRef l$1 = null;
            Ref$FloatRef ref$FloatRef2 = null;
            boolean b2 = false;
            Block_10: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Ref$FloatRef ref$FloatRef = (Ref$FloatRef)snapperFlingBehavior$performDecayFling$2.L$1;
                    j = (j)snapperFlingBehavior$performDecayFling$2.L$0;
                    try {
                        yd.b.k0(result);
                        break Label_0222;
                    }
                    finally {}
                }
                else {
                    yd.b.k0(result);
                    if (c.a() == n && this.a.d(c.a()) == 0) {
                        return new Float(this.c(element));
                    }
                    l$1 = new Ref$FloatRef();
                    l$1.element = element;
                    ref$FloatRef2 = new Ref$FloatRef();
                    if (b && Math.abs(n - c.a()) >= 2) {
                        b2 = true;
                        break Label_0222;
                    }
                    b2 = false;
                    break Block_10;
                }
                break Label_0222;
            }
            try {
                this.g(new Integer(n));
                final l0.e d = bg.d.d(0.0f, element, 28);
                final n<Float> b3 = this.b;
                final SnapperFlingBehavior$performDecayFling$4 snapperFlingBehavior$performDecayFling$3 = new SnapperFlingBehavior$performDecayFling$4(ref$FloatRef2, j, l$1, this, b2, n);
                snapperFlingBehavior$performDecayFling$2.L$0 = this;
                snapperFlingBehavior$performDecayFling$2.L$1 = l$1;
                snapperFlingBehavior$performDecayFling$2.label = 1;
                if (SuspendAnimationKt.c(d, (n)b3, (l)snapperFlingBehavior$performDecayFling$3, (ContinuationImpl)snapperFlingBehavior$performDecayFling$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                ((SnapperFlingBehavior)j).g(null);
                return new Float(ref$FloatRef3.element);
            }
            finally {
                j = (j)this;
            }
        }
        ((SnapperFlingBehavior)j).g(null);
        throw ref$FloatRef3;
    }
    
    public final Object f(j j, final ue2.c c, final int n, float n2, final lg2.c<? super Float> c2) {
        SnapperFlingBehavior$performSpringFling$1 snapperFlingBehavior$performSpringFling$2 = null;
        Label_0059: {
            if (c2 instanceof SnapperFlingBehavior$performSpringFling$1) {
                final SnapperFlingBehavior$performSpringFling$1 snapperFlingBehavior$performSpringFling$1 = (SnapperFlingBehavior$performSpringFling$1)c2;
                final int label = snapperFlingBehavior$performSpringFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    snapperFlingBehavior$performSpringFling$1.label = label + Integer.MIN_VALUE;
                    snapperFlingBehavior$performSpringFling$2 = snapperFlingBehavior$performSpringFling$1;
                    break Label_0059;
                }
            }
            snapperFlingBehavior$performSpringFling$2 = new SnapperFlingBehavior$performSpringFling$1(this, (lg2.c)c2);
        }
        final Object result = snapperFlingBehavior$performSpringFling$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = snapperFlingBehavior$performSpringFling$2.label;
        Ref$FloatRef ref$FloatRef = null;
        Object o2 = null;
        Label_0375: {
            Label_0351: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        final Object o = snapperFlingBehavior$performSpringFling$2.L$1;
                        j = (j)snapperFlingBehavior$performSpringFling$2.L$0;
                        try {
                            yd.b.k0(result);
                            j = (j)o;
                            break Label_0351;
                        }
                        finally {
                            final j i = j;
                            final Throwable t;
                            ref$FloatRef = (Ref$FloatRef)t;
                            o2 = i;
                            break Label_0375;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yd.b.k0(result);
                final Ref$FloatRef l$1 = new Ref$FloatRef();
                final int a = c.a();
                final float n3 = 0.0f;
                float element = 0.0f;
                Label_0209: {
                    if (n <= a || n2 <= 0.0f) {
                        element = n3;
                        if (n > c.a()) {
                            break Label_0209;
                        }
                        element = n3;
                        if (n2 >= 0.0f) {
                            break Label_0209;
                        }
                    }
                    element = n2;
                }
                l$1.element = element;
                final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                try {
                    this.g(new Integer(n));
                    final l0.e d = bg.d.d(ref$FloatRef2.element, l$1.element, 28);
                    n2 = (float)this.a.d(n);
                    final Float n4 = new Float(n2);
                    final l0.d<Float> c3 = this.c;
                    final SnapperFlingBehavior$performSpringFling$3 snapperFlingBehavior$performSpringFling$3 = new SnapperFlingBehavior$performSpringFling$3(ref$FloatRef2, j, l$1, this, n);
                    snapperFlingBehavior$performSpringFling$2.L$0 = this;
                    snapperFlingBehavior$performSpringFling$2.L$1 = l$1;
                    snapperFlingBehavior$performSpringFling$2.label = 1;
                    try {
                        if (SuspendAnimationKt.e(d, n4, (l0.d)c3, false, (l)snapperFlingBehavior$performSpringFling$3, (ContinuationImpl)snapperFlingBehavior$performSpringFling$2, 4) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        ref$FloatRef = l$1;
                        o2 = this;
                        ((SnapperFlingBehavior)o2).g(null);
                        return new Float(ref$FloatRef.element);
                    }
                    finally {}
                }
                finally {}
            }
            o2 = this;
        }
        ((SnapperFlingBehavior)o2).g(null);
        throw ref$FloatRef;
    }
    
    public final void g(final Integer value) {
        ((SnapshotMutableStateImpl)this.f).setValue((Object)value);
    }
}
