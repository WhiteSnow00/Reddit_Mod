// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Media
{
    public static final a<Media, Builder> ADAPTER;
    public final String autoplay_setting;
    public final String byte_range;
    public final String caption;
    public final String cdn_name;
    public final String cdn_region;
    public final String destination_region;
    public final String domain;
    public final Long duration;
    public final String file_name;
    public final String format;
    public final Boolean has_audio;
    public final Long height;
    public final String id;
    public final Long load_time;
    public final Boolean loaded;
    public final Long max_time_served;
    public final String md5;
    public final String mimetype;
    public final String orientation;
    public final String origin;
    public final String outbound_domain;
    public final String outbound_url;
    public final String packaging_format;
    public final Boolean pinned;
    public final String preview_url;
    public final Boolean reactions_enabled;
    public final Long size;
    public final String source;
    public final Long stream_ended_timestamp;
    public final String stream_private_id;
    public final String stream_public_id;
    public final String thumbnail_url;
    public final Long time;
    public final String type;
    public final Long upload_duration;
    public final String url;
    public final Long width;
    public final Boolean zoomed;
    
    static {
        ADAPTER = (a)new MediaAdapter(null);
    }
    
    private Media(final Builder builder) {
        this.width = Builder.access$100(builder);
        this.height = Builder.access$200(builder);
        this.load_time = Builder.access$300(builder);
        this.id = Builder.access$400(builder);
        this.orientation = Builder.access$500(builder);
        this.duration = Builder.access$600(builder);
        this.time = Builder.access$700(builder);
        this.pinned = Builder.access$800(builder);
        this.max_time_served = Builder.access$900(builder);
        this.mimetype = Builder.access$1000(builder);
        this.size = Builder.access$1100(builder);
        this.url = Builder.access$1200(builder);
        this.source = Builder.access$1300(builder);
        this.upload_duration = Builder.access$1400(builder);
        this.file_name = Builder.access$1500(builder);
        this.type = Builder.access$1600(builder);
        this.thumbnail_url = Builder.access$1700(builder);
        this.cdn_name = Builder.access$1800(builder);
        this.cdn_region = Builder.access$1900(builder);
        this.destination_region = Builder.access$2000(builder);
        this.preview_url = Builder.access$2100(builder);
        this.stream_public_id = Builder.access$2200(builder);
        this.stream_private_id = Builder.access$2300(builder);
        this.stream_ended_timestamp = Builder.access$2400(builder);
        this.md5 = Builder.access$2500(builder);
        this.caption = Builder.access$2600(builder);
        this.outbound_url = Builder.access$2700(builder);
        this.outbound_domain = Builder.access$2800(builder);
        this.origin = Builder.access$2900(builder);
        this.has_audio = Builder.access$3000(builder);
        this.format = Builder.access$3100(builder);
        this.packaging_format = Builder.access$3200(builder);
        this.domain = Builder.access$3300(builder);
        this.byte_range = Builder.access$3400(builder);
        this.reactions_enabled = Builder.access$3500(builder);
        this.loaded = Builder.access$3600(builder);
        this.zoomed = Builder.access$3700(builder);
        this.autoplay_setting = Builder.access$3800(builder);
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
        if (!(o instanceof Media)) {
            return false;
        }
        final Media media = (Media)o;
        final Long width = this.width;
        final Long width2 = media.width;
        if (width == width2 || (width != null && width.equals(width2))) {
            final Long height = this.height;
            final Long height2 = media.height;
            if (height == height2 || (height != null && height.equals(height2))) {
                final Long load_time = this.load_time;
                final Long load_time2 = media.load_time;
                if (load_time == load_time2 || (load_time != null && load_time.equals(load_time2))) {
                    final String id = this.id;
                    final String id2 = media.id;
                    if (id == id2 || (id != null && id.equals(id2))) {
                        final String orientation = this.orientation;
                        final String orientation2 = media.orientation;
                        if (orientation == orientation2 || (orientation != null && orientation.equals(orientation2))) {
                            final Long duration = this.duration;
                            final Long duration2 = media.duration;
                            if (duration == duration2 || (duration != null && duration.equals(duration2))) {
                                final Long time = this.time;
                                final Long time2 = media.time;
                                if (time == time2 || (time != null && time.equals(time2))) {
                                    final Boolean pinned = this.pinned;
                                    final Boolean pinned2 = media.pinned;
                                    if (pinned == pinned2 || (pinned != null && pinned.equals(pinned2))) {
                                        final Long max_time_served = this.max_time_served;
                                        final Long max_time_served2 = media.max_time_served;
                                        if (max_time_served == max_time_served2 || (max_time_served != null && max_time_served.equals(max_time_served2))) {
                                            final String mimetype = this.mimetype;
                                            final String mimetype2 = media.mimetype;
                                            if (mimetype == mimetype2 || (mimetype != null && mimetype.equals(mimetype2))) {
                                                final Long size = this.size;
                                                final Long size2 = media.size;
                                                if (size == size2 || (size != null && size.equals(size2))) {
                                                    final String url = this.url;
                                                    final String url2 = media.url;
                                                    if (url == url2 || (url != null && url.equals(url2))) {
                                                        final String source = this.source;
                                                        final String source2 = media.source;
                                                        if (source == source2 || (source != null && source.equals(source2))) {
                                                            final Long upload_duration = this.upload_duration;
                                                            final Long upload_duration2 = media.upload_duration;
                                                            if (upload_duration == upload_duration2 || (upload_duration != null && upload_duration.equals(upload_duration2))) {
                                                                final String file_name = this.file_name;
                                                                final String file_name2 = media.file_name;
                                                                if (file_name == file_name2 || (file_name != null && file_name.equals(file_name2))) {
                                                                    final String type = this.type;
                                                                    final String type2 = media.type;
                                                                    if (type == type2 || (type != null && type.equals(type2))) {
                                                                        final String thumbnail_url = this.thumbnail_url;
                                                                        final String thumbnail_url2 = media.thumbnail_url;
                                                                        if (thumbnail_url == thumbnail_url2 || (thumbnail_url != null && thumbnail_url.equals(thumbnail_url2))) {
                                                                            final String cdn_name = this.cdn_name;
                                                                            final String cdn_name2 = media.cdn_name;
                                                                            if (cdn_name == cdn_name2 || (cdn_name != null && cdn_name.equals(cdn_name2))) {
                                                                                final String cdn_region = this.cdn_region;
                                                                                final String cdn_region2 = media.cdn_region;
                                                                                if (cdn_region == cdn_region2 || (cdn_region != null && cdn_region.equals(cdn_region2))) {
                                                                                    final String destination_region = this.destination_region;
                                                                                    final String destination_region2 = media.destination_region;
                                                                                    if (destination_region == destination_region2 || (destination_region != null && destination_region.equals(destination_region2))) {
                                                                                        final String preview_url = this.preview_url;
                                                                                        final String preview_url2 = media.preview_url;
                                                                                        if (preview_url == preview_url2 || (preview_url != null && preview_url.equals(preview_url2))) {
                                                                                            final String stream_public_id = this.stream_public_id;
                                                                                            final String stream_public_id2 = media.stream_public_id;
                                                                                            if (stream_public_id == stream_public_id2 || (stream_public_id != null && stream_public_id.equals(stream_public_id2))) {
                                                                                                final String stream_private_id = this.stream_private_id;
                                                                                                final String stream_private_id2 = media.stream_private_id;
                                                                                                if (stream_private_id == stream_private_id2 || (stream_private_id != null && stream_private_id.equals(stream_private_id2))) {
                                                                                                    final Long stream_ended_timestamp = this.stream_ended_timestamp;
                                                                                                    final Long stream_ended_timestamp2 = media.stream_ended_timestamp;
                                                                                                    if (stream_ended_timestamp == stream_ended_timestamp2 || (stream_ended_timestamp != null && stream_ended_timestamp.equals(stream_ended_timestamp2))) {
                                                                                                        final String md5 = this.md5;
                                                                                                        final String md6 = media.md5;
                                                                                                        if (md5 == md6 || (md5 != null && md5.equals(md6))) {
                                                                                                            final String caption = this.caption;
                                                                                                            final String caption2 = media.caption;
                                                                                                            if (caption == caption2 || (caption != null && caption.equals(caption2))) {
                                                                                                                final String outbound_url = this.outbound_url;
                                                                                                                final String outbound_url2 = media.outbound_url;
                                                                                                                if (outbound_url == outbound_url2 || (outbound_url != null && outbound_url.equals(outbound_url2))) {
                                                                                                                    final String outbound_domain = this.outbound_domain;
                                                                                                                    final String outbound_domain2 = media.outbound_domain;
                                                                                                                    if (outbound_domain == outbound_domain2 || (outbound_domain != null && outbound_domain.equals(outbound_domain2))) {
                                                                                                                        final String origin = this.origin;
                                                                                                                        final String origin2 = media.origin;
                                                                                                                        if (origin == origin2 || (origin != null && origin.equals(origin2))) {
                                                                                                                            final Boolean has_audio = this.has_audio;
                                                                                                                            final Boolean has_audio2 = media.has_audio;
                                                                                                                            if (has_audio == has_audio2 || (has_audio != null && has_audio.equals(has_audio2))) {
                                                                                                                                final String format = this.format;
                                                                                                                                final String format2 = media.format;
                                                                                                                                if (format == format2 || (format != null && format.equals(format2))) {
                                                                                                                                    final String packaging_format = this.packaging_format;
                                                                                                                                    final String packaging_format2 = media.packaging_format;
                                                                                                                                    if (packaging_format == packaging_format2 || (packaging_format != null && packaging_format.equals(packaging_format2))) {
                                                                                                                                        final String domain = this.domain;
                                                                                                                                        final String domain2 = media.domain;
                                                                                                                                        if (domain == domain2 || (domain != null && domain.equals(domain2))) {
                                                                                                                                            final String byte_range = this.byte_range;
                                                                                                                                            final String byte_range2 = media.byte_range;
                                                                                                                                            if (byte_range == byte_range2 || (byte_range != null && byte_range.equals(byte_range2))) {
                                                                                                                                                final Boolean reactions_enabled = this.reactions_enabled;
                                                                                                                                                final Boolean reactions_enabled2 = media.reactions_enabled;
                                                                                                                                                if (reactions_enabled == reactions_enabled2 || (reactions_enabled != null && reactions_enabled.equals(reactions_enabled2))) {
                                                                                                                                                    final Boolean loaded = this.loaded;
                                                                                                                                                    final Boolean loaded2 = media.loaded;
                                                                                                                                                    if (loaded == loaded2 || (loaded != null && loaded.equals(loaded2))) {
                                                                                                                                                        final Boolean zoomed = this.zoomed;
                                                                                                                                                        final Boolean zoomed2 = media.zoomed;
                                                                                                                                                        if (zoomed == zoomed2 || (zoomed != null && zoomed.equals(zoomed2))) {
                                                                                                                                                            final String autoplay_setting = this.autoplay_setting;
                                                                                                                                                            final String autoplay_setting2 = media.autoplay_setting;
                                                                                                                                                            boolean b2 = b;
                                                                                                                                                            if (autoplay_setting == autoplay_setting2) {
                                                                                                                                                                return b2;
                                                                                                                                                            }
                                                                                                                                                            if (autoplay_setting != null && autoplay_setting.equals(autoplay_setting2)) {
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
        final Long width = this.width;
        int hashCode = 0;
        int hashCode2;
        if (width == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = width.hashCode();
        }
        final Long height = this.height;
        int hashCode3;
        if (height == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = height.hashCode();
        }
        final Long load_time = this.load_time;
        int hashCode4;
        if (load_time == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = load_time.hashCode();
        }
        final String id = this.id;
        int hashCode5;
        if (id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = id.hashCode();
        }
        final String orientation = this.orientation;
        int hashCode6;
        if (orientation == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = orientation.hashCode();
        }
        final Long duration = this.duration;
        int hashCode7;
        if (duration == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = duration.hashCode();
        }
        final Long time = this.time;
        int hashCode8;
        if (time == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = time.hashCode();
        }
        final Boolean pinned = this.pinned;
        int hashCode9;
        if (pinned == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = pinned.hashCode();
        }
        final Long max_time_served = this.max_time_served;
        int hashCode10;
        if (max_time_served == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = max_time_served.hashCode();
        }
        final String mimetype = this.mimetype;
        int hashCode11;
        if (mimetype == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = mimetype.hashCode();
        }
        final Long size = this.size;
        int hashCode12;
        if (size == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = size.hashCode();
        }
        final String url = this.url;
        int hashCode13;
        if (url == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = url.hashCode();
        }
        final String source = this.source;
        int hashCode14;
        if (source == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = source.hashCode();
        }
        final Long upload_duration = this.upload_duration;
        int hashCode15;
        if (upload_duration == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = upload_duration.hashCode();
        }
        final String file_name = this.file_name;
        int hashCode16;
        if (file_name == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = file_name.hashCode();
        }
        final String type = this.type;
        int hashCode17;
        if (type == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = type.hashCode();
        }
        final String thumbnail_url = this.thumbnail_url;
        int hashCode18;
        if (thumbnail_url == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = thumbnail_url.hashCode();
        }
        final String cdn_name = this.cdn_name;
        int hashCode19;
        if (cdn_name == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = cdn_name.hashCode();
        }
        final String cdn_region = this.cdn_region;
        int hashCode20;
        if (cdn_region == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = cdn_region.hashCode();
        }
        final String destination_region = this.destination_region;
        int hashCode21;
        if (destination_region == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = destination_region.hashCode();
        }
        final String preview_url = this.preview_url;
        int hashCode22;
        if (preview_url == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = preview_url.hashCode();
        }
        final String stream_public_id = this.stream_public_id;
        int hashCode23;
        if (stream_public_id == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = stream_public_id.hashCode();
        }
        final String stream_private_id = this.stream_private_id;
        int hashCode24;
        if (stream_private_id == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = stream_private_id.hashCode();
        }
        final Long stream_ended_timestamp = this.stream_ended_timestamp;
        int hashCode25;
        if (stream_ended_timestamp == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = stream_ended_timestamp.hashCode();
        }
        final String md5 = this.md5;
        int hashCode26;
        if (md5 == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = md5.hashCode();
        }
        final String caption = this.caption;
        int hashCode27;
        if (caption == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = caption.hashCode();
        }
        final String outbound_url = this.outbound_url;
        int hashCode28;
        if (outbound_url == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = outbound_url.hashCode();
        }
        final String outbound_domain = this.outbound_domain;
        int hashCode29;
        if (outbound_domain == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = outbound_domain.hashCode();
        }
        final String origin = this.origin;
        int hashCode30;
        if (origin == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = origin.hashCode();
        }
        final Boolean has_audio = this.has_audio;
        int hashCode31;
        if (has_audio == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = has_audio.hashCode();
        }
        final String format = this.format;
        int hashCode32;
        if (format == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = format.hashCode();
        }
        final String packaging_format = this.packaging_format;
        int hashCode33;
        if (packaging_format == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = packaging_format.hashCode();
        }
        final String domain = this.domain;
        int hashCode34;
        if (domain == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = domain.hashCode();
        }
        final String byte_range = this.byte_range;
        int hashCode35;
        if (byte_range == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = byte_range.hashCode();
        }
        final Boolean reactions_enabled = this.reactions_enabled;
        int hashCode36;
        if (reactions_enabled == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = reactions_enabled.hashCode();
        }
        final Boolean loaded = this.loaded;
        int hashCode37;
        if (loaded == null) {
            hashCode37 = 0;
        }
        else {
            hashCode37 = loaded.hashCode();
        }
        final Boolean zoomed = this.zoomed;
        int hashCode38;
        if (zoomed == null) {
            hashCode38 = 0;
        }
        else {
            hashCode38 = zoomed.hashCode();
        }
        final String autoplay_setting = this.autoplay_setting;
        if (autoplay_setting != null) {
            hashCode = autoplay_setting.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode34) * -2128831035 ^ hashCode35) * -2128831035 ^ hashCode36) * -2128831035 ^ hashCode37) * -2128831035 ^ hashCode38) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Media{width=");
        k.append(this.width);
        k.append(", height=");
        k.append(this.height);
        k.append(", load_time=");
        k.append(this.load_time);
        k.append(", id=");
        k.append(this.id);
        k.append(", orientation=");
        k.append(this.orientation);
        k.append(", duration=");
        k.append(this.duration);
        k.append(", time=");
        k.append(this.time);
        k.append(", pinned=");
        k.append(this.pinned);
        k.append(", max_time_served=");
        k.append(this.max_time_served);
        k.append(", mimetype=");
        k.append(this.mimetype);
        k.append(", size=");
        k.append(this.size);
        k.append(", url=");
        k.append(this.url);
        k.append(", source=");
        k.append(this.source);
        k.append(", upload_duration=");
        k.append(this.upload_duration);
        k.append(", file_name=");
        k.append(this.file_name);
        k.append(", type=");
        k.append(this.type);
        k.append(", thumbnail_url=");
        k.append(this.thumbnail_url);
        k.append(", cdn_name=");
        k.append(this.cdn_name);
        k.append(", cdn_region=");
        k.append(this.cdn_region);
        k.append(", destination_region=");
        k.append(this.destination_region);
        k.append(", preview_url=");
        k.append(this.preview_url);
        k.append(", stream_public_id=");
        k.append(this.stream_public_id);
        k.append(", stream_private_id=");
        k.append(this.stream_private_id);
        k.append(", stream_ended_timestamp=");
        k.append(this.stream_ended_timestamp);
        k.append(", md5=");
        k.append(this.md5);
        k.append(", caption=");
        k.append(this.caption);
        k.append(", outbound_url=");
        k.append(this.outbound_url);
        k.append(", outbound_domain=");
        k.append(this.outbound_domain);
        k.append(", origin=");
        k.append(this.origin);
        k.append(", has_audio=");
        k.append(this.has_audio);
        k.append(", format=");
        k.append(this.format);
        k.append(", packaging_format=");
        k.append(this.packaging_format);
        k.append(", domain=");
        k.append(this.domain);
        k.append(", byte_range=");
        k.append(this.byte_range);
        k.append(", reactions_enabled=");
        k.append(this.reactions_enabled);
        k.append(", loaded=");
        k.append(this.loaded);
        k.append(", zoomed=");
        k.append(this.zoomed);
        k.append(", autoplay_setting=");
        return b.j(k, this.autoplay_setting, "}");
    }
    
    public void write(final e e) throws IOException {
        Media.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Media>
    {
        private String autoplay_setting;
        private String byte_range;
        private String caption;
        private String cdn_name;
        private String cdn_region;
        private String destination_region;
        private String domain;
        private Long duration;
        private String file_name;
        private String format;
        private Boolean has_audio;
        private Long height;
        private String id;
        private Long load_time;
        private Boolean loaded;
        private Long max_time_served;
        private String md5;
        private String mimetype;
        private String orientation;
        private String origin;
        private String outbound_domain;
        private String outbound_url;
        private String packaging_format;
        private Boolean pinned;
        private String preview_url;
        private Boolean reactions_enabled;
        private Long size;
        private String source;
        private Long stream_ended_timestamp;
        private String stream_private_id;
        private String stream_public_id;
        private String thumbnail_url;
        private Long time;
        private String type;
        private Long upload_duration;
        private String url;
        private Long width;
        private Boolean zoomed;
        
        public Builder() {
        }
        
        public Builder(final Media media) {
            this.width = media.width;
            this.height = media.height;
            this.load_time = media.load_time;
            this.id = media.id;
            this.orientation = media.orientation;
            this.duration = media.duration;
            this.time = media.time;
            this.pinned = media.pinned;
            this.max_time_served = media.max_time_served;
            this.mimetype = media.mimetype;
            this.size = media.size;
            this.url = media.url;
            this.source = media.source;
            this.upload_duration = media.upload_duration;
            this.file_name = media.file_name;
            this.type = media.type;
            this.thumbnail_url = media.thumbnail_url;
            this.cdn_name = media.cdn_name;
            this.cdn_region = media.cdn_region;
            this.destination_region = media.destination_region;
            this.preview_url = media.preview_url;
            this.stream_public_id = media.stream_public_id;
            this.stream_private_id = media.stream_private_id;
            this.stream_ended_timestamp = media.stream_ended_timestamp;
            this.md5 = media.md5;
            this.caption = media.caption;
            this.outbound_url = media.outbound_url;
            this.outbound_domain = media.outbound_domain;
            this.origin = media.origin;
            this.has_audio = media.has_audio;
            this.format = media.format;
            this.packaging_format = media.packaging_format;
            this.domain = media.domain;
            this.byte_range = media.byte_range;
            this.reactions_enabled = media.reactions_enabled;
            this.loaded = media.loaded;
            this.zoomed = media.zoomed;
            this.autoplay_setting = media.autoplay_setting;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.width;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.mimetype;
        }
        
        public static /* synthetic */ Long access$1100(final Builder builder) {
            return builder.size;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.url;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.source;
        }
        
        public static /* synthetic */ Long access$1400(final Builder builder) {
            return builder.upload_duration;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.file_name;
        }
        
        public static /* synthetic */ String access$1600(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$1700(final Builder builder) {
            return builder.thumbnail_url;
        }
        
        public static /* synthetic */ String access$1800(final Builder builder) {
            return builder.cdn_name;
        }
        
        public static /* synthetic */ String access$1900(final Builder builder) {
            return builder.cdn_region;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.height;
        }
        
        public static /* synthetic */ String access$2000(final Builder builder) {
            return builder.destination_region;
        }
        
        public static /* synthetic */ String access$2100(final Builder builder) {
            return builder.preview_url;
        }
        
        public static /* synthetic */ String access$2200(final Builder builder) {
            return builder.stream_public_id;
        }
        
        public static /* synthetic */ String access$2300(final Builder builder) {
            return builder.stream_private_id;
        }
        
        public static /* synthetic */ Long access$2400(final Builder builder) {
            return builder.stream_ended_timestamp;
        }
        
        public static /* synthetic */ String access$2500(final Builder builder) {
            return builder.md5;
        }
        
        public static /* synthetic */ String access$2600(final Builder builder) {
            return builder.caption;
        }
        
        public static /* synthetic */ String access$2700(final Builder builder) {
            return builder.outbound_url;
        }
        
        public static /* synthetic */ String access$2800(final Builder builder) {
            return builder.outbound_domain;
        }
        
        public static /* synthetic */ String access$2900(final Builder builder) {
            return builder.origin;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.load_time;
        }
        
        public static /* synthetic */ Boolean access$3000(final Builder builder) {
            return builder.has_audio;
        }
        
        public static /* synthetic */ String access$3100(final Builder builder) {
            return builder.format;
        }
        
        public static /* synthetic */ String access$3200(final Builder builder) {
            return builder.packaging_format;
        }
        
        public static /* synthetic */ String access$3300(final Builder builder) {
            return builder.domain;
        }
        
        public static /* synthetic */ String access$3400(final Builder builder) {
            return builder.byte_range;
        }
        
        public static /* synthetic */ Boolean access$3500(final Builder builder) {
            return builder.reactions_enabled;
        }
        
        public static /* synthetic */ Boolean access$3600(final Builder builder) {
            return builder.loaded;
        }
        
        public static /* synthetic */ Boolean access$3700(final Builder builder) {
            return builder.zoomed;
        }
        
        public static /* synthetic */ String access$3800(final Builder builder) {
            return builder.autoplay_setting;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.orientation;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.duration;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.time;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.pinned;
        }
        
        public static /* synthetic */ Long access$900(final Builder builder) {
            return builder.max_time_served;
        }
        
        public Builder autoplay_setting(final String autoplay_setting) {
            this.autoplay_setting = autoplay_setting;
            return this;
        }
        
        public Media build() {
            return new Media(this, null);
        }
        
        public Builder byte_range(final String byte_range) {
            this.byte_range = byte_range;
            return this;
        }
        
        public Builder caption(final String caption) {
            this.caption = caption;
            return this;
        }
        
        public Builder cdn_name(final String cdn_name) {
            this.cdn_name = cdn_name;
            return this;
        }
        
        public Builder cdn_region(final String cdn_region) {
            this.cdn_region = cdn_region;
            return this;
        }
        
        public Builder destination_region(final String destination_region) {
            this.destination_region = destination_region;
            return this;
        }
        
        public Builder domain(final String domain) {
            this.domain = domain;
            return this;
        }
        
        public Builder duration(final Long duration) {
            this.duration = duration;
            return this;
        }
        
        public Builder file_name(final String file_name) {
            this.file_name = file_name;
            return this;
        }
        
        public Builder format(final String format) {
            this.format = format;
            return this;
        }
        
        public Builder has_audio(final Boolean has_audio) {
            this.has_audio = has_audio;
            return this;
        }
        
        public Builder height(final Long height) {
            this.height = height;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder load_time(final Long load_time) {
            this.load_time = load_time;
            return this;
        }
        
        public Builder loaded(final Boolean loaded) {
            this.loaded = loaded;
            return this;
        }
        
        public Builder max_time_served(final Long max_time_served) {
            this.max_time_served = max_time_served;
            return this;
        }
        
        public Builder md5(final String md5) {
            this.md5 = md5;
            return this;
        }
        
        public Builder mimetype(final String mimetype) {
            this.mimetype = mimetype;
            return this;
        }
        
        public Builder orientation(final String orientation) {
            this.orientation = orientation;
            return this;
        }
        
        public Builder origin(final String origin) {
            this.origin = origin;
            return this;
        }
        
        public Builder outbound_domain(final String outbound_domain) {
            this.outbound_domain = outbound_domain;
            return this;
        }
        
        public Builder outbound_url(final String outbound_url) {
            this.outbound_url = outbound_url;
            return this;
        }
        
        public Builder packaging_format(final String packaging_format) {
            this.packaging_format = packaging_format;
            return this;
        }
        
        public Builder pinned(final Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        
        public Builder preview_url(final String preview_url) {
            this.preview_url = preview_url;
            return this;
        }
        
        public Builder reactions_enabled(final Boolean reactions_enabled) {
            this.reactions_enabled = reactions_enabled;
            return this;
        }
        
        public void reset() {
            this.width = null;
            this.height = null;
            this.load_time = null;
            this.id = null;
            this.orientation = null;
            this.duration = null;
            this.time = null;
            this.pinned = null;
            this.max_time_served = null;
            this.mimetype = null;
            this.size = null;
            this.url = null;
            this.source = null;
            this.upload_duration = null;
            this.file_name = null;
            this.type = null;
            this.thumbnail_url = null;
            this.cdn_name = null;
            this.cdn_region = null;
            this.destination_region = null;
            this.preview_url = null;
            this.stream_public_id = null;
            this.stream_private_id = null;
            this.stream_ended_timestamp = null;
            this.md5 = null;
            this.caption = null;
            this.outbound_url = null;
            this.outbound_domain = null;
            this.origin = null;
            this.has_audio = null;
            this.format = null;
            this.packaging_format = null;
            this.domain = null;
            this.byte_range = null;
            this.reactions_enabled = null;
            this.loaded = null;
            this.zoomed = null;
            this.autoplay_setting = null;
        }
        
        public Builder size(final Long size) {
            this.size = size;
            return this;
        }
        
        public Builder source(final String source) {
            this.source = source;
            return this;
        }
        
        public Builder stream_ended_timestamp(final Long stream_ended_timestamp) {
            this.stream_ended_timestamp = stream_ended_timestamp;
            return this;
        }
        
        public Builder stream_private_id(final String stream_private_id) {
            this.stream_private_id = stream_private_id;
            return this;
        }
        
        public Builder stream_public_id(final String stream_public_id) {
            this.stream_public_id = stream_public_id;
            return this;
        }
        
        public Builder thumbnail_url(final String thumbnail_url) {
            this.thumbnail_url = thumbnail_url;
            return this;
        }
        
        public Builder time(final Long time) {
            this.time = time;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder upload_duration(final Long upload_duration) {
            this.upload_duration = upload_duration;
            return this;
        }
        
        public Builder url(final String url) {
            this.url = url;
            return this;
        }
        
        public Builder width(final Long width) {
            this.width = width;
            return this;
        }
        
        public Builder zoomed(final Boolean zoomed) {
            this.zoomed = zoomed;
            return this;
        }
    }
    
    public static final class MediaAdapter implements a<Media, Builder>
    {
        private MediaAdapter() {
        }
        
        public Media read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Media read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 38: {
                        if (a == 11) {
                            builder.autoplay_setting(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 37: {
                        if (a == 2) {
                            builder.zoomed(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 36: {
                        if (a == 2) {
                            builder.loaded(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 35: {
                        if (a == 2) {
                            builder.reactions_enabled(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 34: {
                        if (a == 11) {
                            builder.byte_range(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 33: {
                        if (a == 11) {
                            builder.domain(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 32: {
                        if (a == 11) {
                            builder.packaging_format(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 31: {
                        if (a == 11) {
                            builder.format(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 30: {
                        if (a == 2) {
                            builder.has_audio(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 29: {
                        if (a == 11) {
                            builder.origin(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 28: {
                        if (a == 11) {
                            builder.outbound_domain(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 11) {
                            builder.outbound_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.caption(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 11) {
                            builder.md5(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 10) {
                            builder.stream_ended_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 11) {
                            builder.stream_private_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 11) {
                            builder.stream_public_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 11) {
                            builder.preview_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 11) {
                            builder.destination_region(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 11) {
                            builder.cdn_region(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 11) {
                            builder.cdn_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.thumbnail_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.file_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.upload_duration(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 10) {
                            builder.size(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.mimetype(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.max_time_served(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.pinned(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.time(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.duration(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.orientation(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.load_time(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.height(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 10) {
                            builder.width(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Media media) throws IOException {
            e.a0();
            if (media.width != null) {
                e.N(1, (byte)10);
                a.r(media.width, e);
            }
            if (media.height != null) {
                e.N(2, (byte)10);
                a.r(media.height, e);
            }
            if (media.load_time != null) {
                e.N(3, (byte)10);
                a.r(media.load_time, e);
            }
            if (media.id != null) {
                e.N(4, (byte)11);
                e.Z(media.id);
                e.O();
            }
            if (media.orientation != null) {
                e.N(5, (byte)11);
                e.Z(media.orientation);
                e.O();
            }
            if (media.duration != null) {
                e.N(6, (byte)10);
                a.r(media.duration, e);
            }
            if (media.time != null) {
                e.N(7, (byte)10);
                a.r(media.time, e);
            }
            if (media.pinned != null) {
                e.N(8, (byte)2);
                d.z(media.pinned, e);
            }
            if (media.max_time_served != null) {
                e.N(9, (byte)10);
                a.r(media.max_time_served, e);
            }
            if (media.mimetype != null) {
                e.N(10, (byte)11);
                e.Z(media.mimetype);
                e.O();
            }
            if (media.size != null) {
                e.N(11, (byte)10);
                a.r(media.size, e);
            }
            if (media.url != null) {
                e.N(12, (byte)11);
                e.Z(media.url);
                e.O();
            }
            if (media.source != null) {
                e.N(13, (byte)11);
                e.Z(media.source);
                e.O();
            }
            if (media.upload_duration != null) {
                e.N(14, (byte)10);
                a.r(media.upload_duration, e);
            }
            if (media.file_name != null) {
                e.N(15, (byte)11);
                e.Z(media.file_name);
                e.O();
            }
            if (media.type != null) {
                e.N(16, (byte)11);
                e.Z(media.type);
                e.O();
            }
            if (media.thumbnail_url != null) {
                e.N(17, (byte)11);
                e.Z(media.thumbnail_url);
                e.O();
            }
            if (media.cdn_name != null) {
                e.N(18, (byte)11);
                e.Z(media.cdn_name);
                e.O();
            }
            if (media.cdn_region != null) {
                e.N(19, (byte)11);
                e.Z(media.cdn_region);
                e.O();
            }
            if (media.destination_region != null) {
                e.N(20, (byte)11);
                e.Z(media.destination_region);
                e.O();
            }
            if (media.preview_url != null) {
                e.N(21, (byte)11);
                e.Z(media.preview_url);
                e.O();
            }
            if (media.stream_public_id != null) {
                e.N(22, (byte)11);
                e.Z(media.stream_public_id);
                e.O();
            }
            if (media.stream_private_id != null) {
                e.N(23, (byte)11);
                e.Z(media.stream_private_id);
                e.O();
            }
            if (media.stream_ended_timestamp != null) {
                e.N(24, (byte)10);
                a.r(media.stream_ended_timestamp, e);
            }
            if (media.md5 != null) {
                e.N(25, (byte)11);
                e.Z(media.md5);
                e.O();
            }
            if (media.caption != null) {
                e.N(26, (byte)11);
                e.Z(media.caption);
                e.O();
            }
            if (media.outbound_url != null) {
                e.N(27, (byte)11);
                e.Z(media.outbound_url);
                e.O();
            }
            if (media.outbound_domain != null) {
                e.N(28, (byte)11);
                e.Z(media.outbound_domain);
                e.O();
            }
            if (media.origin != null) {
                e.N(29, (byte)11);
                e.Z(media.origin);
                e.O();
            }
            if (media.has_audio != null) {
                e.N(30, (byte)2);
                d.z(media.has_audio, e);
            }
            if (media.format != null) {
                e.N(31, (byte)11);
                e.Z(media.format);
                e.O();
            }
            if (media.packaging_format != null) {
                e.N(32, (byte)11);
                e.Z(media.packaging_format);
                e.O();
            }
            if (media.domain != null) {
                e.N(33, (byte)11);
                e.Z(media.domain);
                e.O();
            }
            if (media.byte_range != null) {
                e.N(34, (byte)11);
                e.Z(media.byte_range);
                e.O();
            }
            if (media.reactions_enabled != null) {
                e.N(35, (byte)2);
                d.z(media.reactions_enabled, e);
            }
            if (media.loaded != null) {
                e.N(36, (byte)2);
                d.z(media.loaded, e);
            }
            if (media.zoomed != null) {
                e.N(37, (byte)2);
                d.z(media.zoomed, e);
            }
            if (media.autoplay_setting != null) {
                e.N(38, (byte)11);
                e.Z(media.autoplay_setting);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
