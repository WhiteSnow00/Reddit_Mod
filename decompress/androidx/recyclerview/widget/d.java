// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class d<T>
{
    public static final c h;
    public final a0 a;
    public final androidx.recyclerview.widget.c<T> b;
    public c c;
    public final CopyOnWriteArrayList d;
    public List<T> e;
    public List<T> f;
    public int g;
    
    static {
        h = new c();
    }
    
    public d(final androidx.recyclerview.widget.b a, final androidx.recyclerview.widget.c b) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.emptyList();
        this.a = (a0)a;
        this.b = b;
        this.c = androidx.recyclerview.widget.d.h;
    }
    
    public final void a(final List<T> list, final Runnable runnable) {
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((b<T>)iterator.next()).a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public final void b(final List<T> e, final Runnable runnable) {
        final int g = this.g + 1;
        this.g = g;
        final List<T> e2 = this.e;
        if (e == e2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        final List<T> f = this.f;
        if (e == null) {
            final int size = e2.size();
            this.e = null;
            this.f = Collections.emptyList();
            this.a.c(0, size);
            this.a(f, runnable);
            return;
        }
        if (e2 == null) {
            this.e = e;
            this.f = Collections.unmodifiableList((List<? extends T>)e);
            this.a.b(0, e.size());
            this.a(f, runnable);
            return;
        }
        this.b.a.execute(new Runnable() {
            public final /* synthetic */ d j;
            
            @Override
            public final void run() {
                androidx.recyclerview.widget.d.this.c.execute(new Runnable() {
                    public final /* synthetic */ n$e f = n.a((n$b)new d$a$a(this), true);
                    
                    @Override
                    public final void run() {
                        final Runnable g = Runnable.this;
                        final d j = g.j;
                        if (j.g == g) {
                            final List g2 = e;
                            final n$e f = this.f;
                            final Runnable i = runnable;
                            final List<T> f2 = j.f;
                            j.e = g2;
                            j.f = (List<T>)Collections.unmodifiableList((List<?>)g2);
                            f.a(j.a);
                            j.a(f2, i);
                        }
                    }
                });
            }
        });
    }
    
    public interface b<T>
    {
        void a(final List<T> p0, final List<T> p1);
    }
    
    public static final class c implements Executor
    {
        public final Handler f;
        
        public c() {
            this.f = new Handler(Looper.getMainLooper());
        }
        
        @Override
        public final void execute(final Runnable runnable) {
            this.f.post(runnable);
        }
    }
}
