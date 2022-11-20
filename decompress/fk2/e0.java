// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.io.IOException;
import java.io.Flushable;
import java.io.Closeable;

public interface e0 extends Closeable, Flushable
{
    void close() throws IOException;
    
    void flush() throws IOException;
    
    h0 timeout();
    
    void write(final c p0, final long p1) throws IOException;
}
