// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.util.Iterator;
import h5.a;
import java.util.Collection;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class m<T>
{
    public final bd.c a;
    public final k b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public boolean g;
    
    public m(final Looper looper, final bd.c c, final b<T> b) {
        this((CopyOnWriteArraySet)new CopyOnWriteArraySet(), looper, c, b);
    }
    
    public m(final CopyOnWriteArraySet<c<T>> d, final Looper looper, final bd.c a, final b<T> c) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = new ArrayDeque<Runnable>();
        this.f = new ArrayDeque<Runnable>();
        this.b = a.c(looper, (Handler$Callback)new l(this, 0));
    }
    
    public final void a(final T t) {
        if (this.g) {
            return;
        }
        t.getClass();
        this.d.add(new c<T>(t));
    }
    
    public final void b() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a()) {
            final k b = this.b;
            b.g((k.a)b.b(0));
        }
        final boolean empty = this.e.isEmpty();
        this.e.addAll((Collection<?>)this.f);
        this.f.clear();
        if (empty ^ true) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }
    
    public final void c(final int n, final a<T> a) {
        this.f.add((Runnable)new h5.a(n, 2, (Object)new CopyOnWriteArraySet(this.d), (Object)a));
    }
    
    public final void d() {
        for (final c c : this.d) {
            final b<T> c2 = this.c;
            c.d = true;
            if (c.c) {
                c2.b((T)c.a, c.b.b());
            }
        }
        this.d.clear();
        this.g = true;
    }
    
    public final void e(final int n, final a<T> a) {
        this.c(n, a);
        this.b();
    }
    
    public interface a<T>
    {
        void invoke(final T p0);
    }
    
    public interface b<T>
    {
        void b(final T p0, final j p1);
    }
    
    public static final class c<T>
    {
        public final T a;
        public j.a b;
        public boolean c;
        public boolean d;
        
        public c(final T a) {
            this.a = a;
            this.b = new j.a();
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o != null && c.class == o.getClass() && this.a.equals(((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
