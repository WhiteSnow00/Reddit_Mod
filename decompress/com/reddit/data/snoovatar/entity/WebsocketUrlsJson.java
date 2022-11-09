// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¨\u0006\t" }, d2 = { "Lcom/reddit/data/snoovatar/entity/WebsocketUrlsJson;", "", "", "renderer", "download", "quickCreate", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class WebsocketUrlsJson
{
    public final String a;
    public final String b;
    public final String c;
    
    public WebsocketUrlsJson(final String a, final String b, @n(name = "quick_create") final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final WebsocketUrlsJson copy(final String s, final String s2, @n(name = "quick_create") final String s3) {
        return new WebsocketUrlsJson(s, s2, s3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebsocketUrlsJson)) {
            return false;
        }
        final WebsocketUrlsJson websocketUrlsJson = (WebsocketUrlsJson)o;
        return f.a((Object)this.a, (Object)websocketUrlsJson.a) && f.a((Object)this.b, (Object)websocketUrlsJson.b) && f.a((Object)this.c, (Object)websocketUrlsJson.c);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("WebsocketUrlsJson(renderer=");
        k.append(this.a);
        k.append(", download=");
        k.append(this.b);
        k.append(", quickCreate=");
        return b.k(k, this.c, ')');
    }
}
