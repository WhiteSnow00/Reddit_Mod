// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import aa1.a;
import rg2.l;
import al0.b;
import a1.e;

public final class j<T> implements c<T>
{
    public final e<c$a<T>> a;
    public int b;
    public c$a<T> c;
    
    public j() {
        this.a = (e<c$a<T>>)new e((Object[])new c$a[16]);
    }
    
    public final void a(final int n, final T t) {
        if (n < 0) {
            throw new IllegalArgumentException(d.h("size should be >=0, but was ", n).toString());
        }
        if (n == 0) {
            return;
        }
        final c$a c$a = new c$a(this.b, n, (Object)t);
        this.b += n;
        this.a.b((Object)c$a);
    }
    
    public final void b(final int n) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < this.b) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder i = al0.b.i("Index ", n, ", size ");
        i.append(this.b);
        throw new IndexOutOfBoundsException(i.toString());
    }
    
    public final void c(int k, final int n, final l<? super c$a<T>, hg2.j> l) {
        this.b(k);
        this.b(n);
        if (n >= k) {
            k = aa1.a.k(k, (e)this.a);
            Object o;
            for (int i = ((c$a)this.a.f[k]).a; i <= n; i += ((c$a)o).b, ++k) {
                o = this.a.f[k];
                l.invoke((Object)o);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(n);
        sb.append(") should be not smaller than fromIndex (");
        sb.append(k);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final c$a<T> get(int k) {
        this.b(k);
        c$a c = this.c;
        if (c != null) {
            final int a = c.a;
            final int b = c.b;
            int n = 0;
            if (k < b + a) {
                n = n;
                if (a <= k) {
                    n = 1;
                }
            }
            if (n != 0) {
                return (c$a<T>)c;
            }
        }
        final e<c$a<T>> a2 = this.a;
        k = aa1.a.k(k, (e)a2);
        c = (c$a)a2.f[k];
        this.c = (c$a<T>)c;
        return (c$a<T>)c;
    }
    
    public final int getSize() {
        return this.b;
    }
}
