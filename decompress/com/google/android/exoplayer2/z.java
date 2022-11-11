// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.io.IOException;
import wa.c0;
import va.f0;
import ac.p;

public interface z extends b
{
    boolean b();
    
    void d();
    
    boolean f();
    
    void g(final n[] p0, final p p1, final long p2, final long p3) throws ExoPlaybackException;
    
    String getName();
    
    int getState();
    
    p getStream();
    
    boolean i();
    
    boolean isReady();
    
    void j(final f0 p0, final n[] p1, final p p2, final long p3, final boolean p4, final boolean p5, final long p6, final long p7) throws ExoPlaybackException;
    
    void l(final long p0, final long p1) throws ExoPlaybackException;
    
    long m();
    
    void n(final long p0) throws ExoPlaybackException;
    
    ad.n o();
    
    void p();
    
    void q(final int p0, final c0 p1);
    
    void r() throws IOException;
    
    void reset();
    
    int s();
    
    void start() throws ExoPlaybackException;
    
    void stop();
    
    e t();
    
    default void v(final float n, final float n2) throws ExoPlaybackException {
    }
    
    public interface a
    {
        void a();
        
        void b(final long p0);
    }
}
