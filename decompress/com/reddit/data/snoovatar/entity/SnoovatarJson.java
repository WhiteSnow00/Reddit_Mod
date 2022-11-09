// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J¦\u0001\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "", "", "id", "accountKindWithId", "", "lastUpdateAt", "lastRenderAt", "imageUrl", "", "imageWidth", "imageHeight", "headshotImageUrl", "", "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJson;", "styles", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "accessories", "shareImageUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SnoovatarJson
{
    public final String a;
    public final String b;
    public final Double c;
    public final Double d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final Map<String, SnoovatarStyleJson> i;
    public final List<AccessoryJson> j;
    public final String k;
    
    public SnoovatarJson(final String a, @n(name = "account_id") final String b, @n(name = "last_update_at") final Double c, @n(name = "last_render_at") final Double d, @n(name = "image_url") final String e, @n(name = "image_width") final Integer f, @n(name = "image_height") final Integer g, @n(name = "headshot_image_url") final String h, final Map<String, SnoovatarStyleJson> i, final List<AccessoryJson> j, @n(name = "shared_image_url") final String k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final SnoovatarJson copy(final String s, @n(name = "account_id") final String s2, @n(name = "last_update_at") final Double n, @n(name = "last_render_at") final Double n2, @n(name = "image_url") final String s3, @n(name = "image_width") final Integer n3, @n(name = "image_height") final Integer n4, @n(name = "headshot_image_url") final String s4, final Map<String, SnoovatarStyleJson> map, final List<AccessoryJson> list, @n(name = "shared_image_url") final String s5) {
        return new SnoovatarJson(s, s2, n, n2, s3, n3, n4, s4, map, list, s5);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnoovatarJson)) {
            return false;
        }
        final SnoovatarJson snoovatarJson = (SnoovatarJson)o;
        return ah2.f.a((Object)this.a, (Object)snoovatarJson.a) && ah2.f.a((Object)this.b, (Object)snoovatarJson.b) && ah2.f.a((Object)this.c, (Object)snoovatarJson.c) && ah2.f.a((Object)this.d, (Object)snoovatarJson.d) && ah2.f.a((Object)this.e, (Object)snoovatarJson.e) && ah2.f.a((Object)this.f, (Object)snoovatarJson.f) && ah2.f.a((Object)this.g, (Object)snoovatarJson.g) && ah2.f.a((Object)this.h, (Object)snoovatarJson.h) && ah2.f.a((Object)this.i, (Object)snoovatarJson.i) && ah2.f.a((Object)this.j, (Object)snoovatarJson.j) && ah2.f.a((Object)this.k, (Object)snoovatarJson.k);
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
        final Double c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Double d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Integer f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Map<String, SnoovatarStyleJson> i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final List<AccessoryJson> j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return (((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SnoovatarJson(id=");
        k.append(this.a);
        k.append(", accountKindWithId=");
        k.append(this.b);
        k.append(", lastUpdateAt=");
        k.append(this.c);
        k.append(", lastRenderAt=");
        k.append(this.d);
        k.append(", imageUrl=");
        k.append(this.e);
        k.append(", imageWidth=");
        k.append(this.f);
        k.append(", imageHeight=");
        k.append(this.g);
        k.append(", headshotImageUrl=");
        k.append(this.h);
        k.append(", styles=");
        k.append(this.i);
        k.append(", accessories=");
        k.append(this.j);
        k.append(", shareImageUrl=");
        return b.k(k, this.k, ')');
    }
}
