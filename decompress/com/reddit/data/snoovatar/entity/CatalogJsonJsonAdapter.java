// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import qd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\t¨\u0006\u001a" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CatalogJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/CatalogJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/data/snoovatar/entity/CategoryJson;", "listOfCategoryJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "mapOfStringListOfAccessoryJsonAdapter", "Lcom/reddit/data/snoovatar/entity/RunwayJson;", "nullableListOfRunwayJsonAdapter", "Lcom/reddit/data/snoovatar/entity/ClosetJson;", "nullableClosetJsonAdapter", "Lcom/reddit/data/snoovatar/entity/OutfitJson;", "nullableListOfOutfitJsonAdapter", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "nullableListOfSnoovatarJsonAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CatalogJsonJsonAdapter extends JsonAdapter<CatalogJson>
{
    private final JsonAdapter<List<CategoryJson>> listOfCategoryJsonAdapter;
    private final JsonAdapter<Map<String, List<AccessoryJson>>> mapOfStringListOfAccessoryJsonAdapter;
    private final JsonAdapter<ClosetJson> nullableClosetJsonAdapter;
    private final JsonAdapter<List<OutfitJson>> nullableListOfOutfitJsonAdapter;
    private final JsonAdapter<List<RunwayJson>> nullableListOfRunwayJsonAdapter;
    private final JsonAdapter<List<SnoovatarJson>> nullableListOfSnoovatarJsonAdapter;
    private final JsonReader$b options;
    
    public CatalogJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "categories", "accessories", "runways", "closet", "outfits", "past_avatars" });
        final a$b d = a0.d((Class)List.class, new Type[] { CategoryJson.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfCategoryJsonAdapter = (JsonAdapter<List<CategoryJson>>)y.c((Type)d, (Set)instance, "categories");
        this.mapOfStringListOfAccessoryJsonAdapter = (JsonAdapter<Map<String, List<AccessoryJson>>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, (Type)a0.d((Class)List.class, new Type[] { AccessoryJson.class }) }), (Set)instance, "accessories");
        this.nullableListOfRunwayJsonAdapter = (JsonAdapter<List<RunwayJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { RunwayJson.class }), (Set)instance, "runways");
        this.nullableClosetJsonAdapter = (JsonAdapter<ClosetJson>)y.c((Type)ClosetJson.class, (Set)instance, "closet");
        this.nullableListOfOutfitJsonAdapter = (JsonAdapter<List<OutfitJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { OutfitJson.class }), (Set)instance, "outfits");
        this.nullableListOfSnoovatarJsonAdapter = (JsonAdapter<List<SnoovatarJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { SnoovatarJson.class }), (Set)instance, "pastAvatars");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o6 = this.nullableListOfSnoovatarJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o5 = this.nullableListOfOutfitJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o4 = this.nullableClosetJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o3 = this.nullableListOfRunwayJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o2 = this.mapOfStringListOfAccessoryJsonAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("accessories", "accessories", jsonReader);
                }
                case 0: {
                    o = this.listOfCategoryJsonAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("categories", "categories", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("categories", "categories", jsonReader);
        }
        if (o2 != null) {
            return new CatalogJson((List<CategoryJson>)o, (Map<String, ? extends List<AccessoryJson>>)o2, (List<RunwayJson>)o3, (ClosetJson)o4, (List<OutfitJson>)o5, (List<SnoovatarJson>)o6);
        }
        throw a.h("accessories", "accessories", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CatalogJson catalogJson = (CatalogJson)o;
        f.f((Object)x, "writer");
        if (catalogJson != null) {
            x.h();
            x.w("categories");
            this.listOfCategoryJsonAdapter.toJson(x, (Object)catalogJson.a);
            x.w("accessories");
            this.mapOfStringListOfAccessoryJsonAdapter.toJson(x, (Object)catalogJson.b);
            x.w("runways");
            this.nullableListOfRunwayJsonAdapter.toJson(x, (Object)catalogJson.c);
            x.w("closet");
            this.nullableClosetJsonAdapter.toJson(x, (Object)catalogJson.d);
            x.w("outfits");
            this.nullableListOfOutfitJsonAdapter.toJson(x, (Object)catalogJson.e);
            x.w("past_avatars");
            this.nullableListOfSnoovatarJsonAdapter.toJson(x, (Object)catalogJson.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CatalogJson)";
    }
}
