// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/RunwayJson;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class RunwayJson
{
    public final String a;
    public final String b;
    public final List<RunwayItemJson> c;
    
    public RunwayJson(final String a, final String b, final List<RunwayItemJson> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunwayJson)) {
            return false;
        }
        final RunwayJson runwayJson = (RunwayJson)o;
        return e.a((Object)this.a, (Object)runwayJson.a) && e.a((Object)this.b, (Object)runwayJson.b) && e.a((Object)this.c, (Object)runwayJson.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RunwayJson(id=");
        r.append(this.a);
        r.append(", title=");
        r.append(this.b);
        r.append(", items=");
        return d.o(r, (List)this.c, ')');
    }
}
