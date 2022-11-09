// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import uj2.b;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import rj2.m;
import mj2.j0;
import tg2.c;
import zg2.l;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import zg2.p;
import z0.d0;

public final class SdkStubsFallbackFrameClock implements d0
{
    public static final SdkStubsFallbackFrameClock f;
    
    static {
        f = new SdkStubsFallbackFrameClock();
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        ah2.f.f((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    @Override
    public final <R> Object k(final l<? super Long, ? extends R> l, final c<? super R> c) {
        final b a = j0.a;
        return g.l((CoroutineContext)m.a, (p)new SdkStubsFallbackFrameClock$withFrameNanos.SdkStubsFallbackFrameClock$withFrameNanos$2((l)l, (c)null), (c)c);
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        ah2.f.f((Object)coroutineContext$b, "key");
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        ah2.f.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
}
