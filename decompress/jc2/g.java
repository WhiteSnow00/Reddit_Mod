// 
// Decompiled by Procyon v0.6.0
// 

package jc2;

import fc2.t;
import rc2.p;
import rc2.e;
import fc2.c0;

public final class g extends c0
{
    public final String f;
    public final long g;
    public final e h;
    
    public g(final String f, final long g, final p h) {
        this.f = f;
        this.g = g;
        this.h = (e)h;
    }
    
    public final long b() {
        return this.g;
    }
    
    public final t h() {
        final String f = this.f;
        t b;
        if (f != null) {
            b = t.b(f);
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final e q() {
        return this.h;
    }
}
