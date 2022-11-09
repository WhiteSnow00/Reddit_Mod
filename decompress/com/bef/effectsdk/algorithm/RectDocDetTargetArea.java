// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetTargetArea
{
    public float bottomLeftX;
    public float bottomLeftY;
    public float bottomRightX;
    public float bottomRightY;
    public float topLeftX;
    public float topLeftY;
    public float topRightX;
    public float topRightY;
    
    static {
        Covode.recordClassIndex(2814);
    }
    
    public RectDocDetTargetArea(final float topLeftX, final float topLeftY, final float topRightX, final float topRightY, final float bottomLeftX, final float bottomLeftY, final float bottomRightX, final float bottomRightY) {
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.bottomRightX = bottomRightX;
        this.bottomRightY = bottomRightY;
    }
    
    public float getBottomLeftX() {
        return this.bottomLeftX;
    }
    
    public float getBottomLeftY() {
        return this.bottomLeftY;
    }
    
    public float getBottomRightX() {
        return this.bottomRightX;
    }
    
    public float getBottomRightY() {
        return this.bottomRightY;
    }
    
    public float getTopLeftX() {
        return this.topLeftX;
    }
    
    public float getTopLeftY() {
        return this.topLeftY;
    }
    
    public float getTopRightX() {
        return this.topRightX;
    }
    
    public float getTopRightY() {
        return this.topRightY;
    }
}
