// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamBroadcastJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamBroadcast;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/streaming/Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/reddit/domain/model/streaming/StreamBroadcastData;", "nullableStreamBroadcastDataAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamBroadcastJsonAdapter extends JsonAdapter<StreamBroadcast>
{
    private volatile Constructor<StreamBroadcast> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<StreamBroadcastData> nullableStreamBroadcastDataAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public StreamBroadcastJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "result", "status", "data", "networkErrorCode" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.statusAdapter = (JsonAdapter<Status>)y.c((Type)Status.class, (Set)instance, "result");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "status");
        this.nullableStreamBroadcastDataAdapter = (JsonAdapter<StreamBroadcastData>)y.c((Type)StreamBroadcastData.class, (Set)instance, "data");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "networkErrorCode");
    }
    
    public StreamBroadcast fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            o4 = this.nullableIntAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFF7;
                        }
                        else {
                            o3 = this.nullableStreamBroadcastDataAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 == null) {
                            throw a.n("status", "status", jsonReader);
                        }
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    o = this.statusAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("result", "result", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -16) {
            f.d(o, "null cannot be cast to non-null type com.reddit.domain.model.streaming.Status");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            return new StreamBroadcast((Status)o, (String)o2, (StreamBroadcastData)o3, (Integer)o4);
        }
        Constructor<StreamBroadcast> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = StreamBroadcast.class.getDeclaredConstructor(Status.class, String.class, StreamBroadcastData.class, Integer.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "StreamBroadcast::class.j\u2026his.constructorRef = it }");
        }
        final StreamBroadcast instance = constructorRef.newInstance(o, o2, o3, o4, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final StreamBroadcast streamBroadcast) {
        f.f((Object)x, "writer");
        if (streamBroadcast != null) {
            x.h();
            x.w("result");
            this.statusAdapter.toJson(x, (Object)streamBroadcast.getResult());
            x.w("status");
            this.stringAdapter.toJson(x, (Object)streamBroadcast.getStatus());
            x.w("data");
            this.nullableStreamBroadcastDataAdapter.toJson(x, (Object)streamBroadcast.getData());
            x.w("networkErrorCode");
            this.nullableIntAdapter.toJson(x, (Object)streamBroadcast.getNetworkErrorCode());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamBroadcast)";
    }
}
