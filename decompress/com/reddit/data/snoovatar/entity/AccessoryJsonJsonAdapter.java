// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import androidx.viewpager.widget.c;
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
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccessoryJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableStringAdapter", "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJson;", "listOfAccessoryAssetsJsonAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccessoryJsonJsonAdapter extends JsonAdapter<AccessoryJson>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<AccessoryAssetsJson>> listOfAccessoryAssetsJsonAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccessoryJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "section_id", "customizable_classes", "capability_required", "state", "assets", "tags", "available_for_closet" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "customizableClasses");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "capabilityRequired");
        this.listOfAccessoryAssetsJsonAdapter = (JsonAdapter<List<AccessoryAssetsJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { AccessoryAssetsJson.class }), (Set)instance, "assets");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "availableForCloset");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        while (jsonReader.hasNext()) {
            Object o8 = null;
            Boolean b3 = null;
            Label_0365: {
                Label_0362: {
                    switch (jsonReader.F(this.options)) {
                        case 7: {
                            final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b2 != null) {
                                o8 = o4;
                                b3 = b2;
                                break Label_0365;
                            }
                            throw a.n("availableForCloset", "available_for_closet", jsonReader);
                        }
                        case 6: {
                            o7 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o7 != null) {
                                o8 = o4;
                                b3 = b;
                                break Label_0365;
                            }
                            throw a.n("tags", "tags", jsonReader);
                        }
                        case 5: {
                            o6 = this.listOfAccessoryAssetsJsonAdapter.fromJson(jsonReader);
                            if (o6 != null) {
                                o8 = o4;
                                b3 = b;
                                break Label_0365;
                            }
                            throw a.n("assets", "assets", jsonReader);
                        }
                        case 4: {
                            o5 = this.stringAdapter.fromJson(jsonReader);
                            if (o5 != null) {
                                continue;
                            }
                            throw a.n("state", "state", jsonReader);
                        }
                        case 3: {
                            o8 = this.nullableStringAdapter.fromJson(jsonReader);
                            break Label_0362;
                        }
                        case 2: {
                            o3 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                break;
                            }
                            throw a.n("customizableClasses", "customizable_classes", jsonReader);
                        }
                        case 1: {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                break;
                            }
                            throw a.n("sectionId", "section_id", jsonReader);
                        }
                        case 0: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                break;
                            }
                            throw a.n("id", "id", jsonReader);
                        }
                        case -1: {
                            jsonReader.J();
                            jsonReader.z1();
                            break;
                        }
                    }
                    o8 = o4;
                }
                b3 = b;
            }
            b = b3;
            o4 = o8;
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o2 == null) {
            throw a.h("sectionId", "section_id", jsonReader);
        }
        if (o3 == null) {
            throw a.h("customizableClasses", "customizable_classes", jsonReader);
        }
        if (o5 == null) {
            throw a.h("state", "state", jsonReader);
        }
        if (o6 == null) {
            throw a.h("assets", "assets", jsonReader);
        }
        if (o7 == null) {
            throw a.h("tags", "tags", jsonReader);
        }
        if (b != null) {
            return new AccessoryJson((String)o, (String)o2, (List<String>)o3, (String)o4, (String)o5, (List<AccessoryAssetsJson>)o6, (List<String>)o7, b);
        }
        throw a.h("availableForCloset", "available_for_closet", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final AccessoryJson accessoryJson = (AccessoryJson)o;
        f.f((Object)x, "writer");
        if (accessoryJson != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)accessoryJson.a);
            x.w("section_id");
            this.stringAdapter.toJson(x, (Object)accessoryJson.b);
            x.w("customizable_classes");
            this.listOfStringAdapter.toJson(x, (Object)accessoryJson.c);
            x.w("capability_required");
            this.nullableStringAdapter.toJson(x, (Object)accessoryJson.d);
            x.w("state");
            this.stringAdapter.toJson(x, (Object)accessoryJson.e);
            x.w("assets");
            this.listOfAccessoryAssetsJsonAdapter.toJson(x, (Object)accessoryJson.f);
            x.w("tags");
            this.listOfStringAdapter.toJson(x, (Object)accessoryJson.g);
            x.w("available_for_closet");
            c.u(accessoryJson.h, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AccessoryJson)";
    }
}
