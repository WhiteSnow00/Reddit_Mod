// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.viewpager.widget.c;
import ah2.f;

public final class q
{
    public final String a;
    public final long b;
    
    public q(final String a, final long b) {
        f.f((Object)a, "subredditId");
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
        return f.a((Object)this.a, (Object)q.a) && this.b == q.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SkippedGeoTaggingDataModel(subredditId=");
        k.append(this.a);
        k.append(", skippedUtc=");
        return c.k(k, this.b, ')');
    }
}
