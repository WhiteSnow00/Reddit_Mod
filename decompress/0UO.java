// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.hardware.Camera;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class 0Uo implements Runnable
{
    public final /* synthetic */ 0Uq LIZ;
    
    static {
        Covode.recordClassIndex(4748);
    }
    
    public 0Uo(final 0Uq liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        MethodCollector.i(3605);
        while (true) {
            try {
                final 0Ut lizj = this.LIZ.LIZJ;
                if (lizj.LIZJ != null) {
                    lizj.LIZJ.LIZLLL();
                    lizj.LIZJ = null;
                }
                if (lizj.LIZ != null && lizj.LIZLLL) {
                    final Camera liz = lizj.LIZ;
                    final 5aq 5aq = new 5aq();
                    final Object[] array = new Object[0];
                    final 5dv 5dv = new 5dv(false);
                    if (5aq.LIZ(100103, "android/hardware/Camera", "stopPreview", (Object)liz, array, "void", 5dv).LIZ) {
                        5aq.LIZ((Object)null, 100103, "android/hardware/Camera", "stopPreview", (Object)liz, array, 5dv, false);
                    }
                    else {
                        liz.stopPreview();
                        5aq.LIZ((Object)null, 100103, "android/hardware/Camera", "stopPreview", (Object)liz, array, 5dv, true);
                    }
                    lizj.LJIIJJI.LIZ = null;
                    lizj.LIZLLL = false;
                }
                final 0Ut lizj2 = this.LIZ.LIZJ;
                if (lizj2.LIZ != null) {
                    final Camera liz2 = lizj2.LIZ;
                    final 5aq 5aq2 = new 5aq();
                    final Object[] array2 = new Object[0];
                    final 5dv 5dv2 = new 5dv(false);
                    if (5aq2.LIZ(100101, "android/hardware/Camera", "release", (Object)liz2, array2, "void", 5dv2).LIZ) {
                        5aq2.LIZ((Object)null, 100101, "android/hardware/Camera", "release", (Object)liz2, array2, 5dv2, false);
                    }
                    else {
                        liz2.release();
                        5aq2.LIZ((Object)null, 100101, "android/hardware/Camera", "release", (Object)liz2, array2, 5dv2, true);
                    }
                    lizj2.LIZ = null;
                }
                this.LIZ.LJI = true;
                this.LIZ.LIZLLL.sendEmptyMessage(2131374489);
                final 0Ux liz3 = this.LIZ.LIZ;
                final Object lj = liz3.LJ;
                monitorenter(lj);
                try {
                    --liz3.LIZLLL;
                    if (liz3.LIZLLL == 0) {
                        final Object lj2 = liz3.LJ;
                        monitorenter(lj2);
                        try {
                            liz3.LIZJ.quit();
                            liz3.LIZJ = null;
                            liz3.LIZIZ = null;
                            monitorexit(lj2);
                        }
                        finally {
                            monitorexit(lj2);
                            MethodCollector.o(3605);
                        }
                    }
                }
                finally {
                    monitorexit(lj);
                    MethodCollector.o(3605);
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
