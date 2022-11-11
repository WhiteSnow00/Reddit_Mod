// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001¨\u0006\t" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SnoovatarWebsocketJson;", "", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "snoovatar", "", "shareLink", "copy", "<init>", "(Lcom/reddit/data/snoovatar/entity/SnoovatarJson;Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SnoovatarWebsocketJson
{
    public final SnoovatarJson a;
    public final String b;
    
    public SnoovatarWebsocketJson(final SnoovatarJson a, @n(name = "share_link") final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final SnoovatarWebsocketJson copy(final SnoovatarJson snoovatarJson, @n(name = "share_link") final String s) {
        return new SnoovatarWebsocketJson(snoovatarJson, s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnoovatarWebsocketJson)) {
            return false;
        }
        final SnoovatarWebsocketJson snoovatarWebsocketJson = (SnoovatarWebsocketJson)o;
        return e.a((Object)this.a, (Object)snoovatarWebsocketJson.a) && e.a((Object)this.b, (Object)snoovatarWebsocketJson.b);
    }
    
    @Override
    public final int hashCode() {
        final SnoovatarJson a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SnoovatarWebsocketJson(snoovatar=");
        r.append(this.a);
        r.append(", shareLink=");
        return f0.n(r, this.b, ')');
    }
}
