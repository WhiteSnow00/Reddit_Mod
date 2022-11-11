// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

public class ImgporcUtils
{
    static {
        Covode.recordClassIndex(2800);
    }
    
    public static float calculateAspectRatio(final PointF[] array, final int n, final int n2) {
        MethodCollector.i(4183);
        final float nativeCalculateAspectRatio = nativeCalculateAspectRatio(array, n, n2);
        MethodCollector.o(4183);
        return nativeCalculateAspectRatio;
    }
    
    public static byte[] compressImage(final Bitmap bitmap, final int n, final int n2) {
        MethodCollector.i(4193);
        Bitmap$CompressFormat bitmap$CompressFormat;
        if (n == 1) {
            bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
        }
        else {
            bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(bitmap$CompressFormat, n2, (OutputStream)byteArrayOutputStream);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.o(4193);
        return byteArray;
    }
    
    public static Bitmap correctPerspective(Bitmap nativeCorrectPerspective, final PointF[] array, final int n, final int n2) {
        MethodCollector.i(4180);
        nativeCorrectPerspective = nativeCorrectPerspective(nativeCorrectPerspective, array, n, n2, 1);
        MethodCollector.o(4180);
        return nativeCorrectPerspective;
    }
    
    public static Bitmap correctPerspective(Bitmap nativeCorrectPerspective, final PointF[] array, final int n, final int n2, final int n3) {
        MethodCollector.i(4175);
        nativeCorrectPerspective = nativeCorrectPerspective(nativeCorrectPerspective, array, n, n2, n3);
        MethodCollector.o(4175);
        return nativeCorrectPerspective;
    }
    
    public static native float nativeCalculateAspectRatio(final PointF[] p0, final int p1, final int p2);
    
    public static native Bitmap nativeCorrectPerspective(final Bitmap p0, final PointF[] p1, final int p2, final int p3, final int p4);
    
    public static class InterpolationFlags
    {
        static {
            Covode.recordClassIndex(2801);
        }
    }
}
