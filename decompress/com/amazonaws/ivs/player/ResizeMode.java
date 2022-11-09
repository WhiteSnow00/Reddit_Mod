// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.ViewGroup$LayoutParams;
import android.view.SurfaceView;
import android.view.View;

public enum ResizeMode
{
    FILL, 
    FIT, 
    ZOOM;
    
    private static Size scaleTo(final ResizeMode resizeMode, final View view, int n, final int n2) {
        final int width = view.getWidth();
        final int height = view.getHeight();
        final float n3 = n2 / (float)n;
        n = ResizeMode$1.$SwitchMap$com$amazonaws$ivs$player$ResizeMode[resizeMode.ordinal()];
        if (n == 1) {
            return new Size(width, height);
        }
        if (n != 3) {
            final float n4 = (float)height;
            final float n5 = width * n3;
            if (n4 > n5) {
                return new Size(width, (int)n5);
            }
            return new Size((int)(n4 / n3), height);
        }
        else {
            final float n6 = (float)height;
            final float n7 = width * n3;
            if (n6 < n7) {
                return new Size(width, (int)n7);
            }
            return new Size((int)(n6 / n3), height);
        }
    }
    
    public void setLayoutParams(final SurfaceView surfaceView, final int n, final int n2) {
        final Size scaleTo = scaleTo(this, (View)((View)surfaceView).getParent(), n, n2);
        final ViewGroup$LayoutParams layoutParams = ((View)surfaceView).getLayoutParams();
        layoutParams.width = scaleTo.width;
        layoutParams.height = scaleTo.height;
        ((View)surfaceView).setLayoutParams(layoutParams);
    }
    
    public void setTransform(final TextureView textureView, int n, int n2) {
        final int width = ((View)textureView).getWidth();
        final int height = ((View)textureView).getHeight();
        final Size scaleTo = scaleTo(this, (View)textureView, n, n2);
        final Matrix transform = new Matrix();
        textureView.getTransform(transform);
        transform.setScale(scaleTo.width / (float)width, scaleTo.height / (float)height);
        n = (width - scaleTo.width) / 2;
        n2 = (height - scaleTo.height) / 2;
        transform.postTranslate((float)n, (float)n2);
        textureView.setTransform(transform);
    }
}
