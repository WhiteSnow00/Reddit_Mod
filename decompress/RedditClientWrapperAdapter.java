// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.z;
import com.squareup.moshi.x;
import com.squareup.moshi.m;
import sg2.k;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import com.squareup.moshi.JsonReader;
import java.util.Map;
import sg2.e;
import com.squareup.moshi.y;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0013\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/reddit/data/adapter/RedditClientWrapperAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "", "kind", "", "", "data", "", "entireObject", "parseObjectBasedOnKind", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/Object;", "item", "Ljava/lang/Class;", "clazz", "convertToSubclass", "(Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", "value", "Lhg2/j;", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "Lcom/squareup/moshi/y;", "moshi", "Lcom/squareup/moshi/y;", "<init>", "(Lcom/squareup/moshi/y;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class RedditClientWrapperAdapter<T> extends JsonAdapter<T>
{
    private final y moshi;
    
    public RedditClientWrapperAdapter(final y moshi) {
        e.f((Object)moshi, "moshi");
        this.moshi = moshi;
    }
    
    public final <T> T convertToSubclass(final Map<String, ?> map, final Class<T> clazz) {
        e.f((Object)map, "item");
        e.f((Object)clazz, "clazz");
        return (T)this.moshi.a((Class)clazz).fromJsonValue((Object)map);
    }
    
    @m
    public T fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        final Map map = (Map)this.moshi.b((Type)a0.d((Class)Map.class, new Type[] { String.class, Object.class })).fromJson(jsonReader);
        if (map == null) {
            return null;
        }
        final Object value = map.get("kind");
        e.d(value, "null cannot be cast to non-null type kotlin.String");
        final String s = (String)value;
        final Object value2 = map.get("data");
        e.d(value2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        return this.parseObjectBasedOnKind(s, k.c(value2), map);
    }
    
    public abstract T parseObjectBasedOnKind(final String p0, final Map<String, Object> p1, final Map<String, ?> p2);
    
    @z
    public void toJson(final x x, final T t) {
        e.f((Object)x, "writer");
    }
}
