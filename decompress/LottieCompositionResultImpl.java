// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.compose;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import q6.h;
import a80.a;
import pj2.u;
import androidx.compose.runtime.DerivedSnapshotState;
import z0.l0;
import mj2.s;
import z0.e1;

public final class LottieCompositionResultImpl implements e1
{
    public final s f;
    public final l0 g;
    public final l0 h;
    public final DerivedSnapshotState i;
    public final DerivedSnapshotState j;
    
    public LottieCompositionResultImpl() {
        this.f = u.d();
        this.g = a.n0(null);
        this.h = a.n0(null);
        a.D((zg2.a)new LottieCompositionResultImpl$isLoading.LottieCompositionResultImpl$isLoading$2(this));
        this.i = a.D((zg2.a)new LottieCompositionResultImpl$isComplete.LottieCompositionResultImpl$isComplete$2(this));
        a.D((zg2.a)new LottieCompositionResultImpl$isFailure.LottieCompositionResultImpl$isFailure$2(this));
        this.j = a.D((zg2.a)new LottieCompositionResultImpl$isSuccess.LottieCompositionResultImpl$isSuccess$2(this));
    }
    
    @Override
    public final Object getValue() {
        return ((SnapshotMutableStateImpl<h>)this.g).getValue();
    }
}
