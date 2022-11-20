// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import o9.b;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface Box
{
    void getBox(final WritableByteChannel p0) throws IOException;
    
    long getOffset();
    
    Container getParent();
    
    long getSize();
    
    String getType();
    
    void parse(final a p0, final ByteBuffer p1, final long p2, final b p3) throws IOException;
    
    void setParent(final Container p0);
}
