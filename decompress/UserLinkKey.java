// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import al0.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/local/UserLinkKey;", "", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserLinkKey
{
    public final String a;
    public final SortType b;
    public final String c;
    public final SortTimeFrame d;
    public final String e;
    
    public UserLinkKey(final SortType b, final SortTimeFrame d, final String a, final String c, final String e) {
        sg2.e.f((Object)a, "username");
        sg2.e.f((Object)b, "sort");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserLinkKey)) {
            return false;
        }
        final UserLinkKey userLinkKey = (UserLinkKey)o;
        return sg2.e.a((Object)this.a, (Object)userLinkKey.a) && this.b == userLinkKey.b && sg2.e.a((Object)this.c, (Object)userLinkKey.c) && this.d == userLinkKey.d && sg2.e.a((Object)this.e, (Object)userLinkKey.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final SortTimeFrame d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode3 = e.hashCode();
        }
        return (((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("UserLinkKey(username=");
        r.append(this.a);
        r.append(", sort=");
        r.append(this.b);
        r.append(", after=");
        r.append(this.c);
        r.append(", sortTimeFrame=");
        r.append(this.d);
        r.append(", correlationId=");
        return f0.n(r, this.e, ')');
    }
}
