// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import java.util.List;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class w70
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final Object c;
    public final b d;
    public final a e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.i((Map)null, "embedHtml", true, "embedHtml"), (ResponseField)ResponseField$b.b((o)CustomType.URL, "url", "url", (Map)null, true), ResponseField$b.h((List)null, (Map)null, "dimensions", true, "dimensions"), ResponseField$b.h((List)null, (Map)null, "attribution", true, "attribution") };
    }
    
    public w70(final String a, final String b, final Object c, final b d, final a e) {
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
        if (!(o instanceof w70)) {
            return false;
        }
        final w70 w70 = (w70)o;
        return sg2.e.a((Object)this.a, (Object)w70.a) && sg2.e.a((Object)this.b, (Object)w70.b) && sg2.e.a(this.c, w70.c) && sg2.e.a((Object)this.d, (Object)w70.d) && sg2.e.a((Object)this.e, (Object)w70.e);
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
        final Object c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final b d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final a e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("VideoMediaFragment(__typename=");
        r.append(this.a);
        r.append(", embedHtml=");
        r.append(this.b);
        r.append(", url=");
        r.append(this.c);
        r.append(", dimensions=");
        r.append(this.d);
        r.append(", attribution=");
        r.append(this.e);
        r.append(')');
        return r.toString();
    }
    
    public static final class a
    {
        public static final ResponseField[] h;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Object e;
        public final String f;
        public final Object g;
        
        static {
            final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
            final ResponseField j = ResponseField$b.i((Map)null, "title", true, "title");
            final ResponseField k = ResponseField$b.i((Map)null, "description", true, "description");
            final ResponseField l = ResponseField$b.i((Map)null, "authorName", true, "authorName");
            final CustomType url = CustomType.URL;
            h = new ResponseField[] { i, j, k, l, (ResponseField)ResponseField$b.b((o)url, "authorUrl", "authorUrl", (Map)null, true), ResponseField$b.i((Map)null, "providerName", true, "providerName"), (ResponseField)ResponseField$b.b((o)url, "providerUrl", "providerUrl", (Map)null, true) };
        }
        
        public a(final String a, final String b, final String c, final String d, final Object e, final String f, final Object g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && sg2.e.a((Object)this.c, (Object)a.c) && sg2.e.a((Object)this.d, (Object)a.d) && sg2.e.a(this.e, a.e) && sg2.e.a((Object)this.f, (Object)a.f) && sg2.e.a(this.g, a.g);
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
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final String d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final Object e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final String f = this.f;
            int hashCode7;
            if (f == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = f.hashCode();
            }
            final Object g = this.g;
            if (g != null) {
                hashCode2 = g.hashCode();
            }
            return (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Attribution(__typename=");
            r.append(this.a);
            r.append(", title=");
            r.append(this.b);
            r.append(", description=");
            r.append(this.c);
            r.append(", authorName=");
            r.append(this.d);
            r.append(", authorUrl=");
            r.append(this.e);
            r.append(", providerName=");
            r.append(this.f);
            r.append(", providerUrl=");
            return wu.a.b(r, this.g, ')');
        }
    }
    
    public static final class b
    {
        public static final ResponseField[] d;
        public final String a;
        public final int b;
        public final int c;
        
        static {
            d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.f((Map)null, "width", false, "width"), ResponseField$b.f((Map)null, "height", false, "height") };
        }
        
        public b(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return sg2.e.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.c) + a.c(this.b, this.a.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Dimensions(__typename=");
            r.append(this.a);
            r.append(", width=");
            r.append(this.b);
            r.append(", height=");
            return d.l(r, this.c, ')');
        }
    }
}
