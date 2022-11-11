// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Map;
import n.b$d;
import m.a;
import n.b;

public abstract class LiveData<T>
{
    public static final Object k;
    public final Object a;
    public n.b<y<? super T>, c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final LiveData$a j;
    
    static {
        k = new Object();
    }
    
    public LiveData() {
        this.a = new Object();
        this.b = (n.b<y<? super T>, c>)new n.b();
        this.c = 0;
        final Object k = LiveData.k;
        this.f = k;
        this.j = new Runnable() {
            @Override
            public final void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                    monitorexit(LiveData.this.a);
                    LiveData.this.k(f);
                }
            }
        };
        this.e = k;
        this.g = -1;
    }
    
    public LiveData(final T e) {
        this.a = new Object();
        this.b = (n.b<y<? super T>, c>)new n.b();
        this.c = 0;
        this.f = LiveData.k;
        this.j = new Runnable() {
            @Override
            public final void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                    monitorexit(LiveData.this.a);
                    LiveData.this.k(f);
                }
            }
        };
        this.e = e;
        this.g = 0;
    }
    
    public static void a(final String s) {
        if (a.X0().Y0()) {
            return;
        }
        throw new IllegalStateException(a.k("Cannot invoke ", s, " on a background thread"));
    }
    
    public final void b(final c c) {
        if (!c.g) {
            return;
        }
        if (!c.j()) {
            c.d(false);
            return;
        }
        final int h = c.h;
        final int g = this.g;
        if (h >= g) {
            return;
        }
        c.h = g;
        c.f.a((Object)this.e);
    }
    
    public final void c(c c) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            c c2 = null;
            Label_0105: {
                if (c != null) {
                    this.b(c);
                    c2 = null;
                }
                else {
                    final n.b<y<? super T>, c> b = this.b;
                    b.getClass();
                    final b$d b$d = new b$d((n.b)b);
                    b.h.put(b$d, Boolean.FALSE);
                    do {
                        c2 = c;
                        if (!b$d.hasNext()) {
                            break Label_0105;
                        }
                        this.b((c)((Map.Entry)b$d.next()).getValue());
                    } while (!this.i);
                    c2 = c;
                }
            }
            c = c2;
        } while (this.i);
        this.h = false;
    }
    
    public T d() {
        final Object e = this.e;
        if (e != LiveData.k) {
            return (T)e;
        }
        return null;
    }
    
    public final void e(final q q, final y<? super T> y) {
        a("observe");
        if (q.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        final LiveData.LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData.LiveData$LifecycleBoundObserver(this, q, (y)y);
        final c c = (c)this.b.b((Object)y, (Object)liveData$LifecycleBoundObserver);
        if (c != null && !c.h(q)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        q.getLifecycle().a((p)liveData$LifecycleBoundObserver);
    }
    
    public final void f(final y<? super T> y) {
        a("observeForever");
        final b b = new b(y);
        final c c = (c)this.b.b((Object)y, (Object)b);
        if (c instanceof LiveData.LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        ((c)b).d(true);
    }
    
    public void g() {
    }
    
    public void h() {
    }
    
    public void i(final T f) {
        synchronized (this.a) {
            final boolean b = this.f == LiveData.k;
            this.f = f;
            monitorexit(this.a);
            if (!b) {
                return;
            }
            m.a.X0().Z0((Runnable)this.j);
        }
    }
    
    public void j(final y<? super T> y) {
        a("removeObserver");
        final c c = (c)this.b.c((Object)y);
        if (c == null) {
            return;
        }
        c.e();
        c.d(false);
    }
    
    public void k(final T e) {
        a("setValue");
        ++this.g;
        this.e = e;
        this.c(null);
    }
    
    public final class b extends c
    {
        public b(final LiveData liveData, final y<? super T> y) {
            super(y);
        }
        
        @Override
        public final boolean j() {
            return true;
        }
    }
    
    public abstract class c
    {
        public final y<? super T> f;
        public boolean g;
        public int h;
        
        public c(final y<? super T> f) {
            this.h = -1;
            this.f = f;
        }
        
        public final void d(final boolean g) {
            if (g == this.g) {
                return;
            }
            this.g = g;
            final LiveData i = LiveData.this;
            int n;
            if (g) {
                n = 1;
            }
            else {
                n = -1;
            }
            int c = i.c;
            i.c = n + c;
            Label_0140: {
                if (i.d) {
                    break Label_0140;
                }
                i.d = true;
                try {
                    while (true) {
                        final int c2 = i.c;
                        if (c == c2) {
                            break;
                        }
                        final boolean b = c == 0 && c2 > 0;
                        final boolean b2 = c > 0 && c2 == 0;
                        if (b) {
                            i.g();
                        }
                        else if (b2) {
                            i.h();
                        }
                        c = c2;
                    }
                    i.d = false;
                    if (this.g) {
                        LiveData.this.c(this);
                    }
                }
                finally {
                    i.d = false;
                }
            }
        }
        
        public void e() {
        }
        
        public boolean h(final q q) {
            return false;
        }
        
        public abstract boolean j();
    }
}
