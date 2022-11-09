// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/local/LinkListingKey;", "", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkListingKey
{
    public final String a;
    
    public LinkListingKey(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof LinkListingKey && f.a((Object)this.a, (Object)((LinkListingKey)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return b.k(a.k("LinkListingKey(path="), this.a, ')');
    }
}
