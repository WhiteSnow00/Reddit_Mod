// 
// Decompiled by Procyon v0.6.0
// 

package c60;

public final class e
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    
    public e(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final Boolean j, final boolean k, final Boolean l, final Boolean m, final Boolean n) {
        sg2.e.f((Object)a, "subredditId");
        sg2.e.f((Object)b, "subredditKindWithId");
        sg2.e.f((Object)c, "displayName");
        sg2.e.f((Object)d, "displayNamePrefixed");
        sg2.e.f((Object)f, "keyColor");
        sg2.e.f((Object)i, "subredditType");
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
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return sg2.e.a((Object)this.a, (Object)e.a) && sg2.e.a((Object)this.b, (Object)e.b) && sg2.e.a((Object)this.c, (Object)e.c) && sg2.e.a((Object)this.d, (Object)e.d) && sg2.e.a((Object)this.e, (Object)e.e) && sg2.e.a((Object)this.f, (Object)e.f) && sg2.e.a((Object)this.g, (Object)e.g) && sg2.e.a((Object)this.h, (Object)e.h) && sg2.e.a((Object)this.i, (Object)e.i) && sg2.e.a((Object)this.j, (Object)e.j) && this.k == e.k && sg2.e.a((Object)this.l, (Object)e.l) && sg2.e.a((Object)this.m, (Object)e.m) && sg2.e.a((Object)this.n, (Object)e.n);
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
        final int c2 = b.c(this.f, (c + hashCode2) * 31, 31);
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
        final int c3 = b.c(this.i, ((c2 + hashCode3) * 31 + hashCode4) * 31, 31);
        final Boolean j = this.j;
        int hashCode5;
        if (j == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final Boolean l = this.l;
        int hashCode6;
        if (l == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = l.hashCode();
        }
        final Boolean m = this.m;
        int hashCode7;
        if (m == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = m.hashCode();
        }
        final Boolean n = this.n;
        if (n != null) {
            hashCode = n.hashCode();
        }
        return ((((c3 + hashCode5) * 31 + k) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditListItemQueryModel(subredditId=");
        r.append(this.a);
        r.append(", subredditKindWithId=");
        r.append(this.b);
        r.append(", displayName=");
        r.append(this.c);
        r.append(", displayNamePrefixed=");
        r.append(this.d);
        r.append(", primaryColorKey=");
        r.append(this.e);
        r.append(", keyColor=");
        r.append(this.f);
        r.append(", communityIconUrl=");
        r.append(this.g);
        r.append(", iconImg=");
        r.append(this.h);
        r.append(", subredditType=");
        r.append(this.i);
        r.append(", userHasFavorited=");
        r.append(this.j);
        r.append(", over18=");
        r.append(this.k);
        r.append(", userIsSubscriber=");
        r.append(this.l);
        r.append(", userIsModerator=");
        r.append(this.m);
        r.append(", isMyReddit=");
        return android.support.v4.media.a.j(r, this.n, ')');
    }
}
