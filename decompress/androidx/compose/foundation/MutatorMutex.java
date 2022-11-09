// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import ah2.f;
import mj2.z0;
import zg2.p;
import mj2.g;
import tg2.c;
import zg2.l;
import java.util.concurrent.CancellationException;
import n02.r;
import kotlinx.coroutines.sync.MutexImpl;
import java.util.concurrent.atomic.AtomicReference;

public final class MutatorMutex
{
    public final AtomicReference<a> a;
    public final MutexImpl b;
    
    public MutatorMutex() {
        this.a = new AtomicReference<a>(null);
        this.b = r.d();
    }
    
    public static final void a(final MutatorMutex mutatorMutex, final a a) {
        int i;
        a a2 = null;
    Label_0092:
        do {
            a2 = mutatorMutex.a.get();
            final int n = 0;
            if (a2 != null && a.a.compareTo(a2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            final AtomicReference<a> a3 = mutatorMutex.a;
            while (!a3.compareAndSet(a2, a)) {
                if (a3.get() != a2) {
                    i = n;
                    continue Label_0092;
                }
            }
            i = 1;
        } while (i == 0);
        if (a2 != null) {
            a2.b.a((CancellationException)null);
        }
    }
    
    public final <R> Object b(final MutatePriority mutatePriority, final l<? super c<? super R>, ?> l, final c<? super R> c) {
        return g.e((p)new MutatorMutex$mutate$2(mutatePriority, this, (l)l, (c)null), (c)c);
    }
    
    public final <T, R> Object c(final T t, final MutatePriority mutatePriority, final p<? super T, ? super c<? super R>, ?> p4, final c<? super R> c) {
        return g.e((p)new MutatorMutex$mutateWith$2(mutatePriority, this, (p)p4, (Object)t, (c)null), (c)c);
    }
    
    public static final class a
    {
        public final MutatePriority a;
        public final z0 b;
        
        public a(final MutatePriority a, final z0 b) {
            f.f((Object)a, "priority");
            this.a = a;
            this.b = b;
        }
    }
}
