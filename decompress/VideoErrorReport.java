// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class VideoErrorReport
{
    public static final a<VideoErrorReport, VideoErrorReport.VideoErrorReport$Builder> ADAPTER;
    public final Long bitrate;
    public final Long client_connected_timestamp;
    public final String custom_response;
    public final Integer error_code;
    public final String error_message;
    public final String mux_session_id;
    public final Long network_disconnect_timestamp;
    public final String network_speed;
    public final Integer num_connection_attempts;
    public final String reason;
    
    static {
        ADAPTER = (a)new VideoErrorReport.VideoErrorReport$VideoErrorReportAdapter((VideoErrorReport$1)null);
    }
    
    private VideoErrorReport(final VideoErrorReport.VideoErrorReport$Builder videoErrorReport$Builder) {
        this.reason = VideoErrorReport.VideoErrorReport$Builder.access$100(videoErrorReport$Builder);
        this.custom_response = VideoErrorReport.VideoErrorReport$Builder.access$200(videoErrorReport$Builder);
        this.mux_session_id = VideoErrorReport.VideoErrorReport$Builder.access$300(videoErrorReport$Builder);
        this.error_code = VideoErrorReport.VideoErrorReport$Builder.access$400(videoErrorReport$Builder);
        this.error_message = VideoErrorReport.VideoErrorReport$Builder.access$500(videoErrorReport$Builder);
        this.network_speed = VideoErrorReport.VideoErrorReport$Builder.access$600(videoErrorReport$Builder);
        this.num_connection_attempts = VideoErrorReport.VideoErrorReport$Builder.access$700(videoErrorReport$Builder);
        this.client_connected_timestamp = VideoErrorReport.VideoErrorReport$Builder.access$800(videoErrorReport$Builder);
        this.network_disconnect_timestamp = VideoErrorReport.VideoErrorReport$Builder.access$900(videoErrorReport$Builder);
        this.bitrate = VideoErrorReport.VideoErrorReport$Builder.access$1000(videoErrorReport$Builder);
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
        if (!(o instanceof VideoErrorReport)) {
            return false;
        }
        final VideoErrorReport videoErrorReport = (VideoErrorReport)o;
        final String reason = this.reason;
        final String reason2 = videoErrorReport.reason;
        if (reason == reason2 || (reason != null && reason.equals(reason2))) {
            final String custom_response = this.custom_response;
            final String custom_response2 = videoErrorReport.custom_response;
            if (custom_response == custom_response2 || (custom_response != null && custom_response.equals(custom_response2))) {
                final String mux_session_id = this.mux_session_id;
                final String mux_session_id2 = videoErrorReport.mux_session_id;
                if (mux_session_id == mux_session_id2 || (mux_session_id != null && mux_session_id.equals(mux_session_id2))) {
                    final Integer error_code = this.error_code;
                    final Integer error_code2 = videoErrorReport.error_code;
                    if (error_code == error_code2 || (error_code != null && error_code.equals(error_code2))) {
                        final String error_message = this.error_message;
                        final String error_message2 = videoErrorReport.error_message;
                        if (error_message == error_message2 || (error_message != null && error_message.equals(error_message2))) {
                            final String network_speed = this.network_speed;
                            final String network_speed2 = videoErrorReport.network_speed;
                            if (network_speed == network_speed2 || (network_speed != null && network_speed.equals(network_speed2))) {
                                final Integer num_connection_attempts = this.num_connection_attempts;
                                final Integer num_connection_attempts2 = videoErrorReport.num_connection_attempts;
                                if (num_connection_attempts == num_connection_attempts2 || (num_connection_attempts != null && num_connection_attempts.equals(num_connection_attempts2))) {
                                    final Long client_connected_timestamp = this.client_connected_timestamp;
                                    final Long client_connected_timestamp2 = videoErrorReport.client_connected_timestamp;
                                    if (client_connected_timestamp == client_connected_timestamp2 || (client_connected_timestamp != null && client_connected_timestamp.equals(client_connected_timestamp2))) {
                                        final Long network_disconnect_timestamp = this.network_disconnect_timestamp;
                                        final Long network_disconnect_timestamp2 = videoErrorReport.network_disconnect_timestamp;
                                        if (network_disconnect_timestamp == network_disconnect_timestamp2 || (network_disconnect_timestamp != null && network_disconnect_timestamp.equals(network_disconnect_timestamp2))) {
                                            final Long bitrate = this.bitrate;
                                            final Long bitrate2 = videoErrorReport.bitrate;
                                            boolean b2 = b;
                                            if (bitrate == bitrate2) {
                                                return b2;
                                            }
                                            if (bitrate != null && bitrate.equals(bitrate2)) {
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
        final String reason = this.reason;
        int hashCode = 0;
        int hashCode2;
        if (reason == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = reason.hashCode();
        }
        final String custom_response = this.custom_response;
        int hashCode3;
        if (custom_response == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = custom_response.hashCode();
        }
        final String mux_session_id = this.mux_session_id;
        int hashCode4;
        if (mux_session_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = mux_session_id.hashCode();
        }
        final Integer error_code = this.error_code;
        int hashCode5;
        if (error_code == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = error_code.hashCode();
        }
        final String error_message = this.error_message;
        int hashCode6;
        if (error_message == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = error_message.hashCode();
        }
        final String network_speed = this.network_speed;
        int hashCode7;
        if (network_speed == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = network_speed.hashCode();
        }
        final Integer num_connection_attempts = this.num_connection_attempts;
        int hashCode8;
        if (num_connection_attempts == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = num_connection_attempts.hashCode();
        }
        final Long client_connected_timestamp = this.client_connected_timestamp;
        int hashCode9;
        if (client_connected_timestamp == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = client_connected_timestamp.hashCode();
        }
        final Long network_disconnect_timestamp = this.network_disconnect_timestamp;
        int hashCode10;
        if (network_disconnect_timestamp == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = network_disconnect_timestamp.hashCode();
        }
        final Long bitrate = this.bitrate;
        if (bitrate != null) {
            hashCode = bitrate.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("VideoErrorReport{reason=");
        r.append(this.reason);
        r.append(", custom_response=");
        r.append(this.custom_response);
        r.append(", mux_session_id=");
        r.append(this.mux_session_id);
        r.append(", error_code=");
        r.append(this.error_code);
        r.append(", error_message=");
        r.append(this.error_message);
        r.append(", network_speed=");
        r.append(this.network_speed);
        r.append(", num_connection_attempts=");
        r.append(this.num_connection_attempts);
        r.append(", client_connected_timestamp=");
        r.append(this.client_connected_timestamp);
        r.append(", network_disconnect_timestamp=");
        r.append(this.network_disconnect_timestamp);
        r.append(", bitrate=");
        return a.m(r, this.bitrate, "}");
    }
    
    public void write(final e e) throws IOException {
        VideoErrorReport.ADAPTER.write(e, (Object)this);
    }
}
