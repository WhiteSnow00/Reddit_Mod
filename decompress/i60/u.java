// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import ah2.f;
import com.reddit.notification.common.NotificationLevel;

public final class u
{
    public final Boolean A;
    public final Boolean B;
    public final Boolean C;
    public final Boolean D;
    public final Boolean E;
    public final Boolean F;
    public final Boolean G;
    public final Boolean H;
    public final Boolean I;
    public final Boolean J;
    public final NotificationLevel K;
    public final long L;
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final boolean Q;
    public final String R;
    public final Boolean S;
    public final Boolean T;
    public final Boolean U;
    public final String V;
    public final String W;
    public final String X;
    public final String Y;
    public final Boolean Z;
    public final String a;
    public final Boolean a0;
    public final String b;
    public final String b0;
    public final String c;
    public final String c0;
    public final String d;
    public final String d0;
    public final String e;
    public final Boolean e0;
    public final String f;
    public final String f0;
    public final String g;
    public final String g0;
    public final String h;
    public final String h0;
    public final String i;
    public final Boolean i0;
    public final String j;
    public final Boolean j0;
    public final String k;
    public final String k0;
    public final String l;
    public final Boolean l0;
    public final String m;
    public final Boolean m0;
    public final String n;
    public final String n0;
    public final long o;
    public final boolean o0;
    public final Long p;
    public final Boolean p0;
    public final long q;
    public final String r;
    public final String s;
    public final boolean t;
    public final Boolean u;
    public final String v;
    public final Boolean w;
    public final Boolean x;
    public final String y;
    public final Boolean z;
    
    public u(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l, final String m, final String n, final long o, final Long p68, final long q, final String r, final String s, final boolean t, final Boolean u, final String v, final Boolean w, final Boolean x, final String y, final Boolean z, final Boolean a2, final Boolean b2, final Boolean c2, final Boolean d2, final Boolean e2, final Boolean f2, final Boolean g2, final Boolean h2, final Boolean i2, final Boolean j2, final NotificationLevel k2, final long l2, final String m2, final String n2, final String o2, final String p69, final boolean q2, final String r2, final Boolean s2, final Boolean t2, final Boolean u2, final String v2, final String w2, final String x2, final String y2, final Boolean z2, final Boolean a3, final String b3, final String c3, final String d3, final Boolean e3, final String f3, final String g3, final String h3, final Boolean i3, final Boolean j3, final String k3, final Boolean l3, final Boolean m3, final String n3, final boolean o3, final Boolean p70) {
        ah2.f.f((Object)a, "subredditId");
        ah2.f.f((Object)b, "subredditKindWithId");
        ah2.f.f((Object)c, "displayName");
        ah2.f.f((Object)d, "displayNamePrefixed");
        ah2.f.f((Object)f, "keyColor");
        ah2.f.f((Object)j, "description");
        ah2.f.f((Object)l, "publicDescription");
        ah2.f.f((Object)r, "subredditType");
        ah2.f.f((Object)s, "url");
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
        this.p = p68;
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
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p69;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
        this.Z = z2;
        this.a0 = a3;
        this.b0 = b3;
        this.c0 = c3;
        this.d0 = d3;
        this.e0 = e3;
        this.f0 = f3;
        this.g0 = g3;
        this.h0 = h3;
        this.i0 = i3;
        this.j0 = j3;
        this.k0 = k3;
        this.l0 = l3;
        this.m0 = m3;
        this.n0 = n3;
        this.o0 = o3;
        this.p0 = p70;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u)) {
            return false;
        }
        final u u = (u)o;
        return ah2.f.a((Object)this.a, (Object)u.a) && ah2.f.a((Object)this.b, (Object)u.b) && ah2.f.a((Object)this.c, (Object)u.c) && ah2.f.a((Object)this.d, (Object)u.d) && ah2.f.a((Object)this.e, (Object)u.e) && ah2.f.a((Object)this.f, (Object)u.f) && ah2.f.a((Object)this.g, (Object)u.g) && ah2.f.a((Object)this.h, (Object)u.h) && ah2.f.a((Object)this.i, (Object)u.i) && ah2.f.a((Object)this.j, (Object)u.j) && ah2.f.a((Object)this.k, (Object)u.k) && ah2.f.a((Object)this.l, (Object)u.l) && ah2.f.a((Object)this.m, (Object)u.m) && ah2.f.a((Object)this.n, (Object)u.n) && this.o == u.o && ah2.f.a((Object)this.p, (Object)u.p) && this.q == u.q && ah2.f.a((Object)this.r, (Object)u.r) && ah2.f.a((Object)this.s, (Object)u.s) && this.t == u.t && ah2.f.a((Object)this.u, (Object)u.u) && ah2.f.a((Object)this.v, (Object)u.v) && ah2.f.a((Object)this.w, (Object)u.w) && ah2.f.a((Object)this.x, (Object)u.x) && ah2.f.a((Object)this.y, (Object)u.y) && ah2.f.a((Object)this.z, (Object)u.z) && ah2.f.a((Object)this.A, (Object)u.A) && ah2.f.a((Object)this.B, (Object)u.B) && ah2.f.a((Object)this.C, (Object)u.C) && ah2.f.a((Object)this.D, (Object)u.D) && ah2.f.a((Object)this.E, (Object)u.E) && ah2.f.a((Object)this.F, (Object)u.F) && ah2.f.a((Object)this.G, (Object)u.G) && ah2.f.a((Object)this.H, (Object)u.H) && ah2.f.a((Object)this.I, (Object)u.I) && ah2.f.a((Object)this.J, (Object)u.J) && this.K == u.K && this.L == u.L && ah2.f.a((Object)this.M, (Object)u.M) && ah2.f.a((Object)this.N, (Object)u.N) && ah2.f.a((Object)this.O, (Object)u.O) && ah2.f.a((Object)this.P, (Object)u.P) && this.Q == u.Q && ah2.f.a((Object)this.R, (Object)u.R) && ah2.f.a((Object)this.S, (Object)u.S) && ah2.f.a((Object)this.T, (Object)u.T) && ah2.f.a((Object)this.U, (Object)u.U) && ah2.f.a((Object)this.V, (Object)u.V) && ah2.f.a((Object)this.W, (Object)u.W) && ah2.f.a((Object)this.X, (Object)u.X) && ah2.f.a((Object)this.Y, (Object)u.Y) && ah2.f.a((Object)this.Z, (Object)u.Z) && ah2.f.a((Object)this.a0, (Object)u.a0) && ah2.f.a((Object)this.b0, (Object)u.b0) && ah2.f.a((Object)this.c0, (Object)u.c0) && ah2.f.a((Object)this.d0, (Object)u.d0) && ah2.f.a((Object)this.e0, (Object)u.e0) && ah2.f.a((Object)this.f0, (Object)u.f0) && ah2.f.a((Object)this.g0, (Object)u.g0) && ah2.f.a((Object)this.h0, (Object)u.h0) && ah2.f.a((Object)this.i0, (Object)u.i0) && ah2.f.a((Object)this.j0, (Object)u.j0) && ah2.f.a((Object)this.k0, (Object)u.k0) && ah2.f.a((Object)this.l0, (Object)u.l0) && ah2.f.a((Object)this.m0, (Object)u.m0) && ah2.f.a((Object)this.n0, (Object)u.n0) && this.o0 == u.o0 && ah2.f.a((Object)this.p0, (Object)u.p0);
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
        final int f2 = ag0.a.f(this.f, (f + hashCode2) * 31, 31);
        final String g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final String h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final String i = this.i;
        int hashCode5;
        if (i == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = i.hashCode();
        }
        final int f3 = ag0.a.f(this.j, (((f2 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31, 31);
        final String k = this.k;
        int hashCode6;
        if (k == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = k.hashCode();
        }
        final int f4 = ag0.a.f(this.l, (f3 + hashCode6) * 31, 31);
        final String m = this.m;
        int hashCode7;
        if (m == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = m.hashCode();
        }
        final String n = this.n;
        int hashCode8;
        if (n == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = n.hashCode();
        }
        final int c = b.c(this.o, ((f4 + hashCode7) * 31 + hashCode8) * 31, 31);
        final Long p = this.p;
        int hashCode9;
        if (p == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = p.hashCode();
        }
        final int f5 = ag0.a.f(this.s, ag0.a.f(this.r, b.c(this.q, (c + hashCode9) * 31, 31), 31), 31);
        final int t = this.t ? 1 : 0;
        int n2 = 1;
        int n3 = t;
        if (t != 0) {
            n3 = 1;
        }
        final Boolean u = this.u;
        int hashCode10;
        if (u == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = u.hashCode();
        }
        final String v = this.v;
        int hashCode11;
        if (v == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = v.hashCode();
        }
        final Boolean w = this.w;
        int hashCode12;
        if (w == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = w.hashCode();
        }
        final Boolean x = this.x;
        int hashCode13;
        if (x == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = x.hashCode();
        }
        final String y = this.y;
        int hashCode14;
        if (y == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = y.hashCode();
        }
        final Boolean z = this.z;
        int hashCode15;
        if (z == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = z.hashCode();
        }
        final Boolean a = this.A;
        int hashCode16;
        if (a == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = a.hashCode();
        }
        final Boolean b = this.B;
        int hashCode17;
        if (b == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = b.hashCode();
        }
        final Boolean c2 = this.C;
        int hashCode18;
        if (c2 == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = c2.hashCode();
        }
        final Boolean d = this.D;
        int hashCode19;
        if (d == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = d.hashCode();
        }
        final Boolean e2 = this.E;
        int hashCode20;
        if (e2 == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = e2.hashCode();
        }
        final Boolean f6 = this.F;
        int hashCode21;
        if (f6 == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = f6.hashCode();
        }
        final Boolean g2 = this.G;
        int hashCode22;
        if (g2 == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = g2.hashCode();
        }
        final Boolean h2 = this.H;
        int hashCode23;
        if (h2 == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = h2.hashCode();
        }
        final Boolean j = this.I;
        int hashCode24;
        if (j == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = j.hashCode();
        }
        final Boolean l = this.J;
        int hashCode25;
        if (l == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = l.hashCode();
        }
        final NotificationLevel k2 = this.K;
        int hashCode26;
        if (k2 == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = k2.hashCode();
        }
        final int c3 = b.c(this.L, ((((((((((((((((((f5 + n3) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31, 31);
        final String m2 = this.M;
        int hashCode27;
        if (m2 == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = m2.hashCode();
        }
        final String n4 = this.N;
        int hashCode28;
        if (n4 == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = n4.hashCode();
        }
        final String o = this.O;
        int hashCode29;
        if (o == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = o.hashCode();
        }
        final String p2 = this.P;
        int hashCode30;
        if (p2 == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = p2.hashCode();
        }
        int q;
        if ((q = (this.Q ? 1 : 0)) != 0) {
            q = 1;
        }
        final String r = this.R;
        int hashCode31;
        if (r == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = r.hashCode();
        }
        final Boolean s = this.S;
        int hashCode32;
        if (s == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = s.hashCode();
        }
        final Boolean t2 = this.T;
        int hashCode33;
        if (t2 == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = t2.hashCode();
        }
        final Boolean u2 = this.U;
        int hashCode34;
        if (u2 == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = u2.hashCode();
        }
        final String v2 = this.V;
        int hashCode35;
        if (v2 == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = v2.hashCode();
        }
        final String w2 = this.W;
        int hashCode36;
        if (w2 == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = w2.hashCode();
        }
        final String x2 = this.X;
        int hashCode37;
        if (x2 == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = x2.hashCode();
        }
        final String y2 = this.Y;
        int hashCode38;
        if (y2 == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = y2.hashCode();
        }
        final Boolean z2 = this.Z;
        int hashCode39;
        if (z2 == null) {
            hashCode39 = 0;
        }
        else {
            hashCode39 = z2.hashCode();
        }
        final Boolean a2 = this.a0;
        int hashCode40;
        if (a2 == null) {
            hashCode40 = 0;
        }
        else {
            hashCode40 = a2.hashCode();
        }
        final String b2 = this.b0;
        int hashCode41;
        if (b2 == null) {
            hashCode41 = 0;
        }
        else {
            hashCode41 = b2.hashCode();
        }
        final String c4 = this.c0;
        int hashCode42;
        if (c4 == null) {
            hashCode42 = 0;
        }
        else {
            hashCode42 = c4.hashCode();
        }
        final String d2 = this.d0;
        int hashCode43;
        if (d2 == null) {
            hashCode43 = 0;
        }
        else {
            hashCode43 = d2.hashCode();
        }
        final Boolean e3 = this.e0;
        int hashCode44;
        if (e3 == null) {
            hashCode44 = 0;
        }
        else {
            hashCode44 = e3.hashCode();
        }
        final String f7 = this.f0;
        int hashCode45;
        if (f7 == null) {
            hashCode45 = 0;
        }
        else {
            hashCode45 = f7.hashCode();
        }
        final String g3 = this.g0;
        int hashCode46;
        if (g3 == null) {
            hashCode46 = 0;
        }
        else {
            hashCode46 = g3.hashCode();
        }
        final String h3 = this.h0;
        int hashCode47;
        if (h3 == null) {
            hashCode47 = 0;
        }
        else {
            hashCode47 = h3.hashCode();
        }
        final Boolean i2 = this.i0;
        int hashCode48;
        if (i2 == null) {
            hashCode48 = 0;
        }
        else {
            hashCode48 = i2.hashCode();
        }
        final Boolean j2 = this.j0;
        int hashCode49;
        if (j2 == null) {
            hashCode49 = 0;
        }
        else {
            hashCode49 = j2.hashCode();
        }
        final String k3 = this.k0;
        int hashCode50;
        if (k3 == null) {
            hashCode50 = 0;
        }
        else {
            hashCode50 = k3.hashCode();
        }
        final Boolean l2 = this.l0;
        int hashCode51;
        if (l2 == null) {
            hashCode51 = 0;
        }
        else {
            hashCode51 = l2.hashCode();
        }
        final Boolean m3 = this.m0;
        int hashCode52;
        if (m3 == null) {
            hashCode52 = 0;
        }
        else {
            hashCode52 = m3.hashCode();
        }
        final String n5 = this.n0;
        int hashCode53;
        if (n5 == null) {
            hashCode53 = 0;
        }
        else {
            hashCode53 = n5.hashCode();
        }
        final int o2 = this.o0 ? 1 : 0;
        if (o2 == 0) {
            n2 = o2;
        }
        final Boolean p3 = this.p0;
        if (p3 != null) {
            hashCode = p3.hashCode();
        }
        return (((((((((((((((((((((((((((((c3 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + hashCode30) * 31 + q) * 31 + hashCode31) * 31 + hashCode32) * 31 + hashCode33) * 31 + hashCode34) * 31 + hashCode35) * 31 + hashCode36) * 31 + hashCode37) * 31 + hashCode38) * 31 + hashCode39) * 31 + hashCode40) * 31 + hashCode41) * 31 + hashCode42) * 31 + hashCode43) * 31 + hashCode44) * 31 + hashCode45) * 31 + hashCode46) * 31 + hashCode47) * 31 + hashCode48) * 31 + hashCode49) * 31 + hashCode50) * 31 + hashCode51) * 31 + hashCode52) * 31 + hashCode53) * 31 + n2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SubredditDataModel(subredditId=");
        k.append(this.a);
        k.append(", subredditKindWithId=");
        k.append(this.b);
        k.append(", displayName=");
        k.append(this.c);
        k.append(", displayNamePrefixed=");
        k.append(this.d);
        k.append(", iconImg=");
        k.append(this.e);
        k.append(", keyColor=");
        k.append(this.f);
        k.append(", bannerImg=");
        k.append(this.g);
        k.append(", headerImg=");
        k.append(this.h);
        k.append(", title=");
        k.append(this.i);
        k.append(", description=");
        k.append(this.j);
        k.append(", descriptionRtJson=");
        k.append(this.k);
        k.append(", publicDescription=");
        k.append(this.l);
        k.append(", descriptionHtml=");
        k.append(this.m);
        k.append(", publicDescriptionHtml=");
        k.append(this.n);
        k.append(", subscribers=");
        k.append(this.o);
        k.append(", accountsActive=");
        k.append(this.p);
        k.append(", createdUtc=");
        k.append(this.q);
        k.append(", subredditType=");
        k.append(this.r);
        k.append(", url=");
        k.append(this.s);
        k.append(", over18=");
        k.append(this.t);
        k.append(", wikiEnabled=");
        k.append(this.u);
        k.append(", whitelistStatus=");
        k.append(this.v);
        k.append(", newModMailEnabled=");
        k.append(this.w);
        k.append(", restrictPosting=");
        k.append(this.x);
        k.append(", submitType=");
        k.append(this.y);
        k.append(", allowImages=");
        k.append(this.z);
        k.append(", allowVideos=");
        k.append(this.A);
        k.append(", allowGifs=");
        k.append(this.B);
        k.append(", allowChatPostCreation=");
        k.append(this.C);
        k.append(", isChatPostFeatureEnabled=");
        k.append(this.D);
        k.append(", spoilersEnabled=");
        k.append(this.E);
        k.append(", userIsBanned=");
        k.append(this.F);
        k.append(", userIsSubscriber=");
        k.append(this.G);
        k.append(", userIsContributor=");
        k.append(this.H);
        k.append(", userIsModerator=");
        k.append(this.I);
        k.append(", userHasFavorited=");
        k.append(this.J);
        k.append(", notificationLevel=");
        k.append(this.K);
        k.append(", updatedTimestampUtc=");
        k.append(this.L);
        k.append(", primaryColorKey=");
        k.append(this.M);
        k.append(", communityIconUrl=");
        k.append(this.N);
        k.append(", bannerBackgroundImageUrl=");
        k.append(this.O);
        k.append(", mobileBannerImageUrl=");
        k.append(this.P);
        k.append(", isRedditPickDefault=");
        k.append(this.Q);
        k.append(", userFlairTemplateId=");
        k.append(this.R);
        k.append(", userSubredditFlairEnabled=");
        k.append(this.S);
        k.append(", canAssignUserFlair=");
        k.append(this.T);
        k.append(", userFlairEnabled=");
        k.append(this.U);
        k.append(", userFlairBackgroundColor=");
        k.append(this.V);
        k.append(", userFlairTextColor=");
        k.append(this.W);
        k.append(", userFlairText=");
        k.append(this.X);
        k.append(", userFlairRichTextJson=");
        k.append(this.Y);
        k.append(", postFlairEnabled=");
        k.append(this.Z);
        k.append(", canAssignLinkFlair=");
        k.append(this.a0);
        k.append(", advertiserCategory=");
        k.append(this.b0);
        k.append(", audienceTarget=");
        k.append(this.c0);
        k.append(", contentCategory=");
        k.append(this.d0);
        k.append(", quarantined=");
        k.append(this.e0);
        k.append(", quarantineMessage=");
        k.append(this.f0);
        k.append(", quarantineMessageHtml=");
        k.append(this.g0);
        k.append(", quarantineMessageRtJson=");
        k.append(this.h0);
        k.append(", allowPolls=");
        k.append(this.i0);
        k.append(", allowPredictions=");
        k.append(this.j0);
        k.append(", predictionLeaderboardEntryType=");
        k.append(this.k0);
        k.append(", allowPredictionsTournament=");
        k.append(this.l0);
        k.append(", shouldShowMediaInCommentsSetting=");
        k.append(this.m0);
        k.append(", allowedMediaInCommentsJson=");
        k.append(this.n0);
        k.append(", isMiniModelEntry=");
        k.append(this.o0);
        k.append(", isMyReddit=");
        return d.m(k, this.p0, ')');
    }
}
