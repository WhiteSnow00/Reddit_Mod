// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import sg2.e;

public final class b
{
    public final k a;
    public final k b;
    public final k c;
    public final l d;
    public final l e;
    
    public b(final k a, final k b, final k c, final l d, final l e) {
        sg2.e.f((Object)a, "refresh");
        sg2.e.f((Object)b, "prepend");
        sg2.e.f((Object)c, "append");
        sg2.e.f((Object)d, "source");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!sg2.e.a((Object)b.class, class1)) {
            return false;
        }
        if (o != null) {
            final b b = (b)o;
            return sg2.e.a((Object)this.a, (Object)b.a) && sg2.e.a((Object)this.b, (Object)b.b) && sg2.e.a((Object)this.c, (Object)b.c) && sg2.e.a((Object)this.d, (Object)b.d) && sg2.e.a((Object)this.e, (Object)b.e);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final l e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        return (hashCode4 + (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CombinedLoadStates(refresh=");
        r.append(this.a);
        r.append(", prepend=");
        r.append(this.b);
        r.append(", append=");
        r.append(this.c);
        r.append(", source=");
        r.append(this.d);
        r.append(", mediator=");
        r.append(this.e);
        r.append(')');
        return r.toString();
    }
}
