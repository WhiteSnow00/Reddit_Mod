// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.HandlerThread;

public final class 0V6
{
    public static int LJFF;
    public static int LJI;
    public volatile boolean LIZ;
    public final Object LIZIZ;
    public HandlerThread LIZJ;
    public Handler LIZLLL;
    public 0V3 LJ;
    public final Handler$Callback LJII;
    public 0Uq LJIIIIZZ;
    public OcrActivity LJIIIZ;
    public final 0Uz LJIIJ;
    
    static {
        Covode.recordClassIndex(4766);
        0V6.LJFF = 10001;
        0V6.LJI = 10002;
    }
    
    public 0V6(final 0Uq ljiiiizz, final OcrActivity ljiiiz) {
        this.LIZIZ = new Object();
        new ThreadLocal();
        this.LJII = (Handler$Callback)new 0V4(this);
        this.LJIIJ = new 1El(this);
        0Ua.LIZ();
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = ljiiiz;
    }
    
    public final void LIZ() {
        MethodCollector.i(2890);
        0Ua.LIZ();
        final Object liziz = this.LIZIZ;
        monitorenter(liziz);
        try {
            this.LIZ = false;
        }
        finally {
            monitorexit(liziz);
            MethodCollector.o(2890);
        }
    }
    
    public final void LIZ(final int n, final int n2, final String s, final 1EA 1ea) {
        this.LIZLLL.removeMessages(0V6.LJI);
        final OcrActivity ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            ljiiiz.LIZ(n, n2, s, 1ea);
            this.LJIIIZ = null;
        }
    }
    
    public final void LIZIZ() {
        final 0Uq ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null && ljiiiizz.LJFF) {
            final 0Uq ljiiiizz2 = this.LJIIIIZZ;
            ljiiiizz2.LJII.post((Runnable)new 0Uj(ljiiiizz2, this.LJIIJ));
        }
    }
}
