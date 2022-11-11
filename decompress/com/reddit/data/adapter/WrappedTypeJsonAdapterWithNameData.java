// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.x;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.util.Map;
import com.squareup.moshi.JsonReader;
import sg2.e;
import java.lang.reflect.Type;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonAdapter$e;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/reddit/data/adapter/WrappedTypeJsonAdapterWithNameData;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/x;", "writer", "value", "Lhg2/j;", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/moshi/y;", "moshi", "Lcom/squareup/moshi/y;", "Lcom/squareup/moshi/JsonAdapter$e;", "factory", "Lcom/squareup/moshi/JsonAdapter$e;", "Ljava/lang/reflect/Type;", "type", "Ljava/lang/reflect/Type;", "", "wrappedFieldName", "Ljava/lang/String;", "<init>", "(Lcom/squareup/moshi/y;Lcom/squareup/moshi/JsonAdapter$e;Ljava/lang/reflect/Type;Ljava/lang/String;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public class WrappedTypeJsonAdapterWithNameData<T> extends JsonAdapter<T>
{
    private final JsonAdapter$e factory;
    private final y moshi;
    private final Type type;
    private final String wrappedFieldName;
    
    public WrappedTypeJsonAdapterWithNameData(final y moshi, final JsonAdapter$e factory, final Type type, final String wrappedFieldName) {
        e.f((Object)moshi, "moshi");
        e.f((Object)factory, "factory");
        e.f((Object)type, "type");
        e.f((Object)wrappedFieldName, "wrappedFieldName");
        this.moshi = moshi;
        this.factory = factory;
        this.type = type;
        this.wrappedFieldName = wrappedFieldName;
    }
    
    public T fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        final Map map = (Map)this.moshi.b((Type)a0.d((Class)Map.class, new Type[] { String.class, Object.class })).fromJson(jsonReader);
        if (map == null) {
            return null;
        }
        Map map2 = map;
        if (map.containsKey(this.wrappedFieldName)) {
            final Object value = map.get(this.wrappedFieldName);
            e.d(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            map2 = (Map)value;
        }
        return (T)this.moshi.e(this.factory, this.type, (Set)EmptySet.INSTANCE).fromJsonValue((Object)map2);
    }
    
    public void toJson(final x x, final T t) {
        e.f((Object)x, "writer");
    }
}
