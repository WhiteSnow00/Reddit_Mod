// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import sg2.e;
import gj2.t;
import hj2.f;

public final class a<T> implements f<T>
{
    public final t<T> f;
    
    public a(final x f) {
        e.f((Object)f, "channel");
        this.f = f;
    }
    
    @Override
    public final Object emit(final T t, final c<? super j> c) {
        final Object x = this.f.x(t, c);
        if (x == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x;
        }
        return j.a;
    }
}
