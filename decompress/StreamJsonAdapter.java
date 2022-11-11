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

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/Stream;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamJsonAdapter extends JsonAdapter<Stream>
{
    private volatile Constructor<Stream> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public StreamJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "stream_id", "hls_url", "ended_reason", "finished_by", "vod_accessible", "publish_at", "hls_exists_at", "killed_at", "purged_at", "update_at", "ended_at", "thumbnail", "state" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "streamId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "endedReason");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isVideoOnDemand");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "publishAt");
    }
    
    public Stream fromJson(final JsonReader jsonReader) {
        final Class<Long> clazz = Long.class;
        final Class<String> clazz2 = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 12: {
                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFEFFF;
                    continue;
                }
                case 11: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o10 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o9 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o8 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o7 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o6 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o5 = this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("hlsUrl", "hls_url", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("streamId", "stream_id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -4097) {
            if (s == null) {
                throw a.h("streamId", "stream_id", jsonReader);
            }
            if (o != null) {
                return new Stream(s, (String)o, (String)o2, (String)o3, (Boolean)o4, (Long)o5, (Long)o6, (Long)o7, (Long)o8, (Long)o9, (Long)o10, (String)o11, (String)o12);
            }
            throw a.h("hlsUrl", "hls_url", jsonReader);
        }
        else {
            final Constructor<Stream> constructorRef = this.constructorRef;
            Constructor<Stream> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = Stream.class.getDeclaredConstructor(clazz2, clazz2, clazz2, clazz2, Boolean.class, clazz, clazz, clazz, clazz, clazz, clazz, clazz2, clazz2, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "Stream::class.java.getDe\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("streamId", "stream_id", jsonReader);
            }
            if (o != null) {
                final Stream instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("hlsUrl", "hls_url", jsonReader);
        }
    }
    
    public void toJson(final x x, final Stream stream) {
        f.f((Object)x, "writer");
        if (stream != null) {
            x.h();
            x.w("stream_id");
            this.stringAdapter.toJson(x, (Object)stream.getStreamId());
            x.w("hls_url");
            this.stringAdapter.toJson(x, (Object)stream.getHlsUrl());
            x.w("ended_reason");
            this.nullableStringAdapter.toJson(x, (Object)stream.getEndedReason());
            x.w("finished_by");
            this.nullableStringAdapter.toJson(x, (Object)stream.getStreamEndedBy());
            x.w("vod_accessible");
            this.nullableBooleanAdapter.toJson(x, (Object)stream.isVideoOnDemand());
            x.w("publish_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getPublishAt());
            x.w("hls_exists_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getHlsExistsAt());
            x.w("killed_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getKilledAt());
            x.w("purged_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getPurgedAt());
            x.w("update_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getUpdateAt());
            x.w("ended_at");
            this.nullableLongAdapter.toJson(x, (Object)stream.getEndedAt());
            x.w("thumbnail");
            this.nullableStringAdapter.toJson(x, (Object)stream.getThumbnail());
            x.w("state");
            this.nullableStringAdapter.toJson(x, (Object)stream.getState());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Stream)";
    }
}
