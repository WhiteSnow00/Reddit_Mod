// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import android.view.Choreographer$FrameCallback;
import a80.a;
import tg2.d$a;
import tg2.c;
import zg2.l;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import ah2.f;
import kotlin.coroutines.CoroutineContext$a;
import zg2.p;
import android.view.Choreographer;
import z0.d0;

public final class AndroidUiFrameClock implements d0
{
    public final Choreographer f;
    
    public AndroidUiFrameClock(final Choreographer f) {
        this.f = f;
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
        final CoroutineContext$a value = c.getContext().get((CoroutineContext$b)d$a.f);
        AndroidUiDispatcher androidUiDispatcher;
        if (value instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher)value;
        }
        else {
            androidUiDispatcher = null;
        }
        final mj2.l i = new mj2.l(1, a80.a.a0(c));
        i.o();
        final AndroidUiFrameClock$a androidUiFrameClock$a = new AndroidUiFrameClock$a(i, this, (l)l);
        Label_0173: {
            if (androidUiDispatcher != null && ah2.f.a((Object)androidUiDispatcher.h, (Object)this.f)) {
                synchronized (androidUiDispatcher.j) {
                    androidUiDispatcher.l.add((Choreographer$FrameCallback)androidUiFrameClock$a);
                    if (!androidUiDispatcher.o) {
                        androidUiDispatcher.o = true;
                        androidUiDispatcher.h.postFrameCallback((Choreographer$FrameCallback)androidUiDispatcher.p);
                    }
                    final j a = j.a;
                    monitorexit(androidUiDispatcher.j);
                    i.I((l)new AndroidUiFrameClock$withFrameNanos$2.AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, (Choreographer$FrameCallback)androidUiFrameClock$a));
                    break Label_0173;
                }
            }
            this.f.postFrameCallback((Choreographer$FrameCallback)androidUiFrameClock$a);
            i.I((l)new AndroidUiFrameClock$withFrameNanos$2.AndroidUiFrameClock$withFrameNanos$2$2(this, (Choreographer$FrameCallback)androidUiFrameClock$a));
        }
        final Object n = i.n();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
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
