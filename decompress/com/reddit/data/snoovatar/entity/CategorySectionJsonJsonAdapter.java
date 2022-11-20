// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\u000e" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CategorySectionJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/CategorySectionJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategorySectionJsonJsonAdapter extends JsonAdapter<CategorySectionJson>
{
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CategorySectionJsonJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "category_id", "color_picker_customizable_class" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "colorPickerCustomizableClass");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s2 = null;
        String s4;
        String s3 = s4 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                continue;
                            }
                            s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        }
                        else {
                            s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                continue;
                            }
                            throw a.n("categoryId", "category_id", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
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
        if (s2 == null) {
            throw a.h("name", "name", jsonReader);
        }
        if (s3 != null) {
            return new CategorySectionJson(s, s2, s3, s4);
        }
        throw a.h("categoryId", "category_id", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CategorySectionJson categorySectionJson = (CategorySectionJson)o;
        e.f((Object)x, "writer");
        if (categorySectionJson != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)categorySectionJson.a);
            x.v("name");
            this.stringAdapter.toJson(x, (Object)categorySectionJson.b);
            x.v("category_id");
            this.stringAdapter.toJson(x, (Object)categorySectionJson.c);
            x.v("color_picker_customizable_class");
            this.nullableStringAdapter.toJson(x, (Object)categorySectionJson.d);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CategorySectionJson)";
    }
}
