// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import pg2.j;
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

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "", "floatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamConfigurationJsonAdapter extends JsonAdapter<StreamConfiguration>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<StreamConfiguration> constructorRef;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public StreamConfigurationJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "broadcast_audio_sample_rate", "broadcast_max_audio_bitrate", "top_streams_auto_switch_threshhold", "broadcast_enabled", "broadcast_fps", "broadcast_height", "broadcast_max_keyframe_interval", "broadcast_max_video_bitrate", "broadcast_width", "max_chat_comment_length", "rpan_config_refresh_rate", "skip_ahead_if_this_far_behind_millis", "viewer_auto_switch_time", "viewer_heartbeat_interval", "viewer_initial_heartbeat_delay_seconds", "viewer_stream_stats_refresh_rate", "viewer_streams_refresh", "viewer_streams_refresh_slop", "default_stream_duration_limit_seconds", "auto_switch_viewer_enabled", "url_to_show_for_unavailable_video", "abr_initial_cap_kbps", "abr_bitrate_cap_restore_denominator", "abr_bitrate_restore_denominator", "abr_reduced_bitrate_cap_percent", "abr_reduced_bitrate_percent", "abr_frame_drop_threshold", "abr_frame_drop_recovery_time_sec" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "broadcast_audio_sample_rate");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "broadcast_enabled");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "unavailableVideoUrl");
        this.floatAdapter = (JsonAdapter<Float>)y.c((Type)Float.TYPE, (Set)instance, "abr_reduced_bitrate_cap_percent");
    }
    
    public StreamConfiguration fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Integer n2;
        Integer n = n2 = value;
        Integer n4;
        Integer n3 = n4 = n2;
        Integer n6;
        Integer n5 = n6 = n4;
        Integer n8;
        Integer n7 = n8 = n6;
        Integer n10;
        Integer n9 = n10 = n8;
        Integer n12;
        Integer n11 = n12 = n10;
        Integer n14;
        Integer n13 = n14 = n12;
        Integer n16;
        Integer n15 = n16 = n14;
        Integer n18;
        Integer n17 = n18 = n16;
        Boolean b = false;
        Float value2 = 0.0f;
        Float n20;
        Float n19 = n20 = value2;
        int n21 = -1;
        String s = null;
        Integer n22 = n18;
        Integer n24;
        Integer n23 = n24 = n22;
        while (jsonReader.hasNext()) {
            int n25 = 0;
            Label_1285: {
                int n26 = 0;
                switch (jsonReader.F(this.options)) {
                    default: {
                        n25 = n21;
                        break Label_1285;
                    }
                    case 27: {
                        n20 = (Float)this.floatAdapter.fromJson(jsonReader);
                        if (n20 != null) {
                            n26 = -134217729;
                            break;
                        }
                        throw a.n("abr_frame_drop_recovery_time_sec", "abr_frame_drop_recovery_time_sec", jsonReader);
                    }
                    case 26: {
                        n18 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n18 != null) {
                            n26 = -67108865;
                            break;
                        }
                        throw a.n("abr_frame_drop_threshold", "abr_frame_drop_threshold", jsonReader);
                    }
                    case 25: {
                        n19 = (Float)this.floatAdapter.fromJson(jsonReader);
                        if (n19 != null) {
                            n26 = -33554433;
                            break;
                        }
                        throw a.n("abr_reduced_bitrate_percent", "abr_reduced_bitrate_percent", jsonReader);
                    }
                    case 24: {
                        value2 = (Float)this.floatAdapter.fromJson(jsonReader);
                        if (value2 != null) {
                            n26 = -16777217;
                            break;
                        }
                        throw a.n("abr_reduced_bitrate_cap_percent", "abr_reduced_bitrate_cap_percent", jsonReader);
                    }
                    case 23: {
                        n17 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n17 != null) {
                            n26 = -8388609;
                            break;
                        }
                        throw a.n("abr_bitrate_restore_denominator", "abr_bitrate_restore_denominator", jsonReader);
                    }
                    case 22: {
                        n16 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n16 != null) {
                            n26 = -4194305;
                            break;
                        }
                        throw a.n("abr_bitrate_cap_restore_denominator", "abr_bitrate_cap_restore_denominator", jsonReader);
                    }
                    case 21: {
                        n15 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n15 != null) {
                            n26 = -2097153;
                            break;
                        }
                        throw a.n("abr_initial_cap_kbps", "abr_initial_cap_kbps", jsonReader);
                    }
                    case 20: {
                        s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        n26 = -1048577;
                        break;
                    }
                    case 19: {
                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b != null) {
                            n26 = -524289;
                            break;
                        }
                        throw a.n("auto_switch_viewer_enabled", "auto_switch_viewer_enabled", jsonReader);
                    }
                    case 18: {
                        n14 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n14 != null) {
                            n26 = -262145;
                            break;
                        }
                        throw a.n("default_stream_duration_limit_seconds", "default_stream_duration_limit_seconds", jsonReader);
                    }
                    case 17: {
                        n13 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n13 != null) {
                            n26 = -131073;
                            break;
                        }
                        throw a.n("viewer_streams_refresh_slop", "viewer_streams_refresh_slop", jsonReader);
                    }
                    case 16: {
                        n12 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n12 != null) {
                            n26 = -65537;
                            break;
                        }
                        throw a.n("viewer_streams_refresh", "viewer_streams_refresh", jsonReader);
                    }
                    case 15: {
                        n11 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n11 != null) {
                            n26 = -32769;
                            break;
                        }
                        throw a.n("viewer_stream_stats_refresh_rate", "viewer_stream_stats_refresh_rate", jsonReader);
                    }
                    case 14: {
                        n10 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n10 != null) {
                            n25 = (n21 & 0xFFFFBFFF);
                            break Label_1285;
                        }
                        throw a.n("viewer_initial_heartbeat_delay_seconds", "viewer_initial_heartbeat_delay_seconds", jsonReader);
                    }
                    case 13: {
                        n9 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n9 != null) {
                            n25 = (n21 & 0xFFFFDFFF);
                            break Label_1285;
                        }
                        throw a.n("viewer_heartbeat_interval", "viewer_heartbeat_interval", jsonReader);
                    }
                    case 12: {
                        n8 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n8 != null) {
                            n25 = (n21 & 0xFFFFEFFF);
                            break Label_1285;
                        }
                        throw a.n("viewer_auto_switch_time", "viewer_auto_switch_time", jsonReader);
                    }
                    case 11: {
                        n7 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n7 != null) {
                            n25 = (n21 & 0xFFFFF7FF);
                            break Label_1285;
                        }
                        throw a.n("skip_ahead_if_this_far_behind_millis", "skip_ahead_if_this_far_behind_millis", jsonReader);
                    }
                    case 10: {
                        n6 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n6 != null) {
                            n25 = (n21 & 0xFFFFFBFF);
                            break Label_1285;
                        }
                        throw a.n("rpan_config_refresh_rate", "rpan_config_refresh_rate", jsonReader);
                    }
                    case 9: {
                        n5 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n5 != null) {
                            n25 = (n21 & 0xFFFFFDFF);
                            break Label_1285;
                        }
                        throw a.n("max_chat_comment_length", "max_chat_comment_length", jsonReader);
                    }
                    case 8: {
                        n4 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n4 != null) {
                            n25 = (n21 & 0xFFFFFEFF);
                            break Label_1285;
                        }
                        throw a.n("broadcast_width", "broadcast_width", jsonReader);
                    }
                    case 7: {
                        n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n3 != null) {
                            n25 = (n21 & 0xFFFFFF7F);
                            break Label_1285;
                        }
                        throw a.n("broadcast_max_video_bitrate", "broadcast_max_video_bitrate", jsonReader);
                    }
                    case 6: {
                        n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n2 != null) {
                            n25 = (n21 & 0xFFFFFFBF);
                            break Label_1285;
                        }
                        throw a.n("broadcast_max_keyframe_interval", "broadcast_max_keyframe_interval", jsonReader);
                    }
                    case 5: {
                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n != null) {
                            n25 = (n21 & 0xFFFFFFDF);
                            break Label_1285;
                        }
                        throw a.n("broadcast_height", "broadcast_height", jsonReader);
                    }
                    case 4: {
                        n24 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n24 != null) {
                            n25 = (n21 & 0xFFFFFFEF);
                            break Label_1285;
                        }
                        throw a.n("broadcast_fps", "broadcast_fps", jsonReader);
                    }
                    case 3: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n25 = (n21 & 0xFFFFFFF7);
                            break Label_1285;
                        }
                        throw a.n("broadcast_enabled", "broadcast_enabled", jsonReader);
                    }
                    case 2: {
                        n23 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n23 != null) {
                            n25 = (n21 & 0xFFFFFFFB);
                            break Label_1285;
                        }
                        throw a.n("top_streams_auto_switch_threshhold", "top_streams_auto_switch_threshhold", jsonReader);
                    }
                    case 1: {
                        n22 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n22 != null) {
                            n25 = (n21 & 0xFFFFFFFD);
                            break Label_1285;
                        }
                        throw a.n("broadcast_max_audio_bitrate", "broadcast_max_audio_bitrate", jsonReader);
                    }
                    case 0: {
                        value = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (value != null) {
                            n25 = (n21 & 0xFFFFFFFE);
                            break Label_1285;
                        }
                        throw a.n("broadcast_audio_sample_rate", "broadcast_audio_sample_rate", jsonReader);
                    }
                    case -1: {
                        jsonReader.J();
                        jsonReader.z1();
                        n25 = n21;
                        break Label_1285;
                    }
                }
                n25 = (n21 & n26);
            }
            n21 = n25;
        }
        jsonReader.r();
        if (n21 == -268435456) {
            return new StreamConfiguration(value, n22, n23, false, n24, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, b, s, n15, n16, n17, value2, n19, n18, n20);
        }
        Constructor<StreamConfiguration> constructorRef = this.constructorRef;
        if (constructorRef == null) {
            final Class<Integer> type = Integer.TYPE;
            final Class<Boolean> type2 = Boolean.TYPE;
            final Class<Float> type3 = Float.TYPE;
            constructorRef = StreamConfiguration.class.getDeclaredConstructor(type, type, type, type2, type, type, type, type, type, type, type, type, type, type, type, type, type, type, type, type2, String.class, type, type, type, type3, type3, type, type3, type, a.c);
            this.constructorRef = constructorRef;
            final j a = j.a;
            f.e((Object)constructorRef, "StreamConfiguration::cla\u2026his.constructorRef = it }");
        }
        final StreamConfiguration instance = constructorRef.newInstance(value, n22, n23, false, n24, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, b, s, n15, n16, n17, value2, n19, n18, n20, n21, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final StreamConfiguration streamConfiguration) {
        f.f((Object)x, "writer");
        if (streamConfiguration != null) {
            x.h();
            x.w("broadcast_audio_sample_rate");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_audio_sample_rate());
            x.w("broadcast_max_audio_bitrate");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_max_audio_bitrate());
            x.w("top_streams_auto_switch_threshhold");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getTop_streams_auto_switch_threshhold());
            x.w("broadcast_enabled");
            this.booleanAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_enabled());
            x.w("broadcast_fps");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_fps());
            x.w("broadcast_height");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_height());
            x.w("broadcast_max_keyframe_interval");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_max_keyframe_interval());
            x.w("broadcast_max_video_bitrate");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_max_video_bitrate());
            x.w("broadcast_width");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getBroadcast_width());
            x.w("max_chat_comment_length");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getMax_chat_comment_length());
            x.w("rpan_config_refresh_rate");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getRpan_config_refresh_rate());
            x.w("skip_ahead_if_this_far_behind_millis");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getSkip_ahead_if_this_far_behind_millis());
            x.w("viewer_auto_switch_time");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_auto_switch_time());
            x.w("viewer_heartbeat_interval");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_heartbeat_interval());
            x.w("viewer_initial_heartbeat_delay_seconds");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_initial_heartbeat_delay_seconds());
            x.w("viewer_stream_stats_refresh_rate");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_stream_stats_refresh_rate());
            x.w("viewer_streams_refresh");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_streams_refresh());
            x.w("viewer_streams_refresh_slop");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getViewer_streams_refresh_slop());
            x.w("default_stream_duration_limit_seconds");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getDefault_stream_duration_limit_seconds());
            x.w("auto_switch_viewer_enabled");
            this.booleanAdapter.toJson(x, (Object)streamConfiguration.getAuto_switch_viewer_enabled());
            x.w("url_to_show_for_unavailable_video");
            this.nullableStringAdapter.toJson(x, (Object)streamConfiguration.getUnavailableVideoUrl());
            x.w("abr_initial_cap_kbps");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getAbr_initial_cap_kbps());
            x.w("abr_bitrate_cap_restore_denominator");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getAbr_bitrate_cap_restore_denominator());
            x.w("abr_bitrate_restore_denominator");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getAbr_bitrate_restore_denominator());
            x.w("abr_reduced_bitrate_cap_percent");
            this.floatAdapter.toJson(x, (Object)streamConfiguration.getAbr_reduced_bitrate_cap_percent());
            x.w("abr_reduced_bitrate_percent");
            this.floatAdapter.toJson(x, (Object)streamConfiguration.getAbr_reduced_bitrate_percent());
            x.w("abr_frame_drop_threshold");
            this.intAdapter.toJson(x, (Object)streamConfiguration.getAbr_frame_drop_threshold());
            x.w("abr_frame_drop_recovery_time_sec");
            this.floatAdapter.toJson(x, (Object)streamConfiguration.getAbr_frame_drop_recovery_time_sec());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamConfiguration)";
    }
}
