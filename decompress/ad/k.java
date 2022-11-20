// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.Comparator;
import ec.a;
import java.util.TreeSet;
import com.google.android.exoplayer2.upstream.cache.b;

public final class k implements b
{
    public final TreeSet<d> a;
    public long b;
    
    public k() {
        this.a = new TreeSet<d>((Comparator<? super d>)new a(4));
    }
    
    @Override
    public final void a(final Cache cache, final long n) {
        if (n != -1L) {
            this.f(cache, n);
        }
    }
    
    public final void b(final Cache cache, final d d) {
        this.a.add(d);
        this.b += d.h;
        this.f(cache, 0L);
    }
    
    @Override
    public final void c() {
    }
    
    public final void d(final d d) {
        this.a.remove(d);
        this.b -= d.h;
    }
    
    public final void e(final Cache cache, final d d, final n n) {
        this.d(d);
        this.b(cache, (d)n);
    }
    
    public final void f(final Cache cache, final long n) {
        while (this.b + n > 268435456L && !this.a.isEmpty()) {
            cache.b((d)this.a.first());
        }
    }
}
