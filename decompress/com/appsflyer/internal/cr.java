// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class cr
{
    static {
        Covode.recordClassIndex(2686);
    }
    
    public static char[] AFKeystoreWrapper(final long n, final char[] array) {
        final int length = array.length;
        final char[] array2 = new char[length];
        int i = 0;
        int n2 = 0;
        int n3 = 4;
        while (i < array.length) {
            if (((n >>> i & 0x1L) != 0x1L || n2 >= 4) && n3 < length) {
                array2[n3] = array[i];
                ++n3;
            }
            else {
                array2[n2] = array[i];
                ++n2;
            }
            ++i;
        }
        return array2;
    }
}
