// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mj2.g;
import zg2.p;
import androidx.compose.foundation.MutatePriority;
import n0.b;
import androidx.compose.foundation.MutatorMutex;
import pg2.j;
import zg2.l;
import n0.c;

public final class DefaultDraggableState implements c
{
    public final l<Float, j> a;
    public final DefaultDraggableState$a b;
    public final MutatorMutex c;
    
    public DefaultDraggableState(final l<? super Float, j> a) {
        this.a = (l<Float, j>)a;
        this.b = new b() {
            public final /* synthetic */ DefaultDraggableState a;
            
            @Override
            public final void b(final float n) {
                this.a.a.invoke((Object)n);
            }
        };
        this.c = new MutatorMutex();
    }
    
    @Override
    public final Object a(final MutatePriority mutatePriority, final p<? super b, ? super tg2.c<? super j>, ?> p3, final tg2.c<? super j> c) {
        final Object e = g.e((p)new DefaultDraggableState$drag$2(this, mutatePriority, (p)p3, (tg2.c)null), (tg2.c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return j.a;
    }
}
