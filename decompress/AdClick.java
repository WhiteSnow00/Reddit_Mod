// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdClick
{
    public static final a<AdClick, Builder> ADAPTER;
    public final Integer landing_page_duration;
    public final String location;
    
    static {
        ADAPTER = (a)new AdClickAdapter(null);
    }
    
    private AdClick(final Builder builder) {
        this.landing_page_duration = Builder.access$100(builder);
        this.location = Builder.access$200(builder);
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
        if (!(o instanceof AdClick)) {
            return false;
        }
        final AdClick adClick = (AdClick)o;
        final Integer landing_page_duration = this.landing_page_duration;
        final Integer landing_page_duration2 = adClick.landing_page_duration;
        if (landing_page_duration == landing_page_duration2 || (landing_page_duration != null && landing_page_duration.equals(landing_page_duration2))) {
            final String location = this.location;
            final String location2 = adClick.location;
            boolean b2 = b;
            if (location == location2) {
                return b2;
            }
            if (location != null && location.equals(location2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer landing_page_duration = this.landing_page_duration;
        int hashCode = 0;
        int hashCode2;
        if (landing_page_duration == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = landing_page_duration.hashCode();
        }
        final String location = this.location;
        if (location != null) {
            hashCode = location.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdClick{landing_page_duration=");
        k.append(this.landing_page_duration);
        k.append(", location=");
        return b.j(k, this.location, "}");
    }
    
    public void write(final e e) throws IOException {
        AdClick.ADAPTER.write(e, (Object)this);
    }
    
    public static final class AdClickAdapter implements a<AdClick, Builder>
    {
        private AdClickAdapter() {
        }
        
        public AdClick read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public AdClick read(final e e, final Builder builder) throws IOException {
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
                        mt.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.location(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 8) {
                    builder.landing_page_duration(e.t());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final AdClick adClick) throws IOException {
            e.a0();
            if (adClick.landing_page_duration != null) {
                e.N(1, (byte)8);
                b.r(adClick.landing_page_duration, e);
            }
            if (adClick.location != null) {
                e.N(2, (byte)11);
                e.Z(adClick.location);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<AdClick>
    {
        private Integer landing_page_duration;
        private String location;
        
        public Builder() {
        }
        
        public Builder(final AdClick adClick) {
            this.landing_page_duration = adClick.landing_page_duration;
            this.location = adClick.location;
        }
        
        public static /* synthetic */ Integer access$100(final Builder builder) {
            return builder.landing_page_duration;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.location;
        }
        
        public AdClick build() {
            return new AdClick(this, null);
        }
        
        public Builder landing_page_duration(final Integer landing_page_duration) {
            this.landing_page_duration = landing_page_duration;
            return this;
        }
        
        public Builder location(final String location) {
            this.location = location;
            return this;
        }
        
        public void reset() {
            this.landing_page_duration = null;
            this.location = null;
        }
    }
}
