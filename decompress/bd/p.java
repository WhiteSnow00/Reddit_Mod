// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.util.Arrays;
import ag0.a;

public final class p
{
    public static final byte[] a;
    public static final float[] b;
    public static final Object c;
    public static int[] d;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f };
        c = new Object();
        p.d = new int[10];
    }
    
    public static void a(final boolean[] array) {
        array[0] = false;
        array[2] = (array[1] = false);
    }
    
    public static int b(final byte[] array, int i, final int n, final boolean[] array2) {
        final int n2 = n - i;
        final boolean b = false;
        d0.f(n2 >= 0);
        if (n2 == 0) {
            return n;
        }
        if (array2[0]) {
            a(array2);
            return i - 3;
        }
        if (n2 > 1 && array2[1] && array[i] == 1) {
            a(array2);
            return i - 2;
        }
        if (n2 > 2 && array2[2] && array[i] == 0 && array[i + 1] == 1) {
            a(array2);
            return i - 1;
        }
        int n3;
        for (n3 = n - 1, i += 2; i < n3; i += 3) {
            final byte b2 = array[i];
            if ((b2 & 0xFE) == 0x0) {
                final int n4 = i - 2;
                if (array[n4] == 0 && array[i - 1] == 0 && b2 == 1) {
                    a(array2);
                    return n4;
                }
                i -= 2;
            }
        }
        array2[0] = ((n2 <= 2) ? ((n2 != 2) ? (array2[1] && array[n3] == 1) : (array2[2] && array[n - 2] == 0 && array[n3] == 1)) : (array[n - 3] == 0 && array[n - 2] == 0 && array[n3] == 1));
        array2[1] = ((n2 > 1) ? (array[n - 2] == 0 && array[n3] == 0) : (array2[2] && array[n3] == 0));
        boolean b3 = b;
        if (array[n3] == 0) {
            b3 = true;
        }
        array2[2] = b3;
        return n;
    }
    
    public static a c(int i, int j, final byte[] array) {
        final t t = new t(array, i + 2, j);
        t.j(4);
        final int e = t.e(3);
        t.i();
        final int e2 = t.e(2);
        final boolean d = t.d();
        final int e3 = t.e(5);
        j = 0;
        int n = 0;
        while (j < 32) {
            i = n;
            if (t.d()) {
                i = (n | 1 << j);
            }
            ++j;
            n = i;
        }
        final int[] array2 = new int[6];
        for (i = 0; i < 6; ++i) {
            array2[i] = t.e(8);
        }
        final int e4 = t.e(8);
        i = 0;
        for (int k = 0; k < e; ++k) {
            j = i;
            if (t.d()) {
                j = i + 89;
            }
            i = j;
            if (t.d()) {
                i = j + 8;
            }
        }
        t.j(i);
        if (e > 0) {
            t.j((8 - e) * 2);
        }
        t.f();
        j = t.f();
        if (j == 3) {
            t.i();
        }
        final int f = t.f();
        final int f2 = t.f();
        int n2 = f;
        i = f2;
        if (t.d()) {
            final int f3 = t.f();
            final int f4 = t.f();
            final int f5 = t.f();
            final int f6 = t.f();
            if (j != 1 && j != 2) {
                i = 1;
            }
            else {
                i = 2;
            }
            if (j == 1) {
                j = 2;
            }
            else {
                j = 1;
            }
            n2 = f - (f3 + f4) * i;
            i = f2 - (f5 + f6) * j;
        }
        t.f();
        t.f();
        final int f7 = t.f();
        if (t.d()) {
            j = 0;
        }
        else {
            j = e;
        }
        while (j <= e) {
            t.f();
            t.f();
            t.f();
            ++j;
        }
        t.f();
        t.f();
        t.f();
        t.f();
        t.f();
        t.f();
        if (t.d() && t.d()) {
            int l;
            int min;
            int n3;
            int n4;
            for (j = 0; j < 4; ++j) {
                for (l = 0; l < 6; l += n4) {
                    if (!t.d()) {
                        t.f();
                    }
                    else {
                        min = Math.min(64, 1 << (j << 1) + 4);
                        if (j > 1) {
                            t.g();
                        }
                        for (n3 = 0; n3 < min; ++n3) {
                            t.g();
                        }
                    }
                    if (j == 3) {
                        n4 = 3;
                    }
                    else {
                        n4 = 1;
                    }
                }
            }
        }
        t.j(2);
        if (t.d()) {
            t.j(8);
            t.f();
            t.f();
            t.i();
        }
        final int f8 = t.f();
        j = 0;
        boolean d2 = false;
        int n5 = 0;
        while (j < f8) {
            if (j != 0) {
                d2 = t.d();
            }
            int n7;
            if (d2) {
                t.i();
                t.f();
                int n6 = 0;
                while (true) {
                    n7 = n5;
                    if (n6 > n5) {
                        break;
                    }
                    if (!t.d()) {
                        t.i();
                    }
                    ++n6;
                }
            }
            else {
                final int f9 = t.f();
                final int f10 = t.f();
                for (int n8 = 0; n8 < f9; ++n8) {
                    t.f();
                    t.i();
                }
                for (int n9 = 0; n9 < f10; ++n9) {
                    t.f();
                    t.i();
                }
                n7 = f9 + f10;
            }
            ++j;
            n5 = n7;
        }
        if (t.d()) {
            for (j = 0; j < t.f(); ++j) {
                t.j(f7 + 4 + 1);
            }
        }
        t.j(2);
        float n11;
        final float n10 = n11 = 1.0f;
        j = i;
        if (t.d()) {
            float n12 = n10;
            if (t.d()) {
                j = t.e(8);
                if (j == 255) {
                    j = t.e(16);
                    final int e5 = t.e(16);
                    n12 = n10;
                    if (j != 0) {
                        n12 = n10;
                        if (e5 != 0) {
                            n12 = j / (float)e5;
                        }
                    }
                }
                else {
                    final float[] b = p.b;
                    if (j < 17) {
                        n12 = b[j];
                    }
                    else {
                        ag0.a.u(46, "Unexpected aspect_ratio_idc value: ", j, "NalUnitUtil");
                        n12 = n10;
                    }
                }
            }
            if (t.d()) {
                t.i();
            }
            if (t.d()) {
                t.j(4);
                if (t.d()) {
                    t.j(24);
                }
            }
            if (t.d()) {
                t.f();
                t.f();
            }
            t.i();
            n11 = n12;
            j = i;
            if (t.d()) {
                j = i * 2;
                n11 = n12;
            }
        }
        return new a(e2, d, e3, n, array2, e4, n2, j, n11);
    }
    
    public static c d(int f, int n, final byte[] array) {
        final t t = new t(array, f + 1, n);
        final int e = t.e(8);
        final int e2 = t.e(8);
        final int e3 = t.e(8);
        final int f2 = t.f();
        int n2;
        boolean b;
        if (e != 100 && e != 110 && e != 122 && e != 244 && e != 44 && e != 83 && e != 86 && e != 118 && e != 128 && e != 138) {
            n2 = 1;
            b = false;
        }
        else {
            final int f3 = t.f();
            b = (f3 == 3 && t.d());
            t.f();
            t.f();
            t.i();
            if (t.d()) {
                if (f3 != 3) {
                    n = 8;
                }
                else {
                    n = 12;
                }
                for (int i = 0; i < n; ++i) {
                    if (t.d()) {
                        int n3;
                        if (i < 6) {
                            n3 = 16;
                        }
                        else {
                            n3 = 64;
                        }
                        int j = 0;
                        int n5;
                        int n4 = n5 = 8;
                        while (j < n3) {
                            if ((f = n4) != 0) {
                                f = (t.g() + n5 + 256) % 256;
                            }
                            if (f != 0) {
                                n5 = f;
                            }
                            ++j;
                            n4 = f;
                        }
                    }
                }
            }
            n2 = f3;
        }
        final int f4 = t.f();
        final int f5 = t.f();
        boolean d = false;
        Label_0371: {
            if (f5 == 0) {
                f = t.f() + 4;
            }
            else {
                if (f5 == 1) {
                    d = t.d();
                    t.g();
                    t.g();
                    long n6;
                    for (n6 = t.f(), f = 0; f < n6; ++f) {
                        t.f();
                    }
                    n = 0;
                    break Label_0371;
                }
                f = 0;
            }
            d = false;
            n = f;
        }
        t.f();
        t.i();
        final int f6 = t.f();
        f = t.f();
        final int d2 = t.d() ? 1 : 0;
        final int n7 = 2 - d2;
        if (d2 == 0) {
            t.i();
        }
        t.i();
        final int n8 = (f6 + 1) * 16;
        final int n9 = (f + 1) * n7 * 16;
        int n14;
        if (t.d()) {
            final int f7 = t.f();
            final int f8 = t.f();
            final int f9 = t.f();
            final int f10 = t.f();
            int n10;
            if (n2 == 0) {
                n10 = 1;
                f = n7;
            }
            else {
                final int n11 = 2;
                if (n2 == 3) {
                    f = 1;
                }
                else {
                    f = 2;
                }
                int n12;
                if (n2 == 1) {
                    n12 = n11;
                }
                else {
                    n12 = 1;
                }
                final int n13 = n7 * n12;
                n10 = f;
                f = n13;
            }
            n14 = n8 - (f7 + f8) * n10;
            f = n9 - (f9 + f10) * f;
        }
        else {
            f = n9;
            n14 = n8;
        }
        float n16;
        final float n15 = n16 = 1.0f;
        if (t.d()) {
            n16 = n15;
            if (t.d()) {
                final int e4 = t.e(8);
                if (e4 == 255) {
                    final int e5 = t.e(16);
                    final int e6 = t.e(16);
                    n16 = n15;
                    if (e5 != 0) {
                        n16 = n15;
                        if (e6 != 0) {
                            n16 = e5 / (float)e6;
                        }
                    }
                }
                else {
                    final float[] b2 = p.b;
                    if (e4 < 17) {
                        n16 = b2[e4];
                    }
                    else {
                        ag0.a.u(46, "Unexpected aspect_ratio_idc value: ", e4, "NalUnitUtil");
                        n16 = n15;
                    }
                }
            }
        }
        return new c(e, e2, e3, f2, n14, f, n16, b, (boolean)(d2 != 0), f4 + 4, f5, n, d);
    }
    
    public static int e(int n, final byte[] array) {
        final Object c = p.c;
        monitorenter(c);
        int n2;
        int i = n2 = 0;
    Block_8_Outer:
        while (true) {
            Label_0115: {
                int n3 = 0;
                Block_5: {
                    if (i < n) {
                        while (true) {
                            while (i < n - 2) {
                                if (array[i] == 0 && array[i + 1] == 0 && array[i + 2] == 3) {
                                    n3 = i;
                                    i = n3;
                                    if (n3 < n) {
                                        break Block_5;
                                    }
                                    continue Block_8_Outer;
                                }
                                else {
                                    ++i;
                                }
                            }
                            n3 = n;
                            continue;
                        }
                    }
                    break Label_0115;
                }
                try {
                    final int[] d = p.d;
                    if (d.length <= n2) {
                        p.d = Arrays.copyOf(d, d.length * 2);
                    }
                    p.d[n2] = n3;
                    i = n3 + 3;
                    ++n2;
                    continue Block_8_Outer;
                    final int n5;
                    Label_0204: {
                        final int n4;
                        System.arraycopy(array, i, array, n4, n5 - n4);
                    }
                    return n5;
                    n5 = n - n2;
                    final int n6 = 0;
                    int n4;
                    n = (n4 = (i = n6));
                    n = n6;
                    while (true) {
                        Label_0135: {
                            break Label_0135;
                            final int n7 = p.d[n] - i;
                            System.arraycopy(array, i, array, n4, n7);
                            final int n8 = n4 + n7;
                            final int n9 = n8 + 1;
                            array[n8] = 0;
                            n4 = n9 + 1;
                            array[n9] = 0;
                            i += n7 + 3;
                            ++n;
                        }
                        iftrue(Label_0204:)(n >= n2);
                        continue;
                    }
                }
                finally {
                    monitorexit(c);
                }
            }
        }
    }
    
    public static final class a
    {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;
        public final float g;
        
        public a(final int a, final boolean b, final int c, final int d, final int[] e, final int f, final int n, final int n2, final float g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final boolean b;
        
        public b(final int n, final int a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;
        
        public c(final int a, final int b, final int c, final int d, final int e, final int f, final float g, final boolean h, final boolean i, final int j, final int k, final int l, final boolean m) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
        }
    }
}
