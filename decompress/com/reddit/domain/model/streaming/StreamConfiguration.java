// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.viewpager.widget.c;
import androidx.appcompat.widget.s0;
import ah2.f;
import java.util.concurrent.TimeUnit;
import kotlin.random.Random;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\bP\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002lmB\u009f\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u001e¢\u0006\u0002\u0010\"J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u001eH\u00c6\u0003J\t\u0010]\u001a\u00020\u001eH\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u001eH\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J£\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u001eH\u00c6\u0001J\u0013\u0010h\u001a\u00020\u00072\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010j\u001a\u00020\u0003H\u00d6\u0001J\t\u0010k\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u001f\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0011\u0010@\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010%R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010%R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010%¨\u0006n" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "", "broadcast_audio_sample_rate", "", "broadcast_max_audio_bitrate", "top_streams_auto_switch_threshhold", "broadcast_enabled", "", "broadcast_fps", "broadcast_height", "broadcast_max_keyframe_interval", "broadcast_max_video_bitrate", "broadcast_width", "max_chat_comment_length", "rpan_config_refresh_rate", "skip_ahead_if_this_far_behind_millis", "viewer_auto_switch_time", "viewer_heartbeat_interval", "viewer_initial_heartbeat_delay_seconds", "viewer_stream_stats_refresh_rate", "viewer_streams_refresh", "viewer_streams_refresh_slop", "default_stream_duration_limit_seconds", "auto_switch_viewer_enabled", "unavailableVideoUrl", "", "abr_initial_cap_kbps", "abr_bitrate_cap_restore_denominator", "abr_bitrate_restore_denominator", "abr_reduced_bitrate_cap_percent", "", "abr_reduced_bitrate_percent", "abr_frame_drop_threshold", "abr_frame_drop_recovery_time_sec", "(IIIZIIIIIIIIIIIIIIIZLjava/lang/String;IIIFFIF)V", "abrInitialCapBitrateBits", "getAbrInitialCapBitrateBits", "()I", "getAbr_bitrate_cap_restore_denominator", "getAbr_bitrate_restore_denominator", "getAbr_frame_drop_recovery_time_sec", "()F", "getAbr_frame_drop_threshold", "getAbr_initial_cap_kbps", "getAbr_reduced_bitrate_cap_percent", "getAbr_reduced_bitrate_percent", "getAuto_switch_viewer_enabled", "()Z", "broadcastMaxAudioBitrateBits", "getBroadcastMaxAudioBitrateBits", "broadcastMaxVideoBitrateBits", "getBroadcastMaxVideoBitrateBits", "getBroadcast_audio_sample_rate", "getBroadcast_enabled", "getBroadcast_fps", "getBroadcast_height", "getBroadcast_max_audio_bitrate", "getBroadcast_max_keyframe_interval", "getBroadcast_max_video_bitrate", "getBroadcast_width", "getDefault_stream_duration_limit_seconds", "getMax_chat_comment_length", "getRpan_config_refresh_rate", "getSkip_ahead_if_this_far_behind_millis", "streamRefreshPeriodSeconds", "getStreamRefreshPeriodSeconds", "getTop_streams_auto_switch_threshhold", "getUnavailableVideoUrl", "()Ljava/lang/String;", "getViewer_auto_switch_time", "getViewer_heartbeat_interval", "getViewer_initial_heartbeat_delay_seconds", "getViewer_stream_stats_refresh_rate", "getViewer_streams_refresh", "getViewer_streams_refresh_slop", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "EntryPointViewType", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamConfiguration
{
    private static final int BITS_PER_KILOBIT = 1024;
    public static final Companion Companion;
    private static final StreamConfiguration DEFAULT;
    private final int abr_bitrate_cap_restore_denominator;
    private final int abr_bitrate_restore_denominator;
    private final float abr_frame_drop_recovery_time_sec;
    private final int abr_frame_drop_threshold;
    private final int abr_initial_cap_kbps;
    private final float abr_reduced_bitrate_cap_percent;
    private final float abr_reduced_bitrate_percent;
    private final boolean auto_switch_viewer_enabled;
    private final int broadcast_audio_sample_rate;
    private final boolean broadcast_enabled;
    private final int broadcast_fps;
    private final int broadcast_height;
    private final int broadcast_max_audio_bitrate;
    private final int broadcast_max_keyframe_interval;
    private final int broadcast_max_video_bitrate;
    private final int broadcast_width;
    private final int default_stream_duration_limit_seconds;
    private final int max_chat_comment_length;
    private final int rpan_config_refresh_rate;
    private final int skip_ahead_if_this_far_behind_millis;
    private final int streamRefreshPeriodSeconds;
    private final int top_streams_auto_switch_threshhold;
    private final String unavailableVideoUrl;
    private final int viewer_auto_switch_time;
    private final int viewer_heartbeat_interval;
    private final int viewer_initial_heartbeat_delay_seconds;
    private final int viewer_stream_stats_refresh_rate;
    private final int viewer_streams_refresh;
    private final int viewer_streams_refresh_slop;
    
    static {
        Companion = new Companion(null);
        DEFAULT = new StreamConfiguration(0, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 268435455, null);
    }
    
    public StreamConfiguration() {
        this(0, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 268435455, null);
    }
    
    public StreamConfiguration(final int broadcast_audio_sample_rate, final int broadcast_max_audio_bitrate, final int top_streams_auto_switch_threshhold, final boolean broadcast_enabled, final int broadcast_fps, final int broadcast_height, final int broadcast_max_keyframe_interval, final int broadcast_max_video_bitrate, final int broadcast_width, final int max_chat_comment_length, final int rpan_config_refresh_rate, final int skip_ahead_if_this_far_behind_millis, final int viewer_auto_switch_time, final int viewer_heartbeat_interval, final int viewer_initial_heartbeat_delay_seconds, final int viewer_stream_stats_refresh_rate, final int viewer_streams_refresh, final int viewer_streams_refresh_slop, final int default_stream_duration_limit_seconds, final boolean auto_switch_viewer_enabled, @n(name = "url_to_show_for_unavailable_video") final String unavailableVideoUrl, final int abr_initial_cap_kbps, final int abr_bitrate_cap_restore_denominator, final int abr_bitrate_restore_denominator, final float abr_reduced_bitrate_cap_percent, final float abr_reduced_bitrate_percent, final int abr_frame_drop_threshold, final float abr_frame_drop_recovery_time_sec) {
        this.broadcast_audio_sample_rate = broadcast_audio_sample_rate;
        this.broadcast_max_audio_bitrate = broadcast_max_audio_bitrate;
        this.top_streams_auto_switch_threshhold = top_streams_auto_switch_threshhold;
        this.broadcast_enabled = broadcast_enabled;
        this.broadcast_fps = broadcast_fps;
        this.broadcast_height = broadcast_height;
        this.broadcast_max_keyframe_interval = broadcast_max_keyframe_interval;
        this.broadcast_max_video_bitrate = broadcast_max_video_bitrate;
        this.broadcast_width = broadcast_width;
        this.max_chat_comment_length = max_chat_comment_length;
        this.rpan_config_refresh_rate = rpan_config_refresh_rate;
        this.skip_ahead_if_this_far_behind_millis = skip_ahead_if_this_far_behind_millis;
        this.viewer_auto_switch_time = viewer_auto_switch_time;
        this.viewer_heartbeat_interval = viewer_heartbeat_interval;
        this.viewer_initial_heartbeat_delay_seconds = viewer_initial_heartbeat_delay_seconds;
        this.viewer_stream_stats_refresh_rate = viewer_stream_stats_refresh_rate;
        this.viewer_streams_refresh = viewer_streams_refresh;
        this.viewer_streams_refresh_slop = viewer_streams_refresh_slop;
        this.default_stream_duration_limit_seconds = default_stream_duration_limit_seconds;
        this.auto_switch_viewer_enabled = auto_switch_viewer_enabled;
        this.unavailableVideoUrl = unavailableVideoUrl;
        this.abr_initial_cap_kbps = abr_initial_cap_kbps;
        this.abr_bitrate_cap_restore_denominator = abr_bitrate_cap_restore_denominator;
        this.abr_bitrate_restore_denominator = abr_bitrate_restore_denominator;
        this.abr_reduced_bitrate_cap_percent = abr_reduced_bitrate_cap_percent;
        this.abr_reduced_bitrate_percent = abr_reduced_bitrate_percent;
        this.abr_frame_drop_threshold = abr_frame_drop_threshold;
        this.abr_frame_drop_recovery_time_sec = abr_frame_drop_recovery_time_sec;
        this.streamRefreshPeriodSeconds = Random.Default.nextInt(viewer_streams_refresh_slop) + viewer_streams_refresh;
    }
    
    public static final /* synthetic */ StreamConfiguration access$getDEFAULT$cp() {
        return StreamConfiguration.DEFAULT;
    }
    
    public final int component1() {
        return this.broadcast_audio_sample_rate;
    }
    
    public final int component10() {
        return this.max_chat_comment_length;
    }
    
    public final int component11() {
        return this.rpan_config_refresh_rate;
    }
    
    public final int component12() {
        return this.skip_ahead_if_this_far_behind_millis;
    }
    
    public final int component13() {
        return this.viewer_auto_switch_time;
    }
    
    public final int component14() {
        return this.viewer_heartbeat_interval;
    }
    
    public final int component15() {
        return this.viewer_initial_heartbeat_delay_seconds;
    }
    
    public final int component16() {
        return this.viewer_stream_stats_refresh_rate;
    }
    
    public final int component17() {
        return this.viewer_streams_refresh;
    }
    
    public final int component18() {
        return this.viewer_streams_refresh_slop;
    }
    
    public final int component19() {
        return this.default_stream_duration_limit_seconds;
    }
    
    public final int component2() {
        return this.broadcast_max_audio_bitrate;
    }
    
    public final boolean component20() {
        return this.auto_switch_viewer_enabled;
    }
    
    public final String component21() {
        return this.unavailableVideoUrl;
    }
    
    public final int component22() {
        return this.abr_initial_cap_kbps;
    }
    
    public final int component23() {
        return this.abr_bitrate_cap_restore_denominator;
    }
    
    public final int component24() {
        return this.abr_bitrate_restore_denominator;
    }
    
    public final float component25() {
        return this.abr_reduced_bitrate_cap_percent;
    }
    
    public final float component26() {
        return this.abr_reduced_bitrate_percent;
    }
    
    public final int component27() {
        return this.abr_frame_drop_threshold;
    }
    
    public final float component28() {
        return this.abr_frame_drop_recovery_time_sec;
    }
    
    public final int component3() {
        return this.top_streams_auto_switch_threshhold;
    }
    
    public final boolean component4() {
        return this.broadcast_enabled;
    }
    
    public final int component5() {
        return this.broadcast_fps;
    }
    
    public final int component6() {
        return this.broadcast_height;
    }
    
    public final int component7() {
        return this.broadcast_max_keyframe_interval;
    }
    
    public final int component8() {
        return this.broadcast_max_video_bitrate;
    }
    
    public final int component9() {
        return this.broadcast_width;
    }
    
    public final StreamConfiguration copy(final int n, final int n2, final int n3, final boolean b, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final boolean b2, @n(name = "url_to_show_for_unavailable_video") final String s, final int n19, final int n20, final int n21, final float n22, final float n23, final int n24, final float n25) {
        return new StreamConfiguration(n, n2, n3, b, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, b2, s, n19, n20, n21, n22, n23, n24, n25);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamConfiguration)) {
            return false;
        }
        final StreamConfiguration streamConfiguration = (StreamConfiguration)o;
        return this.broadcast_audio_sample_rate == streamConfiguration.broadcast_audio_sample_rate && this.broadcast_max_audio_bitrate == streamConfiguration.broadcast_max_audio_bitrate && this.top_streams_auto_switch_threshhold == streamConfiguration.top_streams_auto_switch_threshhold && this.broadcast_enabled == streamConfiguration.broadcast_enabled && this.broadcast_fps == streamConfiguration.broadcast_fps && this.broadcast_height == streamConfiguration.broadcast_height && this.broadcast_max_keyframe_interval == streamConfiguration.broadcast_max_keyframe_interval && this.broadcast_max_video_bitrate == streamConfiguration.broadcast_max_video_bitrate && this.broadcast_width == streamConfiguration.broadcast_width && this.max_chat_comment_length == streamConfiguration.max_chat_comment_length && this.rpan_config_refresh_rate == streamConfiguration.rpan_config_refresh_rate && this.skip_ahead_if_this_far_behind_millis == streamConfiguration.skip_ahead_if_this_far_behind_millis && this.viewer_auto_switch_time == streamConfiguration.viewer_auto_switch_time && this.viewer_heartbeat_interval == streamConfiguration.viewer_heartbeat_interval && this.viewer_initial_heartbeat_delay_seconds == streamConfiguration.viewer_initial_heartbeat_delay_seconds && this.viewer_stream_stats_refresh_rate == streamConfiguration.viewer_stream_stats_refresh_rate && this.viewer_streams_refresh == streamConfiguration.viewer_streams_refresh && this.viewer_streams_refresh_slop == streamConfiguration.viewer_streams_refresh_slop && this.default_stream_duration_limit_seconds == streamConfiguration.default_stream_duration_limit_seconds && this.auto_switch_viewer_enabled == streamConfiguration.auto_switch_viewer_enabled && f.a((Object)this.unavailableVideoUrl, (Object)streamConfiguration.unavailableVideoUrl) && this.abr_initial_cap_kbps == streamConfiguration.abr_initial_cap_kbps && this.abr_bitrate_cap_restore_denominator == streamConfiguration.abr_bitrate_cap_restore_denominator && this.abr_bitrate_restore_denominator == streamConfiguration.abr_bitrate_restore_denominator && f.a((Object)this.abr_reduced_bitrate_cap_percent, (Object)streamConfiguration.abr_reduced_bitrate_cap_percent) && f.a((Object)this.abr_reduced_bitrate_percent, (Object)streamConfiguration.abr_reduced_bitrate_percent) && this.abr_frame_drop_threshold == streamConfiguration.abr_frame_drop_threshold && f.a((Object)this.abr_frame_drop_recovery_time_sec, (Object)streamConfiguration.abr_frame_drop_recovery_time_sec);
    }
    
    public final int getAbrInitialCapBitrateBits() {
        return this.abr_initial_cap_kbps * 1024;
    }
    
    public final int getAbr_bitrate_cap_restore_denominator() {
        return this.abr_bitrate_cap_restore_denominator;
    }
    
    public final int getAbr_bitrate_restore_denominator() {
        return this.abr_bitrate_restore_denominator;
    }
    
    public final float getAbr_frame_drop_recovery_time_sec() {
        return this.abr_frame_drop_recovery_time_sec;
    }
    
    public final int getAbr_frame_drop_threshold() {
        return this.abr_frame_drop_threshold;
    }
    
    public final int getAbr_initial_cap_kbps() {
        return this.abr_initial_cap_kbps;
    }
    
    public final float getAbr_reduced_bitrate_cap_percent() {
        return this.abr_reduced_bitrate_cap_percent;
    }
    
    public final float getAbr_reduced_bitrate_percent() {
        return this.abr_reduced_bitrate_percent;
    }
    
    public final boolean getAuto_switch_viewer_enabled() {
        return this.auto_switch_viewer_enabled;
    }
    
    public final int getBroadcastMaxAudioBitrateBits() {
        return this.broadcast_max_audio_bitrate * 1024;
    }
    
    public final int getBroadcastMaxVideoBitrateBits() {
        return this.broadcast_max_video_bitrate * 1024;
    }
    
    public final int getBroadcast_audio_sample_rate() {
        return this.broadcast_audio_sample_rate;
    }
    
    public final boolean getBroadcast_enabled() {
        return this.broadcast_enabled;
    }
    
    public final int getBroadcast_fps() {
        return this.broadcast_fps;
    }
    
    public final int getBroadcast_height() {
        return this.broadcast_height;
    }
    
    public final int getBroadcast_max_audio_bitrate() {
        return this.broadcast_max_audio_bitrate;
    }
    
    public final int getBroadcast_max_keyframe_interval() {
        return this.broadcast_max_keyframe_interval;
    }
    
    public final int getBroadcast_max_video_bitrate() {
        return this.broadcast_max_video_bitrate;
    }
    
    public final int getBroadcast_width() {
        return this.broadcast_width;
    }
    
    public final int getDefault_stream_duration_limit_seconds() {
        return this.default_stream_duration_limit_seconds;
    }
    
    public final int getMax_chat_comment_length() {
        return this.max_chat_comment_length;
    }
    
    public final int getRpan_config_refresh_rate() {
        return this.rpan_config_refresh_rate;
    }
    
    public final int getSkip_ahead_if_this_far_behind_millis() {
        return this.skip_ahead_if_this_far_behind_millis;
    }
    
    public final int getStreamRefreshPeriodSeconds() {
        return this.streamRefreshPeriodSeconds;
    }
    
    public final int getTop_streams_auto_switch_threshhold() {
        return this.top_streams_auto_switch_threshhold;
    }
    
    public final String getUnavailableVideoUrl() {
        return this.unavailableVideoUrl;
    }
    
    public final int getViewer_auto_switch_time() {
        return this.viewer_auto_switch_time;
    }
    
    public final int getViewer_heartbeat_interval() {
        return this.viewer_heartbeat_interval;
    }
    
    public final int getViewer_initial_heartbeat_delay_seconds() {
        return this.viewer_initial_heartbeat_delay_seconds;
    }
    
    public final int getViewer_stream_stats_refresh_rate() {
        return this.viewer_stream_stats_refresh_rate;
    }
    
    public final int getViewer_streams_refresh() {
        return this.viewer_streams_refresh;
    }
    
    public final int getViewer_streams_refresh_slop() {
        return this.viewer_streams_refresh_slop;
    }
    
    @Override
    public int hashCode() {
        final int e = s0.e(this.top_streams_auto_switch_threshhold, s0.e(this.broadcast_max_audio_bitrate, Integer.hashCode(this.broadcast_audio_sample_rate) * 31, 31), 31);
        final int broadcast_enabled = this.broadcast_enabled ? 1 : 0;
        final int n = 1;
        int n2 = broadcast_enabled;
        if (broadcast_enabled != 0) {
            n2 = 1;
        }
        final int e2 = s0.e(this.default_stream_duration_limit_seconds, s0.e(this.viewer_streams_refresh_slop, s0.e(this.viewer_streams_refresh, s0.e(this.viewer_stream_stats_refresh_rate, s0.e(this.viewer_initial_heartbeat_delay_seconds, s0.e(this.viewer_heartbeat_interval, s0.e(this.viewer_auto_switch_time, s0.e(this.skip_ahead_if_this_far_behind_millis, s0.e(this.rpan_config_refresh_rate, s0.e(this.max_chat_comment_length, s0.e(this.broadcast_width, s0.e(this.broadcast_max_video_bitrate, s0.e(this.broadcast_max_keyframe_interval, s0.e(this.broadcast_height, s0.e(this.broadcast_fps, (e + n2) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int auto_switch_viewer_enabled = this.auto_switch_viewer_enabled ? 1 : 0;
        if (auto_switch_viewer_enabled != 0) {
            auto_switch_viewer_enabled = n;
        }
        final String unavailableVideoUrl = this.unavailableVideoUrl;
        int hashCode;
        if (unavailableVideoUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = unavailableVideoUrl.hashCode();
        }
        return Float.hashCode(this.abr_frame_drop_recovery_time_sec) + s0.e(this.abr_frame_drop_threshold, a.a(this.abr_reduced_bitrate_percent, a.a(this.abr_reduced_bitrate_cap_percent, s0.e(this.abr_bitrate_restore_denominator, s0.e(this.abr_bitrate_cap_restore_denominator, s0.e(this.abr_initial_cap_kbps, ((e2 + auto_switch_viewer_enabled) * 31 + hashCode) * 31, 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamConfiguration(broadcast_audio_sample_rate=");
        k.append(this.broadcast_audio_sample_rate);
        k.append(", broadcast_max_audio_bitrate=");
        k.append(this.broadcast_max_audio_bitrate);
        k.append(", top_streams_auto_switch_threshhold=");
        k.append(this.top_streams_auto_switch_threshhold);
        k.append(", broadcast_enabled=");
        k.append(this.broadcast_enabled);
        k.append(", broadcast_fps=");
        k.append(this.broadcast_fps);
        k.append(", broadcast_height=");
        k.append(this.broadcast_height);
        k.append(", broadcast_max_keyframe_interval=");
        k.append(this.broadcast_max_keyframe_interval);
        k.append(", broadcast_max_video_bitrate=");
        k.append(this.broadcast_max_video_bitrate);
        k.append(", broadcast_width=");
        k.append(this.broadcast_width);
        k.append(", max_chat_comment_length=");
        k.append(this.max_chat_comment_length);
        k.append(", rpan_config_refresh_rate=");
        k.append(this.rpan_config_refresh_rate);
        k.append(", skip_ahead_if_this_far_behind_millis=");
        k.append(this.skip_ahead_if_this_far_behind_millis);
        k.append(", viewer_auto_switch_time=");
        k.append(this.viewer_auto_switch_time);
        k.append(", viewer_heartbeat_interval=");
        k.append(this.viewer_heartbeat_interval);
        k.append(", viewer_initial_heartbeat_delay_seconds=");
        k.append(this.viewer_initial_heartbeat_delay_seconds);
        k.append(", viewer_stream_stats_refresh_rate=");
        k.append(this.viewer_stream_stats_refresh_rate);
        k.append(", viewer_streams_refresh=");
        k.append(this.viewer_streams_refresh);
        k.append(", viewer_streams_refresh_slop=");
        k.append(this.viewer_streams_refresh_slop);
        k.append(", default_stream_duration_limit_seconds=");
        k.append(this.default_stream_duration_limit_seconds);
        k.append(", auto_switch_viewer_enabled=");
        k.append(this.auto_switch_viewer_enabled);
        k.append(", unavailableVideoUrl=");
        k.append(this.unavailableVideoUrl);
        k.append(", abr_initial_cap_kbps=");
        k.append(this.abr_initial_cap_kbps);
        k.append(", abr_bitrate_cap_restore_denominator=");
        k.append(this.abr_bitrate_cap_restore_denominator);
        k.append(", abr_bitrate_restore_denominator=");
        k.append(this.abr_bitrate_restore_denominator);
        k.append(", abr_reduced_bitrate_cap_percent=");
        k.append(this.abr_reduced_bitrate_cap_percent);
        k.append(", abr_reduced_bitrate_percent=");
        k.append(this.abr_reduced_bitrate_percent);
        k.append(", abr_frame_drop_threshold=");
        k.append(this.abr_frame_drop_threshold);
        k.append(", abr_frame_drop_recovery_time_sec=");
        return c.j(k, this.abr_frame_drop_recovery_time_sec, ')');
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamConfiguration$Companion;", "", "()V", "BITS_PER_KILOBIT", "", "DEFAULT", "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "getDEFAULT", "()Lcom/reddit/domain/model/streaming/StreamConfiguration;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final StreamConfiguration getDEFAULT() {
            return StreamConfiguration.access$getDEFAULT$cp();
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamConfiguration$EntryPointViewType;", "", "(Ljava/lang/String;I)V", "STREAM", "OFFLINE", "NONE", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum EntryPointViewType
    {
        NONE, 
        OFFLINE, 
        STREAM;
    }
}
