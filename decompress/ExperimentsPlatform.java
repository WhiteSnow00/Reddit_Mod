// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class ExperimentsPlatform
{
    public static final a<ExperimentsPlatform, Builder> ADAPTER;
    public final Long config_id;
    public final String config_type;
    public final Long config_version;
    public final Boolean http_success;
    public final String masked_employee_email;
    public final String page;
    
    static {
        ADAPTER = (a)new ExperimentsPlatformAdapter(null);
    }
    
    private ExperimentsPlatform(final Builder builder) {
        this.masked_employee_email = Builder.access$100(builder);
        this.page = Builder.access$200(builder);
        this.config_id = Builder.access$300(builder);
        this.config_version = Builder.access$400(builder);
        this.config_type = Builder.access$500(builder);
        this.http_success = Builder.access$600(builder);
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
        if (!(o instanceof ExperimentsPlatform)) {
            return false;
        }
        final ExperimentsPlatform experimentsPlatform = (ExperimentsPlatform)o;
        final String masked_employee_email = this.masked_employee_email;
        final String masked_employee_email2 = experimentsPlatform.masked_employee_email;
        if (masked_employee_email == masked_employee_email2 || masked_employee_email.equals(masked_employee_email2)) {
            final String page = this.page;
            final String page2 = experimentsPlatform.page;
            if (page == page2 || (page != null && page.equals(page2))) {
                final Long config_id = this.config_id;
                final Long config_id2 = experimentsPlatform.config_id;
                if (config_id == config_id2 || (config_id != null && config_id.equals(config_id2))) {
                    final Long config_version = this.config_version;
                    final Long config_version2 = experimentsPlatform.config_version;
                    if (config_version == config_version2 || (config_version != null && config_version.equals(config_version2))) {
                        final String config_type = this.config_type;
                        final String config_type2 = experimentsPlatform.config_type;
                        if (config_type == config_type2 || (config_type != null && config_type.equals(config_type2))) {
                            final Boolean http_success = this.http_success;
                            final Boolean http_success2 = experimentsPlatform.http_success;
                            boolean b2 = b;
                            if (http_success == http_success2) {
                                return b2;
                            }
                            if (http_success != null && http_success.equals(http_success2)) {
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
        final int hashCode = this.masked_employee_email.hashCode();
        final String page = this.page;
        int hashCode2 = 0;
        int hashCode3;
        if (page == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = page.hashCode();
        }
        final Long config_id = this.config_id;
        int hashCode4;
        if (config_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = config_id.hashCode();
        }
        final Long config_version = this.config_version;
        int hashCode5;
        if (config_version == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = config_version.hashCode();
        }
        final String config_type = this.config_type;
        int hashCode6;
        if (config_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = config_type.hashCode();
        }
        final Boolean http_success = this.http_success;
        if (http_success != null) {
            hashCode2 = http_success.hashCode();
        }
        return ((((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ExperimentsPlatform{masked_employee_email=");
        k.append(this.masked_employee_email);
        k.append(", page=");
        k.append(this.page);
        k.append(", config_id=");
        k.append(this.config_id);
        k.append(", config_version=");
        k.append(this.config_version);
        k.append(", config_type=");
        k.append(this.config_type);
        k.append(", http_success=");
        k.append(this.http_success);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        ExperimentsPlatform.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ExperimentsPlatform>
    {
        private Long config_id;
        private String config_type;
        private Long config_version;
        private Boolean http_success;
        private String masked_employee_email;
        private String page;
        
        public Builder() {
        }
        
        public Builder(final ExperimentsPlatform experimentsPlatform) {
            this.masked_employee_email = experimentsPlatform.masked_employee_email;
            this.page = experimentsPlatform.page;
            this.config_id = experimentsPlatform.config_id;
            this.config_version = experimentsPlatform.config_version;
            this.config_type = experimentsPlatform.config_type;
            this.http_success = experimentsPlatform.http_success;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.masked_employee_email;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.page;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.config_id;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.config_version;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.config_type;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.http_success;
        }
        
        public ExperimentsPlatform build() {
            if (this.masked_employee_email != null) {
                return new ExperimentsPlatform(this, null);
            }
            throw new IllegalStateException("Required field 'masked_employee_email' is missing");
        }
        
        public Builder config_id(final Long config_id) {
            this.config_id = config_id;
            return this;
        }
        
        public Builder config_type(final String config_type) {
            this.config_type = config_type;
            return this;
        }
        
        public Builder config_version(final Long config_version) {
            this.config_version = config_version;
            return this;
        }
        
        public Builder http_success(final Boolean http_success) {
            this.http_success = http_success;
            return this;
        }
        
        public Builder masked_employee_email(final String masked_employee_email) {
            if (masked_employee_email != null) {
                this.masked_employee_email = masked_employee_email;
                return this;
            }
            throw new NullPointerException("Required field 'masked_employee_email' cannot be null");
        }
        
        public Builder page(final String page) {
            this.page = page;
            return this;
        }
        
        public void reset() {
            this.masked_employee_email = null;
            this.page = null;
            this.config_id = null;
            this.config_version = null;
            this.config_type = null;
            this.http_success = null;
        }
    }
    
    public static final class ExperimentsPlatformAdapter implements a<ExperimentsPlatform, Builder>
    {
        private ExperimentsPlatformAdapter() {
        }
        
        public ExperimentsPlatform read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ExperimentsPlatform read(final e e, final Builder builder) throws IOException {
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
                        if (a == 2) {
                            builder.http_success(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.config_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.config_version(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.config_id(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.page(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.masked_employee_email(e.F());
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
        
        public void write(final e e, final ExperimentsPlatform experimentsPlatform) throws IOException {
            e.a0();
            e.N(1, (byte)11);
            e.Z(experimentsPlatform.masked_employee_email);
            e.O();
            if (experimentsPlatform.page != null) {
                e.N(2, (byte)11);
                e.Z(experimentsPlatform.page);
                e.O();
            }
            if (experimentsPlatform.config_id != null) {
                e.N(3, (byte)10);
                a.r(experimentsPlatform.config_id, e);
            }
            if (experimentsPlatform.config_version != null) {
                e.N(4, (byte)10);
                a.r(experimentsPlatform.config_version, e);
            }
            if (experimentsPlatform.config_type != null) {
                e.N(5, (byte)11);
                e.Z(experimentsPlatform.config_type);
                e.O();
            }
            if (experimentsPlatform.http_success != null) {
                e.N(6, (byte)2);
                d.z(experimentsPlatform.http_success, e);
            }
            e.P();
            e.b0();
        }
    }
}
