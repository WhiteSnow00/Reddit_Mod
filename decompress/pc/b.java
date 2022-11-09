// 
// Decompiled by Procyon v0.6.0
// 

package pc;

import android.util.SparseArray;
import bd.c0;
import bd.r;
import android.graphics.PathEffect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public final class b
{
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;
    
    static {
        h = new byte[] { 0, 7, 8, 15 };
        i = new byte[] { 0, 119, -120, -1 };
        j = new byte[] { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
    }
    
    public b(final int n, final int n2) {
        final Paint a = new Paint();
        (this.a = a).setStyle(Paint$Style.FILL_AND_STROKE);
        a.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        a.setPathEffect((PathEffect)null);
        final Paint b = new Paint();
        (this.b = b).setStyle(Paint$Style.FILL);
        b.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OVER));
        b.setPathEffect((PathEffect)null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[] { 0, -1, -16777216, -8421505 }, a(), b());
        this.f = new h(n, n2);
    }
    
    public static int[] a() {
        final int[] array = new int[16];
        array[0] = 0;
        for (int i = 1; i < 16; ++i) {
            if (i < 8) {
                int n;
                if ((i & 0x1) != 0x0) {
                    n = 255;
                }
                else {
                    n = 0;
                }
                int n2;
                if ((i & 0x2) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x4) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                array[i] = c(255, n, n2, n3);
            }
            else {
                int n4 = 127;
                int n5;
                if ((i & 0x1) != 0x0) {
                    n5 = 127;
                }
                else {
                    n5 = 0;
                }
                int n6;
                if ((i & 0x2) != 0x0) {
                    n6 = 127;
                }
                else {
                    n6 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n4 = 0;
                }
                array[i] = c(255, n5, n6, n4);
            }
        }
        return array;
    }
    
    public static int[] b() {
        final int[] array = new int[256];
        array[0] = 0;
        for (int i = 0; i < 256; ++i) {
            int n = 255;
            if (i < 8) {
                int n2;
                if ((i & 0x1) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x2) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n = 0;
                }
                array[i] = c(63, n2, n3, n);
            }
            else {
                final int n4 = i & 0x88;
                int n5 = 170;
                int n6 = 85;
                if (n4 != 0) {
                    if (n4 != 8) {
                        int n7 = 43;
                        if (n4 != 128) {
                            if (n4 == 136) {
                                int n8;
                                if ((i & 0x1) != 0x0) {
                                    n8 = 43;
                                }
                                else {
                                    n8 = 0;
                                }
                                int n9;
                                if ((i & 0x10) != 0x0) {
                                    n9 = 85;
                                }
                                else {
                                    n9 = 0;
                                }
                                int n10;
                                if ((i & 0x2) != 0x0) {
                                    n10 = 43;
                                }
                                else {
                                    n10 = 0;
                                }
                                int n11;
                                if ((i & 0x20) != 0x0) {
                                    n11 = 85;
                                }
                                else {
                                    n11 = 0;
                                }
                                if ((i & 0x4) == 0x0) {
                                    n7 = 0;
                                }
                                if ((i & 0x40) == 0x0) {
                                    n6 = 0;
                                }
                                array[i] = c(255, n8 + n9, n10 + n11, n7 + n6);
                            }
                        }
                        else {
                            int n12;
                            if ((i & 0x1) != 0x0) {
                                n12 = 43;
                            }
                            else {
                                n12 = 0;
                            }
                            int n13;
                            if ((i & 0x10) != 0x0) {
                                n13 = 85;
                            }
                            else {
                                n13 = 0;
                            }
                            int n14;
                            if ((i & 0x2) != 0x0) {
                                n14 = 43;
                            }
                            else {
                                n14 = 0;
                            }
                            int n15;
                            if ((i & 0x20) != 0x0) {
                                n15 = 85;
                            }
                            else {
                                n15 = 0;
                            }
                            if ((i & 0x4) == 0x0) {
                                n7 = 0;
                            }
                            if ((i & 0x40) == 0x0) {
                                n6 = 0;
                            }
                            array[i] = c(255, n12 + 127 + n13, n14 + 127 + n15, n7 + 127 + n6);
                        }
                    }
                    else {
                        int n16;
                        if ((i & 0x1) != 0x0) {
                            n16 = 85;
                        }
                        else {
                            n16 = 0;
                        }
                        int n17;
                        if ((i & 0x10) != 0x0) {
                            n17 = 170;
                        }
                        else {
                            n17 = 0;
                        }
                        int n18;
                        if ((i & 0x2) != 0x0) {
                            n18 = 85;
                        }
                        else {
                            n18 = 0;
                        }
                        int n19;
                        if ((i & 0x20) != 0x0) {
                            n19 = 170;
                        }
                        else {
                            n19 = 0;
                        }
                        if ((i & 0x4) == 0x0) {
                            n6 = 0;
                        }
                        if ((i & 0x40) == 0x0) {
                            n5 = 0;
                        }
                        array[i] = c(127, n16 + n17, n18 + n19, n6 + n5);
                    }
                }
                else {
                    int n20;
                    if ((i & 0x1) != 0x0) {
                        n20 = 85;
                    }
                    else {
                        n20 = 0;
                    }
                    int n21;
                    if ((i & 0x10) != 0x0) {
                        n21 = 170;
                    }
                    else {
                        n21 = 0;
                    }
                    int n22;
                    if ((i & 0x2) != 0x0) {
                        n22 = 85;
                    }
                    else {
                        n22 = 0;
                    }
                    int n23;
                    if ((i & 0x20) != 0x0) {
                        n23 = 170;
                    }
                    else {
                        n23 = 0;
                    }
                    if ((i & 0x4) == 0x0) {
                        n6 = 0;
                    }
                    if ((i & 0x40) == 0x0) {
                        n5 = 0;
                    }
                    array[i] = c(255, n20 + n21, n22 + n23, n6 + n5);
                }
            }
        }
        return array;
    }
    
    public static int c(final int n, final int n2, final int n3, final int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    public static void d(byte[] array, final int[] array2, final int n, final int n2, int n3, final Paint paint, final Canvas canvas) {
        final r r = new r(array, array.length);
        byte[] array3 = null;
        byte[] array4 = null;
        byte[] array5 = null;
        int n4 = n3;
        n3 = n2;
    Label_0032:
        while (true) {
            while (r.b() != 0) {
                final int g = r.g(8);
                if (g != 240) {
                    final int n5 = 2;
                    final int n6 = 1;
                    switch (g) {
                        default: {
                            switch (g) {
                                default: {
                                    continue;
                                }
                                case 34: {
                                    array = new byte[16];
                                    int n7 = 0;
                                    while (true) {
                                        array4 = array;
                                        if (n7 >= 16) {
                                            continue Label_0032;
                                        }
                                        array[n7] = (byte)r.g(8);
                                        ++n7;
                                    }
                                    break;
                                }
                                case 33: {
                                    array = new byte[4];
                                    int n8 = 0;
                                    while (true) {
                                        array3 = array;
                                        if (n8 >= 4) {
                                            continue Label_0032;
                                        }
                                        array[n8] = (byte)r.g(8);
                                        ++n8;
                                    }
                                    break;
                                }
                                case 32: {
                                    array = new byte[4];
                                    int n9 = 0;
                                    while (true) {
                                        array5 = array;
                                        if (n9 >= 4) {
                                            continue Label_0032;
                                        }
                                        array[n9] = (byte)r.g(4);
                                        ++n9;
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                        case 18: {
                            final int n10 = 0;
                            int n11 = n3;
                            n3 = n10;
                            do {
                                int n12 = r.g(8);
                                int n13;
                                if (n12 != 0) {
                                    n13 = n6;
                                }
                                else if (!r.f()) {
                                    n13 = r.g(7);
                                    if (n13 != 0) {
                                        n12 = 0;
                                    }
                                    else {
                                        n3 = n6;
                                        n12 = (n13 = 0);
                                    }
                                }
                                else {
                                    n13 = r.g(7);
                                    n12 = r.g(8);
                                }
                                if (n13 != 0 && paint != null) {
                                    paint.setColor(array2[n12]);
                                    canvas.drawRect((float)n11, (float)n4, (float)(n11 + n13), (float)(n4 + 1), paint);
                                }
                                n11 += n13;
                            } while (n3 == 0);
                            n3 = n11;
                            continue;
                        }
                        case 17: {
                            if (n == 3) {
                                if (array4 == null) {
                                    array = b.j;
                                }
                                else {
                                    array = array4;
                                }
                            }
                            else {
                                array = null;
                            }
                            final int n14 = 0;
                            int n15 = n5;
                            int n16 = n3;
                            n3 = n14;
                            do {
                                int g2 = r.g(4);
                                int n17 = 0;
                                Label_0505: {
                                    if (g2 != 0) {
                                        n17 = 1;
                                    }
                                    else {
                                        int g4 = 0;
                                        Label_0518: {
                                            Label_0450: {
                                                if (r.f()) {
                                                    int n18;
                                                    int n19;
                                                    if (!r.f()) {
                                                        n18 = r.g(n15) + 4;
                                                        n19 = r.g(4);
                                                    }
                                                    else {
                                                        final int g3 = r.g(n15);
                                                        if (g3 == 0) {
                                                            g4 = 1;
                                                            break Label_0518;
                                                        }
                                                        if (g3 == 1) {
                                                            g4 = n15;
                                                            break Label_0518;
                                                        }
                                                        if (g3 != n15) {
                                                            if (g3 != 3) {
                                                                break Label_0450;
                                                            }
                                                            n18 = r.g(8) + 25;
                                                            n19 = r.g(4);
                                                        }
                                                        else {
                                                            n18 = r.g(4) + 9;
                                                            n19 = r.g(4);
                                                        }
                                                    }
                                                    final int n20 = n18;
                                                    g2 = n19;
                                                    n17 = n20;
                                                    break Label_0505;
                                                }
                                                g4 = r.g(3);
                                                if (g4 != 0) {
                                                    g4 += 2;
                                                    break Label_0518;
                                                }
                                                n3 = 1;
                                            }
                                            g2 = (n17 = 0);
                                            break Label_0505;
                                        }
                                        final int n21 = 0;
                                        n17 = g4;
                                        g2 = n21;
                                    }
                                }
                                if (n17 != 0 && paint != null) {
                                    int n22 = g2;
                                    if (array != null) {
                                        n22 = array[g2];
                                    }
                                    paint.setColor(array2[n22]);
                                    final float n23 = (float)n16;
                                    final float n24 = (float)n4;
                                    final float n25 = (float)(n16 + n17);
                                    final float n26 = (float)(n4 + 1);
                                    n15 = 2;
                                    canvas.drawRect(n23, n24, n25, n26, paint);
                                }
                                n16 += n17;
                            } while (n3 == 0);
                            r.c();
                            n3 = n16;
                            continue;
                        }
                        case 16: {
                            if (n == 3) {
                                if (array3 == null) {
                                    array = b.i;
                                }
                                else {
                                    array = array3;
                                }
                            }
                            else if (n == 2) {
                                if (array5 == null) {
                                    array = b.h;
                                }
                                else {
                                    array = array5;
                                }
                            }
                            else {
                                array = null;
                            }
                            final int n27 = 0;
                            int n28 = n3;
                            n3 = n27;
                            while (true) {
                                final int g5 = r.g(2);
                                int n29 = 0;
                                int n30 = 0;
                                Label_0889: {
                                    if (g5 != 0) {
                                        n29 = 1;
                                        n30 = n3;
                                        n3 = g5;
                                    }
                                    else {
                                        int n32 = 0;
                                        Label_0747: {
                                            if (!r.f()) {
                                                int n31 = 0;
                                                Label_0861: {
                                                    if (!r.f()) {
                                                        final int g6 = r.g(2);
                                                        if (g6 != 0) {
                                                            if (g6 == 1) {
                                                                n31 = 2;
                                                                break Label_0861;
                                                            }
                                                            if (g6 == 2) {
                                                                n29 = r.g(4) + 12;
                                                                n32 = r.g(2);
                                                                break Label_0747;
                                                            }
                                                            if (g6 == 3) {
                                                                n29 = r.g(8) + 29;
                                                                n32 = r.g(2);
                                                                break Label_0747;
                                                            }
                                                        }
                                                        else {
                                                            n3 = 1;
                                                        }
                                                        n30 = n3;
                                                        n3 = (n29 = 0);
                                                        break Label_0889;
                                                    }
                                                    n31 = 1;
                                                }
                                                n29 = n31;
                                                n30 = n3;
                                                n3 = 0;
                                                break Label_0889;
                                            }
                                            n29 = r.g(3) + 3;
                                            n32 = r.g(2);
                                        }
                                        final int n33 = n3;
                                        n3 = n32;
                                        n30 = n33;
                                    }
                                }
                                if (n29 != 0 && paint != null) {
                                    int n34 = n3;
                                    if (array != null) {
                                        n34 = array[n3];
                                    }
                                    paint.setColor(array2[n34]);
                                    canvas.drawRect((float)n28, (float)n4, (float)(n28 + n29), (float)(n4 + 1), paint);
                                }
                                n28 += n29;
                                if (n30 != 0) {
                                    break;
                                }
                                n3 = n30;
                            }
                            r.c();
                            n3 = n28;
                            continue;
                        }
                    }
                }
                else {
                    n4 += 2;
                    n3 = n2;
                }
            }
            break;
        }
    }
    
    public static a e(final r r, int i) {
        final int g = r.g(8);
        r.m(8);
        i -= 2;
        final int[] array2;
        final int[] array = array2 = new int[4];
        array2[0] = 0;
        array2[1] = -1;
        array2[2] = -16777216;
        array2[3] = -8421505;
        final int[] a = a();
        final int[] b = b();
        while (i > 0) {
            final int g2 = r.g(8);
            final int g3 = r.g(8);
            i -= 2;
            int[] array3;
            if ((g3 & 0x80) != 0x0) {
                array3 = array;
            }
            else if ((g3 & 0x40) != 0x0) {
                array3 = a;
            }
            else {
                array3 = b;
            }
            int g4;
            int g5;
            int g6;
            int g7;
            if ((g3 & 0x1) != 0x0) {
                g4 = r.g(8);
                g5 = r.g(8);
                g6 = r.g(8);
                g7 = r.g(8);
                i -= 4;
            }
            else {
                final int g8 = r.g(6);
                final int g9 = r.g(4);
                final int g10 = r.g(4);
                final int g11 = r.g(2);
                i -= 2;
                g5 = g9 << 4;
                g7 = g11 << 6;
                g4 = g8 << 2;
                g6 = g10 << 4;
            }
            if (g4 == 0) {
                g7 = 255;
                g5 = 0;
                g6 = 0;
            }
            final byte b2 = (byte)(255 - (g7 & 0xFF));
            final double n = g4;
            final double n2 = g5 - 128;
            final int n3 = (int)(1.402 * n2 + n);
            final double n4 = g6 - 128;
            array3[g2] = c(b2, c0.i(n3, 0, 255), c0.i((int)(n - 0.34414 * n4 - n2 * 0.71414), 0, 255), c0.i((int)(n4 * 1.772 + n), 0, 255));
        }
        return new a(g, array, a, b);
    }
    
    public static c f(final r r) {
        final int g = r.g(16);
        r.m(4);
        final int g2 = r.g(2);
        final boolean f = r.f();
        r.m(1);
        byte[] f2 = c0.f;
        byte[] array;
        if (g2 == 1) {
            r.m(r.g(8) * 16);
            array = f2;
        }
        else {
            array = f2;
            if (g2 == 0) {
                final int g3 = r.g(16);
                final int g4 = r.g(16);
                if (g3 > 0) {
                    f2 = new byte[g3];
                    r.i(g3, f2);
                }
                array = f2;
                if (g4 > 0) {
                    final byte[] array2 = new byte[g4];
                    r.i(g4, array2);
                    final byte[] array3 = array2;
                    array = f2;
                    return new c(g, f, array, array3);
                }
            }
        }
        final byte[] array3 = array;
        return new c(g, f, array, array3);
    }
    
    public static final class a
    {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;
        
        public a(final int a, final int[] b, final int[] c, final int[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        
        public b(final int a, final int b, final int c, final int d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;
        
        public c(final int a, final boolean b, final byte[] c, final byte[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final SparseArray<e> c;
        
        public d(final int a, final int b, final SparseArray c) {
            this.a = a;
            this.b = b;
            this.c = (SparseArray<e>)c;
        }
    }
    
    public static final class e
    {
        public final int a;
        public final int b;
        
        public e(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class f
    {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;
        
        public f(final int a, final boolean b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final SparseArray j) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = (SparseArray<g>)j;
        }
    }
    
    public static final class g
    {
        public final int a;
        public final int b;
        
        public g(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class h
    {
        public final int a;
        public final int b;
        public final SparseArray<f> c;
        public final SparseArray<a> d;
        public final SparseArray<c> e;
        public final SparseArray<a> f;
        public final SparseArray<c> g;
        public b h;
        public d i;
        
        public h(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = (SparseArray<f>)new SparseArray();
            this.d = (SparseArray<a>)new SparseArray();
            this.e = (SparseArray<c>)new SparseArray();
            this.f = (SparseArray<a>)new SparseArray();
            this.g = (SparseArray<c>)new SparseArray();
        }
    }
}
