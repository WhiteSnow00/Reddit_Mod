// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;
import java.io.File;
import zc.i;
import zc.n;
import zc.j;
import zc.d;

public interface Cache
{
    void a(final d p0);
    
    j b(final String p0);
    
    n c(final long p0, final long p1, final String p2) throws InterruptedException, CacheException;
    
    void d(final d p0);
    
    long e(final long p0, final long p1, final String p2);
    
    void f(final String p0);
    
    void g(final String p0, final i p1) throws CacheException;
    
    long h();
    
    long i(final long p0, final long p1, final String p2);
    
    n j(final long p0, final long p1, final String p2) throws CacheException;
    
    File k(final long p0, final long p1, final String p2) throws CacheException;
    
    void l(final File p0, final long p1) throws CacheException;
    
    public static class CacheException extends IOException
    {
        public CacheException(final String s) {
            super(s);
        }
        
        public CacheException(final String s, final Throwable t) {
            super(s, t);
        }
        
        public CacheException(final Throwable t) {
            super(t);
        }
    }
    
    public interface a
    {
        void b(final Cache p0, final d p1, final n p2);
        
        void d(final d p0);
        
        void e(final Cache p0, final d p1);
    }
}
