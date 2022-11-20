// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cj2.s;
import kotlinx.coroutines.flow.internal.SafeCollector;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import cj2.f;
import cj2.a;
import cj2.e;

public abstract class AbstractFlow<T> implements e<T>, a<T>
{
    public final Object a(f<? super T> l$0, final c<? super j> c) {
        AbstractFlow$collect$1 abstractFlow$collect$2 = null;
        Label_0051: {
            if (c instanceof AbstractFlow$collect$1) {
                final AbstractFlow$collect$1 abstractFlow$collect$1 = (AbstractFlow$collect$1)c;
                final int label = abstractFlow$collect$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    abstractFlow$collect$1.label = label + Integer.MIN_VALUE;
                    abstractFlow$collect$2 = abstractFlow$collect$1;
                    break Label_0051;
                }
            }
            abstractFlow$collect$2 = new AbstractFlow$collect$1(this, (c)c);
        }
        final Object result = abstractFlow$collect$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = abstractFlow$collect$2.label;
        Label_0173: {
            if (label2 != 0) {
                if (label2 == 1) {
                    l$0 = abstractFlow$collect$2.L$0;
                    try {
                        d.b4(result);
                        break Label_0173;
                    }
                    finally {
                        break Label_0173;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            l$0 = new SafeCollector((f)l$0, ((c)abstractFlow$collect$2).getContext());
            try {
                abstractFlow$collect$2.L$0 = l$0;
                abstractFlow$collect$2.label = 1;
                Object o = ((s)this).f.invoke(l$0, (Object)abstractFlow$collect$2);
                if (o != coroutine_SUSPENDED) {
                    o = j.a;
                }
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                ((SafeCollector)l$0).releaseIntercepted();
                return j.a;
            }
            finally {}
        }
        ((SafeCollector)l$0).releaseIntercepted();
        throw;
    }
}
