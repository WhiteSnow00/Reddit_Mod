// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class MailroomRequest
{
    public static final a<MailroomRequest, Builder> ADAPTER;
    public final String delivery_queue_name;
    public final String dropped_by;
    public final Long intended_send_timestamp;
    public final String message_id;
    public final String message_type;
    public final String message_variant;
    public final String notification_target;
    public final String notification_transport;
    public final String region;
    public final Integer region_num;
    
    static {
        ADAPTER = (a)new MailroomRequestAdapter(null);
    }
    
    private MailroomRequest(final Builder builder) {
        this.message_id = Builder.access$100(builder);
        this.message_type = Builder.access$200(builder);
        this.dropped_by = Builder.access$300(builder);
        this.delivery_queue_name = Builder.access$400(builder);
        this.notification_transport = Builder.access$500(builder);
        this.notification_target = Builder.access$600(builder);
        this.message_variant = Builder.access$700(builder);
        this.region = Builder.access$800(builder);
        this.region_num = Builder.access$900(builder);
        this.intended_send_timestamp = Builder.access$1000(builder);
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
        if (!(o instanceof MailroomRequest)) {
            return false;
        }
        final MailroomRequest mailroomRequest = (MailroomRequest)o;
        final String message_id = this.message_id;
        final String message_id2 = mailroomRequest.message_id;
        if (message_id == message_id2 || (message_id != null && message_id.equals(message_id2))) {
            final String message_type = this.message_type;
            final String message_type2 = mailroomRequest.message_type;
            if (message_type == message_type2 || (message_type != null && message_type.equals(message_type2))) {
                final String dropped_by = this.dropped_by;
                final String dropped_by2 = mailroomRequest.dropped_by;
                if (dropped_by == dropped_by2 || (dropped_by != null && dropped_by.equals(dropped_by2))) {
                    final String delivery_queue_name = this.delivery_queue_name;
                    final String delivery_queue_name2 = mailroomRequest.delivery_queue_name;
                    if (delivery_queue_name == delivery_queue_name2 || (delivery_queue_name != null && delivery_queue_name.equals(delivery_queue_name2))) {
                        final String notification_transport = this.notification_transport;
                        final String notification_transport2 = mailroomRequest.notification_transport;
                        if (notification_transport == notification_transport2 || (notification_transport != null && notification_transport.equals(notification_transport2))) {
                            final String notification_target = this.notification_target;
                            final String notification_target2 = mailroomRequest.notification_target;
                            if (notification_target == notification_target2 || (notification_target != null && notification_target.equals(notification_target2))) {
                                final String message_variant = this.message_variant;
                                final String message_variant2 = mailroomRequest.message_variant;
                                if (message_variant == message_variant2 || (message_variant != null && message_variant.equals(message_variant2))) {
                                    final String region = this.region;
                                    final String region2 = mailroomRequest.region;
                                    if (region == region2 || (region != null && region.equals(region2))) {
                                        final Integer region_num = this.region_num;
                                        final Integer region_num2 = mailroomRequest.region_num;
                                        if (region_num == region_num2 || (region_num != null && region_num.equals(region_num2))) {
                                            final Long intended_send_timestamp = this.intended_send_timestamp;
                                            final Long intended_send_timestamp2 = mailroomRequest.intended_send_timestamp;
                                            boolean b2 = b;
                                            if (intended_send_timestamp == intended_send_timestamp2) {
                                                return b2;
                                            }
                                            if (intended_send_timestamp != null && intended_send_timestamp.equals(intended_send_timestamp2)) {
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
        final String message_id = this.message_id;
        int hashCode = 0;
        int hashCode2;
        if (message_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = message_id.hashCode();
        }
        final String message_type = this.message_type;
        int hashCode3;
        if (message_type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = message_type.hashCode();
        }
        final String dropped_by = this.dropped_by;
        int hashCode4;
        if (dropped_by == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = dropped_by.hashCode();
        }
        final String delivery_queue_name = this.delivery_queue_name;
        int hashCode5;
        if (delivery_queue_name == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = delivery_queue_name.hashCode();
        }
        final String notification_transport = this.notification_transport;
        int hashCode6;
        if (notification_transport == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = notification_transport.hashCode();
        }
        final String notification_target = this.notification_target;
        int hashCode7;
        if (notification_target == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = notification_target.hashCode();
        }
        final String message_variant = this.message_variant;
        int hashCode8;
        if (message_variant == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = message_variant.hashCode();
        }
        final String region = this.region;
        int hashCode9;
        if (region == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = region.hashCode();
        }
        final Integer region_num = this.region_num;
        int hashCode10;
        if (region_num == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = region_num.hashCode();
        }
        final Long intended_send_timestamp = this.intended_send_timestamp;
        if (intended_send_timestamp != null) {
            hashCode = intended_send_timestamp.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MailroomRequest{message_id=");
        k.append(this.message_id);
        k.append(", message_type=");
        k.append(this.message_type);
        k.append(", dropped_by=");
        k.append(this.dropped_by);
        k.append(", delivery_queue_name=");
        k.append(this.delivery_queue_name);
        k.append(", notification_transport=");
        k.append(this.notification_transport);
        k.append(", notification_target=");
        k.append(this.notification_target);
        k.append(", message_variant=");
        k.append(this.message_variant);
        k.append(", region=");
        k.append(this.region);
        k.append(", region_num=");
        k.append(this.region_num);
        k.append(", intended_send_timestamp=");
        return a.h(k, this.intended_send_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        MailroomRequest.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<MailroomRequest>
    {
        private String delivery_queue_name;
        private String dropped_by;
        private Long intended_send_timestamp;
        private String message_id;
        private String message_type;
        private String message_variant;
        private String notification_target;
        private String notification_transport;
        private String region;
        private Integer region_num;
        
        public Builder() {
        }
        
        public Builder(final MailroomRequest mailroomRequest) {
            this.message_id = mailroomRequest.message_id;
            this.message_type = mailroomRequest.message_type;
            this.dropped_by = mailroomRequest.dropped_by;
            this.delivery_queue_name = mailroomRequest.delivery_queue_name;
            this.notification_transport = mailroomRequest.notification_transport;
            this.notification_target = mailroomRequest.notification_target;
            this.message_variant = mailroomRequest.message_variant;
            this.region = mailroomRequest.region;
            this.region_num = mailroomRequest.region_num;
            this.intended_send_timestamp = mailroomRequest.intended_send_timestamp;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.message_id;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.intended_send_timestamp;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.message_type;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.dropped_by;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.delivery_queue_name;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.notification_transport;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.notification_target;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.message_variant;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.region;
        }
        
        public static /* synthetic */ Integer access$900(final Builder builder) {
            return builder.region_num;
        }
        
        public MailroomRequest build() {
            return new MailroomRequest(this, null);
        }
        
        public Builder delivery_queue_name(final String delivery_queue_name) {
            this.delivery_queue_name = delivery_queue_name;
            return this;
        }
        
        public Builder dropped_by(final String dropped_by) {
            this.dropped_by = dropped_by;
            return this;
        }
        
        public Builder intended_send_timestamp(final Long intended_send_timestamp) {
            this.intended_send_timestamp = intended_send_timestamp;
            return this;
        }
        
        public Builder message_id(final String message_id) {
            this.message_id = message_id;
            return this;
        }
        
        public Builder message_type(final String message_type) {
            this.message_type = message_type;
            return this;
        }
        
        public Builder message_variant(final String message_variant) {
            this.message_variant = message_variant;
            return this;
        }
        
        public Builder notification_target(final String notification_target) {
            this.notification_target = notification_target;
            return this;
        }
        
        public Builder notification_transport(final String notification_transport) {
            this.notification_transport = notification_transport;
            return this;
        }
        
        public Builder region(final String region) {
            this.region = region;
            return this;
        }
        
        public Builder region_num(final Integer region_num) {
            this.region_num = region_num;
            return this;
        }
        
        public void reset() {
            this.message_id = null;
            this.message_type = null;
            this.dropped_by = null;
            this.delivery_queue_name = null;
            this.notification_transport = null;
            this.notification_target = null;
            this.message_variant = null;
            this.region = null;
            this.region_num = null;
            this.intended_send_timestamp = null;
        }
    }
    
    public static final class MailroomRequestAdapter implements a<MailroomRequest, Builder>
    {
        private MailroomRequestAdapter() {
        }
        
        public MailroomRequest read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public MailroomRequest read(final e e, final Builder builder) throws IOException {
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
                            builder.intended_send_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 8) {
                            builder.region_num(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.region(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.message_variant(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.notification_target(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.notification_transport(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.delivery_queue_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.dropped_by(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.message_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.message_id(e.F());
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
        
        public void write(final e e, final MailroomRequest mailroomRequest) throws IOException {
            e.a0();
            if (mailroomRequest.message_id != null) {
                e.N(1, (byte)11);
                e.Z(mailroomRequest.message_id);
                e.O();
            }
            if (mailroomRequest.message_type != null) {
                e.N(2, (byte)11);
                e.Z(mailroomRequest.message_type);
                e.O();
            }
            if (mailroomRequest.dropped_by != null) {
                e.N(3, (byte)11);
                e.Z(mailroomRequest.dropped_by);
                e.O();
            }
            if (mailroomRequest.delivery_queue_name != null) {
                e.N(4, (byte)11);
                e.Z(mailroomRequest.delivery_queue_name);
                e.O();
            }
            if (mailroomRequest.notification_transport != null) {
                e.N(5, (byte)11);
                e.Z(mailroomRequest.notification_transport);
                e.O();
            }
            if (mailroomRequest.notification_target != null) {
                e.N(6, (byte)11);
                e.Z(mailroomRequest.notification_target);
                e.O();
            }
            if (mailroomRequest.message_variant != null) {
                e.N(7, (byte)11);
                e.Z(mailroomRequest.message_variant);
                e.O();
            }
            if (mailroomRequest.region != null) {
                e.N(8, (byte)11);
                e.Z(mailroomRequest.region);
                e.O();
            }
            if (mailroomRequest.region_num != null) {
                e.N(9, (byte)8);
                b.r(mailroomRequest.region_num, e);
            }
            if (mailroomRequest.intended_send_timestamp != null) {
                e.N(10, (byte)10);
                a.r(mailroomRequest.intended_send_timestamp, e);
            }
            e.P();
            e.b0();
        }
    }
}
