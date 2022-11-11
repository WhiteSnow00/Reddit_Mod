// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import hh2.j0;
import sg2.e;
import java.util.ArrayList;
import java.util.List;

public final class c0 extends m0
{
    public final /* synthetic */ List<k0> c;
    
    public c0(final ArrayList c) {
        this.c = c;
    }
    
    public final n0 g(final k0 k0) {
        e.f((Object)k0, "key");
        Object m;
        if (this.c.contains(k0)) {
            final hh2.e f = k0.f();
            e.d((Object)f, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            m = t0.m((j0)f);
        }
        else {
            m = null;
        }
        return (n0)m;
    }
}
