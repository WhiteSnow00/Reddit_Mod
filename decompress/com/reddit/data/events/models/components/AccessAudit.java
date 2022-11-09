// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class AccessAudit
{
    public static final a<AccessAudit, Builder> ADAPTER;
    public final String access_type;
    public final List<String> fields;
    public final String on_behalf_of_user_id;
    public final String service_name;
    public final String target_user_id;
    
    static {
        ADAPTER = (a)new AccessAuditAdapter(null);
    }
    
    private AccessAudit(final Builder builder) {
        this.target_user_id = Builder.access$100(builder);
        List<String> unmodifiableList;
        if (Builder.access$200(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.fields = unmodifiableList;
        this.on_behalf_of_user_id = Builder.access$300(builder);
        this.service_name = Builder.access$400(builder);
        this.access_type = Builder.access$500(builder);
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
        final StringBuilder k = a.k("AccessAudit{target_user_id=");
        k.append(this.target_user_id);
        k.append(", fields=");
        k.append(this.fields);
        k.append(", on_behalf_of_user_id=");
        k.append(this.on_behalf_of_user_id);
        k.append(", service_name=");
        k.append(this.service_name);
        k.append(", access_type=");
        return b.j(k, this.access_type, "}");
    }
    
    public void write(final e e) throws IOException {
        AccessAudit.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AccessAuditAdapter implements a<AccessAudit, Builder>
    {
        private AccessAuditAdapter() {
        }
        
        public AccessAudit read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AccessAudit read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 5) {
                                    mt.a.a(e, a);
                                }
                                else if (a == 11) {
                                    builder.access_type(e.F());
                                }
                                else {
                                    mt.a.a(e, a);
                                }
                            }
                            else if (a == 11) {
                                builder.service_name(e.F());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.on_behalf_of_user_id(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 15) {
                        final c w = e.w();
                        final ArrayList list = new ArrayList(w.b);
                        for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                        e.x();
                        builder.fields((List<String>)list);
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.target_user_id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final AccessAudit accessAudit) throws IOException {
            e.a0();
            if (accessAudit.target_user_id != null) {
                e.N(1, (byte)11);
                e.Z(accessAudit.target_user_id);
                e.O();
            }
            if (accessAudit.fields != null) {
                e.N(2, (byte)15);
                e.V((byte)11, accessAudit.fields.size());
                final Iterator<String> iterator = accessAudit.fields.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (accessAudit.on_behalf_of_user_id != null) {
                e.N(3, (byte)11);
                e.Z(accessAudit.on_behalf_of_user_id);
                e.O();
            }
            if (accessAudit.service_name != null) {
                e.N(4, (byte)11);
                e.Z(accessAudit.service_name);
                e.O();
            }
            if (accessAudit.access_type != null) {
                e.N(5, (byte)11);
                e.Z(accessAudit.access_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AccessAudit>
    {
        private String access_type;
        private List<String> fields;
        private String on_behalf_of_user_id;
        private String service_name;
        private String target_user_id;
        
        public Builder() {
        }
        
        public Builder(final AccessAudit accessAudit) {
            this.target_user_id = accessAudit.target_user_id;
            this.fields = accessAudit.fields;
            this.on_behalf_of_user_id = accessAudit.on_behalf_of_user_id;
            this.service_name = accessAudit.service_name;
            this.access_type = accessAudit.access_type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.target_user_id;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.fields;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.on_behalf_of_user_id;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.service_name;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.access_type;
        }
        
        public Builder access_type(final String access_type) {
            this.access_type = access_type;
            return this;
        }
        
        public AccessAudit build() {
            return new AccessAudit(this, null);
        }
        
        public Builder fields(final List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        public Builder on_behalf_of_user_id(final String on_behalf_of_user_id) {
            this.on_behalf_of_user_id = on_behalf_of_user_id;
            return this;
        }
        
        public void reset() {
            this.target_user_id = null;
            this.fields = null;
            this.on_behalf_of_user_id = null;
            this.service_name = null;
            this.access_type = null;
        }
        
        public Builder service_name(final String service_name) {
            this.service_name = service_name;
            return this;
        }
        
        public Builder target_user_id(final String target_user_id) {
            this.target_user_id = target_user_id;
            return this;
        }
    }
}
