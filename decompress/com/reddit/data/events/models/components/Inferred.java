// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Inferred
{
    public static final a<Inferred, Builder> ADAPTER;
    public final String app_name;
    public final String client_ip;
    public final String isp_organization;
    public final Long json_byte_size;
    public final Long post_impression_id;
    public final Boolean user_agent_web_crawler;
    
    static {
        ADAPTER = (a)new InferredAdapter(null);
    }
    
    private Inferred(final Builder builder) {
        this.app_name = Builder.access$100(builder);
        this.client_ip = Builder.access$200(builder);
        this.user_agent_web_crawler = Builder.access$300(builder);
        this.post_impression_id = Builder.access$400(builder);
        this.json_byte_size = Builder.access$500(builder);
        this.isp_organization = Builder.access$600(builder);
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
        if (!(o instanceof Inferred)) {
            return false;
        }
        final Inferred inferred = (Inferred)o;
        final String app_name = this.app_name;
        final String app_name2 = inferred.app_name;
        if (app_name == app_name2 || (app_name != null && app_name.equals(app_name2))) {
            final String client_ip = this.client_ip;
            final String client_ip2 = inferred.client_ip;
            if (client_ip == client_ip2 || (client_ip != null && client_ip.equals(client_ip2))) {
                final Boolean user_agent_web_crawler = this.user_agent_web_crawler;
                final Boolean user_agent_web_crawler2 = inferred.user_agent_web_crawler;
                if (user_agent_web_crawler == user_agent_web_crawler2 || (user_agent_web_crawler != null && user_agent_web_crawler.equals(user_agent_web_crawler2))) {
                    final Long post_impression_id = this.post_impression_id;
                    final Long post_impression_id2 = inferred.post_impression_id;
                    if (post_impression_id == post_impression_id2 || (post_impression_id != null && post_impression_id.equals(post_impression_id2))) {
                        final Long json_byte_size = this.json_byte_size;
                        final Long json_byte_size2 = inferred.json_byte_size;
                        if (json_byte_size == json_byte_size2 || (json_byte_size != null && json_byte_size.equals(json_byte_size2))) {
                            final String isp_organization = this.isp_organization;
                            final String isp_organization2 = inferred.isp_organization;
                            boolean b2 = b;
                            if (isp_organization == isp_organization2) {
                                return b2;
                            }
                            if (isp_organization != null && isp_organization.equals(isp_organization2)) {
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
        final String app_name = this.app_name;
        int hashCode = 0;
        int hashCode2;
        if (app_name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = app_name.hashCode();
        }
        final String client_ip = this.client_ip;
        int hashCode3;
        if (client_ip == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = client_ip.hashCode();
        }
        final Boolean user_agent_web_crawler = this.user_agent_web_crawler;
        int hashCode4;
        if (user_agent_web_crawler == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = user_agent_web_crawler.hashCode();
        }
        final Long post_impression_id = this.post_impression_id;
        int hashCode5;
        if (post_impression_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = post_impression_id.hashCode();
        }
        final Long json_byte_size = this.json_byte_size;
        int hashCode6;
        if (json_byte_size == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = json_byte_size.hashCode();
        }
        final String isp_organization = this.isp_organization;
        if (isp_organization != null) {
            hashCode = isp_organization.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Inferred{app_name=");
        k.append(this.app_name);
        k.append(", client_ip=");
        k.append(this.client_ip);
        k.append(", user_agent_web_crawler=");
        k.append(this.user_agent_web_crawler);
        k.append(", post_impression_id=");
        k.append(this.post_impression_id);
        k.append(", json_byte_size=");
        k.append(this.json_byte_size);
        k.append(", isp_organization=");
        return b.j(k, this.isp_organization, "}");
    }
    
    public void write(final e e) throws IOException {
        Inferred.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Inferred>
    {
        private String app_name;
        private String client_ip;
        private String isp_organization;
        private Long json_byte_size;
        private Long post_impression_id;
        private Boolean user_agent_web_crawler;
        
        public Builder() {
        }
        
        public Builder(final Inferred inferred) {
            this.app_name = inferred.app_name;
            this.client_ip = inferred.client_ip;
            this.user_agent_web_crawler = inferred.user_agent_web_crawler;
            this.post_impression_id = inferred.post_impression_id;
            this.json_byte_size = inferred.json_byte_size;
            this.isp_organization = inferred.isp_organization;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.app_name;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.client_ip;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.user_agent_web_crawler;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.post_impression_id;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.json_byte_size;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.isp_organization;
        }
        
        public Builder app_name(final String app_name) {
            this.app_name = app_name;
            return this;
        }
        
        public Inferred build() {
            return new Inferred(this, null);
        }
        
        public Builder client_ip(final String client_ip) {
            this.client_ip = client_ip;
            return this;
        }
        
        public Builder isp_organization(final String isp_organization) {
            this.isp_organization = isp_organization;
            return this;
        }
        
        public Builder json_byte_size(final Long json_byte_size) {
            this.json_byte_size = json_byte_size;
            return this;
        }
        
        public Builder post_impression_id(final Long post_impression_id) {
            this.post_impression_id = post_impression_id;
            return this;
        }
        
        public void reset() {
            this.app_name = null;
            this.client_ip = null;
            this.user_agent_web_crawler = null;
            this.post_impression_id = null;
            this.json_byte_size = null;
            this.isp_organization = null;
        }
        
        public Builder user_agent_web_crawler(final Boolean user_agent_web_crawler) {
            this.user_agent_web_crawler = user_agent_web_crawler;
            return this;
        }
    }
    
    public static final class InferredAdapter implements a<Inferred, Builder>
    {
        private InferredAdapter() {
        }
        
        public Inferred read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Inferred read(final e e, final Builder builder) throws IOException {
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
                            builder.isp_organization(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.json_byte_size(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.post_impression_id(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.user_agent_web_crawler(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.client_ip(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.app_name(e.F());
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
        
        public void write(final e e, final Inferred inferred) throws IOException {
            e.a0();
            if (inferred.app_name != null) {
                e.N(1, (byte)11);
                e.Z(inferred.app_name);
                e.O();
            }
            if (inferred.client_ip != null) {
                e.N(2, (byte)11);
                e.Z(inferred.client_ip);
                e.O();
            }
            if (inferred.user_agent_web_crawler != null) {
                e.N(3, (byte)2);
                d.z(inferred.user_agent_web_crawler, e);
            }
            if (inferred.post_impression_id != null) {
                e.N(4, (byte)10);
                a.r(inferred.post_impression_id, e);
            }
            if (inferred.json_byte_size != null) {
                e.N(5, (byte)10);
                a.r(inferred.json_byte_size, e);
            }
            if (inferred.isp_organization != null) {
                e.N(6, (byte)11);
                e.Z(inferred.isp_organization);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
