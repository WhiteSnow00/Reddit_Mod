// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

public interface Container
{
    List<Box> getBoxes();
    
     <T extends Box> List<T> getBoxes(final Class<T> p0);
    
     <T extends Box> List<T> getBoxes(final Class<T> p0, final boolean p1);
    
    ByteBuffer getByteBuffer(final long p0, final long p1) throws IOException;
    
    void setBoxes(final List<Box> p0);
    
    void writeContainer(final WritableByteChannel p0) throws IOException;
}
