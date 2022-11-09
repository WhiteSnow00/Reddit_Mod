// 
// Decompiled by Procyon v0.6.0
// 

package n5;

import java.io.Closeable;

public interface c extends Closeable
{
    void bindBlob(final int p0, final byte[] p1);
    
    void bindDouble(final int p0, final double p1);
    
    void bindLong(final int p0, final long p1);
    
    void bindNull(final int p0);
    
    void bindString(final int p0, final String p1);
}
