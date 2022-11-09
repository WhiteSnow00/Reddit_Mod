// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class UrlParsed
{
    public static final a<UrlParsed, Builder> ADAPTER;
    public final String shared_hash;
    public final Long shared_timestamp;
    public final String utm_campaign;
    public final String utm_content;
    public final String utm_medium;
    public final String utm_name;
    public final String utm_source;
    public final String utm_term;
    
    static {
        ADAPTER = (a)new UrlParsedAdapter(null);
    }
    
    private UrlParsed(final Builder builder) {
        this.shared_timestamp = Builder.access$100(builder);
        this.utm_source = Builder.access$200(builder);
        this.utm_name = Builder.access$300(builder);
        this.shared_hash = Builder.access$400(builder);
        this.utm_campaign = Builder.access$500(builder);
        this.utm_content = Builder.access$600(builder);
        this.utm_medium = Builder.access$700(builder);
        this.utm_term = Builder.access$800(builder);
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
        if (!(o instanceof UrlParsed)) {
            return false;
        }
        final UrlParsed urlParsed = (UrlParsed)o;
        final Long shared_timestamp = this.shared_timestamp;
        final Long shared_timestamp2 = urlParsed.shared_timestamp;
        if (shared_timestamp == shared_timestamp2 || (shared_timestamp != null && shared_timestamp.equals(shared_timestamp2))) {
            final String utm_source = this.utm_source;
            final String utm_source2 = urlParsed.utm_source;
            if (utm_source == utm_source2 || (utm_source != null && utm_source.equals(utm_source2))) {
                final String utm_name = this.utm_name;
                final String utm_name2 = urlParsed.utm_name;
                if (utm_name == utm_name2 || (utm_name != null && utm_name.equals(utm_name2))) {
                    final String shared_hash = this.shared_hash;
                    final String shared_hash2 = urlParsed.shared_hash;
                    if (shared_hash == shared_hash2 || (shared_hash != null && shared_hash.equals(shared_hash2))) {
                        final String utm_campaign = this.utm_campaign;
                        final String utm_campaign2 = urlParsed.utm_campaign;
                        if (utm_campaign == utm_campaign2 || (utm_campaign != null && utm_campaign.equals(utm_campaign2))) {
                            final String utm_content = this.utm_content;
                            final String utm_content2 = urlParsed.utm_content;
                            if (utm_content == utm_content2 || (utm_content != null && utm_content.equals(utm_content2))) {
                                final String utm_medium = this.utm_medium;
                                final String utm_medium2 = urlParsed.utm_medium;
                                if (utm_medium == utm_medium2 || (utm_medium != null && utm_medium.equals(utm_medium2))) {
                                    final String utm_term = this.utm_term;
                                    final String utm_term2 = urlParsed.utm_term;
                                    boolean b2 = b;
                                    if (utm_term == utm_term2) {
                                        return b2;
                                    }
                                    if (utm_term != null && utm_term.equals(utm_term2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long shared_timestamp = this.shared_timestamp;
        int hashCode = 0;
        int hashCode2;
        if (shared_timestamp == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = shared_timestamp.hashCode();
        }
        final String utm_source = this.utm_source;
        int hashCode3;
        if (utm_source == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = utm_source.hashCode();
        }
        final String utm_name = this.utm_name;
        int hashCode4;
        if (utm_name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = utm_name.hashCode();
        }
        final String shared_hash = this.shared_hash;
        int hashCode5;
        if (shared_hash == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = shared_hash.hashCode();
        }
        final String utm_campaign = this.utm_campaign;
        int hashCode6;
        if (utm_campaign == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = utm_campaign.hashCode();
        }
        final String utm_content = this.utm_content;
        int hashCode7;
        if (utm_content == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = utm_content.hashCode();
        }
        final String utm_medium = this.utm_medium;
        int hashCode8;
        if (utm_medium == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = utm_medium.hashCode();
        }
        final String utm_term = this.utm_term;
        if (utm_term != null) {
            hashCode = utm_term.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UrlParsed{shared_timestamp=");
        k.append(this.shared_timestamp);
        k.append(", utm_source=");
        k.append(this.utm_source);
        k.append(", utm_name=");
        k.append(this.utm_name);
        k.append(", shared_hash=");
        k.append(this.shared_hash);
        k.append(", utm_campaign=");
        k.append(this.utm_campaign);
        k.append(", utm_content=");
        k.append(this.utm_content);
        k.append(", utm_medium=");
        k.append(this.utm_medium);
        k.append(", utm_term=");
        return b.j(k, this.utm_term, "}");
    }
    
    public void write(final e e) throws IOException {
        UrlParsed.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<UrlParsed>
    {
        private String shared_hash;
        private Long shared_timestamp;
        private String utm_campaign;
        private String utm_content;
        private String utm_medium;
        private String utm_name;
        private String utm_source;
        private String utm_term;
        
        public Builder() {
        }
        
        public Builder(final UrlParsed urlParsed) {
            this.shared_timestamp = urlParsed.shared_timestamp;
            this.utm_source = urlParsed.utm_source;
            this.utm_name = urlParsed.utm_name;
            this.shared_hash = urlParsed.shared_hash;
            this.utm_campaign = urlParsed.utm_campaign;
            this.utm_content = urlParsed.utm_content;
            this.utm_medium = urlParsed.utm_medium;
            this.utm_term = urlParsed.utm_term;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.shared_timestamp;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.utm_source;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.utm_name;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.shared_hash;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.utm_campaign;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.utm_content;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.utm_medium;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.utm_term;
        }
        
        public UrlParsed build() {
            return new UrlParsed(this, null);
        }
        
        public void reset() {
            this.shared_timestamp = null;
            this.utm_source = null;
            this.utm_name = null;
            this.shared_hash = null;
            this.utm_campaign = null;
            this.utm_content = null;
            this.utm_medium = null;
            this.utm_term = null;
        }
        
        public Builder shared_hash(final String shared_hash) {
            this.shared_hash = shared_hash;
            return this;
        }
        
        public Builder shared_timestamp(final Long shared_timestamp) {
            this.shared_timestamp = shared_timestamp;
            return this;
        }
        
        public Builder utm_campaign(final String utm_campaign) {
            this.utm_campaign = utm_campaign;
            return this;
        }
        
        public Builder utm_content(final String utm_content) {
            this.utm_content = utm_content;
            return this;
        }
        
        public Builder utm_medium(final String utm_medium) {
            this.utm_medium = utm_medium;
            return this;
        }
        
        public Builder utm_name(final String utm_name) {
            this.utm_name = utm_name;
            return this;
        }
        
        public Builder utm_source(final String utm_source) {
            this.utm_source = utm_source;
            return this;
        }
        
        public Builder utm_term(final String utm_term) {
            this.utm_term = utm_term;
            return this;
        }
    }
    
    public static final class UrlParsedAdapter implements a<UrlParsed, Builder>
    {
        private UrlParsedAdapter() {
        }
        
        public UrlParsed read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public UrlParsed read(final e e, final Builder builder) throws IOException {
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
                    case 8: {
                        if (a == 11) {
                            builder.utm_term(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.utm_medium(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.utm_content(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.utm_campaign(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.shared_hash(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.utm_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.utm_source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 10) {
                            builder.shared_timestamp(e.v());
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
        
        public void write(final e e, final UrlParsed urlParsed) throws IOException {
            e.a0();
            if (urlParsed.shared_timestamp != null) {
                e.N(1, (byte)10);
                a.r(urlParsed.shared_timestamp, e);
            }
            if (urlParsed.utm_source != null) {
                e.N(2, (byte)11);
                e.Z(urlParsed.utm_source);
                e.O();
            }
            if (urlParsed.utm_name != null) {
                e.N(3, (byte)11);
                e.Z(urlParsed.utm_name);
                e.O();
            }
            if (urlParsed.shared_hash != null) {
                e.N(4, (byte)11);
                e.Z(urlParsed.shared_hash);
                e.O();
            }
            if (urlParsed.utm_campaign != null) {
                e.N(5, (byte)11);
                e.Z(urlParsed.utm_campaign);
                e.O();
            }
            if (urlParsed.utm_content != null) {
                e.N(6, (byte)11);
                e.Z(urlParsed.utm_content);
                e.O();
            }
            if (urlParsed.utm_medium != null) {
                e.N(7, (byte)11);
                e.Z(urlParsed.utm_medium);
                e.O();
            }
            if (urlParsed.utm_term != null) {
                e.N(8, (byte)11);
                e.Z(urlParsed.utm_term);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
