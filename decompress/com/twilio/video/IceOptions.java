// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.HashSet;
import java.util.Set;

public class IceOptions
{
    private final Set<IceServer> iceServers;
    private final IceTransportPolicy iceTransportPolicy;
    
    private IceOptions(final Builder builder) {
        this.iceServers = Builder.a(builder);
        this.iceTransportPolicy = Builder.b(builder);
    }
    
    public IceOptions(final Builder builder, final int n) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final IceOptions iceOptions = (IceOptions)o;
            if (!this.iceServers.equals(iceOptions.iceServers) || this.iceTransportPolicy != iceOptions.iceTransportPolicy) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public Set<IceServer> getIceServers() {
        return this.iceServers;
    }
    
    public IceServer[] getIceServersArray() {
        final IceServer[] array = new IceServer[0];
        final Set<IceServer> iceServers = this.iceServers;
        IceServer[] array2 = array;
        if (iceServers != null) {
            array2 = array;
            if (iceServers.size() > 0) {
                final Set<IceServer> iceServers2 = this.iceServers;
                array2 = iceServers2.toArray(new IceServer[iceServers2.size()]);
            }
        }
        return array2;
    }
    
    public IceTransportPolicy getIceTransportPolicy() {
        return this.iceTransportPolicy;
    }
    
    @Override
    public int hashCode() {
        final Set<IceServer> iceServers = this.iceServers;
        int hashCode = 0;
        int hashCode2;
        if (iceServers != null) {
            hashCode2 = iceServers.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final IceTransportPolicy iceTransportPolicy = this.iceTransportPolicy;
        if (iceTransportPolicy != null) {
            hashCode = iceTransportPolicy.hashCode();
        }
        return (hashCode2 + 31) * 31 + hashCode;
    }
    
    public static class Builder
    {
        private Set<IceServer> iceServers;
        private IceTransportPolicy iceTransportPolicy;
        
        public Builder() {
            this.iceServers = new HashSet<IceServer>();
            this.iceTransportPolicy = IceTransportPolicy.ALL;
        }
        
        public static /* bridge */ Set a(final Builder builder) {
            return builder.iceServers;
        }
        
        public static /* bridge */ IceTransportPolicy b(final Builder builder) {
            return builder.iceTransportPolicy;
        }
        
        public IceOptions build() {
            return new IceOptions(this, 0);
        }
        
        public Builder iceServers(final Set<IceServer> iceServers) {
            this.iceServers = iceServers;
            return this;
        }
        
        public Builder iceTransportPolicy(final IceTransportPolicy iceTransportPolicy) {
            this.iceTransportPolicy = iceTransportPolicy;
            return this;
        }
    }
}
