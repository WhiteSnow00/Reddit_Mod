// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.io.IOException;
import xa.d0;
import bc.o;
import wa.g0;

public interface z extends x$b
{
    boolean b();
    
    void d();
    
    boolean f();
    
    void g(final g0 p0, final n[] p1, final o p2, final long p3, final boolean p4, final boolean p5, final long p6, final long p7) throws ExoPlaybackException;
    
    String getName();
    
    int getState();
    
    o getStream();
    
    void h(final int p0, final d0 p1);
    
    boolean isReady();
    
    boolean j();
    
    void k(final n[] p0, final o p1, final long p2, final long p3) throws ExoPlaybackException;
    
    void m(final long p0, final long p1) throws ExoPlaybackException;
    
    long n();
    
    void o(final long p0) throws ExoPlaybackException;
    
    bd.o p();
    
    void q();
    
    void r() throws IOException;
    
    void reset();
    
    int s();
    
    void start() throws ExoPlaybackException;
    
    void stop();
    
    e t();
    
    default void v(final float n, final float n2) throws ExoPlaybackException {
    }
}
