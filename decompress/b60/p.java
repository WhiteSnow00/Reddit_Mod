// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class p
{
    public final String A;
    public final String B;
    public final Boolean C;
    public final Boolean D;
    public final Boolean E;
    public final Boolean F;
    public final Boolean G;
    public final Boolean H;
    public final Boolean I;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final Long l;
    public final String m;
    public final boolean n;
    public final String o;
    public final long p;
    public final long q;
    public final String r;
    public final String s;
    public final String t;
    public final Boolean u;
    public final String v;
    public final String w;
    public final Boolean x;
    public final Boolean y;
    public final Boolean z;
    
    public p(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final long k, final Long l, final String m, final boolean n, final String o, final long p35, final long q, final String r, final String s, final String t, final Boolean u, final String v, final String w, final Boolean x, final Boolean y, final Boolean z, final String a2, final String b2, final Boolean c2, final Boolean d2, final Boolean e2, final Boolean f2, final Boolean g2, final Boolean h2, final Boolean i2) {
        sg2.e.f((Object)a, "subredditId");
        sg2.e.f((Object)b, "recentSubredditKindWithId");
        sg2.e.f((Object)c, "displayName");
        sg2.e.f((Object)d, "displayNamePrefixed");
        sg2.e.f((Object)f, "keyColor");
        sg2.e.f((Object)g, "description");
        sg2.e.f((Object)h, "publicDescription");
        sg2.e.f((Object)j, "url");
        sg2.e.f((Object)o, "subredditType");
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
        this.p = p35;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return sg2.e.a((Object)this.a, (Object)p.a) && sg2.e.a((Object)this.b, (Object)p.b) && sg2.e.a((Object)this.c, (Object)p.c) && sg2.e.a((Object)this.d, (Object)p.d) && sg2.e.a((Object)this.e, (Object)p.e) && sg2.e.a((Object)this.f, (Object)p.f) && sg2.e.a((Object)this.g, (Object)p.g) && sg2.e.a((Object)this.h, (Object)p.h) && sg2.e.a((Object)this.i, (Object)p.i) && sg2.e.a((Object)this.j, (Object)p.j) && this.k == p.k && sg2.e.a((Object)this.l, (Object)p.l) && sg2.e.a((Object)this.m, (Object)p.m) && this.n == p.n && sg2.e.a((Object)this.o, (Object)p.o) && this.p == p.p && this.q == p.q && sg2.e.a((Object)this.r, (Object)p.r) && sg2.e.a((Object)this.s, (Object)p.s) && sg2.e.a((Object)this.t, (Object)p.t) && sg2.e.a((Object)this.u, (Object)p.u) && sg2.e.a((Object)this.v, (Object)p.v) && sg2.e.a((Object)this.w, (Object)p.w) && sg2.e.a((Object)this.x, (Object)p.x) && sg2.e.a((Object)this.y, (Object)p.y) && sg2.e.a((Object)this.z, (Object)p.z) && sg2.e.a((Object)this.A, (Object)p.A) && sg2.e.a((Object)this.B, (Object)p.B) && sg2.e.a((Object)this.C, (Object)p.C) && sg2.e.a((Object)this.D, (Object)p.D) && sg2.e.a((Object)this.E, (Object)p.E) && sg2.e.a((Object)this.F, (Object)p.F) && sg2.e.a((Object)this.G, (Object)p.G) && sg2.e.a((Object)this.H, (Object)p.H) && sg2.e.a((Object)this.I, (Object)p.I);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final int c2 = b.c(this.h, b.c(this.g, b.c(this.f, (c + hashCode2) * 31, 31), 31), 31);
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final int b = b.b(this.k, b.c(this.j, (c2 + hashCode3) * 31, 31), 31);
        final Long l = this.l;
        int hashCode4;
        if (l == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = l.hashCode();
        }
        final String m = this.m;
        int hashCode5;
        if (m == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = m.hashCode();
        }
        int n;
        if ((n = (this.n ? 1 : 0)) != 0) {
            n = 1;
        }
        final int b2 = b.b(this.q, b.b(this.p, b.c(this.o, (((b + hashCode4) * 31 + hashCode5) * 31 + n) * 31, 31), 31), 31);
        final String r = this.r;
        int hashCode6;
        if (r == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = r.hashCode();
        }
        final String s = this.s;
        int hashCode7;
        if (s == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = s.hashCode();
        }
        final String t = this.t;
        int hashCode8;
        if (t == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = t.hashCode();
        }
        final Boolean u = this.u;
        int hashCode9;
        if (u == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = u.hashCode();
        }
        final String v = this.v;
        int hashCode10;
        if (v == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = v.hashCode();
        }
        final String w = this.w;
        int hashCode11;
        if (w == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = w.hashCode();
        }
        final Boolean x = this.x;
        int hashCode12;
        if (x == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = x.hashCode();
        }
        final Boolean y = this.y;
        int hashCode13;
        if (y == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = y.hashCode();
        }
        final Boolean z = this.z;
        int hashCode14;
        if (z == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = z.hashCode();
        }
        final String a = this.A;
        int hashCode15;
        if (a == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = a.hashCode();
        }
        final String b3 = this.B;
        int hashCode16;
        if (b3 == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = b3.hashCode();
        }
        final Boolean c3 = this.C;
        int hashCode17;
        if (c3 == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = c3.hashCode();
        }
        final Boolean d = this.D;
        int hashCode18;
        if (d == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = d.hashCode();
        }
        final Boolean e2 = this.E;
        int hashCode19;
        if (e2 == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = e2.hashCode();
        }
        final Boolean f = this.F;
        int hashCode20;
        if (f == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = f.hashCode();
        }
        final Boolean g = this.G;
        int hashCode21;
        if (g == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = g.hashCode();
        }
        final Boolean h = this.H;
        int hashCode22;
        if (h == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = h.hashCode();
        }
        final Boolean j = this.I;
        if (j != null) {
            hashCode = j.hashCode();
        }
        return (((((((((((((((((b2 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RecentSubredditDataModel(subredditId=");
        r.append(this.a);
        r.append(", recentSubredditKindWithId=");
        r.append(this.b);
        r.append(", displayName=");
        r.append(this.c);
        r.append(", displayNamePrefixed=");
        r.append(this.d);
        r.append(", iconImg=");
        r.append(this.e);
        r.append(", keyColor=");
        r.append(this.f);
        r.append(", description=");
        r.append(this.g);
        r.append(", publicDescription=");
        r.append(this.h);
        r.append(", descriptionHtml=");
        r.append(this.i);
        r.append(", url=");
        r.append(this.j);
        r.append(", subscribers=");
        r.append(this.k);
        r.append(", accountsActive=");
        r.append(this.l);
        r.append(", bannerImg=");
        r.append(this.m);
        r.append(", over18=");
        r.append(this.n);
        r.append(", subredditType=");
        r.append(this.o);
        r.append(", lastVisited=");
        r.append(this.p);
        r.append(", createdUtc=");
        r.append(this.q);
        r.append(", advertiserCategory=");
        r.append(this.r);
        r.append(", audienceTarget=");
        r.append(this.s);
        r.append(", contentCategory=");
        r.append(this.t);
        r.append(", quarantined=");
        r.append(this.u);
        r.append(", quarantineMessage=");
        r.append(this.v);
        r.append(", quarantineMessageHtml=");
        r.append(this.w);
        r.append(", allowChatPostCreation=");
        r.append(this.x);
        r.append(", isChatPostFeatureEnabled=");
        r.append(this.y);
        r.append(", isModerator=");
        r.append(this.z);
        r.append(", communityIconUrl=");
        r.append(this.A);
        r.append(", submitType=");
        r.append(this.B);
        r.append(", allowImages=");
        r.append(this.C);
        r.append(", spoilersEnabled=");
        r.append(this.D);
        r.append(", allowPolls=");
        r.append(this.E);
        r.append(", allowPredictions=");
        r.append(this.F);
        r.append(", allowVideos=");
        r.append(this.G);
        r.append(", isMyReddit=");
        r.append(this.H);
        r.append(", isMuted=");
        return android.support.v4.media.a.j(r, this.I, ')');
    }
}
