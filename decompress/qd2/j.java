// 
// Decompiled by Procyon v0.6.0
// 

package qd2;

import java.io.IOException;
import java.io.Closeable;

public abstract class j implements Closeable
{
    public abstract void flush() throws IOException;
    
    public abstract void h(final long p0) throws IOException;
    
    public abstract void j(final byte[] p0, final int p1) throws IOException;
}
