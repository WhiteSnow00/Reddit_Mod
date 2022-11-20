// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import ng2.e;
import com.reddit.listing.common.ListingViewMode;
import zu.a;
import com.reddit.domain.model.media.VideoContext;

public final class n
{
    public final String a;
    public final VideoContext b;
    public final String c;
    public final a d;
    public final ListingViewMode e;
    
    public n() {
        this(null, null, null, 31);
    }
    
    public n(String a, VideoContext b, a d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        if ((n & 0x8) != 0x0) {
            d = null;
        }
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return ng2.e.a((Object)this.a, (Object)n.a) && ng2.e.a((Object)this.b, (Object)n.b) && ng2.e.a((Object)this.c, (Object)n.c) && ng2.e.a((Object)this.d, (Object)n.d) && this.e == n.e;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final VideoContext b = this.b;
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
        final a d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final ListingViewMode e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("RecommendedVideosRequestKey(after=");
        t.append(this.a);
        t.append(", videoContext=");
        t.append(this.b);
        t.append(", adDistance=");
        t.append(this.c);
        t.append(", adContext=");
        t.append(this.d);
        t.append(", viewMode=");
        t.append(this.e);
        t.append(')');
        return t.toString();
    }
}
