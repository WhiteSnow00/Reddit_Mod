// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings;

import androidx.appcompat.widget.s0;
import ah2.f;
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
        f.f((Object)a, "listingType");
        f.f((Object)c, "jsonPayload");
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
        return this.a == mockedFeedElement.a && this.b == mockedFeedElement.b && f.a((Object)this.c, (Object)mockedFeedElement.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + s0.e(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MockedFeedElement(listingType=");
        k.append(this.a);
        k.append(", position=");
        k.append(this.b);
        k.append(", jsonPayload=");
        return b.k(k, this.c, ')');
    }
}
