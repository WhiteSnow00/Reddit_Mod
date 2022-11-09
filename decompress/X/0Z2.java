// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.IOException;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0z2
{
    @c(LIZ = "header")
    public 0z1 LIZ;
    @c(LIZ = "body")
    public byte[] LIZIZ;
    
    static {
        Covode.recordClassIndex(10478);
    }
    
    public 0z2() {
        this.LIZIZ = new byte[0];
    }
    
    public static 0z2 LIZ(final 0Ta 0Ta) {
        final 0z2 0z2 = new 0z2();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    0Tb.LIZJ(0Ta);
                }
                else {
                    0z2.LIZIZ = 0Ta.LIZJ();
                }
            }
            else {
                0z2.LIZ = 0z1.LIZ(0Ta);
            }
        }
        0Ta.LIZ(liz);
        if (0z2.LIZ != null) {
            return 0z2;
        }
        throw new IOException("Invalid protobuf data: response.header is null!");
    }
}
