// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 1d6 extends 9Mp
{
    public boolean LIZ;
    public boolean LIZIZ;
    public Boolean LIZJ;
    public Boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(10314);
    }
    
    public 1d6() {
        this.LIZJ = null;
        this.LIZLLL = null;
    }
    
    private boolean LIZIZ() {
        return this.LIZJ != null && this.LIZLLL != null;
    }
    
    public final int LIZ() {
        if (this.LIZIZ()) {
            final Boolean lizj = this.LIZJ;
            if (lizj == null) {
                n.LIZIZ();
            }
            if (lizj) {
                final Boolean lizlll = this.LIZLLL;
                if (lizlll == null) {
                    n.LIZIZ();
                }
                if (lizlll) {
                    return 3;
                }
            }
            final Boolean lizj2 = this.LIZJ;
            if (lizj2 == null) {
                n.LIZIZ();
            }
            if (lizj2) {
                final Boolean lizlll2 = this.LIZLLL;
                if (lizlll2 == null) {
                    n.LIZIZ();
                }
                if (!lizlll2) {
                    return 1;
                }
            }
            final Boolean lizlll3 = this.LIZLLL;
            if (lizlll3 == null) {
                n.LIZIZ();
            }
            if (lizlll3) {
                final Boolean lizj3 = this.LIZJ;
                if (lizj3 == null) {
                    n.LIZIZ();
                }
                if (!lizj3) {
                    return 2;
                }
            }
            return 0;
        }
        return -1;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZJ, this.LIZLLL };
    }
}
