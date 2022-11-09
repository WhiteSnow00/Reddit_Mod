// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;
import t60.a;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistRows;", "Lt60/a;", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ArtistRows implements a
{
    public final String a;
    public final ArtistsBody b;
    
    public ArtistRows(final String a, final ArtistsBody b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtistRows)) {
            return false;
        }
        final ArtistRows artistRows = (ArtistRows)o;
        return f.a((Object)this.a, (Object)artistRows.a) && f.a((Object)this.b, (Object)artistRows.b);
    }
    
    public final String getId() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ArtistRows(id=");
        k.append(this.a);
        k.append(", body=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
