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

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e�\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e�\u0006\u0006\n\u0004\b\f\u0010\r�\u0006\u0012" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsQueryDescriptorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsQueryDescriptor;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsFilters;", "listingsFiltersAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsSort;", "nullableListingsSortAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ListingsQueryDescriptorJsonAdapter extends JsonAdapter<ListingsQueryDescriptor>
{
    private volatile Constructor<ListingsQueryDescriptor> constructorRef;
    private final JsonAdapter<ListingsFilters> listingsFiltersAdapter;
    private final JsonAdapter<ListingsSort> nullableListingsSortAdapter;
    private final JsonReader$b options;
    
    public ListingsQueryDescriptorJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "filters", "sort" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listingsFiltersAdapter = (JsonAdapter<ListingsFilters>)y.c((Type)ListingsFilters.class, (Set)instance, "filters");
        this.nullableListingsSortAdapter = (JsonAdapter<ListingsSort>)y.c((Type)ListingsSort.class, (Set)instance, "sort");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    o2 = this.nullableListingsSortAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                }
                else {
                    o = this.listingsFiltersAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("filters", "filters", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        ListingsQueryDescriptor listingsQueryDescriptor;
        if (n == -3) {
            if (o == null) {
                throw a.h("filters", "filters", jsonReader);
            }
            listingsQueryDescriptor = new ListingsQueryDescriptor((ListingsFilters)o, (ListingsSort)o2);
        }
        else {
            Constructor<ListingsQueryDescriptor> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = ListingsQueryDescriptor.class.getDeclaredConstructor(ListingsFilters.class, ListingsSort.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "ListingsQueryDescriptor:\u2026his.constructorRef = it }");
            }
            if (o == null) {
                throw a.h("filters", "filters", jsonReader);
            }
            final ListingsQueryDescriptor instance = constructorRef.newInstance(o, o2, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            listingsQueryDescriptor = instance;
        }
        return listingsQueryDescriptor;
    }
    
    public final void toJson(final x x, final Object o) {
        final ListingsQueryDescriptor listingsQueryDescriptor = (ListingsQueryDescriptor)o;
        f.f((Object)x, "writer");
        if (listingsQueryDescriptor != null) {
            x.h();
            x.w("filters");
            this.listingsFiltersAdapter.toJson(x, (Object)listingsQueryDescriptor.a);
            x.w("sort");
            this.nullableListingsSortAdapter.toJson(x, (Object)listingsQueryDescriptor.b);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ListingsQueryDescriptor)";
    }
}