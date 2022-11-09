// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.compose;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.l;
import androidx.compose.foundation.MutatePriority;
import pg2.j;
import u6.c;
import q6.h;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.DerivedSnapshotState;
import z0.l0;
import u6.a;

public final class LottieAnimatableImpl implements a
{
    public final l0 f;
    public final l0 g;
    public final l0 h;
    public final l0 i;
    public final l0 j;
    public final l0 k;
    public final l0 l;
    public final l0 m;
    public final DerivedSnapshotState n;
    public final MutatorMutex o;
    
    public LottieAnimatableImpl() {
        this.f = a80.a.n0(Boolean.FALSE);
        this.g = a80.a.n0(0.0f);
        final Integer value = 1;
        this.h = a80.a.n0(value);
        this.i = a80.a.n0(value);
        this.j = a80.a.n0(null);
        this.k = a80.a.n0(1.0f);
        this.l = a80.a.n0(null);
        this.m = a80.a.n0(Long.MIN_VALUE);
        this.n = a80.a.D((zg2.a)new LottieAnimatableImpl$endProgress.LottieAnimatableImpl$endProgress$2(this));
        a80.a.D((zg2.a)new LottieAnimatableImpl$isAtEnd.LottieAnimatableImpl$isAtEnd$2(this));
        this.o = new MutatorMutex();
    }
    
    public static final boolean a(final LottieAnimatableImpl lottieAnimatableImpl, final int n, final long n2) {
        final h f = lottieAnimatableImpl.f();
        boolean b = true;
        if (f != null) {
            long n3;
            if (((SnapshotMutableStateImpl<Number>)lottieAnimatableImpl.m).getValue().longValue() == Long.MIN_VALUE) {
                n3 = 0L;
            }
            else {
                n3 = n2 - ((SnapshotMutableStateImpl<Number>)lottieAnimatableImpl.m).getValue().longValue();
            }
            ((SnapshotMutableStateImpl<Long>)lottieAnimatableImpl.m).setValue(Long.valueOf(n2));
            final c s = lottieAnimatableImpl.s();
            float b2;
            if (s == null) {
                b2 = 0.0f;
            }
            else {
                b2 = s.b();
            }
            final c s2 = lottieAnimatableImpl.s();
            float a;
            if (s2 == null) {
                a = 1.0f;
            }
            else {
                a = s2.a();
            }
            final float n4 = lottieAnimatableImpl.d() * (n3 / 1000000 / f.b());
            float n5;
            if (lottieAnimatableImpl.d() < 0.0f) {
                n5 = b2 - (lottieAnimatableImpl.getProgress() + n4);
            }
            else {
                n5 = lottieAnimatableImpl.getProgress() + n4 - a;
            }
            if (n5 < 0.0f) {
                lottieAnimatableImpl.m(yl.a.J(lottieAnimatableImpl.getProgress(), b2, a) + n4);
            }
            else {
                final float n6 = a - b2;
                final int n7 = (int)(n5 / n6) + 1;
                if (lottieAnimatableImpl.r() + n7 > n) {
                    lottieAnimatableImpl.m(lottieAnimatableImpl.i());
                    lottieAnimatableImpl.l(n);
                    b = false;
                }
                else {
                    lottieAnimatableImpl.l(lottieAnimatableImpl.r() + n7);
                    final float n8 = n5 - (n7 - 1) * n6;
                    float n9;
                    if (lottieAnimatableImpl.d() < 0.0f) {
                        n9 = a - n8;
                    }
                    else {
                        n9 = b2 + n8;
                    }
                    lottieAnimatableImpl.m(n9);
                }
            }
        }
        return b;
    }
    
    public static final void g(final LottieAnimatableImpl lottieAnimatableImpl, final boolean b) {
        ((SnapshotMutableStateImpl<Boolean>)lottieAnimatableImpl.f).setValue(Boolean.valueOf(b));
    }
    
    public final Object b(final h h, final float n, final int n2, final boolean b, final tg2.c<? super j> c) {
        final Object b2 = this.o.b(MutatePriority.Default, (zg2.l<? super tg2.c<? super Object>, ?>)new LottieAnimatableImpl$snapTo$2(this, h, n, n2, b, (tg2.c)null), (tg2.c<? super Object>)c);
        if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b2;
        }
        return pg2.j.a;
    }
    
    public final float d() {
        return ((SnapshotMutableStateImpl<Number>)this.k).getValue().floatValue();
    }
    
    public final h f() {
        return ((SnapshotMutableStateImpl<h>)this.l).getValue();
    }
    
    public final float getProgress() {
        return ((SnapshotMutableStateImpl<Number>)this.g).getValue().floatValue();
    }
    
    public final Object getValue() {
        return this.getProgress();
    }
    
    public final float i() {
        return ((Number)this.n.getValue()).floatValue();
    }
    
    public final Object k(final h h, final int n, final int n2, final float n3, final c c, final float n4, final boolean b, final LottieCancellationBehavior lottieCancellationBehavior, final tg2.c c2) {
        final Object b2 = this.o.b(MutatePriority.Default, (zg2.l<? super tg2.c<? super Object>, ?>)new LottieAnimatableImpl$animate$2(this, n, n2, n3, c, h, n4, b, lottieCancellationBehavior, (tg2.c)null), (tg2.c<? super Object>)c2);
        if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b2;
        }
        return pg2.j.a;
    }
    
    public final void l(final int n) {
        ((SnapshotMutableStateImpl<Integer>)this.h).setValue(Integer.valueOf(n));
    }
    
    public final void m(final float n) {
        ((SnapshotMutableStateImpl<Float>)this.g).setValue(Float.valueOf(n));
    }
    
    public final int r() {
        return ((SnapshotMutableStateImpl<Number>)this.h).getValue().intValue();
    }
    
    public final c s() {
        return ((SnapshotMutableStateImpl<c>)this.j).getValue();
    }
}
