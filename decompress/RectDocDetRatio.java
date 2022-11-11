// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetRatio
{
    public int heightVal;
    public float ratio;
    public int widthVal;
    
    static {
        Covode.recordClassIndex(2812);
    }
    
    public RectDocDetRatio(final float ratio, final int widthVal, final int heightVal) {
        this.ratio = ratio;
        this.widthVal = widthVal;
        this.heightVal = heightVal;
    }
    
    public int getHeightVal() {
        return this.heightVal;
    }
    
    public float getRatio() {
        return this.ratio;
    }
    
    public int getWidthVal() {
        return this.widthVal;
    }
}
