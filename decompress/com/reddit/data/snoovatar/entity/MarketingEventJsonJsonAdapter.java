// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/snoovatar/entity/MarketingEventJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/MarketingEventJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MarketingEventJsonJsonAdapter extends JsonAdapter<MarketingEventJson>
{
    private volatile Constructor<MarketingEventJson> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MarketingEventJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "starts_at", "ends_at", "name", "text", "tags", "mobile_asset_urls" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "startsAt");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "endsAt");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "tags");
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
                    o5 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        continue;
                    }
                    throw a.n("mobileAssetUrls", "mobile_asset_urls", jsonReader);
                }
                case 4: {
                    o4 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("tags", "tags", jsonReader);
                }
                case 3: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("text", "text", jsonReader);
                }
                case 2: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
                case 1: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("startsAt", "starts_at", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        MarketingEventJson marketingEventJson;
        if (n == -3) {
            if (s == null) {
                throw a.h("startsAt", "starts_at", jsonReader);
            }
            if (o2 == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (o3 == null) {
                throw a.h("text", "text", jsonReader);
            }
            if (o4 == null) {
                throw a.h("tags", "tags", jsonReader);
            }
            if (o5 == null) {
                throw a.h("mobileAssetUrls", "mobile_asset_urls", jsonReader);
            }
            marketingEventJson = new MarketingEventJson(s, (String)o, (String)o2, (String)o3, (List<String>)o4, (List<String>)o5);
        }
        else {
            final Constructor<MarketingEventJson> constructorRef = this.constructorRef;
            Constructor<MarketingEventJson> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = MarketingEventJson.class.getDeclaredConstructor(clazz, clazz, clazz, clazz, List.class, List.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "MarketingEventJson::clas\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("startsAt", "starts_at", jsonReader);
            }
            if (o2 == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (o3 == null) {
                throw a.h("text", "text", jsonReader);
            }
            if (o4 == null) {
                throw a.h("tags", "tags", jsonReader);
            }
            if (o5 == null) {
                throw a.h("mobileAssetUrls", "mobile_asset_urls", jsonReader);
            }
            final MarketingEventJson instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            marketingEventJson = instance;
        }
        return marketingEventJson;
    }
    
    public final void toJson(final x x, final Object o) {
        final MarketingEventJson marketingEventJson = (MarketingEventJson)o;
        f.f((Object)x, "writer");
        if (marketingEventJson != null) {
            x.h();
            x.w("starts_at");
            this.stringAdapter.toJson(x, (Object)marketingEventJson.a);
            x.w("ends_at");
            this.nullableStringAdapter.toJson(x, (Object)marketingEventJson.b);
            x.w("name");
            this.stringAdapter.toJson(x, (Object)marketingEventJson.c);
            x.w("text");
            this.stringAdapter.toJson(x, (Object)marketingEventJson.d);
            x.w("tags");
            this.listOfStringAdapter.toJson(x, (Object)marketingEventJson.e);
            x.w("mobile_asset_urls");
            this.listOfStringAdapter.toJson(x, (Object)marketingEventJson.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MarketingEventJson)";
    }
}
