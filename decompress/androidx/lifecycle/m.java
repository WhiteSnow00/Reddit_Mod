// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import pg2.j;
import tg2.c;
import zg2.p;
import mj2.b0;

public abstract class m implements b0
{
    public abstract Lifecycle d();
    
    public final void e(final p p) {
        g.i((b0)this, (CoroutineContext)null, (CoroutineStart)null, (p)new LifecycleCoroutineScope$launchWhenResumed$1(this, (p<? super b0, ? super c<? super j>, ?>)p, null), 3);
    }
}
