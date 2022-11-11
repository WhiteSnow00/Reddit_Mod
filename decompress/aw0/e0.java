// 
// Decompiled by Procyon v0.6.0
// 

package aw0;

import sg2.e;
import bm0.v1;

public final class e0
{
    public final String a;
    public final v1 b;
    
    public e0(final String a, final v1 b) {
        e.f((Object)a, "username");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final e0 e0 = (e0)o;
        return e.a((Object)this.a, (Object)e0.a) && e.a((Object)this.b, (Object)e0.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("UserSuggestion(username=");
        r.append(this.a);
        r.append(", avatarInfo=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
