// 
// Decompiled by Procyon v0.6.0
// 

package mj2;

import ng2.e;

public abstract class h
{
    @Override
    public final int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public final String toString() {
        final String n = ng2.h.a((Class)this.getClass()).n();
        e.c((Object)n);
        return n;
    }
}
