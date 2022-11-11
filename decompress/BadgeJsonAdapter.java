// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import com.squareup.moshi.x;
import java.io.Serializable;
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

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f0\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/meta/model/BadgeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/Badge;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "", "listOfMapOfStringStringAdapter", "nullableListOfStringAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class BadgeJsonAdapter extends JsonAdapter<Badge>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<Map<String, String>>> listOfMapOfStringStringAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public BadgeJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "isOwned", "media", "selected", "subredditId", "title", "collectionIds", "firstCollectionTitle", "description", "endsAt", "placement", "position", "receivedAt", "styleColor", "userId", "type" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isOwned");
        this.listOfMapOfStringStringAdapter = (JsonAdapter<List<Map<String, String>>>)y.c((Type)a0.d((Class)List.class, new Type[] { (Type)a0.d((Class)Map.class, new Type[] { String.class, String.class }) }), (Set)instance, "media");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "collectionIds");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "firstCollectionTitle");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "endsAt");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Serializable s = null;
        Object o;
        Serializable s2 = (Serializable)(o = s);
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        Object o11;
        Object o10 = o11 = o9;
        Object o13;
        Object o12 = o13 = o11;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 15: {
                    o13 = this.stringAdapter.fromJson(jsonReader);
                    if (o13 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 14: {
                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 13: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 12: {
                    o10 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    o9 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o7 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o4 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("title", "title", jsonReader);
                }
                case 4: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subredditId", jsonReader);
                }
                case 3: {
                    s = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("selected", "selected", jsonReader);
                }
                case 2: {
                    o = this.listOfMapOfStringStringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("media", "media", jsonReader);
                }
                case 1: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("isOwned", "isOwned", jsonReader);
                }
                case 0: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
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
        if (s2 == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (b == null) {
            throw a.h("isOwned", "isOwned", jsonReader);
        }
        final boolean booleanValue = b;
        if (o == null) {
            throw a.h("media", "media", jsonReader);
        }
        if (s == null) {
            throw a.h("selected", "selected", jsonReader);
        }
        final boolean booleanValue2 = (boolean)s;
        if (o2 == null) {
            throw a.h("subredditId", "subredditId", jsonReader);
        }
        if (o3 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (o13 != null) {
            return new Badge((String)s2, booleanValue, (List)o, booleanValue2, (String)o2, (String)o3, (List)o4, (String)o5, (String)o6, (Long)o7, (String)o8, (Long)o9, (Long)o10, (String)o11, (String)o12, (String)o13);
        }
        throw a.h("type", "type", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final Badge badge = (Badge)o;
        f.f((Object)x, "writer");
        if (badge != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)badge.f);
            x.w("isOwned");
            a.v(badge.g, (JsonAdapter)this.booleanAdapter, x, "media");
            this.listOfMapOfStringStringAdapter.toJson(x, (Object)badge.h);
            x.w("selected");
            a.v(badge.i, (JsonAdapter)this.booleanAdapter, x, "subredditId");
            this.stringAdapter.toJson(x, (Object)badge.j);
            x.w("title");
            this.stringAdapter.toJson(x, (Object)badge.k);
            x.w("collectionIds");
            this.nullableListOfStringAdapter.toJson(x, (Object)badge.l);
            x.w("firstCollectionTitle");
            this.nullableStringAdapter.toJson(x, (Object)badge.m);
            x.w("description");
            this.nullableStringAdapter.toJson(x, (Object)badge.n);
            x.w("endsAt");
            this.nullableLongAdapter.toJson(x, (Object)badge.o);
            x.w("placement");
            this.nullableStringAdapter.toJson(x, (Object)badge.p);
            x.w("position");
            this.nullableLongAdapter.toJson(x, (Object)badge.q);
            x.w("receivedAt");
            this.nullableLongAdapter.toJson(x, (Object)badge.r);
            x.w("styleColor");
            this.nullableStringAdapter.toJson(x, (Object)badge.s);
            x.w("userId");
            this.nullableStringAdapter.toJson(x, (Object)badge.t);
            x.w("type");
            this.stringAdapter.toJson(x, (Object)badge.u);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Badge)";
    }
}
