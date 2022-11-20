// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import zd.b;
import kotlinx.coroutines.e;
import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import zi2.c0;
import mg.d0;
import io.reactivex.plugins.RxJavaPlugins;
import at0.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import df2.a;
import mg2.l;

public final class f
{
    public static final a a(final ej2.f f, Runnable runnable, final long n, final l l) {
        final CoroutineContext f2 = f.f;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final a c = io.reactivex.disposables.a.c((Runnable)new c((Object)ref$ObjectRef, 11));
        runnable = (Runnable)l.invoke((Object)new RxSchedulerKt$scheduleTask$toSchedule$1(c, f2, RxJavaPlugins.onSchedule(runnable)));
        Object instance;
        if (!d0.h0((c0)f)) {
            instance = EmptyDisposable.INSTANCE;
        }
        else if (n <= 0L) {
            runnable.run();
            instance = c;
        }
        else {
            ref$ObjectRef.element = g.e(f2).d(n, runnable, f2);
            instance = c;
        }
        return (a)instance;
    }
    
    public static final Object b(a a, final CoroutineContext l$0, final Runnable runnable, final gg2.c c) {
        Object o = null;
        Label_0053: {
            if (c instanceof RxSchedulerKt$scheduleTask$task$1) {
                final RxSchedulerKt$scheduleTask$task$1 rxSchedulerKt$scheduleTask$task$1 = (RxSchedulerKt$scheduleTask$task$1)c;
                final int label = rxSchedulerKt$scheduleTask$task$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    rxSchedulerKt$scheduleTask$task$1.label = label + Integer.MIN_VALUE;
                    o = rxSchedulerKt$scheduleTask$task$1;
                    break Label_0053;
                }
            }
            o = new RxSchedulerKt$scheduleTask$task$1(c);
        }
        final Object result = ((RxSchedulerKt$scheduleTask$task$1)o).result;
        final Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RxSchedulerKt$scheduleTask$task$1)o).label;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                a = (a)((RxSchedulerKt$scheduleTask$task$1)o).L$0;
                try {
                    d.b4(result);
                    return j.a;
                    Label_0128: {
                        a = (a)l$0;
                    }
                    a = (a)l$0;
                    final RxSchedulerKt$scheduleTask$task$2 rxSchedulerKt$scheduleTask$task$2 = new RxSchedulerKt$scheduleTask$task$2(runnable);
                    a = (a)l$0;
                    ((RxSchedulerKt$scheduleTask$task$1)o).L$0 = l$0;
                    a = (a)l$0;
                    ((RxSchedulerKt$scheduleTask$task$1)o).label = 1;
                    a = (a)l$0;
                    iftrue(Label_0184:)(e.a((mg2.a)rxSchedulerKt$scheduleTask$task$2, (gg2.c)o) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    a = (a)j.a;
                    return a;
                    a = (a)coroutine_SUSPENDED;
                    return a;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.b4(result);
                    iftrue(Label_0128:)(!a.isDisposed());
                    return j.a;
                }
                finally {
                    final Throwable t;
                    b.h0((CoroutineContext)a, t);
                }
            }
        }
        Label_0184: {
            a = (a)j.a;
        }
        return a;
    }
}
