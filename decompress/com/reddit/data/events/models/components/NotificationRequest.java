// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class NotificationRequest
{
    public static final a<NotificationRequest, Builder> ADAPTER;
    public final String failure_reason;
    public final String message_id;
    public final String platform;
    public final String recipient_app_name;
    public final String recipient_device_id;
    public final String source_queue_name;
    public final String status;
    
    static {
        ADAPTER = (a)new NotificationRequestAdapter(null);
    }
    
    private NotificationRequest(final Builder builder) {
        this.message_id = Builder.access$100(builder);
        this.status = Builder.access$200(builder);
        this.platform = Builder.access$300(builder);
        this.failure_reason = Builder.access$400(builder);
        this.source_queue_name = Builder.access$500(builder);
        this.recipient_app_name = Builder.access$600(builder);
        this.recipient_device_id = Builder.access$700(builder);
    }
    
    public NotificationRequest(final Builder builder, final NotificationRequest$1 object) {
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
        if (!(o instanceof NotificationRequest)) {
            return false;
        }
        final NotificationRequest notificationRequest = (NotificationRequest)o;
        final String message_id = this.message_id;
        final String message_id2 = notificationRequest.message_id;
        if (message_id == message_id2 || (message_id != null && message_id.equals(message_id2))) {
            final String status = this.status;
            final String status2 = notificationRequest.status;
            if (status == status2 || (status != null && status.equals(status2))) {
                final String platform = this.platform;
                final String platform2 = notificationRequest.platform;
                if (platform == platform2 || (platform != null && platform.equals(platform2))) {
                    final String failure_reason = this.failure_reason;
                    final String failure_reason2 = notificationRequest.failure_reason;
                    if (failure_reason == failure_reason2 || (failure_reason != null && failure_reason.equals(failure_reason2))) {
                        final String source_queue_name = this.source_queue_name;
                        final String source_queue_name2 = notificationRequest.source_queue_name;
                        if (source_queue_name == source_queue_name2 || (source_queue_name != null && source_queue_name.equals(source_queue_name2))) {
                            final String recipient_app_name = this.recipient_app_name;
                            final String recipient_app_name2 = notificationRequest.recipient_app_name;
                            if (recipient_app_name == recipient_app_name2 || (recipient_app_name != null && recipient_app_name.equals(recipient_app_name2))) {
                                final String recipient_device_id = this.recipient_device_id;
                                final String recipient_device_id2 = notificationRequest.recipient_device_id;
                                boolean b2 = b;
                                if (recipient_device_id == recipient_device_id2) {
                                    return b2;
                                }
                                if (recipient_device_id != null && recipient_device_id.equals(recipient_device_id2)) {
                                    b2 = b;
                                    return b2;
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
        final String status = this.status;
        int hashCode3;
        if (status == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = status.hashCode();
        }
        final String platform = this.platform;
        int hashCode4;
        if (platform == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = platform.hashCode();
        }
        final String failure_reason = this.failure_reason;
        int hashCode5;
        if (failure_reason == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = failure_reason.hashCode();
        }
        final String source_queue_name = this.source_queue_name;
        int hashCode6;
        if (source_queue_name == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = source_queue_name.hashCode();
        }
        final String recipient_app_name = this.recipient_app_name;
        int hashCode7;
        if (recipient_app_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = recipient_app_name.hashCode();
        }
        final String recipient_device_id = this.recipient_device_id;
        if (recipient_device_id != null) {
            hashCode = recipient_device_id.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("NotificationRequest{message_id=");
        t.append(this.message_id);
        t.append(", status=");
        t.append(this.status);
        t.append(", platform=");
        t.append(this.platform);
        t.append(", failure_reason=");
        t.append(this.failure_reason);
        t.append(", source_queue_name=");
        t.append(this.source_queue_name);
        t.append(", recipient_app_name=");
        t.append(this.recipient_app_name);
        t.append(", recipient_device_id=");
        return ph0.a.f(t, this.recipient_device_id, "}");
    }
    
    public void write(final e e) throws IOException {
        NotificationRequest.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<NotificationRequest>
    {
        private String failure_reason;
        private String message_id;
        private String platform;
        private String recipient_app_name;
        private String recipient_device_id;
        private String source_queue_name;
        private String status;
        
        public Builder() {
        }
        
        public Builder(final NotificationRequest notificationRequest) {
            this.message_id = notificationRequest.message_id;
            this.status = notificationRequest.status;
            this.platform = notificationRequest.platform;
            this.failure_reason = notificationRequest.failure_reason;
            this.source_queue_name = notificationRequest.source_queue_name;
            this.recipient_app_name = notificationRequest.recipient_app_name;
            this.recipient_device_id = notificationRequest.recipient_device_id;
        }
        
        public static String access$100(final Builder builder) {
            return builder.message_id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.status;
        }
        
        public static String access$300(final Builder builder) {
            return builder.platform;
        }
        
        public static String access$400(final Builder builder) {
            return builder.failure_reason;
        }
        
        public static String access$500(final Builder builder) {
            return builder.source_queue_name;
        }
        
        public static String access$600(final Builder builder) {
            return builder.recipient_app_name;
        }
        
        public static String access$700(final Builder builder) {
            return builder.recipient_device_id;
        }
        
        public NotificationRequest build() {
            return new NotificationRequest(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder failure_reason(final String failure_reason) {
            this.failure_reason = failure_reason;
            return this;
        }
        
        public Builder message_id(final String message_id) {
            this.message_id = message_id;
            return this;
        }
        
        public Builder platform(final String platform) {
            this.platform = platform;
            return this;
        }
        
        public Builder recipient_app_name(final String recipient_app_name) {
            this.recipient_app_name = recipient_app_name;
            return this;
        }
        
        public Builder recipient_device_id(final String recipient_device_id) {
            this.recipient_device_id = recipient_device_id;
            return this;
        }
        
        public void reset() {
            this.message_id = null;
            this.status = null;
            this.platform = null;
            this.failure_reason = null;
            this.source_queue_name = null;
            this.recipient_app_name = null;
            this.recipient_device_id = null;
        }
        
        public Builder source_queue_name(final String source_queue_name) {
            this.source_queue_name = source_queue_name;
            return this;
        }
        
        public Builder status(final String status) {
            this.status = status;
            return this;
        }
    }
    
    public static final class NotificationRequestAdapter implements a<NotificationRequest, Builder>
    {
        private NotificationRequestAdapter() {
        }
        
        public NotificationRequestAdapter(final NotificationRequest$1 object) {
            this();
        }
        
        public NotificationRequest read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public NotificationRequest read(final e e, final Builder builder) throws IOException {
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
                    case 7: {
                        if (a == 11) {
                            builder.recipient_device_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.recipient_app_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.source_queue_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.failure_reason(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.platform(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.message_id(e.F());
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
        
        public void write(final e e, final NotificationRequest notificationRequest) throws IOException {
            e.X();
            if (notificationRequest.message_id != null) {
                e.O(1, (byte)11);
                e.W(notificationRequest.message_id);
                e.P();
            }
            if (notificationRequest.status != null) {
                e.O(2, (byte)11);
                e.W(notificationRequest.status);
                e.P();
            }
            if (notificationRequest.platform != null) {
                e.O(3, (byte)11);
                e.W(notificationRequest.platform);
                e.P();
            }
            if (notificationRequest.failure_reason != null) {
                e.O(4, (byte)11);
                e.W(notificationRequest.failure_reason);
                e.P();
            }
            if (notificationRequest.source_queue_name != null) {
                e.O(5, (byte)11);
                e.W(notificationRequest.source_queue_name);
                e.P();
            }
            if (notificationRequest.recipient_app_name != null) {
                e.O(6, (byte)11);
                e.W(notificationRequest.recipient_app_name);
                e.P();
            }
            if (notificationRequest.recipient_device_id != null) {
                e.O(7, (byte)11);
                e.W(notificationRequest.recipient_device_id);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (NotificationRequest)o);
        }
    }
}
