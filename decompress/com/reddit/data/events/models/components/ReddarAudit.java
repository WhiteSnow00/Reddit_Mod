// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class ReddarAudit
{
    public static final a<ReddarAudit, ReddarAudit.ReddarAudit$Builder> ADAPTER;
    public final String assigned_to_id;
    public final String auditor_id;
    public final String id;
    public final List<String> included_agent_ids;
    public final List<String> included_queues;
    public final Long included_range_end_timestamp;
    public final Long included_range_start_timestamp;
    public final Boolean is_actioned;
    public final Double percent_tickets_included;
    public final List<Integer> policy_violations;
    public final List<String> ticket_ids;
    
    static {
        ADAPTER = (a)new ReddarAudit.ReddarAudit$ReddarAuditAdapter((ReddarAudit$1)null);
    }
    
    private ReddarAudit(final ReddarAudit.ReddarAudit$Builder reddarAudit$Builder) {
        this.id = ReddarAudit.ReddarAudit$Builder.access$100(reddarAudit$Builder);
        this.auditor_id = ReddarAudit.ReddarAudit$Builder.access$200(reddarAudit$Builder);
        final List access$300 = ReddarAudit.ReddarAudit$Builder.access$300(reddarAudit$Builder);
        final List<Integer> list = null;
        List<String> unmodifiableList;
        if (access$300 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ReddarAudit.ReddarAudit$Builder.access$300(reddarAudit$Builder));
        }
        this.ticket_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (ReddarAudit.ReddarAudit$Builder.access$400(reddarAudit$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)ReddarAudit.ReddarAudit$Builder.access$400(reddarAudit$Builder));
        }
        this.included_queues = unmodifiableList2;
        List<String> unmodifiableList3;
        if (ReddarAudit.ReddarAudit$Builder.access$500(reddarAudit$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)ReddarAudit.ReddarAudit$Builder.access$500(reddarAudit$Builder));
        }
        this.included_agent_ids = unmodifiableList3;
        this.included_range_start_timestamp = ReddarAudit.ReddarAudit$Builder.access$600(reddarAudit$Builder);
        this.included_range_end_timestamp = ReddarAudit.ReddarAudit$Builder.access$700(reddarAudit$Builder);
        this.percent_tickets_included = ReddarAudit.ReddarAudit$Builder.access$800(reddarAudit$Builder);
        this.assigned_to_id = ReddarAudit.ReddarAudit$Builder.access$900(reddarAudit$Builder);
        this.is_actioned = ReddarAudit.ReddarAudit$Builder.access$1000(reddarAudit$Builder);
        List<Integer> unmodifiableList4;
        if (ReddarAudit.ReddarAudit$Builder.access$1100(reddarAudit$Builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends Integer>)ReddarAudit.ReddarAudit$Builder.access$1100(reddarAudit$Builder));
        }
        this.policy_violations = unmodifiableList4;
    }
    
    public ReddarAudit(final ReddarAudit.ReddarAudit$Builder reddarAudit$Builder, final ReddarAudit$1 object) {
        this(reddarAudit$Builder);
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
        if (!(o instanceof ReddarAudit)) {
            return false;
        }
        final ReddarAudit reddarAudit = (ReddarAudit)o;
        final String id = this.id;
        final String id2 = reddarAudit.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String auditor_id = this.auditor_id;
            final String auditor_id2 = reddarAudit.auditor_id;
            if (auditor_id == auditor_id2 || (auditor_id != null && auditor_id.equals(auditor_id2))) {
                final List<String> ticket_ids = this.ticket_ids;
                final List<String> ticket_ids2 = reddarAudit.ticket_ids;
                if (ticket_ids == ticket_ids2 || (ticket_ids != null && ticket_ids.equals(ticket_ids2))) {
                    final List<String> included_queues = this.included_queues;
                    final List<String> included_queues2 = reddarAudit.included_queues;
                    if (included_queues == included_queues2 || (included_queues != null && included_queues.equals(included_queues2))) {
                        final List<String> included_agent_ids = this.included_agent_ids;
                        final List<String> included_agent_ids2 = reddarAudit.included_agent_ids;
                        if (included_agent_ids == included_agent_ids2 || (included_agent_ids != null && included_agent_ids.equals(included_agent_ids2))) {
                            final Long included_range_start_timestamp = this.included_range_start_timestamp;
                            final Long included_range_start_timestamp2 = reddarAudit.included_range_start_timestamp;
                            if (included_range_start_timestamp == included_range_start_timestamp2 || (included_range_start_timestamp != null && included_range_start_timestamp.equals(included_range_start_timestamp2))) {
                                final Long included_range_end_timestamp = this.included_range_end_timestamp;
                                final Long included_range_end_timestamp2 = reddarAudit.included_range_end_timestamp;
                                if (included_range_end_timestamp == included_range_end_timestamp2 || (included_range_end_timestamp != null && included_range_end_timestamp.equals(included_range_end_timestamp2))) {
                                    final Double percent_tickets_included = this.percent_tickets_included;
                                    final Double percent_tickets_included2 = reddarAudit.percent_tickets_included;
                                    if (percent_tickets_included == percent_tickets_included2 || (percent_tickets_included != null && percent_tickets_included.equals(percent_tickets_included2))) {
                                        final String assigned_to_id = this.assigned_to_id;
                                        final String assigned_to_id2 = reddarAudit.assigned_to_id;
                                        if (assigned_to_id == assigned_to_id2 || (assigned_to_id != null && assigned_to_id.equals(assigned_to_id2))) {
                                            final Boolean is_actioned = this.is_actioned;
                                            final Boolean is_actioned2 = reddarAudit.is_actioned;
                                            if (is_actioned == is_actioned2 || (is_actioned != null && is_actioned.equals(is_actioned2))) {
                                                final List<Integer> policy_violations = this.policy_violations;
                                                final List<Integer> policy_violations2 = reddarAudit.policy_violations;
                                                boolean b2 = b;
                                                if (policy_violations == policy_violations2) {
                                                    return b2;
                                                }
                                                if (policy_violations != null && policy_violations.equals(policy_violations2)) {
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
        final String auditor_id = this.auditor_id;
        int hashCode3;
        if (auditor_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = auditor_id.hashCode();
        }
        final List<String> ticket_ids = this.ticket_ids;
        int hashCode4;
        if (ticket_ids == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = ticket_ids.hashCode();
        }
        final List<String> included_queues = this.included_queues;
        int hashCode5;
        if (included_queues == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = included_queues.hashCode();
        }
        final List<String> included_agent_ids = this.included_agent_ids;
        int hashCode6;
        if (included_agent_ids == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = included_agent_ids.hashCode();
        }
        final Long included_range_start_timestamp = this.included_range_start_timestamp;
        int hashCode7;
        if (included_range_start_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = included_range_start_timestamp.hashCode();
        }
        final Long included_range_end_timestamp = this.included_range_end_timestamp;
        int hashCode8;
        if (included_range_end_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = included_range_end_timestamp.hashCode();
        }
        final Double percent_tickets_included = this.percent_tickets_included;
        int hashCode9;
        if (percent_tickets_included == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = percent_tickets_included.hashCode();
        }
        final String assigned_to_id = this.assigned_to_id;
        int hashCode10;
        if (assigned_to_id == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = assigned_to_id.hashCode();
        }
        final Boolean is_actioned = this.is_actioned;
        int hashCode11;
        if (is_actioned == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = is_actioned.hashCode();
        }
        final List<Integer> policy_violations = this.policy_violations;
        if (policy_violations != null) {
            hashCode = policy_violations.hashCode();
        }
        return (((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReddarAudit{id=");
        t.append(this.id);
        t.append(", auditor_id=");
        t.append(this.auditor_id);
        t.append(", ticket_ids=");
        t.append(this.ticket_ids);
        t.append(", included_queues=");
        t.append(this.included_queues);
        t.append(", included_agent_ids=");
        t.append(this.included_agent_ids);
        t.append(", included_range_start_timestamp=");
        t.append(this.included_range_start_timestamp);
        t.append(", included_range_end_timestamp=");
        t.append(this.included_range_end_timestamp);
        t.append(", percent_tickets_included=");
        t.append(this.percent_tickets_included);
        t.append(", assigned_to_id=");
        t.append(this.assigned_to_id);
        t.append(", is_actioned=");
        t.append(this.is_actioned);
        t.append(", policy_violations=");
        return a.s(t, (List)this.policy_violations, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarAudit.ADAPTER.write(e, (Object)this);
    }
}
