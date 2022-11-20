// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.nio.ByteBuffer;
import android.media.MediaFormat;

interface MediaDecoder extends Releasable
{
    void configure(final MediaFormat p0);
    
    void decode(final MediaSample p0);
    
    void flush();
    
    ByteBuffer getOutput();
    
    long getOutputTime();
    
    boolean hasInput();
    
    boolean hasOutput();
    
    void release();
    
    void reset();
}
