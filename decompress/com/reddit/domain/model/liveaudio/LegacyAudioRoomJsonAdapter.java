// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.liveaudio;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/liveaudio/LegacyAudioRoomJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/liveaudio/LegacyAudioRoom;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LegacyAudioRoomJsonAdapter extends JsonAdapter<LegacyAudioRoom>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<LegacyAudioRoom> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public LegacyAudioRoomJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "room_id", "is_live", "room_status", "recording_status", "recording_hls_url", "recording_dash_url", "recording_fallback_url", "recording_duration_seconds" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "roomId");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isLive");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "status");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "recordingHlsUrl");
    }
    
    public LegacyAudioRoom fromJson(final JsonReader jsonReader) {
        final Class<Integer> clazz = Integer.class;
        final Class<String> clazz2 = String.class;
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Boolean b = null;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    o6 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o2 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("isLive", "is_live", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("roomId", "room_id", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.G1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -253) {
            if (s == null) {
                throw a.h("roomId", "room_id", jsonReader);
            }
            if (b != null) {
                return new LegacyAudioRoom(s, (boolean)b, (Integer)o, (Integer)o2, (String)o3, (String)o4, (String)o5, (Integer)o6);
            }
            throw a.h("isLive", "is_live", jsonReader);
        }
        else {
            final Constructor<LegacyAudioRoom> constructorRef = this.constructorRef;
            Constructor<LegacyAudioRoom> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = LegacyAudioRoom.class.getDeclaredConstructor(clazz2, Boolean.TYPE, clazz, clazz, clazz2, clazz2, clazz2, clazz, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "LegacyAudioRoom::class.j\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("roomId", "room_id", jsonReader);
            }
            if (b != null) {
                final LegacyAudioRoom instance = declaredConstructor.newInstance(s, Boolean.valueOf(b), o, o2, o3, o4, o5, o6, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("isLive", "is_live", jsonReader);
        }
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final LegacyAudioRoom legacyAudioRoom) {
        e.f((Object)x, "writer");
        if (legacyAudioRoom != null) {
            x.h();
            x.v("room_id");
            this.stringAdapter.toJson(x, (Object)legacyAudioRoom.getRoomId());
            x.v("is_live");
            this.booleanAdapter.toJson(x, (Object)legacyAudioRoom.isLive());
            x.v("room_status");
            this.nullableIntAdapter.toJson(x, (Object)legacyAudioRoom.getStatus());
            x.v("recording_status");
            this.nullableIntAdapter.toJson(x, (Object)legacyAudioRoom.getRecordingStatus());
            x.v("recording_hls_url");
            this.nullableStringAdapter.toJson(x, (Object)legacyAudioRoom.getRecordingHlsUrl());
            x.v("recording_dash_url");
            this.nullableStringAdapter.toJson(x, (Object)legacyAudioRoom.getRecordingDashUrl());
            x.v("recording_fallback_url");
            this.nullableStringAdapter.toJson(x, (Object)legacyAudioRoom.getRecordingFallbackUrl());
            x.v("recording_duration_seconds");
            this.nullableIntAdapter.toJson(x, (Object)legacyAudioRoom.getRecordingDuration());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (LegacyAudioRoom)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(LegacyAudioRoom)";
    }
}
