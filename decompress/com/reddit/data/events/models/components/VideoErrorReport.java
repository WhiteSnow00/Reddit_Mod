// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class VideoErrorReport
{
    public static final a<VideoErrorReport, Builder> ADAPTER;
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
        ADAPTER = (a)new VideoErrorReportAdapter(null);
    }
    
    private VideoErrorReport(final Builder builder) {
        this.reason = Builder.access$100(builder);
        this.custom_response = Builder.access$200(builder);
        this.mux_session_id = Builder.access$300(builder);
        this.error_code = Builder.access$400(builder);
        this.error_message = Builder.access$500(builder);
        this.network_speed = Builder.access$600(builder);
        this.num_connection_attempts = Builder.access$700(builder);
        this.client_connected_timestamp = Builder.access$800(builder);
        this.network_disconnect_timestamp = Builder.access$900(builder);
        this.bitrate = Builder.access$1000(builder);
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
        final StringBuilder k = a.k("VideoErrorReport{reason=");
        k.append(this.reason);
        k.append(", custom_response=");
        k.append(this.custom_response);
        k.append(", mux_session_id=");
        k.append(this.mux_session_id);
        k.append(", error_code=");
        k.append(this.error_code);
        k.append(", error_message=");
        k.append(this.error_message);
        k.append(", network_speed=");
        k.append(this.network_speed);
        k.append(", num_connection_attempts=");
        k.append(this.num_connection_attempts);
        k.append(", client_connected_timestamp=");
        k.append(this.client_connected_timestamp);
        k.append(", network_disconnect_timestamp=");
        k.append(this.network_disconnect_timestamp);
        k.append(", bitrate=");
        return a.h(k, this.bitrate, "}");
    }
    
    public void write(final e e) throws IOException {
        VideoErrorReport.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<VideoErrorReport>
    {
        private Long bitrate;
        private Long client_connected_timestamp;
        private String custom_response;
        private Integer error_code;
        private String error_message;
        private String mux_session_id;
        private Long network_disconnect_timestamp;
        private String network_speed;
        private Integer num_connection_attempts;
        private String reason;
        
        public Builder() {
        }
        
        public Builder(final VideoErrorReport videoErrorReport) {
            this.reason = videoErrorReport.reason;
            this.custom_response = videoErrorReport.custom_response;
            this.mux_session_id = videoErrorReport.mux_session_id;
            this.error_code = videoErrorReport.error_code;
            this.error_message = videoErrorReport.error_message;
            this.network_speed = videoErrorReport.network_speed;
            this.num_connection_attempts = videoErrorReport.num_connection_attempts;
            this.client_connected_timestamp = videoErrorReport.client_connected_timestamp;
            this.network_disconnect_timestamp = videoErrorReport.network_disconnect_timestamp;
            this.bitrate = videoErrorReport.bitrate;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.reason;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.bitrate;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.custom_response;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.mux_session_id;
        }
        
        public static /* synthetic */ Integer access$400(final Builder builder) {
            return builder.error_code;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.error_message;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.network_speed;
        }
        
        public static /* synthetic */ Integer access$700(final Builder builder) {
            return builder.num_connection_attempts;
        }
        
        public static /* synthetic */ Long access$800(final Builder builder) {
            return builder.client_connected_timestamp;
        }
        
        public static /* synthetic */ Long access$900(final Builder builder) {
            return builder.network_disconnect_timestamp;
        }
        
        public Builder bitrate(final Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        
        public VideoErrorReport build() {
            return new VideoErrorReport(this, null);
        }
        
        public Builder client_connected_timestamp(final Long client_connected_timestamp) {
            this.client_connected_timestamp = client_connected_timestamp;
            return this;
        }
        
        public Builder custom_response(final String custom_response) {
            this.custom_response = custom_response;
            return this;
        }
        
        public Builder error_code(final Integer error_code) {
            this.error_code = error_code;
            return this;
        }
        
        public Builder error_message(final String error_message) {
            this.error_message = error_message;
            return this;
        }
        
        public Builder mux_session_id(final String mux_session_id) {
            this.mux_session_id = mux_session_id;
            return this;
        }
        
        public Builder network_disconnect_timestamp(final Long network_disconnect_timestamp) {
            this.network_disconnect_timestamp = network_disconnect_timestamp;
            return this;
        }
        
        public Builder network_speed(final String network_speed) {
            this.network_speed = network_speed;
            return this;
        }
        
        public Builder num_connection_attempts(final Integer num_connection_attempts) {
            this.num_connection_attempts = num_connection_attempts;
            return this;
        }
        
        public Builder reason(final String reason) {
            this.reason = reason;
            return this;
        }
        
        public void reset() {
            this.reason = null;
            this.custom_response = null;
            this.mux_session_id = null;
            this.error_code = null;
            this.error_message = null;
            this.network_speed = null;
            this.num_connection_attempts = null;
            this.client_connected_timestamp = null;
            this.network_disconnect_timestamp = null;
            this.bitrate = null;
        }
    }
    
    public static final class VideoErrorReportAdapter implements a<VideoErrorReport, Builder>
    {
        private VideoErrorReportAdapter() {
        }
        
        public VideoErrorReport read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public VideoErrorReport read(final e e, final Builder builder) throws IOException {
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
                    case 10: {
                        if (a == 10) {
                            builder.bitrate(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.network_disconnect_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.client_connected_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 8) {
                            builder.num_connection_attempts(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.network_speed(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.error_message(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.error_code(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.mux_session_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.custom_response(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.reason(e.F());
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
        
        public void write(final e e, final VideoErrorReport videoErrorReport) throws IOException {
            e.a0();
            if (videoErrorReport.reason != null) {
                e.N(1, (byte)11);
                e.Z(videoErrorReport.reason);
                e.O();
            }
            if (videoErrorReport.custom_response != null) {
                e.N(2, (byte)11);
                e.Z(videoErrorReport.custom_response);
                e.O();
            }
            if (videoErrorReport.mux_session_id != null) {
                e.N(3, (byte)11);
                e.Z(videoErrorReport.mux_session_id);
                e.O();
            }
            if (videoErrorReport.error_code != null) {
                e.N(4, (byte)8);
                b.r(videoErrorReport.error_code, e);
            }
            if (videoErrorReport.error_message != null) {
                e.N(5, (byte)11);
                e.Z(videoErrorReport.error_message);
                e.O();
            }
            if (videoErrorReport.network_speed != null) {
                e.N(6, (byte)11);
                e.Z(videoErrorReport.network_speed);
                e.O();
            }
            if (videoErrorReport.num_connection_attempts != null) {
                e.N(7, (byte)8);
                b.r(videoErrorReport.num_connection_attempts, e);
            }
            if (videoErrorReport.client_connected_timestamp != null) {
                e.N(8, (byte)10);
                a.r(videoErrorReport.client_connected_timestamp, e);
            }
            if (videoErrorReport.network_disconnect_timestamp != null) {
                e.N(9, (byte)10);
                a.r(videoErrorReport.network_disconnect_timestamp, e);
            }
            if (videoErrorReport.bitrate != null) {
                e.N(10, (byte)10);
                a.r(videoErrorReport.bitrate, e);
            }
            e.P();
            e.b0();
        }
    }
}
