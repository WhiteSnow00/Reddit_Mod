// 
// Decompiled by Procyon v0.6.0
// 

package pj2;

import qj2.p;
import ng2.h;
import ng2.e;

public final class j extends m
{
    public final boolean f;
    public final String g;
    
    public j(final Object o, final boolean f) {
        e.f(o, "body");
        this.f = f;
        this.g = o.toString();
    }
    
    public final String a() {
        return this.g;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && e.a((Object)h.a((Class)j.class), (Object)h.a((Class)o.getClass()))) {
            final j j = (j)o;
            return this.f == j.f && e.a((Object)this.g, (Object)j.g);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.g.hashCode() + Boolean.hashCode(this.f) * 31;
    }
    
    public final String toString() {
        String s;
        if (this.f) {
            final StringBuilder sb = new StringBuilder();
            p.a(this.g, sb);
            s = sb.toString();
            e.e((Object)s, "StringBuilder().apply(builderAction).toString()");
        }
        else {
            s = this.g;
        }
        return s;
    }
}
