// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccessoryAssetsJsonJsonAdapter extends JsonAdapter<AccessoryAssetsJson>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccessoryAssetsJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "accessory_id", "image_url", "slot" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "slot");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Integer n;
        Serializable s2 = n = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n != null) {
                            continue;
                        }
                        throw a.n("slot", "slot", jsonReader);
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("imageUrl", "image_url", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "accessory_id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "accessory_id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("imageUrl", "image_url", jsonReader);
        }
        if (n != null) {
            return new AccessoryAssetsJson(s, (String)s2, n);
        }
        throw a.h("slot", "slot", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final AccessoryAssetsJson accessoryAssetsJson = (AccessoryAssetsJson)o;
        f.f((Object)x, "writer");
        if (accessoryAssetsJson != null) {
            x.h();
            x.w("accessory_id");
            this.stringAdapter.toJson(x, (Object)accessoryAssetsJson.a);
            x.w("image_url");
            this.stringAdapter.toJson(x, (Object)accessoryAssetsJson.b);
            x.w("slot");
            ag0.a.t(accessoryAssetsJson.c, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AccessoryAssetsJson)";
    }
}
