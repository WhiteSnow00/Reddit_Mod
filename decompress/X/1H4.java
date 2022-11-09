// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 1h4 extends 1BN<Integer>
{
    static {
        Covode.recordClassIndex(2257);
    }
    
    public 1h4(final List<0LG<Integer>> list) {
        super(list);
    }
    
    public final int LJI() {
        final 0LG<T> liziz = ((0JP<T, A>)this).LIZIZ();
        final float lizlll = this.LIZLLL();
        if (liziz.LIZIZ != null && liziz.LIZJ != null) {
            if (super.LIZLLL != null) {
                final 0LI<A> lizlll2 = super.LIZLLL;
                liziz.LJFF.floatValue();
                final Integer n = (Integer)lizlll2.LIZ((A)liziz.LIZIZ, this.LIZJ());
                if (n != null) {
                    return n;
                }
            }
            if (liziz.LJIIIIZZ == 784923401) {
                liziz.LJIIIIZZ = (int)liziz.LIZIZ;
            }
            final int ljiiiizz = liziz.LJIIIIZZ;
            if (liziz.LJIIIZ == 784923401) {
                liziz.LJIIIZ = (int)liziz.LIZJ;
            }
            return 0L4.LIZ(ljiiiizz, liziz.LJIIIZ, lizlll);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
