// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import aq2.a;
import com.reddit.domain.postsets.model.PostSetPostVoteState;
import java.util.List;
import com.reddit.domain.postsets.model.PostSetPostType;

public final class e
{
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final Boolean n;
    public final boolean o;
    public final PostSetPostType p;
    public final boolean q;
    public final boolean r;
    public final f s;
    public final g t;
    public final h u;
    public final List<i> v;
    public final PostSetPostVoteState w;
    
    public e(final String a, final String b, final Long c, final String d, final int e, final int f, final int g, final String h, final int i, final boolean j, final String k, final String l, final String m, final Boolean n, final boolean o, final PostSetPostType p23, final boolean q, final boolean r, final f s, final g t, final h u, final List<? extends i> v, final PostSetPostVoteState w) {
        ng2.e.f((Object)a, "id");
        ng2.e.f((Object)v, "media");
        ng2.e.f((Object)w, "voteState");
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
        this.p = p23;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = (List<i>)v;
        this.w = w;
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
        return ng2.e.a((Object)this.a, (Object)e.a) && ng2.e.a((Object)this.b, (Object)e.b) && ng2.e.a((Object)this.c, (Object)e.c) && ng2.e.a((Object)this.d, (Object)e.d) && this.e == e.e && this.f == e.f && this.g == e.g && ng2.e.a((Object)this.h, (Object)e.h) && this.i == e.i && this.j == e.j && ng2.e.a((Object)this.k, (Object)e.k) && ng2.e.a((Object)this.l, (Object)e.l) && ng2.e.a((Object)this.m, (Object)e.m) && ng2.e.a((Object)this.n, (Object)e.n) && this.o == e.o && this.p == e.p && this.q == e.q && this.r == e.r && ng2.e.a((Object)this.s, (Object)e.s) && ng2.e.a((Object)this.t, (Object)e.t) && ng2.e.a((Object)this.u, (Object)e.u) && ng2.e.a((Object)this.v, (Object)e.v) && this.w == e.w;
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.b, this.a.hashCode() * 31, 31);
        final Long c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final int c2 = aq2.a.c(this.g, aq2.a.c(this.f, aq2.a.c(this.e, ((e + hashCode2) * 31 + hashCode3) * 31, 31), 31), 31);
        final String h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final int c3 = aq2.a.c(this.i, (c2 + hashCode4) * 31, 31);
        final int j = this.j ? 1 : 0;
        int n = 1;
        int n2 = j;
        if (j != 0) {
            n2 = 1;
        }
        final String k = this.k;
        int hashCode5;
        if (k == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = k.hashCode();
        }
        final String l = this.l;
        int hashCode6;
        if (l == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = l.hashCode();
        }
        final String m = this.m;
        int hashCode7;
        if (m == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = m.hashCode();
        }
        final Boolean n3 = this.n;
        int hashCode8;
        if (n3 == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = n3.hashCode();
        }
        int o;
        if ((o = (this.o ? 1 : 0)) != 0) {
            o = 1;
        }
        final PostSetPostType p = this.p;
        int hashCode9;
        if (p == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = p.hashCode();
        }
        int q;
        if ((q = (this.q ? 1 : 0)) != 0) {
            q = 1;
        }
        final int r = this.r ? 1 : 0;
        if (r == 0) {
            n = r;
        }
        final f s = this.s;
        int hashCode10;
        if (s == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = s.hashCode();
        }
        final g t = this.t;
        int hashCode11;
        if (t == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = t.hashCode();
        }
        final h u = this.u;
        if (u != null) {
            hashCode = u.hashCode();
        }
        return this.w.hashCode() + ph0.a.b((List)this.v, ((((((((((((c3 + n2) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + o) * 31 + hashCode9) * 31 + q) * 31 + n) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSetPost(id=");
        t.append(this.a);
        t.append(", title=");
        t.append(this.b);
        t.append(", age=");
        t.append(this.c);
        t.append(", url=");
        t.append(this.d);
        t.append(", shareCount=");
        t.append(this.e);
        t.append(", awardsCount=");
        t.append(this.f);
        t.append(", upvoteRatio=");
        t.append(this.g);
        t.append(", domain=");
        t.append(this.h);
        t.append(", commentsCount=");
        t.append(this.i);
        t.append(", isNsfw=");
        t.append(this.j);
        t.append(", textBody=");
        t.append(this.k);
        t.append(", createdAt=");
        t.append(this.l);
        t.append(", permalink=");
        t.append(this.m);
        t.append(", isOwnPost=");
        t.append(this.n);
        t.append(", isSpoiler=");
        t.append(this.o);
        t.append(", type=");
        t.append(this.p);
        t.append(", isQuarentined=");
        t.append(this.q);
        t.append(", isScoreHidden=");
        t.append(this.r);
        t.append(", author=");
        t.append(this.s);
        t.append(", content=");
        t.append(this.t);
        t.append(", postLocation=");
        t.append(this.u);
        t.append(", media=");
        t.append(this.v);
        t.append(", voteState=");
        t.append(this.w);
        t.append(')');
        return t.toString();
    }
}
