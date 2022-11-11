// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJS\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u00c6\u0001¨\u0006\r" }, d2 = { "Lcom/reddit/data/snoovatar/entity/MarketingEventJson;", "", "", "startsAt", "endsAt", "name", "text", "", "tags", "mobileAssetUrls", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MarketingEventJson
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<String> e;
    public final List<String> f;
    
    public MarketingEventJson(@n(name = "starts_at") final String a, @n(name = "ends_at") final String b, final String c, final String d, final List<String> e, @n(name = "mobile_asset_urls") final List<String> f) {
        sg2.e.f((Object)a, "startsAt");
        sg2.e.f((Object)c, "name");
        sg2.e.f((Object)d, "text");
        sg2.e.f((Object)e, "tags");
        sg2.e.f((Object)f, "mobileAssetUrls");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final MarketingEventJson copy(@n(name = "starts_at") final String s, @n(name = "ends_at") final String s2, final String s3, final String s4, final List<String> list, @n(name = "mobile_asset_urls") final List<String> list2) {
        sg2.e.f((Object)s, "startsAt");
        sg2.e.f((Object)s3, "name");
        sg2.e.f((Object)s4, "text");
        sg2.e.f((Object)list, "tags");
        sg2.e.f((Object)list2, "mobileAssetUrls");
        return new MarketingEventJson(s, s2, s3, s4, list, list2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketingEventJson)) {
            return false;
        }
        final MarketingEventJson marketingEventJson = (MarketingEventJson)o;
        return sg2.e.a((Object)this.a, (Object)marketingEventJson.a) && sg2.e.a((Object)this.b, (Object)marketingEventJson.b) && sg2.e.a((Object)this.c, (Object)marketingEventJson.c) && sg2.e.a((Object)this.d, (Object)marketingEventJson.d) && sg2.e.a((Object)this.e, (Object)marketingEventJson.e) && sg2.e.a((Object)this.f, (Object)marketingEventJson.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.f.hashCode() + aw.b.c((List)this.e, b.c(this.d, b.c(this.c, (hashCode * 31 + hashCode2) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("MarketingEventJson(startsAt=");
        r.append(this.a);
        r.append(", endsAt=");
        r.append(this.b);
        r.append(", name=");
        r.append(this.c);
        r.append(", text=");
        r.append(this.d);
        r.append(", tags=");
        r.append(this.e);
        r.append(", mobileAssetUrls=");
        return d.o(r, (List)this.f, ')');
    }
}
