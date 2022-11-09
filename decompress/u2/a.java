// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import ak0.n;

public final class a
{
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public final long a = a;
    
    static {
        b = new int[] { 18, 20, 17, 15 };
        c = new int[] { 65535, 262143, 32767, 8191 };
        d = new int[] { 32767, 8191, 65535, 262143 };
    }
    
    public static long a(final long n, int j, int h, int i, int g, int n2) {
        if ((n2 & 0x1) != 0x0) {
            j = j(n);
        }
        if ((n2 & 0x2) != 0x0) {
            h = h(n);
        }
        if ((n2 & 0x4) != 0x0) {
            i = i(n);
        }
        if ((n2 & 0x8) != 0x0) {
            g = g(n);
        }
        final int n3 = 0;
        if (i >= 0 && j >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException(a.n("minHeight(", i, ") and minWidth(", j, ") must be >= 0").toString());
        }
        if (h < j && h != Integer.MAX_VALUE) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        if (n2 == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("maxWidth(");
            sb.append(h);
            sb.append(") must be >= minWidth(");
            sb.append(j);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        Label_0126: {
            if (g < i) {
                n2 = n3;
                if (g != Integer.MAX_VALUE) {
                    break Label_0126;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            return a.b(j, h, i, g);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("maxHeight(");
        sb2.append(g);
        sb2.append(") must be >= minHeight(");
        sb2.append(i);
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public static final boolean b(final long n, final long n2) {
        return n == n2;
    }
    
    public static final boolean c(final long n) {
        final int n2 = (int)(0x3L & n);
        return ((int)(n >> a.b[n2] + 31) & a.d[n2]) != 0x0;
    }
    
    public static final boolean d(final long n) {
        return ((int)(n >> 33) & a.c[(int)(0x3L & n)]) != 0x0;
    }
    
    public static final boolean e(final long n) {
        return g(n) == i(n);
    }
    
    public static final boolean f(final long n) {
        return h(n) == j(n);
    }
    
    public static final int g(final long n) {
        final int n2 = (int)(0x3L & n);
        int n3 = (int)(n >> a.b[n2] + 31) & a.d[n2];
        if (n3 == 0) {
            n3 = Integer.MAX_VALUE;
        }
        else {
            --n3;
        }
        return n3;
    }
    
    public static final int h(final long n) {
        int n2 = (int)(n >> 33) & a.c[(int)(0x3L & n)];
        if (n2 == 0) {
            n2 = Integer.MAX_VALUE;
        }
        else {
            --n2;
        }
        return n2;
    }
    
    public static final int i(final long n) {
        final int n2 = (int)(0x3L & n);
        return (int)(n >> a.b[n2]) & a.d[n2];
    }
    
    public static final int j(final long n) {
        return (int)(n >> 2) & a.c[(int)(0x3L & n)];
    }
    
    public static String k(final long n) {
        final int h = h(n);
        String value = "Infinity";
        String value2;
        if (h == Integer.MAX_VALUE) {
            value2 = "Infinity";
        }
        else {
            value2 = String.valueOf(h);
        }
        final int g = g(n);
        if (g != Integer.MAX_VALUE) {
            value = String.valueOf(g);
        }
        final StringBuilder k = a.k("Constraints(minWidth = ");
        k.append(j(n));
        k.append(", maxWidth = ");
        k.append(value2);
        k.append(", minHeight = ");
        k.append(i(n));
        k.append(", maxHeight = ");
        k.append(value);
        k.append(')');
        return k.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            if (a == ((a)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return k(this.a);
    }
    
    public static final class a
    {
        public static int a(int n) {
            if (n < 8191) {
                n = 13;
            }
            else if (n < 32767) {
                n = 15;
            }
            else if (n < 65535) {
                n = 16;
            }
            else {
                if (n >= 262143) {
                    throw new IllegalArgumentException(n.l("Can't represent a size of ", n, " in Constraints"));
                }
                n = 18;
            }
            return n;
        }
        
        public static long b(final int n, int n2, final int n3, int n4) {
            int n5;
            if (n4 == Integer.MAX_VALUE) {
                n5 = n3;
            }
            else {
                n5 = n4;
            }
            final int a = a(n5);
            int n6;
            if (n2 == Integer.MAX_VALUE) {
                n6 = n;
            }
            else {
                n6 = n2;
            }
            final int a2 = a(n6);
            if (a + a2 <= 31) {
                long n7;
                if (a2 != 13) {
                    if (a2 != 18) {
                        if (a2 != 15) {
                            if (a2 != 16) {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                            n7 = 0L;
                        }
                        else {
                            n7 = 2L;
                        }
                    }
                    else {
                        n7 = 1L;
                    }
                }
                else {
                    n7 = 3L;
                }
                final int n8 = 0;
                if (n2 == Integer.MAX_VALUE) {
                    n2 = 0;
                }
                else {
                    ++n2;
                }
                if (n4 == Integer.MAX_VALUE) {
                    n4 = n8;
                }
                else {
                    ++n4;
                }
                final int n9 = u2.a.b[(int)n7];
                return (long)n2 << 33 | (n7 | (long)n << 2) | (long)n3 << n9 | (long)n4 << n9 + 31;
            }
            throw new IllegalArgumentException(ag0.a.n("Can't represent a width of ", n6, " and height of ", n5, " in Constraints"));
        }
        
        public static long c(final int n, final int n2) {
            if (n >= 0 && n2 >= 0) {
                return b(n, n, n2, n2);
            }
            throw new IllegalArgumentException(ag0.a.n("width(", n, ") and height(", n2, ") must be >= 0").toString());
        }
        
        public static long d(final int n) {
            if (n >= 0) {
                return b(0, Integer.MAX_VALUE, n, n);
            }
            throw new IllegalArgumentException(n.l("height(", n, ") must be >= 0").toString());
        }
        
        public static long e(final int n) {
            if (n >= 0) {
                return b(n, n, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(n.l("width(", n, ") must be >= 0").toString());
        }
    }
}
