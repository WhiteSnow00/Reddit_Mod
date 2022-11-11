// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import com.apollographql.apollo.api.ResponseField$d;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class dj
{
    public static final ResponseField[] i;
    public final String a;
    public final String b;
    public final Object c;
    public final String d;
    public final String e;
    public final Object f;
    public final String g;
    public final String h;
    
    static {
        final ResponseField j = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final CustomType id = CustomType.ID;
        final ResponseField$d b = ResponseField$b.b((o)id, "postId", "postId", (Map)null, false);
        final CustomType url = CustomType.URL;
        i = new ResponseField[] { j, (ResponseField)b, (ResponseField)ResponseField$b.b((o)url, "postDeeplink", "postDeeplink", (Map)null, false), ResponseField$b.i((Map)null, "postScore", false, "postScore"), ResponseField$b.i((Map)null, "postTitle", false, "postTitle"), (ResponseField)ResponseField$b.b((o)url, "postImageUrl", "postImageUrl", (Map)null, true), (ResponseField)ResponseField$b.b((o)id, "subredditId", "subredditId", (Map)null, false), ResponseField$b.i((Map)null, "subredditName", false, "subredditName") };
    }
    
    public dj(final String a, final String b, final Object c, final String d, final String e, final Object f, final String g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dj)) {
            return false;
        }
        final dj dj = (dj)o;
        return sg2.e.a((Object)this.a, (Object)dj.a) && sg2.e.a((Object)this.b, (Object)dj.b) && sg2.e.a(this.c, dj.c) && sg2.e.a((Object)this.d, (Object)dj.d) && sg2.e.a((Object)this.e, (Object)dj.e) && sg2.e.a(this.f, dj.f) && sg2.e.a((Object)this.g, (Object)dj.g) && sg2.e.a((Object)this.h, (Object)dj.h);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.e, b.c(this.d, a81.e.g(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        final Object f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return this.h.hashCode() + b.c(this.g, (c + hashCode) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PostCardFragment(__typename=");
        r.append(this.a);
        r.append(", postId=");
        r.append(this.b);
        r.append(", postDeeplink=");
        r.append(this.c);
        r.append(", postScore=");
        r.append(this.d);
        r.append(", postTitle=");
        r.append(this.e);
        r.append(", postImageUrl=");
        r.append(this.f);
        r.append(", subredditId=");
        r.append(this.g);
        r.append(", subredditName=");
        return f0.n(r, this.h, ')');
    }
}
