// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import kt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class AdBrandSafety
{
    public static final a<AdBrandSafety, Builder> ADAPTER;
    public final String tier;
    public final Boolean tier_reason_rall;
    public final Boolean tier_reason_sort;
    public final Boolean tier_reason_whitelist;
    
    static {
        ADAPTER = (a)new AdBrandSafetyAdapter(null);
    }
    
    private AdBrandSafety(final Builder builder) {
        this.tier = Builder.access$100(builder);
        this.tier_reason_rall = Builder.access$200(builder);
        this.tier_reason_sort = Builder.access$300(builder);
        this.tier_reason_whitelist = Builder.access$400(builder);
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
        if (!(o instanceof AdBrandSafety)) {
            return false;
        }
        final AdBrandSafety adBrandSafety = (AdBrandSafety)o;
        final String tier = this.tier;
        final String tier2 = adBrandSafety.tier;
        if (tier == tier2 || (tier != null && tier.equals(tier2))) {
            final Boolean tier_reason_rall = this.tier_reason_rall;
            final Boolean tier_reason_rall2 = adBrandSafety.tier_reason_rall;
            if (tier_reason_rall == tier_reason_rall2 || (tier_reason_rall != null && tier_reason_rall.equals(tier_reason_rall2))) {
                final Boolean tier_reason_sort = this.tier_reason_sort;
                final Boolean tier_reason_sort2 = adBrandSafety.tier_reason_sort;
                if (tier_reason_sort == tier_reason_sort2 || (tier_reason_sort != null && tier_reason_sort.equals(tier_reason_sort2))) {
                    final Boolean tier_reason_whitelist = this.tier_reason_whitelist;
                    final Boolean tier_reason_whitelist2 = adBrandSafety.tier_reason_whitelist;
                    boolean b2 = b;
                    if (tier_reason_whitelist == tier_reason_whitelist2) {
                        return b2;
                    }
                    if (tier_reason_whitelist != null && tier_reason_whitelist.equals(tier_reason_whitelist2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String tier = this.tier;
        int hashCode = 0;
        int hashCode2;
        if (tier == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = tier.hashCode();
        }
        final Boolean tier_reason_rall = this.tier_reason_rall;
        int hashCode3;
        if (tier_reason_rall == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = tier_reason_rall.hashCode();
        }
        final Boolean tier_reason_sort = this.tier_reason_sort;
        int hashCode4;
        if (tier_reason_sort == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = tier_reason_sort.hashCode();
        }
        final Boolean tier_reason_whitelist = this.tier_reason_whitelist;
        if (tier_reason_whitelist != null) {
            hashCode = tier_reason_whitelist.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdBrandSafety{tier=");
        k.append(this.tier);
        k.append(", tier_reason_rall=");
        k.append(this.tier_reason_rall);
        k.append(", tier_reason_sort=");
        k.append(this.tier_reason_sort);
        k.append(", tier_reason_whitelist=");
        k.append(this.tier_reason_whitelist);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AdBrandSafety.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AdBrandSafetyAdapter implements a<AdBrandSafety, Builder>
    {
        private AdBrandSafetyAdapter() {
        }
        
        public AdBrandSafety read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AdBrandSafety read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                mt.a.a(e, a);
                            }
                            else if (a == 2) {
                                builder.tier_reason_whitelist(e.b());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 2) {
                            builder.tier_reason_sort(e.b());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 2) {
                        builder.tier_reason_rall(e.b());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.tier(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final AdBrandSafety adBrandSafety) throws IOException {
            e.a0();
            if (adBrandSafety.tier != null) {
                e.N(1, (byte)11);
                e.Z(adBrandSafety.tier);
                e.O();
            }
            if (adBrandSafety.tier_reason_rall != null) {
                e.N(2, (byte)2);
                d.z(adBrandSafety.tier_reason_rall, e);
            }
            if (adBrandSafety.tier_reason_sort != null) {
                e.N(3, (byte)2);
                d.z(adBrandSafety.tier_reason_sort, e);
            }
            if (adBrandSafety.tier_reason_whitelist != null) {
                e.N(4, (byte)2);
                d.z(adBrandSafety.tier_reason_whitelist, e);
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AdBrandSafety>
    {
        private String tier;
        private Boolean tier_reason_rall;
        private Boolean tier_reason_sort;
        private Boolean tier_reason_whitelist;
        
        public Builder() {
        }
        
        public Builder(final AdBrandSafety adBrandSafety) {
            this.tier = adBrandSafety.tier;
            this.tier_reason_rall = adBrandSafety.tier_reason_rall;
            this.tier_reason_sort = adBrandSafety.tier_reason_sort;
            this.tier_reason_whitelist = adBrandSafety.tier_reason_whitelist;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.tier;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.tier_reason_rall;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.tier_reason_sort;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.tier_reason_whitelist;
        }
        
        public AdBrandSafety build() {
            return new AdBrandSafety(this, null);
        }
        
        public void reset() {
            this.tier = null;
            this.tier_reason_rall = null;
            this.tier_reason_sort = null;
            this.tier_reason_whitelist = null;
        }
        
        public Builder tier(final String tier) {
            this.tier = tier;
            return this;
        }
        
        public Builder tier_reason_rall(final Boolean tier_reason_rall) {
            this.tier_reason_rall = tier_reason_rall;
            return this;
        }
        
        public Builder tier_reason_sort(final Boolean tier_reason_sort) {
            this.tier_reason_sort = tier_reason_sort;
            return this;
        }
        
        public Builder tier_reason_whitelist(final Boolean tier_reason_whitelist) {
            this.tier_reason_whitelist = tier_reason_whitelist;
            return this;
        }
    }
}
