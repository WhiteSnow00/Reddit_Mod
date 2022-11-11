// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import java.util.List;
import h7.o;
import com.reddit.type.CustomType;
import a81.e;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.apollographql.apollo.api.ResponseField;

public final class e20
{
    public static final ResponseField[] h;
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final a e;
    public final int f;
    public final boolean g;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final Map r = e.r("format", "HLS");
        final CustomType url = CustomType.URL;
        h = new ResponseField[] { i, (ResponseField)ResponseField$b.b((o)url, "hlsUrl", "url", r, false), (ResponseField)ResponseField$b.b((o)url, "dashUrl", "url", e.r("format", "DASH"), false), (ResponseField)ResponseField$b.b((o)url, "scrubberMediaUrl", "scrubberMediaUrl", (Map)null, false), ResponseField$b.h((List)null, (Map)null, "dimensions", false, "dimensions"), ResponseField$b.f((Map)null, "duration", false, "duration"), ResponseField$b.a((Map)null, "isGif", false, "isGif") };
    }
    
    public e20(final String a, final Object b, final Object c, final Object d, final a e, final int f, final boolean g) {
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
        if (!(o instanceof e20)) {
            return false;
        }
        final e20 e20 = (e20)o;
        return sg2.e.a((Object)this.a, (Object)e20.a) && sg2.e.a(this.b, e20.b) && sg2.e.a(this.c, e20.c) && sg2.e.a(this.d, e20.d) && sg2.e.a((Object)this.e, (Object)e20.e) && this.f == e20.f && this.g == e20.g;
    }
    
    @Override
    public final int hashCode() {
        final int c = a.c(this.f, (this.e.hashCode() + a81.e.g(this.d, a81.e.g(this.c, a81.e.g(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31, 31);
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return c + g;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("StreamingMediaFragment(__typename=");
        r.append(this.a);
        r.append(", hlsUrl=");
        r.append(this.b);
        r.append(", dashUrl=");
        r.append(this.c);
        r.append(", scrubberMediaUrl=");
        r.append(this.d);
        r.append(", dimensions=");
        r.append(this.e);
        r.append(", duration=");
        r.append(this.f);
        r.append(", isGif=");
        return g7.m(r, this.g, ')');
    }
    
    public static final class a
    {
        public static final ResponseField[] d;
        public final String a;
        public final int b;
        public final int c;
        
        static {
            d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.f((Map)null, "width", false, "width"), ResponseField$b.f((Map)null, "height", false, "height") };
        }
        
        public a(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return sg2.e.a((Object)this.a, (Object)a.a) && this.b == a.b && this.c == a.c;
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
