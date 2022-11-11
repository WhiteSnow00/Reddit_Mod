// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

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
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsFiltersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsFilters;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "nullableListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsThemeFilter;", "nullableListingsThemeFilterAdapter", "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsStatusFilter;", "nullableListingsStatusFilterAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ListingsFiltersJsonAdapter extends JsonAdapter<ListingsFilters>
{
    private volatile Constructor<ListingsFilters> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<ListingsStatusFilter> nullableListingsStatusFilterAdapter;
    private final JsonAdapter<ListingsThemeFilter> nullableListingsThemeFilterAdapter;
    private final JsonReader$b options;
    
    public ListingsFiltersJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "ids", "artistIds", "theme", "status", "priceLowerBound", "priceUpperBound", "totalInventoryLowerBound", "totalInventoryUpperBound", "percentInventoryRemainingLowerBound", "percentInventoryRemainingUpperBound", "tags" });
        final a$b d = a0.d((Class)List.class, new Type[] { String.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)d, (Set)instance, "ids");
        this.nullableListingsThemeFilterAdapter = (JsonAdapter<ListingsThemeFilter>)y.c((Type)ListingsThemeFilter.class, (Set)instance, "theme");
        this.nullableListingsStatusFilterAdapter = (JsonAdapter<ListingsStatusFilter>)y.c((Type)ListingsStatusFilter.class, (Set)instance, "status");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "priceLowerBound");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        List<String> list = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    o10 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFBFF;
                    continue;
                }
                case 9: {
                    o9 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFDFF;
                    continue;
                }
                case 8: {
                    o8 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o7 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o6 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o5 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableListingsStatusFilterAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableListingsThemeFilterAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    list = (List)this.nullableListOfStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        ListingsFilters listingsFilters;
        if (n == -2048) {
            listingsFilters = new ListingsFilters(list, (List<String>)o, (ListingsThemeFilter)o2, (ListingsStatusFilter)o3, (Integer)o4, (Integer)o5, (Integer)o6, (Integer)o7, (Integer)o8, (Integer)o9, (List<String>)o10);
        }
        else {
            Constructor<ListingsFilters> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = ListingsFilters.class.getDeclaredConstructor(List.class, List.class, ListingsThemeFilter.class, ListingsStatusFilter.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, List.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "ListingsFilters::class.j\u2026his.constructorRef = it }");
            }
            final ListingsFilters instance = constructorRef.newInstance(list, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            listingsFilters = instance;
        }
        return listingsFilters;
    }
    
    public final void toJson(final x x, final Object o) {
        final ListingsFilters listingsFilters = (ListingsFilters)o;
        f.f((Object)x, "writer");
        if (listingsFilters != null) {
            x.h();
            x.w("ids");
            this.nullableListOfStringAdapter.toJson(x, (Object)listingsFilters.a);
            x.w("artistIds");
            this.nullableListOfStringAdapter.toJson(x, (Object)listingsFilters.b);
            x.w("theme");
            this.nullableListingsThemeFilterAdapter.toJson(x, (Object)listingsFilters.c);
            x.w("status");
            this.nullableListingsStatusFilterAdapter.toJson(x, (Object)listingsFilters.d);
            x.w("priceLowerBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.e);
            x.w("priceUpperBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.f);
            x.w("totalInventoryLowerBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.g);
            x.w("totalInventoryUpperBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.h);
            x.w("percentInventoryRemainingLowerBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.i);
            x.w("percentInventoryRemainingUpperBound");
            this.nullableIntAdapter.toJson(x, (Object)listingsFilters.j);
            x.w("tags");
            this.nullableListOfStringAdapter.toJson(x, (Object)listingsFilters.k);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ListingsFilters)";
    }
}
