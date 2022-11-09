// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import com.danikula.videocache.ProxyCacheException;

public interface m
{
    void a(final long p0) throws ProxyCacheException;
    
    void close() throws ProxyCacheException;
    
    long length() throws ProxyCacheException;
    
    int read(final byte[] p0) throws ProxyCacheException;
}
