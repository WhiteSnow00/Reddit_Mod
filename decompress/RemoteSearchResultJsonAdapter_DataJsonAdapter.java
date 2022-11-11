// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import id2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR,\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u001a" }, d2 = { "Lcom/reddit/data/adapter/RemoteSearchResultJsonAdapter_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/adapter/RemoteSearchResultJsonAdapter$Data;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "", "", "listOfMapOfStringAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class RemoteSearchResultJsonAdapter_DataJsonAdapter extends JsonAdapter<RemoteSearchResultJsonAdapter$Data>
{
    private final JsonAdapter<List<Map<String, Object>>> listOfMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public RemoteSearchResultJsonAdapter_DataJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "children", "after" });
        final a$b d = a0.d((Class)List.class, new Type[] { (Type)a0.d((Class)Map.class, new Type[] { String.class, Object.class }) });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfMapOfStringAnyAdapter = (JsonAdapter<List<Map<String, Object>>>)y.c((Type)d, (Set)instance, "children");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "after");
    }
    
    public RemoteSearchResultJsonAdapter$Data fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        List list = null;
        String s = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
                else {
                    list = (List)this.listOfMapOfStringAnyAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("children", "children", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (list != null) {
            return new RemoteSearchResultJsonAdapter$Data(list, s);
        }
        throw a.h("children", "children", jsonReader);
    }
    
    public void toJson(final x x, final RemoteSearchResultJsonAdapter$Data remoteSearchResultJsonAdapter$Data) {
        e.f((Object)x, "writer");
        if (remoteSearchResultJsonAdapter$Data != null) {
            x.h();
            x.u("children");
            this.listOfMapOfStringAnyAdapter.toJson(x, (Object)remoteSearchResultJsonAdapter$Data.getChildren());
            x.u("after");
            this.nullableStringAdapter.toJson(x, (Object)remoteSearchResultJsonAdapter$Data.getAfter());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RemoteSearchResultJsonAdapter.Data)";
    }
}
