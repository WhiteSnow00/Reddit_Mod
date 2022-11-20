// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.io.IOException;
import java.io.Closeable;

public interface g0 extends Closeable
{
    void close() throws IOException;
    
    long read(final c p0, final long p1) throws IOException;
    
    h0 timeout();
}
