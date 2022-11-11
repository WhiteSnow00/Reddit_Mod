// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.liveaudio;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.Redditor;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&" }, d2 = { "Lcom/reddit/domain/model/liveaudio/AudioRoomJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/liveaudio/AudioRoom;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "", "booleanAdapter", "Lcom/reddit/domain/model/liveaudio/TalkRoomStatus;", "talkRoomStatusAdapter", "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "audioRecordingStatusAdapter", "nullableIntAdapter", "", "Lcom/reddit/domain/model/Redditor;", "listOfRedditorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioRoomJsonAdapter extends JsonAdapter<AudioRoom>
{
    private final JsonAdapter<AudioRecordingStatus> audioRecordingStatusAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AudioRoom> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Redditor>> listOfRedditorAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TalkRoomStatus> talkRoomStatusAdapter;
    
    public AudioRoomJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "room_id", "room_title", "metadata", "notification_path", "participant_count", "is_live", "status", "recording_status", "recording_hls_url", "recording_dash_url", "recording_fallback_url", "recording_duration", "top_users", "started_at" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "roomId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "metadataJson");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "participantCount");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isLive");
        this.talkRoomStatusAdapter = (JsonAdapter<TalkRoomStatus>)y.c((Type)TalkRoomStatus.class, (Set)instance, "status");
        this.audioRecordingStatusAdapter = (JsonAdapter<AudioRecordingStatus>)y.c((Type)AudioRecordingStatus.class, (Set)instance, "recordingStatus");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "recordingDuration");
        this.listOfRedditorAdapter = (JsonAdapter<List<Redditor>>)y.c((Type)a0.d((Class)List.class, new Type[] { Redditor.class }), (Set)instance, "topUsers");
    }
    
    public AudioRoom fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        Object o = null;
        String s = null;
        String s2 = null;
        String s3 = null;
        Boolean b = null;
        List list = null;
        TalkRoomStatus talkRoomStatus = null;
        AudioRecordingStatus audioRecordingStatus = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        Integer n3 = null;
        String s7 = null;
        while (jsonReader.hasNext()) {
            String s9 = null;
            String s13 = null;
            Label_0627: {
                String s10 = null;
                Label_0623: {
                    switch (jsonReader.E(this.options)) {
                        case 13: {
                            s7 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFDFFF;
                            break;
                        }
                        case 12: {
                            final List list2 = (List)this.listOfRedditorAdapter.fromJson(jsonReader);
                            if (list2 != null) {
                                n &= 0xFFFFEFFF;
                                final String s8 = s3;
                                s9 = s2;
                                s10 = s8;
                                list = list2;
                                break Label_0623;
                            }
                            throw a.n("topUsers", "top_users", jsonReader);
                        }
                        case 11: {
                            n3 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                            n &= 0xFFFFF7FF;
                            break;
                        }
                        case 10: {
                            s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFBFF;
                            break;
                        }
                        case 9: {
                            s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFDFF;
                            break;
                        }
                        case 8: {
                            s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFEFF;
                            break;
                        }
                        case 7: {
                            final AudioRecordingStatus audioRecordingStatus2 = (AudioRecordingStatus)this.audioRecordingStatusAdapter.fromJson(jsonReader);
                            if (audioRecordingStatus2 != null) {
                                n &= 0xFFFFFF7F;
                                final String s11 = s3;
                                s9 = s2;
                                s10 = s11;
                                audioRecordingStatus = audioRecordingStatus2;
                                break Label_0623;
                            }
                            throw a.n("recordingStatus", "recording_status", jsonReader);
                        }
                        case 6: {
                            final TalkRoomStatus talkRoomStatus2 = (TalkRoomStatus)this.talkRoomStatusAdapter.fromJson(jsonReader);
                            if (talkRoomStatus2 != null) {
                                n &= 0xFFFFFFBF;
                                final String s12 = s3;
                                s9 = s2;
                                s10 = s12;
                                talkRoomStatus = talkRoomStatus2;
                                break Label_0623;
                            }
                            throw a.n("status", "status", jsonReader);
                        }
                        case 5: {
                            b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b != null) {
                                s13 = s3;
                                s9 = s2;
                                break Label_0627;
                            }
                            throw a.n("isLive", "is_live", jsonReader);
                        }
                        case 4: {
                            n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n2 != null) {
                                continue;
                            }
                            throw a.n("participantCount", "participant_count", jsonReader);
                        }
                        case 3: {
                            s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                break;
                            }
                            throw a.n("notificationPath", "notification_path", jsonReader);
                        }
                        case 2: {
                            final String s14 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                            s10 = s3;
                            s9 = s14;
                            break Label_0623;
                        }
                        case 1: {
                            s = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s != null) {
                                break;
                            }
                            throw a.n("roomTitle", "room_title", jsonReader);
                        }
                        case 0: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                break;
                            }
                            throw a.n("roomId", "room_id", jsonReader);
                        }
                        case -1: {
                            jsonReader.H();
                            jsonReader.F1();
                            break;
                        }
                    }
                    final String s15 = s2;
                    s10 = s3;
                    s9 = s15;
                }
                s13 = s10;
            }
            s2 = s9;
            s3 = s13;
        }
        jsonReader.r();
        if (n == -16325) {
            if (o == null) {
                throw a.h("roomId", "room_id", jsonReader);
            }
            if (s == null) {
                throw a.h("roomTitle", "room_title", jsonReader);
            }
            if (s3 == null) {
                throw a.h("notificationPath", "notification_path", jsonReader);
            }
            if (n2 == null) {
                throw a.h("participantCount", "participant_count", jsonReader);
            }
            final int intValue = n2;
            if (b != null) {
                final boolean booleanValue = b;
                e.d((Object)talkRoomStatus, "null cannot be cast to non-null type com.reddit.domain.model.liveaudio.TalkRoomStatus");
                e.d((Object)audioRecordingStatus, "null cannot be cast to non-null type com.reddit.domain.model.liveaudio.AudioRecordingStatus");
                e.d((Object)list, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.Redditor>");
                return new AudioRoom((String)o, s, s2, s3, intValue, booleanValue, talkRoomStatus, audioRecordingStatus, s4, s5, s6, n3, list, s7);
            }
            throw a.h("isLive", "is_live", jsonReader);
        }
        else {
            final Constructor<AudioRoom> constructorRef = this.constructorRef;
            Constructor<AudioRoom> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = AudioRoom.class.getDeclaredConstructor(clazz, clazz, clazz, clazz, type, Boolean.TYPE, TalkRoomStatus.class, AudioRecordingStatus.class, clazz, clazz, clazz, Integer.class, List.class, clazz, type, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "AudioRoom::class.java.ge\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (o == null) {
                throw a.h("roomId", "room_id", jsonReader);
            }
            if (s == null) {
                throw a.h("roomTitle", "room_title", jsonReader);
            }
            if (s3 == null) {
                throw a.h("notificationPath", "notification_path", jsonReader);
            }
            if (n2 == null) {
                throw a.h("participantCount", "participant_count", jsonReader);
            }
            final int intValue2 = n2;
            if (b != null) {
                final AudioRoom instance = declaredConstructor.newInstance(o, s, s2, s3, intValue2, Boolean.valueOf(b), talkRoomStatus, audioRecordingStatus, s4, s5, s6, n3, list, s7, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("isLive", "is_live", jsonReader);
        }
    }
    
    public void toJson(final x x, final AudioRoom audioRoom) {
        e.f((Object)x, "writer");
        if (audioRoom != null) {
            x.h();
            x.u("room_id");
            this.stringAdapter.toJson(x, (Object)audioRoom.getRoomId());
            x.u("room_title");
            this.stringAdapter.toJson(x, (Object)audioRoom.getRoomTitle());
            x.u("metadata");
            this.nullableStringAdapter.toJson(x, (Object)audioRoom.getMetadataJson());
            x.u("notification_path");
            this.stringAdapter.toJson(x, (Object)audioRoom.getNotificationPath());
            x.u("participant_count");
            this.intAdapter.toJson(x, (Object)audioRoom.getParticipantCount());
            x.u("is_live");
            this.booleanAdapter.toJson(x, (Object)audioRoom.isLive());
            x.u("status");
            this.talkRoomStatusAdapter.toJson(x, (Object)audioRoom.getStatus());
            x.u("recording_status");
            this.audioRecordingStatusAdapter.toJson(x, (Object)audioRoom.getRecordingStatus());
            x.u("recording_hls_url");
            this.nullableStringAdapter.toJson(x, (Object)audioRoom.getRecordingHlsUrl());
            x.u("recording_dash_url");
            this.nullableStringAdapter.toJson(x, (Object)audioRoom.getRecordingDashUrl());
            x.u("recording_fallback_url");
            this.nullableStringAdapter.toJson(x, (Object)audioRoom.getRecordingFallbackUrl());
            x.u("recording_duration");
            this.nullableIntAdapter.toJson(x, (Object)audioRoom.getRecordingDuration());
            x.u("top_users");
            this.listOfRedditorAdapter.toJson(x, (Object)audioRoom.getTopUsers());
            x.u("started_at");
            this.nullableStringAdapter.toJson(x, (Object)audioRoom.getStartedAt());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(AudioRoom)";
    }
}
