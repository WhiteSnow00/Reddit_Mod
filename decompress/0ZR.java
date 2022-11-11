// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public abstract class 0zr<T extends 106>
{
    public T LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(10635);
    }
    
    public abstract int LIZIZ();
    
    public abstract T LIZLLL();
    
    public final T LJII() {
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = this.LIZLLL();
        }
        final 106 ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            n.LIZ("");
        }
        return (T)ljiiiizz;
    }
}
