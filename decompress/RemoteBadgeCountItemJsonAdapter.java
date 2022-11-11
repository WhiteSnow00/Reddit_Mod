// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b" }, d2 = { "Lcom/reddit/data/adapter/RemoteBadgeCountItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/adapter/RemoteBadgeCountItem;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class RemoteBadgeCountItemJsonAdapter extends JsonAdapter<RemoteBadgeCountItem>
{
    private volatile Constructor<RemoteBadgeCountItem> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RemoteBadgeCountItemJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "count", "type" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "count");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "type");
    }
    
    public RemoteBadgeCountItem fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        Integer value = 0;
        jsonReader.h();
        int n = -1;
        Object o = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("type", "type", jsonReader);
                    }
                    n &= 0xFFFFFFFD;
                }
                else {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value == null) {
                        throw a.n("count", "count", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n == -4) {
            final int intValue = value;
            e.d(o, "null cannot be cast to non-null type kotlin.String");
            return new RemoteBadgeCountItem(intValue, (String)o);
        }
        Constructor<RemoteBadgeCountItem> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Integer> type = Integer.TYPE;
            constructorRef = RemoteBadgeCountItem.class.getDeclaredConstructor(type, String.class, type, a.c);
            e.e((Object)(this.constructorRef = constructorRef), "RemoteBadgeCountItem::cl\u2026his.constructorRef = it }");
        }
        final RemoteBadgeCountItem instance = constructorRef.newInstance(value, o, n, null);
        e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final RemoteBadgeCountItem remoteBadgeCountItem) {
        e.f((Object)x, "writer");
        if (remoteBadgeCountItem != null) {
            x.h();
            x.u("count");
            this.intAdapter.toJson(x, (Object)remoteBadgeCountItem.getCount());
            x.u("type");
            this.stringAdapter.toJson(x, (Object)remoteBadgeCountItem.getType());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RemoteBadgeCountItem)";
    }
}
