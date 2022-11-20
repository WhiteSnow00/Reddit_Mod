// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;

public interface h
{
    void a(final b p0) throws IOException;
    
    void close() throws IOException;
    
    void write(final byte[] p0, final int p1, final int p2) throws IOException;
}
