// 
// Decompiled by Procyon v0.6.0
// 

package j8;

import java.util.Arrays;
import android.util.Log;
import java.util.Iterator;
import java.nio.ByteOrder;
import b9.b;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public final class e implements a
{
    public int[] a;
    public final int[] b;
    public final a$a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public int[] j;
    public int k;
    public c l;
    public Bitmap m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public Bitmap$Config t;
    
    public e(final b c, final c l, final ByteBuffer byteBuffer, int f) {
        this.b = new int[256];
        this.t = Bitmap$Config.ARGB_8888;
        this.c = (a$a)c;
        this.l = new c();
        monitorenter(this);
        Label_0214: {
            if (f <= 0) {
                break Label_0214;
            }
            try {
                final int highestOneBit = Integer.highestOneBit(f);
                this.o = 0;
                this.l = l;
                this.k = -1;
                (this.d = byteBuffer.asReadOnlyBuffer()).position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                final Iterator iterator = l.e.iterator();
                while (iterator.hasNext()) {
                    if (((j8.b)iterator.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                f = l.f;
                this.r = f / highestOneBit;
                final int g = l.g;
                this.q = g / highestOneBit;
                this.i = this.c.a(f * g);
                this.j = this.c.d(this.r * this.q);
                return;
                final StringBuilder sb = new StringBuilder();
                sb.append("Sample size must be >=0, not: ");
                sb.append(f);
                throw new IllegalArgumentException(sb.toString());
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void a() {
        this.k = (this.k + 1) % this.l.c;
    }
    
    public final int b() {
        return this.k;
    }
    
    public final int c() {
        return this.j.length * 4 + (this.d.limit() + this.i.length);
    }
    
    public final void clear() {
        this.l = null;
        final byte[] i = this.i;
        if (i != null) {
            this.c.e(i);
        }
        final int[] j = this.j;
        if (j != null) {
            this.c.f(j);
        }
        final Bitmap m = this.m;
        if (m != null) {
            this.c.c(m);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        final byte[] e = this.e;
        if (e != null) {
            this.c.e(e);
        }
    }
    
    public final int d() {
        return this.l.c;
    }
    
    public final int e() {
        final c l = this.l;
        final int c = l.c;
        if (c > 0) {
            final int k = this.k;
            if (k >= 0) {
                int i;
                if (k >= 0 && k < c) {
                    i = l.e.get(k).i;
                }
                else {
                    i = -1;
                }
                return i;
            }
        }
        return 0;
    }
    
    public final Bitmap f() {
        final Boolean s = this.s;
        Bitmap$Config bitmap$Config;
        if (s != null && !s) {
            bitmap$Config = this.t;
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap b = this.c.b(this.r, this.q, bitmap$Config);
        b.setHasAlpha(true);
        return b;
    }
    
    public final void g(final Bitmap$Config t) {
        if (t != Bitmap$Config.ARGB_8888 && t != Bitmap$Config.RGB_565) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported format: ");
            sb.append(t);
            sb.append(", must be one of ");
            sb.append(Bitmap$Config.ARGB_8888);
            sb.append(" or ");
            sb.append(Bitmap$Config.RGB_565);
            throw new IllegalArgumentException(sb.toString());
        }
        this.t = t;
    }
    
    public final ByteBuffer getData() {
        return this.d;
    }
    
    public final Bitmap getNextFrame() {
        synchronized (this) {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("e", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to decode frame, frameCount=");
                    sb.append(this.l.c);
                    sb.append(", framePointer=");
                    sb.append(this.k);
                    Log.d("e", sb.toString());
                }
                this.o = 1;
            }
            final int o = this.o;
            if (o == 1 || o == 2) {
                if (Log.isLoggable("e", 3)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to decode frame, status=");
                    sb2.append(this.o);
                    Log.d("e", sb2.toString());
                }
                return null;
            }
            this.o = 0;
            if (this.e == null) {
                this.e = this.c.a(255);
            }
            final j8.b b = this.l.e.get(this.k);
            final int n = this.k - 1;
            j8.b b2;
            if (n >= 0) {
                b2 = this.l.e.get(n);
            }
            else {
                b2 = null;
            }
            int[] a = b.k;
            if (a == null) {
                a = this.l.a;
            }
            this.a = a;
            if (a == null) {
                if (Log.isLoggable("e", 3)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("No valid color table found for frame #");
                    sb3.append(this.k);
                    Log.d("e", sb3.toString());
                }
                this.o = 1;
                return null;
            }
            if (b.f) {
                System.arraycopy(a, 0, this.b, 0, a.length);
                (this.a = this.b)[b.h] = 0;
                if (b.g == 2 && this.k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return this.h(b, b2);
        }
    }
    
    public final Bitmap h(final j8.b b, final j8.b b2) {
        final int[] j = this.j;
        final int n = 0;
        if (b2 == null) {
            final Bitmap m = this.m;
            if (m != null) {
                this.c.c(m);
            }
            this.m = null;
            Arrays.fill(j, 0);
        }
        if (b2 != null && b2.g == 3 && this.m == null) {
            Arrays.fill(j, 0);
        }
        if (b2 != null) {
            final int g = b2.g;
            if (g > 0) {
                if (g == 2) {
                    int k = 0;
                    Label_0144: {
                        if (!b.f) {
                            final c l = this.l;
                            k = l.k;
                            if (b.k == null) {
                                break Label_0144;
                            }
                            k = k;
                            if (l.j != b.h) {
                                break Label_0144;
                            }
                        }
                        k = 0;
                    }
                    final int d = b2.d;
                    final int p2 = this.p;
                    final int n2 = d / p2;
                    final int n3 = b2.b / p2;
                    final int n4 = b2.c / p2;
                    int i = 0;
                    for (int n5 = b2.a / p2, r = this.r; i < n2 * r + (i = n3 * r + n5); i += this.r) {
                        for (int n6 = i; n6 < i + n4; ++n6) {
                            j[n6] = k;
                        }
                    }
                }
                else if (g == 3) {
                    final Bitmap m2 = this.m;
                    if (m2 != null) {
                        final int r2 = this.r;
                        m2.getPixels(j, 0, r2, 0, 0, r2, this.q);
                    }
                }
            }
        }
        this.d.position(b.j);
        final int n7 = b.c * b.d;
        final byte[] i2 = this.i;
        if (i2 == null || i2.length < n7) {
            this.i = this.c.a(n7);
        }
        final byte[] i3 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        final short[] f = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        final byte[] g2 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        final byte[] h = this.h;
        final int n8 = this.d.get() & 0xFF;
        final int n9 = 1 << n8;
        final int n10 = n9 + 2;
        final int n11 = n8 + 1;
        final int n12 = (1 << n11) - 1;
        for (int n13 = 0; n13 < n9; ++n13) {
            f[n13] = 0;
            g2[n13] = (byte)n13;
        }
        byte[] e = this.e;
        int n14 = n11;
        int n15 = n12;
        int n16 = 0;
        int n18;
        int n17 = n18 = n16;
        final int n20;
        final int n19 = n20 = n18;
        int n22;
        int n21 = n22 = n20;
        int n23 = n10;
        int n24 = -1;
        e e2 = this;
        int n25 = n20;
        int n26 = n19;
        int n27 = n;
        final int[] array = j;
        int n28 = 0;
    Label_0562:
        while (true) {
            n28 = 8;
            if (n27 < n7) {
                if (n17 == 0) {
                    n17 = (this.d.get() & 0xFF);
                    if (n17 > 0) {
                        final ByteBuffer d2 = e2.d;
                        d2.get(e2.e, 0, Math.min(n17, d2.remaining()));
                    }
                    if (n17 <= 0) {
                        e2.o = 3;
                        break;
                    }
                    n18 = 0;
                }
                final int n29 = n25 + ((e[n18] & 0xFF) << n26);
                final int n30 = n18 + 1;
                final int n31 = n17 - 1;
                final int n32 = n26 + 8;
                final int n33 = n23;
                int n34 = n14;
                int n35 = n15;
                int n36 = n22;
                int n37 = n29;
                int n38 = n33;
                int n39 = n21;
                int n40 = n16;
                int n41 = n32;
                while (true) {
                    while (n41 >= n34) {
                        final byte[] array2 = e;
                        final int n42 = n37 & n35;
                        final int n43 = n37 >> n34;
                        final int n44 = n41 - n34;
                        if (n42 == n9) {
                            n24 = -1;
                            n34 = n11;
                            e = array2;
                            n35 = n12;
                            n38 = n10;
                            n41 = n44;
                            n37 = n43;
                        }
                        else {
                            if (n42 == n9 + 1) {
                                n41 = n44;
                                final int n45 = n43;
                                final int n46 = n34;
                                final int n47 = n41;
                                n21 = n39;
                                n16 = n40;
                                n17 = n31;
                                n18 = n30;
                                n26 = n47;
                                n25 = n45;
                                n22 = n36;
                                n23 = n38;
                                n14 = n46;
                                n15 = n35;
                                continue Label_0562;
                            }
                            int n48;
                            if (n24 == -1) {
                                i3[n40] = g2[n42];
                                ++n40;
                                ++n27;
                                n39 = n42;
                                n48 = n36;
                            }
                            else {
                                int n49;
                                int n50;
                                if (n42 >= n38) {
                                    h[n36] = (byte)n39;
                                    n49 = n36 + 1;
                                    n50 = n24;
                                }
                                else {
                                    final int n51 = n42;
                                    n49 = n36;
                                    n50 = n51;
                                }
                                while (n50 >= n9) {
                                    h[n49] = g2[n50];
                                    ++n49;
                                    n50 = f[n50];
                                }
                                final int n52 = g2[n50] & 0xFF;
                                final byte b3 = (byte)n52;
                                i3[n40] = b3;
                                int n53;
                                int n54;
                                while (true) {
                                    n53 = n40 + 1;
                                    n54 = n27 + 1;
                                    if (n49 <= 0) {
                                        break;
                                    }
                                    --n49;
                                    i3[n53] = h[n49];
                                    n40 = n53;
                                    n27 = n54;
                                }
                                int n55 = n34;
                                int n56 = n38;
                                int n57 = n35;
                                if (n38 < 4096) {
                                    f[n38] = (short)n24;
                                    g2[n38] = b3;
                                    ++n38;
                                    n55 = n34;
                                    n56 = n38;
                                    n57 = n35;
                                    if ((n38 & n35) == 0x0) {
                                        n55 = n34;
                                        n56 = n38;
                                        n57 = n35;
                                        if (n38 < 4096) {
                                            n55 = n34 + 1;
                                            n57 = n35 + n38;
                                            n56 = n38;
                                        }
                                    }
                                }
                                final int n58 = n52;
                                n35 = n57;
                                n48 = n49;
                                n38 = n56;
                                n27 = n54;
                                n39 = n58;
                                n34 = n55;
                                n40 = n53;
                            }
                            n24 = n42;
                            n41 = n44;
                            e = array2;
                            e2 = this;
                            n37 = n43;
                            n36 = n48;
                        }
                    }
                    e2 = this;
                    final int n45 = n37;
                    continue;
                }
            }
            break;
        }
        final int[] array3 = array;
        int n59 = 0;
        Arrays.fill(i3, n16, n7, (byte)0);
        if (!b.e && this.p == 1) {
            final int[] j2 = this.j;
            final int d3 = b.d;
            final int b4 = b.b;
            final int c = b.c;
            final int a = b.a;
            final boolean b5 = this.k == 0;
            final int r3 = this.r;
            final byte[] i4 = this.i;
            final int[] a2 = this.a;
            int n60 = -1;
            while (n59 < d3) {
                final int n61 = (n59 + b4) * r3;
                int n62 = n61 + a;
                final int n63 = n62 + c;
                final int n64 = n61 + r3;
                int n65;
                if (n64 < (n65 = n63)) {
                    n65 = n64;
                }
                int n66 = b.c * n59;
                while (n62 < n65) {
                    final byte b6 = i4[n66];
                    final int n67 = b6 & 0xFF;
                    int n68;
                    if (n67 != (n68 = n60)) {
                        final int n69 = a2[n67];
                        if (n69 != 0) {
                            j2[n62] = n69;
                            n68 = n60;
                        }
                        else {
                            n68 = b6;
                        }
                    }
                    ++n66;
                    ++n62;
                    n60 = n68;
                }
                ++n59;
            }
            final Boolean s = this.s;
            this.s = ((s != null && s) || (this.s == null && b5 && n60 != -1));
        }
        else {
            final int[] j3 = this.j;
            final int d4 = b.d;
            final int p3 = this.p;
            final int n70 = d4 / p3;
            final int n71 = b.b / p3;
            final int n72 = b.c / p3;
            int n73 = b.a / p3;
            final boolean b7 = this.k == 0;
            int r4 = this.r;
            int q = this.q;
            final byte[] i5 = this.i;
            final int[] a3 = this.a;
            Boolean s2 = this.s;
            int n74 = 0;
            final int n75 = 0;
            int n76 = 1;
            int n77 = n28;
            int n78 = n75;
            while (n74 < n70) {
                int n79;
                int n80;
                int n81;
                if (b.e) {
                    if (n78 >= n70) {
                        if (++n76 != 2) {
                            if (n76 != 3) {
                                if (n76 == 4) {
                                    n78 = 1;
                                    n77 = 2;
                                }
                            }
                            else {
                                n77 = 4;
                                n78 = 2;
                            }
                        }
                        else {
                            n78 = 4;
                        }
                        n79 = n78;
                    }
                    else {
                        n79 = n78;
                    }
                    n78 = n79 + n77;
                    n80 = n76;
                    n81 = n77;
                }
                else {
                    n79 = n74;
                    n81 = n77;
                    n80 = n76;
                }
                final int n82 = n79 + n71;
                final boolean b8 = p3 == 1;
                int n119;
                int n120;
                if (n82 < q) {
                    final int n83 = n82 * r4;
                    int n84 = n83 + n73;
                    final int n85 = n84 + n72;
                    final int n86 = n83 + r4;
                    int n87;
                    if (n86 < (n87 = n85)) {
                        n87 = n86;
                    }
                    final int n88 = n74 * p3 * b.c;
                    int n90;
                    int n91;
                    int n92;
                    Boolean b9;
                    if (b8) {
                        int n89 = n88;
                        while (true) {
                            n90 = n73;
                            n91 = r4;
                            n92 = q;
                            b9 = s2;
                            if (n84 >= n87) {
                                break;
                            }
                            final int n93 = a3[i5[n89] & 0xFF];
                            Boolean true;
                            if (n93 != 0) {
                                j3[n84] = n93;
                                true = s2;
                            }
                            else {
                                true = s2;
                                if (b7 && (true = s2) == null) {
                                    true = Boolean.TRUE;
                                }
                            }
                            n89 += p3;
                            ++n84;
                            s2 = true;
                        }
                    }
                    else {
                        final int b10 = aw.b.b(n87, n84, p3, n88);
                        int n94 = n88;
                        final int n95 = n87;
                        while (true) {
                            n90 = n73;
                            n91 = r4;
                            n92 = q;
                            b9 = s2;
                            if (n84 >= n95) {
                                break;
                            }
                            final int c2 = b.c;
                            int n96 = 0;
                            int n97 = 0;
                            int n98 = 0;
                            int n99 = 0;
                            int n100 = 0;
                            int n103;
                            int n104;
                            int n105;
                            int n106;
                            int n107;
                            for (int n101 = n94; n101 < this.p + n94; ++n101, n96 = n103, n97 = n104, n98 = n105, n99 = n106, n100 = n107) {
                                final byte[] i6 = this.i;
                                if (n101 >= i6.length || n101 >= b10) {
                                    break;
                                }
                                final int n102 = this.a[i6[n101] & 0xFF];
                                n103 = n96;
                                n104 = n97;
                                n105 = n98;
                                n106 = n99;
                                n107 = n100;
                                if (n102 != 0) {
                                    n103 = n96 + (n102 >> 24 & 0xFF);
                                    n104 = n97 + (n102 >> 16 & 0xFF);
                                    n105 = n98 + (n102 >> 8 & 0xFF);
                                    n106 = n99 + (n102 & 0xFF);
                                    n107 = n100 + 1;
                                }
                            }
                            final int n108 = c2 + n94;
                            int n109 = n97;
                            int n110 = n96;
                            int n113;
                            int n114;
                            int n115;
                            int n116;
                            int n117;
                            for (int n111 = n108; n111 < this.p + n108; ++n111, n110 = n113, n109 = n114, n98 = n115, n99 = n116, n100 = n117) {
                                final byte[] i7 = this.i;
                                if (n111 >= i7.length || n111 >= b10) {
                                    break;
                                }
                                final int n112 = this.a[i7[n111] & 0xFF];
                                n113 = n110;
                                n114 = n109;
                                n115 = n98;
                                n116 = n99;
                                n117 = n100;
                                if (n112 != 0) {
                                    n113 = n110 + (n112 >> 24 & 0xFF);
                                    n114 = n109 + (n112 >> 16 & 0xFF);
                                    n115 = n98 + (n112 >> 8 & 0xFF);
                                    n116 = n99 + (n112 & 0xFF);
                                    n117 = n100 + 1;
                                }
                            }
                            int n118;
                            if (n100 == 0) {
                                n118 = 0;
                            }
                            else {
                                n118 = (n110 / n100 << 24 | n109 / n100 << 16 | n98 / n100 << 8 | n99 / n100);
                            }
                            Boolean true2;
                            if (n118 != 0) {
                                j3[n84] = n118;
                                true2 = s2;
                            }
                            else {
                                true2 = s2;
                                if (b7 && (true2 = s2) == null) {
                                    true2 = Boolean.TRUE;
                                }
                            }
                            n94 += p3;
                            ++n84;
                            s2 = true2;
                        }
                    }
                    n119 = n90;
                    n120 = n91;
                    q = n92;
                    s2 = b9;
                }
                else {
                    final int n121 = n73;
                    n120 = r4;
                    n119 = n121;
                }
                ++n74;
                final int n122 = n120;
                n73 = n119;
                r4 = n122;
                n76 = n80;
                n77 = n81;
            }
            if (this.s == null) {
                this.s = (s2 != null && s2);
            }
        }
        if (this.n) {
            final int g3 = b.g;
            if (g3 == 0 || g3 == 1) {
                if (this.m == null) {
                    this.m = this.f();
                }
                final Bitmap m3 = this.m;
                final int r5 = this.r;
                m3.setPixels(array3, 0, r5, 0, 0, r5, this.q);
            }
        }
        final Bitmap f2 = this.f();
        final int r6 = this.r;
        f2.setPixels(array3, 0, r6, 0, 0, r6, this.q);
        return f2;
    }
}
