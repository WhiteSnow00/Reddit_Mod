// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import af2.w;
import sa.r;
import kotlin.coroutines.EmptyCoroutineContext;
import p2.b;
import af2.y;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import af2.t;
import ff2.f;
import hj2.a;
import mg2.p;
import zi2.c0;
import zi2.g;
import gg2.c;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import zi2.k0;
import zi2.s0;
import af2.v;
import kotlin.coroutines.CoroutineContext;

public final class e
{
    public static void a(final CoroutineContext coroutineContext, final cj2.e e, final v v) {
        final s0 f = s0.f;
        final kotlinx.coroutines.f b = k0.b;
        b.getClass();
        ng2.e.f((Object)coroutineContext, "context");
        v.setCancellable((f)new a((zi2.a)g.f((c0)f, CoroutineContext$DefaultImpls.a((CoroutineContext)b, coroutineContext), CoroutineStart.ATOMIC, (p)new RxConvertKt$asObservable$1$job$1(e, v, (c)null))));
    }
    
    public static final CallbackFlowBuilder b(final t t) {
        return b.k((p)new RxConvertKt$asFlow$1((y)t, (c)null));
    }
    
    public static t c(final cj2.e e) {
        return t.create((af2.w<Object>)new r(13, (Object)EmptyCoroutineContext.INSTANCE, (Object)e));
    }
}
