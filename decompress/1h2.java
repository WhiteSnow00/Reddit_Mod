// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 1h2 extends 1BN<Float>
{
    static {
        Covode.recordClassIndex(2255);
    }
    
    public 1h2(final List<0LG<Float>> list) {
        super(list);
    }
    
    public final float LJI() {
        final 0LG<T> liziz = ((0JP<T, A>)this).LIZIZ();
        final float lizlll = this.LIZLLL();
        if (liziz.LIZIZ != null && liziz.LIZJ != null) {
            if (super.LIZLLL != null) {
                final 0LI<A> lizlll2 = super.LIZLLL;
                liziz.LJFF.floatValue();
                final Float n = (Float)lizlll2.LIZ((A)liziz.LIZIZ, this.LIZJ());
                if (n != null) {
                    return n;
                }
            }
            if (liziz.LJI == -3987645.8f) {
                liziz.LJI = (float)liziz.LIZIZ;
            }
            final float lji = liziz.LJI;
            if (liziz.LJII == -3987645.8f) {
                liziz.LJII = (float)liziz.LIZJ;
            }
            return lji + lizlll * (liziz.LJII - lji);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
