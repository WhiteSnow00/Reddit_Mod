// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ak0.m;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import com.reddit.common.size.MediaSize;

public final class d0
{
    public final String a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final boolean j;
    public final String k;
    public final String l;
    public final int m;
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final String r;
    public final Boolean s;
    public final String t;
    public final String u;
    public final Boolean v;
    public final boolean w;
    public final MediaSize x;
    public final MediaSize y;
    public final List<SubredditPostType> z;
    
    public d0(final String a, final String b, final Boolean c, final String d, final Boolean e, final String f, final String g, final String h, final Boolean i, final boolean j, final String k, final String l, final int m, final boolean n, final String o, final String p26, final boolean q, final String r, final Boolean s, final String t, final String u, final Boolean v, final boolean w, final MediaSize x, final MediaSize y, final List<? extends SubredditPostType> z) {
        ah2.f.f((Object)a, "username");
        ah2.f.f((Object)d, "description");
        ah2.f.f((Object)f, "displayName");
        ah2.f.f((Object)h, "title");
        ah2.f.f((Object)k, "iconImg");
        ah2.f.f((Object)l, "displayNamePrefixed");
        ah2.f.f((Object)o, "keyColor");
        ah2.f.f((Object)p26, "kindWithId");
        ah2.f.f((Object)r, "url");
        ah2.f.f((Object)t, "publicDescription");
        ah2.f.f((Object)u, "subredditType");
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
        this.n = n;
        this.o = o;
        this.p = p26;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = (List<SubredditPostType>)z;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d0)) {
            return false;
        }
        final d0 d0 = (d0)o;
        return ah2.f.a((Object)this.a, (Object)d0.a) && ah2.f.a((Object)this.b, (Object)d0.b) && ah2.f.a((Object)this.c, (Object)d0.c) && ah2.f.a((Object)this.d, (Object)d0.d) && ah2.f.a((Object)this.e, (Object)d0.e) && ah2.f.a((Object)this.f, (Object)d0.f) && ah2.f.a((Object)this.g, (Object)d0.g) && ah2.f.a((Object)this.h, (Object)d0.h) && ah2.f.a((Object)this.i, (Object)d0.i) && this.j == d0.j && ah2.f.a((Object)this.k, (Object)d0.k) && ah2.f.a((Object)this.l, (Object)d0.l) && this.m == d0.m && this.n == d0.n && ah2.f.a((Object)this.o, (Object)d0.o) && ah2.f.a((Object)this.p, (Object)d0.p) && this.q == d0.q && ah2.f.a((Object)this.r, (Object)d0.r) && ah2.f.a((Object)this.s, (Object)d0.s) && ah2.f.a((Object)this.t, (Object)d0.t) && ah2.f.a((Object)this.u, (Object)d0.u) && ah2.f.a((Object)this.v, (Object)d0.v) && this.w == d0.w && ah2.f.a((Object)this.x, (Object)d0.x) && ah2.f.a((Object)this.y, (Object)d0.y) && ah2.f.a((Object)this.z, (Object)d0.z);
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
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int f = ag0.a.f(this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
        final Boolean e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final int f2 = ag0.a.f(this.f, (f + hashCode5) * 31, 31);
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final int f3 = ag0.a.f(this.h, (f2 + hashCode6) * 31, 31);
        final Boolean i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final int j = this.j ? 1 : 0;
        final int n = 1;
        int n2 = j;
        if (j != 0) {
            n2 = 1;
        }
        final int e2 = s0.e(this.m, ag0.a.f(this.l, ag0.a.f(this.k, ((f3 + hashCode7) * 31 + n2) * 31, 31), 31), 31);
        int n3;
        if ((n3 = (this.n ? 1 : 0)) != 0) {
            n3 = 1;
        }
        final int f4 = ag0.a.f(this.p, ag0.a.f(this.o, (e2 + n3) * 31, 31), 31);
        int q;
        if ((q = (this.q ? 1 : 0)) != 0) {
            q = 1;
        }
        final int f5 = ag0.a.f(this.r, (f4 + q) * 31, 31);
        final Boolean s = this.s;
        int hashCode8;
        if (s == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = s.hashCode();
        }
        final int f6 = ag0.a.f(this.u, ag0.a.f(this.t, (f5 + hashCode8) * 31, 31), 31);
        final Boolean v = this.v;
        int hashCode9;
        if (v == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = v.hashCode();
        }
        int w = this.w ? 1 : 0;
        if (w != 0) {
            w = n;
        }
        final MediaSize x = this.x;
        int hashCode10;
        if (x == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = x.hashCode();
        }
        final MediaSize y = this.y;
        int hashCode11;
        if (y == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = y.hashCode();
        }
        final List<SubredditPostType> z = this.z;
        if (z != null) {
            hashCode2 = z.hashCode();
        }
        return ((((f6 + hashCode9) * 31 + w) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("UserSubredditDataModel(username=");
        k.append(this.a);
        k.append(", bannerImg=");
        k.append(this.b);
        k.append(", userIsBanned=");
        k.append(this.c);
        k.append(", description=");
        k.append(this.d);
        k.append(", userIsMuted=");
        k.append(this.e);
        k.append(", displayName=");
        k.append(this.f);
        k.append(", headerImg=");
        k.append(this.g);
        k.append(", title=");
        k.append(this.h);
        k.append(", userIsModerator=");
        k.append(this.i);
        k.append(", over18=");
        k.append(this.j);
        k.append(", iconImg=");
        k.append(this.k);
        k.append(", displayNamePrefixed=");
        k.append(this.l);
        k.append(", subscribers=");
        k.append(this.m);
        k.append(", isDefaultIcon=");
        k.append(this.n);
        k.append(", keyColor=");
        k.append(this.o);
        k.append(", kindWithId=");
        k.append(this.p);
        k.append(", isDefaultBanner=");
        k.append(this.q);
        k.append(", url=");
        k.append(this.r);
        k.append(", userIsContributor=");
        k.append(this.s);
        k.append(", publicDescription=");
        k.append(this.t);
        k.append(", subredditType=");
        k.append(this.u);
        k.append(", userIsSubscriber=");
        k.append(this.v);
        k.append(", showInDefaultSubreddits=");
        k.append(this.w);
        k.append(", iconSize=");
        k.append(this.x);
        k.append(", bannerSize=");
        k.append(this.y);
        k.append(", allowedPostTypes=");
        return ak0.m.n(k, (List)this.z, ')');
    }
}
