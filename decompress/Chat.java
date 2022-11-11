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

public final class Chat
{
    public static final a<Chat, Chat.Chat$Builder> ADAPTER;
    public final String blocked_user_id;
    public final String channel_name;
    public final Boolean existing_channel;
    public final String id;
    public final String image_upload_method;
    public final String invitation_id;
    public final String invitation_preview_type;
    public final Long invitation_timestamp;
    public final String invitation_type;
    public final Boolean is_member;
    public final List<String> members;
    public final String message_body;
    public final Long message_id;
    public final Long message_length;
    public final String message_type;
    public final Long number_blocked_users;
    public final Long number_channels;
    public final Long number_members;
    public final Long number_pending_invites;
    public final Long number_unreads;
    public final String recipient_user_id;
    public final String report_reason;
    public final String reported_user_id;
    public final String request_name;
    public final String sender_user_id;
    public final Boolean shown_history;
    public final String type;
    public final String user_added_method;
    
    static {
        ADAPTER = (a)new Chat.Chat$ChatAdapter((Chat$1)null);
    }
    
    private Chat(final Chat.Chat$Builder chat$Builder) {
        this.blocked_user_id = Chat.Chat$Builder.access$100(chat$Builder);
        this.id = Chat.Chat$Builder.access$200(chat$Builder);
        this.type = Chat.Chat$Builder.access$300(chat$Builder);
        this.existing_channel = Chat.Chat$Builder.access$400(chat$Builder);
        this.image_upload_method = Chat.Chat$Builder.access$500(chat$Builder);
        this.user_added_method = Chat.Chat$Builder.access$600(chat$Builder);
        this.invitation_id = Chat.Chat$Builder.access$700(chat$Builder);
        this.invitation_type = Chat.Chat$Builder.access$800(chat$Builder);
        List<String> unmodifiableList;
        if (Chat.Chat$Builder.access$900(chat$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Chat.Chat$Builder.access$900(chat$Builder));
        }
        this.members = unmodifiableList;
        this.invitation_preview_type = Chat.Chat$Builder.access$1000(chat$Builder);
        this.message_type = Chat.Chat$Builder.access$1100(chat$Builder);
        this.number_channels = Chat.Chat$Builder.access$1200(chat$Builder);
        this.number_pending_invites = Chat.Chat$Builder.access$1300(chat$Builder);
        this.number_members = Chat.Chat$Builder.access$1400(chat$Builder);
        this.number_unreads = Chat.Chat$Builder.access$1500(chat$Builder);
        this.reported_user_id = Chat.Chat$Builder.access$1600(chat$Builder);
        this.sender_user_id = Chat.Chat$Builder.access$1700(chat$Builder);
        this.invitation_timestamp = Chat.Chat$Builder.access$1800(chat$Builder);
        this.message_length = Chat.Chat$Builder.access$1900(chat$Builder);
        this.recipient_user_id = Chat.Chat$Builder.access$2000(chat$Builder);
        this.number_blocked_users = Chat.Chat$Builder.access$2100(chat$Builder);
        this.request_name = Chat.Chat$Builder.access$2200(chat$Builder);
        this.is_member = Chat.Chat$Builder.access$2300(chat$Builder);
        this.shown_history = Chat.Chat$Builder.access$2400(chat$Builder);
        this.message_id = Chat.Chat$Builder.access$2500(chat$Builder);
        this.report_reason = Chat.Chat$Builder.access$2600(chat$Builder);
        this.message_body = Chat.Chat$Builder.access$2700(chat$Builder);
        this.channel_name = Chat.Chat$Builder.access$2800(chat$Builder);
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
        if (!(o instanceof Chat)) {
            return false;
        }
        final Chat chat = (Chat)o;
        final String blocked_user_id = this.blocked_user_id;
        final String blocked_user_id2 = chat.blocked_user_id;
        if (blocked_user_id == blocked_user_id2 || (blocked_user_id != null && blocked_user_id.equals(blocked_user_id2))) {
            final String id = this.id;
            final String id2 = chat.id;
            if (id == id2 || (id != null && id.equals(id2))) {
                final String type = this.type;
                final String type2 = chat.type;
                if (type == type2 || (type != null && type.equals(type2))) {
                    final Boolean existing_channel = this.existing_channel;
                    final Boolean existing_channel2 = chat.existing_channel;
                    if (existing_channel == existing_channel2 || (existing_channel != null && existing_channel.equals(existing_channel2))) {
                        final String image_upload_method = this.image_upload_method;
                        final String image_upload_method2 = chat.image_upload_method;
                        if (image_upload_method == image_upload_method2 || (image_upload_method != null && image_upload_method.equals(image_upload_method2))) {
                            final String user_added_method = this.user_added_method;
                            final String user_added_method2 = chat.user_added_method;
                            if (user_added_method == user_added_method2 || (user_added_method != null && user_added_method.equals(user_added_method2))) {
                                final String invitation_id = this.invitation_id;
                                final String invitation_id2 = chat.invitation_id;
                                if (invitation_id == invitation_id2 || (invitation_id != null && invitation_id.equals(invitation_id2))) {
                                    final String invitation_type = this.invitation_type;
                                    final String invitation_type2 = chat.invitation_type;
                                    if (invitation_type == invitation_type2 || (invitation_type != null && invitation_type.equals(invitation_type2))) {
                                        final List<String> members = this.members;
                                        final List<String> members2 = chat.members;
                                        if (members == members2 || (members != null && members.equals(members2))) {
                                            final String invitation_preview_type = this.invitation_preview_type;
                                            final String invitation_preview_type2 = chat.invitation_preview_type;
                                            if (invitation_preview_type == invitation_preview_type2 || (invitation_preview_type != null && invitation_preview_type.equals(invitation_preview_type2))) {
                                                final String message_type = this.message_type;
                                                final String message_type2 = chat.message_type;
                                                if (message_type == message_type2 || (message_type != null && message_type.equals(message_type2))) {
                                                    final Long number_channels = this.number_channels;
                                                    final Long number_channels2 = chat.number_channels;
                                                    if (number_channels == number_channels2 || (number_channels != null && number_channels.equals(number_channels2))) {
                                                        final Long number_pending_invites = this.number_pending_invites;
                                                        final Long number_pending_invites2 = chat.number_pending_invites;
                                                        if (number_pending_invites == number_pending_invites2 || (number_pending_invites != null && number_pending_invites.equals(number_pending_invites2))) {
                                                            final Long number_members = this.number_members;
                                                            final Long number_members2 = chat.number_members;
                                                            if (number_members == number_members2 || (number_members != null && number_members.equals(number_members2))) {
                                                                final Long number_unreads = this.number_unreads;
                                                                final Long number_unreads2 = chat.number_unreads;
                                                                if (number_unreads == number_unreads2 || (number_unreads != null && number_unreads.equals(number_unreads2))) {
                                                                    final String reported_user_id = this.reported_user_id;
                                                                    final String reported_user_id2 = chat.reported_user_id;
                                                                    if (reported_user_id == reported_user_id2 || (reported_user_id != null && reported_user_id.equals(reported_user_id2))) {
                                                                        final String sender_user_id = this.sender_user_id;
                                                                        final String sender_user_id2 = chat.sender_user_id;
                                                                        if (sender_user_id == sender_user_id2 || (sender_user_id != null && sender_user_id.equals(sender_user_id2))) {
                                                                            final Long invitation_timestamp = this.invitation_timestamp;
                                                                            final Long invitation_timestamp2 = chat.invitation_timestamp;
                                                                            if (invitation_timestamp == invitation_timestamp2 || (invitation_timestamp != null && invitation_timestamp.equals(invitation_timestamp2))) {
                                                                                final Long message_length = this.message_length;
                                                                                final Long message_length2 = chat.message_length;
                                                                                if (message_length == message_length2 || (message_length != null && message_length.equals(message_length2))) {
                                                                                    final String recipient_user_id = this.recipient_user_id;
                                                                                    final String recipient_user_id2 = chat.recipient_user_id;
                                                                                    if (recipient_user_id == recipient_user_id2 || (recipient_user_id != null && recipient_user_id.equals(recipient_user_id2))) {
                                                                                        final Long number_blocked_users = this.number_blocked_users;
                                                                                        final Long number_blocked_users2 = chat.number_blocked_users;
                                                                                        if (number_blocked_users == number_blocked_users2 || (number_blocked_users != null && number_blocked_users.equals(number_blocked_users2))) {
                                                                                            final String request_name = this.request_name;
                                                                                            final String request_name2 = chat.request_name;
                                                                                            if (request_name == request_name2 || (request_name != null && request_name.equals(request_name2))) {
                                                                                                final Boolean is_member = this.is_member;
                                                                                                final Boolean is_member2 = chat.is_member;
                                                                                                if (is_member == is_member2 || (is_member != null && is_member.equals(is_member2))) {
                                                                                                    final Boolean shown_history = this.shown_history;
                                                                                                    final Boolean shown_history2 = chat.shown_history;
                                                                                                    if (shown_history == shown_history2 || (shown_history != null && shown_history.equals(shown_history2))) {
                                                                                                        final Long message_id = this.message_id;
                                                                                                        final Long message_id2 = chat.message_id;
                                                                                                        if (message_id == message_id2 || (message_id != null && message_id.equals(message_id2))) {
                                                                                                            final String report_reason = this.report_reason;
                                                                                                            final String report_reason2 = chat.report_reason;
                                                                                                            if (report_reason == report_reason2 || (report_reason != null && report_reason.equals(report_reason2))) {
                                                                                                                final String message_body = this.message_body;
                                                                                                                final String message_body2 = chat.message_body;
                                                                                                                if (message_body == message_body2 || (message_body != null && message_body.equals(message_body2))) {
                                                                                                                    final String channel_name = this.channel_name;
                                                                                                                    final String channel_name2 = chat.channel_name;
                                                                                                                    boolean b2 = b;
                                                                                                                    if (channel_name == channel_name2) {
                                                                                                                        return b2;
                                                                                                                    }
                                                                                                                    if (channel_name != null && channel_name.equals(channel_name2)) {
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
        final String blocked_user_id = this.blocked_user_id;
        int hashCode = 0;
        int hashCode2;
        if (blocked_user_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = blocked_user_id.hashCode();
        }
        final String id = this.id;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final String type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final Boolean existing_channel = this.existing_channel;
        int hashCode5;
        if (existing_channel == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = existing_channel.hashCode();
        }
        final String image_upload_method = this.image_upload_method;
        int hashCode6;
        if (image_upload_method == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = image_upload_method.hashCode();
        }
        final String user_added_method = this.user_added_method;
        int hashCode7;
        if (user_added_method == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = user_added_method.hashCode();
        }
        final String invitation_id = this.invitation_id;
        int hashCode8;
        if (invitation_id == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = invitation_id.hashCode();
        }
        final String invitation_type = this.invitation_type;
        int hashCode9;
        if (invitation_type == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = invitation_type.hashCode();
        }
        final List<String> members = this.members;
        int hashCode10;
        if (members == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = members.hashCode();
        }
        final String invitation_preview_type = this.invitation_preview_type;
        int hashCode11;
        if (invitation_preview_type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = invitation_preview_type.hashCode();
        }
        final String message_type = this.message_type;
        int hashCode12;
        if (message_type == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = message_type.hashCode();
        }
        final Long number_channels = this.number_channels;
        int hashCode13;
        if (number_channels == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = number_channels.hashCode();
        }
        final Long number_pending_invites = this.number_pending_invites;
        int hashCode14;
        if (number_pending_invites == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = number_pending_invites.hashCode();
        }
        final Long number_members = this.number_members;
        int hashCode15;
        if (number_members == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = number_members.hashCode();
        }
        final Long number_unreads = this.number_unreads;
        int hashCode16;
        if (number_unreads == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = number_unreads.hashCode();
        }
        final String reported_user_id = this.reported_user_id;
        int hashCode17;
        if (reported_user_id == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = reported_user_id.hashCode();
        }
        final String sender_user_id = this.sender_user_id;
        int hashCode18;
        if (sender_user_id == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = sender_user_id.hashCode();
        }
        final Long invitation_timestamp = this.invitation_timestamp;
        int hashCode19;
        if (invitation_timestamp == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = invitation_timestamp.hashCode();
        }
        final Long message_length = this.message_length;
        int hashCode20;
        if (message_length == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = message_length.hashCode();
        }
        final String recipient_user_id = this.recipient_user_id;
        int hashCode21;
        if (recipient_user_id == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = recipient_user_id.hashCode();
        }
        final Long number_blocked_users = this.number_blocked_users;
        int hashCode22;
        if (number_blocked_users == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = number_blocked_users.hashCode();
        }
        final String request_name = this.request_name;
        int hashCode23;
        if (request_name == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = request_name.hashCode();
        }
        final Boolean is_member = this.is_member;
        int hashCode24;
        if (is_member == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = is_member.hashCode();
        }
        final Boolean shown_history = this.shown_history;
        int hashCode25;
        if (shown_history == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = shown_history.hashCode();
        }
        final Long message_id = this.message_id;
        int hashCode26;
        if (message_id == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = message_id.hashCode();
        }
        final String report_reason = this.report_reason;
        int hashCode27;
        if (report_reason == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = report_reason.hashCode();
        }
        final String message_body = this.message_body;
        int hashCode28;
        if (message_body == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = message_body.hashCode();
        }
        final String channel_name = this.channel_name;
        if (channel_name != null) {
            hashCode = channel_name.hashCode();
        }
        return ((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Chat{blocked_user_id=");
        k.append(this.blocked_user_id);
        k.append(", id=");
        k.append(this.id);
        k.append(", type=");
        k.append(this.type);
        k.append(", existing_channel=");
        k.append(this.existing_channel);
        k.append(", image_upload_method=");
        k.append(this.image_upload_method);
        k.append(", user_added_method=");
        k.append(this.user_added_method);
        k.append(", invitation_id=");
        k.append(this.invitation_id);
        k.append(", invitation_type=");
        k.append(this.invitation_type);
        k.append(", members=");
        k.append(this.members);
        k.append(", invitation_preview_type=");
        k.append(this.invitation_preview_type);
        k.append(", message_type=");
        k.append(this.message_type);
        k.append(", number_channels=");
        k.append(this.number_channels);
        k.append(", number_pending_invites=");
        k.append(this.number_pending_invites);
        k.append(", number_members=");
        k.append(this.number_members);
        k.append(", number_unreads=");
        k.append(this.number_unreads);
        k.append(", reported_user_id=");
        k.append(this.reported_user_id);
        k.append(", sender_user_id=");
        k.append(this.sender_user_id);
        k.append(", invitation_timestamp=");
        k.append(this.invitation_timestamp);
        k.append(", message_length=");
        k.append(this.message_length);
        k.append(", recipient_user_id=");
        k.append(this.recipient_user_id);
        k.append(", number_blocked_users=");
        k.append(this.number_blocked_users);
        k.append(", request_name=");
        k.append(this.request_name);
        k.append(", is_member=");
        k.append(this.is_member);
        k.append(", shown_history=");
        k.append(this.shown_history);
        k.append(", message_id=");
        k.append(this.message_id);
        k.append(", report_reason=");
        k.append(this.report_reason);
        k.append(", message_body=");
        k.append(this.message_body);
        k.append(", channel_name=");
        return b.j(k, this.channel_name, "}");
    }
    
    public void write(final e e) throws IOException {
        Chat.ADAPTER.write(e, (Object)this);
    }
}
