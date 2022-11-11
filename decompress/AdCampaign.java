// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdCampaign
{
    public static final a<AdCampaign, Builder> ADAPTER;
    public final String configured_status;
    public final String effective_status;
    public final String id;
    public final String name;
    public final String objective;
    
    static {
        ADAPTER = (a)new AdCampaignAdapter(null);
    }
    
    private AdCampaign(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
        this.objective = Builder.access$300(builder);
        this.configured_status = Builder.access$400(builder);
        this.effective_status = Builder.access$500(builder);
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
        if (!(o instanceof AdCampaign)) {
            return false;
        }
        final AdCampaign adCampaign = (AdCampaign)o;
        final String id = this.id;
        final String id2 = adCampaign.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = adCampaign.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final String objective = this.objective;
                final String objective2 = adCampaign.objective;
                if (objective == objective2 || (objective != null && objective.equals(objective2))) {
                    final String configured_status = this.configured_status;
                    final String configured_status2 = adCampaign.configured_status;
                    if (configured_status == configured_status2 || (configured_status != null && configured_status.equals(configured_status2))) {
                        final String effective_status = this.effective_status;
                        final String effective_status2 = adCampaign.effective_status;
                        boolean b2 = b;
                        if (effective_status == effective_status2) {
                            return b2;
                        }
                        if (effective_status != null && effective_status.equals(effective_status2)) {
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final String objective = this.objective;
        int hashCode4;
        if (objective == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = objective.hashCode();
        }
        final String configured_status = this.configured_status;
        int hashCode5;
        if (configured_status == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = configured_status.hashCode();
        }
        final String effective_status = this.effective_status;
        if (effective_status != null) {
            hashCode = effective_status.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdCampaign{id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", objective=");
        k.append(this.objective);
        k.append(", configured_status=");
        k.append(this.configured_status);
        k.append(", effective_status=");
        return b.j(k, this.effective_status, "}");
    }
    
    public void write(final e e) throws IOException {
        AdCampaign.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AdCampaignAdapter implements a<AdCampaign, Builder>
    {
        private AdCampaignAdapter() {
        }
        
        public AdCampaign read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AdCampaign read(final e e, final Builder builder) throws IOException {
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
                                    builder.effective_status(e.F());
                                }
                                else {
                                    mt.a.a(e, a);
                                }
                            }
                            else if (a == 11) {
                                builder.configured_status(e.F());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.objective(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.name(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final AdCampaign adCampaign) throws IOException {
            e.a0();
            if (adCampaign.id != null) {
                e.N(1, (byte)11);
                e.Z(adCampaign.id);
                e.O();
            }
            if (adCampaign.name != null) {
                e.N(2, (byte)11);
                e.Z(adCampaign.name);
                e.O();
            }
            if (adCampaign.objective != null) {
                e.N(3, (byte)11);
                e.Z(adCampaign.objective);
                e.O();
            }
            if (adCampaign.configured_status != null) {
                e.N(4, (byte)11);
                e.Z(adCampaign.configured_status);
                e.O();
            }
            if (adCampaign.effective_status != null) {
                e.N(5, (byte)11);
                e.Z(adCampaign.effective_status);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AdCampaign>
    {
        private String configured_status;
        private String effective_status;
        private String id;
        private String name;
        private String objective;
        
        public Builder() {
        }
        
        public Builder(final AdCampaign adCampaign) {
            this.id = adCampaign.id;
            this.name = adCampaign.name;
            this.objective = adCampaign.objective;
            this.configured_status = adCampaign.configured_status;
            this.effective_status = adCampaign.effective_status;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.objective;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.configured_status;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.effective_status;
        }
        
        public AdCampaign build() {
            return new AdCampaign(this, null);
        }
        
        public Builder configured_status(final String configured_status) {
            this.configured_status = configured_status;
            return this;
        }
        
        public Builder effective_status(final String effective_status) {
            this.effective_status = effective_status;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder objective(final String objective) {
            this.objective = objective;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
            this.objective = null;
            this.configured_status = null;
            this.effective_status = null;
        }
    }
}
