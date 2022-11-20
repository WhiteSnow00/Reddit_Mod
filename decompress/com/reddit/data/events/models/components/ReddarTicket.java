// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class ReddarTicket
{
    public static final a<ReddarTicket, ReddarTicket.ReddarTicket$Builder> ADAPTER;
    public final List<String> actions;
    public final Long content_review_time;
    public final String copyright_owner;
    public final String current_value;
    public final String field_updated;
    public final String id;
    public final String locale;
    public final String loginbot_header_signature;
    public final Long num_content_items;
    public final String policy_violation;
    public final String previous_value;
    public final String queue_id;
    public final List<String> reddar_features_used;
    public final String report_source;
    public final String reporter_message;
    public final List<String> reports;
    public final String requestor_id;
    public final String requestor_name;
    public final String status;
    public final Long ticket_review_time;
    public final String type;
    
    static {
        ADAPTER = (a)new ReddarTicket.ReddarTicket$ReddarTicketAdapter((ReddarTicket$1)null);
    }
    
    private ReddarTicket(final ReddarTicket.ReddarTicket$Builder reddarTicket$Builder) {
        this.id = ReddarTicket.ReddarTicket$Builder.access$100(reddarTicket$Builder);
        this.type = ReddarTicket.ReddarTicket$Builder.access$200(reddarTicket$Builder);
        this.queue_id = ReddarTicket.ReddarTicket$Builder.access$300(reddarTicket$Builder);
        this.status = ReddarTicket.ReddarTicket$Builder.access$400(reddarTicket$Builder);
        this.report_source = ReddarTicket.ReddarTicket$Builder.access$500(reddarTicket$Builder);
        this.requestor_id = ReddarTicket.ReddarTicket$Builder.access$600(reddarTicket$Builder);
        this.requestor_name = ReddarTicket.ReddarTicket$Builder.access$700(reddarTicket$Builder);
        this.copyright_owner = ReddarTicket.ReddarTicket$Builder.access$800(reddarTicket$Builder);
        this.ticket_review_time = ReddarTicket.ReddarTicket$Builder.access$900(reddarTicket$Builder);
        this.content_review_time = ReddarTicket.ReddarTicket$Builder.access$1000(reddarTicket$Builder);
        this.num_content_items = ReddarTicket.ReddarTicket$Builder.access$1100(reddarTicket$Builder);
        final List access$1200 = ReddarTicket.ReddarTicket$Builder.access$1200(reddarTicket$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$1200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ReddarTicket.ReddarTicket$Builder.access$1200(reddarTicket$Builder));
        }
        this.reddar_features_used = unmodifiableList;
        this.field_updated = ReddarTicket.ReddarTicket$Builder.access$1300(reddarTicket$Builder);
        this.previous_value = ReddarTicket.ReddarTicket$Builder.access$1400(reddarTicket$Builder);
        this.current_value = ReddarTicket.ReddarTicket$Builder.access$1500(reddarTicket$Builder);
        this.locale = ReddarTicket.ReddarTicket$Builder.access$1600(reddarTicket$Builder);
        List<String> unmodifiableList2;
        if (ReddarTicket.ReddarTicket$Builder.access$1700(reddarTicket$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)ReddarTicket.ReddarTicket$Builder.access$1700(reddarTicket$Builder));
        }
        this.reports = unmodifiableList2;
        List<String> unmodifiableList3;
        if (ReddarTicket.ReddarTicket$Builder.access$1800(reddarTicket$Builder) == null) {
            unmodifiableList3 = list;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)ReddarTicket.ReddarTicket$Builder.access$1800(reddarTicket$Builder));
        }
        this.actions = unmodifiableList3;
        this.policy_violation = ReddarTicket.ReddarTicket$Builder.access$1900(reddarTicket$Builder);
        this.reporter_message = ReddarTicket.ReddarTicket$Builder.access$2000(reddarTicket$Builder);
        this.loginbot_header_signature = ReddarTicket.ReddarTicket$Builder.access$2100(reddarTicket$Builder);
    }
    
    public ReddarTicket(final ReddarTicket.ReddarTicket$Builder reddarTicket$Builder, final ReddarTicket$1 object) {
        this(reddarTicket$Builder);
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
        if (!(o instanceof ReddarTicket)) {
            return false;
        }
        final ReddarTicket reddarTicket = (ReddarTicket)o;
        final String id = this.id;
        final String id2 = reddarTicket.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String type = this.type;
            final String type2 = reddarTicket.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String queue_id = this.queue_id;
                final String queue_id2 = reddarTicket.queue_id;
                if (queue_id == queue_id2 || (queue_id != null && queue_id.equals(queue_id2))) {
                    final String status = this.status;
                    final String status2 = reddarTicket.status;
                    if (status == status2 || (status != null && status.equals(status2))) {
                        final String report_source = this.report_source;
                        final String report_source2 = reddarTicket.report_source;
                        if (report_source == report_source2 || (report_source != null && report_source.equals(report_source2))) {
                            final String requestor_id = this.requestor_id;
                            final String requestor_id2 = reddarTicket.requestor_id;
                            if (requestor_id == requestor_id2 || (requestor_id != null && requestor_id.equals(requestor_id2))) {
                                final String requestor_name = this.requestor_name;
                                final String requestor_name2 = reddarTicket.requestor_name;
                                if (requestor_name == requestor_name2 || (requestor_name != null && requestor_name.equals(requestor_name2))) {
                                    final String copyright_owner = this.copyright_owner;
                                    final String copyright_owner2 = reddarTicket.copyright_owner;
                                    if (copyright_owner == copyright_owner2 || (copyright_owner != null && copyright_owner.equals(copyright_owner2))) {
                                        final Long ticket_review_time = this.ticket_review_time;
                                        final Long ticket_review_time2 = reddarTicket.ticket_review_time;
                                        if (ticket_review_time == ticket_review_time2 || (ticket_review_time != null && ticket_review_time.equals(ticket_review_time2))) {
                                            final Long content_review_time = this.content_review_time;
                                            final Long content_review_time2 = reddarTicket.content_review_time;
                                            if (content_review_time == content_review_time2 || (content_review_time != null && content_review_time.equals(content_review_time2))) {
                                                final Long num_content_items = this.num_content_items;
                                                final Long num_content_items2 = reddarTicket.num_content_items;
                                                if (num_content_items == num_content_items2 || (num_content_items != null && num_content_items.equals(num_content_items2))) {
                                                    final List<String> reddar_features_used = this.reddar_features_used;
                                                    final List<String> reddar_features_used2 = reddarTicket.reddar_features_used;
                                                    if (reddar_features_used == reddar_features_used2 || (reddar_features_used != null && reddar_features_used.equals(reddar_features_used2))) {
                                                        final String field_updated = this.field_updated;
                                                        final String field_updated2 = reddarTicket.field_updated;
                                                        if (field_updated == field_updated2 || (field_updated != null && field_updated.equals(field_updated2))) {
                                                            final String previous_value = this.previous_value;
                                                            final String previous_value2 = reddarTicket.previous_value;
                                                            if (previous_value == previous_value2 || (previous_value != null && previous_value.equals(previous_value2))) {
                                                                final String current_value = this.current_value;
                                                                final String current_value2 = reddarTicket.current_value;
                                                                if (current_value == current_value2 || (current_value != null && current_value.equals(current_value2))) {
                                                                    final String locale = this.locale;
                                                                    final String locale2 = reddarTicket.locale;
                                                                    if (locale == locale2 || (locale != null && locale.equals(locale2))) {
                                                                        final List<String> reports = this.reports;
                                                                        final List<String> reports2 = reddarTicket.reports;
                                                                        if (reports == reports2 || (reports != null && reports.equals(reports2))) {
                                                                            final List<String> actions = this.actions;
                                                                            final List<String> actions2 = reddarTicket.actions;
                                                                            if (actions == actions2 || (actions != null && actions.equals(actions2))) {
                                                                                final String policy_violation = this.policy_violation;
                                                                                final String policy_violation2 = reddarTicket.policy_violation;
                                                                                if (policy_violation == policy_violation2 || (policy_violation != null && policy_violation.equals(policy_violation2))) {
                                                                                    final String reporter_message = this.reporter_message;
                                                                                    final String reporter_message2 = reddarTicket.reporter_message;
                                                                                    if (reporter_message == reporter_message2 || (reporter_message != null && reporter_message.equals(reporter_message2))) {
                                                                                        final String loginbot_header_signature = this.loginbot_header_signature;
                                                                                        final String loginbot_header_signature2 = reddarTicket.loginbot_header_signature;
                                                                                        boolean b2 = b;
                                                                                        if (loginbot_header_signature == loginbot_header_signature2) {
                                                                                            return b2;
                                                                                        }
                                                                                        if (loginbot_header_signature != null && loginbot_header_signature.equals(loginbot_header_signature2)) {
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
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String queue_id = this.queue_id;
        int hashCode4;
        if (queue_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = queue_id.hashCode();
        }
        final String status = this.status;
        int hashCode5;
        if (status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = status.hashCode();
        }
        final String report_source = this.report_source;
        int hashCode6;
        if (report_source == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = report_source.hashCode();
        }
        final String requestor_id = this.requestor_id;
        int hashCode7;
        if (requestor_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = requestor_id.hashCode();
        }
        final String requestor_name = this.requestor_name;
        int hashCode8;
        if (requestor_name == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = requestor_name.hashCode();
        }
        final String copyright_owner = this.copyright_owner;
        int hashCode9;
        if (copyright_owner == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = copyright_owner.hashCode();
        }
        final Long ticket_review_time = this.ticket_review_time;
        int hashCode10;
        if (ticket_review_time == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = ticket_review_time.hashCode();
        }
        final Long content_review_time = this.content_review_time;
        int hashCode11;
        if (content_review_time == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = content_review_time.hashCode();
        }
        final Long num_content_items = this.num_content_items;
        int hashCode12;
        if (num_content_items == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = num_content_items.hashCode();
        }
        final List<String> reddar_features_used = this.reddar_features_used;
        int hashCode13;
        if (reddar_features_used == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = reddar_features_used.hashCode();
        }
        final String field_updated = this.field_updated;
        int hashCode14;
        if (field_updated == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = field_updated.hashCode();
        }
        final String previous_value = this.previous_value;
        int hashCode15;
        if (previous_value == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = previous_value.hashCode();
        }
        final String current_value = this.current_value;
        int hashCode16;
        if (current_value == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = current_value.hashCode();
        }
        final String locale = this.locale;
        int hashCode17;
        if (locale == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = locale.hashCode();
        }
        final List<String> reports = this.reports;
        int hashCode18;
        if (reports == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = reports.hashCode();
        }
        final List<String> actions = this.actions;
        int hashCode19;
        if (actions == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = actions.hashCode();
        }
        final String policy_violation = this.policy_violation;
        int hashCode20;
        if (policy_violation == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = policy_violation.hashCode();
        }
        final String reporter_message = this.reporter_message;
        int hashCode21;
        if (reporter_message == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = reporter_message.hashCode();
        }
        final String loginbot_header_signature = this.loginbot_header_signature;
        if (loginbot_header_signature != null) {
            hashCode = loginbot_header_signature.hashCode();
        }
        return (((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReddarTicket{id=");
        t.append(this.id);
        t.append(", type=");
        t.append(this.type);
        t.append(", queue_id=");
        t.append(this.queue_id);
        t.append(", status=");
        t.append(this.status);
        t.append(", report_source=");
        t.append(this.report_source);
        t.append(", requestor_id=");
        t.append(this.requestor_id);
        t.append(", requestor_name=");
        t.append(this.requestor_name);
        t.append(", copyright_owner=");
        t.append(this.copyright_owner);
        t.append(", ticket_review_time=");
        t.append(this.ticket_review_time);
        t.append(", content_review_time=");
        t.append(this.content_review_time);
        t.append(", num_content_items=");
        t.append(this.num_content_items);
        t.append(", reddar_features_used=");
        t.append(this.reddar_features_used);
        t.append(", field_updated=");
        t.append(this.field_updated);
        t.append(", previous_value=");
        t.append(this.previous_value);
        t.append(", current_value=");
        t.append(this.current_value);
        t.append(", locale=");
        t.append(this.locale);
        t.append(", reports=");
        t.append(this.reports);
        t.append(", actions=");
        t.append(this.actions);
        t.append(", policy_violation=");
        t.append(this.policy_violation);
        t.append(", reporter_message=");
        t.append(this.reporter_message);
        t.append(", loginbot_header_signature=");
        return ph0.a.f(t, this.loginbot_header_signature, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarTicket.ADAPTER.write(e, (Object)this);
    }
}
