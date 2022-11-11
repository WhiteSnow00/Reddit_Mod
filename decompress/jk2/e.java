// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.io.IOException;
import okio.ByteString;
import java.nio.channels.WritableByteChannel;

public interface e extends e0, WritableByteChannel
{
    e E1(final ByteString p0) throws IOException;
    
    long N1(final g0 p0) throws IOException;
    
    e X0() throws IOException;
    
    e Y0() throws IOException;
    
    e a1(final String p0) throws IOException;
    
    void flush() throws IOException;
    
    c getBuffer();
    
    e h2(final int p0, final int p1, final String p2) throws IOException;
    
    e i(final long p0) throws IOException;
    
    e p2(final int p0, final int p1, final byte[] p2) throws IOException;
    
    e s1(final long p0) throws IOException;
    
    e write(final byte[] p0) throws IOException;
    
    e writeByte(final int p0) throws IOException;
    
    e writeInt(final int p0) throws IOException;
    
    e writeShort(final int p0) throws IOException;
}
