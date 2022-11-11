// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class BusinessInfo
{
    public static final a<BusinessInfo, BusinessInfo.BusinessInfo$Builder> ADAPTER;
    public final String country;
    public final String industry;
    public final String name;
    public final String subvertical;
    
    static {
        ADAPTER = (a)new BusinessInfo.BusinessInfo$BusinessInfoAdapter((BusinessInfo$1)null);
    }
    
    private BusinessInfo(final BusinessInfo.BusinessInfo$Builder businessInfo$Builder) {
        this.name = BusinessInfo.BusinessInfo$Builder.access$100(businessInfo$Builder);
        this.industry = BusinessInfo.BusinessInfo$Builder.access$200(businessInfo$Builder);
        this.subvertical = BusinessInfo.BusinessInfo$Builder.access$300(businessInfo$Builder);
        this.country = BusinessInfo.BusinessInfo$Builder.access$400(businessInfo$Builder);
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
        if (!(o instanceof BusinessInfo)) {
            return false;
        }
        final BusinessInfo businessInfo = (BusinessInfo)o;
        final String name = this.name;
        final String name2 = businessInfo.name;
        if (name == name2 || (name != null && name.equals(name2))) {
            final String industry = this.industry;
            final String industry2 = businessInfo.industry;
            if (industry == industry2 || (industry != null && industry.equals(industry2))) {
                final String subvertical = this.subvertical;
                final String subvertical2 = businessInfo.subvertical;
                if (subvertical == subvertical2 || (subvertical != null && subvertical.equals(subvertical2))) {
                    final String country = this.country;
                    final String country2 = businessInfo.country;
                    boolean b2 = b;
                    if (country == country2) {
                        return b2;
                    }
                    if (country != null && country.equals(country2)) {
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
        final String name = this.name;
        int hashCode = 0;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        final String industry = this.industry;
        int hashCode3;
        if (industry == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = industry.hashCode();
        }
        final String subvertical = this.subvertical;
        int hashCode4;
        if (subvertical == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subvertical.hashCode();
        }
        final String country = this.country;
        if (country != null) {
            hashCode = country.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BusinessInfo{name=");
        k.append(this.name);
        k.append(", industry=");
        k.append(this.industry);
        k.append(", subvertical=");
        k.append(this.subvertical);
        k.append(", country=");
        return b.j(k, this.country, "}");
    }
    
    public void write(final e e) throws IOException {
        BusinessInfo.ADAPTER.write(e, (Object)this);
    }
}
