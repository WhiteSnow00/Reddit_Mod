// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import kotlin.collections.EmptyList;
import java.util.List;
import p1.h;
import aq2.a;
import ng2.e;
import y12.c2;
import y12.l5;
import com.reddit.type.DiscussionType;
import y12.j5;
import y12.k5;
import y12.b1;

public interface c
{
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final b1 f;
        public final k5 g;
        public final j5 h;
        public final DiscussionType i;
        public final boolean j;
        public final boolean k;
        public final l5 l;
        public final c2 m;
        
        public a(final String a, final String b, final String c, final boolean d, final boolean e, final b1 f, final k5 g, final j5 h, final DiscussionType i, final boolean j, final boolean k, final l5 l, final c2 m) {
            e.f((Object)a, "title");
            e.f((Object)c, "subreddit");
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
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && ng2.e.a((Object)this.c, (Object)a.c) && this.d == a.d && this.e == a.e && ng2.e.a((Object)this.f, (Object)a.f) && ng2.e.a((Object)this.g, (Object)a.g) && ng2.e.a((Object)this.h, (Object)a.h) && this.i == a.i && this.j == a.j && this.k == a.k && ng2.e.a((Object)this.l, (Object)a.l) && ng2.e.a((Object)this.m, (Object)a.m);
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
            final int e = aq2.a.e(this.c, (hashCode * 31 + hashCode3) * 31, 31);
            final int d = this.d ? 1 : 0;
            int n = 1;
            int n2 = d;
            if (d != 0) {
                n2 = 1;
            }
            int e2;
            if ((e2 = (this.e ? 1 : 0)) != 0) {
                e2 = 1;
            }
            final int hashCode4 = this.f.hashCode();
            final k5 g = this.g;
            int hashCode5;
            if (g == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = g.hashCode();
            }
            final j5 h = this.h;
            int hashCode6;
            if (h == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = h.hashCode();
            }
            final DiscussionType i = this.i;
            int hashCode7;
            if (i == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = i.hashCode();
            }
            int j;
            if ((j = (this.j ? 1 : 0)) != 0) {
                j = 1;
            }
            final int k = this.k ? 1 : 0;
            if (k == 0) {
                n = k;
            }
            final l5 l = this.l;
            int hashCode8;
            if (l == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = l.hashCode();
            }
            final c2 m = this.m;
            if (m != null) {
                hashCode2 = m.hashCode();
            }
            return (((((((hashCode4 + ((e + n2) * 31 + e2) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + j) * 31 + n) * 31 + hashCode8) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("DataSourceInput(title=");
            t.append(this.a);
            t.append(", bodyText=");
            t.append(this.b);
            t.append(", subreddit=");
            t.append(this.c);
            t.append(", resubmit=");
            t.append(this.d);
            t.append(", sendReplies=");
            t.append(this.e);
            t.append(", flairInput=");
            t.append(this.f);
            t.append(", videoInput=");
            t.append(this.g);
            t.append(", videoGifInput=");
            t.append(this.h);
            t.append(", discussionType=");
            t.append(this.i);
            t.append(", isNsfw=");
            t.append(this.j);
            t.append(", isSpoiler=");
            t.append(this.k);
            t.append(", videoReact=");
            t.append(this.l);
            t.append(", postPermissions=");
            t.append(this.m);
            t.append(')');
            return t.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        
        public b(final String a, final String b) {
            e.f((Object)a, "field");
            e.f((Object)b, "message");
            this.a = a;
            this.b = b;
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
            return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("FieldError(field=");
            t.append(this.a);
            t.append(", message=");
            return h.c(t, this.b, ')');
        }
    }
    
    public static final class c
    {
        public final String a;
        public final List<b> b;
        
        public c() {
            this(null, null, 3);
        }
        
        public c(String a, List instance, final int n) {
            if ((n & 0x1) != 0x0) {
                a = null;
            }
            if ((n & 0x2) != 0x0) {
                instance = EmptyList.INSTANCE;
            }
            e.f((Object)instance, "fieldErrors");
            this.a = a;
            this.b = (List<b>)instance;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return e.a((Object)this.a, (Object)c.a) && e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.b.hashCode() + hashCode * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("VideoUploadResponse(websocketUrl=");
            t.append(this.a);
            t.append(", fieldErrors=");
            return h.d(t, (List)this.b, ')');
        }
    }
}
