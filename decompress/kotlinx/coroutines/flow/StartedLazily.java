// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cg2.j;
import cj2.f;
import mg2.p;
import cj2.s;
import gg2.c;
import cj2.e;
import cj2.y;
import cj2.w;

public final class StartedLazily implements w
{
    public final e<SharingCommand> a(final y<Integer> y) {
        return (e<SharingCommand>)new s((mg2.p<? super cj2.f<? super Object>, ? super c<? super j>, ?>)new StartedLazily$command$1((y)y, (c)null));
    }
    
    @Override
    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
