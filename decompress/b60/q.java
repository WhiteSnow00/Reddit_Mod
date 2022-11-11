// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class q
{
    public final String a;
    public final long b;
    
    public q(final String a, final long b) {
        e.f((Object)a, "subredditId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return e.a((Object)this.a, (Object)q.a) && this.b == q.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SkippedGeoTaggingDataModel(subredditId=");
        r.append(this.a);
        r.append(", skippedUtc=");
        return b.i(r, this.b, ')');
    }
}
