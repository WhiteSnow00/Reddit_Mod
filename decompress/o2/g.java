// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import sg2.h;
import sg2.e;

public final class g implements d
{
    @Override
    public final void a(final f f) {
        e.f((Object)f, "buffer");
        f.d = -1;
        f.e = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof g;
    }
    
    @Override
    public final int hashCode() {
        return h.a((Class)g.class).hashCode();
    }
    
    @Override
    public final String toString() {
        return "FinishComposingTextCommand()";
    }
}
