// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.MediaCodec;
import android.view.Surface;

interface VideoRenderer extends MediaRenderer
{
    int getDroppedFrames();
    
    int getRenderedFrames();
    
    Surface getSurface();
    
    Size getVideoSize();
    
    void render(final MediaCodec p0, final int p1, final long p2);
    
    void setMediaTime(final long p0);
    
    void setSurface(final Surface p0);
    
    void setSurfaceChangeListener(final SurfaceChangeListener p0);
    
    public interface SurfaceChangeListener
    {
        void onSurfaceChange(final Surface p0);
    }
    
    public interface VideoSizeListener
    {
        void onSizeChange(final int p0, final int p1);
    }
}
