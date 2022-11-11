// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import rg2.p;
import ej2.g;
import j5.y;
import ej2.b1;
import jj2.v;
import j5.x;
import lg2.d;
import java.util.concurrent.RejectedExecutionException;
import ml0.a;
import sg2.e;
import rg2.l;
import ej2.t;
import kotlin.coroutines.CoroutineContext$b;
import ej2.z0;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.CoroutineContext;
import lg2.c;

public final class RoomDatabaseKt
{
    public static final Object a(final RoomDatabase l$0, c<? super CoroutineContext> l) {
        Object o = null;
        Label_0046: {
            if (l instanceof RoomDatabaseKt$createTransactionContext$1) {
                final RoomDatabaseKt$createTransactionContext$1 roomDatabaseKt$createTransactionContext$1 = (RoomDatabaseKt$createTransactionContext$1)l;
                final int label = roomDatabaseKt$createTransactionContext$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    roomDatabaseKt$createTransactionContext$1.label = label + Integer.MIN_VALUE;
                    o = roomDatabaseKt$createTransactionContext$1;
                    break Label_0046;
                }
            }
            o = new RoomDatabaseKt$createTransactionContext$1((c)l);
        }
        Object result = ((RoomDatabaseKt$createTransactionContext$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RoomDatabaseKt$createTransactionContext$1)o).label;
        Object o2;
        RoomDatabase roomDatabase;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o2 = ((RoomDatabaseKt$createTransactionContext$1)o).L$1;
            roomDatabase = (RoomDatabase)((RoomDatabaseKt$createTransactionContext$1)o).L$0;
            b.k0(result);
        }
        else {
            b.k0(result);
            final b1 m = lw0.b.m();
            final z0 z0 = (z0)((c)o).getContext().get((CoroutineContext$b)ej2.z0.b.f);
            if (z0 != null) {
                z0.w((l)new RoomDatabaseKt$createTransactionContext$2((t)m));
            }
            final y c = l$0.c;
            e.e((Object)c, "transactionExecutor");
            ((RoomDatabaseKt$createTransactionContext$1)o).L$0 = l$0;
            ((RoomDatabaseKt$createTransactionContext$1)o).L$1 = m;
            ((RoomDatabaseKt$createTransactionContext$1)o).label = 1;
            l = new ej2.l(1, a.V((c)o));
            l.q();
            l.F((l)new RoomDatabaseKt$acquireTransactionThread$2$1((z0)m));
            try {
                c.execute((Runnable)new RoomDatabaseKt$acquireTransactionThread$2$2(l, m));
            }
            catch (final RejectedExecutionException ex) {
                l.o((Throwable)new IllegalStateException("Unable to acquire a thread to perform the database transaction.", ex));
            }
            final Object p = l.p();
            final CoroutineSingletons coroutine_SUSPENDED2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (p == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            roomDatabase = l$0;
            o2 = m;
            result = p;
        }
        final d d = (d)result;
        final x x = new x((t)o2, d);
        final ThreadLocal<Integer> j = roomDatabase.j;
        e.e((Object)j, "suspendingTransactionId");
        return ((CoroutineContext)d).plus((CoroutineContext)x).plus((CoroutineContext)new v(new Integer(System.identityHashCode(o2)), j));
    }
    
    public static final <R> Object b(RoomDatabase l$0, l<? super c<? super R>, ?> l$2, final c<? super R> c) {
        RoomDatabaseKt$withTransaction$1 roomDatabaseKt$withTransaction$2 = null;
        Label_0049: {
            if (c instanceof RoomDatabaseKt$withTransaction$1) {
                final RoomDatabaseKt$withTransaction$1 roomDatabaseKt$withTransaction$1 = (RoomDatabaseKt$withTransaction$1)c;
                final int label = roomDatabaseKt$withTransaction$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    roomDatabaseKt$withTransaction$1.label = label + Integer.MIN_VALUE;
                    roomDatabaseKt$withTransaction$2 = roomDatabaseKt$withTransaction$1;
                    break Label_0049;
                }
            }
            roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$1((c)c);
        }
        Object o = roomDatabaseKt$withTransaction$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = roomDatabaseKt$withTransaction$2.label;
        Object g = null;
        Label_0200: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        b.k0(o);
                        return o;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (l)roomDatabaseKt$withTransaction$2.L$1;
                    l$0 = (RoomDatabase)roomDatabaseKt$withTransaction$2.L$0;
                    b.k0(o);
                }
            }
            else {
                b.k0(o);
                final x x = (x)((c)roomDatabaseKt$withTransaction$2).getContext().get((CoroutineContext$b)j5.x.i);
                if (x != null) {
                    g = x.g;
                    if (g != null) {
                        break Label_0200;
                    }
                }
                roomDatabaseKt$withTransaction$2.L$0 = l$0;
                roomDatabaseKt$withTransaction$2.L$1 = l$2;
                roomDatabaseKt$withTransaction$2.label = 1;
                if ((o = a(l$0, (c<? super CoroutineContext>)roomDatabaseKt$withTransaction$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            g = o;
        }
        final RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$3 = new RoomDatabaseKt$withTransaction$2(l$0, l$2, (c)null);
        roomDatabaseKt$withTransaction$2.L$0 = null;
        roomDatabaseKt$withTransaction$2.L$1 = null;
        roomDatabaseKt$withTransaction$2.label = 2;
        if ((o = ej2.g.l((CoroutineContext)g, (p)roomDatabaseKt$withTransaction$3, (c)roomDatabaseKt$withTransaction$2)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return o;
    }
}
