// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class cu
{
    static {
        Covode.recordClassIndex(2687);
    }
    
    public static void AFInAppEventType(final int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            final int n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }
    }
    
    public static int values(final int n) {
        final cn afInAppEventType = cn.AFInAppEventType;
        return (afInAppEventType.values[0][n >>> 24] + afInAppEventType.values[1][n >>> 16 & 0xFF] ^ afInAppEventType.values[2][n >>> 8 & 0xFF]) + afInAppEventType.values[3][n & 0xFF];
    }
    
    public static int[] values(final char[] array, final int[] array2, final boolean b) {
        int n = (array[0] << 16) + array[1];
        int n2 = (array[2] << 16) + array[3];
        if (!b) {
            AFInAppEventType(array2);
        }
        int n3 = 0;
        do {
            final int n4 = n2;
            n2 = (n ^ array2[n3]);
            final int values = values(n2);
            ++n3;
            n = (n4 ^ values);
        } while (n3 < 16);
        final int n5 = n ^ array2[16];
        final int n6 = array2[17] ^ n2;
        array[0] = (char)(n6 >>> 16);
        array[1] = (char)n6;
        array[2] = (char)(n5 >>> 16);
        array[3] = (char)n5;
        if (!b) {
            AFInAppEventType(array2);
        }
        return new int[] { n6, n5 };
    }
}
