// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import java.util.Iterator;
import cg.d;
import kotlin.Result;
import cg2.j;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.b;
import kotlin.sequences.SequencesKt__SequencesKt;
import t5.w;
import zi2.a0;
import java.util.List;

public final class a
{
    public static final List<a0> a;
    
    static {
        a = b.a2(SequencesKt__SequencesKt.w1(w.i()));
    }
    
    public static final void a(final CoroutineContext coroutineContext, final Throwable t) {
        for (final a0 a0 : kotlinx.coroutines.a.a) {
            try {
                a0.t(coroutineContext, t);
            }
            finally {
                final Thread currentThread = Thread.currentThread();
                final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                final Throwable t2;
                Throwable t3;
                if (t == t2) {
                    t3 = t;
                }
                else {
                    t3 = new RuntimeException("Exception while trying to handle coroutine exception", t2);
                    xd.a.t(t3, t);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, t3);
            }
        }
        final Thread currentThread2 = Thread.currentThread();
        try {
            xd.a.t(t, (Throwable)new DiagnosticCoroutineContextException(coroutineContext));
            Result.constructor-impl((Object)j.a);
        }
        finally {
            final Throwable t4;
            Result.constructor-impl((Object)d.B1(t4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, t);
    }
}
