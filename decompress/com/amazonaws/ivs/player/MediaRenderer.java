// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.nio.ByteBuffer;
import android.media.MediaFormat;

interface MediaRenderer extends Releasable
{
    void configure(final MediaFormat p0);
    
    void flush();
    
    long getRenderedPresentationTime();
    
    void release();
    
    void render(final ByteBuffer p0, final int p1, final long p2);
    
    void setPlaybackRate(final float p0);
    
    void start();
    
    void stop();
}
