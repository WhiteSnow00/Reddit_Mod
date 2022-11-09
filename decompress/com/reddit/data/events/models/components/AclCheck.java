// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AclCheck
{
    public static final a<AclCheck, Builder> ADAPTER;
    public final String action;
    public final String object;
    public final Boolean result;
    public final String source_client_type;
    public final String subject_id;
    public final String subject_type;
    
    static {
        ADAPTER = (a)new AclCheckAdapter(null);
    }
    
    private AclCheck(final Builder builder) {
        this.subject_type = Builder.access$100(builder);
        this.subject_id = Builder.access$200(builder);
        this.action = Builder.access$300(builder);
        this.object = Builder.access$400(builder);
        this.result = Builder.access$500(builder);
        this.source_client_type = Builder.access$600(builder);
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
        final StringBuilder k = a.k("AclCheck{subject_type=");
        k.append(this.subject_type);
        k.append(", subject_id=");
        k.append(this.subject_id);
        k.append(", action=");
        k.append(this.action);
        k.append(", object=");
        k.append(this.object);
        k.append(", result=");
        k.append(this.result);
        k.append(", source_client_type=");
        return b.j(k, this.source_client_type, "}");
    }
    
    public void write(final e e) throws IOException {
        AclCheck.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AclCheckAdapter implements a<AclCheck, Builder>
    {
        private AclCheckAdapter() {
        }
        
        public AclCheck read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AclCheck read(final e e, final Builder builder) throws IOException {
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
                    case 6: {
                        if (a == 11) {
                            builder.source_client_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.result(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.object(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.action(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.subject_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.subject_type(e.F());
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
        
        public void write(final e e, final AclCheck aclCheck) throws IOException {
            e.a0();
            if (aclCheck.subject_type != null) {
                e.N(1, (byte)11);
                e.Z(aclCheck.subject_type);
                e.O();
            }
            if (aclCheck.subject_id != null) {
                e.N(2, (byte)11);
                e.Z(aclCheck.subject_id);
                e.O();
            }
            if (aclCheck.action != null) {
                e.N(3, (byte)11);
                e.Z(aclCheck.action);
                e.O();
            }
            if (aclCheck.object != null) {
                e.N(4, (byte)11);
                e.Z(aclCheck.object);
                e.O();
            }
            if (aclCheck.result != null) {
                e.N(5, (byte)2);
                d.z(aclCheck.result, e);
            }
            if (aclCheck.source_client_type != null) {
                e.N(6, (byte)11);
                e.Z(aclCheck.source_client_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AclCheck>
    {
        private String action;
        private String object;
        private Boolean result;
        private String source_client_type;
        private String subject_id;
        private String subject_type;
        
        public Builder() {
        }
        
        public Builder(final AclCheck aclCheck) {
            this.subject_type = aclCheck.subject_type;
            this.subject_id = aclCheck.subject_id;
            this.action = aclCheck.action;
            this.object = aclCheck.object;
            this.result = aclCheck.result;
            this.source_client_type = aclCheck.source_client_type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.subject_type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.subject_id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.action;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.object;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.result;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.source_client_type;
        }
        
        public Builder action(final String action) {
            this.action = action;
            return this;
        }
        
        public AclCheck build() {
            return new AclCheck(this, null);
        }
        
        public Builder object(final String object) {
            this.object = object;
            return this;
        }
        
        public void reset() {
            this.subject_type = null;
            this.subject_id = null;
            this.action = null;
            this.object = null;
            this.result = null;
            this.source_client_type = null;
        }
        
        public Builder result(final Boolean result) {
            this.result = result;
            return this;
        }
        
        public Builder source_client_type(final String source_client_type) {
            this.source_client_type = source_client_type;
            return this;
        }
        
        public Builder subject_id(final String subject_id) {
            this.subject_id = subject_id;
            return this;
        }
        
        public Builder subject_type(final String subject_type) {
            this.subject_type = subject_type;
            return this;
        }
    }
}
