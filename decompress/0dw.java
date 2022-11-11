// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.content.Context;

public final class 0dw
{
    public boolean LIZ;
    public boolean LIZIZ;
    public Context LIZJ;
    public volatile 0er LIZLLL;
    public volatile 0eq LJ;
    public volatile int LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(5902);
    }
    
    public 0dw() {
        this.LJFF = -1;
    }
    
    public final void LIZ(final int n, final 0em 0em) {
        0ep.a.LIZ.LIZ.LIZ(n, 0em);
    }
    
    public final boolean LIZ() {
        if (!this.LIZ) {
            return false;
        }
        Label_0025: {
            if (this.LJIIIIZZ) {
                break Label_0025;
            }
            try {
                09K.LIZ();
                this.LJIIIIZZ = true;
                return this.LJIIIIZZ;
            }
            catch (final IllegalStateException ex) {
                return this.LJIIIIZZ;
            }
        }
    }
    
    public static final class a
    {
        public static final 0dw LIZ;
        
        static {
            Covode.recordClassIndex(5903);
            LIZ = new 0dw((byte)0);
        }
    }
}
