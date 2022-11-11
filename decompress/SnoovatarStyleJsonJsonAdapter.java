// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/SnoovatarStyleJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SnoovatarStyleJsonJsonAdapter extends JsonAdapter<SnoovatarStyleJson>
{
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SnoovatarStyleJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "fill" });
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "fill");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    continue;
                }
                s = (String)this.stringAdapter.fromJson(jsonReader);
                if (s != null) {
                    continue;
                }
                throw a.n("fill", "fill", jsonReader);
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s != null) {
            return new SnoovatarStyleJson(s);
        }
        throw a.h("fill", "fill", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final SnoovatarStyleJson snoovatarStyleJson = (SnoovatarStyleJson)o;
        f.f((Object)x, "writer");
        if (snoovatarStyleJson != null) {
            x.h();
            x.w("fill");
            this.stringAdapter.toJson(x, (Object)snoovatarStyleJson.a);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(SnoovatarStyleJson)";
    }
}
