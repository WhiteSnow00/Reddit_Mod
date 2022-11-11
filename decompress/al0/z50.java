// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import com.apollographql.apollo.api.ResponseField$d;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.CustomizationFlag;
import com.reddit.type.ImagePosition;
import com.apollographql.apollo.api.ResponseField;

public final class z50
{
    public static final ResponseField[] r;
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final ImagePosition f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final ImagePosition o;
    public final CustomizationFlag p;
    public final Object q;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final CustomType url = CustomType.URL;
        final ResponseField$d b = ResponseField$b.b((o)url, "icon", "icon", (Map)null, true);
        final CustomType rgbcolor = CustomType.RGBCOLOR;
        r = new ResponseField[] { i, (ResponseField)b, (ResponseField)ResponseField$b.b((o)rgbcolor, "primaryColor", "primaryColor", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "bannerBackgroundImage", "bannerBackgroundImage", (Map)null, true), (ResponseField)ResponseField$b.b((o)rgbcolor, "bannerBackgroundColor", "bannerBackgroundColor", (Map)null, true), ResponseField$b.d("bannerBackgroundImagePosition", true, "bannerBackgroundImagePosition"), (ResponseField)ResponseField$b.b((o)url, "mobileBannerImage", "mobileBannerImage", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "postDownvoteIconActive", "postDownvoteIconActive", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "postDownvoteIconInactive", "postDownvoteIconInactive", (Map)null, true), (ResponseField)ResponseField$b.b((o)rgbcolor, "postDownvoteCountColor", "postDownvoteCountColor", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "postUpvoteIconActive", "postUpvoteIconActive", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "postUpvoteIconInactive", "postUpvoteIconInactive", (Map)null, true), (ResponseField)ResponseField$b.b((o)rgbcolor, "postUpvoteCountColor", "postUpvoteCountColor", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "postPlaceholderImage", "postPlaceholderImage", (Map)null, true), ResponseField$b.d("postPlaceholderImagePosition", true, "postPlaceholderImagePosition"), ResponseField$b.d("postVoteIcons", true, "postVoteIcons"), (ResponseField)ResponseField$b.b((o)rgbcolor, "highlightColor", "highlightColor", (Map)null, true) };
    }
    
    public z50(final String a, final Object b, final Object c, final Object d, final Object e, final ImagePosition f, final Object g, final Object h, final Object i, final Object j, final Object k, final Object l, final Object m, final Object n, final ImagePosition o, final CustomizationFlag p17, final Object q) {
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
        this.p = p17;
        this.q = q;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z50)) {
            return false;
        }
        final z50 z50 = (z50)o;
        return sg2.e.a((Object)this.a, (Object)z50.a) && sg2.e.a(this.b, z50.b) && sg2.e.a(this.c, z50.c) && sg2.e.a(this.d, z50.d) && sg2.e.a(this.e, z50.e) && this.f == z50.f && sg2.e.a(this.g, z50.g) && sg2.e.a(this.h, z50.h) && sg2.e.a(this.i, z50.i) && sg2.e.a(this.j, z50.j) && sg2.e.a(this.k, z50.k) && sg2.e.a(this.l, z50.l) && sg2.e.a(this.m, z50.m) && sg2.e.a(this.n, z50.n) && this.o == z50.o && this.p == z50.p && sg2.e.a(this.q, z50.q);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Object b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Object c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Object e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final ImagePosition f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Object g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final Object h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Object i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Object j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final Object k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final Object l = this.l;
        int hashCode13;
        if (l == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = l.hashCode();
        }
        final Object m = this.m;
        int hashCode14;
        if (m == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = m.hashCode();
        }
        final Object n = this.n;
        int hashCode15;
        if (n == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = n.hashCode();
        }
        final ImagePosition o = this.o;
        int hashCode16;
        if (o == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = o.hashCode();
        }
        final CustomizationFlag p = this.p;
        int hashCode17;
        if (p == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = p.hashCode();
        }
        final Object q = this.q;
        if (q != null) {
            hashCode2 = q.hashCode();
        }
        return (((((((((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditStylesFragment(__typename=");
        r.append(this.a);
        r.append(", icon=");
        r.append(this.b);
        r.append(", primaryColor=");
        r.append(this.c);
        r.append(", bannerBackgroundImage=");
        r.append(this.d);
        r.append(", bannerBackgroundColor=");
        r.append(this.e);
        r.append(", bannerBackgroundImagePosition=");
        r.append(this.f);
        r.append(", mobileBannerImage=");
        r.append(this.g);
        r.append(", postDownvoteIconActive=");
        r.append(this.h);
        r.append(", postDownvoteIconInactive=");
        r.append(this.i);
        r.append(", postDownvoteCountColor=");
        r.append(this.j);
        r.append(", postUpvoteIconActive=");
        r.append(this.k);
        r.append(", postUpvoteIconInactive=");
        r.append(this.l);
        r.append(", postUpvoteCountColor=");
        r.append(this.m);
        r.append(", postPlaceholderImage=");
        r.append(this.n);
        r.append(", postPlaceholderImagePosition=");
        r.append(this.o);
        r.append(", postVoteIcons=");
        r.append(this.p);
        r.append(", highlightColor=");
        return wu.a.b(r, this.q, ')');
    }
}
