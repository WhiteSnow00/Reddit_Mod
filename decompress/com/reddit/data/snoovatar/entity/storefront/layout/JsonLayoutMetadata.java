// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonLayoutMetadata;", "", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonLayoutMetadata
{
    public final String a;
    public final JsonTelemetryMetadata b;
    
    public JsonLayoutMetadata(final String a, final JsonTelemetryMetadata b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonLayoutMetadata)) {
            return false;
        }
        final JsonLayoutMetadata jsonLayoutMetadata = (JsonLayoutMetadata)o;
        return e.a((Object)this.a, (Object)jsonLayoutMetadata.a) && e.a((Object)this.b, (Object)jsonLayoutMetadata.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JsonLayoutMetadata(id=");
        t.append(this.a);
        t.append(", telemetry=");
        t.append(this.b);
        t.append(')');
        return t.toString();
    }
}
