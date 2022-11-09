// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ak0.m;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0001¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/snoovatar/entity/RunwayItemJson;", "", "", "title", "imageUrl", "capabilityRequired", "", "accessoryIds", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class RunwayItemJson
{
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;
    
    public RunwayItemJson(final String a, @n(name = "image_url") final String b, @n(name = "capability_required") final String c, @n(name = "accessory_ids") final List<String> d) {
        f.f((Object)a, "title");
        f.f((Object)b, "imageUrl");
        f.f((Object)d, "accessoryIds");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final RunwayItemJson copy(final String s, @n(name = "image_url") final String s2, @n(name = "capability_required") final String s3, @n(name = "accessory_ids") final List<String> list) {
        f.f((Object)s, "title");
        f.f((Object)s2, "imageUrl");
        f.f((Object)list, "accessoryIds");
        return new RunwayItemJson(s, s2, s3, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunwayItemJson)) {
            return false;
        }
        final RunwayItemJson runwayItemJson = (RunwayItemJson)o;
        return f.a((Object)this.a, (Object)runwayItemJson.a) && f.a((Object)this.b, (Object)runwayItemJson.b) && f.a((Object)this.c, (Object)runwayItemJson.c) && f.a((Object)this.d, (Object)runwayItemJson.d);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RunwayItemJson(title=");
        k.append(this.a);
        k.append(", imageUrl=");
        k.append(this.b);
        k.append(", capabilityRequired=");
        k.append(this.c);
        k.append(", accessoryIds=");
        return m.n(k, (List)this.d, ')');
    }
}
