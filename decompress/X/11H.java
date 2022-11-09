// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import java.io.File;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 11h implements 008
{
    public static 00E LIZ;
    public static int[] LIZIZ;
    public static int[] LIZJ;
    public static int[] LIZLLL;
    public static int[] LJ;
    public static int[] LJFF;
    public static int[] LJI;
    public static int[] LJII;
    
    static {
        Covode.recordClassIndex(27);
        11h.LIZ = null;
        11h.LIZIZ = new int[] { 1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 2000, 1115734016, 1000 };
        11h.LIZJ = new int[] { 1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 2000, 1115734016, 1000 };
        11h.LIZLLL = new int[] { 1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 1, 1115734016, 1000 };
        11h.LJ = new int[] { 1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1 };
        11h.LJFF = new int[] { 1077936128, 1, 1086324736, 1, 1090519040, 4, 1090519296, 4, 1082130432, 4095, 1082130688, 4095, 1098907648, 255 };
        11h.LJI = new int[] { 1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1 };
        11h.LJII = new int[] { 1077936128, 1, 1115799552, 2000, 1115734016, 1000 };
    }
    
    @Override
    public final void LIZ() {
        if (11h.LIZ != null) {
            00s.LIZ(3);
            11h.LIZ.LIZ(30000, 11h.LJI);
        }
    }
    
    @Override
    public final void LIZ(final long n) {
        if (11h.LIZ != null) {
            00s.LIZ(3);
            11h.LIZ.LIZ((int)n, 11h.LJI);
        }
    }
    
    @Override
    public final boolean LIZ(final Context context) {
        if (11h.LIZ == null) {
            11h.LIZ = new 00E(context);
        }
        if (00E.LIZ) {
            final File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles();
            int n2;
            final int n = n2 = 2;
            if (listFiles != null) {
                n2 = n;
                if (listFiles.length > 0) {
                    final int length = listFiles.length;
                    int i = 0;
                    n2 = 0;
                    while (i < length) {
                        int n3 = n2;
                        if (listFiles[i].getName().startsWith("policy")) {
                            n3 = n2 + 1;
                        }
                        ++i;
                        n2 = n3;
                    }
                    if (n2 == 0) {
                        n2 = n;
                    }
                }
            }
            00s.LIZ(3);
            if (Build$VERSION.SDK_INT >= 28) {
                00s.LIZ(3);
                if (n2 == 3) {
                    11h.LJI = 11h.LIZIZ;
                }
                else {
                    11h.LJI = 11h.LIZJ;
                }
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                11h.LJI = 11h.LIZLLL;
            }
            else if (Build$VERSION.SDK_INT >= 24) {
                11h.LJI = 11h.LJ;
            }
            else {
                if (Build$VERSION.SDK_INT < 23) {
                    return false;
                }
                11h.LJI = 11h.LJFF;
            }
            00s.LIZ(4);
            return true;
        }
        return false;
    }
    
    @Override
    public final void LIZIZ() {
        if (11h.LIZ != null) {
            00s.LIZ(3);
            11h.LIZ.LIZ();
        }
    }
    
    @Override
    public final void LIZIZ(final long n) {
        if (11h.LIZ != null) {
            00s.LIZ(3);
            11h.LIZ.LIZ((int)n, 11h.LJI);
        }
    }
    
    @Override
    public final void LIZJ(final long n) {
        if (11h.LIZ != null) {
            00s.LIZ(3);
            11h.LIZ.LIZ((int)n, 11h.LJII);
        }
    }
}
