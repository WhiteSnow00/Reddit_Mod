// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import com.danikula.videocache.ProxyCacheException;

public interface a
{
    int a(final long p0, final byte[] p1) throws ProxyCacheException;
    
    long available() throws ProxyCacheException;
    
    void b(final int p0, final byte[] p1) throws ProxyCacheException;
    
    void close() throws ProxyCacheException;
    
    void complete() throws ProxyCacheException;
    
    boolean h();
}
