// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.UUID;
import ab.b;

public final class f implements DrmSession
{
    public final DrmSession$DrmSessionException a;
    
    public f(final DrmSession$DrmSessionException a) {
        this.a = a;
    }
    
    public final void a(final c$a c$a) {
    }
    
    public final boolean b() {
        return false;
    }
    
    public final b c() {
        return null;
    }
    
    public final void e(final c$a c$a) {
    }
    
    public final UUID f() {
        return wa.b.a;
    }
    
    public final boolean g(final String s) {
        return false;
    }
    
    public final DrmSession$DrmSessionException getError() {
        return this.a;
    }
    
    public final int getState() {
        return 1;
    }
}
