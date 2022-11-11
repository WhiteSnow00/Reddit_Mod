// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class wv
{
    public static final ResponseField[] g;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    
    static {
        g = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false), ResponseField$b.i((Map)null, "text", true, "text"), ResponseField$b.f((Map)null, "voteCount", true, "voteCount"), ResponseField$b.f((Map)null, "totalStakeAmount", true, "totalStakeAmount"), ResponseField$b.f((Map)null, "redditorStakeAmount", true, "redditorStakeAmount") };
    }
    
    public wv(final String a, final String b, final String c, final Integer d, final Integer e, final Integer f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wv)) {
            return false;
        }
        final wv wv = (wv)o;
        return sg2.e.a((Object)this.a, (Object)wv.a) && sg2.e.a((Object)this.b, (Object)wv.b) && sg2.e.a((Object)this.c, (Object)wv.c) && sg2.e.a((Object)this.d, (Object)wv.d) && sg2.e.a((Object)this.e, (Object)wv.e) && sg2.e.a((Object)this.f, (Object)wv.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, this.a.hashCode() * 31, 31);
        final String c2 = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c2 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c2.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Integer f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (((c + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PredictionOptionFragment(__typename=");
        r.append(this.a);
        r.append(", id=");
        r.append(this.b);
        r.append(", text=");
        r.append(this.c);
        r.append(", voteCount=");
        r.append(this.d);
        r.append(", totalStakeAmount=");
        r.append(this.e);
        r.append(", redditorStakeAmount=");
        return aw.b.i(r, this.f, ')');
    }
}
