// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import n0.j;
import z0.a1;
import a80.a;
import z0.h1;
import zg2.p;
import zg2.l;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import z0.l0;
import h1.e;
import n0.k;

public final class ScrollState implements k
{
    public static final e f;
    public final l0 a;
    public final o0.k b;
    public l0 c;
    public float d;
    public final DefaultScrollableState e;
    
    static {
        f = SaverKt.a((l)ScrollState$Companion$Saver.ScrollState$Companion$Saver$2.INSTANCE, (p)ScrollState$Companion$Saver.ScrollState$Companion$Saver$1.INSTANCE);
    }
    
    public ScrollState(final int n) {
        final h1 a = h1.a;
        this.a = a80.a.m0(n, (a1)a);
        this.b = new o0.k();
        this.c = a80.a.m0(Integer.MAX_VALUE, (a1)a);
        this.e = new DefaultScrollableState((l<? super Float, Float>)new ScrollState$scrollableState.ScrollState$scrollableState$1(this));
    }
    
    @Override
    public final Object a(final MutatePriority mutatePriority, final p<? super j, ? super c<? super pg2.j>, ?> p3, final c<? super pg2.j> c) {
        final Object a = this.e.a(mutatePriority, p3, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return pg2.j.a;
    }
    
    @Override
    public final boolean b() {
        return this.e.b();
    }
    
    @Override
    public final float c(final float n) {
        return this.e.c(n);
    }
    
    public final int e() {
        return ((SnapshotMutableStateImpl<Number>)this.c).getValue().intValue();
    }
    
    public final int f() {
        return ((SnapshotMutableStateImpl<Number>)this.a).getValue().intValue();
    }
}
