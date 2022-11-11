// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import al0.f0;

public final class o0 implements u0
{
    public final boolean f;
    
    public o0(final boolean f) {
        this.f = f;
    }
    
    public final h1 a() {
        return null;
    }
    
    public final boolean isActive() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Empty{");
        String s;
        if (this.f) {
            s = "Active";
        }
        else {
            s = "New";
        }
        return f0.n(r, s, '}');
    }
}
