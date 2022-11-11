// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.util.UUID;
import za.b;

public interface DrmSession
{
    default void d(final DrmSession drmSession, final DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.e(null);
        }
        if (drmSession != null) {
            drmSession.a(null);
        }
    }
    
    void a(final c.a p0);
    
    default boolean b() {
        return false;
    }
    
    b c();
    
    void e(final c.a p0);
    
    UUID f();
    
    boolean g(final String p0);
    
    DrmSessionException getError();
    
    int getState();
    
    public static class DrmSessionException extends IOException
    {
        public final int errorCode;
        
        public DrmSessionException(final Throwable t, final int errorCode) {
            super(t);
            this.errorCode = errorCode;
        }
    }
}
