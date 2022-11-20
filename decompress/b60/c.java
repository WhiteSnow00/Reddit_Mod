// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import p1.h;
import ng2.e;
import java.util.List;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;

public final class c
{
    public final SortType a;
    public final SortTimeFrame b;
    public final String c;
    public final ListingViewMode d;
    public final String e;
    public final String f;
    public final List<String> g;
    public final List<String> h;
    
    public c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
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
        return this.a == c.a && this.b == c.b && ng2.e.a((Object)this.c, (Object)c.c) && this.d == c.d && ng2.e.a((Object)this.e, (Object)c.e) && ng2.e.a((Object)this.f, (Object)c.f) && ng2.e.a((Object)this.g, (Object)c.g) && ng2.e.a((Object)this.h, (Object)c.h);
    }
    
    @Override
    public final int hashCode() {
        final SortType a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final SortTimeFrame b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final ListingViewMode d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
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
        final List<String> g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final List<String> h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CategoryListingRequestKey(sort=");
        t.append(this.a);
        t.append(", sortTimeFrame=");
        t.append(this.b);
        t.append(", after=");
        t.append(this.c);
        t.append(", viewMode=");
        t.append(this.d);
        t.append(", multiredditPath=");
        t.append(this.e);
        t.append(", categoryId=");
        t.append(this.f);
        t.append(", subscriptionIds=");
        t.append(this.g);
        t.append(", categoryIds=");
        return p1.h.d(t, (List)this.h, ')');
    }
}
