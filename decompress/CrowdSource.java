// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class CrowdSource
{
    public static final a<CrowdSource, CrowdSource.CrowdSource$Builder> ADAPTER;
    public final String geo_city;
    public final String geo_country;
    public final String geo_region;
    public final String old_geo_city;
    public final String old_geo_country;
    public final String old_geo_region;
    public final String old_place_id;
    public final String place_id;
    
    static {
        ADAPTER = (a)new CrowdSource.CrowdSource$CrowdSourceAdapter((CrowdSource$1)null);
    }
    
    private CrowdSource(final CrowdSource.CrowdSource$Builder crowdSource$Builder) {
        this.place_id = CrowdSource.CrowdSource$Builder.access$100(crowdSource$Builder);
        this.geo_country = CrowdSource.CrowdSource$Builder.access$200(crowdSource$Builder);
        this.geo_region = CrowdSource.CrowdSource$Builder.access$300(crowdSource$Builder);
        this.geo_city = CrowdSource.CrowdSource$Builder.access$400(crowdSource$Builder);
        this.old_place_id = CrowdSource.CrowdSource$Builder.access$500(crowdSource$Builder);
        this.old_geo_country = CrowdSource.CrowdSource$Builder.access$600(crowdSource$Builder);
        this.old_geo_region = CrowdSource.CrowdSource$Builder.access$700(crowdSource$Builder);
        this.old_geo_city = CrowdSource.CrowdSource$Builder.access$800(crowdSource$Builder);
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
        if (!(o instanceof CrowdSource)) {
            return false;
        }
        final CrowdSource crowdSource = (CrowdSource)o;
        final String place_id = this.place_id;
        final String place_id2 = crowdSource.place_id;
        if (place_id == place_id2 || (place_id != null && place_id.equals(place_id2))) {
            final String geo_country = this.geo_country;
            final String geo_country2 = crowdSource.geo_country;
            if (geo_country == geo_country2 || (geo_country != null && geo_country.equals(geo_country2))) {
                final String geo_region = this.geo_region;
                final String geo_region2 = crowdSource.geo_region;
                if (geo_region == geo_region2 || (geo_region != null && geo_region.equals(geo_region2))) {
                    final String geo_city = this.geo_city;
                    final String geo_city2 = crowdSource.geo_city;
                    if (geo_city == geo_city2 || (geo_city != null && geo_city.equals(geo_city2))) {
                        final String old_place_id = this.old_place_id;
                        final String old_place_id2 = crowdSource.old_place_id;
                        if (old_place_id == old_place_id2 || (old_place_id != null && old_place_id.equals(old_place_id2))) {
                            final String old_geo_country = this.old_geo_country;
                            final String old_geo_country2 = crowdSource.old_geo_country;
                            if (old_geo_country == old_geo_country2 || (old_geo_country != null && old_geo_country.equals(old_geo_country2))) {
                                final String old_geo_region = this.old_geo_region;
                                final String old_geo_region2 = crowdSource.old_geo_region;
                                if (old_geo_region == old_geo_region2 || (old_geo_region != null && old_geo_region.equals(old_geo_region2))) {
                                    final String old_geo_city = this.old_geo_city;
                                    final String old_geo_city2 = crowdSource.old_geo_city;
                                    boolean b2 = b;
                                    if (old_geo_city == old_geo_city2) {
                                        return b2;
                                    }
                                    if (old_geo_city != null && old_geo_city.equals(old_geo_city2)) {
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
        final String place_id = this.place_id;
        int hashCode = 0;
        int hashCode2;
        if (place_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = place_id.hashCode();
        }
        final String geo_country = this.geo_country;
        int hashCode3;
        if (geo_country == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = geo_country.hashCode();
        }
        final String geo_region = this.geo_region;
        int hashCode4;
        if (geo_region == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = geo_region.hashCode();
        }
        final String geo_city = this.geo_city;
        int hashCode5;
        if (geo_city == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = geo_city.hashCode();
        }
        final String old_place_id = this.old_place_id;
        int hashCode6;
        if (old_place_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = old_place_id.hashCode();
        }
        final String old_geo_country = this.old_geo_country;
        int hashCode7;
        if (old_geo_country == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = old_geo_country.hashCode();
        }
        final String old_geo_region = this.old_geo_region;
        int hashCode8;
        if (old_geo_region == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = old_geo_region.hashCode();
        }
        final String old_geo_city = this.old_geo_city;
        if (old_geo_city != null) {
            hashCode = old_geo_city.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CrowdSource{place_id=");
        k.append(this.place_id);
        k.append(", geo_country=");
        k.append(this.geo_country);
        k.append(", geo_region=");
        k.append(this.geo_region);
        k.append(", geo_city=");
        k.append(this.geo_city);
        k.append(", old_place_id=");
        k.append(this.old_place_id);
        k.append(", old_geo_country=");
        k.append(this.old_geo_country);
        k.append(", old_geo_region=");
        k.append(this.old_geo_region);
        k.append(", old_geo_city=");
        return b.j(k, this.old_geo_city, "}");
    }
    
    public void write(final e e) throws IOException {
        CrowdSource.ADAPTER.write(e, (Object)this);
    }
}
