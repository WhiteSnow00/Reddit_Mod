// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class s
{
    public String a;
    public int b;
    
    public s(final String a, final int b) {
        e.f((Object)a, "streamId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final s s = (s)o;
        return e.a((Object)this.a, (Object)s.a) && this.b == s.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("StreamLinkStateDataModel(streamId=");
        r.append(this.a);
        r.append(", voteDirection=");
        return d.l(r, this.b, ')');
    }
}
