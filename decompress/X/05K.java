// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

public class 05K
{
    public HashSet<05K> LJII;
    public int LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(616);
    }
    
    public 05K() {
        this.LJII = new HashSet<05K>(2);
        this.LJIIIIZZ = 0;
    }
    
    public void LIZ() {
    }
    
    public final void LIZ(final 05K 05K) {
        this.LJII.add(05K);
    }
    
    public void LIZIZ() {
        this.LJIIIIZZ = 0;
        this.LJII.clear();
    }
    
    public final void LIZJ() {
        this.LJIIIIZZ = 0;
        final Iterator<05K> iterator = this.LJII.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZJ();
        }
    }
    
    public final void LIZLLL() {
        this.LJIIIIZZ = 1;
        final Iterator<05K> iterator = this.LJII.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
    }
    
    public final boolean LJ() {
        return this.LJIIIIZZ == 1;
    }
}
