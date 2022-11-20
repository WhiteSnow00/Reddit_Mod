// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings;

import p1.h;
import aq2.a;
import ng2.e;
import com.reddit.listing.common.ListingType;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/domain/settings/MockedFeedElement;", "", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MockedFeedElement
{
    public final ListingType a;
    public final int b;
    public final String c;
    
    public MockedFeedElement(final ListingType a, final int b, final String c) {
        e.f((Object)a, "listingType");
        e.f((Object)c, "jsonPayload");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MockedFeedElement)) {
            return false;
        }
        final MockedFeedElement mockedFeedElement = (MockedFeedElement)o;
        return this.a == mockedFeedElement.a && this.b == mockedFeedElement.b && e.a((Object)this.c, (Object)mockedFeedElement.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aq2.a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("MockedFeedElement(listingType=");
        t.append(this.a);
        t.append(", position=");
        t.append(this.b);
        t.append(", jsonPayload=");
        return h.c(t, this.c, ')');
    }
}
