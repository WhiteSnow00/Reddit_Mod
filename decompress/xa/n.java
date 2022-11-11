// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import al0.b;

public final class n
{
    public static final String[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    
    static {
        a = new String[] { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
        b = new int[] { 44100, 48000, 32000 };
        c = new int[] { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
        d = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
        e = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
        f = new int[] { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
        g = new int[] { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
    }
    
    public static int a(int n) {
        if ((n & 0xFFE00000) != 0xFFE00000) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 == 0 || n4 == 15) {
            return -1;
        }
        final int n5 = n >>> 10 & 0x3;
        if (n5 == 3) {
            return -1;
        }
        final int n6 = n.b[n5];
        int n7;
        if (n2 == 2) {
            n7 = n6 / 2;
        }
        else {
            n7 = n6;
            if (n2 == 0) {
                n7 = n6 / 4;
            }
        }
        final int n8 = n >>> 9 & 0x1;
        if (n3 == 3) {
            if (n2 == 3) {
                n = n.c[n4 - 1];
            }
            else {
                n = n.d[n4 - 1];
            }
            return (n * 12 / n7 + n8) * 4;
        }
        if (n2 == 3) {
            if (n3 == 2) {
                n = n.e[n4 - 1];
            }
            else {
                n = n.f[n4 - 1];
            }
        }
        else {
            n = n.g[n4 - 1];
        }
        int n9 = 144;
        if (n2 == 3) {
            return al0.b.d(n, 144, n7, n8);
        }
        if (n3 == 1) {
            n9 = 72;
        }
        return al0.b.d(n9, n, n7, n8);
    }
    
    public static int b(int n) {
        if ((n & 0xFFE00000) != 0xFFE00000) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 != 0 && n4 != 15 && (n >>> 10 & 0x3) != 0x3) {
            n = 1152;
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        throw new IllegalArgumentException();
                    }
                    n = 384;
                }
            }
            else if (n2 != 3) {
                n = 576;
            }
            return n;
        }
        return -1;
    }
    
    public static final class a
    {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        
        public final boolean a(final int n) {
            if ((n & 0xFFE00000) != 0xFFE00000) {
                return false;
            }
            final int a = n >>> 19 & 0x3;
            if (a == 1) {
                return false;
            }
            final int n2 = n >>> 17 & 0x3;
            if (n2 == 0) {
                return false;
            }
            final int n3 = n >>> 12 & 0xF;
            if (n3 == 0 || n3 == 15) {
                return false;
            }
            final int n4 = n >>> 10 & 0x3;
            if (n4 == 3) {
                return false;
            }
            this.a = a;
            this.b = n.a[3 - n2];
            final int d = n.b[n4];
            this.d = d;
            final int n5 = 2;
            if (a == 2) {
                this.d = d / 2;
            }
            else if (a == 0) {
                this.d = d / 4;
            }
            final int n6 = n >>> 9 & 0x1;
            int g = 1152;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        throw new IllegalArgumentException();
                    }
                    g = 384;
                }
            }
            else if (a != 3) {
                g = 576;
            }
            this.g = g;
            if (n2 == 3) {
                int f;
                if (a == 3) {
                    f = n.c[n3 - 1];
                }
                else {
                    f = n.d[n3 - 1];
                }
                this.f = f;
                this.c = (f * 12 / this.d + n6) * 4;
            }
            else {
                int n7 = 144;
                if (a == 3) {
                    int f2;
                    if (n2 == 2) {
                        f2 = n.e[n3 - 1];
                    }
                    else {
                        f2 = n.f[n3 - 1];
                    }
                    this.f = f2;
                    this.c = f2 * 144 / this.d + n6;
                }
                else {
                    final int f3 = n.g[n3 - 1];
                    this.f = f3;
                    if (n2 == 1) {
                        n7 = 72;
                    }
                    this.c = n7 * f3 / this.d + n6;
                }
            }
            int e = n5;
            if ((n >> 6 & 0x3) == 0x3) {
                e = 1;
            }
            this.e = e;
            return true;
        }
    }
}
