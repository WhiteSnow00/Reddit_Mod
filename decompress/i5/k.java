// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import m5.d;
import m5.e;

public final class k implements e, d
{
    public static final TreeMap<Integer, k> n;
    public volatile String f;
    public final long[] g;
    public final double[] h;
    public final String[] i;
    public final byte[][] j;
    public final int[] k;
    public final int l;
    public int m;
    
    static {
        n = new TreeMap<Integer, k>();
    }
    
    public k(int l) {
        this.l = l;
        ++l;
        this.k = new int[l];
        this.g = new long[l];
        this.h = new double[l];
        this.i = new String[l];
        this.j = new byte[l][];
    }
    
    public static k d(final int n, final String s) {
        Object n2 = k.n;
        synchronized (n2) {
            final Map.Entry<Integer, Object> ceilingEntry = (Map.Entry<Integer, Object>)((TreeMap<Integer, k>)n2).ceilingEntry(Integer.valueOf(n));
            if (ceilingEntry != null) {
                ((TreeMap<Integer, k>)n2).remove(ceilingEntry.getKey());
                final k k = ceilingEntry.getValue();
                k.f = s;
                k.m = n;
                return k;
            }
            monitorexit(n2);
            n2 = new k(n);
            ((k)n2).f = s;
            ((k)n2).m = n;
            return (k)n2;
        }
    }
    
    public final void a(final d d) {
        for (int i = 1; i <= this.m; ++i) {
            final int n = this.k[i];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n == 5) {
                                d.bindBlob(i, this.j[i]);
                            }
                        }
                        else {
                            d.bindString(i, this.i[i]);
                        }
                    }
                    else {
                        d.bindDouble(i, this.h[i]);
                    }
                }
                else {
                    d.bindLong(i, this.g[i]);
                }
            }
            else {
                d.bindNull(i);
            }
        }
    }
    
    public final String b() {
        return this.f;
    }
    
    public final void bindBlob(final int n, final byte[] array) {
        this.k[n] = 5;
        this.j[n] = array;
    }
    
    public final void bindDouble(final int n, final double n2) {
        this.k[n] = 3;
        this.h[n] = n2;
    }
    
    public final void bindLong(final int n, final long n2) {
        this.k[n] = 2;
        this.g[n] = n2;
    }
    
    public final void bindNull(final int n) {
        this.k[n] = 1;
    }
    
    public final void bindString(final int n, final String s) {
        this.k[n] = 4;
        this.i[n] = s;
    }
    
    public final void close() {
    }
    
    public final void h() {
        final TreeMap<Integer, k> n = i5.k.n;
        synchronized (n) {
            n.put(this.l, this);
            if (n.size() > 15) {
                int i = n.size() - 10;
                final Iterator iterator = n.descendingKeySet().iterator();
                while (i > 0) {
                    iterator.next();
                    iterator.remove();
                    --i;
                }
            }
        }
    }
}
