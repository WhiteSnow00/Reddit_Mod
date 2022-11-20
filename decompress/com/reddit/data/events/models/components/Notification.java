// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Notification
{
    public static final a<Notification, Builder> ADAPTER;
    public final String authorization_status;
    public final String body;
    public final Boolean dropped;
    public final String id;
    public final String process_notes;
    public final String title;
    public final String type;
    
    static {
        ADAPTER = (a)new NotificationAdapter(null);
    }
    
    private Notification(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.process_notes = Builder.access$200(builder);
        this.dropped = Builder.access$300(builder);
        this.type = Builder.access$400(builder);
        this.title = Builder.access$500(builder);
        this.body = Builder.access$600(builder);
        this.authorization_status = Builder.access$700(builder);
    }
    
    public Notification(final Builder builder, final Notification$1 object) {
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
        if (!(o instanceof Notification)) {
            return false;
        }
        final Notification notification = (Notification)o;
        final String id = this.id;
        final String id2 = notification.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String process_notes = this.process_notes;
            final String process_notes2 = notification.process_notes;
            if (process_notes == process_notes2 || (process_notes != null && process_notes.equals(process_notes2))) {
                final Boolean dropped = this.dropped;
                final Boolean dropped2 = notification.dropped;
                if (dropped == dropped2 || (dropped != null && dropped.equals(dropped2))) {
                    final String type = this.type;
                    final String type2 = notification.type;
                    if (type == type2 || (type != null && type.equals(type2))) {
                        final String title = this.title;
                        final String title2 = notification.title;
                        if (title == title2 || (title != null && title.equals(title2))) {
                            final String body = this.body;
                            final String body2 = notification.body;
                            if (body == body2 || (body != null && body.equals(body2))) {
                                final String authorization_status = this.authorization_status;
                                final String authorization_status2 = notification.authorization_status;
                                boolean b2 = b;
                                if (authorization_status == authorization_status2) {
                                    return b2;
                                }
                                if (authorization_status != null && authorization_status.equals(authorization_status2)) {
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String process_notes = this.process_notes;
        int hashCode3;
        if (process_notes == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = process_notes.hashCode();
        }
        final Boolean dropped = this.dropped;
        int hashCode4;
        if (dropped == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = dropped.hashCode();
        }
        final String type = this.type;
        int hashCode5;
        if (type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = type.hashCode();
        }
        final String title = this.title;
        int hashCode6;
        if (title == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = title.hashCode();
        }
        final String body = this.body;
        int hashCode7;
        if (body == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = body.hashCode();
        }
        final String authorization_status = this.authorization_status;
        if (authorization_status != null) {
            hashCode = authorization_status.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Notification{id=");
        t.append(this.id);
        t.append(", process_notes=");
        t.append(this.process_notes);
        t.append(", dropped=");
        t.append(this.dropped);
        t.append(", type=");
        t.append(this.type);
        t.append(", title=");
        t.append(this.title);
        t.append(", body=");
        t.append(this.body);
        t.append(", authorization_status=");
        return ph0.a.f(t, this.authorization_status, "}");
    }
    
    public void write(final e e) throws IOException {
        Notification.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Notification>
    {
        private String authorization_status;
        private String body;
        private Boolean dropped;
        private String id;
        private String process_notes;
        private String title;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Notification notification) {
            this.id = notification.id;
            this.process_notes = notification.process_notes;
            this.dropped = notification.dropped;
            this.type = notification.type;
            this.title = notification.title;
            this.body = notification.body;
            this.authorization_status = notification.authorization_status;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.process_notes;
        }
        
        public static Boolean access$300(final Builder builder) {
            return builder.dropped;
        }
        
        public static String access$400(final Builder builder) {
            return builder.type;
        }
        
        public static String access$500(final Builder builder) {
            return builder.title;
        }
        
        public static String access$600(final Builder builder) {
            return builder.body;
        }
        
        public static String access$700(final Builder builder) {
            return builder.authorization_status;
        }
        
        public Builder authorization_status(final String authorization_status) {
            this.authorization_status = authorization_status;
            return this;
        }
        
        public Builder body(final String body) {
            this.body = body;
            return this;
        }
        
        public Notification build() {
            return new Notification(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder dropped(final Boolean dropped) {
            this.dropped = dropped;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder process_notes(final String process_notes) {
            this.process_notes = process_notes;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.process_notes = null;
            this.dropped = null;
            this.type = null;
            this.title = null;
            this.body = null;
            this.authorization_status = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class NotificationAdapter implements a<Notification, Builder>
    {
        private NotificationAdapter() {
        }
        
        public NotificationAdapter(final Notification$1 object) {
            this();
        }
        
        public Notification read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Notification read(final e e, final Builder builder) throws IOException {
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
                            builder.authorization_status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.body(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.title(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.dropped(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.process_notes(e.F());
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
        
        public void write(final e e, final Notification notification) throws IOException {
            e.X();
            if (notification.id != null) {
                e.O(1, (byte)11);
                e.W(notification.id);
                e.P();
            }
            if (notification.process_notes != null) {
                e.O(2, (byte)11);
                e.W(notification.process_notes);
                e.P();
            }
            if (notification.dropped != null) {
                e.O(3, (byte)2);
                android.support.v4.media.a.A(notification.dropped, e);
            }
            if (notification.type != null) {
                e.O(4, (byte)11);
                e.W(notification.type);
                e.P();
            }
            if (notification.title != null) {
                e.O(5, (byte)11);
                e.W(notification.title);
                e.P();
            }
            if (notification.body != null) {
                e.O(6, (byte)11);
                e.W(notification.body);
                e.P();
            }
            if (notification.authorization_status != null) {
                e.O(7, (byte)11);
                e.W(notification.authorization_status);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Notification)o);
        }
    }
}
