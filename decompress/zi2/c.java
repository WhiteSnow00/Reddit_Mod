// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import mg2.l;
import cg.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class c<T>
{
    public static final AtomicIntegerFieldUpdater b;
    public final f0<T>[] a;
    public volatile int notCompletedCount;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");
    }
    
    public c(final f0<? extends T>[] a) {
        this.a = (f0<T>[])a;
        this.notCompletedCount = a.length;
    }
    
    public final Object a(final gg2.c<? super List<? extends T>> c) {
        final m m = new m(1, d.e3((gg2.c)c));
        m.r();
        final int length = this.a.length;
        final c.c$a[] array = new c.c$a[length];
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            final f0<T> f0 = this.a[i];
            ((z0)f0).start();
            final c.c$a c$a = new c.c$a(this, m);
            c$a.k = ((z0)f0).R((l<? super Throwable, j>)c$a);
            final j a = j.a;
            array[i] = c$a;
        }
        final c.c$b c$b = new c.c$b(array);
        for (int j = n; j < length; ++j) {
            array[j].E(c$b);
        }
        if (m.b()) {
            c$b.b();
        }
        else {
            m.Z((l)c$b);
        }
        final Object q = m.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return q;
    }
}
