// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import pg2.j;
import mj2.l;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.a;
import ah2.f;
import kotlin.coroutines.CoroutineContext;
import z0.h0;
import z0.n0;

public final class c<T> implements n0<T>, h0<T>
{
    public final CoroutineContext f;
    public final /* synthetic */ h0<T> g;
    
    public c(final h0<T> g, final CoroutineContext f) {
        ah2.f.f((Object)g, "state");
        ah2.f.f((Object)f, "coroutineContext");
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final CoroutineSingletons Fn(final a l$0, tg2.c c) {
        Object o = null;
        Label_0048: {
            if (c instanceof ProduceStateScopeImpl$awaitDispose$1) {
                o = c;
                final int label = ((ProduceStateScopeImpl$awaitDispose$1)o).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((ProduceStateScopeImpl$awaitDispose$1)o).label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            o = new ProduceStateScopeImpl$awaitDispose$1((c<Object>)this, (tg2.c<? super ProduceStateScopeImpl$awaitDispose$1>)c);
        }
        final Object result = ((ProduceStateScopeImpl$awaitDispose$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((ProduceStateScopeImpl$awaitDispose$1)o).label;
        Label_0104: {
            if (label2 == 0) {
                break Label_0104;
            }
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object o2 = c = (tg2.c)((ProduceStateScopeImpl$awaitDispose$1)o).L$0;
            try {
                aj2.c.Q0(result);
                Label_0166: {
                    c = (tg2.c)o2;
                }
                c = (tg2.c)o2;
                final KotlinNothingValueException ex = new KotlinNothingValueException();
                c = (tg2.c)o2;
                throw ex;
                aj2.c.Q0(result);
                c = (tg2.c)l$0;
                ((ProduceStateScopeImpl$awaitDispose$1)o).L$0 = l$0;
                c = (tg2.c)l$0;
                ((ProduceStateScopeImpl$awaitDispose$1)o).label = 1;
                c = (tg2.c)l$0;
                c = (tg2.c)l$0;
                final l l = new l(1, a80.a.a0((tg2.c)o));
                c = (tg2.c)l$0;
                l.o();
                o2 = l$0;
                c = (tg2.c)l$0;
                iftrue(Label_0166:)(l.n() != coroutine_SUSPENDED);
                return coroutine_SUSPENDED;
            }
            finally {
                ((a)c).invoke();
            }
        }
    }
    
    public final CoroutineContext Kx() {
        return this.f;
    }
    
    @Override
    public final T getValue() {
        return this.g.getValue();
    }
    
    @Override
    public final zg2.l<T, j> q() {
        return this.g.q();
    }
    
    @Override
    public final void setValue(final T value) {
        this.g.setValue(value);
    }
    
    @Override
    public final T t() {
        return this.g.t();
    }
}
