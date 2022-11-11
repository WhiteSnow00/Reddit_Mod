// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

public class 0La
{
    public boolean LIZ;
    public boolean LIZIZ;
    public final Set<a> LIZJ;
    public final Map<String, 0L2> LIZLLL;
    
    static {
        Covode.recordClassIndex(2465);
    }
    
    public 0La() {
        this.LIZJ = new 04t<a>();
        this.LIZLLL = new HashMap<String, 0L2>();
    }
    
    public final void LIZ(final a a) {
        this.LIZJ.add(a);
    }
    
    public final void LIZ(final String s, final float n) {
        final boolean liziz = this.LIZIZ;
        if (!liziz && !this.LIZ) {
            return;
        }
        if (!this.LIZ || liziz) {
            0L2 0l2;
            if ((0l2 = this.LIZLLL.get(s)) == null) {
                0l2 = new 0L2();
                this.LIZLLL.put(s, 0l2);
            }
            0l2.LIZ += n;
            ++0l2.LIZIZ;
            if (0l2.LIZIZ == Integer.MAX_VALUE) {
                0l2.LIZ /= 2.0f;
                0l2.LIZIZ /= 2;
            }
        }
        if (s.equals("__container")) {
            final Iterator<a> iterator = this.LIZJ.iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ();
            }
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(2466);
        }
        
        void LIZ();
    }
}
