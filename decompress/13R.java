// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 13r implements a
{
    public 05V LIZ;
    public float LIZIZ;
    public final 05N LIZJ;
    public boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(620);
    }
    
    public 13r(final 05O 05O) {
        this.LIZJ = new 05N(this, 05O);
    }
    
    @Override
    public final 05V LIZ(final boolean[] array) {
        return this.LIZJ.LIZ(array, null);
    }
    
    public final 13r LIZ(final 05Q 05Q, final int n) {
        this.LIZJ.LIZ(05Q.LIZ(n), 1.0f);
        this.LIZJ.LIZ(05Q.LIZ(n), -1.0f);
        return this;
    }
    
    public final 13r LIZ(final 05V 05V, final 05V 05V2, final 05V 05V3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.LIZIZ = (float)n4;
        }
        if (n2 == 0) {
            this.LIZJ.LIZ(05V, -1.0f);
            this.LIZJ.LIZ(05V2, 1.0f);
            this.LIZJ.LIZ(05V3, 1.0f);
        }
        else {
            this.LIZJ.LIZ(05V, 1.0f);
            this.LIZJ.LIZ(05V2, -1.0f);
            this.LIZJ.LIZ(05V3, -1.0f);
        }
        return this;
    }
    
    public final 13r LIZ(final 05V 05V, final 05V 05V2, final 05V 05V3, final 05V 05V4, final float n) {
        this.LIZJ.LIZ(05V, -1.0f);
        this.LIZJ.LIZ(05V2, 1.0f);
        this.LIZJ.LIZ(05V3, n);
        this.LIZJ.LIZ(05V4, -n);
        return this;
    }
    
    @Override
    public final void LIZ() {
        this.LIZJ.LIZ();
        this.LIZ = null;
        this.LIZIZ = 0.0f;
    }
    
    @Override
    public final void LIZ(final a a) {
        if (a instanceof 13r) {
            final 13r 13r = (13r)a;
            this.LIZ = null;
            this.LIZJ.LIZ();
            for (int i = 0; i < 13r.LIZJ.LIZ; ++i) {
                this.LIZJ.LIZ(13r.LIZJ.LIZ(i), 13r.LIZJ.LIZIZ(i), true);
            }
        }
    }
    
    public final boolean LIZ(final 05V 05V) {
        final 05N lizj = this.LIZJ;
        if (lizj.LJI != -1) {
            for (int lji = lizj.LJI, n = 0; lji != -1 && n < lizj.LIZ; lji = lizj.LJ[lji], ++n) {
                if (lizj.LIZLLL[lji] == 05V.LIZJ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final 05V LIZIZ() {
        return this.LIZ;
    }
    
    public final 13r LIZIZ(final 05V 05V, final 05V 05V2, final 05V 05V3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.LIZIZ = (float)n4;
        }
        if (n2 == 0) {
            this.LIZJ.LIZ(05V, -1.0f);
            this.LIZJ.LIZ(05V2, 1.0f);
            this.LIZJ.LIZ(05V3, -1.0f);
        }
        else {
            this.LIZJ.LIZ(05V, 1.0f);
            this.LIZJ.LIZ(05V2, -1.0f);
            this.LIZJ.LIZ(05V3, 1.0f);
        }
        return this;
    }
    
    public final 13r LIZIZ(final 05V 05V, final 05V 05V2, final 05V 05V3, final 05V 05V4, final float n) {
        this.LIZJ.LIZ(05V3, 0.5f);
        this.LIZJ.LIZ(05V4, 0.5f);
        this.LIZJ.LIZ(05V, -0.5f);
        this.LIZJ.LIZ(05V2, -0.5f);
        this.LIZIZ = -n;
        return this;
    }
    
    public final void LIZIZ(final 05V liz) {
        final 05V liz2 = this.LIZ;
        if (liz2 != null) {
            this.LIZJ.LIZ(liz2, -1.0f);
            this.LIZ = null;
        }
        final float n = this.LIZJ.LIZ(liz, true) * -1.0f;
        this.LIZ = liz;
        if (n == 1.0f) {
            return;
        }
        this.LIZIZ /= n;
        final 05N lizj = this.LIZJ;
        for (int lji = lizj.LJI, n2 = 0; lji != -1 && n2 < lizj.LIZ; lji = lizj.LJ[lji], ++n2) {
            final float[] ljff = lizj.LJFF;
            ljff[lji] /= n;
        }
    }
    
    @Override
    public void LIZJ(final 05V 05V) {
        final int lj = 05V.LJ;
        float n = 1.0f;
        if (lj != 1) {
            if (05V.LJ == 2) {
                n = 1000.0f;
            }
            else if (05V.LJ == 3) {
                n = 1000000.0f;
            }
            else if (05V.LJ == 4) {
                n = 1.0E9f;
            }
            else if (05V.LJ == 5) {
                n = 1.0E12f;
            }
        }
        this.LIZJ.LIZ(05V, n);
    }
    
    @Override
    public String toString() {
        String s;
        if (this.LIZ == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append("0");
            s = sb.toString();
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.LIZ);
            s = sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append(" = ");
        String s2 = sb3.toString();
        final float liziz = this.LIZIZ;
        int i = 0;
        int n;
        if (liziz != 0.0f) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s2);
            sb4.append(this.LIZIZ);
            s2 = sb4.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.LIZJ.LIZ) {
            final 05V liz = this.LIZJ.LIZ(i);
            String s3 = s2;
            int n2 = n;
            if (liz != null) {
                final float liziz2 = this.LIZJ.LIZIZ(i);
                final float n3 = fcmpl(liziz2, 0.0f);
                s3 = s2;
                n2 = n;
                if (n3 != 0) {
                    final String string = liz.toString();
                    float n4 = 0.0f;
                    String s4 = null;
                    Label_0227: {
                        if (n == 0) {
                            n4 = liziz2;
                            s4 = s2;
                            if (liziz2 >= 0.0f) {
                                break Label_0227;
                            }
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append(s2);
                            sb5.append("- ");
                            s4 = sb5.toString();
                        }
                        else {
                            if (n3 > 0) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append(s2);
                                sb6.append(" + ");
                                s4 = sb6.toString();
                                n4 = liziz2;
                                break Label_0227;
                            }
                            final StringBuilder sb7 = new StringBuilder();
                            sb7.append(s2);
                            sb7.append(" - ");
                            s4 = sb7.toString();
                        }
                        n4 = liziz2 * -1.0f;
                    }
                    String s5;
                    if (n4 == 1.0f) {
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append(s4);
                        sb8.append(string);
                        s5 = sb8.toString();
                    }
                    else {
                        final StringBuilder sb9 = new StringBuilder();
                        sb9.append(s4);
                        sb9.append(n4);
                        sb9.append(" ");
                        sb9.append(string);
                        s5 = sb9.toString();
                    }
                    n2 = 1;
                    s3 = s5;
                }
            }
            ++i;
            s2 = s3;
            n = n2;
        }
        String string2 = s2;
        if (n == 0) {
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(s2);
            sb10.append("0.0");
            string2 = sb10.toString();
        }
        return string2;
    }
}
