// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class cv
{
    static {
        Covode.recordClassIndex(2688);
    }
    
    public static void AFInAppEventParameterName(int n, int n2, final boolean b, final int n3, final int[] array, final int[][] array2, final int[] array3) {
        if (!b) {
            AFInAppEventParameterName(array);
        }
        final int n4 = 0;
        int n5 = n;
        n = n4;
        int n6;
        while (true) {
            n6 = n2;
            if (n >= n3) {
                break;
            }
            n2 = (n5 ^ array[n]);
            final int afKeystoreWrapper = AFKeystoreWrapper(n2, array2);
            ++n;
            n5 = (n6 ^ afKeystoreWrapper);
        }
        n = array[array.length - 2];
        n2 = array[array.length - 1];
        if (!b) {
            AFInAppEventParameterName(array);
        }
        array3[0] = (n6 ^ n2);
        array3[1] = (n5 ^ n);
    }
    
    public static void AFInAppEventParameterName(final int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            final int n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }
    }
    
    public static int AFKeystoreWrapper(final int n, final int[][] array) {
        return (array[0][n >>> 24] + array[1][n >>> 16 & 0xFF] ^ array[2][n >>> 8 & 0xFF]) + array[3][n & 0xFF];
    }
}
