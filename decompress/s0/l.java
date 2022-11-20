// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import cg2.j;
import android.support.v4.media.a;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import a1.d;

public final class l<T> implements c<T>
{
    public final d<a<T>> a;
    public int b;
    public a<? extends T> c;
    
    public l() {
        this.a = (d<a<T>>)new d((Object[])new a[16]);
    }
    
    public final void a(final int n, final LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        if (n < 0) {
            throw new IllegalArgumentException(d.h("size should be >=0, but was ", n).toString());
        }
        if (n == 0) {
            return;
        }
        final a a = new a(this.b, n, lazyLayoutIntervalContent);
        this.b += n;
        this.a.b((Object)a);
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
        final StringBuilder o = android.support.v4.media.a.o("Index ", n, ", size ");
        o.append(this.b);
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    public final void c(int u0, final int n, final mg2.l<? super a<? extends T>, j> l) {
        this.b(u0);
        this.b(n);
        if (n >= u0) {
            u0 = vl.a.u0(u0, (d)this.a);
            a a;
            for (int i = ((a)this.a.f[u0]).a; i <= n; i += a.b, ++u0) {
                a = (a)this.a.f[u0];
                l.invoke((Object)a);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("toIndex (");
        sb.append(n);
        sb.append(") should be not smaller than fromIndex (");
        sb.append(u0);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public final a<T> get(int u0) {
        this.b(u0);
        a<? extends T> c = this.c;
        if (c != null) {
            final int a = c.a;
            final int b = c.b;
            int n = 0;
            if (u0 < b + a) {
                n = n;
                if (a <= u0) {
                    n = 1;
                }
            }
            if (n != 0) {
                return (a<T>)c;
            }
        }
        final d<a<T>> a2 = this.a;
        u0 = vl.a.u0(u0, (d)a2);
        c = (a)a2.f[u0];
        this.c = c;
        return (a<T>)c;
    }
    
    @Override
    public final int getSize() {
        return this.b;
    }
}
