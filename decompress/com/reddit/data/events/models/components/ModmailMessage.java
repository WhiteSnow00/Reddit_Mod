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

public final class ModmailMessage
{
    public static final a<ModmailMessage, Builder> ADAPTER;
    public final String author_id;
    public final Boolean author_is_sr_moderator;
    public final String body;
    public final String conversation_id;
    public final Long date_timestamp;
    public final String id;
    public final Boolean is_internal;
    public final String participating_as;
    
    static {
        ADAPTER = (a)new ModmailMessageAdapter(null);
    }
    
    private ModmailMessage(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.conversation_id = Builder.access$200(builder);
        this.date_timestamp = Builder.access$300(builder);
        this.author_id = Builder.access$400(builder);
        this.body = Builder.access$500(builder);
        this.is_internal = Builder.access$600(builder);
        this.author_is_sr_moderator = Builder.access$700(builder);
        this.participating_as = Builder.access$800(builder);
    }
    
    public ModmailMessage(final Builder builder, final ModmailMessage$1 object) {
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
        if (!(o instanceof ModmailMessage)) {
            return false;
        }
        final ModmailMessage modmailMessage = (ModmailMessage)o;
        final String id = this.id;
        final String id2 = modmailMessage.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String conversation_id = this.conversation_id;
            final String conversation_id2 = modmailMessage.conversation_id;
            if (conversation_id == conversation_id2 || (conversation_id != null && conversation_id.equals(conversation_id2))) {
                final Long date_timestamp = this.date_timestamp;
                final Long date_timestamp2 = modmailMessage.date_timestamp;
                if (date_timestamp == date_timestamp2 || (date_timestamp != null && date_timestamp.equals(date_timestamp2))) {
                    final String author_id = this.author_id;
                    final String author_id2 = modmailMessage.author_id;
                    if (author_id == author_id2 || (author_id != null && author_id.equals(author_id2))) {
                        final String body = this.body;
                        final String body2 = modmailMessage.body;
                        if (body == body2 || (body != null && body.equals(body2))) {
                            final Boolean is_internal = this.is_internal;
                            final Boolean is_internal2 = modmailMessage.is_internal;
                            if (is_internal == is_internal2 || (is_internal != null && is_internal.equals(is_internal2))) {
                                final Boolean author_is_sr_moderator = this.author_is_sr_moderator;
                                final Boolean author_is_sr_moderator2 = modmailMessage.author_is_sr_moderator;
                                if (author_is_sr_moderator == author_is_sr_moderator2 || (author_is_sr_moderator != null && author_is_sr_moderator.equals(author_is_sr_moderator2))) {
                                    final String participating_as = this.participating_as;
                                    final String participating_as2 = modmailMessage.participating_as;
                                    boolean b2 = b;
                                    if (participating_as == participating_as2) {
                                        return b2;
                                    }
                                    if (participating_as != null && participating_as.equals(participating_as2)) {
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
        final String conversation_id = this.conversation_id;
        int hashCode3;
        if (conversation_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = conversation_id.hashCode();
        }
        final Long date_timestamp = this.date_timestamp;
        int hashCode4;
        if (date_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = date_timestamp.hashCode();
        }
        final String author_id = this.author_id;
        int hashCode5;
        if (author_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = author_id.hashCode();
        }
        final String body = this.body;
        int hashCode6;
        if (body == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = body.hashCode();
        }
        final Boolean is_internal = this.is_internal;
        int hashCode7;
        if (is_internal == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = is_internal.hashCode();
        }
        final Boolean author_is_sr_moderator = this.author_is_sr_moderator;
        int hashCode8;
        if (author_is_sr_moderator == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = author_is_sr_moderator.hashCode();
        }
        final String participating_as = this.participating_as;
        if (participating_as != null) {
            hashCode = participating_as.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ModmailMessage{id=");
        t.append(this.id);
        t.append(", conversation_id=");
        t.append(this.conversation_id);
        t.append(", date_timestamp=");
        t.append(this.date_timestamp);
        t.append(", author_id=");
        t.append(this.author_id);
        t.append(", body=");
        t.append(this.body);
        t.append(", is_internal=");
        t.append(this.is_internal);
        t.append(", author_is_sr_moderator=");
        t.append(this.author_is_sr_moderator);
        t.append(", participating_as=");
        return ph0.a.f(t, this.participating_as, "}");
    }
    
    public void write(final e e) throws IOException {
        ModmailMessage.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModmailMessage>
    {
        private String author_id;
        private Boolean author_is_sr_moderator;
        private String body;
        private String conversation_id;
        private Long date_timestamp;
        private String id;
        private Boolean is_internal;
        private String participating_as;
        
        public Builder() {
        }
        
        public Builder(final ModmailMessage modmailMessage) {
            this.id = modmailMessage.id;
            this.conversation_id = modmailMessage.conversation_id;
            this.date_timestamp = modmailMessage.date_timestamp;
            this.author_id = modmailMessage.author_id;
            this.body = modmailMessage.body;
            this.is_internal = modmailMessage.is_internal;
            this.author_is_sr_moderator = modmailMessage.author_is_sr_moderator;
            this.participating_as = modmailMessage.participating_as;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.conversation_id;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.date_timestamp;
        }
        
        public static String access$400(final Builder builder) {
            return builder.author_id;
        }
        
        public static String access$500(final Builder builder) {
            return builder.body;
        }
        
        public static Boolean access$600(final Builder builder) {
            return builder.is_internal;
        }
        
        public static Boolean access$700(final Builder builder) {
            return builder.author_is_sr_moderator;
        }
        
        public static String access$800(final Builder builder) {
            return builder.participating_as;
        }
        
        public Builder author_id(final String author_id) {
            this.author_id = author_id;
            return this;
        }
        
        public Builder author_is_sr_moderator(final Boolean author_is_sr_moderator) {
            this.author_is_sr_moderator = author_is_sr_moderator;
            return this;
        }
        
        public Builder body(final String body) {
            this.body = body;
            return this;
        }
        
        public ModmailMessage build() {
            return new ModmailMessage(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder conversation_id(final String conversation_id) {
            this.conversation_id = conversation_id;
            return this;
        }
        
        public Builder date_timestamp(final Long date_timestamp) {
            this.date_timestamp = date_timestamp;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_internal(final Boolean is_internal) {
            this.is_internal = is_internal;
            return this;
        }
        
        public Builder participating_as(final String participating_as) {
            this.participating_as = participating_as;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.conversation_id = null;
            this.date_timestamp = null;
            this.author_id = null;
            this.body = null;
            this.is_internal = null;
            this.author_is_sr_moderator = null;
            this.participating_as = null;
        }
    }
    
    public static final class ModmailMessageAdapter implements a<ModmailMessage, Builder>
    {
        private ModmailMessageAdapter() {
        }
        
        public ModmailMessageAdapter(final ModmailMessage$1 object) {
            this();
        }
        
        public ModmailMessage read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModmailMessage read(final e e, final Builder builder) throws IOException {
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
                    case 8: {
                        if (a == 11) {
                            builder.participating_as(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.author_is_sr_moderator(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.is_internal(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.body(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.author_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.date_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.conversation_id(e.F());
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
        
        public void write(final e e, final ModmailMessage modmailMessage) throws IOException {
            e.X();
            if (modmailMessage.id != null) {
                e.O(1, (byte)11);
                e.W(modmailMessage.id);
                e.P();
            }
            if (modmailMessage.conversation_id != null) {
                e.O(2, (byte)11);
                e.W(modmailMessage.conversation_id);
                e.P();
            }
            if (modmailMessage.date_timestamp != null) {
                e.O(3, (byte)10);
                k.w(modmailMessage.date_timestamp, e);
            }
            if (modmailMessage.author_id != null) {
                e.O(4, (byte)11);
                e.W(modmailMessage.author_id);
                e.P();
            }
            if (modmailMessage.body != null) {
                e.O(5, (byte)11);
                e.W(modmailMessage.body);
                e.P();
            }
            if (modmailMessage.is_internal != null) {
                e.O(6, (byte)2);
                android.support.v4.media.a.A(modmailMessage.is_internal, e);
            }
            if (modmailMessage.author_is_sr_moderator != null) {
                e.O(7, (byte)2);
                android.support.v4.media.a.A(modmailMessage.author_is_sr_moderator, e);
            }
            if (modmailMessage.participating_as != null) {
                e.O(8, (byte)11);
                e.W(modmailMessage.participating_as);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModmailMessage)o);
        }
    }
}
