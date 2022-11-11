// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccountJson;", "", "", "id", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "snoovatar", "csrfToken", "", "hasActiveClosetSubscription", "", "capabilities", "Lcom/reddit/data/snoovatar/entity/WebsocketUrlsJson;", "websocketUrls", "copy", "<init>", "(Ljava/lang/String;Lcom/reddit/data/snoovatar/entity/SnoovatarJson;Ljava/lang/String;ZLjava/util/List;Lcom/reddit/data/snoovatar/entity/WebsocketUrlsJson;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountJson
{
    public final String a;
    public final SnoovatarJson b;
    public final String c;
    public final boolean d;
    public final List<String> e;
    public final WebsocketUrlsJson f;
    
    public AccountJson(final String a, final SnoovatarJson b, @n(name = "csrf_token") final String c, @n(name = "has_active_closet_subscription") final boolean d, final List<String> e, @n(name = "websockets_urls") final WebsocketUrlsJson f) {
        sg2.e.f((Object)a, "id");
        sg2.e.f((Object)c, "csrfToken");
        sg2.e.f((Object)e, "capabilities");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final AccountJson copy(final String s, final SnoovatarJson snoovatarJson, @n(name = "csrf_token") final String s2, @n(name = "has_active_closet_subscription") final boolean b, final List<String> list, @n(name = "websockets_urls") final WebsocketUrlsJson websocketUrlsJson) {
        sg2.e.f((Object)s, "id");
        sg2.e.f((Object)s2, "csrfToken");
        sg2.e.f((Object)list, "capabilities");
        return new AccountJson(s, snoovatarJson, s2, b, list, websocketUrlsJson);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountJson)) {
            return false;
        }
        final AccountJson accountJson = (AccountJson)o;
        return sg2.e.a((Object)this.a, (Object)accountJson.a) && sg2.e.a((Object)this.b, (Object)accountJson.b) && sg2.e.a((Object)this.c, (Object)accountJson.c) && this.d == accountJson.d && sg2.e.a((Object)this.e, (Object)accountJson.e) && sg2.e.a((Object)this.f, (Object)accountJson.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final SnoovatarJson b = this.b;
        final int n = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int c = b.c(this.c, (hashCode * 31 + hashCode2) * 31, 31);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int c2 = aw.b.c((List)this.e, (c + d) * 31, 31);
        final WebsocketUrlsJson f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = f.hashCode();
        }
        return c2 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccountJson(id=");
        r.append(this.a);
        r.append(", snoovatar=");
        r.append(this.b);
        r.append(", csrfToken=");
        r.append(this.c);
        r.append(", hasActiveClosetSubscription=");
        r.append(this.d);
        r.append(", capabilities=");
        r.append(this.e);
        r.append(", websocketUrls=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
