// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mj2.g;
import tg2.c;
import zg2.p;
import androidx.compose.foundation.MutatePriority;
import a80.a;
import n0.j;
import z0.l0;
import androidx.compose.foundation.MutatorMutex;
import zg2.l;
import n0.k;

public final class DefaultScrollableState implements k
{
    public final l<Float, Float> a;
    public final DefaultScrollableState$a b;
    public final MutatorMutex c;
    public final l0 d;
    
    public DefaultScrollableState(final l<? super Float, Float> a) {
        this.a = (l<Float, Float>)a;
        this.b = new j() {
            public final /* synthetic */ DefaultScrollableState a;
            
            @Override
            public final float a(final float n) {
                return ((Number)this.a.a.invoke((Object)n)).floatValue();
            }
        };
        this.c = new MutatorMutex();
        this.d = a80.a.n0(Boolean.FALSE);
    }
    
    @Override
    public final Object a(final MutatePriority mutatePriority, final p<? super j, ? super c<? super pg2.j>, ?> p3, final c<? super pg2.j> c) {
        final Object e = g.e((p)new DefaultScrollableState$scroll$2(this, mutatePriority, (p)p3, (c)null), (c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return pg2.j.a;
    }
    
    @Override
    public final boolean b() {
        return ((SnapshotMutableStateImpl<Boolean>)this.d).getValue();
    }
    
    @Override
    public final float c(final float n) {
        return ((Number)this.a.invoke((Object)n)).floatValue();
    }
}
