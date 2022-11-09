// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.graphics.Path;

public final class 1gx implements 1BH, 1BI, a
{
    public final Path LIZ;
    public final String LIZIZ;
    public final 0LK LIZJ;
    public final 1Ba.a LIZLLL;
    public final 0JP<?, Float> LJ;
    public final 0JP<?, PointF> LJFF;
    public final 0JP<?, Float> LJI;
    public final 0JP<?, Float> LJII;
    public final 0JP<?, Float> LJIIIIZZ;
    public final 0JP<?, Float> LJIIIZ;
    public final 0JP<?, Float> LJIIJ;
    public 1BJ LJIIJJI;
    public 0JH LJIIL;
    public boolean LJIILIIL;
    
    static {
        Covode.recordClassIndex(2241);
    }
    
    public 1gx(final 0LK lizj, final 1hH 1hH, final 1Ba 1Ba) {
        this.LIZ = new Path();
        if (0KM.a.LIZ) {
            this.LJIIL = new 0JH();
        }
        this.LIZJ = lizj;
        this.LIZIZ = 1Ba.LIZ;
        final 1Ba.a liziz = 1Ba.LIZIZ;
        this.LIZLLL = liziz;
        final 0JP<Float, Float> liz = 1Ba.LIZJ.LIZ();
        this.LJ = liz;
        final 0JP<PointF, PointF> liz2 = 1Ba.LIZLLL.LIZ();
        this.LJFF = liz2;
        final 0JP<Float, Float> liz3 = 1Ba.LJ.LIZ();
        this.LJI = liz3;
        final 0JP<Float, Float> liz4 = 1Ba.LJI.LIZ();
        this.LJIIIIZZ = liz4;
        final 0JP<Float, Float> liz5 = 1Ba.LJIIIIZZ.LIZ();
        this.LJIIJ = liz5;
        if (liziz == 1Ba.a.Star) {
            this.LJII = 1Ba.LJFF.LIZ();
            this.LJIIIZ = 1Ba.LJII.LIZ();
        }
        else {
            this.LJII = null;
            this.LJIIIZ = null;
        }
        1hH.LIZ(liz);
        1hH.LIZ(liz2);
        1hH.LIZ(liz3);
        1hH.LIZ(liz4);
        1hH.LIZ(liz5);
        if (liziz == 1Ba.a.Star) {
            1hH.LIZ(this.LJII);
            1hH.LIZ(this.LJIIIZ);
        }
        liz.LIZ((0JP.a)this);
        liz2.LIZ((0JP.a)this);
        liz3.LIZ((0JP.a)this);
        liz4.LIZ((0JP.a)this);
        liz5.LIZ((0JP.a)this);
        if (liziz == 1Ba.a.Star) {
            this.LJII.LIZ((0JP.a)this);
            this.LJIIIZ.LIZ((0JP.a)this);
        }
    }
    
    @Override
    public final void LIZ() {
        this.LJIILIIL = false;
        this.LIZJ.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (t == 0LS.LJIILJJIL) {
            this.LJ.LIZ((0LI<Float>)0li);
            return;
        }
        if (t == 0LS.LJIILL) {
            this.LJI.LIZ((0LI<Float>)0li);
            return;
        }
        if (t == 0LS.LJII) {
            this.LJFF.LIZ((0LI<PointF>)0li);
            return;
        }
        if (t == 0LS.LJIILLIIL) {
            final 0JP<?, Float> ljii = this.LJII;
            if (ljii != null) {
                ljii.LIZ((0LI<Float>)0li);
                return;
            }
        }
        if (t == 0LS.LJIIZILJ) {
            this.LJIIIIZZ.LIZ((0LI<Float>)0li);
            return;
        }
        if (t == 0LS.LJIJ) {
            final 0JP<?, Float> ljiiiz = this.LJIIIZ;
            if (ljiiiz != null) {
                ljiiiz.LIZ((0LI<Float>)0li);
                return;
            }
        }
        if (t == 0LS.LJIJI) {
            this.LJIIJ.LIZ((0LI<Float>)0li);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list.size(); ++i) {
            final 0JI 0ji = list.get(i);
            if (0ji instanceof 1BJ) {
                final 1BJ ljiijji = (1BJ)0ji;
                if (ljiijji.LIZ == 1Bh.a.Simultaneously) {
                    if (0KM.a.LIZ) {
                        final 0JH ljiil = this.LJIIL;
                        if (ljiil != null) {
                            ljiil.LIZ(ljiijji);
                            ljiijji.LIZ(this);
                            continue;
                        }
                    }
                    (this.LJIIJJI = ljiijji).LIZ(this);
                }
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZIZ;
    }
    
    @Override
    public final Path LJ() {
        if (this.LJIILIIL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        final int n = 0JL.LIZ[this.LIZLLL.ordinal()];
        double n2 = 0.0;
        if (n != 1) {
            if (n == 2) {
                final int n3 = (int)Math.floor(this.LJ.LJFF());
                final 0JP<?, Float> lji = this.LJI;
                if (lji != null) {
                    n2 = lji.LJFF();
                }
                final double radians = Math.toRadians(n2 - 90.0);
                final double n4 = n3;
                final float n5 = (float)(6.283185307179586 / n4);
                final float n6 = this.LJIIJ.LJFF() / 100.0f;
                final float floatValue = this.LJIIIIZZ.LJFF();
                final double n7 = floatValue;
                float n8 = (float)(n7 * Math.cos(radians));
                float n9 = (float)(n7 * Math.sin(radians));
                this.LIZ.moveTo(n8, n9);
                final double n10 = n5;
                double n11 = radians + n10;
                final double ceil = Math.ceil(n4);
                float n13;
                float n14;
                for (int n12 = 0; n12 < ceil; ++n12, n9 = n14, n8 = n13) {
                    n13 = (float)(Math.cos(n11) * n7);
                    n14 = (float)(n7 * Math.sin(n11));
                    if (n6 != 0.0f) {
                        final double n15 = (float)(Math.atan2(n9, n8) - 1.5707963267948966);
                        final float n16 = (float)Math.cos(n15);
                        final float n17 = (float)Math.sin(n15);
                        final double n18 = (float)(Math.atan2(n14, n13) - 1.5707963267948966);
                        final float n19 = (float)Math.cos(n18);
                        final float n20 = (float)Math.sin(n18);
                        final float n21 = floatValue * n6 * 0.25f;
                        this.LIZ.cubicTo(n8 - n16 * n21, n9 - n17 * n21, n13 + n19 * n21, n14 + n21 * n20, n13, n14);
                    }
                    else {
                        this.LIZ.lineTo(n13, n14);
                    }
                    n11 += n10;
                }
                final PointF pointF = this.LJFF.LJFF();
                this.LIZ.offset(pointF.x, pointF.y);
                this.LIZ.close();
            }
        }
        else {
            final float floatValue2 = this.LJ.LJFF();
            final 0JP<?, Float> lji2 = this.LJI;
            if (lji2 != null) {
                n2 = lji2.LJFF();
            }
            final double radians2 = Math.toRadians(n2 - 90.0);
            final double n22 = floatValue2;
            final float n23 = (float)(6.283185307179586 / n22);
            final float n24 = n23 / 2.0f;
            final float n25 = floatValue2 - (int)floatValue2;
            float n26 = fcmpl(n25, 0.0f);
            double n27 = radians2;
            if (n26 != 0) {
                n27 = radians2 + (1.0f - n25) * n24;
            }
            final float floatValue3 = this.LJIIIIZZ.LJFF();
            final float floatValue4 = this.LJII.LJFF();
            final 0JP<?, Float> ljiiiz = this.LJIIIZ;
            float n28;
            if (ljiiiz != null) {
                n28 = ljiiiz.LJFF() / 100.0f;
            }
            else {
                n28 = 0.0f;
            }
            final 0JP<?, Float> ljiij = this.LJIIJ;
            float n29;
            if (ljiij != null) {
                n29 = ljiij.LJFF() / 100.0f;
            }
            else {
                n29 = 0.0f;
            }
            float n30;
            float n32;
            float n33;
            double n34;
            if (n26 != 0) {
                n30 = (floatValue3 - floatValue4) * n25 + floatValue4;
                final double n31 = n30;
                n32 = (float)(n31 * Math.cos(n27));
                n33 = (float)(n31 * Math.sin(n27));
                this.LIZ.moveTo(n32, n33);
                n34 = n27 + n23 * n25 / 2.0f;
            }
            else {
                n26 = 0;
                final double n35 = floatValue3;
                n32 = (float)(Math.cos(n27) * n35);
                n33 = (float)(n35 * Math.sin(n27));
                this.LIZ.moveTo(n32, n33);
                n34 = n27 + n24;
                n30 = 0.0f;
            }
            final double n36 = Math.ceil(n22) * 2.0;
            int n37 = 0;
            int n38 = 0;
            float n39 = n32;
            float n40 = n33;
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
                final float n43 = fcmpl(n30, 0.0f);
                float n44;
                if (n43 != 0 && n41 == n36 - 2.0) {
                    n44 = n23 * n25 / 2.0f;
                }
                else {
                    n44 = n24;
                }
                float n45 = n42;
                if (n43 != 0) {
                    n45 = n42;
                    if (n41 == n36 - 1.0) {
                        n45 = n30;
                    }
                }
                final double n46 = n45;
                final float n47 = (float)(Math.cos(n34) * n46);
                final float n48 = (float)(n46 * Math.sin(n34));
                if (n28 == 0.0f && n29 == 0.0f) {
                    this.LIZ.lineTo(n47, n48);
                }
                else {
                    final double n49 = (float)(Math.atan2(n40, n39) - 1.5707963267948966);
                    final float n50 = (float)Math.cos(n49);
                    final float n51 = (float)Math.sin(n49);
                    final double n52 = (float)(Math.atan2(n48, n47) - 1.5707963267948966);
                    final float n53 = (float)Math.cos(n52);
                    final float n54 = (float)Math.sin(n52);
                    float n55;
                    float n56;
                    float n57;
                    float n58;
                    if (n38 != 0) {
                        n55 = n28;
                        n56 = n29;
                        n57 = floatValue4;
                        n58 = floatValue3;
                    }
                    else {
                        n55 = n29;
                        n56 = n28;
                        n57 = floatValue3;
                        n58 = floatValue4;
                    }
                    final float n59 = n57 * n55 * 0.47829f;
                    final float n60 = n50 * n59;
                    final float n61 = n59 * n51;
                    final float n62 = n58 * n56 * 0.47829f;
                    final float n63 = n53 * n62;
                    float n65;
                    final float n64 = n65 = n62 * n54;
                    float n66 = n63;
                    float n67 = n60;
                    float n68 = n61;
                    if (n26 != 0) {
                        if (n37 == 0) {
                            n67 = n60 * n25;
                            n68 = n61 * n25;
                            n66 = n63;
                            n65 = n64;
                        }
                        else {
                            n65 = n64;
                            n66 = n63;
                            n67 = n60;
                            n68 = n61;
                            if (n41 == n36 - 1.0) {
                                n66 = n63 * n25;
                                n65 = n64 * n25;
                                n67 = n60;
                                n68 = n61;
                            }
                        }
                    }
                    this.LIZ.cubicTo(n39 - n67, n40 - n68, n47 + n66, n48 + n65, n47, n48);
                }
                n34 += n44;
                n38 ^= 0x1;
                ++n37;
                n40 = n48;
                n39 = n47;
            }
            final PointF pointF2 = this.LJFF.LJFF();
            this.LIZ.offset(pointF2.x, pointF2.y);
            this.LIZ.close();
        }
        this.LIZ.close();
        while (true) {
            Label_0086: {
                if (!0KM.a.LIZ) {
                    break Label_0086;
                }
                final 0JH ljiil = this.LJIIL;
                if (ljiil == null) {
                    break Label_0086;
                }
                ljiil.LIZ(this.LIZ);
                this.LJIILIIL = true;
                return this.LIZ;
            }
            0L9.LIZ(this.LIZ, this.LJIIJJI);
            continue;
        }
    }
}
