// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;

public abstract class 1Dv implements 0Sm
{
    public 1hm LIZ;
    
    static {
        Covode.recordClassIndex(4544);
    }
    
    public 1Dv(final 1hm liz) {
        this.LIZ = liz;
    }
    
    public 0Sp LIZ(final 0Sp 0Sp) {
        return 0Sp;
    }
    
    @Override
    public 0Sq LIZ(final 0Sm.a a) {
        final 0Sq liz = a.LIZ(this.LIZ(a.LIZ()));
        this.LIZ(liz);
        return liz;
    }
    
    public 0Sq LIZ(final 0Sq 0Sq) {
        return 0Sq;
    }
    
    public static final class a implements 0Sm.a
    {
        public 0Sp LIZ;
        public int LIZIZ;
        public List<0Sm> LIZJ;
        
        static {
            Covode.recordClassIndex(4545);
        }
        
        public a(final List<0Sm> lizj) {
            this.LIZJ = lizj;
            this.LIZIZ = 0;
        }
        
        @Override
        public final 0Sp LIZ() {
            return this.LIZ;
        }
        
        @Override
        public final 0Sq LIZ(final 0Sp liz) {
            if (liz == null) {
                return 0Sq.LIZ(0Ru.LIZ("null request"), null);
            }
            final List<0Sm> lizj = this.LIZJ;
            if (lizj == null || lizj.isEmpty()) {
                return 0Sq.LIZ(0Ru.LIZ("no interceptor in the chain"), null);
            }
            if (this.LIZIZ >= this.LIZJ.size()) {
                return 0Sq.LIZ(0Ru.LIZ("interceptors index out of bound"), liz);
            }
            final 0Sm 0Sm = this.LIZJ.get(this.LIZIZ);
            if (0Sm == null) {
                return 0Sq.LIZ(0Ru.LIZ("null interceptor"), liz);
            }
            this.LIZ = liz;
            ++this.LIZIZ;
            return 0Sm.LIZ((0Sm.a)this);
        }
    }
}
