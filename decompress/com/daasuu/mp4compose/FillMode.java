// 
// Decompiled by Procyon v0.6.0
// 

package com.daasuu.mp4compose;

public enum FillMode
{
    private static final FillMode[] $VALUES;
    
    CUSTOM, 
    PRESERVE_ASPECT_CROP, 
    PRESERVE_ASPECT_FIT;
    
    public static float[] getScaleAspectCrop(final int n, final int n2, final int n3, final int n4, final int n5) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 1.0f);
        array[0] = (array[1] = 1.0f);
        int n6 = 0;
        int n7 = 0;
        Label_0051: {
            if (n != 90) {
                n6 = n2;
                n7 = n3;
                if (n != 270) {
                    break Label_0051;
                }
            }
            n7 = n2;
            n6 = n3;
        }
        final float n8 = n6 / (float)n7;
        final float n9 = (float)n4;
        final float n10 = (float)n5;
        if (n8 > n9 / n10) {
            array[0] = n10 * n8 / n9;
        }
        else {
            array[1] = n9 / n8 / n10;
        }
        return array;
    }
    
    public static float[] getScaleAspectFit(final int n, final int n2, final int n3, final int n4, final int n5) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 1.0f);
        array[0] = (array[1] = 1.0f);
        int n6 = 0;
        int n7 = 0;
        Label_0051: {
            if (n != 90) {
                n6 = n2;
                n7 = n3;
                if (n != 270) {
                    break Label_0051;
                }
            }
            n7 = n2;
            n6 = n3;
        }
        final float n8 = n6 / (float)n7;
        final float n9 = (float)n4;
        final float n10 = n9 / n8;
        final float n11 = (float)n5;
        if (n10 < n11) {
            array[1] = n10 / n11;
        }
        else {
            array[0] = n11 * n8 / n9;
        }
        return array;
    }
}
