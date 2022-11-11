// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import c7.f;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;
import q6.g0;
import d7.c;
import com.airbnb.lottie.model.content.PolystarShape;
import android.graphics.PointF;
import t6.d;
import com.airbnb.lottie.model.content.PolystarShape$Type;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.Path;
import t6.a;

public final class n implements m, a, k
{
    public final Path a;
    public final String b;
    public final LottieDrawable c;
    public final PolystarShape$Type d;
    public final boolean e;
    public final boolean f;
    public final d g;
    public final t6.a<?, PointF> h;
    public final d i;
    public final d j;
    public final d k;
    public final d l;
    public final d m;
    public final b n;
    public boolean o;
    
    public n(final LottieDrawable c, final com.airbnb.lottie.model.layer.a a, final PolystarShape polystarShape) {
        this.a = new Path();
        this.n = new b(0);
        this.c = c;
        this.b = polystarShape.a;
        final PolystarShape$Type b = polystarShape.b;
        this.d = b;
        this.e = polystarShape.j;
        this.f = polystarShape.k;
        final t6.a a2 = polystarShape.c.a();
        this.g = (d)a2;
        final t6.a a3 = polystarShape.d.a();
        this.h = a3;
        final t6.a a4 = polystarShape.e.a();
        this.i = (d)a4;
        final t6.a a5 = polystarShape.g.a();
        this.k = (d)a5;
        final t6.a a6 = polystarShape.i.a();
        this.m = (d)a6;
        final PolystarShape$Type star = PolystarShape$Type.STAR;
        if (b == star) {
            this.j = (d)polystarShape.f.a();
            this.l = (d)polystarShape.h.a();
        }
        else {
            this.j = null;
            this.l = null;
        }
        a.c(a2);
        a.c(a3);
        a.c(a4);
        a.c(a5);
        a.c(a6);
        if (b == star) {
            a.c((t6.a<?, ?>)this.j);
            a.c((t6.a<?, ?>)this.l);
        }
        a2.a((a)this);
        a3.a((a)this);
        a4.a((a)this);
        a5.a((a)this);
        a6.a((a)this);
        if (b == star) {
            ((t6.a)this.j).a((a)this);
            ((t6.a)this.l).a((a)this);
        }
    }
    
    public final Path T0() {
        if (this.o) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.o = true;
            return this.a;
        }
        final int n = n$a.a[((Enum)this.d).ordinal()];
        double n2 = 0.0;
        if (n != 1) {
            if (n == 2) {
                final int n3 = (int)Math.floor(((t6.a<K, Float>)this.g).f());
                final d i = this.i;
                if (i != null) {
                    n2 = ((t6.a<K, Float>)i).f();
                }
                final double radians = Math.toRadians(n2 - 90.0);
                final double n4 = n3;
                final float n5 = (float)(6.283185307179586 / n4);
                final float n6 = ((t6.a<K, Float>)this.m).f() / 100.0f;
                final float floatValue = ((t6.a<K, Float>)this.k).f();
                final double n7 = floatValue;
                float n8 = (float)(Math.cos(radians) * n7);
                float n9 = (float)(Math.sin(radians) * n7);
                this.a.moveTo(n8, n9);
                final double n10 = n5;
                double n11 = radians + n10;
                final double ceil = Math.ceil(n4);
                float n13;
                float n14;
                for (int n12 = 0; n12 < ceil; ++n12, n9 = n14, n8 = n13) {
                    n13 = (float)(Math.cos(n11) * n7);
                    n14 = (float)(Math.sin(n11) * n7);
                    if (n6 != 0.0f) {
                        final double n15 = (float)(Math.atan2(n9, n8) - 1.5707963267948966);
                        final float n16 = (float)Math.cos(n15);
                        final float n17 = (float)Math.sin(n15);
                        final double n18 = (float)(Math.atan2(n14, n13) - 1.5707963267948966);
                        final float n19 = (float)Math.cos(n18);
                        final float n20 = (float)Math.sin(n18);
                        final float n21 = floatValue * n6 * 0.25f;
                        this.a.cubicTo(n8 - n16 * n21, n9 - n17 * n21, n13 + n19 * n21, n14 + n21 * n20, n13, n14);
                    }
                    else {
                        this.a.lineTo(n13, n14);
                    }
                    n11 += n10;
                }
                final PointF pointF = this.h.f();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            }
        }
        else {
            final float floatValue2 = ((t6.a<K, Float>)this.g).f();
            final d j = this.i;
            if (j != null) {
                n2 = ((t6.a<K, Float>)j).f();
            }
            final double radians2 = Math.toRadians(n2 - 90.0);
            final double n22 = floatValue2;
            float n24;
            final float n23 = n24 = (float)(6.283185307179586 / n22);
            if (this.f) {
                n24 = n23 * -1.0f;
            }
            final float n25 = n24 / 2.0f;
            final float n26 = floatValue2 - (int)floatValue2;
            final float n27 = fcmpl(n26, 0.0f);
            double n28 = radians2;
            if (n27 != 0) {
                n28 = radians2 + (1.0f - n26) * n25;
            }
            final float floatValue3 = ((t6.a<K, Float>)this.k).f();
            final float floatValue4 = ((t6.a<K, Float>)this.j).f();
            final d l = this.l;
            float n29;
            if (l != null) {
                n29 = ((t6.a<K, Float>)l).f() / 100.0f;
            }
            else {
                n29 = 0.0f;
            }
            final d m = this.m;
            float n30;
            if (m != null) {
                n30 = ((t6.a<K, Float>)m).f() / 100.0f;
            }
            else {
                n30 = 0.0f;
            }
            float b;
            float n32;
            float n33;
            double n34;
            if (n27 != 0) {
                b = a.b(floatValue3, floatValue4, n26, floatValue4);
                final double n31 = b;
                n32 = (float)(Math.cos(n28) * n31);
                n33 = (float)(n31 * Math.sin(n28));
                this.a.moveTo(n32, n33);
                n34 = n28 + n24 * n26 / 2.0f;
            }
            else {
                final double n35 = floatValue3;
                n32 = (float)(Math.cos(n28) * n35);
                n33 = (float)(Math.sin(n28) * n35);
                this.a.moveTo(n32, n33);
                n34 = n28 + n25;
                b = 0.0f;
            }
            final double n36 = Math.ceil(n22) * 2.0;
            int n37 = 0;
            int n38 = 0;
            float n39 = n32;
            final float n40 = n24;
            while (true) {
                final double n41 = n37;
                if (n41 >= n36) {
                    break;
                }
                float n42;
                if (n38 != 0) {
                    n42 = floatValue3;
                }
                else {
                    n42 = floatValue4;
                }
                final float n43 = fcmpl(b, 0.0f);
                float n44;
                if (n43 != 0 && n41 == n36 - 2.0) {
                    n44 = n40 * n26 / 2.0f;
                }
                else {
                    n44 = n25;
                }
                if (n43 != 0 && n41 == n36 - 1.0) {
                    n42 = b;
                }
                final double n45 = n42;
                final float n46 = (float)(Math.cos(n34) * n45);
                final float n47 = (float)(n45 * Math.sin(n34));
                if (n29 == 0.0f && n30 == 0.0f) {
                    this.a.lineTo(n46, n47);
                }
                else {
                    final double n48 = (float)(Math.atan2(n33, n39) - 1.5707963267948966);
                    final float n49 = (float)Math.cos(n48);
                    final float n50 = (float)Math.sin(n48);
                    final double n51 = n47;
                    final float n52 = n47;
                    float n53 = n30;
                    final double n54 = (float)(Math.atan2(n51, n46) - 1.5707963267948966);
                    final float n55 = (float)Math.cos(n54);
                    final float n56 = (float)Math.sin(n54);
                    float n57;
                    if (n38 != 0) {
                        n57 = n29;
                    }
                    else {
                        n57 = n53;
                    }
                    if (n38 == 0) {
                        n53 = n29;
                    }
                    float n58;
                    if (n38 != 0) {
                        n58 = floatValue4;
                    }
                    else {
                        n58 = floatValue3;
                    }
                    float n59;
                    if (n38 != 0) {
                        n59 = floatValue3;
                    }
                    else {
                        n59 = floatValue4;
                    }
                    final float n60 = n58 * n57 * 0.47829f;
                    final float n61 = n49 * n60;
                    final float n62 = n60 * n50;
                    final float n63 = n59 * n53 * 0.47829f;
                    final float n64 = n55 * n63;
                    final float n65 = n63 * n56;
                    float n66 = n64;
                    float n67 = n61;
                    float n68 = n62;
                    float n69 = n65;
                    if (n27 != 0) {
                        if (n37 == 0) {
                            n67 = n61 * n26;
                            n68 = n62 * n26;
                            n66 = n64;
                            n69 = n65;
                        }
                        else {
                            n66 = n64;
                            n67 = n61;
                            n68 = n62;
                            n69 = n65;
                            if (n41 == n36 - 1.0) {
                                n66 = n64 * n26;
                                n69 = n65 * n26;
                                n68 = n62;
                                n67 = n61;
                            }
                        }
                    }
                    this.a.cubicTo(n39 - n67, n33 - n68, n46 + n66, n52 + n69, n46, n52);
                }
                n34 += n44;
                n38 ^= 0x1;
                ++n37;
                n39 = n46;
                n33 = n47;
            }
            final PointF pointF2 = this.h.f();
            this.a.offset(pointF2.x, pointF2.y);
            this.a.close();
        }
        this.a.close();
        this.n.c(this.a);
        this.o = true;
        return this.a;
    }
    
    public final void a(final d7.c c, final Object o) {
        if (o == g0.w) {
            ((t6.a<K, Object>)this.g).k(c);
        }
        else if (o == g0.x) {
            ((t6.a<K, Object>)this.i).k(c);
        }
        else if (o == g0.n) {
            this.h.k(c);
        }
        else {
            if (o == g0.y) {
                final d j = this.j;
                if (j != null) {
                    ((t6.a)j).k(c);
                    return;
                }
            }
            if (o == g0.z) {
                ((t6.a<K, Object>)this.k).k(c);
            }
            else {
                if (o == g0.A) {
                    final d l = this.l;
                    if (l != null) {
                        ((t6.a)l).k(c);
                        return;
                    }
                }
                if (o == g0.B) {
                    ((t6.a<K, Object>)this.m).k(c);
                }
            }
        }
    }
    
    public final void f() {
        this.o = false;
        this.c.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final s6.c c = list3.get(n);
            if (c instanceof u) {
                final u u = (u)c;
                if (u.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    this.n.a.add(u);
                    u.a((a)this);
                }
            }
            ++n;
        }
    }
    
    public final String getName() {
        return this.b;
    }
    
    public final void h(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        c7.f.d(d, n, list, d2, (k)this);
    }
}
