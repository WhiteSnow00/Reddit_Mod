// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import rg2.p;
import hj2.v;
import lg2.c;
import hj2.e;
import hj2.a0;
import hj2.y;

public final class StartedLazily implements y
{
    @Override
    public final e<SharingCommand> a(final a0<Integer> a0) {
        return (e<SharingCommand>)new v((p)new StartedLazily$command$1((a0)a0, (c)null));
    }
    
    @Override
    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
