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

public final class j3
{
    public static final ResponseField[] k;
    public final String a;
    public final String b;
    public final Object c;
    public final String d;
    public final Object e;
    public final String f;
    public final String g;
    public final String h;
    public final Object i;
    public final String j;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final CustomType id = CustomType.ID;
        final ResponseField$d b = ResponseField$b.b((o)id, "postId", "postId", (Map)null, false);
        final CustomType url = CustomType.URL;
        k = new ResponseField[] { i, (ResponseField)b, (ResponseField)ResponseField$b.b((o)url, "postDeeplink", "postDeeplink", (Map)null, false), ResponseField$b.i((Map)null, "postTitle", false, "postTitle"), (ResponseField)ResponseField$b.b((o)url, "postImageUrl", "postImageUrl", (Map)null, true), (ResponseField)ResponseField$b.b((o)id, "commentId", "commentId", (Map)null, false), ResponseField$b.i((Map)null, "commentText", false, "commentText"), ResponseField$b.i((Map)null, "commentScore", false, "commentScore"), (ResponseField)ResponseField$b.b((o)url, "commentDeeplink", "commentDeeplink", (Map)null, false), (ResponseField)ResponseField$b.b((o)id, "subredditId", "subredditId", (Map)null, false) };
    }
    
    public j3(final String a, final String b, final Object c, final String d, final Object e, final String f, final String g, final String h, final Object i, final String j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j3)) {
            return false;
        }
        final j3 j3 = (j3)o;
        return sg2.e.a((Object)this.a, (Object)j3.a) && sg2.e.a((Object)this.b, (Object)j3.b) && sg2.e.a(this.c, j3.c) && sg2.e.a((Object)this.d, (Object)j3.d) && sg2.e.a(this.e, j3.e) && sg2.e.a((Object)this.f, (Object)j3.f) && sg2.e.a((Object)this.g, (Object)j3.g) && sg2.e.a((Object)this.h, (Object)j3.h) && sg2.e.a(this.i, j3.i) && sg2.e.a((Object)this.j, (Object)j3.j);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, a81.e.g(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final Object e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return this.j.hashCode() + a81.e.g(this.i, b.c(this.h, b.c(this.g, b.c(this.f, (c + hashCode) * 31, 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CommentCardFragment(__typename=");
        r.append(this.a);
        r.append(", postId=");
        r.append(this.b);
        r.append(", postDeeplink=");
        r.append(this.c);
        r.append(", postTitle=");
        r.append(this.d);
        r.append(", postImageUrl=");
        r.append(this.e);
        r.append(", commentId=");
        r.append(this.f);
        r.append(", commentText=");
        r.append(this.g);
        r.append(", commentScore=");
        r.append(this.h);
        r.append(", commentDeeplink=");
        r.append(this.i);
        r.append(", subredditId=");
        return f0.n(r, this.j, ')');
    }
}
