// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.model;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lcom/reddit/data/room/model/SpanTagsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/room/model/SpanTags;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "mutableMapOfStringStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "roomdb_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpanTagsJsonAdapter extends JsonAdapter<SpanTags>
{
    private final JsonAdapter<Map<String, String>> mutableMapOfStringStringAdapter;
    private final JsonReader$b options;
    
    public SpanTagsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "dict" });
        this.mutableMapOfStringStringAdapter = (JsonAdapter<Map<String, String>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, String.class }), (Set)EmptySet.INSTANCE, "dict");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Map map = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    continue;
                }
                map = (Map)this.mutableMapOfStringStringAdapter.fromJson(jsonReader);
                if (map != null) {
                    continue;
                }
                throw a.n("dict", "dict", jsonReader);
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (map != null) {
            return new SpanTags(map);
        }
        throw a.h("dict", "dict", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final SpanTags spanTags = (SpanTags)o;
        e.f((Object)x, "writer");
        if (spanTags != null) {
            x.h();
            x.v("dict");
            this.mutableMapOfStringStringAdapter.toJson(x, (Object)spanTags.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(SpanTags)";
    }
}
