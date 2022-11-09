// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.hardware.Camera;
import android.hardware.Camera$CameraInfo;
import com.bytedance.covode.number.Covode;

public final class 0Uk implements Runnable
{
    public final /* synthetic */ 0Uq LIZ;
    
    static {
        Covode.recordClassIndex(4744);
    }
    
    public 0Uk(final 0Uq liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        try {
            final 0Ut lizj = this.LIZ.LIZJ;
            final int liz = 0V7.LIZ(lizj.LJ.LIZ);
            Camera liz2;
            if (liz == -1) {
                liz2 = null;
            }
            else {
                liz2 = L2B.LIZ.LIZ(liz, 1EK.LIZ.LIZLLL().LJIILLIIL);
            }
            lizj.LIZ = liz2;
            if (lizj.LIZ != null) {
                Camera.getCameraInfo(0V7.LIZ(lizj.LJ.LIZ), lizj.LIZIZ = new Camera$CameraInfo());
                return;
            }
            throw new RuntimeException("Failed to open camera");
        }
        catch (final Exception ex) {
            this.LIZ.LIZ(ex);
        }
    }
}
