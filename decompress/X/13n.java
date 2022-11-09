// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.covode.number.Covode;

public class 13n extends 05G
{
    public 05G[] LIZJ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(612);
    }
    
    public 13n() {
        this.LIZJ = new 05G[4];
    }
    
    public final void LIZ() {
        this.LIZLLL = 0;
    }
    
    public final void LIZ(final 05G 05G) {
        final int lizlll = this.LIZLLL;
        final 05G[] lizj = this.LIZJ;
        if (lizlll + 1 > lizj.length) {
            this.LIZJ = Arrays.copyOf(lizj, lizj.length * 2);
        }
        final 05G[] lizj2 = this.LIZJ;
        final int lizlll2 = this.LIZLLL;
        lizj2[lizlll2] = 05G;
        this.LIZLLL = lizlll2 + 1;
    }
}
