// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ModmailConversation
{
    public static final a<ModmailConversation, Builder> ADAPTER;
    public final String id;
    public final Boolean is_auto;
    public final Boolean is_highlighted;
    public final Boolean is_internal;
    public final Long last_mod_update_timestamp;
    public final Long last_user_update_timestamp;
    public final String legacy_first_message_id;
    public final Integer number_messages;
    public final String participant_conversation_id;
    public final String participant_id;
    public final String participant_subreddit_id;
    public final String state;
    public final String subject;
    public final String subreddit_id;
    public final String type;
    
    static {
        ADAPTER = (a)new ModmailConversationAdapter(null);
    }
    
    private ModmailConversation(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.subreddit_id = Builder.access$200(builder);
        this.subject = Builder.access$300(builder);
        this.state = Builder.access$400(builder);
        this.number_messages = Builder.access$500(builder);
        this.last_user_update_timestamp = Builder.access$600(builder);
        this.last_mod_update_timestamp = Builder.access$700(builder);
        this.is_internal = Builder.access$800(builder);
        this.is_auto = Builder.access$900(builder);
        this.is_highlighted = Builder.access$1000(builder);
        this.legacy_first_message_id = Builder.access$1100(builder);
        this.participant_id = Builder.access$1200(builder);
        this.type = Builder.access$1300(builder);
        this.participant_subreddit_id = Builder.access$1400(builder);
        this.participant_conversation_id = Builder.access$1500(builder);
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
        if (!(o instanceof ModmailConversation)) {
            return false;
        }
        final ModmailConversation modmailConversation = (ModmailConversation)o;
        final String id = this.id;
        final String id2 = modmailConversation.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String subreddit_id = this.subreddit_id;
            final String subreddit_id2 = modmailConversation.subreddit_id;
            if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                final String subject = this.subject;
                final String subject2 = modmailConversation.subject;
                if (subject == subject2 || (subject != null && subject.equals(subject2))) {
                    final String state = this.state;
                    final String state2 = modmailConversation.state;
                    if (state == state2 || (state != null && state.equals(state2))) {
                        final Integer number_messages = this.number_messages;
                        final Integer number_messages2 = modmailConversation.number_messages;
                        if (number_messages == number_messages2 || (number_messages != null && number_messages.equals(number_messages2))) {
                            final Long last_user_update_timestamp = this.last_user_update_timestamp;
                            final Long last_user_update_timestamp2 = modmailConversation.last_user_update_timestamp;
                            if (last_user_update_timestamp == last_user_update_timestamp2 || (last_user_update_timestamp != null && last_user_update_timestamp.equals(last_user_update_timestamp2))) {
                                final Long last_mod_update_timestamp = this.last_mod_update_timestamp;
                                final Long last_mod_update_timestamp2 = modmailConversation.last_mod_update_timestamp;
                                if (last_mod_update_timestamp == last_mod_update_timestamp2 || (last_mod_update_timestamp != null && last_mod_update_timestamp.equals(last_mod_update_timestamp2))) {
                                    final Boolean is_internal = this.is_internal;
                                    final Boolean is_internal2 = modmailConversation.is_internal;
                                    if (is_internal == is_internal2 || (is_internal != null && is_internal.equals(is_internal2))) {
                                        final Boolean is_auto = this.is_auto;
                                        final Boolean is_auto2 = modmailConversation.is_auto;
                                        if (is_auto == is_auto2 || (is_auto != null && is_auto.equals(is_auto2))) {
                                            final Boolean is_highlighted = this.is_highlighted;
                                            final Boolean is_highlighted2 = modmailConversation.is_highlighted;
                                            if (is_highlighted == is_highlighted2 || (is_highlighted != null && is_highlighted.equals(is_highlighted2))) {
                                                final String legacy_first_message_id = this.legacy_first_message_id;
                                                final String legacy_first_message_id2 = modmailConversation.legacy_first_message_id;
                                                if (legacy_first_message_id == legacy_first_message_id2 || (legacy_first_message_id != null && legacy_first_message_id.equals(legacy_first_message_id2))) {
                                                    final String participant_id = this.participant_id;
                                                    final String participant_id2 = modmailConversation.participant_id;
                                                    if (participant_id == participant_id2 || (participant_id != null && participant_id.equals(participant_id2))) {
                                                        final String type = this.type;
                                                        final String type2 = modmailConversation.type;
                                                        if (type == type2 || (type != null && type.equals(type2))) {
                                                            final String participant_subreddit_id = this.participant_subreddit_id;
                                                            final String participant_subreddit_id2 = modmailConversation.participant_subreddit_id;
                                                            if (participant_subreddit_id == participant_subreddit_id2 || (participant_subreddit_id != null && participant_subreddit_id.equals(participant_subreddit_id2))) {
                                                                final String participant_conversation_id = this.participant_conversation_id;
                                                                final String participant_conversation_id2 = modmailConversation.participant_conversation_id;
                                                                boolean b2 = b;
                                                                if (participant_conversation_id == participant_conversation_id2) {
                                                                    return b2;
                                                                }
                                                                if (participant_conversation_id != null && participant_conversation_id.equals(participant_conversation_id2)) {
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
        final String subreddit_id = this.subreddit_id;
        int hashCode3;
        if (subreddit_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subreddit_id.hashCode();
        }
        final String subject = this.subject;
        int hashCode4;
        if (subject == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subject.hashCode();
        }
        final String state = this.state;
        int hashCode5;
        if (state == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = state.hashCode();
        }
        final Integer number_messages = this.number_messages;
        int hashCode6;
        if (number_messages == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = number_messages.hashCode();
        }
        final Long last_user_update_timestamp = this.last_user_update_timestamp;
        int hashCode7;
        if (last_user_update_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = last_user_update_timestamp.hashCode();
        }
        final Long last_mod_update_timestamp = this.last_mod_update_timestamp;
        int hashCode8;
        if (last_mod_update_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = last_mod_update_timestamp.hashCode();
        }
        final Boolean is_internal = this.is_internal;
        int hashCode9;
        if (is_internal == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = is_internal.hashCode();
        }
        final Boolean is_auto = this.is_auto;
        int hashCode10;
        if (is_auto == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = is_auto.hashCode();
        }
        final Boolean is_highlighted = this.is_highlighted;
        int hashCode11;
        if (is_highlighted == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = is_highlighted.hashCode();
        }
        final String legacy_first_message_id = this.legacy_first_message_id;
        int hashCode12;
        if (legacy_first_message_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = legacy_first_message_id.hashCode();
        }
        final String participant_id = this.participant_id;
        int hashCode13;
        if (participant_id == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = participant_id.hashCode();
        }
        final String type = this.type;
        int hashCode14;
        if (type == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = type.hashCode();
        }
        final String participant_subreddit_id = this.participant_subreddit_id;
        int hashCode15;
        if (participant_subreddit_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = participant_subreddit_id.hashCode();
        }
        final String participant_conversation_id = this.participant_conversation_id;
        if (participant_conversation_id != null) {
            hashCode = participant_conversation_id.hashCode();
        }
        return (((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ModmailConversation{id=");
        k.append(this.id);
        k.append(", subreddit_id=");
        k.append(this.subreddit_id);
        k.append(", subject=");
        k.append(this.subject);
        k.append(", state=");
        k.append(this.state);
        k.append(", number_messages=");
        k.append(this.number_messages);
        k.append(", last_user_update_timestamp=");
        k.append(this.last_user_update_timestamp);
        k.append(", last_mod_update_timestamp=");
        k.append(this.last_mod_update_timestamp);
        k.append(", is_internal=");
        k.append(this.is_internal);
        k.append(", is_auto=");
        k.append(this.is_auto);
        k.append(", is_highlighted=");
        k.append(this.is_highlighted);
        k.append(", legacy_first_message_id=");
        k.append(this.legacy_first_message_id);
        k.append(", participant_id=");
        k.append(this.participant_id);
        k.append(", type=");
        k.append(this.type);
        k.append(", participant_subreddit_id=");
        k.append(this.participant_subreddit_id);
        k.append(", participant_conversation_id=");
        return b.j(k, this.participant_conversation_id, "}");
    }
    
    public void write(final e e) throws IOException {
        ModmailConversation.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<ModmailConversation>
    {
        private String id;
        private Boolean is_auto;
        private Boolean is_highlighted;
        private Boolean is_internal;
        private Long last_mod_update_timestamp;
        private Long last_user_update_timestamp;
        private String legacy_first_message_id;
        private Integer number_messages;
        private String participant_conversation_id;
        private String participant_id;
        private String participant_subreddit_id;
        private String state;
        private String subject;
        private String subreddit_id;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final ModmailConversation modmailConversation) {
            this.id = modmailConversation.id;
            this.subreddit_id = modmailConversation.subreddit_id;
            this.subject = modmailConversation.subject;
            this.state = modmailConversation.state;
            this.number_messages = modmailConversation.number_messages;
            this.last_user_update_timestamp = modmailConversation.last_user_update_timestamp;
            this.last_mod_update_timestamp = modmailConversation.last_mod_update_timestamp;
            this.is_internal = modmailConversation.is_internal;
            this.is_auto = modmailConversation.is_auto;
            this.is_highlighted = modmailConversation.is_highlighted;
            this.legacy_first_message_id = modmailConversation.legacy_first_message_id;
            this.participant_id = modmailConversation.participant_id;
            this.type = modmailConversation.type;
            this.participant_subreddit_id = modmailConversation.participant_subreddit_id;
            this.participant_conversation_id = modmailConversation.participant_conversation_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Boolean access$1000(final Builder builder) {
            return builder.is_highlighted;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.legacy_first_message_id;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.participant_id;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.participant_subreddit_id;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.participant_conversation_id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.subreddit_id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.subject;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.state;
        }
        
        public static /* synthetic */ Integer access$500(final Builder builder) {
            return builder.number_messages;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.last_user_update_timestamp;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.last_mod_update_timestamp;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.is_internal;
        }
        
        public static /* synthetic */ Boolean access$900(final Builder builder) {
            return builder.is_auto;
        }
        
        public ModmailConversation build() {
            return new ModmailConversation(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_auto(final Boolean is_auto) {
            this.is_auto = is_auto;
            return this;
        }
        
        public Builder is_highlighted(final Boolean is_highlighted) {
            this.is_highlighted = is_highlighted;
            return this;
        }
        
        public Builder is_internal(final Boolean is_internal) {
            this.is_internal = is_internal;
            return this;
        }
        
        public Builder last_mod_update_timestamp(final Long last_mod_update_timestamp) {
            this.last_mod_update_timestamp = last_mod_update_timestamp;
            return this;
        }
        
        public Builder last_user_update_timestamp(final Long last_user_update_timestamp) {
            this.last_user_update_timestamp = last_user_update_timestamp;
            return this;
        }
        
        public Builder legacy_first_message_id(final String legacy_first_message_id) {
            this.legacy_first_message_id = legacy_first_message_id;
            return this;
        }
        
        public Builder number_messages(final Integer number_messages) {
            this.number_messages = number_messages;
            return this;
        }
        
        public Builder participant_conversation_id(final String participant_conversation_id) {
            this.participant_conversation_id = participant_conversation_id;
            return this;
        }
        
        public Builder participant_id(final String participant_id) {
            this.participant_id = participant_id;
            return this;
        }
        
        public Builder participant_subreddit_id(final String participant_subreddit_id) {
            this.participant_subreddit_id = participant_subreddit_id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.subreddit_id = null;
            this.subject = null;
            this.state = null;
            this.number_messages = null;
            this.last_user_update_timestamp = null;
            this.last_mod_update_timestamp = null;
            this.is_internal = null;
            this.is_auto = null;
            this.is_highlighted = null;
            this.legacy_first_message_id = null;
            this.participant_id = null;
            this.type = null;
            this.participant_subreddit_id = null;
            this.participant_conversation_id = null;
        }
        
        public Builder state(final String state) {
            this.state = state;
            return this;
        }
        
        public Builder subject(final String subject) {
            this.subject = subject;
            return this;
        }
        
        public Builder subreddit_id(final String subreddit_id) {
            this.subreddit_id = subreddit_id;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ModmailConversationAdapter implements a<ModmailConversation, Builder>
    {
        private ModmailConversationAdapter() {
        }
        
        public ModmailConversation read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModmailConversation read(final e e, final Builder builder) throws IOException {
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
                    case 15: {
                        if (a == 11) {
                            builder.participant_conversation_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.participant_subreddit_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.participant_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.legacy_first_message_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 2) {
                            builder.is_highlighted(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.is_auto(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.is_internal(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.last_mod_update_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.last_user_update_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.number_messages(e.t());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.state(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.subject(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.subreddit_id(e.F());
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
        
        public void write(final e e, final ModmailConversation modmailConversation) throws IOException {
            e.a0();
            if (modmailConversation.id != null) {
                e.N(1, (byte)11);
                e.Z(modmailConversation.id);
                e.O();
            }
            if (modmailConversation.subreddit_id != null) {
                e.N(2, (byte)11);
                e.Z(modmailConversation.subreddit_id);
                e.O();
            }
            if (modmailConversation.subject != null) {
                e.N(3, (byte)11);
                e.Z(modmailConversation.subject);
                e.O();
            }
            if (modmailConversation.state != null) {
                e.N(4, (byte)11);
                e.Z(modmailConversation.state);
                e.O();
            }
            if (modmailConversation.number_messages != null) {
                e.N(5, (byte)8);
                b.r(modmailConversation.number_messages, e);
            }
            if (modmailConversation.last_user_update_timestamp != null) {
                e.N(6, (byte)10);
                a.r(modmailConversation.last_user_update_timestamp, e);
            }
            if (modmailConversation.last_mod_update_timestamp != null) {
                e.N(7, (byte)10);
                a.r(modmailConversation.last_mod_update_timestamp, e);
            }
            if (modmailConversation.is_internal != null) {
                e.N(8, (byte)2);
                d.z(modmailConversation.is_internal, e);
            }
            if (modmailConversation.is_auto != null) {
                e.N(9, (byte)2);
                d.z(modmailConversation.is_auto, e);
            }
            if (modmailConversation.is_highlighted != null) {
                e.N(10, (byte)2);
                d.z(modmailConversation.is_highlighted, e);
            }
            if (modmailConversation.legacy_first_message_id != null) {
                e.N(11, (byte)11);
                e.Z(modmailConversation.legacy_first_message_id);
                e.O();
            }
            if (modmailConversation.participant_id != null) {
                e.N(12, (byte)11);
                e.Z(modmailConversation.participant_id);
                e.O();
            }
            if (modmailConversation.type != null) {
                e.N(13, (byte)11);
                e.Z(modmailConversation.type);
                e.O();
            }
            if (modmailConversation.participant_subreddit_id != null) {
                e.N(14, (byte)11);
                e.Z(modmailConversation.participant_subreddit_id);
                e.O();
            }
            if (modmailConversation.participant_conversation_id != null) {
                e.N(15, (byte)11);
                e.Z(modmailConversation.participant_conversation_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
