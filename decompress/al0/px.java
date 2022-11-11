// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.apollographql.apollo.api.ResponseField$d;
import j7.k;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class px
{
    public static final ResponseField[] d;
    public final String a;
    public final String b;
    public final Object c;
    
    static {
        d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "topicName", false, "topicName"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "topicImgUrl", "topicImgUrl", (Map)null, false) };
    }
    
    public px(final Object c, final String a, final String b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof px)) {
            return false;
        }
        final px px = (px)o;
        return e.a((Object)this.a, (Object)px.a) && e.a((Object)this.b, (Object)px.b) && e.a(this.c, px.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RecapTopic(__typename=");
        r.append(this.a);
        r.append(", topicName=");
        r.append(this.b);
        r.append(", topicImgUrl=");
        return wu.a.b(r, this.c, ')');
    }
    
    public static final class a
    {
        public static px a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] d = px.d;
            final String f = k.f(d[0]);
            e.c((Object)f);
            final String f2 = k.f(d[1]);
            e.c((Object)f2);
            final ResponseField responseField = d[2];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField);
            e.c(d2);
            return new px(d2, f, f2);
        }
    }
}
