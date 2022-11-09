// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ak0.m;
import ah2.f;
import com.squareup.moshi.n;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jw\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002H\u00c6\u0001¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CatalogJson;", "", "", "Lcom/reddit/data/snoovatar/entity/CategoryJson;", "categories", "", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "accessories", "Lcom/reddit/data/snoovatar/entity/RunwayJson;", "runways", "Lcom/reddit/data/snoovatar/entity/ClosetJson;", "closet", "Lcom/reddit/data/snoovatar/entity/OutfitJson;", "outfits", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "pastAvatars", "copy", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/reddit/data/snoovatar/entity/ClosetJson;Ljava/util/List;Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CatalogJson
{
    public final List<CategoryJson> a;
    public final Map<String, List<AccessoryJson>> b;
    public final List<RunwayJson> c;
    public final ClosetJson d;
    public final List<OutfitJson> e;
    public final List<SnoovatarJson> f;
    
    public CatalogJson(final List<CategoryJson> a, final Map<String, ? extends List<AccessoryJson>> b, final List<RunwayJson> c, final ClosetJson d, final List<OutfitJson> e, @n(name = "past_avatars") final List<SnoovatarJson> f) {
        ah2.f.f((Object)a, "categories");
        ah2.f.f((Object)b, "accessories");
        this.a = a;
        this.b = (Map<String, List<AccessoryJson>>)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final CatalogJson copy(final List<CategoryJson> list, final Map<String, ? extends List<AccessoryJson>> map, final List<RunwayJson> list2, final ClosetJson closetJson, final List<OutfitJson> list3, @n(name = "past_avatars") final List<SnoovatarJson> list4) {
        ah2.f.f((Object)list, "categories");
        ah2.f.f((Object)map, "accessories");
        return new CatalogJson(list, map, list2, closetJson, list3, list4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogJson)) {
            return false;
        }
        final CatalogJson catalogJson = (CatalogJson)o;
        return ah2.f.a((Object)this.a, (Object)catalogJson.a) && ah2.f.a((Object)this.b, (Object)catalogJson.b) && ah2.f.a((Object)this.c, (Object)catalogJson.c) && ah2.f.a((Object)this.d, (Object)catalogJson.d) && ah2.f.a((Object)this.e, (Object)catalogJson.e) && ah2.f.a((Object)this.f, (Object)catalogJson.f);
    }
    
    @Override
    public final int hashCode() {
        final int g = ak0.n.g((Map)this.b, this.a.hashCode() * 31, 31);
        final List<RunwayJson> c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final ClosetJson d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final List<OutfitJson> e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final List<SnoovatarJson> f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (((g + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CatalogJson(categories=");
        k.append(this.a);
        k.append(", accessories=");
        k.append(this.b);
        k.append(", runways=");
        k.append(this.c);
        k.append(", closet=");
        k.append(this.d);
        k.append(", outfits=");
        k.append(this.e);
        k.append(", pastAvatars=");
        return m.n(k, (List)this.f, ')');
    }
}
