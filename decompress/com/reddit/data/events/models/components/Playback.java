// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Playback
{
    public static final a<Playback, Builder> ADAPTER;
    public final Long audio_bitrate;
    public final String autoplay_setting;
    public final String chat_state;
    public final String error;
    public final Long heartbeat_duration_ms;
    public final String id;
    public final Boolean is_live;
    public final Boolean is_looped;
    public final Integer player_height;
    public final String player_type;
    public final Integer player_width;
    public final Long playhead_offset_ms;
    public final Long scrubbing_end_ms;
    public final Long scrubbing_start_ms;
    public final Integer sequence_number;
    public final Long session_duration_ms;
    public final Long start_time_ms;
    public final String state;
    public final Long timestamp_ms;
    public final Long total_bitrate;
    public final Long video_bitrate;
    public final Long volume;
    public final Long watch_duration_ms;
    public final Double watch_percentage;
    
    static {
        ADAPTER = (a)new PlaybackAdapter(null);
    }
    
    private Playback(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.scrubbing_start_ms = Builder.access$200(builder);
        this.scrubbing_end_ms = Builder.access$300(builder);
        this.session_duration_ms = Builder.access$400(builder);
        this.watch_duration_ms = Builder.access$500(builder);
        this.heartbeat_duration_ms = Builder.access$600(builder);
        this.is_live = Builder.access$700(builder);
        this.playhead_offset_ms = Builder.access$800(builder);
        this.timestamp_ms = Builder.access$900(builder);
        this.watch_percentage = Builder.access$1000(builder);
        this.start_time_ms = Builder.access$1100(builder);
        this.volume = Builder.access$1200(builder);
        this.chat_state = Builder.access$1300(builder);
        this.player_type = Builder.access$1400(builder);
        this.is_looped = Builder.access$1500(builder);
        this.state = Builder.access$1600(builder);
        this.autoplay_setting = Builder.access$1700(builder);
        this.player_width = Builder.access$1800(builder);
        this.player_height = Builder.access$1900(builder);
        this.sequence_number = Builder.access$2000(builder);
        this.video_bitrate = Builder.access$2100(builder);
        this.audio_bitrate = Builder.access$2200(builder);
        this.error = Builder.access$2300(builder);
        this.total_bitrate = Builder.access$2400(builder);
    }
    
    public Playback(final Builder builder, final Playback$1 object) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Playback)) {
            return false;
        }
        final Playback playback = (Playback)o;
        final String id = this.id;
        final String id2 = playback.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long scrubbing_start_ms = this.scrubbing_start_ms;
            final Long scrubbing_start_ms2 = playback.scrubbing_start_ms;
            if (scrubbing_start_ms == scrubbing_start_ms2 || (scrubbing_start_ms != null && scrubbing_start_ms.equals(scrubbing_start_ms2))) {
                final Long scrubbing_end_ms = this.scrubbing_end_ms;
                final Long scrubbing_end_ms2 = playback.scrubbing_end_ms;
                if (scrubbing_end_ms == scrubbing_end_ms2 || (scrubbing_end_ms != null && scrubbing_end_ms.equals(scrubbing_end_ms2))) {
                    final Long session_duration_ms = this.session_duration_ms;
                    final Long session_duration_ms2 = playback.session_duration_ms;
                    if (session_duration_ms == session_duration_ms2 || (session_duration_ms != null && session_duration_ms.equals(session_duration_ms2))) {
                        final Long watch_duration_ms = this.watch_duration_ms;
                        final Long watch_duration_ms2 = playback.watch_duration_ms;
                        if (watch_duration_ms == watch_duration_ms2 || (watch_duration_ms != null && watch_duration_ms.equals(watch_duration_ms2))) {
                            final Long heartbeat_duration_ms = this.heartbeat_duration_ms;
                            final Long heartbeat_duration_ms2 = playback.heartbeat_duration_ms;
                            if (heartbeat_duration_ms == heartbeat_duration_ms2 || (heartbeat_duration_ms != null && heartbeat_duration_ms.equals(heartbeat_duration_ms2))) {
                                final Boolean is_live = this.is_live;
                                final Boolean is_live2 = playback.is_live;
                                if (is_live == is_live2 || (is_live != null && is_live.equals(is_live2))) {
                                    final Long playhead_offset_ms = this.playhead_offset_ms;
                                    final Long playhead_offset_ms2 = playback.playhead_offset_ms;
                                    if (playhead_offset_ms == playhead_offset_ms2 || (playhead_offset_ms != null && playhead_offset_ms.equals(playhead_offset_ms2))) {
                                        final Long timestamp_ms = this.timestamp_ms;
                                        final Long timestamp_ms2 = playback.timestamp_ms;
                                        if (timestamp_ms == timestamp_ms2 || (timestamp_ms != null && timestamp_ms.equals(timestamp_ms2))) {
                                            final Double watch_percentage = this.watch_percentage;
                                            final Double watch_percentage2 = playback.watch_percentage;
                                            if (watch_percentage == watch_percentage2 || (watch_percentage != null && watch_percentage.equals(watch_percentage2))) {
                                                final Long start_time_ms = this.start_time_ms;
                                                final Long start_time_ms2 = playback.start_time_ms;
                                                if (start_time_ms == start_time_ms2 || (start_time_ms != null && start_time_ms.equals(start_time_ms2))) {
                                                    final Long volume = this.volume;
                                                    final Long volume2 = playback.volume;
                                                    if (volume == volume2 || (volume != null && volume.equals(volume2))) {
                                                        final String chat_state = this.chat_state;
                                                        final String chat_state2 = playback.chat_state;
                                                        if (chat_state == chat_state2 || (chat_state != null && chat_state.equals(chat_state2))) {
                                                            final String player_type = this.player_type;
                                                            final String player_type2 = playback.player_type;
                                                            if (player_type == player_type2 || (player_type != null && player_type.equals(player_type2))) {
                                                                final Boolean is_looped = this.is_looped;
                                                                final Boolean is_looped2 = playback.is_looped;
                                                                if (is_looped == is_looped2 || (is_looped != null && is_looped.equals(is_looped2))) {
                                                                    final String state = this.state;
                                                                    final String state2 = playback.state;
                                                                    if (state == state2 || (state != null && state.equals(state2))) {
                                                                        final String autoplay_setting = this.autoplay_setting;
                                                                        final String autoplay_setting2 = playback.autoplay_setting;
                                                                        if (autoplay_setting == autoplay_setting2 || (autoplay_setting != null && autoplay_setting.equals(autoplay_setting2))) {
                                                                            final Integer player_width = this.player_width;
                                                                            final Integer player_width2 = playback.player_width;
                                                                            if (player_width == player_width2 || (player_width != null && player_width.equals(player_width2))) {
                                                                                final Integer player_height = this.player_height;
                                                                                final Integer player_height2 = playback.player_height;
                                                                                if (player_height == player_height2 || (player_height != null && player_height.equals(player_height2))) {
                                                                                    final Integer sequence_number = this.sequence_number;
                                                                                    final Integer sequence_number2 = playback.sequence_number;
                                                                                    if (sequence_number == sequence_number2 || (sequence_number != null && sequence_number.equals(sequence_number2))) {
                                                                                        final Long video_bitrate = this.video_bitrate;
                                                                                        final Long video_bitrate2 = playback.video_bitrate;
                                                                                        if (video_bitrate == video_bitrate2 || (video_bitrate != null && video_bitrate.equals(video_bitrate2))) {
                                                                                            final Long audio_bitrate = this.audio_bitrate;
                                                                                            final Long audio_bitrate2 = playback.audio_bitrate;
                                                                                            if (audio_bitrate == audio_bitrate2 || (audio_bitrate != null && audio_bitrate.equals(audio_bitrate2))) {
                                                                                                final String error = this.error;
                                                                                                final String error2 = playback.error;
                                                                                                if (error == error2 || (error != null && error.equals(error2))) {
                                                                                                    final Long total_bitrate = this.total_bitrate;
                                                                                                    final Long total_bitrate2 = playback.total_bitrate;
                                                                                                    boolean b2 = b;
                                                                                                    if (total_bitrate == total_bitrate2) {
                                                                                                        return b2;
                                                                                                    }
                                                                                                    if (total_bitrate != null && total_bitrate.equals(total_bitrate2)) {
                                                                                                        b2 = b;
                                                                                                        return b2;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Long scrubbing_start_ms = this.scrubbing_start_ms;
        int hashCode3;
        if (scrubbing_start_ms == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = scrubbing_start_ms.hashCode();
        }
        final Long scrubbing_end_ms = this.scrubbing_end_ms;
        int hashCode4;
        if (scrubbing_end_ms == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = scrubbing_end_ms.hashCode();
        }
        final Long session_duration_ms = this.session_duration_ms;
        int hashCode5;
        if (session_duration_ms == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = session_duration_ms.hashCode();
        }
        final Long watch_duration_ms = this.watch_duration_ms;
        int hashCode6;
        if (watch_duration_ms == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = watch_duration_ms.hashCode();
        }
        final Long heartbeat_duration_ms = this.heartbeat_duration_ms;
        int hashCode7;
        if (heartbeat_duration_ms == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = heartbeat_duration_ms.hashCode();
        }
        final Boolean is_live = this.is_live;
        int hashCode8;
        if (is_live == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = is_live.hashCode();
        }
        final Long playhead_offset_ms = this.playhead_offset_ms;
        int hashCode9;
        if (playhead_offset_ms == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = playhead_offset_ms.hashCode();
        }
        final Long timestamp_ms = this.timestamp_ms;
        int hashCode10;
        if (timestamp_ms == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = timestamp_ms.hashCode();
        }
        final Double watch_percentage = this.watch_percentage;
        int hashCode11;
        if (watch_percentage == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = watch_percentage.hashCode();
        }
        final Long start_time_ms = this.start_time_ms;
        int hashCode12;
        if (start_time_ms == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = start_time_ms.hashCode();
        }
        final Long volume = this.volume;
        int hashCode13;
        if (volume == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = volume.hashCode();
        }
        final String chat_state = this.chat_state;
        int hashCode14;
        if (chat_state == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = chat_state.hashCode();
        }
        final String player_type = this.player_type;
        int hashCode15;
        if (player_type == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = player_type.hashCode();
        }
        final Boolean is_looped = this.is_looped;
        int hashCode16;
        if (is_looped == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = is_looped.hashCode();
        }
        final String state = this.state;
        int hashCode17;
        if (state == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = state.hashCode();
        }
        final String autoplay_setting = this.autoplay_setting;
        int hashCode18;
        if (autoplay_setting == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = autoplay_setting.hashCode();
        }
        final Integer player_width = this.player_width;
        int hashCode19;
        if (player_width == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = player_width.hashCode();
        }
        final Integer player_height = this.player_height;
        int hashCode20;
        if (player_height == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = player_height.hashCode();
        }
        final Integer sequence_number = this.sequence_number;
        int hashCode21;
        if (sequence_number == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = sequence_number.hashCode();
        }
        final Long video_bitrate = this.video_bitrate;
        int hashCode22;
        if (video_bitrate == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = video_bitrate.hashCode();
        }
        final Long audio_bitrate = this.audio_bitrate;
        int hashCode23;
        if (audio_bitrate == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = audio_bitrate.hashCode();
        }
        final String error = this.error;
        int hashCode24;
        if (error == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = error.hashCode();
        }
        final Long total_bitrate = this.total_bitrate;
        if (total_bitrate != null) {
            hashCode = total_bitrate.hashCode();
        }
        return ((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Playback{id=");
        t.append(this.id);
        t.append(", scrubbing_start_ms=");
        t.append(this.scrubbing_start_ms);
        t.append(", scrubbing_end_ms=");
        t.append(this.scrubbing_end_ms);
        t.append(", session_duration_ms=");
        t.append(this.session_duration_ms);
        t.append(", watch_duration_ms=");
        t.append(this.watch_duration_ms);
        t.append(", heartbeat_duration_ms=");
        t.append(this.heartbeat_duration_ms);
        t.append(", is_live=");
        t.append(this.is_live);
        t.append(", playhead_offset_ms=");
        t.append(this.playhead_offset_ms);
        t.append(", timestamp_ms=");
        t.append(this.timestamp_ms);
        t.append(", watch_percentage=");
        t.append(this.watch_percentage);
        t.append(", start_time_ms=");
        t.append(this.start_time_ms);
        t.append(", volume=");
        t.append(this.volume);
        t.append(", chat_state=");
        t.append(this.chat_state);
        t.append(", player_type=");
        t.append(this.player_type);
        t.append(", is_looped=");
        t.append(this.is_looped);
        t.append(", state=");
        t.append(this.state);
        t.append(", autoplay_setting=");
        t.append(this.autoplay_setting);
        t.append(", player_width=");
        t.append(this.player_width);
        t.append(", player_height=");
        t.append(this.player_height);
        t.append(", sequence_number=");
        t.append(this.sequence_number);
        t.append(", video_bitrate=");
        t.append(this.video_bitrate);
        t.append(", audio_bitrate=");
        t.append(this.audio_bitrate);
        t.append(", error=");
        t.append(this.error);
        t.append(", total_bitrate=");
        return d.l(t, this.total_bitrate, "}");
    }
    
    public void write(final e e) throws IOException {
        Playback.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Playback>
    {
        private Long audio_bitrate;
        private String autoplay_setting;
        private String chat_state;
        private String error;
        private Long heartbeat_duration_ms;
        private String id;
        private Boolean is_live;
        private Boolean is_looped;
        private Integer player_height;
        private String player_type;
        private Integer player_width;
        private Long playhead_offset_ms;
        private Long scrubbing_end_ms;
        private Long scrubbing_start_ms;
        private Integer sequence_number;
        private Long session_duration_ms;
        private Long start_time_ms;
        private String state;
        private Long timestamp_ms;
        private Long total_bitrate;
        private Long video_bitrate;
        private Long volume;
        private Long watch_duration_ms;
        private Double watch_percentage;
        
        public Builder() {
        }
        
        public Builder(final Playback playback) {
            this.id = playback.id;
            this.scrubbing_start_ms = playback.scrubbing_start_ms;
            this.scrubbing_end_ms = playback.scrubbing_end_ms;
            this.session_duration_ms = playback.session_duration_ms;
            this.watch_duration_ms = playback.watch_duration_ms;
            this.heartbeat_duration_ms = playback.heartbeat_duration_ms;
            this.is_live = playback.is_live;
            this.playhead_offset_ms = playback.playhead_offset_ms;
            this.timestamp_ms = playback.timestamp_ms;
            this.watch_percentage = playback.watch_percentage;
            this.start_time_ms = playback.start_time_ms;
            this.volume = playback.volume;
            this.chat_state = playback.chat_state;
            this.player_type = playback.player_type;
            this.is_looped = playback.is_looped;
            this.state = playback.state;
            this.autoplay_setting = playback.autoplay_setting;
            this.player_width = playback.player_width;
            this.player_height = playback.player_height;
            this.sequence_number = playback.sequence_number;
            this.video_bitrate = playback.video_bitrate;
            this.audio_bitrate = playback.audio_bitrate;
            this.error = playback.error;
            this.total_bitrate = playback.total_bitrate;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static Double access$1000(final Builder builder) {
            return builder.watch_percentage;
        }
        
        public static Long access$1100(final Builder builder) {
            return builder.start_time_ms;
        }
        
        public static Long access$1200(final Builder builder) {
            return builder.volume;
        }
        
        public static String access$1300(final Builder builder) {
            return builder.chat_state;
        }
        
        public static String access$1400(final Builder builder) {
            return builder.player_type;
        }
        
        public static Boolean access$1500(final Builder builder) {
            return builder.is_looped;
        }
        
        public static String access$1600(final Builder builder) {
            return builder.state;
        }
        
        public static String access$1700(final Builder builder) {
            return builder.autoplay_setting;
        }
        
        public static Integer access$1800(final Builder builder) {
            return builder.player_width;
        }
        
        public static Integer access$1900(final Builder builder) {
            return builder.player_height;
        }
        
        public static Long access$200(final Builder builder) {
            return builder.scrubbing_start_ms;
        }
        
        public static Integer access$2000(final Builder builder) {
            return builder.sequence_number;
        }
        
        public static Long access$2100(final Builder builder) {
            return builder.video_bitrate;
        }
        
        public static Long access$2200(final Builder builder) {
            return builder.audio_bitrate;
        }
        
        public static String access$2300(final Builder builder) {
            return builder.error;
        }
        
        public static Long access$2400(final Builder builder) {
            return builder.total_bitrate;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.scrubbing_end_ms;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.session_duration_ms;
        }
        
        public static Long access$500(final Builder builder) {
            return builder.watch_duration_ms;
        }
        
        public static Long access$600(final Builder builder) {
            return builder.heartbeat_duration_ms;
        }
        
        public static Boolean access$700(final Builder builder) {
            return builder.is_live;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.playhead_offset_ms;
        }
        
        public static Long access$900(final Builder builder) {
            return builder.timestamp_ms;
        }
        
        public Builder audio_bitrate(final Long audio_bitrate) {
            this.audio_bitrate = audio_bitrate;
            return this;
        }
        
        public Builder autoplay_setting(final String autoplay_setting) {
            this.autoplay_setting = autoplay_setting;
            return this;
        }
        
        public Playback build() {
            return new Playback(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder chat_state(final String chat_state) {
            this.chat_state = chat_state;
            return this;
        }
        
        public Builder error(final String error) {
            this.error = error;
            return this;
        }
        
        public Builder heartbeat_duration_ms(final Long heartbeat_duration_ms) {
            this.heartbeat_duration_ms = heartbeat_duration_ms;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_live(final Boolean is_live) {
            this.is_live = is_live;
            return this;
        }
        
        public Builder is_looped(final Boolean is_looped) {
            this.is_looped = is_looped;
            return this;
        }
        
        public Builder player_height(final Integer player_height) {
            this.player_height = player_height;
            return this;
        }
        
        public Builder player_type(final String player_type) {
            this.player_type = player_type;
            return this;
        }
        
        public Builder player_width(final Integer player_width) {
            this.player_width = player_width;
            return this;
        }
        
        public Builder playhead_offset_ms(final Long playhead_offset_ms) {
            this.playhead_offset_ms = playhead_offset_ms;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.scrubbing_start_ms = null;
            this.scrubbing_end_ms = null;
            this.session_duration_ms = null;
            this.watch_duration_ms = null;
            this.heartbeat_duration_ms = null;
            this.is_live = null;
            this.playhead_offset_ms = null;
            this.timestamp_ms = null;
            this.watch_percentage = null;
            this.start_time_ms = null;
            this.volume = null;
            this.chat_state = null;
            this.player_type = null;
            this.is_looped = null;
            this.state = null;
            this.autoplay_setting = null;
            this.player_width = null;
            this.player_height = null;
            this.sequence_number = null;
            this.video_bitrate = null;
            this.audio_bitrate = null;
            this.error = null;
            this.total_bitrate = null;
        }
        
        public Builder scrubbing_end_ms(final Long scrubbing_end_ms) {
            this.scrubbing_end_ms = scrubbing_end_ms;
            return this;
        }
        
        public Builder scrubbing_start_ms(final Long scrubbing_start_ms) {
            this.scrubbing_start_ms = scrubbing_start_ms;
            return this;
        }
        
        public Builder sequence_number(final Integer sequence_number) {
            this.sequence_number = sequence_number;
            return this;
        }
        
        public Builder session_duration_ms(final Long session_duration_ms) {
            this.session_duration_ms = session_duration_ms;
            return this;
        }
        
        public Builder start_time_ms(final Long start_time_ms) {
            this.start_time_ms = start_time_ms;
            return this;
        }
        
        public Builder state(final String state) {
            this.state = state;
            return this;
        }
        
        public Builder timestamp_ms(final Long timestamp_ms) {
            this.timestamp_ms = timestamp_ms;
            return this;
        }
        
        public Builder total_bitrate(final Long total_bitrate) {
            this.total_bitrate = total_bitrate;
            return this;
        }
        
        public Builder video_bitrate(final Long video_bitrate) {
            this.video_bitrate = video_bitrate;
            return this;
        }
        
        public Builder volume(final Long volume) {
            this.volume = volume;
            return this;
        }
        
        public Builder watch_duration_ms(final Long watch_duration_ms) {
            this.watch_duration_ms = watch_duration_ms;
            return this;
        }
        
        public Builder watch_percentage(final Double watch_percentage) {
            this.watch_percentage = watch_percentage;
            return this;
        }
    }
    
    public static final class PlaybackAdapter implements a<Playback, Builder>
    {
        private PlaybackAdapter() {
        }
        
        public PlaybackAdapter(final Playback$1 object) {
            this();
        }
        
        public Playback read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Playback read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 10) {
                            builder.total_bitrate(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 11) {
                            builder.error(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 10) {
                            builder.audio_bitrate(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 10) {
                            builder.video_bitrate(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 8) {
                            builder.sequence_number(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 8) {
                            builder.player_height(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 8) {
                            builder.player_width(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.autoplay_setting(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.state(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 2) {
                            builder.is_looped(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.player_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.chat_state(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 10) {
                            builder.volume(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 10) {
                            builder.start_time_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 4) {
                            builder.watch_percentage(e.h());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.timestamp_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.playhead_offset_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.is_live(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.heartbeat_duration_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.watch_duration_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.session_duration_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.scrubbing_end_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.scrubbing_start_ms(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final Playback playback) throws IOException {
            e.X();
            if (playback.id != null) {
                e.O(1, (byte)11);
                e.W(playback.id);
                e.P();
            }
            if (playback.scrubbing_start_ms != null) {
                e.O(2, (byte)10);
                k.w(playback.scrubbing_start_ms, e);
            }
            if (playback.scrubbing_end_ms != null) {
                e.O(3, (byte)10);
                k.w(playback.scrubbing_end_ms, e);
            }
            if (playback.session_duration_ms != null) {
                e.O(4, (byte)10);
                k.w(playback.session_duration_ms, e);
            }
            if (playback.watch_duration_ms != null) {
                e.O(5, (byte)10);
                k.w(playback.watch_duration_ms, e);
            }
            if (playback.heartbeat_duration_ms != null) {
                e.O(6, (byte)10);
                k.w(playback.heartbeat_duration_ms, e);
            }
            if (playback.is_live != null) {
                e.O(7, (byte)2);
                android.support.v4.media.a.A(playback.is_live, e);
            }
            if (playback.playhead_offset_ms != null) {
                e.O(8, (byte)10);
                k.w(playback.playhead_offset_ms, e);
            }
            if (playback.timestamp_ms != null) {
                e.O(9, (byte)10);
                k.w(playback.timestamp_ms, e);
            }
            if (playback.watch_percentage != null) {
                e.O(10, (byte)4);
                d.z(playback.watch_percentage, e);
            }
            if (playback.start_time_ms != null) {
                e.O(11, (byte)10);
                k.w(playback.start_time_ms, e);
            }
            if (playback.volume != null) {
                e.O(12, (byte)10);
                k.w(playback.volume, e);
            }
            if (playback.chat_state != null) {
                e.O(13, (byte)11);
                e.W(playback.chat_state);
                e.P();
            }
            if (playback.player_type != null) {
                e.O(14, (byte)11);
                e.W(playback.player_type);
                e.P();
            }
            if (playback.is_looped != null) {
                e.O(15, (byte)2);
                android.support.v4.media.a.A(playback.is_looped, e);
            }
            if (playback.state != null) {
                e.O(16, (byte)11);
                e.W(playback.state);
                e.P();
            }
            if (playback.autoplay_setting != null) {
                e.O(17, (byte)11);
                e.W(playback.autoplay_setting);
                e.P();
            }
            if (playback.player_width != null) {
                e.O(18, (byte)8);
                aq2.a.x(playback.player_width, e);
            }
            if (playback.player_height != null) {
                e.O(19, (byte)8);
                aq2.a.x(playback.player_height, e);
            }
            if (playback.sequence_number != null) {
                e.O(20, (byte)8);
                aq2.a.x(playback.sequence_number, e);
            }
            if (playback.video_bitrate != null) {
                e.O(21, (byte)10);
                k.w(playback.video_bitrate, e);
            }
            if (playback.audio_bitrate != null) {
                e.O(22, (byte)10);
                k.w(playback.audio_bitrate, e);
            }
            if (playback.error != null) {
                e.O(23, (byte)11);
                e.W(playback.error);
                e.P();
            }
            if (playback.total_bitrate != null) {
                e.O(24, (byte)10);
                k.w(playback.total_bitrate, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Playback)o);
        }
    }
}
