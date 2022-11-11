// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.io.IOException;
import yc.f;

public interface i extends f
{
    void b(final int p0, final int p1, final byte[] p2) throws IOException;
    
    boolean e(final byte[] p0, final int p1, final int p2, final boolean p3) throws IOException;
    
    boolean g(final byte[] p0, final int p1, final int p2, final boolean p3) throws IOException;
    
    long getLength();
    
    long getPosition();
    
    void h();
    
    long k();
    
    void m(final int p0) throws IOException;
    
    void n(final int p0) throws IOException;
    
    int read(final byte[] p0, final int p1, final int p2) throws IOException;
    
    void readFully(final byte[] p0, final int p1, final int p2) throws IOException;
}
