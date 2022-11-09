// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class Geo
{
    public static final a<Geo, Builder> ADAPTER;
    public final Boolean anonymous;
    public final Boolean anonymous_vpn;
    public final String city;
    public final String country_code;
    public final Boolean hosting_provider;
    public final Long metro_code;
    public final Boolean public_proxy;
    public final String region;
    public final String time_zone;
    public final Boolean tor_exit_node;
    
    static {
        ADAPTER = (a)new GeoAdapter(null);
    }
    
    private Geo(final Builder builder) {
        this.country_code = Builder.access$100(builder);
        this.region = Builder.access$200(builder);
        this.city = Builder.access$300(builder);
        this.time_zone = Builder.access$400(builder);
        this.anonymous = Builder.access$500(builder);
        this.anonymous_vpn = Builder.access$600(builder);
        this.hosting_provider = Builder.access$700(builder);
        this.public_proxy = Builder.access$800(builder);
        this.tor_exit_node = Builder.access$900(builder);
        this.metro_code = Builder.access$1000(builder);
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
        if (!(o instanceof Geo)) {
            return false;
        }
        final Geo geo = (Geo)o;
        final String country_code = this.country_code;
        final String country_code2 = geo.country_code;
        if (country_code == country_code2 || (country_code != null && country_code.equals(country_code2))) {
            final String region = this.region;
            final String region2 = geo.region;
            if (region == region2 || (region != null && region.equals(region2))) {
                final String city = this.city;
                final String city2 = geo.city;
                if (city == city2 || (city != null && city.equals(city2))) {
                    final String time_zone = this.time_zone;
                    final String time_zone2 = geo.time_zone;
                    if (time_zone == time_zone2 || (time_zone != null && time_zone.equals(time_zone2))) {
                        final Boolean anonymous = this.anonymous;
                        final Boolean anonymous2 = geo.anonymous;
                        if (anonymous == anonymous2 || (anonymous != null && anonymous.equals(anonymous2))) {
                            final Boolean anonymous_vpn = this.anonymous_vpn;
                            final Boolean anonymous_vpn2 = geo.anonymous_vpn;
                            if (anonymous_vpn == anonymous_vpn2 || (anonymous_vpn != null && anonymous_vpn.equals(anonymous_vpn2))) {
                                final Boolean hosting_provider = this.hosting_provider;
                                final Boolean hosting_provider2 = geo.hosting_provider;
                                if (hosting_provider == hosting_provider2 || (hosting_provider != null && hosting_provider.equals(hosting_provider2))) {
                                    final Boolean public_proxy = this.public_proxy;
                                    final Boolean public_proxy2 = geo.public_proxy;
                                    if (public_proxy == public_proxy2 || (public_proxy != null && public_proxy.equals(public_proxy2))) {
                                        final Boolean tor_exit_node = this.tor_exit_node;
                                        final Boolean tor_exit_node2 = geo.tor_exit_node;
                                        if (tor_exit_node == tor_exit_node2 || (tor_exit_node != null && tor_exit_node.equals(tor_exit_node2))) {
                                            final Long metro_code = this.metro_code;
                                            final Long metro_code2 = geo.metro_code;
                                            boolean b2 = b;
                                            if (metro_code == metro_code2) {
                                                return b2;
                                            }
                                            if (metro_code != null && metro_code.equals(metro_code2)) {
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
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String country_code = this.country_code;
        int hashCode = 0;
        int hashCode2;
        if (country_code == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = country_code.hashCode();
        }
        final String region = this.region;
        int hashCode3;
        if (region == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = region.hashCode();
        }
        final String city = this.city;
        int hashCode4;
        if (city == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = city.hashCode();
        }
        final String time_zone = this.time_zone;
        int hashCode5;
        if (time_zone == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = time_zone.hashCode();
        }
        final Boolean anonymous = this.anonymous;
        int hashCode6;
        if (anonymous == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = anonymous.hashCode();
        }
        final Boolean anonymous_vpn = this.anonymous_vpn;
        int hashCode7;
        if (anonymous_vpn == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = anonymous_vpn.hashCode();
        }
        final Boolean hosting_provider = this.hosting_provider;
        int hashCode8;
        if (hosting_provider == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = hosting_provider.hashCode();
        }
        final Boolean public_proxy = this.public_proxy;
        int hashCode9;
        if (public_proxy == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = public_proxy.hashCode();
        }
        final Boolean tor_exit_node = this.tor_exit_node;
        int hashCode10;
        if (tor_exit_node == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = tor_exit_node.hashCode();
        }
        final Long metro_code = this.metro_code;
        if (metro_code != null) {
            hashCode = metro_code.hashCode();
        }
        return ((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Geo{country_code=");
        k.append(this.country_code);
        k.append(", region=");
        k.append(this.region);
        k.append(", city=");
        k.append(this.city);
        k.append(", time_zone=");
        k.append(this.time_zone);
        k.append(", anonymous=");
        k.append(this.anonymous);
        k.append(", anonymous_vpn=");
        k.append(this.anonymous_vpn);
        k.append(", hosting_provider=");
        k.append(this.hosting_provider);
        k.append(", public_proxy=");
        k.append(this.public_proxy);
        k.append(", tor_exit_node=");
        k.append(this.tor_exit_node);
        k.append(", metro_code=");
        return a.h(k, this.metro_code, "}");
    }
    
    public void write(final e e) throws IOException {
        Geo.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Geo>
    {
        private Boolean anonymous;
        private Boolean anonymous_vpn;
        private String city;
        private String country_code;
        private Boolean hosting_provider;
        private Long metro_code;
        private Boolean public_proxy;
        private String region;
        private String time_zone;
        private Boolean tor_exit_node;
        
        public Builder() {
        }
        
        public Builder(final Geo geo) {
            this.country_code = geo.country_code;
            this.region = geo.region;
            this.city = geo.city;
            this.time_zone = geo.time_zone;
            this.anonymous = geo.anonymous;
            this.anonymous_vpn = geo.anonymous_vpn;
            this.hosting_provider = geo.hosting_provider;
            this.public_proxy = geo.public_proxy;
            this.tor_exit_node = geo.tor_exit_node;
            this.metro_code = geo.metro_code;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.country_code;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.metro_code;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.region;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.city;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.time_zone;
        }
        
        public static /* synthetic */ Boolean access$500(final Builder builder) {
            return builder.anonymous;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.anonymous_vpn;
        }
        
        public static /* synthetic */ Boolean access$700(final Builder builder) {
            return builder.hosting_provider;
        }
        
        public static /* synthetic */ Boolean access$800(final Builder builder) {
            return builder.public_proxy;
        }
        
        public static /* synthetic */ Boolean access$900(final Builder builder) {
            return builder.tor_exit_node;
        }
        
        public Builder anonymous(final Boolean anonymous) {
            this.anonymous = anonymous;
            return this;
        }
        
        public Builder anonymous_vpn(final Boolean anonymous_vpn) {
            this.anonymous_vpn = anonymous_vpn;
            return this;
        }
        
        public Geo build() {
            return new Geo(this, null);
        }
        
        public Builder city(final String city) {
            this.city = city;
            return this;
        }
        
        public Builder country_code(final String country_code) {
            this.country_code = country_code;
            return this;
        }
        
        public Builder hosting_provider(final Boolean hosting_provider) {
            this.hosting_provider = hosting_provider;
            return this;
        }
        
        public Builder metro_code(final Long metro_code) {
            this.metro_code = metro_code;
            return this;
        }
        
        public Builder public_proxy(final Boolean public_proxy) {
            this.public_proxy = public_proxy;
            return this;
        }
        
        public Builder region(final String region) {
            this.region = region;
            return this;
        }
        
        public void reset() {
            this.country_code = null;
            this.region = null;
            this.city = null;
            this.time_zone = null;
            this.anonymous = null;
            this.anonymous_vpn = null;
            this.hosting_provider = null;
            this.public_proxy = null;
            this.tor_exit_node = null;
            this.metro_code = null;
        }
        
        public Builder time_zone(final String time_zone) {
            this.time_zone = time_zone;
            return this;
        }
        
        public Builder tor_exit_node(final Boolean tor_exit_node) {
            this.tor_exit_node = tor_exit_node;
            return this;
        }
    }
    
    public static final class GeoAdapter implements a<Geo, Builder>
    {
        private GeoAdapter() {
        }
        
        public Geo read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Geo read(final e e, final Builder builder) throws IOException {
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
                    case 10: {
                        if (a == 10) {
                            builder.metro_code(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.tor_exit_node(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 2) {
                            builder.public_proxy(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 2) {
                            builder.hosting_provider(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.anonymous_vpn(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 2) {
                            builder.anonymous(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.time_zone(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.city(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.region(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.country_code(e.F());
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
        
        public void write(final e e, final Geo geo) throws IOException {
            e.a0();
            if (geo.country_code != null) {
                e.N(1, (byte)11);
                e.Z(geo.country_code);
                e.O();
            }
            if (geo.region != null) {
                e.N(2, (byte)11);
                e.Z(geo.region);
                e.O();
            }
            if (geo.city != null) {
                e.N(3, (byte)11);
                e.Z(geo.city);
                e.O();
            }
            if (geo.time_zone != null) {
                e.N(4, (byte)11);
                e.Z(geo.time_zone);
                e.O();
            }
            if (geo.anonymous != null) {
                e.N(5, (byte)2);
                d.z(geo.anonymous, e);
            }
            if (geo.anonymous_vpn != null) {
                e.N(6, (byte)2);
                d.z(geo.anonymous_vpn, e);
            }
            if (geo.hosting_provider != null) {
                e.N(7, (byte)2);
                d.z(geo.hosting_provider, e);
            }
            if (geo.public_proxy != null) {
                e.N(8, (byte)2);
                d.z(geo.public_proxy, e);
            }
            if (geo.tor_exit_node != null) {
                e.N(9, (byte)2);
                d.z(geo.tor_exit_node, e);
            }
            if (geo.metro_code != null) {
                e.N(10, (byte)10);
                a.r(geo.metro_code, e);
            }
            e.P();
            e.b0();
        }
    }
}
