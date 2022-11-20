// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import p1.h;
import ng2.e;

public final class s extends q
{
    public final String a;
    
    public s(final String a) {
        e.f((Object)a, "verbatim");
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof s && e.a((Object)this.a, (Object)((s)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return h.c(a.t("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
