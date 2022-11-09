// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class 01j
{
    public boolean LIZ;
    public CopyOnWriteArrayList<01f> LIZIZ;
    
    static {
        Covode.recordClassIndex(218);
    }
    
    public 01j(final boolean liz) {
        this.LIZIZ = new CopyOnWriteArrayList<01f>();
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        final Iterator<01f> iterator = this.LIZIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
    }
    
    public final void LIZ(final 01f 01f) {
        this.LIZIZ.add(01f);
    }
    
    public abstract void LIZIZ();
    
    public final void LIZIZ(final 01f 01f) {
        this.LIZIZ.remove(01f);
    }
}
