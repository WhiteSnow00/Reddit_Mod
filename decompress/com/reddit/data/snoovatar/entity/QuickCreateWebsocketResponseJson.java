// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/QuickCreateWebsocketResponseJson;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class QuickCreateWebsocketResponseJson
{
    public final String a;
    public final RandomSnoovatarJson b;
    public final QuickCreateError c;
    
    public QuickCreateWebsocketResponseJson(final String a, final RandomSnoovatarJson b, final QuickCreateError c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuickCreateWebsocketResponseJson)) {
            return false;
        }
        final QuickCreateWebsocketResponseJson quickCreateWebsocketResponseJson = (QuickCreateWebsocketResponseJson)o;
        return e.a((Object)this.a, (Object)quickCreateWebsocketResponseJson.a) && e.a((Object)this.b, (Object)quickCreateWebsocketResponseJson.b) && e.a((Object)this.c, (Object)quickCreateWebsocketResponseJson.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final RandomSnoovatarJson b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final QuickCreateError c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("QuickCreateWebsocketResponseJson(code=");
        r.append(this.a);
        r.append(", response=");
        r.append(this.b);
        r.append(", error=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
