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

public final class CameraFeature
{
    public static final a<CameraFeature, CameraFeature.CameraFeature$Builder> ADAPTER;
    public final String crop;
    public final Boolean flash;
    public final Integer num_photos;
    public final Integer num_segments;
    public final Integer num_segments_recorded;
    public final Integer num_segments_uploaded;
    public final Boolean overlay_draw;
    public final Integer overlay_text_count;
    public final String overlay_text_last;
    public final Boolean speed;
    public final Boolean timer;
    public final List<String> video_filter;
    public final Boolean voiceover;
    
    static {
        ADAPTER = (a)new CameraFeature.CameraFeature$CameraFeatureAdapter((CameraFeature$1)null);
    }
    
    private CameraFeature(final CameraFeature.CameraFeature$Builder cameraFeature$Builder) {
        this.flash = CameraFeature.CameraFeature$Builder.access$100(cameraFeature$Builder);
        this.speed = CameraFeature.CameraFeature$Builder.access$200(cameraFeature$Builder);
        this.timer = CameraFeature.CameraFeature$Builder.access$300(cameraFeature$Builder);
        List<String> unmodifiableList;
        if (CameraFeature.CameraFeature$Builder.access$400(cameraFeature$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)CameraFeature.CameraFeature$Builder.access$400(cameraFeature$Builder));
        }
        this.video_filter = unmodifiableList;
        this.overlay_text_last = CameraFeature.CameraFeature$Builder.access$500(cameraFeature$Builder);
        this.overlay_text_count = CameraFeature.CameraFeature$Builder.access$600(cameraFeature$Builder);
        this.overlay_draw = CameraFeature.CameraFeature$Builder.access$700(cameraFeature$Builder);
        this.voiceover = CameraFeature.CameraFeature$Builder.access$800(cameraFeature$Builder);
        this.num_segments = CameraFeature.CameraFeature$Builder.access$900(cameraFeature$Builder);
        this.num_segments_recorded = CameraFeature.CameraFeature$Builder.access$1000(cameraFeature$Builder);
        this.num_segments_uploaded = CameraFeature.CameraFeature$Builder.access$1100(cameraFeature$Builder);
        this.num_photos = CameraFeature.CameraFeature$Builder.access$1200(cameraFeature$Builder);
        this.crop = CameraFeature.CameraFeature$Builder.access$1300(cameraFeature$Builder);
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
        if (!(o instanceof CameraFeature)) {
            return false;
        }
        final CameraFeature cameraFeature = (CameraFeature)o;
        final Boolean flash = this.flash;
        final Boolean flash2 = cameraFeature.flash;
        if (flash == flash2 || (flash != null && flash.equals(flash2))) {
            final Boolean speed = this.speed;
            final Boolean speed2 = cameraFeature.speed;
            if (speed == speed2 || (speed != null && speed.equals(speed2))) {
                final Boolean timer = this.timer;
                final Boolean timer2 = cameraFeature.timer;
                if (timer == timer2 || (timer != null && timer.equals(timer2))) {
                    final List<String> video_filter = this.video_filter;
                    final List<String> video_filter2 = cameraFeature.video_filter;
                    if (video_filter == video_filter2 || (video_filter != null && video_filter.equals(video_filter2))) {
                        final String overlay_text_last = this.overlay_text_last;
                        final String overlay_text_last2 = cameraFeature.overlay_text_last;
                        if (overlay_text_last == overlay_text_last2 || (overlay_text_last != null && overlay_text_last.equals(overlay_text_last2))) {
                            final Integer overlay_text_count = this.overlay_text_count;
                            final Integer overlay_text_count2 = cameraFeature.overlay_text_count;
                            if (overlay_text_count == overlay_text_count2 || (overlay_text_count != null && overlay_text_count.equals(overlay_text_count2))) {
                                final Boolean overlay_draw = this.overlay_draw;
                                final Boolean overlay_draw2 = cameraFeature.overlay_draw;
                                if (overlay_draw == overlay_draw2 || (overlay_draw != null && overlay_draw.equals(overlay_draw2))) {
                                    final Boolean voiceover = this.voiceover;
                                    final Boolean voiceover2 = cameraFeature.voiceover;
                                    if (voiceover == voiceover2 || (voiceover != null && voiceover.equals(voiceover2))) {
                                        final Integer num_segments = this.num_segments;
                                        final Integer num_segments2 = cameraFeature.num_segments;
                                        if (num_segments == num_segments2 || (num_segments != null && num_segments.equals(num_segments2))) {
                                            final Integer num_segments_recorded = this.num_segments_recorded;
                                            final Integer num_segments_recorded2 = cameraFeature.num_segments_recorded;
                                            if (num_segments_recorded == num_segments_recorded2 || (num_segments_recorded != null && num_segments_recorded.equals(num_segments_recorded2))) {
                                                final Integer num_segments_uploaded = this.num_segments_uploaded;
                                                final Integer num_segments_uploaded2 = cameraFeature.num_segments_uploaded;
                                                if (num_segments_uploaded == num_segments_uploaded2 || (num_segments_uploaded != null && num_segments_uploaded.equals(num_segments_uploaded2))) {
                                                    final Integer num_photos = this.num_photos;
                                                    final Integer num_photos2 = cameraFeature.num_photos;
                                                    if (num_photos == num_photos2 || (num_photos != null && num_photos.equals(num_photos2))) {
                                                        final String crop = this.crop;
                                                        final String crop2 = cameraFeature.crop;
                                                        boolean b2 = b;
                                                        if (crop == crop2) {
                                                            return b2;
                                                        }
                                                        if (crop != null && crop.equals(crop2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean flash = this.flash;
        int hashCode = 0;
        int hashCode2;
        if (flash == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = flash.hashCode();
        }
        final Boolean speed = this.speed;
        int hashCode3;
        if (speed == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = speed.hashCode();
        }
        final Boolean timer = this.timer;
        int hashCode4;
        if (timer == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = timer.hashCode();
        }
        final List<String> video_filter = this.video_filter;
        int hashCode5;
        if (video_filter == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = video_filter.hashCode();
        }
        final String overlay_text_last = this.overlay_text_last;
        int hashCode6;
        if (overlay_text_last == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = overlay_text_last.hashCode();
        }
        final Integer overlay_text_count = this.overlay_text_count;
        int hashCode7;
        if (overlay_text_count == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = overlay_text_count.hashCode();
        }
        final Boolean overlay_draw = this.overlay_draw;
        int hashCode8;
        if (overlay_draw == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = overlay_draw.hashCode();
        }
        final Boolean voiceover = this.voiceover;
        int hashCode9;
        if (voiceover == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = voiceover.hashCode();
        }
        final Integer num_segments = this.num_segments;
        int hashCode10;
        if (num_segments == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = num_segments.hashCode();
        }
        final Integer num_segments_recorded = this.num_segments_recorded;
        int hashCode11;
        if (num_segments_recorded == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = num_segments_recorded.hashCode();
        }
        final Integer num_segments_uploaded = this.num_segments_uploaded;
        int hashCode12;
        if (num_segments_uploaded == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = num_segments_uploaded.hashCode();
        }
        final Integer num_photos = this.num_photos;
        int hashCode13;
        if (num_photos == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = num_photos.hashCode();
        }
        final String crop = this.crop;
        if (crop != null) {
            hashCode = crop.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CameraFeature{flash=");
        k.append(this.flash);
        k.append(", speed=");
        k.append(this.speed);
        k.append(", timer=");
        k.append(this.timer);
        k.append(", video_filter=");
        k.append(this.video_filter);
        k.append(", overlay_text_last=");
        k.append(this.overlay_text_last);
        k.append(", overlay_text_count=");
        k.append(this.overlay_text_count);
        k.append(", overlay_draw=");
        k.append(this.overlay_draw);
        k.append(", voiceover=");
        k.append(this.voiceover);
        k.append(", num_segments=");
        k.append(this.num_segments);
        k.append(", num_segments_recorded=");
        k.append(this.num_segments_recorded);
        k.append(", num_segments_uploaded=");
        k.append(this.num_segments_uploaded);
        k.append(", num_photos=");
        k.append(this.num_photos);
        k.append(", crop=");
        return b.j(k, this.crop, "}");
    }
    
    public void write(final e e) throws IOException {
        CameraFeature.ADAPTER.write(e, (Object)this);
    }
}
