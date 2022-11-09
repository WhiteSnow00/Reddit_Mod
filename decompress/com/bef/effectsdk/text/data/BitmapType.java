// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.text.data;

import com.bytedance.covode.number.Covode;

public enum BitmapType
{
    TEXT_BITMAP_NEON_ALPHA(2), 
    TEXT_BITMAP_NONE(-1), 
    TEXT_BITMAP_SHAKE_ALPHA(4), 
    TEXT_BITMAP_SINGLE_CHAR_ALPHA(3), 
    TEXT_BITMAP_TYPE_ALPHA(0), 
    TEXT_BITMAP_TYPE_RGBA8888(1);
    
    public int value;
    
    static {
        Covode.recordClassIndex(2844);
    }
    
    public BitmapType(final int value) {
        this.value = value;
    }
    
    public static BitmapType valueOf(final int n) {
        for (final BitmapType bitmapType : values()) {
            if (bitmapType.value == n) {
                return bitmapType;
            }
        }
        return BitmapType.TEXT_BITMAP_NONE;
    }
}
