// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.File;
import java.util.Iterator;
import ad.d0;
import java.util.ArrayList;
import java.util.TreeSet;

public final class f
{
    public final int a;
    public final String b;
    public final TreeSet<n> c;
    public final ArrayList<a> d;
    public j e;
    
    public f(final int a, final String b, final j e) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = new TreeSet<n>();
        this.d = new ArrayList<a>();
    }
    
    public final long a(long h, final long n) {
        boolean b = false;
        d0.c(h >= 0L);
        d0.c(n >= 0L);
        final n b2 = this.b(h, n);
        final boolean i = ((d)b2).i;
        long n2 = Long.MAX_VALUE;
        if (i ^ true) {
            h = ((d)b2).h;
            if (h == -1L) {
                b = true;
            }
            if (b) {
                h = n2;
            }
            return -Math.min(h, n);
        }
        final long n3 = h + n;
        if (n3 >= 0L) {
            n2 = n3;
        }
        long n4;
        long max = n4 = ((d)b2).g + ((d)b2).h;
        if (max < n2) {
            final Iterator<n> iterator = this.c.tailSet(b2, false).iterator();
            do {
                n4 = max;
                if (!iterator.hasNext()) {
                    break;
                }
                final n n5 = iterator.next();
                final long g = ((d)n5).g;
                if (g > max) {
                    n4 = max;
                    break;
                }
                n4 = (max = Math.max(max, g + ((d)n5).h));
            } while (n4 < n2);
        }
        return Math.min(n4 - h, n);
    }
    
    public final n b(final long n, long n2) {
        final n n3 = new n(this.b, n, -1L, -9223372036854775807L, (File)null);
        final n n4 = this.c.floor(n3);
        if (n4 != null && ((d)n4).g + ((d)n4).h > n) {
            return n4;
        }
        final n n5 = this.c.ceiling(n3);
        long min = n2;
        if (n5 != null) {
            final long n6 = ((d)n5).g - n;
            if (n2 == -1L) {
                n2 = n6;
                return new n(this.b, n, n2, -9223372036854775807L, (File)null);
            }
            min = Math.min(n6, n2);
        }
        n2 = min;
        return new n(this.b, n, n2, -9223372036854775807L, (File)null);
    }
    
    public final boolean c(final long n, final long n2) {
        for (int i = 0; i < this.d.size(); ++i) {
            final a a = this.d.get(i);
            final long b = a.b;
            boolean b2 = false;
            Label_0107: {
                Label_0061: {
                    if (b == -1L) {
                        if (n < a.a) {
                            break Label_0061;
                        }
                    }
                    else {
                        if (n2 == -1L) {
                            break Label_0061;
                        }
                        final long a2 = a.a;
                        if (a2 > n || n + n2 > a2 + b) {
                            break Label_0061;
                        }
                    }
                    b2 = true;
                    break Label_0107;
                }
                b2 = false;
            }
            if (b2) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && f.class == o.getClass()) {
            final f f = (f)o;
            if (this.a != f.a || !this.b.equals(f.b) || !this.c.equals(f.c) || !this.e.equals((Object)f.e)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + b.c(this.b, this.a * 31, 31);
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
}
