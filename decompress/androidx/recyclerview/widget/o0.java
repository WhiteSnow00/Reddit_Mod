// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import j0.f;
import j0.i;

public final class o0
{
    public final i<RecyclerView$f0, a> a;
    public final f<RecyclerView$f0> b;
    
    public o0() {
        this.a = (i<RecyclerView$f0, a>)new i();
        this.b = (f<RecyclerView$f0>)new f();
    }
    
    public final void a(final RecyclerView$f0 recyclerView$f0, final RecyclerView$l$c c) {
        a a;
        if ((a = (a)this.a.getOrDefault((Object)recyclerView$f0, (Object)null)) == null) {
            a = o0.a.a();
            this.a.put((Object)recyclerView$f0, (Object)a);
        }
        a.c = c;
        a.a |= 0x8;
    }
    
    public final void b(final RecyclerView$f0 recyclerView$f0, final RecyclerView$l$c b) {
        a a;
        if ((a = (a)this.a.getOrDefault((Object)recyclerView$f0, (Object)null)) == null) {
            a = o0.a.a();
            this.a.put((Object)recyclerView$f0, (Object)a);
        }
        a.b = b;
        a.a |= 0x4;
    }
    
    public final RecyclerView$l$c c(final RecyclerView$f0 recyclerView$f0, final int n) {
        final int f = this.a.f((Object)recyclerView$f0);
        if (f < 0) {
            return null;
        }
        final a a = (a)this.a.n(f);
        if (a != null) {
            final int a2 = a.a;
            if ((a2 & n) != 0x0) {
                final int a3 = a2 & ~n;
                a.a = a3;
                RecyclerView$l$c recyclerView$l$c;
                if (n == 4) {
                    recyclerView$l$c = a.b;
                }
                else {
                    if (n != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    recyclerView$l$c = a.c;
                }
                if ((a3 & 0xC) == 0x0) {
                    this.a.l(f);
                    a.a = 0;
                    a.b = null;
                    a.c = null;
                    o0.a.d.b((Object)a);
                }
                return recyclerView$l$c;
            }
        }
        return null;
    }
    
    public final void d(final RecyclerView$f0 recyclerView$f0) {
        final a a = (a)this.a.getOrDefault((Object)recyclerView$f0, (Object)null);
        if (a == null) {
            return;
        }
        a.a &= 0xFFFFFFFE;
    }
    
    public final void e(final RecyclerView$f0 recyclerView$f0) {
        int i = this.b.h() - 1;
        while (i >= 0) {
            if (recyclerView$f0 == this.b.i(i)) {
                final f<RecyclerView$f0> b = this.b;
                final Object[] h = b.h;
                final Object o = h[i];
                final Object j = f.j;
                if (o != j) {
                    h[i] = j;
                    b.f = true;
                    break;
                }
                break;
            }
            else {
                --i;
            }
        }
        final a a = (a)this.a.remove((Object)recyclerView$f0);
        if (a != null) {
            a.a = 0;
            a.b = null;
            a.c = null;
            o0.a.d.b((Object)a);
        }
    }
    
    public static final class a
    {
        public static z3.f d;
        public int a;
        public RecyclerView$l$c b;
        public RecyclerView$l$c c;
        
        static {
            a.d = new z3.f(20);
        }
        
        public static a a() {
            a a;
            if ((a = (a)o0.a.d.a()) == null) {
                a = new a();
            }
            return a;
        }
    }
    
    public interface b
    {
    }
}
