// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.UUID;
import wa.c0;
import java.util.HashMap;
import java.util.List;
import android.media.MediaCryptoException;
import za.b;
import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.media.MediaDrmException;
import java.util.Map;

public interface g
{
    Map<String, String> a(final byte[] p0);
    
    d b();
    
    byte[] c() throws MediaDrmException;
    
    void d(final byte[] p0, final byte[] p1);
    
    byte[] e(final byte[] p0, final byte[] p1) throws NotProvisionedException, DeniedByServerException;
    
    boolean f(final String p0, final byte[] p1);
    
    void g(final byte[] p0) throws DeniedByServerException;
    
    void h(final DefaultDrmSessionManager$c p0);
    
    int i();
    
    za.b j(final byte[] p0) throws MediaCryptoException;
    
    void k(final byte[] p0);
    
    a l(final byte[] p0, final List<com.google.android.exoplayer2.drm.b.b> p1, final int p2, final HashMap<String, String> p3) throws NotProvisionedException;
    
    default void m(final byte[] array, final c0 c0) {
    }
    
    void release();
    
    public static final class a
    {
        public final byte[] a;
        public final String b;
        
        public a(final String b, final byte[] a) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface b
    {
    }
    
    public interface c
    {
        g a(final UUID p0);
    }
    
    public static final class d
    {
        public final byte[] a;
        public final String b;
        
        public d(final String b, final byte[] a) {
            this.a = a;
            this.b = b;
        }
    }
}
