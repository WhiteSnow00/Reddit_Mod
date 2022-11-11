// 
// Decompiled by Procyon v0.6.0
// 

package o0;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import a92.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.f;

public final class k implements j
{
    public final f a;
    
    public k() {
        this.a = b.l(0, 16, BufferOverflow.DROP_OLDEST, 1);
    }
    
    @Override
    public final boolean a(final h h) {
        return this.a.d((Object)h);
    }
    
    @Override
    public final Object b(final h h, final c<? super hg2.j> c) {
        final Object emit = this.a.emit((Object)h, (c)c);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return hg2.j.a;
    }
    
    @Override
    public final f c() {
        return this.a;
    }
}
