// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public class 12C extends 01Y
{
    public static final Executor LIZIZ;
    public static final Executor LIZJ;
    public static volatile 12C LIZLLL;
    public 01Y LIZ;
    public 01Y LJ;
    
    static {
        Covode.recordClassIndex(186);
        LIZIZ = new 01V();
        LIZJ = new 01W();
    }
    
    public 12C() {
        final 12D 12D = new 12D();
        this.LJ = 12D;
        this.LIZ = 12D;
    }
    
    public static 12C LIZ() {
        if (12C.LIZLLL != null) {
            return 12C.LIZLLL;
        }
        synchronized (12C.class) {
            if (12C.LIZLLL == null) {
                12C.LIZLLL = new 12C();
            }
            return 12C.LIZLLL;
        }
    }
    
    @Override
    public final void LIZ(final Runnable runnable) {
        this.LIZ.LIZ(runnable);
    }
    
    @Override
    public final void LIZIZ(final Runnable runnable) {
        this.LIZ.LIZIZ(runnable);
    }
    
    @Override
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }
}
