// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class AclCheck
{
    public static final a<AclCheck, AclCheck.AclCheck$Builder> ADAPTER;
    public final String action;
    public final String object;
    public final Boolean result;
    public final String source_client_type;
    public final String subject_id;
    public final String subject_type;
    
    static {
        ADAPTER = (a)new AclCheck.AclCheck$AclCheckAdapter((AclCheck$1)null);
    }
    
    private AclCheck(final AclCheck.AclCheck$Builder aclCheck$Builder) {
        this.subject_type = AclCheck.AclCheck$Builder.access$100(aclCheck$Builder);
        this.subject_id = AclCheck.AclCheck$Builder.access$200(aclCheck$Builder);
        this.action = AclCheck.AclCheck$Builder.access$300(aclCheck$Builder);
        this.object = AclCheck.AclCheck$Builder.access$400(aclCheck$Builder);
        this.result = AclCheck.AclCheck$Builder.access$500(aclCheck$Builder);
        this.source_client_type = AclCheck.AclCheck$Builder.access$600(aclCheck$Builder);
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
        if (!(o instanceof AclCheck)) {
            return false;
        }
        final AclCheck aclCheck = (AclCheck)o;
        final String subject_type = this.subject_type;
        final String subject_type2 = aclCheck.subject_type;
        if (subject_type == subject_type2 || (subject_type != null && subject_type.equals(subject_type2))) {
            final String subject_id = this.subject_id;
            final String subject_id2 = aclCheck.subject_id;
            if (subject_id == subject_id2 || (subject_id != null && subject_id.equals(subject_id2))) {
                final String action = this.action;
                final String action2 = aclCheck.action;
                if (action == action2 || (action != null && action.equals(action2))) {
                    final String object = this.object;
                    final String object2 = aclCheck.object;
                    if (object == object2 || (object != null && object.equals(object2))) {
                        final Boolean result = this.result;
                        final Boolean result2 = aclCheck.result;
                        if (result == result2 || (result != null && result.equals(result2))) {
                            final String source_client_type = this.source_client_type;
                            final String source_client_type2 = aclCheck.source_client_type;
                            boolean b2 = b;
                            if (source_client_type == source_client_type2) {
                                return b2;
                            }
                            if (source_client_type != null && source_client_type.equals(source_client_type2)) {
                                b2 = b;
                                return b2;
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
        final String subject_type = this.subject_type;
        int hashCode = 0;
        int hashCode2;
        if (subject_type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subject_type.hashCode();
        }
        final String subject_id = this.subject_id;
        int hashCode3;
        if (subject_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subject_id.hashCode();
        }
        final String action = this.action;
        int hashCode4;
        if (action == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = action.hashCode();
        }
        final String object = this.object;
        int hashCode5;
        if (object == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = object.hashCode();
        }
        final Boolean result = this.result;
        int hashCode6;
        if (result == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = result.hashCode();
        }
        final String source_client_type = this.source_client_type;
        if (source_client_type != null) {
            hashCode = source_client_type.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("AclCheck{subject_type=");
        r.append(this.subject_type);
        r.append(", subject_id=");
        r.append(this.subject_id);
        r.append(", action=");
        r.append(this.action);
        r.append(", object=");
        r.append(this.object);
        r.append(", result=");
        r.append(this.result);
        r.append(", source_client_type=");
        return a.o(r, this.source_client_type, "}");
    }
    
    public void write(final e e) throws IOException {
        AclCheck.ADAPTER.write(e, (Object)this);
    }
}
