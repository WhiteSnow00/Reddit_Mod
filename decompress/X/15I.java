// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.lifecycle.af;
import android.os.Handler;

public final class 15i implements 0CH
{
    public static final 15i LJIIIIZZ;
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public Handler LJ;
    public final 15u LJFF;
    public Runnable LJI;
    public af.a LJII;
    
    static {
        Covode.recordClassIndex(1224);
        LJIIIIZZ = new 15i();
    }
    
    public 15i() {
        this.LIZJ = true;
        this.LIZLLL = true;
        this.LJFF = new 15u(this);
        this.LJI = new 0Bi(this);
        this.LJII = new 15g(this);
    }
    
    public static 0CH LIZ() {
        return 15i.LJIIIIZZ;
    }
    
    public final void LIZIZ() {
        if (this.LIZ == 0 && this.LIZJ) {
            this.LJFF.LIZ(0CC.a.ON_STOP);
            this.LIZLLL = true;
        }
    }
    
    @Override
    public final 0CC getLifecycle() {
        return this.LJFF;
    }
}
