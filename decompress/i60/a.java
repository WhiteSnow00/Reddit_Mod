// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.appcompat.widget.s0;
import ah2.f;
import java.util.List;

public final class a
{
    public final Boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final List<String> H;
    public final boolean I;
    public final Boolean J;
    public final Boolean K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final String O;
    public final String P;
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Integer g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Long p;
    public final Long q;
    public final boolean r;
    public final Boolean s;
    public final String t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final String z;
    
    public a(final String a, final String b, final long c, final boolean d, final boolean e, final boolean f, final Integer g, final boolean h, final int i, final int j, final int k, final int l, final int m, final boolean n, final boolean o, final Long p42, final Long q, final boolean r, final Boolean s, final String t, final int u, final boolean v, final boolean w, final boolean x, final int y, final String z, final Boolean a2, final boolean b2, final boolean c2, final boolean d2, final String e2, final boolean f2, final boolean g2, final List<String> h2, final boolean i2, final Boolean j2, final Boolean k2, final String l2, final boolean m2, final boolean n2, final String o2, final String p43) {
        ah2.f.f((Object)a, "accountId");
        ah2.f.f((Object)b, "name");
        ah2.f.f((Object)z, "iconUrl");
        ah2.f.f((Object)e2, "featuresJson");
        ah2.f.f((Object)h2, "linkedIdentities");
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
        this.p = p42;
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
        this.P = p43;
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
        return ah2.f.a((Object)this.a, (Object)a.a) && ah2.f.a((Object)this.b, (Object)a.b) && this.c == a.c && this.d == a.d && this.e == a.e && this.f == a.f && ah2.f.a((Object)this.g, (Object)a.g) && this.h == a.h && this.i == a.i && this.j == a.j && this.k == a.k && this.l == a.l && this.m == a.m && this.n == a.n && this.o == a.o && ah2.f.a((Object)this.p, (Object)a.p) && ah2.f.a((Object)this.q, (Object)a.q) && this.r == a.r && ah2.f.a((Object)this.s, (Object)a.s) && ah2.f.a((Object)this.t, (Object)a.t) && this.u == a.u && this.v == a.v && this.w == a.w && this.x == a.x && this.y == a.y && ah2.f.a((Object)this.z, (Object)a.z) && ah2.f.a((Object)this.A, (Object)a.A) && this.B == a.B && this.C == a.C && this.D == a.D && ah2.f.a((Object)this.E, (Object)a.E) && this.F == a.F && this.G == a.G && ah2.f.a((Object)this.H, (Object)a.H) && this.I == a.I && ah2.f.a((Object)this.J, (Object)a.J) && ah2.f.a((Object)this.K, (Object)a.K) && ah2.f.a((Object)this.L, (Object)a.L) && this.M == a.M && this.N == a.N && ah2.f.a((Object)this.O, (Object)a.O) && ah2.f.a((Object)this.P, (Object)a.P);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
        final int d = this.d ? 1 : 0;
        final int n = 1;
        int n2 = d;
        if (d != 0) {
            n2 = 1;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final Integer g = this.g;
        final int n3 = 0;
        int hashCode;
        if (g == null) {
            hashCode = 0;
        }
        else {
            hashCode = g.hashCode();
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final int e2 = s0.e(this.m, s0.e(this.l, s0.e(this.k, s0.e(this.j, s0.e(this.i, (((((c + n2) * 31 + e) * 31 + f) * 31 + hashCode) * 31 + h) * 31, 31), 31), 31), 31), 31);
        int n4;
        if ((n4 = (this.n ? 1 : 0)) != 0) {
            n4 = 1;
        }
        int o;
        if ((o = (this.o ? 1 : 0)) != 0) {
            o = 1;
        }
        final Long p = this.p;
        int hashCode2;
        if (p == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = p.hashCode();
        }
        final Long q = this.q;
        int hashCode3;
        if (q == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = q.hashCode();
        }
        int r;
        if ((r = (this.r ? 1 : 0)) != 0) {
            r = 1;
        }
        final Boolean s = this.s;
        int hashCode4;
        if (s == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = s.hashCode();
        }
        final String t = this.t;
        int hashCode5;
        if (t == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = t.hashCode();
        }
        final int e3 = s0.e(this.u, (((((((e2 + n4) * 31 + o) * 31 + hashCode2) * 31 + hashCode3) * 31 + r) * 31 + hashCode4) * 31 + hashCode5) * 31, 31);
        int v;
        if ((v = (this.v ? 1 : 0)) != 0) {
            v = 1;
        }
        int w;
        if ((w = (this.w ? 1 : 0)) != 0) {
            w = 1;
        }
        int x;
        if ((x = (this.x ? 1 : 0)) != 0) {
            x = 1;
        }
        final int f2 = ag0.a.f(this.z, s0.e(this.y, (((e3 + v) * 31 + w) * 31 + x) * 31, 31), 31);
        final Boolean a = this.A;
        int hashCode6;
        if (a == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = a.hashCode();
        }
        int b;
        if ((b = (this.B ? 1 : 0)) != 0) {
            b = 1;
        }
        int c2;
        if ((c2 = (this.C ? 1 : 0)) != 0) {
            c2 = 1;
        }
        int d2;
        if ((d2 = (this.D ? 1 : 0)) != 0) {
            d2 = 1;
        }
        final int f3 = ag0.a.f(this.E, ((((f2 + hashCode6) * 31 + b) * 31 + c2) * 31 + d2) * 31, 31);
        int f4;
        if ((f4 = (this.F ? 1 : 0)) != 0) {
            f4 = 1;
        }
        int g2;
        if ((g2 = (this.G ? 1 : 0)) != 0) {
            g2 = 1;
        }
        final int a2 = a2.b.a((List)this.H, ((f3 + f4) * 31 + g2) * 31, 31);
        int i;
        if ((i = (this.I ? 1 : 0)) != 0) {
            i = 1;
        }
        final Boolean j = this.J;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        final Boolean k = this.K;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final String l = this.L;
        int hashCode9;
        if (l == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = l.hashCode();
        }
        int m;
        if ((m = (this.M ? 1 : 0)) != 0) {
            m = 1;
        }
        int n5 = this.N ? 1 : 0;
        if (n5 != 0) {
            n5 = n;
        }
        final String o2 = this.O;
        int hashCode10;
        if (o2 == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = o2.hashCode();
        }
        final String p2 = this.P;
        int hashCode11;
        if (p2 == null) {
            hashCode11 = n3;
        }
        else {
            hashCode11 = p2.hashCode();
        }
        return (((((((a2 + i) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + m) * 31 + n5) * 31 + hashCode10) * 31 + hashCode11;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AccountDataModel(accountId=");
        k.append(this.a);
        k.append(", name=");
        k.append(this.b);
        k.append(", createdUtc=");
        k.append(this.c);
        k.append(", isEmployee=");
        k.append(this.d);
        k.append(", isFriend=");
        k.append(this.e);
        k.append(", isSuspended=");
        k.append(this.f);
        k.append(", suspensionExpiration=");
        k.append(this.g);
        k.append(", hideFromRobots=");
        k.append(this.h);
        k.append(", linkKarma=");
        k.append(this.i);
        k.append(", commentKarma=");
        k.append(this.j);
        k.append(", awarderKarma=");
        k.append(this.k);
        k.append(", awardeeKarma=");
        k.append(this.l);
        k.append(", totalKarma=");
        k.append(this.m);
        k.append(", isGold=");
        k.append(this.n);
        k.append(", isPremiumSubscriber=");
        k.append(this.o);
        k.append(", premiumExpirationUtc=");
        k.append(this.p);
        k.append(", premiumSinceUtc=");
        k.append(this.q);
        k.append(", isMod=");
        k.append(this.r);
        k.append(", hasVerifiedEmail=");
        k.append(this.s);
        k.append(", email=");
        k.append(this.t);
        k.append(", inboxCount=");
        k.append(this.u);
        k.append(", hasMail=");
        k.append(this.v);
        k.append(", hasModMail=");
        k.append(this.w);
        k.append(", hideAds=");
        k.append(this.x);
        k.append(", coins=");
        k.append(this.y);
        k.append(", iconUrl=");
        k.append(this.z);
        k.append(", showMyActiveCommunities=");
        k.append(this.A);
        k.append(", outboundClickTracking=");
        k.append(this.B);
        k.append(", forcePasswordReset=");
        k.append(this.C);
        k.append(", inChat=");
        k.append(this.D);
        k.append(", featuresJson=");
        k.append(this.E);
        k.append(", canCreateSubreddit=");
        k.append(this.F);
        k.append(", canEditName=");
        k.append(this.G);
        k.append(", linkedIdentities=");
        k.append(this.H);
        k.append(", hasPasswordSet=");
        k.append(this.I);
        k.append(", acceptChats=");
        k.append(this.J);
        k.append(", acceptPrivateMessages=");
        k.append(this.K);
        k.append(", snoovatarUrl=");
        k.append(this.L);
        k.append(", acceptFollowers=");
        k.append(this.M);
        k.append(", hasSubscribedToPremium=");
        k.append(this.N);
        k.append(", phoneCountryCode=");
        k.append(this.O);
        k.append(", phoneMaskedNumber=");
        return b.k(k, this.P, ')');
    }
}
