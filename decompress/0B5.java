// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collections;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0B5<T>
{
    public static final 0B5 LIZ;
    public static final 0B5 LIZIZ;
    public final List<T> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    
    static {
        Covode.recordClassIndex(1154);
        LIZ = new 0B5(Collections.emptyList());
        LIZIZ = new 0B5(Collections.emptyList());
    }
    
    public 0B5(final List<T> lizj) {
        this.LIZJ = lizj;
        this.LJFF = 0;
    }
    
    public 0B5(final List<T> lizj, final int lj, final int n) {
        this.LIZJ = lizj;
        this.LIZLLL = 0;
        this.LJ = lj;
        this.LJFF = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Result ");
        sb.append(this.LIZLLL);
        sb.append(", ");
        sb.append(this.LIZJ);
        sb.append(", ");
        sb.append(this.LJ);
        sb.append(", offset ");
        sb.append(this.LJFF);
        return sb.toString();
    }
    
    public abstract static class a<T>
    {
        static {
            Covode.recordClassIndex(1155);
        }
        
        public abstract void LIZ(final int p0, final 0B5<T> p1);
    }
}
