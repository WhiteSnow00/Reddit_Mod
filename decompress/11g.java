// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 11g implements 008
{
    public static 00D LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    
    static {
        Covode.recordClassIndex(24);
        11g.LIZ = null;
        11g.LIZIZ = 10;
        11g.LIZJ = -1;
        11g.LIZLLL = 8;
        11g.LJ = 1500000;
        11g.LJFF = 2000000;
    }
    
    private void LIZJ() {
        final int lizj = 11g.LIZJ;
        if (lizj != -1) {
            11g.LIZ.LIZIZ(lizj);
            00s.LIZ(3);
        }
    }
    
    @Override
    public final void LIZ() {
        this.LIZJ();
        final 00D liz = 11g.LIZ;
        if (liz != null && -1 != (11g.LIZJ = liz.LIZ())) {
            00s.LIZ(3);
            11g.LIZ.LIZ(11g.LIZJ, 10, 3, -1);
            11g.LIZ.LIZ(11g.LIZJ, 1, 11g.LIZLLL, -1);
            11g.LIZ.LIZ(11g.LIZJ, 4, 11g.LJFF, -1);
            11g.LIZ.LIZ(11g.LIZJ, 6, 11g.LJFF, 11g.LJ);
            11g.LIZ.LIZ(11g.LIZJ, 23, 1000, -1);
            11g.LIZ.LIZ(11g.LIZJ, 30000);
        }
    }
    
    @Override
    public final void LIZ(final long n) {
        this.LIZJ();
        final 00D liz = 11g.LIZ;
        if (liz != null && -1 != (11g.LIZJ = liz.LIZ())) {
            00s.LIZ(3);
            11g.LIZ.LIZ(11g.LIZJ, 10, 3, -1);
            11g.LIZ.LIZ(11g.LIZJ, 1, 11g.LIZLLL, -1);
            11g.LIZ.LIZ(11g.LIZJ, 4, 11g.LJFF, -1);
            11g.LIZ.LIZ(11g.LIZJ, 6, 11g.LJFF, 11g.LJ);
            11g.LIZ.LIZ(11g.LIZJ, 23, 1000, -1);
            11g.LIZ.LIZ(11g.LIZJ, (int)n);
        }
    }
    
    @Override
    public final boolean LIZ(final Context context) {
        if (11g.LIZ == null) {
            11g.LIZ = new 00D(context);
            if (00D.LIZ) {
                11g.LIZ.LIZ(0);
                11g.LIZIZ = 11g.LIZ.LIZ(3);
                if ((11g.LIZJ = 11g.LIZ.LIZ()) == -1) {
                    00s.LIZ(5);
                    return false;
                }
                11g.LIZLLL = 00C.LIZIZ();
                11g.LJ = 00C.LIZ(0);
                11g.LJFF = 00C.LIZ(6);
                00s.LIZ(4);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void LIZIZ() {
        this.LIZJ();
        00s.LIZ(3);
    }
    
    @Override
    public final void LIZIZ(final long n) {
        this.LIZJ();
        final 00D liz = 11g.LIZ;
        if (liz != null && -1 != (11g.LIZJ = liz.LIZ())) {
            00s.LIZ(3);
            11g.LIZ.LIZ(11g.LIZJ, 10, 3, -1);
            11g.LIZ.LIZ(11g.LIZJ, (int)n);
        }
    }
    
    @Override
    public final void LIZJ(final long n) {
        this.LIZJ();
        final 00D liz = 11g.LIZ;
        if (liz != null && -1 != (11g.LIZJ = liz.LIZ())) {
            00s.LIZ(3);
            11g.LIZ.LIZ(11g.LIZJ, 10, 3, -1);
            11g.LIZ.LIZ(11g.LIZJ, 8, 11g.LIZIZ, -1);
            11g.LIZ.LIZ(11g.LIZJ, (int)n);
        }
    }
}
