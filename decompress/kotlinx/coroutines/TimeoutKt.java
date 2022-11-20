// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import zi2.a;
import ej2.q;
import kotlin.jvm.internal.Ref$ObjectRef;
import cg.d;
import p2.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.w;
import ng2.k;
import mg2.l;
import zi2.n0;
import zi2.g;
import gg2.c;
import zi2.c0;
import mg2.p;
import zi2.w1;

public final class TimeoutKt
{
    public static final <U, T extends U> Object a(final w1<U, ? super T> w1, final p<? super c0, ? super c<? super T>, ?> p2) {
        ((JobSupport)w1).R((l)new n0(g.e(((q)w1).h.getContext()).d(w1.i, (Runnable)w1, ((a)w1).g)));
        boolean b = false;
        Object t;
        try {
            k.e(2, (Object)p2);
            p2.invoke((Object)w1, (Object)w1);
        }
        finally {
            final Throwable t2;
            t = new w(t2, false);
        }
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (t == coroutine_SUSPENDED) {
            t = coroutine_SUSPENDED;
        }
        else {
            final Object r0 = ((JobSupport)w1).r0(t);
            if (r0 == p2.b.l) {
                t = coroutine_SUSPENDED;
            }
            else if (r0 instanceof w) {
                final Throwable a = ((w)r0).a;
                if (!(a instanceof TimeoutCancellationException) || ((TimeoutCancellationException)a).coroutine != w1) {
                    b = true;
                }
                if (b) {
                    throw a;
                }
                if (t instanceof w) {
                    throw ((w)t).a;
                }
            }
            else {
                t = p2.b.T(r0);
            }
        }
        return t;
    }
    
    public static final <T> Object b(final long n, final p<? super c0, ? super c<? super T>, ?> p3, final c<? super T> c) {
        if (n > 0L) {
            final Object a = a((zi2.w1<Object, ? super Object>)new w1(n, (c)c), (mg2.p<? super c0, ? super c<? super Object>, ?>)p3);
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            return a;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }
    
    public static final <T> Object c(final long j$0, final p<? super c0, ? super c<? super T>, ?> l$0, final c<? super T> c) {
        Object o = null;
        Label_0053: {
            if (c instanceof TimeoutKt$withTimeoutOrNull$1) {
                final TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1)c;
                final int label = timeoutKt$withTimeoutOrNull$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    timeoutKt$withTimeoutOrNull$1.label = label + Integer.MIN_VALUE;
                    o = timeoutKt$withTimeoutOrNull$1;
                    break Label_0053;
                }
            }
            o = new TimeoutKt$withTimeoutOrNull$1((c)c);
        }
        final Object result = ((TimeoutKt$withTimeoutOrNull$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TimeoutKt$withTimeoutOrNull$1)o).label;
        Ref$ObjectRef ref$ObjectRef = null;
        Label_0212: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final Object l$2 = ((TimeoutKt$withTimeoutOrNull$1)o).L$1;
                    final p p3 = (p)((TimeoutKt$withTimeoutOrNull$1)o).L$0;
                    try {
                        d.b4(result);
                        return result;
                    }
                    catch (final TimeoutCancellationException ex) {
                        ref$ObjectRef = (Ref$ObjectRef)l$2;
                        break Label_0212;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            if (j$0 <= 0L) {
                return null;
            }
            final Object l$2 = new Ref$ObjectRef();
            try {
                ((TimeoutKt$withTimeoutOrNull$1)o).L$0 = l$0;
                ((TimeoutKt$withTimeoutOrNull$1)o).L$1 = l$2;
                ((TimeoutKt$withTimeoutOrNull$1)o).J$0 = j$0;
                ((TimeoutKt$withTimeoutOrNull$1)o).label = 1;
                final w1 element = new w1(j$0, (c)o);
                ((Ref$ObjectRef)l$2).element = element;
                final Object a;
                if ((a = a((zi2.w1<Object, ? super Object>)element, (mg2.p<? super c0, ? super c<? super Object>, ?>)l$0)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return a;
            }
            catch (final TimeoutCancellationException ex) {
                ref$ObjectRef = (Ref$ObjectRef)l$2;
            }
        }
        final TimeoutCancellationException ex;
        if (ex.coroutine == ref$ObjectRef.element) {
            return null;
        }
        throw ex;
    }
}
