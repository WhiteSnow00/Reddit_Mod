// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
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
        f.f((Object)a, "username");
        f.f((Object)b, "sort");
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
        return f.a((Object)this.a, (Object)userLinkKey.a) && this.b == userLinkKey.b && f.a((Object)this.c, (Object)userLinkKey.c) && this.d == userLinkKey.d && f.a((Object)this.e, (Object)userLinkKey.e);
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
        final StringBuilder k = a.k("UserLinkKey(username=");
        k.append(this.a);
        k.append(", sort=");
        k.append(this.b);
        k.append(", after=");
        k.append(this.c);
        k.append(", sortTimeFrame=");
        k.append(this.d);
        k.append(", correlationId=");
        return b.k(k, this.e, ')');
    }
}
