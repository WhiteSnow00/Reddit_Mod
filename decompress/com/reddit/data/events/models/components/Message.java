// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Message
{
    public static final a<Message, Builder> ADAPTER;
    public final String body;
    public final Long created_timestamp;
    public final Boolean filtered_by_recipient;
    public final String first_message_id;
    public final String id;
    public final String modmail_conversation_id;
    public final String modmail_message_id;
    public final String parent_message_id;
    public final String recipient_id;
    public final String recipient_type;
    public final String sender_type;
    public final String source_page;
    public final String subject;
    public final String type;
    
    static {
        ADAPTER = (a)new MessageAdapter(null);
    }
    
    private Message(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.recipient_id = Builder.access$200(builder);
        this.recipient_type = Builder.access$300(builder);
        this.sender_type = Builder.access$400(builder);
        this.body = Builder.access$500(builder);
        this.subject = Builder.access$600(builder);
        this.created_timestamp = Builder.access$700(builder);
        this.first_message_id = Builder.access$800(builder);
        this.parent_message_id = Builder.access$900(builder);
        this.source_page = Builder.access$1000(builder);
        this.filtered_by_recipient = Builder.access$1100(builder);
        this.type = Builder.access$1200(builder);
        this.modmail_conversation_id = Builder.access$1300(builder);
        this.modmail_message_id = Builder.access$1400(builder);
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
        if (!(o instanceof Message)) {
            return false;
        }
        final Message message = (Message)o;
        final String id = this.id;
        final String id2 = message.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String recipient_id = this.recipient_id;
            final String recipient_id2 = message.recipient_id;
            if (recipient_id == recipient_id2 || (recipient_id != null && recipient_id.equals(recipient_id2))) {
                final String recipient_type = this.recipient_type;
                final String recipient_type2 = message.recipient_type;
                if (recipient_type == recipient_type2 || (recipient_type != null && recipient_type.equals(recipient_type2))) {
                    final String sender_type = this.sender_type;
                    final String sender_type2 = message.sender_type;
                    if (sender_type == sender_type2 || (sender_type != null && sender_type.equals(sender_type2))) {
                        final String body = this.body;
                        final String body2 = message.body;
                        if (body == body2 || (body != null && body.equals(body2))) {
                            final String subject = this.subject;
                            final String subject2 = message.subject;
                            if (subject == subject2 || (subject != null && subject.equals(subject2))) {
                                final Long created_timestamp = this.created_timestamp;
                                final Long created_timestamp2 = message.created_timestamp;
                                if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                                    final String first_message_id = this.first_message_id;
                                    final String first_message_id2 = message.first_message_id;
                                    if (first_message_id == first_message_id2 || (first_message_id != null && first_message_id.equals(first_message_id2))) {
                                        final String parent_message_id = this.parent_message_id;
                                        final String parent_message_id2 = message.parent_message_id;
                                        if (parent_message_id == parent_message_id2 || (parent_message_id != null && parent_message_id.equals(parent_message_id2))) {
                                            final String source_page = this.source_page;
                                            final String source_page2 = message.source_page;
                                            if (source_page == source_page2 || (source_page != null && source_page.equals(source_page2))) {
                                                final Boolean filtered_by_recipient = this.filtered_by_recipient;
                                                final Boolean filtered_by_recipient2 = message.filtered_by_recipient;
                                                if (filtered_by_recipient == filtered_by_recipient2 || (filtered_by_recipient != null && filtered_by_recipient.equals(filtered_by_recipient2))) {
                                                    final String type = this.type;
                                                    final String type2 = message.type;
                                                    if (type == type2 || (type != null && type.equals(type2))) {
                                                        final String modmail_conversation_id = this.modmail_conversation_id;
                                                        final String modmail_conversation_id2 = message.modmail_conversation_id;
                                                        if (modmail_conversation_id == modmail_conversation_id2 || (modmail_conversation_id != null && modmail_conversation_id.equals(modmail_conversation_id2))) {
                                                            final String modmail_message_id = this.modmail_message_id;
                                                            final String modmail_message_id2 = message.modmail_message_id;
                                                            boolean b2 = b;
                                                            if (modmail_message_id == modmail_message_id2) {
                                                                return b2;
                                                            }
                                                            if (modmail_message_id != null && modmail_message_id.equals(modmail_message_id2)) {
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
        final String recipient_id = this.recipient_id;
        int hashCode3;
        if (recipient_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = recipient_id.hashCode();
        }
        final String recipient_type = this.recipient_type;
        int hashCode4;
        if (recipient_type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = recipient_type.hashCode();
        }
        final String sender_type = this.sender_type;
        int hashCode5;
        if (sender_type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = sender_type.hashCode();
        }
        final String body = this.body;
        int hashCode6;
        if (body == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = body.hashCode();
        }
        final String subject = this.subject;
        int hashCode7;
        if (subject == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subject.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode8;
        if (created_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = created_timestamp.hashCode();
        }
        final String first_message_id = this.first_message_id;
        int hashCode9;
        if (first_message_id == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = first_message_id.hashCode();
        }
        final String parent_message_id = this.parent_message_id;
        int hashCode10;
        if (parent_message_id == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = parent_message_id.hashCode();
        }
        final String source_page = this.source_page;
        int hashCode11;
        if (source_page == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = source_page.hashCode();
        }
        final Boolean filtered_by_recipient = this.filtered_by_recipient;
        int hashCode12;
        if (filtered_by_recipient == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = filtered_by_recipient.hashCode();
        }
        final String type = this.type;
        int hashCode13;
        if (type == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = type.hashCode();
        }
        final String modmail_conversation_id = this.modmail_conversation_id;
        int hashCode14;
        if (modmail_conversation_id == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = modmail_conversation_id.hashCode();
        }
        final String modmail_message_id = this.modmail_message_id;
        if (modmail_message_id != null) {
            hashCode = modmail_message_id.hashCode();
        }
        return ((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Message{id=");
        k.append(this.id);
        k.append(", recipient_id=");
        k.append(this.recipient_id);
        k.append(", recipient_type=");
        k.append(this.recipient_type);
        k.append(", sender_type=");
        k.append(this.sender_type);
        k.append(", body=");
        k.append(this.body);
        k.append(", subject=");
        k.append(this.subject);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", first_message_id=");
        k.append(this.first_message_id);
        k.append(", parent_message_id=");
        k.append(this.parent_message_id);
        k.append(", source_page=");
        k.append(this.source_page);
        k.append(", filtered_by_recipient=");
        k.append(this.filtered_by_recipient);
        k.append(", type=");
        k.append(this.type);
        k.append(", modmail_conversation_id=");
        k.append(this.modmail_conversation_id);
        k.append(", modmail_message_id=");
        return b.j(k, this.modmail_message_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Message.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Message>
    {
        private String body;
        private Long created_timestamp;
        private Boolean filtered_by_recipient;
        private String first_message_id;
        private String id;
        private String modmail_conversation_id;
        private String modmail_message_id;
        private String parent_message_id;
        private String recipient_id;
        private String recipient_type;
        private String sender_type;
        private String source_page;
        private String subject;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Message message) {
            this.id = message.id;
            this.recipient_id = message.recipient_id;
            this.recipient_type = message.recipient_type;
            this.sender_type = message.sender_type;
            this.body = message.body;
            this.subject = message.subject;
            this.created_timestamp = message.created_timestamp;
            this.first_message_id = message.first_message_id;
            this.parent_message_id = message.parent_message_id;
            this.source_page = message.source_page;
            this.filtered_by_recipient = message.filtered_by_recipient;
            this.type = message.type;
            this.modmail_conversation_id = message.modmail_conversation_id;
            this.modmail_message_id = message.modmail_message_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.source_page;
        }
        
        public static /* synthetic */ Boolean access$1100(final Builder builder) {
            return builder.filtered_by_recipient;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.modmail_conversation_id;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.modmail_message_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.recipient_id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.recipient_type;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.sender_type;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.body;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.subject;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.first_message_id;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.parent_message_id;
        }
        
        public Builder body(final String body) {
            this.body = body;
            return this;
        }
        
        public Message build() {
            return new Message(this, null);
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder filtered_by_recipient(final Boolean filtered_by_recipient) {
            this.filtered_by_recipient = filtered_by_recipient;
            return this;
        }
        
        public Builder first_message_id(final String first_message_id) {
            this.first_message_id = first_message_id;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder modmail_conversation_id(final String modmail_conversation_id) {
            this.modmail_conversation_id = modmail_conversation_id;
            return this;
        }
        
        public Builder modmail_message_id(final String modmail_message_id) {
            this.modmail_message_id = modmail_message_id;
            return this;
        }
        
        public Builder parent_message_id(final String parent_message_id) {
            this.parent_message_id = parent_message_id;
            return this;
        }
        
        public Builder recipient_id(final String recipient_id) {
            this.recipient_id = recipient_id;
            return this;
        }
        
        public Builder recipient_type(final String recipient_type) {
            this.recipient_type = recipient_type;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.recipient_id = null;
            this.recipient_type = null;
            this.sender_type = null;
            this.body = null;
            this.subject = null;
            this.created_timestamp = null;
            this.first_message_id = null;
            this.parent_message_id = null;
            this.source_page = null;
            this.filtered_by_recipient = null;
            this.type = null;
            this.modmail_conversation_id = null;
            this.modmail_message_id = null;
        }
        
        public Builder sender_type(final String sender_type) {
            this.sender_type = sender_type;
            return this;
        }
        
        public Builder source_page(final String source_page) {
            this.source_page = source_page;
            return this;
        }
        
        public Builder subject(final String subject) {
            this.subject = subject;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class MessageAdapter implements a<Message, Builder>
    {
        private MessageAdapter() {
        }
        
        public Message read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Message read(final e e, final Builder builder) throws IOException {
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
                    case 14: {
                        if (a == 11) {
                            builder.modmail_message_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.modmail_conversation_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.filtered_by_recipient(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.source_page(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.parent_message_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.first_message_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.created_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.subject(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.body(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.sender_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.recipient_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.recipient_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
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
        
        public void write(final e e, final Message message) throws IOException {
            e.a0();
            if (message.id != null) {
                e.N(1, (byte)11);
                e.Z(message.id);
                e.O();
            }
            if (message.recipient_id != null) {
                e.N(2, (byte)11);
                e.Z(message.recipient_id);
                e.O();
            }
            if (message.recipient_type != null) {
                e.N(3, (byte)11);
                e.Z(message.recipient_type);
                e.O();
            }
            if (message.sender_type != null) {
                e.N(4, (byte)11);
                e.Z(message.sender_type);
                e.O();
            }
            if (message.body != null) {
                e.N(5, (byte)11);
                e.Z(message.body);
                e.O();
            }
            if (message.subject != null) {
                e.N(6, (byte)11);
                e.Z(message.subject);
                e.O();
            }
            if (message.created_timestamp != null) {
                e.N(7, (byte)10);
                a.r(message.created_timestamp, e);
            }
            if (message.first_message_id != null) {
                e.N(8, (byte)11);
                e.Z(message.first_message_id);
                e.O();
            }
            if (message.parent_message_id != null) {
                e.N(9, (byte)11);
                e.Z(message.parent_message_id);
                e.O();
            }
            if (message.source_page != null) {
                e.N(10, (byte)11);
                e.Z(message.source_page);
                e.O();
            }
            if (message.filtered_by_recipient != null) {
                e.N(11, (byte)2);
                d.z(message.filtered_by_recipient, e);
            }
            if (message.type != null) {
                e.N(12, (byte)11);
                e.Z(message.type);
                e.O();
            }
            if (message.modmail_conversation_id != null) {
                e.N(13, (byte)11);
                e.Z(message.modmail_conversation_id);
                e.O();
            }
            if (message.modmail_message_id != null) {
                e.N(14, (byte)11);
                e.Z(message.modmail_message_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
