// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

class MaskingHelper
{
    public MaskingHelper() {
    }
    
    public static void unmask(final byte[] array, final byte[] array2, int n, int i) {
        final int n2 = 0;
        int n3 = n;
        for (n = n2; i > 0; --i, ++n) {
            array2[n3] ^= array[n % array.length];
            ++n3;
        }
    }
}
