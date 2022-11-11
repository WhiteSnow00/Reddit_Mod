// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import androidx.viewpager.widget.c;
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
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SaveSnoovatarBodyJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/SaveSnoovatarBodyJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJson;", "mapOfStringSnoovatarStyleJsonAdapter", "", "booleanAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SaveSnoovatarBodyJsonJsonAdapter extends JsonAdapter<SaveSnoovatarBodyJson>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, SnoovatarStyleJson>> mapOfStringSnoovatarStyleJsonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SaveSnoovatarBodyJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "accessory_ids", "styles", "set_avatar_to_profile", "share", "download_avatar", "source", "source_author_id", "skip_telemetry" });
        final a$b d = a0.d((Class)List.class, new Type[] { String.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)d, (Set)instance, "accessoryIds");
        this.mapOfStringSnoovatarStyleJsonAdapter = (JsonAdapter<Map<String, SnoovatarStyleJson>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, SnoovatarStyleJson.class }), (Set)instance, "styles");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "setToProfile");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "source");
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
            Label_0344: {
                Label_0341: {
                    switch (jsonReader.F(this.options)) {
                        case 7: {
                            final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b2 != null) {
                                o8 = o6;
                                b3 = b2;
                                break Label_0344;
                            }
                            throw a.n("skipTelemetry", "skip_telemetry", jsonReader);
                        }
                        case 6: {
                            o7 = this.nullableStringAdapter.fromJson(jsonReader);
                            break;
                        }
                        case 5: {
                            o8 = this.nullableStringAdapter.fromJson(jsonReader);
                            break Label_0341;
                        }
                        case 4: {
                            o = this.booleanAdapter.fromJson(jsonReader);
                            if (o != null) {
                                o8 = o6;
                                b3 = b;
                                break Label_0344;
                            }
                            throw a.n("downloadAvatar", "download_avatar", jsonReader);
                        }
                        case 3: {
                            o2 = this.booleanAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                continue;
                            }
                            throw a.n("share", "share", jsonReader);
                        }
                        case 2: {
                            o3 = this.booleanAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                break;
                            }
                            throw a.n("setToProfile", "set_avatar_to_profile", jsonReader);
                        }
                        case 1: {
                            o5 = this.mapOfStringSnoovatarStyleJsonAdapter.fromJson(jsonReader);
                            if (o5 != null) {
                                break;
                            }
                            throw a.n("styles", "styles", jsonReader);
                        }
                        case 0: {
                            o4 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o4 != null) {
                                break;
                            }
                            throw a.n("accessoryIds", "accessory_ids", jsonReader);
                        }
                        case -1: {
                            jsonReader.J();
                            jsonReader.z1();
                            break;
                        }
                    }
                    o8 = o6;
                }
                b3 = b;
            }
            b = b3;
            o6 = o8;
        }
        jsonReader.r();
        if (o4 == null) {
            throw a.h("accessoryIds", "accessory_ids", jsonReader);
        }
        if (o5 == null) {
            throw a.h("styles", "styles", jsonReader);
        }
        if (o3 == null) {
            throw a.h("setToProfile", "set_avatar_to_profile", jsonReader);
        }
        final boolean booleanValue = (boolean)o3;
        if (o2 == null) {
            throw a.h("share", "share", jsonReader);
        }
        final boolean booleanValue2 = (boolean)o2;
        if (o == null) {
            throw a.h("downloadAvatar", "download_avatar", jsonReader);
        }
        final boolean booleanValue3 = (boolean)o;
        if (b != null) {
            return new SaveSnoovatarBodyJson((List<String>)o4, (Map<String, SnoovatarStyleJson>)o5, booleanValue, booleanValue2, booleanValue3, (String)o6, (String)o7, b);
        }
        throw a.h("skipTelemetry", "skip_telemetry", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final SaveSnoovatarBodyJson saveSnoovatarBodyJson = (SaveSnoovatarBodyJson)o;
        f.f((Object)x, "writer");
        if (saveSnoovatarBodyJson != null) {
            x.h();
            x.w("accessory_ids");
            this.listOfStringAdapter.toJson(x, (Object)saveSnoovatarBodyJson.a);
            x.w("styles");
            this.mapOfStringSnoovatarStyleJsonAdapter.toJson(x, (Object)saveSnoovatarBodyJson.b);
            x.w("set_avatar_to_profile");
            a.v(saveSnoovatarBodyJson.c, (JsonAdapter)this.booleanAdapter, x, "share");
            a.v(saveSnoovatarBodyJson.d, (JsonAdapter)this.booleanAdapter, x, "download_avatar");
            a.v(saveSnoovatarBodyJson.e, (JsonAdapter)this.booleanAdapter, x, "source");
            this.nullableStringAdapter.toJson(x, (Object)saveSnoovatarBodyJson.f);
            x.w("source_author_id");
            this.nullableStringAdapter.toJson(x, (Object)saveSnoovatarBodyJson.g);
            x.w("skip_telemetry");
            c.u(saveSnoovatarBodyJson.h, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(SaveSnoovatarBodyJson)";
    }
}
