// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import java.util.ArrayList;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.WhitelistStatus;
import java.util.List;
import com.reddit.type.SubredditType;
import com.apollographql.apollo.api.ResponseField;

public final class h0
{
    public static final ResponseField[] n;
    public final String a;
    public final b b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final SubredditType g;
    public final List<String> h;
    public final boolean i;
    public final WhitelistStatus j;
    public final boolean k;
    public final boolean l;
    public final a m;
    
    static {
        n = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.h((List)null, (Map)null, "modPermissions", true, "modPermissions"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "id", "id", (Map)null, false), ResponseField$b.i((Map)null, "name", false, "name"), ResponseField$b.i((Map)null, "publicDescriptionText", true, "publicDescriptionText"), ResponseField$b.a((Map)null, "isNsfw", false, "isNsfw"), ResponseField$b.d("type", false, "type"), ResponseField$b.g((List)null, (Map)null, "originalContentCategories", true, "originalContentCategories"), ResponseField$b.a((Map)null, "isQuarantined", false, "isQuarantined"), ResponseField$b.d("whitelistStatus", true, "whitelistStatus"), ResponseField$b.a((Map)null, "isSubscribed", false, "isSubscribed"), ResponseField$b.a((Map)null, "isFavorite", false, "isFavorite"), ResponseField$b.h((List)null, (Map)null, "karma", true, "karma") };
    }
    
    public h0(final String a, final b b, final String c, final String d, final String e, final boolean f, final SubredditType g, final ArrayList h, final boolean i, final WhitelistStatus j, final boolean k, final boolean l, final a m) {
        sg2.e.f((Object)g, "type");
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
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h0)) {
            return false;
        }
        final h0 h0 = (h0)o;
        return sg2.e.a((Object)this.a, (Object)h0.a) && sg2.e.a((Object)this.b, (Object)h0.b) && sg2.e.a((Object)this.c, (Object)h0.c) && sg2.e.a((Object)this.d, (Object)h0.d) && sg2.e.a((Object)this.e, (Object)h0.e) && this.f == h0.f && this.g == h0.g && sg2.e.a((Object)this.h, (Object)h0.h) && this.i == h0.i && this.j == h0.j && this.k == h0.k && this.l == h0.l && sg2.e.a((Object)this.m, (Object)h0.m);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final b b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int c = b.c(this.d, b.c(this.c, (hashCode * 31 + hashCode3) * 31, 31), 31);
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final int f = this.f ? 1 : 0;
        int n = 1;
        int n2 = f;
        if (f != 0) {
            n2 = 1;
        }
        final int hashCode5 = this.g.hashCode();
        final List<String> h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        final WhitelistStatus j = this.j;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final int l = this.l ? 1 : 0;
        if (l == 0) {
            n = l;
        }
        final a m = this.m;
        if (m != null) {
            hashCode2 = m.hashCode();
        }
        return ((((((hashCode5 + ((c + hashCode4) * 31 + n2) * 31) * 31 + hashCode6) * 31 + i) * 31 + hashCode7) * 31 + k) * 31 + n) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AnswerableQuestionAnalyticsDataFragment(__typename=");
        r.append(this.a);
        r.append(", modPermissions=");
        r.append(this.b);
        r.append(", id=");
        r.append(this.c);
        r.append(", name=");
        r.append(this.d);
        r.append(", publicDescriptionText=");
        r.append(this.e);
        r.append(", isNsfw=");
        r.append(this.f);
        r.append(", type=");
        r.append(this.g);
        r.append(", originalContentCategories=");
        r.append(this.h);
        r.append(", isQuarantined=");
        r.append(this.i);
        r.append(", whitelistStatus=");
        r.append(this.j);
        r.append(", isSubscribed=");
        r.append(this.k);
        r.append(", isFavorite=");
        r.append(this.l);
        r.append(", karma=");
        r.append(this.m);
        r.append(')');
        return r.toString();
    }
    
    public static final class a
    {
        public static final ResponseField[] d;
        public final String a;
        public final double b;
        public final double c;
        
        static {
            d = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.c("fromComments", false, "fromComments"), ResponseField$b.c("fromPosts", false, "fromPosts") };
        }
        
        public a(final String a, final double b, final double c) {
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
            return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && sg2.e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return Double.hashCode(this.c) + al0.b.c(this.b, this.a.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Karma(__typename=");
            r.append(this.a);
            r.append(", fromComments=");
            r.append(this.b);
            r.append(", fromPosts=");
            return d.k(r, this.c, ')');
        }
    }
    
    public static final class b
    {
        public static final ResponseField[] k;
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        
        static {
            k = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), ResponseField$b.a((Map)null, "isAllAllowed", false, "isAllAllowed"), ResponseField$b.a((Map)null, "isAccessEnabled", false, "isAccessEnabled"), ResponseField$b.a((Map)null, "isConfigEditingAllowed", false, "isConfigEditingAllowed"), ResponseField$b.a((Map)null, "isFlairEditingAllowed", false, "isFlairEditingAllowed"), ResponseField$b.a((Map)null, "isMailEditingAllowed", false, "isMailEditingAllowed"), ResponseField$b.a((Map)null, "isPostEditingAllowed", false, "isPostEditingAllowed"), ResponseField$b.a((Map)null, "isWikiEditingAllowed", false, "isWikiEditingAllowed"), ResponseField$b.a((Map)null, "isChatConfigEditingAllowed", false, "isChatConfigEditingAllowed"), ResponseField$b.a((Map)null, "isChatOperator", false, "isChatOperator") };
        }
        
        public b(final String a, final boolean b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g, final boolean h, final boolean i, final boolean j) {
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
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return sg2.e.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e && this.f == b.f && this.g == b.g && this.h == b.h && this.i == b.i && this.j == b.j;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b ? 1 : 0;
            int n = 1;
            int n2 = b;
            if (b != 0) {
                n2 = 1;
            }
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            int d;
            if ((d = (this.d ? 1 : 0)) != 0) {
                d = 1;
            }
            int e;
            if ((e = (this.e ? 1 : 0)) != 0) {
                e = 1;
            }
            int f;
            if ((f = (this.f ? 1 : 0)) != 0) {
                f = 1;
            }
            int g;
            if ((g = (this.g ? 1 : 0)) != 0) {
                g = 1;
            }
            int h;
            if ((h = (this.h ? 1 : 0)) != 0) {
                h = 1;
            }
            int i;
            if ((i = (this.i ? 1 : 0)) != 0) {
                i = 1;
            }
            final int j = this.j ? 1 : 0;
            if (j == 0) {
                n = j;
            }
            return ((((((((hashCode * 31 + n2) * 31 + c) * 31 + d) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + i) * 31 + n;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("ModPermissions(__typename=");
            r.append(this.a);
            r.append(", isAllAllowed=");
            r.append(this.b);
            r.append(", isAccessEnabled=");
            r.append(this.c);
            r.append(", isConfigEditingAllowed=");
            r.append(this.d);
            r.append(", isFlairEditingAllowed=");
            r.append(this.e);
            r.append(", isMailEditingAllowed=");
            r.append(this.f);
            r.append(", isPostEditingAllowed=");
            r.append(this.g);
            r.append(", isWikiEditingAllowed=");
            r.append(this.h);
            r.append(", isChatConfigEditingAllowed=");
            r.append(this.i);
            r.append(", isChatOperator=");
            return g7.m(r, this.j, ')');
        }
    }
}
