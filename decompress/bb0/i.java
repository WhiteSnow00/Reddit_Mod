// 
// Decompiled by Procyon v0.6.0
// 

package bb0;

import b20.e;
import java.util.List;

public final class i
{
    public final List<e> a;
    public final int b;
    
    public i(final List<e> a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return sg2.e.a((Object)this.a, (Object)i.a) && this.b == i.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("UploadFailures(recoverableFailedFiles=");
        r.append(this.a);
        r.append(", nonRecoverableFailuresCount=");
        return d.l(r, this.b, ')');
    }
}
