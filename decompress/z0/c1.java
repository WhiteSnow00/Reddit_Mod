// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import android.os.BaseBundle;
import java.util.Iterator;
import eg.p0;
import java.util.List;
import java.util.concurrent.Executor;
import n02.r;
import android.os.Bundle;
import com.google.firebase.database.snapshot.Node;
import c2.l;
import xe.g;
import z1.n;
import z1.i;
import z1.t;
import ke.o;
import xe.h;
import qd.s;
import com.reddit.data.common.CommunityErrorType;
import z1.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import g1.b;
import java.util.HashMap;
import ah2.f;
import java.util.concurrent.Executors;
import java.lang.ref.ReferenceQueue;
import a1.e;
import java.lang.ref.Reference;
import eg.r0;
import ke.c0;
import xe.c;
import xe.a;

public final class c1 implements a, c, c0, r0
{
    public final Object f = f;
    public Object g = g;
    
    public c1(final int n) {
        if (n == 2) {
            this.f = new e(new Reference[16]);
            this.g = new ReferenceQueue();
            return;
        }
        if (n == 3) {
            final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            ah2.f.b((Object)singleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
            this.f = singleThreadScheduledExecutor;
            return;
        }
        if (n == 4) {
            this.f = new HashMap();
            this.g = new HashMap();
            return;
        }
        if (n != 5) {
            this.f = new AtomicReference(b.a);
            this.g = new Object();
            return;
        }
        this.f = new AtomicReference();
        this.g = new j0.b();
    }
    
    @Override
    public final x6.h a(final o o) {
        ((x6.h)this.f).e((String)this.g, o);
        return (x6.h)this.f;
    }
    
    public final void b(final long n, final e2.b b) {
        ah2.f.f((Object)b, "pointerInputFilters");
        Object o = this.g;
        final int i = b.i;
        int j = 0;
        int n2 = 1;
        while (j < i) {
            final t t = (t)b.f[j];
            Label_0238: {
                int n3;
                if ((n3 = n2) != 0) {
                    final e<i> a = ((j)o).a;
                    final int h = a.h;
                    i k = null;
                    Label_0130: {
                        if (h > 0) {
                            final i[] f = a.f;
                            int n4 = 0;
                            do {
                                k = f[n4];
                                if (ah2.f.a((Object)k.b, (Object)t)) {
                                    break Label_0130;
                                }
                            } while (++n4 < h);
                        }
                        k = null;
                    }
                    final i l = k;
                    if (l != null) {
                        l.h = true;
                        if (!l.c.f(new n(n))) {
                            l.c.b(new n(n));
                        }
                        o = l;
                        break Label_0238;
                    }
                    n3 = 0;
                }
                final i m = new i(t);
                m.c.b(new n(n));
                ((j)o).a.b(m);
                o = m;
                n2 = n3;
            }
            ++j;
        }
    }
    
    @Override
    public final void c(final g g) {
        ((s)this.g).b.remove(this.f);
    }
    
    public final boolean d(final z1.f f, final boolean b) {
        final boolean a = ((j)this.g).a(f.a, (l)this.f, f, b);
        final boolean b2 = false;
        if (!a) {
            return false;
        }
        final boolean e = ((j)this.g).e(f.a, (l)this.f, f, b);
        if (!((j)this.g).d(f)) {
            final boolean b3 = b2;
            if (!e) {
                return b3;
            }
        }
        return true;
    }
    
    public final Object e() {
        final g1.a a = ((AtomicReference)this.f).get();
        final int a2 = a.a(Thread.currentThread().getId());
        Object o;
        if (a2 >= 0) {
            o = a.c[a2];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final Node f() {
        final Object f = this.f;
        Node f2;
        if (((vh.a)f).b) {
            f2 = ((vh.a)f).a.f;
        }
        else {
            f2 = null;
        }
        return f2;
    }
    
    public final Node g() {
        final Object g = this.g;
        Node f;
        if (((vh.a)g).b) {
            f = ((vh.a)g).a.f;
        }
        else {
            f = null;
        }
        return f;
    }
    
    public final void h(final Object o) {
        final long id = Thread.currentThread().getId();
        synchronized (this.g) {
            final g1.a a = ((AtomicReference)this.f).get();
            final int a2 = a.a(id);
            boolean b;
            if (a2 < 0) {
                b = false;
            }
            else {
                a.c[a2] = o;
                b = true;
            }
            if (b) {
                return;
            }
            ((AtomicReference)this.f).set(a.b(id, o));
            final pg2.j a3 = pg2.j.a;
        }
    }
    
    public final c1 i(final xh.c c, final boolean b, final boolean b2) {
        return new c1(new vh.a(c, b, b2), this.g);
    }
    
    @Override
    public final Object then(g o) {
        final nd.c c = (nd.c)this.f;
        final Bundle bundle = (Bundle)this.g;
        c.getClass();
        if (o.n()) {
            final Bundle bundle2 = (Bundle)o.j();
            if (bundle2 != null && ((BaseBundle)bundle2).containsKey("google.messenger")) {
                o = c.b(bundle).o((Executor)nd.t.f, (xe.f)r.f);
            }
        }
        return o;
    }
    
    public final Object zza() {
        final com.google.android.play.core.assetpacks.i i = (com.google.android.play.core.assetpacks.i)this.f;
        final List list = (List)this.g;
        i.getClass();
        final HashMap hashMap = new HashMap();
        for (final p0 p0 : i.e.values()) {
            final String a = p0.c.a;
            if (list.contains(a)) {
                final p0 p2 = hashMap.get(a);
                int a2;
                if (p2 == null) {
                    a2 = -1;
                }
                else {
                    a2 = p2.a;
                }
                if (a2 >= p0.a) {
                    continue;
                }
                hashMap.put(a, p0);
            }
        }
        return hashMap;
    }
}
