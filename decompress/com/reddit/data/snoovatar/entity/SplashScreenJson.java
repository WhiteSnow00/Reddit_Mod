// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import al0.g7;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001¨\u0006\n" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SplashScreenJson;", "", "", "imageUrl", "mobileImageUrl", "", "display", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SplashScreenJson
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public SplashScreenJson(@n(name = "image_url") final String a, @n(name = "mobile_image_url") final String b, final boolean c) {
        e.f((Object)a, "imageUrl");
        e.f((Object)b, "mobileImageUrl");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final SplashScreenJson copy(@n(name = "image_url") final String s, @n(name = "mobile_image_url") final String s2, final boolean b) {
        e.f((Object)s, "imageUrl");
        e.f((Object)s2, "mobileImageUrl");
        return new SplashScreenJson(s, s2, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplashScreenJson)) {
            return false;
        }
        final SplashScreenJson splashScreenJson = (SplashScreenJson)o;
        return e.a((Object)this.a, (Object)splashScreenJson.a) && e.a((Object)this.b, (Object)splashScreenJson.b) && this.c == splashScreenJson.c;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, this.a.hashCode() * 31, 31);
        int c2;
        if ((c2 = (this.c ? 1 : 0)) != 0) {
            c2 = 1;
        }
        return c + c2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SplashScreenJson(imageUrl=");
        r.append(this.a);
        r.append(", mobileImageUrl=");
        r.append(this.b);
        r.append(", display=");
        return g7.m(r, this.c, ')');
    }
}
