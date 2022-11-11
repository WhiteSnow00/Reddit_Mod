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
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/snoovatar/entity/RunwayJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/RunwayJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/data/snoovatar/entity/RunwayItemJson;", "listOfRunwayItemJsonAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class RunwayJsonJsonAdapter extends JsonAdapter<RunwayJson>
{
    private final JsonAdapter<List<RunwayItemJson>> listOfRunwayItemJsonAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RunwayJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "items" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfRunwayItemJsonAdapter = (JsonAdapter<List<RunwayItemJson>>)y.c((Type)a0.d((Class)List.class, new Type[] { RunwayItemJson.class }), (Set)instance, "items");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        o2 = this.listOfRunwayItemJsonAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            continue;
                        }
                        throw a.n("items", "items", jsonReader);
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("title", "title", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (o2 != null) {
            return new RunwayJson(s, (String)o, (List<RunwayItemJson>)o2);
        }
        throw a.h("items", "items", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final RunwayJson runwayJson = (RunwayJson)o;
        f.f((Object)x, "writer");
        if (runwayJson != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)runwayJson.a);
            x.w("title");
            this.stringAdapter.toJson(x, (Object)runwayJson.b);
            x.w("items");
            this.listOfRunwayItemJsonAdapter.toJson(x, (Object)runwayJson.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(RunwayJson)";
    }
}
