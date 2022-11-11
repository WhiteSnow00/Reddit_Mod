// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import al0.f0;
import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonTelemetryMetadata;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonTelemetryMetadata
{
    public final String a;
    public final String b;
    
    public JsonTelemetryMetadata(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonTelemetryMetadata)) {
            return false;
        }
        final JsonTelemetryMetadata jsonTelemetryMetadata = (JsonTelemetryMetadata)o;
        return e.a((Object)this.a, (Object)jsonTelemetryMetadata.a) && e.a((Object)this.b, (Object)jsonTelemetryMetadata.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("JsonTelemetryMetadata(header=");
        r.append(this.a);
        r.append(", description=");
        return f0.n(r, this.b, ')');
    }
}
