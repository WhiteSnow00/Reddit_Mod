// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdminAction
{
    public static final a<AdminAction, AdminAction.AdminAction$Builder> ADAPTER;
    public final String context;
    public final String correlation_id;
    public final String notes;
    public final Integer number_password_dump_credentials;
    public final String password_dump_id;
    public final String process_notes;
    public final String reason;
    public final Boolean removal_is_restorable;
    public final String removal_job_id;
    public final String removal_type;
    public final String restoration_job_id;
    public final String service_name;
    public final String source;
    public final String takedown_id;
    public final Integer target_team_id;
    public final String template_type;
    public final Integer timeout_duration;
    public final String user_id;
    
    static {
        ADAPTER = (a)new AdminAction.AdminAction$AdminActionAdapter((AdminAction$1)null);
    }
    
    private AdminAction(final AdminAction.AdminAction$Builder adminAction$Builder) {
        this.password_dump_id = AdminAction.AdminAction$Builder.access$100(adminAction$Builder);
        this.number_password_dump_credentials = AdminAction.AdminAction$Builder.access$200(adminAction$Builder);
        this.takedown_id = AdminAction.AdminAction$Builder.access$300(adminAction$Builder);
        this.removal_type = AdminAction.AdminAction$Builder.access$400(adminAction$Builder);
        this.removal_is_restorable = AdminAction.AdminAction$Builder.access$500(adminAction$Builder);
        this.notes = AdminAction.AdminAction$Builder.access$600(adminAction$Builder);
        this.process_notes = AdminAction.AdminAction$Builder.access$700(adminAction$Builder);
        this.timeout_duration = AdminAction.AdminAction$Builder.access$800(adminAction$Builder);
        this.template_type = AdminAction.AdminAction$Builder.access$900(adminAction$Builder);
        this.target_team_id = AdminAction.AdminAction$Builder.access$1000(adminAction$Builder);
        this.removal_job_id = AdminAction.AdminAction$Builder.access$1100(adminAction$Builder);
        this.restoration_job_id = AdminAction.AdminAction$Builder.access$1200(adminAction$Builder);
        this.context = AdminAction.AdminAction$Builder.access$1300(adminAction$Builder);
        this.reason = AdminAction.AdminAction$Builder.access$1400(adminAction$Builder);
        this.source = AdminAction.AdminAction$Builder.access$1500(adminAction$Builder);
        this.correlation_id = AdminAction.AdminAction$Builder.access$1600(adminAction$Builder);
        this.user_id = AdminAction.AdminAction$Builder.access$1700(adminAction$Builder);
        this.service_name = AdminAction.AdminAction$Builder.access$1800(adminAction$Builder);
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
        if (!(o instanceof AdminAction)) {
            return false;
        }
        final AdminAction adminAction = (AdminAction)o;
        final String password_dump_id = this.password_dump_id;
        final String password_dump_id2 = adminAction.password_dump_id;
        if (password_dump_id == password_dump_id2 || (password_dump_id != null && password_dump_id.equals(password_dump_id2))) {
            final Integer number_password_dump_credentials = this.number_password_dump_credentials;
            final Integer number_password_dump_credentials2 = adminAction.number_password_dump_credentials;
            if (number_password_dump_credentials == number_password_dump_credentials2 || (number_password_dump_credentials != null && number_password_dump_credentials.equals(number_password_dump_credentials2))) {
                final String takedown_id = this.takedown_id;
                final String takedown_id2 = adminAction.takedown_id;
                if (takedown_id == takedown_id2 || (takedown_id != null && takedown_id.equals(takedown_id2))) {
                    final String removal_type = this.removal_type;
                    final String removal_type2 = adminAction.removal_type;
                    if (removal_type == removal_type2 || (removal_type != null && removal_type.equals(removal_type2))) {
                        final Boolean removal_is_restorable = this.removal_is_restorable;
                        final Boolean removal_is_restorable2 = adminAction.removal_is_restorable;
                        if (removal_is_restorable == removal_is_restorable2 || (removal_is_restorable != null && removal_is_restorable.equals(removal_is_restorable2))) {
                            final String notes = this.notes;
                            final String notes2 = adminAction.notes;
                            if (notes == notes2 || (notes != null && notes.equals(notes2))) {
                                final String process_notes = this.process_notes;
                                final String process_notes2 = adminAction.process_notes;
                                if (process_notes == process_notes2 || (process_notes != null && process_notes.equals(process_notes2))) {
                                    final Integer timeout_duration = this.timeout_duration;
                                    final Integer timeout_duration2 = adminAction.timeout_duration;
                                    if (timeout_duration == timeout_duration2 || (timeout_duration != null && timeout_duration.equals(timeout_duration2))) {
                                        final String template_type = this.template_type;
                                        final String template_type2 = adminAction.template_type;
                                        if (template_type == template_type2 || (template_type != null && template_type.equals(template_type2))) {
                                            final Integer target_team_id = this.target_team_id;
                                            final Integer target_team_id2 = adminAction.target_team_id;
                                            if (target_team_id == target_team_id2 || (target_team_id != null && target_team_id.equals(target_team_id2))) {
                                                final String removal_job_id = this.removal_job_id;
                                                final String removal_job_id2 = adminAction.removal_job_id;
                                                if (removal_job_id == removal_job_id2 || (removal_job_id != null && removal_job_id.equals(removal_job_id2))) {
                                                    final String restoration_job_id = this.restoration_job_id;
                                                    final String restoration_job_id2 = adminAction.restoration_job_id;
                                                    if (restoration_job_id == restoration_job_id2 || (restoration_job_id != null && restoration_job_id.equals(restoration_job_id2))) {
                                                        final String context = this.context;
                                                        final String context2 = adminAction.context;
                                                        if (context == context2 || (context != null && context.equals(context2))) {
                                                            final String reason = this.reason;
                                                            final String reason2 = adminAction.reason;
                                                            if (reason == reason2 || (reason != null && reason.equals(reason2))) {
                                                                final String source = this.source;
                                                                final String source2 = adminAction.source;
                                                                if (source == source2 || (source != null && source.equals(source2))) {
                                                                    final String correlation_id = this.correlation_id;
                                                                    final String correlation_id2 = adminAction.correlation_id;
                                                                    if (correlation_id == correlation_id2 || (correlation_id != null && correlation_id.equals(correlation_id2))) {
                                                                        final String user_id = this.user_id;
                                                                        final String user_id2 = adminAction.user_id;
                                                                        if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
                                                                            final String service_name = this.service_name;
                                                                            final String service_name2 = adminAction.service_name;
                                                                            boolean b2 = b;
                                                                            if (service_name == service_name2) {
                                                                                return b2;
                                                                            }
                                                                            if (service_name != null && service_name.equals(service_name2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String password_dump_id = this.password_dump_id;
        int hashCode = 0;
        int hashCode2;
        if (password_dump_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = password_dump_id.hashCode();
        }
        final Integer number_password_dump_credentials = this.number_password_dump_credentials;
        int hashCode3;
        if (number_password_dump_credentials == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = number_password_dump_credentials.hashCode();
        }
        final String takedown_id = this.takedown_id;
        int hashCode4;
        if (takedown_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = takedown_id.hashCode();
        }
        final String removal_type = this.removal_type;
        int hashCode5;
        if (removal_type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = removal_type.hashCode();
        }
        final Boolean removal_is_restorable = this.removal_is_restorable;
        int hashCode6;
        if (removal_is_restorable == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = removal_is_restorable.hashCode();
        }
        final String notes = this.notes;
        int hashCode7;
        if (notes == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = notes.hashCode();
        }
        final String process_notes = this.process_notes;
        int hashCode8;
        if (process_notes == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = process_notes.hashCode();
        }
        final Integer timeout_duration = this.timeout_duration;
        int hashCode9;
        if (timeout_duration == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = timeout_duration.hashCode();
        }
        final String template_type = this.template_type;
        int hashCode10;
        if (template_type == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = template_type.hashCode();
        }
        final Integer target_team_id = this.target_team_id;
        int hashCode11;
        if (target_team_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = target_team_id.hashCode();
        }
        final String removal_job_id = this.removal_job_id;
        int hashCode12;
        if (removal_job_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = removal_job_id.hashCode();
        }
        final String restoration_job_id = this.restoration_job_id;
        int hashCode13;
        if (restoration_job_id == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = restoration_job_id.hashCode();
        }
        final String context = this.context;
        int hashCode14;
        if (context == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = context.hashCode();
        }
        final String reason = this.reason;
        int hashCode15;
        if (reason == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = reason.hashCode();
        }
        final String source = this.source;
        int hashCode16;
        if (source == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = source.hashCode();
        }
        final String correlation_id = this.correlation_id;
        int hashCode17;
        if (correlation_id == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = correlation_id.hashCode();
        }
        final String user_id = this.user_id;
        int hashCode18;
        if (user_id == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = user_id.hashCode();
        }
        final String service_name = this.service_name;
        if (service_name != null) {
            hashCode = service_name.hashCode();
        }
        return ((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdminAction{password_dump_id=");
        k.append(this.password_dump_id);
        k.append(", number_password_dump_credentials=");
        k.append(this.number_password_dump_credentials);
        k.append(", takedown_id=");
        k.append(this.takedown_id);
        k.append(", removal_type=");
        k.append(this.removal_type);
        k.append(", removal_is_restorable=");
        k.append(this.removal_is_restorable);
        k.append(", notes=");
        k.append(this.notes);
        k.append(", process_notes=");
        k.append(this.process_notes);
        k.append(", timeout_duration=");
        k.append(this.timeout_duration);
        k.append(", template_type=");
        k.append(this.template_type);
        k.append(", target_team_id=");
        k.append(this.target_team_id);
        k.append(", removal_job_id=");
        k.append(this.removal_job_id);
        k.append(", restoration_job_id=");
        k.append(this.restoration_job_id);
        k.append(", context=");
        k.append(this.context);
        k.append(", reason=");
        k.append(this.reason);
        k.append(", source=");
        k.append(this.source);
        k.append(", correlation_id=");
        k.append(this.correlation_id);
        k.append(", user_id=");
        k.append(this.user_id);
        k.append(", service_name=");
        return b.j(k, this.service_name, "}");
    }
    
    public void write(final e e) throws IOException {
        AdminAction.ADAPTER.write(e, (Object)this);
    }
}
