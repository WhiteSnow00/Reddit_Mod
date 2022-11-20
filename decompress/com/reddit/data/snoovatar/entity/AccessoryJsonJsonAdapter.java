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

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccessoryJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableStringAdapter", "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJson;", "listOfAccessoryAssetsJsonAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccessoryJsonJsonAdapter extends JsonAdapter<AccessoryJson>
{
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<AccessoryAssetsJson>> listOfAccessoryAssetsJsonAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccessoryJsonJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "section_id", "customizable_classes", "capability_required", "state", "assets", "tags", "available_for_closet" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "customizableClasses");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "capabilityRequired");
        this.listOfAccessoryAssetsJsonAdapter = (JsonAdapter<List<AccessoryAssetsJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { AccessoryAssetsJson.class }), (Set)instance, "assets");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "availableForCloset");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        String s = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        while (jsonReader.hasNext()) {
            Object o7 = null;
            Boolean b3 = null;
            Label_0359: {
                Label_0356: {
                    switch (jsonReader.E(this.options)) {
                        case 7: {
                            final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b2 != null) {
                                o7 = o3;
                                b3 = b2;
                                break Label_0359;
                            }
                            throw a.n("availableForCloset", "available_for_closet", jsonReader);
                        }
                        case 6: {
                            o6 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o6 != null) {
                                o7 = o3;
                                b3 = b;
                                break Label_0359;
                            }
                            throw a.n("tags", "tags", jsonReader);
                        }
                        case 5: {
                            o5 = this.listOfAccessoryAssetsJsonAdapter.fromJson(jsonReader);
                            if (o5 != null) {
                                o7 = o3;
                                b3 = b;
                                break Label_0359;
                            }
                            throw a.n("assets", "assets", jsonReader);
                        }
                        case 4: {
                            o4 = this.stringAdapter.fromJson(jsonReader);
                            if (o4 != null) {
                                continue;
                            }
                            throw a.n("state", "state", jsonReader);
                        }
                        case 3: {
                            o7 = this.nullableStringAdapter.fromJson(jsonReader);
                            break Label_0356;
                        }
                        case 2: {
                            o2 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                break;
                            }
                            throw a.n("customizableClasses", "customizable_classes", jsonReader);
                        }
                        case 1: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                break;
                            }
                            throw a.n("sectionId", "section_id", jsonReader);
                        }
                        case 0: {
                            s = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s != null) {
                                break;
                            }
                            throw a.n("id", "id", jsonReader);
                        }
                        case -1: {
                            jsonReader.H();
                            jsonReader.G1();
                            break;
                        }
                    }
                    o7 = o3;
                }
                b3 = b;
            }
            b = b3;
            o3 = o7;
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o == null) {
            throw a.h("sectionId", "section_id", jsonReader);
        }
        if (o2 == null) {
            throw a.h("customizableClasses", "customizable_classes", jsonReader);
        }
        if (o4 == null) {
            throw a.h("state", "state", jsonReader);
        }
        if (o5 == null) {
            throw a.h("assets", "assets", jsonReader);
        }
        if (o6 == null) {
            throw a.h("tags", "tags", jsonReader);
        }
        if (b != null) {
            return new AccessoryJson(s, (String)o, (List)o2, (String)o3, (String)o4, (List)o5, (List)o6, (boolean)b);
        }
        throw a.h("availableForCloset", "available_for_closet", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final AccessoryJson accessoryJson = (AccessoryJson)o;
        e.f((Object)x, "writer");
        if (accessoryJson != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)accessoryJson.a);
            x.v("section_id");
            this.stringAdapter.toJson(x, (Object)accessoryJson.b);
            x.v("customizable_classes");
            this.listOfStringAdapter.toJson(x, (Object)accessoryJson.c);
            x.v("capability_required");
            this.nullableStringAdapter.toJson(x, (Object)accessoryJson.d);
            x.v("state");
            this.stringAdapter.toJson(x, (Object)accessoryJson.e);
            x.v("assets");
            this.listOfAccessoryAssetsJsonAdapter.toJson(x, (Object)accessoryJson.f);
            x.v("tags");
            this.listOfStringAdapter.toJson(x, (Object)accessoryJson.g);
            x.v("available_for_closet");
            b.A(accessoryJson.h, (JsonAdapter)this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AccessoryJson)";
    }
}
