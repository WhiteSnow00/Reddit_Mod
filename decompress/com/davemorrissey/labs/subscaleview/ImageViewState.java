// 
// Decompiled by Procyon v0.6.0
// 

package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import java.io.Serializable;

public class ImageViewState implements Serializable
{
    private final float centerX;
    private final float centerY;
    private final int orientation;
    private final float scale;
    
    public ImageViewState(final float scale, final PointF pointF, final int orientation) {
        this.scale = scale;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = orientation;
    }
    
    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }
    
    public int getOrientation() {
        return this.orientation;
    }
    
    public float getScale() {
        return this.scale;
    }
}
