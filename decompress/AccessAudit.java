// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class AccessAudit
{
    public static final a<AccessAudit, AccessAudit.AccessAudit$Builder> ADAPTER;
    public final String access_type;
    public final List<String> fields;
    public final String on_behalf_of_user_id;
    public final String service_name;
    public final String target_user_id;
    
    static {
        ADAPTER = (a)new AccessAudit.AccessAudit$AccessAuditAdapter((AccessAudit$1)null);
    }
    
    private AccessAudit(final AccessAudit.AccessAudit$Builder accessAudit$Builder) {
        this.target_user_id = AccessAudit.AccessAudit$Builder.access$100(accessAudit$Builder);
        List<String> unmodifiableList;
        if (AccessAudit.AccessAudit$Builder.access$200(accessAudit$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)AccessAudit.AccessAudit$Builder.access$200(accessAudit$Builder));
        }
        this.fields = unmodifiableList;
        this.on_behalf_of_user_id = AccessAudit.AccessAudit$Builder.access$300(accessAudit$Builder);
        this.service_name = AccessAudit.AccessAudit$Builder.access$400(accessAudit$Builder);
        this.access_type = AccessAudit.AccessAudit$Builder.access$500(accessAudit$Builder);
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
        if (!(o instanceof AccessAudit)) {
            return false;
        }
        final AccessAudit accessAudit = (AccessAudit)o;
        final String target_user_id = this.target_user_id;
        final String target_user_id2 = accessAudit.target_user_id;
        if (target_user_id == target_user_id2 || (target_user_id != null && target_user_id.equals(target_user_id2))) {
            final List<String> fields = this.fields;
            final List<String> fields2 = accessAudit.fields;
            if (fields == fields2 || (fields != null && fields.equals(fields2))) {
                final String on_behalf_of_user_id = this.on_behalf_of_user_id;
                final String on_behalf_of_user_id2 = accessAudit.on_behalf_of_user_id;
                if (on_behalf_of_user_id == on_behalf_of_user_id2 || (on_behalf_of_user_id != null && on_behalf_of_user_id.equals(on_behalf_of_user_id2))) {
                    final String service_name = this.service_name;
                    final String service_name2 = accessAudit.service_name;
                    if (service_name == service_name2 || (service_name != null && service_name.equals(service_name2))) {
                        final String access_type = this.access_type;
                        final String access_type2 = accessAudit.access_type;
                        boolean b2 = b;
                        if (access_type == access_type2) {
                            return b2;
                        }
                        if (access_type != null && access_type.equals(access_type2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String target_user_id = this.target_user_id;
        int hashCode = 0;
        int hashCode2;
        if (target_user_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = target_user_id.hashCode();
        }
        final List<String> fields = this.fields;
        int hashCode3;
        if (fields == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = fields.hashCode();
        }
        final String on_behalf_of_user_id = this.on_behalf_of_user_id;
        int hashCode4;
        if (on_behalf_of_user_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = on_behalf_of_user_id.hashCode();
        }
        final String service_name = this.service_name;
        int hashCode5;
        if (service_name == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = service_name.hashCode();
        }
        final String access_type = this.access_type;
        if (access_type != null) {
            hashCode = access_type.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("AccessAudit{target_user_id=");
        r.append(this.target_user_id);
        r.append(", fields=");
        r.append(this.fields);
        r.append(", on_behalf_of_user_id=");
        r.append(this.on_behalf_of_user_id);
        r.append(", service_name=");
        r.append(this.service_name);
        r.append(", access_type=");
        return a.o(r, this.access_type, "}");
    }
    
    public void write(final e e) throws IOException {
        AccessAudit.ADAPTER.write(e, (Object)this);
    }
}
