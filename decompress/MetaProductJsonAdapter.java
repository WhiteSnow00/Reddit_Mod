// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

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
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR.\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\b¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/meta/model/MetaProductJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaProduct;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaCommunityCurrency;", "metaCommunityCurrencyAdapter", "", "nullableLongAdapter", "nullableStringAdapter", "", "", "nullableListOfMapOfStringStringAdapter", "Lcom/reddit/domain/meta/model/MetaImage;", "mapOfStringMetaImageAdapter", "", "nullableIntAdapter", "listOfStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaProductJsonAdapter extends JsonAdapter<MetaProduct>
{
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, MetaImage>> mapOfStringMetaImageAdapter;
    private final JsonAdapter<MetaCommunityCurrency> metaCommunityCurrencyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Map<String, String>>> nullableListOfMapOfStringStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MetaProductJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "subredditId", "type", "currency", "endsAt", "description", "media", "placement", "styleColor", "emoteImages", "position", "collectionTitles" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.metaCommunityCurrencyAdapter = (JsonAdapter<MetaCommunityCurrency>)y.c((Type)MetaCommunityCurrency.class, (Set)instance, "currency");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "endsAt");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "description");
        this.nullableListOfMapOfStringStringAdapter = (JsonAdapter<List<Map<String, String>>>)y.c((Type)a0.d((Class)List.class, new Type[] { (Type)a0.d((Class)Map.class, new Type[] { String.class, String.class }) }), (Set)instance, "media");
        this.mapOfStringMetaImageAdapter = (JsonAdapter<Map<String, MetaImage>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, MetaImage.class }), (Set)instance, "emoteImages");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "position");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "collectionTitles");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
        Object o2;
        String s = (String)(o2 = o);
        Object o3;
        String s2 = (String)(o3 = o2);
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        Object o11;
        Object o10 = o11 = o9;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 12: {
                    o11 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o11 != null) {
                        continue;
                    }
                    throw a.n("collectionTitles", "collectionTitles", jsonReader);
                }
                case 11: {
                    o10 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o9 = this.mapOfStringMetaImageAdapter.fromJson(jsonReader);
                    if (o9 != null) {
                        continue;
                    }
                    throw a.n("emoteImages", "emoteImages", jsonReader);
                }
                case 9: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o6 = this.nullableListOfMapOfStringStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o4 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o3 = this.metaCommunityCurrencyAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("currency", "currency", jsonReader);
                }
                case 3: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 2: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subredditId", jsonReader);
                }
                case 1: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("title", "title", jsonReader);
                }
                case 0: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
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
        if (o == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (o2 == null) {
            throw a.h("subredditId", "subredditId", jsonReader);
        }
        if (s2 == null) {
            throw a.h("type", "type", jsonReader);
        }
        if (o3 == null) {
            throw a.h("currency", "currency", jsonReader);
        }
        if (o9 == null) {
            throw a.h("emoteImages", "emoteImages", jsonReader);
        }
        if (o11 != null) {
            return new MetaProduct((String)o, s, (String)o2, s2, (MetaCommunityCurrency)o3, (Long)o4, (String)o5, (List)o6, (String)o7, (String)o8, (Map)o9, (Integer)o10, (List)o11);
        }
        throw a.h("collectionTitles", "collectionTitles", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final MetaProduct metaProduct = (MetaProduct)o;
        f.f((Object)x, "writer");
        if (metaProduct != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)metaProduct.f);
            x.w("title");
            this.stringAdapter.toJson(x, (Object)metaProduct.g);
            x.w("subredditId");
            this.stringAdapter.toJson(x, (Object)metaProduct.h);
            x.w("type");
            this.stringAdapter.toJson(x, (Object)metaProduct.i);
            x.w("currency");
            this.metaCommunityCurrencyAdapter.toJson(x, (Object)metaProduct.j);
            x.w("endsAt");
            this.nullableLongAdapter.toJson(x, (Object)metaProduct.k);
            x.w("description");
            this.nullableStringAdapter.toJson(x, (Object)metaProduct.l);
            x.w("media");
            this.nullableListOfMapOfStringStringAdapter.toJson(x, (Object)metaProduct.m);
            x.w("placement");
            this.nullableStringAdapter.toJson(x, (Object)metaProduct.n);
            x.w("styleColor");
            this.nullableStringAdapter.toJson(x, (Object)metaProduct.o);
            x.w("emoteImages");
            this.mapOfStringMetaImageAdapter.toJson(x, (Object)metaProduct.p);
            x.w("position");
            this.nullableIntAdapter.toJson(x, (Object)metaProduct.q);
            x.w("collectionTitles");
            this.listOfStringAdapter.toJson(x, (Object)metaProduct.r);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MetaProduct)";
    }
}
