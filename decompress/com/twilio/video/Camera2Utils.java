// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.content.Context;

class Camera2Utils
{
    private static final Logger logger;
    
    static {
        logger = Logger.getLogger((Class)Camera2Utils.class);
    }
    
    public Camera2Utils() {
    }
    
    public static boolean cameraIdSupported(final Context context, final String s) {
        final CameraManager cameraManager = (CameraManager)context.getSystemService("camera");
        try {
            final String[] cameraIdList = cameraManager.getCameraIdList();
            for (int length = cameraIdList.length, i = 0; i < length; ++i) {
                if (s.equals(cameraIdList[i])) {
                    return true;
                }
            }
            return false;
        }
        catch (final CameraAccessException ex) {
            Camera2Utils.logger.e(((Throwable)ex).getMessage());
        }
        return false;
    }
}
