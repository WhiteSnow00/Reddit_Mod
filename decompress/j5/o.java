// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import n5.c;
import n5.d;

public final class o implements d, c
{
    public static final TreeMap<Integer, o> n;
    public volatile String f;
    public final long[] g;
    public final double[] h;
    public final String[] i;
    public final byte[][] j;
    public final int[] k;
    public final int l;
    public int m;
    
    static {
        n = new TreeMap<Integer, o>();
    }
    
    public o(int l) {
        this.l = l;
        ++l;
        this.k = new int[l];
        this.g = new long[l];
        this.h = new double[l];
        this.i = new String[l];
        this.j = new byte[l][];
    }
    
    public static o a(final int n, final String s) {
        Object n2 = o.n;
        synchronized (n2) {
            final Map.Entry<Integer, Object> ceilingEntry = (Map.Entry<Integer, Object>)((TreeMap<Integer, o>)n2).ceilingEntry(Integer.valueOf(n));
            if (ceilingEntry != null) {
                ((TreeMap<Integer, o>)n2).remove(ceilingEntry.getKey());
                final o o = ceilingEntry.getValue();
                o.f = s;
                o.m = n;
                return o;
            }
            monitorexit(n2);
            n2 = new o(n);
            ((o)n2).f = s;
            ((o)n2).m = n;
            return (o)n2;
        }
    }
    
    @Override
    public final String b() {
        return this.f;
    }
    
    @Override
    public final void bindBlob(final int n, final byte[] array) {
        this.k[n] = 5;
        this.j[n] = array;
    }
    
    @Override
    public final void bindDouble(final int n, final double n2) {
        this.k[n] = 3;
        this.h[n] = n2;
    }
    
    @Override
    public final void bindLong(final int n, final long n2) {
        this.k[n] = 2;
        this.g[n] = n2;
    }
    
    @Override
    public final void bindNull(final int n) {
        this.k[n] = 1;
    }
    
    @Override
    public final void bindString(final int n, final String s) {
        this.k[n] = 4;
        this.i[n] = s;
    }
    
    @Override
    public final void c(final c c) {
        for (int i = 1; i <= this.m; ++i) {
            final int n = this.k[i];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n == 5) {
                                c.bindBlob(i, this.j[i]);
                            }
                        }
                        else {
                            c.bindString(i, this.i[i]);
                        }
                    }
                    else {
                        c.bindDouble(i, this.h[i]);
                    }
                }
                else {
                    c.bindLong(i, this.g[i]);
                }
            }
            else {
                c.bindNull(i);
            }
        }
    }
    
    @Override
    public final void close() {
    }
    
    public final void h() {
        final TreeMap<Integer, o> n = o.n;
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
