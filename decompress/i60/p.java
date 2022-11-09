// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import ah2.f;

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
    
    public p(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final long k, final Long l, final String m, final boolean n, final String o, final long p34, final long q, final String r, final String s, final String t, final Boolean u, final String v, final String w, final Boolean x, final Boolean y, final Boolean z, final String a2, final String b2, final Boolean c2, final Boolean d2, final Boolean e2, final Boolean f2, final Boolean g2, final Boolean h2) {
        ah2.f.f((Object)a, "subredditId");
        ah2.f.f((Object)b, "recentSubredditKindWithId");
        ah2.f.f((Object)c, "displayName");
        ah2.f.f((Object)d, "displayNamePrefixed");
        ah2.f.f((Object)f, "keyColor");
        ah2.f.f((Object)g, "description");
        ah2.f.f((Object)h, "publicDescription");
        ah2.f.f((Object)j, "url");
        ah2.f.f((Object)o, "subredditType");
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
        this.p = p34;
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
        return ah2.f.a((Object)this.a, (Object)p.a) && ah2.f.a((Object)this.b, (Object)p.b) && ah2.f.a((Object)this.c, (Object)p.c) && ah2.f.a((Object)this.d, (Object)p.d) && ah2.f.a((Object)this.e, (Object)p.e) && ah2.f.a((Object)this.f, (Object)p.f) && ah2.f.a((Object)this.g, (Object)p.g) && ah2.f.a((Object)this.h, (Object)p.h) && ah2.f.a((Object)this.i, (Object)p.i) && ah2.f.a((Object)this.j, (Object)p.j) && this.k == p.k && ah2.f.a((Object)this.l, (Object)p.l) && ah2.f.a((Object)this.m, (Object)p.m) && this.n == p.n && ah2.f.a((Object)this.o, (Object)p.o) && this.p == p.p && this.q == p.q && ah2.f.a((Object)this.r, (Object)p.r) && ah2.f.a((Object)this.s, (Object)p.s) && ah2.f.a((Object)this.t, (Object)p.t) && ah2.f.a((Object)this.u, (Object)p.u) && ah2.f.a((Object)this.v, (Object)p.v) && ah2.f.a((Object)this.w, (Object)p.w) && ah2.f.a((Object)this.x, (Object)p.x) && ah2.f.a((Object)this.y, (Object)p.y) && ah2.f.a((Object)this.z, (Object)p.z) && ah2.f.a((Object)this.A, (Object)p.A) && ah2.f.a((Object)this.B, (Object)p.B) && ah2.f.a((Object)this.C, (Object)p.C) && ah2.f.a((Object)this.D, (Object)p.D) && ah2.f.a((Object)this.E, (Object)p.E) && ah2.f.a((Object)this.F, (Object)p.F) && ah2.f.a((Object)this.G, (Object)p.G) && ah2.f.a((Object)this.H, (Object)p.H);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final int f2 = ag0.a.f(this.h, ag0.a.f(this.g, ag0.a.f(this.f, (f + hashCode2) * 31, 31), 31), 31);
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final int c = b.c(this.k, ag0.a.f(this.j, (f2 + hashCode3) * 31, 31), 31);
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
        final int c2 = b.c(this.q, b.c(this.p, ag0.a.f(this.o, (((c + hashCode4) * 31 + hashCode5) * 31 + n) * 31, 31), 31), 31);
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
        final String b = this.B;
        int hashCode16;
        if (b == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = b.hashCode();
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
        final Boolean f3 = this.F;
        int hashCode20;
        if (f3 == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = f3.hashCode();
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
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((((((((((c2 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RecentSubredditDataModel(subredditId=");
        k.append(this.a);
        k.append(", recentSubredditKindWithId=");
        k.append(this.b);
        k.append(", displayName=");
        k.append(this.c);
        k.append(", displayNamePrefixed=");
        k.append(this.d);
        k.append(", iconImg=");
        k.append(this.e);
        k.append(", keyColor=");
        k.append(this.f);
        k.append(", description=");
        k.append(this.g);
        k.append(", publicDescription=");
        k.append(this.h);
        k.append(", descriptionHtml=");
        k.append(this.i);
        k.append(", url=");
        k.append(this.j);
        k.append(", subscribers=");
        k.append(this.k);
        k.append(", accountsActive=");
        k.append(this.l);
        k.append(", bannerImg=");
        k.append(this.m);
        k.append(", over18=");
        k.append(this.n);
        k.append(", subredditType=");
        k.append(this.o);
        k.append(", lastVisited=");
        k.append(this.p);
        k.append(", createdUtc=");
        k.append(this.q);
        k.append(", advertiserCategory=");
        k.append(this.r);
        k.append(", audienceTarget=");
        k.append(this.s);
        k.append(", contentCategory=");
        k.append(this.t);
        k.append(", quarantined=");
        k.append(this.u);
        k.append(", quarantineMessage=");
        k.append(this.v);
        k.append(", quarantineMessageHtml=");
        k.append(this.w);
        k.append(", allowChatPostCreation=");
        k.append(this.x);
        k.append(", isChatPostFeatureEnabled=");
        k.append(this.y);
        k.append(", isModerator=");
        k.append(this.z);
        k.append(", communityIconUrl=");
        k.append(this.A);
        k.append(", submitType=");
        k.append(this.B);
        k.append(", allowImages=");
        k.append(this.C);
        k.append(", spoilersEnabled=");
        k.append(this.D);
        k.append(", allowPolls=");
        k.append(this.E);
        k.append(", allowPredictions=");
        k.append(this.F);
        k.append(", allowVideos=");
        k.append(this.G);
        k.append(", isMyReddit=");
        return d.m(k, this.H, ')');
    }
}
