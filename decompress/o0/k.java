// 
// Decompiled by Procyon v0.6.0
// 

package o0;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import pj2.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.h;

public final class k implements j
{
    public final h a;
    
    public k() {
        this.a = u.g(0, 16, BufferOverflow.DROP_OLDEST, 1);
    }
    
    @Override
    public final Object a(final o0.h h, final c<? super pg2.j> c) {
        final Object emit = this.a.emit((Object)h, (c)c);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return pg2.j.a;
    }
    
    @Override
    public final boolean b(final o0.h h) {
        return this.a.d((Object)h);
    }
    
    public final h c() {
        return this.a;
    }
}
