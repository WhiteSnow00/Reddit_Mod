// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/CategoryDescriptorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/CategoryDescriptor;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsQueryDescriptor;", "listingsQueryDescriptorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategoryDescriptorJsonAdapter extends JsonAdapter<CategoryDescriptor>
{
    private volatile Constructor<CategoryDescriptor> constructorRef;
    private final JsonAdapter<ListingsQueryDescriptor> listingsQueryDescriptorAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CategoryDescriptorJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "subtitle", "description", "image", "data" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "image");
        this.listingsQueryDescriptorAdapter = (JsonAdapter<ListingsQueryDescriptor>)y.c((Type)ListingsQueryDescriptor.class, (Set)instance, "data");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o5 = this.listingsQueryDescriptorAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        continue;
                    }
                    throw a.n("data_", "data", jsonReader);
                }
                case 4: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("description", "description", jsonReader);
                }
                case 2: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("subtitle", "subtitle", jsonReader);
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("title", "title", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        CategoryDescriptor categoryDescriptor;
        if (n == -17) {
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (o2 == null) {
                throw a.h("subtitle", "subtitle", jsonReader);
            }
            if (o3 == null) {
                throw a.h("description", "description", jsonReader);
            }
            if (o5 == null) {
                throw a.h("data_", "data", jsonReader);
            }
            categoryDescriptor = new CategoryDescriptor(s, (String)o, (String)o2, (String)o3, (String)o4, (ListingsQueryDescriptor)o5);
        }
        else {
            final Constructor<CategoryDescriptor> constructorRef = this.constructorRef;
            Constructor<CategoryDescriptor> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = CategoryDescriptor.class.getDeclaredConstructor(clazz, clazz, clazz, clazz, clazz, ListingsQueryDescriptor.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "CategoryDescriptor::clas\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (o2 == null) {
                throw a.h("subtitle", "subtitle", jsonReader);
            }
            if (o3 == null) {
                throw a.h("description", "description", jsonReader);
            }
            if (o5 == null) {
                throw a.h("data_", "data", jsonReader);
            }
            final CategoryDescriptor instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            categoryDescriptor = instance;
        }
        return categoryDescriptor;
    }
    
    public final void toJson(final x x, final Object o) {
        final CategoryDescriptor categoryDescriptor = (CategoryDescriptor)o;
        f.f((Object)x, "writer");
        if (categoryDescriptor != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)categoryDescriptor.a);
            x.w("title");
            this.stringAdapter.toJson(x, (Object)categoryDescriptor.b);
            x.w("subtitle");
            this.stringAdapter.toJson(x, (Object)categoryDescriptor.c);
            x.w("description");
            this.stringAdapter.toJson(x, (Object)categoryDescriptor.d);
            x.w("image");
            this.nullableStringAdapter.toJson(x, (Object)categoryDescriptor.e);
            x.w("data");
            this.listingsQueryDescriptorAdapter.toJson(x, (Object)categoryDescriptor.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CategoryDescriptor)";
    }
}
