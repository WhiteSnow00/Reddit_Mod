// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import ng2.e;
import va0.j;
import va0.i;
import com.reddit.listing.common.ListingViewMode;
import zu.a;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.ads.domain.DisplaySource;
import com.reddit.domain.model.ILink;

public final class d2<T extends ILink>
{
    public final DisplaySource a;
    public final SortType b;
    public final SortTimeFrame c;
    public final String d;
    public final Integer e;
    public final String f;
    public final a g;
    public final ListingViewMode h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final i<T> q;
    public final j<T> r;
    public final Boolean s;
    
    public d2() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524287);
    }
    
    public d2(DisplaySource a, SortType b, SortTimeFrame c, String d, Integer e, String f, a g, ListingViewMode h, String i, String j, String k, String l, boolean m, String n, String p19, i q, j r, Boolean s, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            a = null;
        }
        if ((n2 & 0x2) != 0x0) {
            b = null;
        }
        if ((n2 & 0x4) != 0x0) {
            c = null;
        }
        if ((n2 & 0x8) != 0x0) {
            d = null;
        }
        if ((n2 & 0x10) != 0x0) {
            e = null;
        }
        if ((n2 & 0x20) != 0x0) {
            f = null;
        }
        if ((n2 & 0x40) != 0x0) {
            g = null;
        }
        if ((n2 & 0x80) != 0x0) {
            h = null;
        }
        if ((n2 & 0x100) != 0x0) {
            i = null;
        }
        if ((n2 & 0x200) != 0x0) {
            j = null;
        }
        if ((n2 & 0x400) != 0x0) {
            k = null;
        }
        if ((n2 & 0x800) != 0x0) {
            l = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = false;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = null;
        }
        if ((n2 & 0x8000) != 0x0) {
            p19 = null;
        }
        if ((n2 & 0x10000) != 0x0) {
            q = null;
        }
        if ((n2 & 0x20000) != 0x0) {
            r = null;
        }
        if ((n2 & 0x40000) != 0x0) {
            s = null;
        }
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
        this.o = null;
        this.p = p19;
        this.q = (i<T>)q;
        this.r = (j<T>)r;
        this.s = s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d2)) {
            return false;
        }
        final d2 d2 = (d2)o;
        return this.a == d2.a && this.b == d2.b && this.c == d2.c && ng2.e.a((Object)this.d, (Object)d2.d) && ng2.e.a((Object)this.e, (Object)d2.e) && ng2.e.a((Object)this.f, (Object)d2.f) && ng2.e.a((Object)this.g, (Object)d2.g) && this.h == d2.h && ng2.e.a((Object)this.i, (Object)d2.i) && ng2.e.a((Object)this.j, (Object)d2.j) && ng2.e.a((Object)this.k, (Object)d2.k) && ng2.e.a((Object)this.l, (Object)d2.l) && this.m == d2.m && ng2.e.a((Object)this.n, (Object)d2.n) && ng2.e.a((Object)this.o, (Object)d2.o) && ng2.e.a((Object)this.p, (Object)d2.p) && ng2.e.a((Object)this.q, (Object)d2.q) && ng2.e.a((Object)this.r, (Object)d2.r) && ng2.e.a((Object)this.s, (Object)d2.s);
    }
    
    @Override
    public final int hashCode() {
        final DisplaySource a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final SortType b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final SortTimeFrame c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final a g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final ListingViewMode h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
        int hashCode13;
        if (l == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = l.hashCode();
        }
        int m;
        if ((m = (this.m ? 1 : 0)) != 0) {
            m = 1;
        }
        final String n = this.n;
        int hashCode14;
        if (n == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = n.hashCode();
        }
        final String o = this.o;
        int hashCode15;
        if (o == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = o.hashCode();
        }
        final String p = this.p;
        int hashCode16;
        if (p == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = p.hashCode();
        }
        final i<T> q = this.q;
        int hashCode17;
        if (q == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = q.hashCode();
        }
        final j<T> r = this.r;
        int hashCode18;
        if (r == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = r.hashCode();
        }
        final Boolean s = this.s;
        if (s != null) {
            hashCode = s.hashCode();
        }
        return (((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + m) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("RequestKey(displaySource=");
        t.append(this.a);
        t.append(", sort=");
        t.append(this.b);
        t.append(", sortTimeFrame=");
        t.append(this.c);
        t.append(", after=");
        t.append(this.d);
        t.append(", pageSize=");
        t.append(this.e);
        t.append(", adDistance=");
        t.append(this.f);
        t.append(", adContext=");
        t.append(this.g);
        t.append(", viewMode=");
        t.append(this.h);
        t.append(", subredditName=");
        t.append(this.i);
        t.append(", multiredditPath=");
        t.append(this.j);
        t.append(", username=");
        t.append(this.k);
        t.append(", geoFilter=");
        t.append(this.l);
        t.append(", userInitiated=");
        t.append(this.m);
        t.append(", correlationId=");
        t.append(this.n);
        t.append(", spanCorrelationId=");
        t.append(this.o);
        t.append(", communityHubFlair=");
        t.append(this.p);
        t.append(", filter=");
        t.append(this.q);
        t.append(", filterableMetaData=");
        t.append(this.r);
        t.append(", forceGeopopular=");
        return android.support.v4.media.a.m(t, this.s, ')');
    }
}
