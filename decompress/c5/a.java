// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import oj2.t;
import pj2.f;

public final class a<T> implements f<T>
{
    public final t<T> f;
    
    public a(final x f) {
        ah2.f.f((Object)f, "channel");
        this.f = (t<T>)f;
    }
    
    public final Object emit(final T t, final c<? super j> c) {
        final Object g = this.f.G((Object)t, (c)c);
        if (g == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return g;
        }
        return j.a;
    }
}
