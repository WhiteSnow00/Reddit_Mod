// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.videoResampler;

import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¨\u0006\f" }, d2 = { "Lcom/reddit/video/creation/video/trim/videoResampler/ScaleTransformationUtils;", "", "()V", "getScaleAspectCrop", "", "angle", "", "widthIn", "heightIn", "widthOut", "heightOut", "getScaleAspectFit", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ScaleTransformationUtils
{
    public static final int $stable = 0;
    
    @Inject
    public ScaleTransformationUtils() {
    }
    
    public final float[] getScaleAspectCrop(int n, int n2, final int n3, final int n4, final int n5) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 1.0f);
        array[0] = (array[1] = 1.0f);
        if (n != 90 && n != 270) {
            n = n2;
            n2 = n3;
        }
        else {
            n = n3;
        }
        final float n6 = n / (float)n2;
        final float n7 = (float)n4;
        final float n8 = (float)n5;
        if (n6 > n7 / n8) {
            array[0] = n8 * n6 / n7;
        }
        else {
            array[1] = n7 / n6 / n8;
        }
        return array;
    }
    
    public final float[] getScaleAspectFit(int n, int n2, int n3, final int n4, final int n5) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 1.0f);
        array[0] = (array[1] = 1.0f);
        if (n == 90 || n == 270) {
            n = n2;
            n2 = n3;
            n3 = n;
        }
        final float n6 = n2 / (float)n3;
        final float n7 = (float)n4;
        final float n8 = n7 / n6;
        final float n9 = (float)n5;
        if (n8 < n9) {
            array[1] = n8 / n9;
        }
        else {
            array[0] = n9 * n6 / n7;
        }
        return array;
    }
}
