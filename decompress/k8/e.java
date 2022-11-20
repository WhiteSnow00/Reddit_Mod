// 
// Decompiled by Procyon v0.6.0
// 

package k8;

import t5.w;
import java.util.Arrays;
import android.util.Log;
import java.util.Iterator;
import java.nio.ByteOrder;
import c9.b;
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
    
    public e(final b c, final c l, final ByteBuffer byteBuffer, int highestOneBit) {
        this.b = new int[256];
        this.t = Bitmap$Config.ARGB_8888;
        this.c = (a$a)c;
        this.l = new c();
        monitorenter(this);
        Label_0214: {
            if (highestOneBit <= 0) {
                break Label_0214;
            }
            try {
                highestOneBit = Integer.highestOneBit(highestOneBit);
                this.o = 0;
                this.l = l;
                this.k = -1;
                (this.d = byteBuffer.asReadOnlyBuffer()).position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                final Iterator iterator = l.e.iterator();
                while (iterator.hasNext()) {
                    if (((k8.b)iterator.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                final int f = l.f;
                this.r = f / highestOneBit;
                final int g = l.g;
                this.q = g / highestOneBit;
                this.i = this.c.a(f * g);
                this.j = this.c.d(this.r * this.q);
                return;
                final StringBuilder sb = new StringBuilder();
                sb.append("Sample size must be >=0, not: ");
                sb.append(highestOneBit);
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
            final k8.b b = this.l.e.get(this.k);
            final int n = this.k - 1;
            k8.b b2;
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
    
    public final Bitmap h(final k8.b b, final k8.b b2) {
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
                    Label_0142: {
                        if (!b.f) {
                            final c l = this.l;
                            k = l.k;
                            if (b.k == null) {
                                break Label_0142;
                            }
                            k = k;
                            if (l.j != b.h) {
                                break Label_0142;
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
        final byte[] e = this.e;
        int n14 = n11;
        int n15 = n12;
        final int n16 = 0;
        int n18;
        int n17 = n18 = 0;
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
        int n28 = n16;
        int n29 = 0;
    Label_0558:
        while (true) {
            n29 = 8;
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
                n25 += (e[n18] & 0xFF) << n26;
                final int n30 = n18 + 1;
                final int n31 = n17 - 1;
                final int n32 = n26 + 8;
                final int n33 = n23;
                int n34 = n14;
                int n35 = n15;
                int n36 = n22;
                int n37 = n33;
                int n38 = n21;
                int n39 = n32;
                while (true) {
                    while (n39 >= n34) {
                        final int n40 = n25 & n35;
                        n25 >>= n34;
                        final int n41 = n39 - n34;
                        if (n40 == n9) {
                            n24 = -1;
                            n34 = n11;
                            n35 = n12;
                            n37 = n10;
                            n39 = n41;
                        }
                        else {
                            if (n40 == n9 + 1) {
                                n39 = n41;
                                final int n42 = n34;
                                n26 = n39;
                                n21 = n38;
                                n17 = n31;
                                n18 = n30;
                                n22 = n36;
                                n23 = n37;
                                n14 = n42;
                                n15 = n35;
                                continue Label_0558;
                            }
                            int n43;
                            if (n24 == -1) {
                                i3[n28] = g2[n40];
                                ++n28;
                                ++n27;
                                n38 = n40;
                                n43 = n36;
                            }
                            else {
                                int n44;
                                int n45;
                                if (n40 >= n37) {
                                    h[n36] = (byte)n38;
                                    n44 = n36 + 1;
                                    n45 = n24;
                                }
                                else {
                                    final int n46 = n40;
                                    n44 = n36;
                                    n45 = n46;
                                }
                                while (n45 >= n9) {
                                    h[n44] = g2[n45];
                                    ++n44;
                                    n45 = f[n45];
                                }
                                final int n47 = g2[n45] & 0xFF;
                                final byte b3 = (byte)n47;
                                i3[n28] = b3;
                                int n48;
                                int n49;
                                while (true) {
                                    n48 = n28 + 1;
                                    n49 = n27 + 1;
                                    if (n44 <= 0) {
                                        break;
                                    }
                                    --n44;
                                    i3[n48] = h[n44];
                                    n28 = n48;
                                    n27 = n49;
                                }
                                int n50 = n34;
                                int n51 = n37;
                                int n52 = n35;
                                if (n37 < 4096) {
                                    f[n37] = (short)n24;
                                    g2[n37] = b3;
                                    ++n37;
                                    n50 = n34;
                                    n51 = n37;
                                    n52 = n35;
                                    if ((n37 & n35) == 0x0) {
                                        n50 = n34;
                                        n51 = n37;
                                        n52 = n35;
                                        if (n37 < 4096) {
                                            n50 = n34 + 1;
                                            n52 = n35 + n37;
                                            n51 = n37;
                                        }
                                    }
                                }
                                final int n53 = n47;
                                n35 = n52;
                                n43 = n44;
                                n37 = n51;
                                n27 = n49;
                                n38 = n53;
                                n34 = n50;
                                n28 = n48;
                            }
                            n24 = n40;
                            n39 = n41;
                            e2 = this;
                            n36 = n43;
                        }
                    }
                    e2 = this;
                    continue;
                }
            }
            break;
        }
        int n54 = 0;
        Arrays.fill(i3, n28, n7, (byte)0);
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
            int n55 = -1;
            while (n54 < d3) {
                final int n56 = (n54 + b4) * r3;
                int n57 = n56 + a;
                final int n58 = n57 + c;
                final int n59 = n56 + r3;
                int n60;
                if (n59 < (n60 = n58)) {
                    n60 = n59;
                }
                int n61 = b.c * n54;
                while (n57 < n60) {
                    final byte b6 = i4[n61];
                    final int n62 = b6 & 0xFF;
                    int n63;
                    if (n62 != (n63 = n55)) {
                        final int n64 = a2[n62];
                        if (n64 != 0) {
                            j2[n57] = n64;
                            n63 = n55;
                        }
                        else {
                            n63 = b6;
                        }
                    }
                    ++n61;
                    ++n57;
                    n55 = n63;
                }
                ++n54;
            }
            final Boolean s = this.s;
            this.s = ((s != null && s) || (this.s == null && b5 && n55 != -1));
        }
        else {
            final int[] j3 = this.j;
            final int d4 = b.d;
            final int p3 = this.p;
            final int n65 = d4 / p3;
            final int n66 = b.b / p3;
            final int n67 = b.c / p3;
            int n68 = b.a / p3;
            final boolean b7 = this.k == 0;
            int r4 = this.r;
            int q = this.q;
            final byte[] i5 = this.i;
            final int[] a3 = this.a;
            Boolean s2 = this.s;
            int n69 = 0;
            final int n70 = 0;
            int n71 = 1;
            int n72 = n29;
            int n73 = n70;
            while (n69 < n65) {
                int n74;
                int n75;
                int n76;
                if (b.e) {
                    if (n73 >= n65) {
                        if (++n71 != 2) {
                            if (n71 != 3) {
                                if (n71 == 4) {
                                    n73 = 1;
                                    n72 = 2;
                                }
                            }
                            else {
                                n72 = 4;
                                n73 = 2;
                            }
                        }
                        else {
                            n73 = 4;
                        }
                        n74 = n73;
                    }
                    else {
                        n74 = n73;
                    }
                    n73 = n74 + n72;
                    n75 = n71;
                    n76 = n72;
                }
                else {
                    n74 = n69;
                    n76 = n72;
                    n75 = n71;
                }
                final int n77 = n74 + n66;
                final boolean b8 = p3 == 1;
                int n114;
                int n115;
                if (n77 < q) {
                    final int n78 = n77 * r4;
                    int n79 = n78 + n68;
                    final int n80 = n79 + n67;
                    final int n81 = n78 + r4;
                    int n82;
                    if (n81 < (n82 = n80)) {
                        n82 = n81;
                    }
                    final int n83 = n69 * p3 * b.c;
                    int n85;
                    int n86;
                    int n87;
                    Boolean b9;
                    if (b8) {
                        int n84 = n83;
                        while (true) {
                            n85 = n68;
                            n86 = r4;
                            n87 = q;
                            b9 = s2;
                            if (n79 >= n82) {
                                break;
                            }
                            final int n88 = a3[i5[n84] & 0xFF];
                            Boolean true;
                            if (n88 != 0) {
                                j3[n79] = n88;
                                true = s2;
                            }
                            else {
                                true = s2;
                                if (b7 && (true = s2) == null) {
                                    true = Boolean.TRUE;
                                }
                            }
                            n84 += p3;
                            ++n79;
                            s2 = true;
                        }
                    }
                    else {
                        final int b10 = w.b(n82, n79, p3, n83);
                        int n89 = n83;
                        final int n90 = n82;
                        while (true) {
                            n85 = n68;
                            n86 = r4;
                            n87 = q;
                            b9 = s2;
                            if (n79 >= n90) {
                                break;
                            }
                            final int c2 = b.c;
                            int n91 = 0;
                            int n92 = 0;
                            int n93 = 0;
                            int n94 = 0;
                            int n95 = 0;
                            int n98;
                            int n99;
                            int n100;
                            int n101;
                            int n102;
                            for (int n96 = n89; n96 < this.p + n89; ++n96, n91 = n98, n92 = n99, n93 = n100, n94 = n101, n95 = n102) {
                                final byte[] i6 = this.i;
                                if (n96 >= i6.length || n96 >= b10) {
                                    break;
                                }
                                final int n97 = this.a[i6[n96] & 0xFF];
                                n98 = n91;
                                n99 = n92;
                                n100 = n93;
                                n101 = n94;
                                n102 = n95;
                                if (n97 != 0) {
                                    n98 = n91 + (n97 >> 24 & 0xFF);
                                    n99 = n92 + (n97 >> 16 & 0xFF);
                                    n100 = n93 + (n97 >> 8 & 0xFF);
                                    n101 = n94 + (n97 & 0xFF);
                                    n102 = n95 + 1;
                                }
                            }
                            final int n103 = c2 + n89;
                            int n104 = n92;
                            int n105 = n91;
                            int n108;
                            int n109;
                            int n110;
                            int n111;
                            int n112;
                            for (int n106 = n103; n106 < this.p + n103; ++n106, n105 = n108, n104 = n109, n93 = n110, n94 = n111, n95 = n112) {
                                final byte[] i7 = this.i;
                                if (n106 >= i7.length || n106 >= b10) {
                                    break;
                                }
                                final int n107 = this.a[i7[n106] & 0xFF];
                                n108 = n105;
                                n109 = n104;
                                n110 = n93;
                                n111 = n94;
                                n112 = n95;
                                if (n107 != 0) {
                                    n108 = n105 + (n107 >> 24 & 0xFF);
                                    n109 = n104 + (n107 >> 16 & 0xFF);
                                    n110 = n93 + (n107 >> 8 & 0xFF);
                                    n111 = n94 + (n107 & 0xFF);
                                    n112 = n95 + 1;
                                }
                            }
                            int n113;
                            if (n95 == 0) {
                                n113 = 0;
                            }
                            else {
                                n113 = (n105 / n95 << 24 | n104 / n95 << 16 | n93 / n95 << 8 | n94 / n95);
                            }
                            Boolean true2;
                            if (n113 != 0) {
                                j3[n79] = n113;
                                true2 = s2;
                            }
                            else {
                                true2 = s2;
                                if (b7 && (true2 = s2) == null) {
                                    true2 = Boolean.TRUE;
                                }
                            }
                            n89 += p3;
                            ++n79;
                            s2 = true2;
                        }
                    }
                    n114 = n85;
                    n115 = n86;
                    q = n87;
                    s2 = b9;
                }
                else {
                    final int n116 = n68;
                    n115 = r4;
                    n114 = n116;
                }
                ++n69;
                final int n117 = n114;
                r4 = n115;
                n68 = n117;
                n71 = n75;
                n72 = n76;
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
                m3.setPixels(j, 0, r5, 0, 0, r5, this.q);
            }
        }
        final Bitmap f2 = this.f();
        final int r6 = this.r;
        f2.setPixels(j, 0, r6, 0, 0, r6, this.q);
        return f2;
    }
}
