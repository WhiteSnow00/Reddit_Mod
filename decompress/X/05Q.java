// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class 05Q
{
    public static 05R LJII;
    public static int LJIIIIZZ;
    public int LIZ;
    public a LIZIZ;
    public 13r[] LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public final 05O LJI;
    public HashMap<String, 05V> LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean[] LJIIL;
    public int LJIILIIL;
    public 05V[] LJIILJJIL;
    public int LJIILL;
    public final a LJIILLIIL;
    
    static {
        Covode.recordClassIndex(623);
        05Q.LJIIIIZZ = 1000;
    }
    
    public 05Q() {
        this.LJIIJ = 32;
        this.LJIIJJI = 32;
        this.LJIIL = new boolean[32];
        this.LJ = 1;
        this.LJIILIIL = 32;
        this.LJIILJJIL = new 05V[05Q.LJIIIIZZ];
        this.LIZJ = new 13r[32];
        this.LJFF();
        final 05O lji = new 05O();
        this.LJI = lji;
        this.LIZIZ = (a)new 1fi(lji);
        this.LJIILLIIL = (a)new 13r(lji);
    }
    
    private 05V LIZ(final 05V.a a) {
        final 05V 05V = this.LJI.LIZIZ.LIZ();
        05V 05V3;
        if (05V == null) {
            final 05V 05V2 = new 05V(a);
            05V2.LJII = a;
            05V3 = 05V2;
        }
        else {
            05V.LIZ();
            05V.LJII = a;
            05V3 = 05V;
        }
        final int ljiill = this.LJIILL;
        final int ljiiiizz = 05Q.LJIIIIZZ;
        if (ljiill >= ljiiiizz) {
            this.LJIILJJIL = Arrays.copyOf(this.LJIILJJIL, 05Q.LJIIIIZZ = ljiiiizz * 2);
        }
        return this.LJIILJJIL[this.LJIILL++] = 05V3;
    }
    
    private final int LIZIZ(final a a) {
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LJII;
        }
        for (int i = 0; i < this.LJ; ++i) {
            this.LJIIL[i] = false;
        }
        int n = 0;
        int n2;
        while (true) {
            final 05R ljii2 = 05Q.LJII;
            if (ljii2 != null) {
                ++ljii2.LJIIIIZZ;
            }
            n2 = n + 1;
            if (n2 >= this.LJ * 2) {
                return n2;
            }
            if (a.LIZIZ() != null) {
                this.LJIIL[a.LIZIZ().LIZJ] = true;
            }
            final 05V liz = a.LIZ(this.LJIIL);
            if (liz == null) {
                break;
            }
            if (this.LJIIL[liz.LIZJ]) {
                return n2;
            }
            this.LJIIL[liz.LIZJ] = true;
            float n3 = Float.MAX_VALUE;
            int j = 0;
            int lizlll = -1;
            while (j < this.LJFF) {
                final 13r 13r = this.LIZJ[j];
                int n4 = lizlll;
                float n5 = n3;
                if (13r.LIZ.LJII != 05V.a.UNRESTRICTED) {
                    n4 = lizlll;
                    n5 = n3;
                    if (!13r.LIZLLL) {
                        n4 = lizlll;
                        n5 = n3;
                        if (13r.LIZ(liz)) {
                            final float liziz = 13r.LIZJ.LIZIZ(liz);
                            n4 = lizlll;
                            n5 = n3;
                            if (liziz < 0.0f) {
                                final float n6 = -13r.LIZIZ / liziz;
                                n4 = lizlll;
                                n5 = n3;
                                if (n6 < n3) {
                                    n4 = j;
                                    n5 = n6;
                                }
                            }
                        }
                    }
                }
                ++j;
                lizlll = n4;
                n3 = n5;
            }
            if (lizlll < 0) {
                break;
            }
            final 13r 13r2 = this.LIZJ[lizlll];
            13r2.LIZ.LIZLLL = -1;
            final 05R ljii3 = 05Q.LJII;
            if (ljii3 != null) {
                ++ljii3.LJIIIZ;
            }
            13r2.LIZIZ(liz);
            13r2.LIZ.LIZLLL = lizlll;
            13r2.LIZ.LIZJ(13r2);
            n = n2;
        }
        return n2;
    }
    
    private final void LIZIZ(final 13r 13r) {
        if (this.LJFF > 0) {
            13r.LIZJ.LIZ(13r, this.LIZJ);
            if (13r.LIZJ.LIZ == 0) {
                13r.LIZLLL = true;
            }
        }
    }
    
    private final void LIZJ(final 13r 13r) {
        if (this.LIZJ[this.LJFF] != null) {
            this.LJI.LIZ.LIZ(this.LIZJ[this.LJFF]);
        }
        this.LIZJ[this.LJFF] = 13r;
        13r.LIZ.LIZLLL = this.LJFF;
        ++this.LJFF;
        13r.LIZ.LIZJ(13r);
    }
    
    private void LJ() {
        final int ljiij = this.LJIIJ * 2;
        this.LJIIJ = ljiij;
        this.LIZJ = Arrays.copyOf(this.LIZJ, ljiij);
        final 05O lji = this.LJI;
        lji.LIZJ = Arrays.copyOf(lji.LIZJ, this.LJIIJ);
        final int ljiij2 = this.LJIIJ;
        this.LJIIL = new boolean[ljiij2];
        this.LJIIJJI = ljiij2;
        this.LJIILIIL = ljiij2;
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LIZLLL;
            final 05R ljii2 = 05Q.LJII;
            ljii2.LJIILL = Math.max(ljii2.LJIILL, this.LJIIJ);
        }
    }
    
    private void LJFF() {
        int n = 0;
        while (true) {
            final 13r[] lizj = this.LIZJ;
            if (n >= lizj.length) {
                break;
            }
            final 13r 13r = lizj[n];
            if (13r != null) {
                this.LJI.LIZ.LIZ(13r);
            }
            this.LIZJ[n] = null;
            ++n;
        }
    }
    
    public final 05V LIZ(final int lj) {
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LJIIL;
        }
        if (this.LJ + 1 >= this.LJIIJJI) {
            this.LJ();
        }
        final 05V liz = this.LIZ(05V.a.ERROR);
        final int n = this.LIZ + 1;
        this.LIZ = n;
        ++this.LJ;
        liz.LIZJ = n;
        liz.LJ = lj;
        this.LJI.LIZJ[this.LIZ] = liz;
        this.LIZIZ.LIZJ(liz);
        return liz;
    }
    
    public final 05V LIZ(final Object o) {
        05V 05V = null;
        if (o == null) {
            return null;
        }
        if (this.LJ + 1 >= this.LJIIJJI) {
            this.LJ();
        }
        if (o instanceof 05D) {
            final 05D 05D = (05D)o;
            05V 05V2;
            if ((05V2 = 05D.LJIIIIZZ) == null) {
                05D.LIZ();
                05V2 = 05D.LJIIIIZZ;
            }
            if (05V2.LIZJ != -1 && 05V2.LIZJ <= this.LIZ) {
                05V = 05V2;
                if (this.LJI.LIZJ[05V2.LIZJ] != null) {
                    return 05V;
                }
            }
            if (05V2.LIZJ != -1) {
                05V2.LIZ();
            }
            final int n = this.LIZ + 1;
            this.LIZ = n;
            ++this.LJ;
            05V2.LIZJ = n;
            05V2.LJII = X.05V.a.UNRESTRICTED;
            this.LJI.LIZJ[this.LIZ] = 05V2;
            05V = 05V2;
        }
        return 05V;
    }
    
    public final void LIZ() {
        for (int i = 0; i < this.LJI.LIZJ.length; ++i) {
            final 05V 05V = this.LJI.LIZJ[i];
            if (05V != null) {
                05V.LIZ();
            }
        }
        this.LJI.LIZIZ.LIZ(this.LJIILJJIL, this.LJIILL);
        this.LJIILL = 0;
        Arrays.fill(this.LJI.LIZJ, null);
        final HashMap<String, 05V> ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            ljiiiz.clear();
        }
        this.LIZ = 0;
        this.LIZIZ.LIZ();
        this.LJ = 1;
        this.LJFF();
        this.LJFF = 0;
    }
    
    public final void LIZ(final a a) {
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LJIJI;
            final 05R ljii2 = 05Q.LJII;
            ljii2.LJIJJ = Math.max(ljii2.LJIJJ, this.LJ);
            final 05R ljii3 = 05Q.LJII;
            ljii3.LJIJJLI = Math.max(ljii3.LJIJJLI, this.LJFF);
        }
        this.LIZIZ((13r)a);
    Label_0567:
        for (int i = 0; i < this.LJFF; ++i) {
            if (this.LIZJ[i].LIZ.LJII != 05V.a.UNRESTRICTED && this.LIZJ[i].LIZIZ < 0.0f) {
                boolean b = false;
                int n = 0;
                while (true) {
                    final 05R ljii4 = 05Q.LJII;
                    if (ljii4 != null) {
                        ++ljii4.LJIIJ;
                    }
                    final int n2 = n + 1;
                    float n3 = Float.MAX_VALUE;
                    int j = 0;
                    int lizlll = -1;
                    int n4 = -1;
                    int n5 = 0;
                    while (j < this.LJFF) {
                        final 13r 13r = this.LIZJ[j];
                        int n6 = n5;
                        int n7 = lizlll;
                        int n8 = n4;
                        float n9 = n3;
                        if (13r.LIZ.LJII != 05V.a.UNRESTRICTED) {
                            n6 = n5;
                            n7 = lizlll;
                            n8 = n4;
                            n9 = n3;
                            if (!13r.LIZLLL) {
                                n6 = n5;
                                n7 = lizlll;
                                n8 = n4;
                                n9 = n3;
                                if (13r.LIZIZ < 0.0f) {
                                    int n10 = 1;
                                    while (true) {
                                        n6 = n5;
                                        n7 = lizlll;
                                        n8 = n4;
                                        n9 = n3;
                                        if (n10 >= this.LJ) {
                                            break;
                                        }
                                        final 05V 05V = this.LJI.LIZJ[n10];
                                        final float liziz = 13r.LIZJ.LIZIZ(05V);
                                        int n11 = n5;
                                        int n12 = lizlll;
                                        int n13 = n4;
                                        float n14 = n3;
                                        if (liziz > 0.0f) {
                                            final int n15 = 0;
                                            int n16 = n4;
                                            int n17 = n15;
                                            int n18 = lizlll;
                                            int n19 = n5;
                                            while (true) {
                                                final float n20 = 05V.LJI[n17] / liziz;
                                                int n21 = 0;
                                                int n22 = 0;
                                                int n23 = 0;
                                                Label_0395: {
                                                    if (n20 >= n3 || n17 != n19) {
                                                        n21 = n19;
                                                        n22 = n18;
                                                        n23 = n16;
                                                        if (n17 <= n19) {
                                                            break Label_0395;
                                                        }
                                                    }
                                                    n23 = n10;
                                                    n3 = n20;
                                                    n21 = n17;
                                                    n22 = j;
                                                }
                                                ++n17;
                                                n11 = n21;
                                                n12 = n22;
                                                n13 = n23;
                                                n14 = n3;
                                                if (n17 >= 7) {
                                                    break;
                                                }
                                                n19 = n21;
                                                n18 = n22;
                                                n16 = n23;
                                            }
                                        }
                                        ++n10;
                                        n5 = n11;
                                        lizlll = n12;
                                        n4 = n13;
                                        n3 = n14;
                                    }
                                }
                            }
                        }
                        ++j;
                        n5 = n6;
                        lizlll = n7;
                        n4 = n8;
                        n3 = n9;
                    }
                    if (lizlll != -1) {
                        final 13r 13r2 = this.LIZJ[lizlll];
                        13r2.LIZ.LIZLLL = -1;
                        final 05R ljii5 = 05Q.LJII;
                        if (ljii5 != null) {
                            ++ljii5.LJIIIZ;
                        }
                        13r2.LIZIZ(this.LJI.LIZJ[n4]);
                        13r2.LIZ.LIZLLL = lizlll;
                        13r2.LIZ.LIZJ(13r2);
                    }
                    else {
                        b = true;
                    }
                    if (n2 > this.LJ / 2 || b) {
                        break Label_0567;
                    }
                    n = n2;
                }
            }
            else {}
        }
        this.LIZIZ(a);
        this.LIZLLL();
    }
    
    public final void LIZ(final 05V liz, final int n) {
        final int lizlll = liz.LIZLLL;
        if (liz.LIZLLL == -1) {
            final 13r liziz = this.LIZIZ();
            liziz.LIZ = liz;
            final float n2 = (float)n;
            liz.LJFF = n2;
            liziz.LIZIZ = n2;
            liziz.LIZLLL = true;
            this.LIZ(liziz);
            return;
        }
        final 13r 13r = this.LIZJ[lizlll];
        if (13r.LIZLLL) {
            13r.LIZIZ = (float)n;
            return;
        }
        if (13r.LIZJ.LIZ == 0) {
            13r.LIZLLL = true;
            13r.LIZIZ = (float)n;
            return;
        }
        final 13r liziz2 = this.LIZIZ();
        if (n < 0) {
            liziz2.LIZIZ = (float)(n * -1);
            liziz2.LIZJ.LIZ(liz, 1.0f);
        }
        else {
            liziz2.LIZIZ = (float)n;
            liziz2.LIZJ.LIZ(liz, -1.0f);
        }
        this.LIZ(liziz2);
    }
    
    public final void LIZ(final 05V 05V, final 05V 05V2, final int n, final float n2, final 05V 05V3, final 05V 05V4, final int n3, final int n4) {
        final 13r liziz = this.LIZIZ();
        if (05V2 == 05V3) {
            liziz.LIZJ.LIZ(05V, 1.0f);
            liziz.LIZJ.LIZ(05V4, 1.0f);
            liziz.LIZJ.LIZ(05V2, -2.0f);
        }
        else if (n2 == 0.5f) {
            liziz.LIZJ.LIZ(05V, 1.0f);
            liziz.LIZJ.LIZ(05V2, -1.0f);
            liziz.LIZJ.LIZ(05V3, -1.0f);
            liziz.LIZJ.LIZ(05V4, 1.0f);
            if (n > 0 || n3 > 0) {
                liziz.LIZIZ = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            liziz.LIZJ.LIZ(05V, -1.0f);
            liziz.LIZJ.LIZ(05V2, 1.0f);
            liziz.LIZIZ = (float)n;
        }
        else if (n2 >= 1.0f) {
            liziz.LIZJ.LIZ(05V3, -1.0f);
            liziz.LIZJ.LIZ(05V4, 1.0f);
            liziz.LIZIZ = (float)n3;
        }
        else {
            final 05N lizj = liziz.LIZJ;
            final float n5 = 1.0f - n2;
            lizj.LIZ(05V, n5 * 1.0f);
            liziz.LIZJ.LIZ(05V2, n5 * -1.0f);
            liziz.LIZJ.LIZ(05V3, -1.0f * n2);
            liziz.LIZJ.LIZ(05V4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                liziz.LIZIZ = -n * n5 + n3 * n2;
            }
        }
        if (n4 != 6) {
            liziz.LIZ(this, n4);
        }
        this.LIZ(liziz);
    }
    
    public final void LIZ(final 05V 05V, final 05V 05V2, final int n, final int n2) {
        final 13r liziz = this.LIZIZ();
        final 05V lizj = this.LIZJ();
        lizj.LJ = 0;
        liziz.LIZ(05V, 05V2, lizj, n);
        if (n2 != 6) {
            this.LIZ(liziz, (int)(liziz.LIZJ.LIZIZ(lizj) * -1.0f), n2);
        }
        this.LIZ(liziz);
    }
    
    public final void LIZ(final 05V 05V, final 05V 05V2, final 05V 05V3, final 05V 05V4, final float n) {
        final 13r liziz = this.LIZIZ();
        liziz.LIZ(05V, 05V2, 05V3, 05V4, n);
        this.LIZ(liziz);
    }
    
    public final void LIZ(final 13r 13r) {
        if (13r == null) {
            return;
        }
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LJFF;
            if (13r.LIZLLL) {
                final 05R ljii2 = 05Q.LJII;
                ++ljii2.LJI;
            }
        }
        if (this.LJFF + 1 >= this.LJIILIIL || this.LJ + 1 >= this.LJIIJJI) {
            this.LJ();
        }
        if (!13r.LIZLLL) {
            this.LIZIZ(13r);
            if (13r.LIZ == null && 13r.LIZIZ == 0.0f && 13r.LIZJ.LIZ == 0) {
                return;
            }
            if (13r.LIZIZ < 0.0f) {
                13r.LIZIZ *= -1.0f;
                final 05N lizj = 13r.LIZJ;
                for (int lji = lizj.LJI, n = 0; lji != -1 && n < lizj.LIZ; lji = lizj.LJ[lji], ++n) {
                    final float[] ljff = lizj.LJFF;
                    ljff[lji] *= -1.0f;
                }
            }
            final 05N lizj2 = 13r.LIZJ;
            int lji2 = lizj2.LJI;
            int n2 = 0;
            05V 05V = null;
            05V 05V2 = null;
            float n3 = 0.0f;
            int n4 = 0;
            float n5 = 0.0f;
            int n6 = 0;
        Label_0327_Outer:
            while (lji2 != -1 && n2 < lizj2.LIZ) {
                final float n7 = lizj2.LJFF[lji2];
                final 05V 05V3 = lizj2.LIZJ.LIZJ[lizj2.LIZLLL[lji2]];
                while (true) {
                    Label_0419: {
                        05V 05V4;
                        float n8;
                        int n9;
                        float n10;
                        int n11;
                        05V 05V5;
                        if (n7 < 0.0f) {
                            if (n7 <= -0.001f) {
                                break Label_0419;
                            }
                            lizj2.LJFF[lji2] = 0.0f;
                            05V3.LIZIZ(lizj2.LIZIZ);
                            05V4 = 05V2;
                            n8 = n3;
                            n9 = n4;
                            n10 = n5;
                            n11 = n6;
                            05V5 = 05V;
                        }
                        else {
                            if (n7 >= 0.001f) {
                                break Label_0419;
                            }
                            lizj2.LJFF[lji2] = 0.0f;
                            05V3.LIZIZ(lizj2.LIZIZ);
                            05V5 = 05V;
                            n11 = n6;
                            n10 = n5;
                            n9 = n4;
                            n8 = n3;
                            05V4 = 05V2;
                        }
                        lji2 = lizj2.LJ[lji2];
                        ++n2;
                        05V = 05V5;
                        n6 = n11;
                        n5 = n10;
                        n4 = n9;
                        n3 = n8;
                        05V2 = 05V4;
                        continue Label_0327_Outer;
                    }
                    05V 05V5 = 05V;
                    int n11 = n6;
                    float n10 = n5;
                    int n9 = n4;
                    float n8 = n3;
                    05V 05V4 = 05V2;
                    if (n7 == 0.0f) {
                        continue;
                    }
                    if (05V3.LJII == X.05V.a.UNRESTRICTED) {
                        if (05V2 == null) {
                            n9 = (lizj2.LIZ(05V3) ? 1 : 0);
                        }
                        else if (n3 > n7) {
                            n9 = (lizj2.LIZ(05V3) ? 1 : 0);
                        }
                        else {
                            05V5 = 05V;
                            n11 = n6;
                            n10 = n5;
                            n9 = n4;
                            n8 = n3;
                            05V4 = 05V2;
                            if (n4 != 0) {
                                continue;
                            }
                            05V5 = 05V;
                            n11 = n6;
                            n10 = n5;
                            n9 = n4;
                            n8 = n3;
                            05V4 = 05V2;
                            if (lizj2.LIZ(05V3)) {
                                n9 = 1;
                                05V5 = 05V;
                                n11 = n6;
                                n10 = n5;
                                n8 = n7;
                                05V4 = 05V3;
                            }
                            continue;
                        }
                        05V5 = 05V;
                        n11 = n6;
                        n10 = n5;
                        n8 = n7;
                        05V4 = 05V3;
                        continue;
                    }
                    05V5 = 05V;
                    n11 = n6;
                    n10 = n5;
                    n9 = n4;
                    n8 = n3;
                    if ((05V4 = 05V2) != null) {
                        continue;
                    }
                    05V5 = 05V;
                    n11 = n6;
                    n10 = n5;
                    n9 = n4;
                    n8 = n3;
                    05V4 = 05V2;
                    if (n7 < 0.0f) {
                        if (05V == null) {
                            n11 = (lizj2.LIZ(05V3) ? 1 : 0);
                        }
                        else if (n5 > n7) {
                            n11 = (lizj2.LIZ(05V3) ? 1 : 0);
                        }
                        else {
                            05V5 = 05V;
                            n11 = n6;
                            n10 = n5;
                            n9 = n4;
                            n8 = n3;
                            05V4 = 05V2;
                            if (n6 != 0) {
                                continue;
                            }
                            05V5 = 05V;
                            n11 = n6;
                            n10 = n5;
                            n9 = n4;
                            n8 = n3;
                            05V4 = 05V2;
                            if (lizj2.LIZ(05V3)) {
                                n11 = 1;
                                05V5 = 05V3;
                                n10 = n7;
                                n9 = n4;
                                n8 = n3;
                                05V4 = 05V2;
                            }
                            continue;
                        }
                        05V5 = 05V3;
                        n10 = n7;
                        n9 = n4;
                        n8 = n3;
                        05V4 = 05V2;
                    }
                    continue;
                }
            }
            int n12 = 0;
            Label_0808: {
                05V 05V6;
                if (05V2 != null) {
                    05V6 = 05V2;
                }
                else if ((05V6 = 05V) == null) {
                    n12 = 1;
                    break Label_0808;
                }
                13r.LIZIZ(05V6);
                n12 = 0;
            }
            if (13r.LIZJ.LIZ == 0) {
                13r.LIZLLL = true;
            }
            int n14;
            if (n12 != 0) {
                final 05R ljii3 = 05Q.LJII;
                if (ljii3 != null) {
                    ++ljii3.LJIILJJIL;
                }
                if (this.LJ + 1 >= this.LJIIJJI) {
                    this.LJ();
                }
                final 05V liz = this.LIZ(X.05V.a.SLACK);
                final int n13 = this.LIZ + 1;
                this.LIZ = n13;
                ++this.LJ;
                liz.LIZJ = n13;
                this.LJI.LIZJ[this.LIZ] = liz;
                13r.LIZ = liz;
                this.LIZJ(13r);
                this.LJIILLIIL.LIZ((a)13r);
                this.LIZIZ(this.LJIILLIIL);
                if (liz.LIZLLL == -1) {
                    if (13r.LIZ == liz) {
                        final 05V liz2 = 13r.LIZJ.LIZ(null, liz);
                        if (liz2 != null) {
                            final 05R ljii4 = 05Q.LJII;
                            if (ljii4 != null) {
                                ++ljii4.LJIIIZ;
                            }
                            13r.LIZIZ(liz2);
                        }
                    }
                    if (!13r.LIZLLL) {
                        13r.LIZ.LIZJ(13r);
                    }
                    --this.LJFF;
                }
                n14 = 1;
            }
            else {
                n14 = 0;
            }
            if (13r.LIZ == null || (13r.LIZ.LJII != X.05V.a.UNRESTRICTED && 13r.LIZIZ < 0.0f)) {
                return;
            }
            if (n14 != 0) {
                return;
            }
        }
        this.LIZJ(13r);
    }
    
    public final void LIZ(final 13r 13r, final int n, final int n2) {
        13r.LIZJ.LIZ(this.LIZ(n2), (float)n);
    }
    
    public final int LIZIZ(final Object o) {
        final 05V ljiiiizz = ((05D)o).LJIIIIZZ;
        if (ljiiiizz != null) {
            return (int)(ljiiiizz.LJFF + 0.5f);
        }
        return 0;
    }
    
    public final 13r LIZIZ() {
        13r 13r = this.LJI.LIZ.LIZ();
        if (13r == null) {
            13r = new 13r(this.LJI);
        }
        else {
            13r.LIZ = null;
            13r.LIZJ.LIZ();
            13r.LIZIZ = 0.0f;
            13r.LIZLLL = false;
        }
        ++05V.LIZ;
        return 13r;
    }
    
    public final void LIZIZ(final 05V 05V, final 05V 05V2, final int n, final int n2) {
        final 13r liziz = this.LIZIZ();
        final 05V lizj = this.LIZJ();
        lizj.LJ = 0;
        liziz.LIZIZ(05V, 05V2, lizj, n);
        if (n2 != 6) {
            this.LIZ(liziz, (int)(liziz.LIZJ.LIZIZ(lizj) * -1.0f), n2);
        }
        this.LIZ(liziz);
    }
    
    public final 05V LIZJ() {
        final 05R ljii = 05Q.LJII;
        if (ljii != null) {
            ++ljii.LJIILIIL;
        }
        if (this.LJ + 1 >= this.LJIIJJI) {
            this.LJ();
        }
        final 05V liz = this.LIZ(05V.a.SLACK);
        final int n = this.LIZ + 1;
        this.LIZ = n;
        ++this.LJ;
        liz.LIZJ = n;
        return this.LJI.LIZJ[this.LIZ] = liz;
    }
    
    public final 13r LIZJ(final 05V 05V, final 05V 05V2, final int n, final int n2) {
        final 13r liziz = this.LIZIZ();
        int n3 = 0;
        final int n4 = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            liziz.LIZIZ = (float)n5;
        }
        if (n3 == 0) {
            liziz.LIZJ.LIZ(05V, -1.0f);
            liziz.LIZJ.LIZ(05V2, 1.0f);
        }
        else {
            liziz.LIZJ.LIZ(05V, 1.0f);
            liziz.LIZJ.LIZ(05V2, -1.0f);
        }
        if (n2 != 6) {
            liziz.LIZ(this, n2);
        }
        this.LIZ(liziz);
        return liziz;
    }
    
    public final void LIZLLL() {
        for (int i = 0; i < this.LJFF; ++i) {
            final 13r 13r = this.LIZJ[i];
            13r.LIZ.LJFF = 13r.LIZIZ;
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(624);
        }
        
        05V LIZ(final boolean[] p0);
        
        void LIZ();
        
        void LIZ(final a p0);
        
        05V LIZIZ();
        
        void LIZJ(final 05V p0);
    }
}
