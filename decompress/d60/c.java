// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import ak0.m;
import kotlin.collections.EmptyList;
import java.util.List;
import ag0.a;
import ah2.f;
import o22.c2;
import o22.l5;
import com.reddit.type.DiscussionType;
import o22.j5;
import o22.k5;
import o22.b1;

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
            f.f((Object)a, "title");
            f.f((Object)c, "subreddit");
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
            return ah2.f.a((Object)this.a, (Object)a.a) && ah2.f.a((Object)this.b, (Object)a.b) && ah2.f.a((Object)this.c, (Object)a.c) && this.d == a.d && this.e == a.e && ah2.f.a((Object)this.f, (Object)a.f) && ah2.f.a((Object)this.g, (Object)a.g) && ah2.f.a((Object)this.h, (Object)a.h) && this.i == a.i && this.j == a.j && this.k == a.k && ah2.f.a((Object)this.l, (Object)a.l) && ah2.f.a((Object)this.m, (Object)a.m);
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
            final int f = ag0.a.f(this.c, (hashCode * 31 + hashCode3) * 31, 31);
            final int d = this.d ? 1 : 0;
            int n = 1;
            int n2 = d;
            if (d != 0) {
                n2 = 1;
            }
            int e;
            if ((e = (this.e ? 1 : 0)) != 0) {
                e = 1;
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
            return (((((((hashCode4 + ((f + n2) * 31 + e) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + j) * 31 + n) * 31 + hashCode8) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("DataSourceInput(title=");
            k.append(this.a);
            k.append(", bodyText=");
            k.append(this.b);
            k.append(", subreddit=");
            k.append(this.c);
            k.append(", resubmit=");
            k.append(this.d);
            k.append(", sendReplies=");
            k.append(this.e);
            k.append(", flairInput=");
            k.append(this.f);
            k.append(", videoInput=");
            k.append(this.g);
            k.append(", videoGifInput=");
            k.append(this.h);
            k.append(", discussionType=");
            k.append(this.i);
            k.append(", isNsfw=");
            k.append(this.j);
            k.append(", isSpoiler=");
            k.append(this.k);
            k.append(", videoReact=");
            k.append(this.l);
            k.append(", postPermissions=");
            k.append(this.m);
            k.append(')');
            return k.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        
        public b(final String a, final String b) {
            f.f((Object)a, "field");
            f.f((Object)b, "message");
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
            return f.a((Object)this.a, (Object)b.a) && f.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("FieldError(field=");
            k.append(this.a);
            k.append(", message=");
            return b.k(k, this.b, ')');
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
            f.f((Object)instance, "fieldErrors");
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
            return f.a((Object)this.a, (Object)c.a) && f.a((Object)this.b, (Object)c.b);
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
            final StringBuilder k = a.k("VideoUploadResponse(websocketUrl=");
            k.append(this.a);
            k.append(", fieldErrors=");
            return m.n(k, (List)this.b, ')');
        }
    }
}
