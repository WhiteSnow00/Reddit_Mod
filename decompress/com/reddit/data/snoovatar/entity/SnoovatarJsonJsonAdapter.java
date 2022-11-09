// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0017" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SnoovatarJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "", "nullableIntAdapter", "", "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJson;", "nullableMapOfStringSnoovatarStyleJsonAdapter", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "nullableListOfAccessoryJsonAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SnoovatarJsonJsonAdapter extends JsonAdapter<SnoovatarJson>
{
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<AccessoryJson>> nullableListOfAccessoryJsonAdapter;
    private final JsonAdapter<Map<String, SnoovatarStyleJson>> nullableMapOfStringSnoovatarStyleJsonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SnoovatarJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "account_id", "last_update_at", "last_render_at", "image_url", "image_width", "image_height", "headshot_image_url", "styles", "accessories", "shared_image_url" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableDoubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.class, (Set)instance, "lastUpdateAt");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "imageWidth");
        this.nullableMapOfStringSnoovatarStyleJsonAdapter = (JsonAdapter<Map<String, SnoovatarStyleJson>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, SnoovatarStyleJson.class }), (Set)instance, "styles");
        this.nullableListOfAccessoryJsonAdapter = (JsonAdapter<List<AccessoryJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { AccessoryJson.class }), (Set)instance, "accessories");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
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
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o10 = this.nullableListOfAccessoryJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o9 = this.nullableMapOfStringSnoovatarStyleJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o7 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o6 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o4 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o3 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
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
        return new SnoovatarJson((String)o, (String)o2, (Double)o3, (Double)o4, (String)o5, (Integer)o6, (Integer)o7, (String)o8, (Map<String, SnoovatarStyleJson>)o9, (List<AccessoryJson>)o10, (String)o11);
    }
    
    public final void toJson(final x x, final Object o) {
        final SnoovatarJson snoovatarJson = (SnoovatarJson)o;
        f.f((Object)x, "writer");
        if (snoovatarJson != null) {
            x.h();
            x.w("id");
            this.nullableStringAdapter.toJson(x, (Object)snoovatarJson.a);
            x.w("account_id");
            this.nullableStringAdapter.toJson(x, (Object)snoovatarJson.b);
            x.w("last_update_at");
            this.nullableDoubleAdapter.toJson(x, (Object)snoovatarJson.c);
            x.w("last_render_at");
            this.nullableDoubleAdapter.toJson(x, (Object)snoovatarJson.d);
            x.w("image_url");
            this.nullableStringAdapter.toJson(x, (Object)snoovatarJson.e);
            x.w("image_width");
            this.nullableIntAdapter.toJson(x, (Object)snoovatarJson.f);
            x.w("image_height");
            this.nullableIntAdapter.toJson(x, (Object)snoovatarJson.g);
            x.w("headshot_image_url");
            this.nullableStringAdapter.toJson(x, (Object)snoovatarJson.h);
            x.w("styles");
            this.nullableMapOfStringSnoovatarStyleJsonAdapter.toJson(x, (Object)snoovatarJson.i);
            x.w("accessories");
            this.nullableListOfAccessoryJsonAdapter.toJson(x, (Object)snoovatarJson.j);
            x.w("shared_image_url");
            this.nullableStringAdapter.toJson(x, (Object)snoovatarJson.k);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(SnoovatarJson)";
    }
}
