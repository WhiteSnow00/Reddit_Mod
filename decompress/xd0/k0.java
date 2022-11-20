// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import p1.h;
import ng2.e;
import com.reddit.domain.repository.TypeaheadRequestState;

public final class k0
{
    public final TypeaheadRequestState a;
    public final String b;
    
    public k0() {
        this(0);
    }
    
    public k0(final int n) {
        this(TypeaheadRequestState.UNINITIALIZED, "");
    }
    
    public k0(final TypeaheadRequestState a, final String b) {
        e.f((Object)a, "requestState");
        e.f((Object)b, "query");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k0)) {
            return false;
        }
        final k0 k0 = (k0)o;
        return this.a == k0.a && e.a((Object)this.b, (Object)k0.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TypeaheadResultState(requestState=");
        t.append(this.a);
        t.append(", query=");
        return h.c(t, this.b, ')');
    }
}
