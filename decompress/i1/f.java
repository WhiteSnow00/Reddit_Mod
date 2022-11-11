// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.Set;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import rg2.p;
import z0.c1;
import hg2.j;
import rg2.l;
import vl.a;
import sg2.e;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotIdSet;

public abstract class f
{
    public SnapshotIdSet a;
    public int b;
    public boolean c;
    public int d;
    
    public f(int n, SnapshotIdSet e) {
        this.a = e;
        this.b = n;
        Label_0136: {
            if (n != 0) {
                e = this.e();
                final l<SnapshotIdSet, j> a = SnapshotKt.a;
                e.f((Object)e, "invalid");
                final int[] i = e.i;
                Label_0110: {
                    if (i != null) {
                        n = i[0];
                    }
                    else {
                        final long g = e.g;
                        int h;
                        if (g != 0L) {
                            h = e.h;
                            n = vl.a.k(g);
                        }
                        else {
                            final long f = e.f;
                            if (f == 0L) {
                                break Label_0110;
                            }
                            h = e.h + 64;
                            n = vl.a.k(f);
                        }
                        n += h;
                    }
                }
                synchronized (SnapshotKt.c) {
                    n = SnapshotKt.f.a(n);
                    break Label_0136;
                }
            }
            n = -1;
        }
        this.d = n;
    }
    
    public static void o(final f f) {
        SnapshotKt.b.k((Object)f);
    }
    
    public final void a() {
        synchronized (SnapshotKt.c) {
            this.b();
            this.n();
            final j a = j.a;
        }
    }
    
    public void b() {
        SnapshotKt.d = SnapshotKt.d.d(this.d());
    }
    
    public void c() {
        this.c = true;
        synchronized (SnapshotKt.c) {
            final int d = this.d;
            if (d >= 0) {
                SnapshotKt.s(d);
                this.d = -1;
            }
            final j a = j.a;
        }
    }
    
    public int d() {
        return this.b;
    }
    
    public SnapshotIdSet e() {
        return this.a;
    }
    
    public abstract l<Object, j> f();
    
    public abstract boolean g();
    
    public abstract l<Object, j> h();
    
    public final f i() {
        final c1 b = SnapshotKt.b;
        final f f = (f)b.h();
        b.k((Object)this);
        return f;
    }
    
    public abstract void j(final f p0);
    
    public abstract void k(final f p0);
    
    public abstract void l();
    
    public abstract void m(final w p0);
    
    public void n() {
        final int d = this.d;
        if (d >= 0) {
            SnapshotKt.s(d);
            this.d = -1;
        }
    }
    
    public void p(final int b) {
        this.b = b;
    }
    
    public void q(final SnapshotIdSet a) {
        e.f((Object)a, "<set-?>");
        this.a = a;
    }
    
    public abstract f r(final l<Object, j> p0);
    
    public static final class a
    {
        public static f a() {
            return SnapshotKt.g((f)SnapshotKt.b.h(), null, false);
        }
        
        public static Object b(final rg2.a a, l r) {
            e.f((Object)a, "block");
            if (r == null) {
                return a.invoke();
            }
            final f f = (f)SnapshotKt.b.h();
            if (f != null && !(f instanceof i1.a)) {
                if (r == null) {
                    return a.invoke();
                }
                r = f.r((l<Object, j>)r);
            }
            else {
                i1.a a2;
                if (f instanceof i1.a) {
                    a2 = (i1.a)f;
                }
                else {
                    a2 = null;
                }
                r = new z(a2, (l)r, (l)null, true, false);
            }
            try {
                final f i = ((f)r).i();
                try {
                    return a.invoke();
                }
                finally {
                    i1.f.o(i);
                }
            }
            finally {
                ((f)r).c();
            }
        }
        
        public static i1.e c(final p p) {
            e.f((Object)p, "observer");
            SnapshotKt.f((l<? super SnapshotIdSet, ?>)SnapshotKt.a);
            synchronized (SnapshotKt.c) {
                SnapshotKt.g.add(p);
                monitorexit(SnapshotKt.c);
                return new i1.e(p);
            }
        }
        
        public static void d() {
            synchronized (SnapshotKt.c) {
                final Set g = ((i1.a)SnapshotKt.i.get()).g;
                int n = 0;
                if (g != null) {
                    final boolean empty = g.isEmpty();
                    n = n;
                    if (empty ^ true) {
                        n = 1;
                    }
                }
                monitorexit(SnapshotKt.c);
                if (n != 0) {
                    SnapshotKt.a();
                }
            }
        }
        
        public static i1.a e(final l l, final l i) {
            final f j = SnapshotKt.i();
            i1.a a;
            if (j instanceof i1.a) {
                a = (i1.a)j;
            }
            else {
                a = null;
            }
            if (a != null) {
                final i1.a y = a.y(l, i);
                if (y != null) {
                    return y;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }
}
