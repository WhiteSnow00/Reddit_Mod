// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ej2.z0;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.b0;
import ej2.g;
import ej2.k;
import ej2.s0;
import ej2.l;
import a92.b;
import kotlin.coroutines.CoroutineContext$b;
import j5.x;
import android.os.CancellationSignal;
import rg2.p;
import lg2.c;
import sg2.e;
import hj2.v;
import java.util.concurrent.Callable;

public final class a
{
    public static final v a(final RoomDatabase roomDatabase, final boolean b, final String[] array, final Callable callable) {
        e.f((Object)roomDatabase, "db");
        return new v((p)new CoroutinesRoom$Companion$createFlow$1(b, roomDatabase, array, callable, (c)null));
    }
    
    public static final Object b(final RoomDatabase roomDatabase, final CancellationSignal cancellationSignal, final Callable callable, final c c) {
        Object o;
        if (roomDatabase.o() && roomDatabase.l()) {
            o = callable.call();
        }
        else {
            final x x = (x)c.getContext().get((CoroutineContext$b)j5.x.i);
            Object o2;
            if (x == null || (o2 = x.g) == null) {
                o2 = b.P(roomDatabase);
            }
            final l l = new l(1, ml0.a.V(c));
            l.q();
            l.F((rg2.l)new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, (z0)g.i((b0)s0.f, (CoroutineContext)o2, (CoroutineStart)null, (p)new CoroutinesRoom$Companion$execute$4$job$1(callable, (k)l, (c)null), 2)));
            o = l.p();
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return o;
    }
    
    public static final Object c(final RoomDatabase roomDatabase, final Callable callable, final c c) {
        Object o;
        if (roomDatabase.o() && roomDatabase.l()) {
            o = callable.call();
        }
        else {
            final x x = (x)c.getContext().get((CoroutineContext$b)j5.x.i);
            Object o2;
            if (x == null || (o2 = x.g) == null) {
                o2 = b.R(roomDatabase);
            }
            o = g.l((CoroutineContext)o2, (p)new CoroutinesRoom$Companion$execute$2(callable, (c)null), c);
        }
        return o;
    }
}
