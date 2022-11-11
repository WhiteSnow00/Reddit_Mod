// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.os.Handler;

public final class 0Bn
{
    public final 15u LIZ;
    public final Handler LIZIZ;
    public a LIZJ;
    
    static {
        Covode.recordClassIndex(1235);
    }
    
    public 0Bn(final 0CH 0ch) {
        this.LIZ = new 15u(0ch);
        this.LIZIZ = new Handler();
    }
    
    public final void LIZ(final 0CC.a a) {
        final a lizj = this.LIZJ;
        if (lizj != null) {
            lizj.run();
        }
        final a lizj2 = new a(this.LIZ, a);
        this.LIZJ = lizj2;
        this.LIZIZ.postAtFrontOfQueue((Runnable)lizj2);
    }
    
    public static final class a implements Runnable
    {
        public final 0CC.a LIZ;
        public final 15u LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(1236);
        }
        
        public a(final 15u liziz, final 0CC.a liz) {
            this.LIZIZ = liziz;
            this.LIZ = liz;
        }
        
        @Override
        public final void run() {
            if (!this.LIZJ) {
                this.LIZIZ.LIZ(this.LIZ);
                this.LIZJ = true;
            }
        }
    }
}
