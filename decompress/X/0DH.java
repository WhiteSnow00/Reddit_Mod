// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class 0DH
{
    public int LIZ;
    public ByteBuffer LIZIZ;
    
    static {
        Covode.recordClassIndex(1398);
        new 0DF();
        new 0DG();
        new ThreadLocal();
    }
    
    public final int LIZIZ(final int n) {
        final int liz = this.LIZ;
        final int n2 = liz - this.LIZIZ.getInt(liz);
        if (n < this.LIZIZ.getShort(n2)) {
            return this.LIZIZ.getShort(n2 + n);
        }
        return 0;
    }
    
    public final int LIZJ(int int1) {
        final int n = int1 + this.LIZ;
        int1 = this.LIZIZ.getInt(n);
        return this.LIZIZ.getInt(n + int1);
    }
    
    public final int LIZLLL(int n) {
        n += this.LIZ;
        return n + this.LIZIZ.getInt(n) + 4;
    }
}
