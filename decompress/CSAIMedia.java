// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class CSAIMedia
{
    public static final a<CSAIMedia, CSAIMedia.CSAIMedia$Builder> ADAPTER;
    public final String destination_queue_name;
    public final Integer error_code;
    public final String error_message;
    public final Boolean match;
    public final String media_url;
    public final String origin_queue_name;
    public final String retry_media_url;
    public final String tracking_id;
    public final String violation_source;
    public final List<String> violation_types;
    
    static {
        ADAPTER = (a)new CSAIMedia.CSAIMedia$CSAIMediaAdapter((CSAIMedia$1)null);
    }
    
    private CSAIMedia(final CSAIMedia.CSAIMedia$Builder csaiMedia$Builder) {
        this.tracking_id = CSAIMedia.CSAIMedia$Builder.access$100(csaiMedia$Builder);
        this.match = CSAIMedia.CSAIMedia$Builder.access$200(csaiMedia$Builder);
        List<String> unmodifiableList;
        if (CSAIMedia.CSAIMedia$Builder.access$300(csaiMedia$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)CSAIMedia.CSAIMedia$Builder.access$300(csaiMedia$Builder));
        }
        this.violation_types = unmodifiableList;
        this.violation_source = CSAIMedia.CSAIMedia$Builder.access$400(csaiMedia$Builder);
        this.error_message = CSAIMedia.CSAIMedia$Builder.access$500(csaiMedia$Builder);
        this.error_code = CSAIMedia.CSAIMedia$Builder.access$600(csaiMedia$Builder);
        this.destination_queue_name = CSAIMedia.CSAIMedia$Builder.access$700(csaiMedia$Builder);
        this.origin_queue_name = CSAIMedia.CSAIMedia$Builder.access$800(csaiMedia$Builder);
        this.media_url = CSAIMedia.CSAIMedia$Builder.access$900(csaiMedia$Builder);
        this.retry_media_url = CSAIMedia.CSAIMedia$Builder.access$1000(csaiMedia$Builder);
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
        if (!(o instanceof CSAIMedia)) {
            return false;
        }
        final CSAIMedia csaiMedia = (CSAIMedia)o;
        final String tracking_id = this.tracking_id;
        final String tracking_id2 = csaiMedia.tracking_id;
        if (tracking_id == tracking_id2 || (tracking_id != null && tracking_id.equals(tracking_id2))) {
            final Boolean match = this.match;
            final Boolean match2 = csaiMedia.match;
            if (match == match2 || (match != null && match.equals(match2))) {
                final List<String> violation_types = this.violation_types;
                final List<String> violation_types2 = csaiMedia.violation_types;
                if (violation_types == violation_types2 || (violation_types != null && violation_types.equals(violation_types2))) {
                    final String violation_source = this.violation_source;
                    final String violation_source2 = csaiMedia.violation_source;
                    if (violation_source == violation_source2 || (violation_source != null && violation_source.equals(violation_source2))) {
                        final String error_message = this.error_message;
                        final String error_message2 = csaiMedia.error_message;
                        if (error_message == error_message2 || (error_message != null && error_message.equals(error_message2))) {
                            final Integer error_code = this.error_code;
                            final Integer error_code2 = csaiMedia.error_code;
                            if (error_code == error_code2 || (error_code != null && error_code.equals(error_code2))) {
                                final String destination_queue_name = this.destination_queue_name;
                                final String destination_queue_name2 = csaiMedia.destination_queue_name;
                                if (destination_queue_name == destination_queue_name2 || (destination_queue_name != null && destination_queue_name.equals(destination_queue_name2))) {
                                    final String origin_queue_name = this.origin_queue_name;
                                    final String origin_queue_name2 = csaiMedia.origin_queue_name;
                                    if (origin_queue_name == origin_queue_name2 || (origin_queue_name != null && origin_queue_name.equals(origin_queue_name2))) {
                                        final String media_url = this.media_url;
                                        final String media_url2 = csaiMedia.media_url;
                                        if (media_url == media_url2 || (media_url != null && media_url.equals(media_url2))) {
                                            final String retry_media_url = this.retry_media_url;
                                            final String retry_media_url2 = csaiMedia.retry_media_url;
                                            boolean b2 = b;
                                            if (retry_media_url == retry_media_url2) {
                                                return b2;
                                            }
                                            if (retry_media_url != null && retry_media_url.equals(retry_media_url2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String tracking_id = this.tracking_id;
        int hashCode = 0;
        int hashCode2;
        if (tracking_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tracking_id.hashCode();
        }
        final Boolean match = this.match;
        int hashCode3;
        if (match == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = match.hashCode();
        }
        final List<String> violation_types = this.violation_types;
        int hashCode4;
        if (violation_types == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = violation_types.hashCode();
        }
        final String violation_source = this.violation_source;
        int hashCode5;
        if (violation_source == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = violation_source.hashCode();
        }
        final String error_message = this.error_message;
        int hashCode6;
        if (error_message == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = error_message.hashCode();
        }
        final Integer error_code = this.error_code;
        int hashCode7;
        if (error_code == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = error_code.hashCode();
        }
        final String destination_queue_name = this.destination_queue_name;
        int hashCode8;
        if (destination_queue_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = destination_queue_name.hashCode();
        }
        final String origin_queue_name = this.origin_queue_name;
        int hashCode9;
        if (origin_queue_name == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = origin_queue_name.hashCode();
        }
        final String media_url = this.media_url;
        int hashCode10;
        if (media_url == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = media_url.hashCode();
        }
        final String retry_media_url = this.retry_media_url;
        if (retry_media_url != null) {
            hashCode = retry_media_url.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CSAIMedia{tracking_id=");
        k.append(this.tracking_id);
        k.append(", match=");
        k.append(this.match);
        k.append(", violation_types=");
        k.append(this.violation_types);
        k.append(", violation_source=");
        k.append(this.violation_source);
        k.append(", error_message=");
        k.append(this.error_message);
        k.append(", error_code=");
        k.append(this.error_code);
        k.append(", destination_queue_name=");
        k.append(this.destination_queue_name);
        k.append(", origin_queue_name=");
        k.append(this.origin_queue_name);
        k.append(", media_url=");
        k.append(this.media_url);
        k.append(", retry_media_url=");
        return b.j(k, this.retry_media_url, "}");
    }
    
    public void write(final e e) throws IOException {
        CSAIMedia.ADAPTER.write(e, (Object)this);
    }
}
