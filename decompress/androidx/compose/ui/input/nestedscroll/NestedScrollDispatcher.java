// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.nestedscroll;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u2.l;
import gg2.c;
import zi2.c0;
import mg2.a;

public final class NestedScrollDispatcher
{
    public a<? extends c0> a;
    public c0 b;
    public y1.a c;
    
    public NestedScrollDispatcher() {
        this.a = (a<? extends c0>)new NestedScrollDispatcher$calculateNestedScrollScope.NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    }
    
    public final Object a(long n, final long n2, final c<? super l> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1) {
                final NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1)c;
                final int label = nestedScrollDispatcher$dispatchPostFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    nestedScrollDispatcher$dispatchPostFling$1.label = label + Integer.MIN_VALUE;
                    o = nestedScrollDispatcher$dispatchPostFling$1;
                    break Label_0059;
                }
            }
            o = new NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1(this, (c)c);
        }
        final Object result = ((NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1)o).label;
        Object d;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            d = result;
        }
        else {
            cg.d.b4(result);
            final y1.a c2 = this.c;
            if (c2 == null) {
                final int c3 = l.c;
                n = l.b;
                return new l(n);
            }
            ((NestedScrollDispatcher$dispatchPostFling.NestedScrollDispatcher$dispatchPostFling$1)o).label = 1;
            if ((d = c2.d(n, n2, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        n = ((l)d).a;
        return new l(n);
    }
    
    public final long b(int e, long n, final long n2) {
        final y1.a c = this.c;
        if (c != null) {
            n = c.e(e, n, n2);
        }
        else {
            e = n1.c.e;
            n = n1.c.b;
        }
        return n;
    }
    
    public final Object c(long n, final c<? super l> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1) {
                final NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1)c;
                final int label = nestedScrollDispatcher$dispatchPreFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    nestedScrollDispatcher$dispatchPreFling$1.label = label + Integer.MIN_VALUE;
                    o = nestedScrollDispatcher$dispatchPreFling$1;
                    break Label_0054;
                }
            }
            o = new NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1(this, (c)c);
        }
        final Object result = ((NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1)o).label;
        Object i;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            i = result;
        }
        else {
            d.b4(result);
            final y1.a c2 = this.c;
            if (c2 == null) {
                final int c3 = l.c;
                n = l.b;
                return new l(n);
            }
            ((NestedScrollDispatcher$dispatchPreFling.NestedScrollDispatcher$dispatchPreFling$1)o).label = 1;
            if ((i = c2.i(n, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        n = ((l)i).a;
        return new l(n);
    }
    
    public final long d(int e, long n) {
        final y1.a c = this.c;
        if (c != null) {
            n = c.a(e, n);
        }
        else {
            e = n1.c.e;
            n = n1.c.b;
        }
        return n;
    }
    
    public final c0 e() {
        final c0 c0 = (c0)this.a.invoke();
        if (c0 != null) {
            return c0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
