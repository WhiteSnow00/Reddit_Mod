// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.view.TextureView;
import android.view.SurfaceView;

@Deprecated
public class ViewUtil
{
    private ViewUtil() {
    }
    
    public static void setLayoutParams(final SurfaceView surfaceView, final int n, final int n2) {
        ResizeMode.FIT.setLayoutParams(surfaceView, n, n2);
    }
    
    public static void setTransform(final TextureView textureView, final int n, final int n2) {
        ResizeMode.FIT.setTransform(textureView, n, n2);
    }
}
