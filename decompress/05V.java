// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.covode.number.Covode;

public class 05V
{
    public static int LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public float LJFF;
    public float[] LJI;
    public a LJII;
    public 13r[] LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    
    static {
        Covode.recordClassIndex(629);
        05V.LIZ = 1;
    }
    
    public 05V(final a ljii) {
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJI = new float[7];
        this.LJIIIIZZ = new 13r[8];
        this.LJII = ljii;
    }
    
    public final void LIZ() {
        this.LIZIZ = null;
        this.LJII = a.UNKNOWN;
        this.LJ = 0;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJFF = 0.0f;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
    }
    
    public final void LIZ(final 13r 13r) {
        int n = 0;
        while (true) {
            final int ljiiiz = this.LJIIIZ;
            if (n >= ljiiiz) {
                final 13r[] ljiiiizz = this.LJIIIIZZ;
                if (ljiiiz >= ljiiiizz.length) {
                    this.LJIIIIZZ = Arrays.copyOf(ljiiiizz, ljiiiizz.length * 2);
                }
                final 13r[] ljiiiizz2 = this.LJIIIIZZ;
                final int ljiiiz2 = this.LJIIIZ;
                ljiiiizz2[ljiiiz2] = 13r;
                this.LJIIIZ = ljiiiz2 + 1;
                return;
            }
            if (this.LJIIIIZZ[n] == 13r) {
                return;
            }
            ++n;
        }
    }
    
    public final void LIZIZ(final 13r 13r) {
        final int ljiiiz = this.LJIIIZ;
        int i = 0;
        for (int j = 0; j < ljiiiz; ++j) {
            if (this.LJIIIIZZ[j] == 13r) {
                while (i < ljiiiz - j - 1) {
                    final 13r[] ljiiiizz = this.LJIIIIZZ;
                    final int n = j + i;
                    ljiiiizz[n] = ljiiiizz[n + 1];
                    ++i;
                }
                --this.LJIIIZ;
                return;
            }
        }
    }
    
    public final void LIZJ(final 13r 13r) {
        for (int ljiiiz = this.LJIIIZ, i = 0; i < ljiiiz; ++i) {
            this.LJIIIIZZ[i].LIZJ.LIZ(this.LJIIIIZZ[i], 13r);
        }
        this.LJIIIZ = 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.LIZIZ);
        return sb.toString();
    }
    
    public enum a
    {
        CONSTANT, 
        ERROR, 
        SLACK, 
        UNKNOWN, 
        UNRESTRICTED;
        
        static {
            Covode.recordClassIndex(630);
        }
    }
}
