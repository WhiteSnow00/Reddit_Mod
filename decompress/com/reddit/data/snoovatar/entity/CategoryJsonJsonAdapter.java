// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CategoryJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/CategoryJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/data/snoovatar/entity/CategorySectionJson;", "listOfCategorySectionJsonAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategoryJsonJsonAdapter extends JsonAdapter<CategoryJson>
{
    public static final int $stable = 8;
    private final JsonAdapter<List<CategorySectionJson>> listOfCategorySectionJsonAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CategoryJsonJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "icon_url", "icon_active_url", "sections" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfCategorySectionJsonAdapter = (JsonAdapter<List<CategorySectionJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { CategorySectionJson.class }), (Set)instance, "sections");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Object o2;
        Object o = o2 = null;
        Object o3;
        String s2 = (String)(o3 = o2);
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 4) {
                                    continue;
                                }
                                o3 = this.listOfCategorySectionJsonAdapter.fromJson(jsonReader);
                                if (o3 != null) {
                                    continue;
                                }
                                throw a.n("sections", "sections", jsonReader);
                            }
                            else {
                                s2 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s2 != null) {
                                    continue;
                                }
                                throw a.n("iconActiveUrl", "icon_active_url", jsonReader);
                            }
                        }
                        else {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                continue;
                            }
                            throw a.n("iconUrl", "icon_url", jsonReader);
                        }
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("name", "name", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o == null) {
            throw a.h("name", "name", jsonReader);
        }
        if (o2 == null) {
            throw a.h("iconUrl", "icon_url", jsonReader);
        }
        if (s2 == null) {
            throw a.h("iconActiveUrl", "icon_active_url", jsonReader);
        }
        if (o3 != null) {
            return new CategoryJson(s, (String)o, (String)o2, s2, (List)o3);
        }
        throw a.h("sections", "sections", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CategoryJson categoryJson = (CategoryJson)o;
        e.f((Object)x, "writer");
        if (categoryJson != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)categoryJson.a);
            x.v("name");
            this.stringAdapter.toJson(x, (Object)categoryJson.b);
            x.v("icon_url");
            this.stringAdapter.toJson(x, (Object)categoryJson.c);
            x.v("icon_active_url");
            this.stringAdapter.toJson(x, (Object)categoryJson.d);
            x.v("sections");
            this.listOfCategorySectionJsonAdapter.toJson(x, (Object)categoryJson.e);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CategoryJson)";
    }
}
