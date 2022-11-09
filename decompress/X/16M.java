// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.nio.ByteBuffer;
import com.bytedance.covode.number.Covode;

public final class 16M extends 0DH
{
    static {
        Covode.recordClassIndex(1397);
    }
    
    public final int LIZ() {
        final int liziz = this.LIZIZ(4);
        if (liziz != 0) {
            return super.LIZIZ.getInt(liziz + super.LIZ);
        }
        return 0;
    }
    
    public final 16L LIZ(final 16L 16L, int n) {
        final int liziz = this.LIZIZ(6);
        if (liziz != 0) {
            n = this.LIZLLL(liziz) + n * 4;
            16L.LIZ(n + super.LIZIZ.getInt(n), super.LIZIZ);
            return 16L;
        }
        return null;
    }
    
    public final void LIZ(final int liz, final ByteBuffer liziz) {
        super.LIZ = liz;
        super.LIZIZ = liziz;
    }
    
    public final int LIZIZ() {
        final int liziz = this.LIZIZ(6);
        if (liziz != 0) {
            return this.LIZJ(liziz);
        }
        return 0;
    }
}
