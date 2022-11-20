// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ReddarAuditTicket
{
    public static final a<ReddarAuditTicket, ReddarAuditTicket.ReddarAuditTicket$Builder> ADAPTER;
    public final String agent_id;
    public final String audit_id;
    public final String auditor_id;
    public final String id;
    public final String qa_content_action;
    public final String qa_message;
    public final String qa_policy;
    public final String qa_user_action;
    public final String ticket_id;
    
    static {
        ADAPTER = (a)new ReddarAuditTicket.ReddarAuditTicket$ReddarAuditTicketAdapter((ReddarAuditTicket$1)null);
    }
    
    private ReddarAuditTicket(final ReddarAuditTicket.ReddarAuditTicket$Builder reddarAuditTicket$Builder) {
        this.id = ReddarAuditTicket.ReddarAuditTicket$Builder.access$100(reddarAuditTicket$Builder);
        this.audit_id = ReddarAuditTicket.ReddarAuditTicket$Builder.access$200(reddarAuditTicket$Builder);
        this.auditor_id = ReddarAuditTicket.ReddarAuditTicket$Builder.access$300(reddarAuditTicket$Builder);
        this.ticket_id = ReddarAuditTicket.ReddarAuditTicket$Builder.access$400(reddarAuditTicket$Builder);
        this.agent_id = ReddarAuditTicket.ReddarAuditTicket$Builder.access$500(reddarAuditTicket$Builder);
        this.qa_user_action = ReddarAuditTicket.ReddarAuditTicket$Builder.access$600(reddarAuditTicket$Builder);
        this.qa_content_action = ReddarAuditTicket.ReddarAuditTicket$Builder.access$700(reddarAuditTicket$Builder);
        this.qa_policy = ReddarAuditTicket.ReddarAuditTicket$Builder.access$800(reddarAuditTicket$Builder);
        this.qa_message = ReddarAuditTicket.ReddarAuditTicket$Builder.access$900(reddarAuditTicket$Builder);
    }
    
    public ReddarAuditTicket(final ReddarAuditTicket.ReddarAuditTicket$Builder reddarAuditTicket$Builder, final ReddarAuditTicket$1 object) {
        this(reddarAuditTicket$Builder);
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
        if (!(o instanceof ReddarAuditTicket)) {
            return false;
        }
        final ReddarAuditTicket reddarAuditTicket = (ReddarAuditTicket)o;
        final String id = this.id;
        final String id2 = reddarAuditTicket.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String audit_id = this.audit_id;
            final String audit_id2 = reddarAuditTicket.audit_id;
            if (audit_id == audit_id2 || (audit_id != null && audit_id.equals(audit_id2))) {
                final String auditor_id = this.auditor_id;
                final String auditor_id2 = reddarAuditTicket.auditor_id;
                if (auditor_id == auditor_id2 || (auditor_id != null && auditor_id.equals(auditor_id2))) {
                    final String ticket_id = this.ticket_id;
                    final String ticket_id2 = reddarAuditTicket.ticket_id;
                    if (ticket_id == ticket_id2 || (ticket_id != null && ticket_id.equals(ticket_id2))) {
                        final String agent_id = this.agent_id;
                        final String agent_id2 = reddarAuditTicket.agent_id;
                        if (agent_id == agent_id2 || (agent_id != null && agent_id.equals(agent_id2))) {
                            final String qa_user_action = this.qa_user_action;
                            final String qa_user_action2 = reddarAuditTicket.qa_user_action;
                            if (qa_user_action == qa_user_action2 || (qa_user_action != null && qa_user_action.equals(qa_user_action2))) {
                                final String qa_content_action = this.qa_content_action;
                                final String qa_content_action2 = reddarAuditTicket.qa_content_action;
                                if (qa_content_action == qa_content_action2 || (qa_content_action != null && qa_content_action.equals(qa_content_action2))) {
                                    final String qa_policy = this.qa_policy;
                                    final String qa_policy2 = reddarAuditTicket.qa_policy;
                                    if (qa_policy == qa_policy2 || (qa_policy != null && qa_policy.equals(qa_policy2))) {
                                        final String qa_message = this.qa_message;
                                        final String qa_message2 = reddarAuditTicket.qa_message;
                                        boolean b2 = b;
                                        if (qa_message == qa_message2) {
                                            return b2;
                                        }
                                        if (qa_message != null && qa_message.equals(qa_message2)) {
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
        final String audit_id = this.audit_id;
        int hashCode3;
        if (audit_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = audit_id.hashCode();
        }
        final String auditor_id = this.auditor_id;
        int hashCode4;
        if (auditor_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = auditor_id.hashCode();
        }
        final String ticket_id = this.ticket_id;
        int hashCode5;
        if (ticket_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = ticket_id.hashCode();
        }
        final String agent_id = this.agent_id;
        int hashCode6;
        if (agent_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = agent_id.hashCode();
        }
        final String qa_user_action = this.qa_user_action;
        int hashCode7;
        if (qa_user_action == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = qa_user_action.hashCode();
        }
        final String qa_content_action = this.qa_content_action;
        int hashCode8;
        if (qa_content_action == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = qa_content_action.hashCode();
        }
        final String qa_policy = this.qa_policy;
        int hashCode9;
        if (qa_policy == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = qa_policy.hashCode();
        }
        final String qa_message = this.qa_message;
        if (qa_message != null) {
            hashCode = qa_message.hashCode();
        }
        return (((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReddarAuditTicket{id=");
        t.append(this.id);
        t.append(", audit_id=");
        t.append(this.audit_id);
        t.append(", auditor_id=");
        t.append(this.auditor_id);
        t.append(", ticket_id=");
        t.append(this.ticket_id);
        t.append(", agent_id=");
        t.append(this.agent_id);
        t.append(", qa_user_action=");
        t.append(this.qa_user_action);
        t.append(", qa_content_action=");
        t.append(this.qa_content_action);
        t.append(", qa_policy=");
        t.append(this.qa_policy);
        t.append(", qa_message=");
        return ph0.a.f(t, this.qa_message, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarAuditTicket.ADAPTER.write(e, (Object)this);
    }
}
