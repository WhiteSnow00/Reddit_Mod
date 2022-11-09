// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.hardware.Camera$CameraInfo;
import android.hardware.Camera;
import com.bytedance.covode.number.Covode;

public final class 0V7
{
    static {
        Covode.recordClassIndex(4772);
    }
    
    public static int LIZ(int n) {
        final int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        int n2;
        int n3;
        if (n >= 0) {
            n2 = 1;
            n3 = n;
        }
        else {
            final boolean b = false;
            n = 0;
            while (true) {
                n2 = (b ? 1 : 0);
                n3 = n;
                if (n >= numberOfCameras) {
                    break;
                }
                final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
                Camera.getCameraInfo(n, camera$CameraInfo);
                n2 = (b ? 1 : 0);
                n3 = n;
                if (camera$CameraInfo.facing == 0) {
                    break;
                }
                ++n;
            }
        }
        if (n3 < numberOfCameras) {
            return n3;
        }
        if (n2 != 0) {
            return -1;
        }
        return 0;
    }
}
