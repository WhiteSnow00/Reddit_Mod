// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.IOException;
import com.bytedance.covode.number.Covode;

public final class 0z1
{
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public String LJFF;
    
    static {
        Covode.recordClassIndex(10477);
    }
    
    public static 0z1 LIZ(final 0Ta 0Ta) {
        final 0z1 0z1 = new 0z1();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            switch (liziz) {
                default: {
                    0Tb.LIZJ(0Ta);
                    continue;
                }
                case 1: {
                    0z1.LIZ = (int)0Ta.LJFF();
                    continue;
                }
                case 2: {
                    0z1.LIZIZ = 0Ta.LIZLLL();
                    continue;
                }
                case 3: {
                    0z1.LIZJ = 0Ta.LIZLLL();
                    continue;
                }
                case 4: {
                    0z1.LIZLLL = 0Ta.LIZLLL();
                    continue;
                }
                case 5: {
                    0z1.LJ = 0Ta.LJFF();
                    continue;
                }
                case 6: {
                    0z1.LJFF = 0Ta.LIZLLL();
                    continue;
                }
            }
        }
        0Ta.LIZ(liz);
        if (0z1.LIZ == -1) {
            throw new IOException("Invalid protobuf data: missing header.statusCode!");
        }
        if (0z1.LJ != -1L) {
            return 0z1;
        }
        throw new IOException("Invalid protobuf data: missing header.now!");
    }
}
