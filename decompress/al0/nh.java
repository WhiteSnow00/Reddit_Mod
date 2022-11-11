// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.TreatmentProtocol;
import com.apollographql.apollo.api.ResponseField;

public final class nh
{
    public static final ResponseField[] e;
    public final String a;
    public final String b;
    public final TreatmentProtocol c;
    public final String d;
    
    static {
        e = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "appliedSort", true, "appliedSort"), ResponseField$b.d("treatment", true, "treatment"), ResponseField$b.i((Map)null, "type", true, "type") };
    }
    
    public nh(final String a, final String b, final TreatmentProtocol c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nh)) {
            return false;
        }
        final nh nh = (nh)o;
        return sg2.e.a((Object)this.a, (Object)nh.a) && sg2.e.a((Object)this.b, (Object)nh.b) && this.c == nh.c && sg2.e.a((Object)this.d, (Object)nh.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final TreatmentProtocol c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("MyRedditFeedMetadataFragment(__typename=");
        r.append(this.a);
        r.append(", appliedSort=");
        r.append(this.b);
        r.append(", treatment=");
        r.append(this.c);
        r.append(", type=");
        return f0.n(r, this.d, ')');
    }
}
