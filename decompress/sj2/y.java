// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import sg2.e;
import rj2.c;
import qj2.d;
import qj2.d$e;
import pj2.b;

public final class y implements b<Float>
{
    public static final y a;
    public static final w0 b;
    
    static {
        a = new y();
        b = new w0("kotlin.Float", (d)d$e.a);
    }
    
    public final Object deserialize(final c c) {
        e.f((Object)c, "decoder");
        return c.F();
    }
    
    public final qj2.e getDescriptor() {
        return (qj2.e)y.b;
    }
    
    public final void serialize(final rj2.d d, final Object o) {
        final float floatValue = ((Number)o).floatValue();
        e.f((Object)d, "encoder");
        d.s(floatValue);
    }
}
