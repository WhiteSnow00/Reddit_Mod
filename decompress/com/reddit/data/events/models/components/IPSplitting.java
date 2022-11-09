// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class IPSplitting
{
    public static final a<IPSplitting, Builder> ADAPTER;
    public final String inferred_client_ip_interface;
    public final Boolean inferred_client_ip_is_ipv6;
    public final String inferred_client_ip_network;
    public final String request_client_ip_interface;
    public final Boolean request_client_ip_is_ipv6;
    public final String request_client_ip_network;
    
    static {
        ADAPTER = (a)new IPSplittingAdapter(null);
    }
    
    private IPSplitting(final Builder builder) {
        this.request_client_ip_is_ipv6 = Builder.access$100(builder);
        this.request_client_ip_network = Builder.access$200(builder);
        this.request_client_ip_interface = Builder.access$300(builder);
        this.inferred_client_ip_is_ipv6 = Builder.access$400(builder);
        this.inferred_client_ip_network = Builder.access$500(builder);
        this.inferred_client_ip_interface = Builder.access$600(builder);
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
        if (!(o instanceof IPSplitting)) {
            return false;
        }
        final IPSplitting ipSplitting = (IPSplitting)o;
        final Boolean request_client_ip_is_ipv6 = this.request_client_ip_is_ipv6;
        final Boolean request_client_ip_is_ipv7 = ipSplitting.request_client_ip_is_ipv6;
        if (request_client_ip_is_ipv6 == request_client_ip_is_ipv7 || (request_client_ip_is_ipv6 != null && request_client_ip_is_ipv6.equals(request_client_ip_is_ipv7))) {
            final String request_client_ip_network = this.request_client_ip_network;
            final String request_client_ip_network2 = ipSplitting.request_client_ip_network;
            if (request_client_ip_network == request_client_ip_network2 || (request_client_ip_network != null && request_client_ip_network.equals(request_client_ip_network2))) {
                final String request_client_ip_interface = this.request_client_ip_interface;
                final String request_client_ip_interface2 = ipSplitting.request_client_ip_interface;
                if (request_client_ip_interface == request_client_ip_interface2 || (request_client_ip_interface != null && request_client_ip_interface.equals(request_client_ip_interface2))) {
                    final Boolean inferred_client_ip_is_ipv6 = this.inferred_client_ip_is_ipv6;
                    final Boolean inferred_client_ip_is_ipv7 = ipSplitting.inferred_client_ip_is_ipv6;
                    if (inferred_client_ip_is_ipv6 == inferred_client_ip_is_ipv7 || (inferred_client_ip_is_ipv6 != null && inferred_client_ip_is_ipv6.equals(inferred_client_ip_is_ipv7))) {
                        final String inferred_client_ip_network = this.inferred_client_ip_network;
                        final String inferred_client_ip_network2 = ipSplitting.inferred_client_ip_network;
                        if (inferred_client_ip_network == inferred_client_ip_network2 || (inferred_client_ip_network != null && inferred_client_ip_network.equals(inferred_client_ip_network2))) {
                            final String inferred_client_ip_interface = this.inferred_client_ip_interface;
                            final String inferred_client_ip_interface2 = ipSplitting.inferred_client_ip_interface;
                            boolean b2 = b;
                            if (inferred_client_ip_interface == inferred_client_ip_interface2) {
                                return b2;
                            }
                            if (inferred_client_ip_interface != null && inferred_client_ip_interface.equals(inferred_client_ip_interface2)) {
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
        final Boolean request_client_ip_is_ipv6 = this.request_client_ip_is_ipv6;
        int hashCode = 0;
        int hashCode2;
        if (request_client_ip_is_ipv6 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = request_client_ip_is_ipv6.hashCode();
        }
        final String request_client_ip_network = this.request_client_ip_network;
        int hashCode3;
        if (request_client_ip_network == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = request_client_ip_network.hashCode();
        }
        final String request_client_ip_interface = this.request_client_ip_interface;
        int hashCode4;
        if (request_client_ip_interface == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = request_client_ip_interface.hashCode();
        }
        final Boolean inferred_client_ip_is_ipv6 = this.inferred_client_ip_is_ipv6;
        int hashCode5;
        if (inferred_client_ip_is_ipv6 == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = inferred_client_ip_is_ipv6.hashCode();
        }
        final String inferred_client_ip_network = this.inferred_client_ip_network;
        int hashCode6;
        if (inferred_client_ip_network == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = inferred_client_ip_network.hashCode();
        }
        final String inferred_client_ip_interface = this.inferred_client_ip_interface;
        if (inferred_client_ip_interface != null) {
            hashCode = inferred_client_ip_interface.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("IPSplitting{request_client_ip_is_ipv6=");
        k.append(this.request_client_ip_is_ipv6);
        k.append(", request_client_ip_network=");
        k.append(this.request_client_ip_network);
        k.append(", request_client_ip_interface=");
        k.append(this.request_client_ip_interface);
        k.append(", inferred_client_ip_is_ipv6=");
        k.append(this.inferred_client_ip_is_ipv6);
        k.append(", inferred_client_ip_network=");
        k.append(this.inferred_client_ip_network);
        k.append(", inferred_client_ip_interface=");
        return b.j(k, this.inferred_client_ip_interface, "}");
    }
    
    public void write(final e e) throws IOException {
        IPSplitting.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<IPSplitting>
    {
        private String inferred_client_ip_interface;
        private Boolean inferred_client_ip_is_ipv6;
        private String inferred_client_ip_network;
        private String request_client_ip_interface;
        private Boolean request_client_ip_is_ipv6;
        private String request_client_ip_network;
        
        public Builder() {
        }
        
        public Builder(final IPSplitting ipSplitting) {
            this.request_client_ip_is_ipv6 = ipSplitting.request_client_ip_is_ipv6;
            this.request_client_ip_network = ipSplitting.request_client_ip_network;
            this.request_client_ip_interface = ipSplitting.request_client_ip_interface;
            this.inferred_client_ip_is_ipv6 = ipSplitting.inferred_client_ip_is_ipv6;
            this.inferred_client_ip_network = ipSplitting.inferred_client_ip_network;
            this.inferred_client_ip_interface = ipSplitting.inferred_client_ip_interface;
        }
        
        public static /* synthetic */ Boolean access$100(final Builder builder) {
            return builder.request_client_ip_is_ipv6;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.request_client_ip_network;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.request_client_ip_interface;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.inferred_client_ip_is_ipv6;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.inferred_client_ip_network;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.inferred_client_ip_interface;
        }
        
        public IPSplitting build() {
            return new IPSplitting(this, null);
        }
        
        public Builder inferred_client_ip_interface(final String inferred_client_ip_interface) {
            this.inferred_client_ip_interface = inferred_client_ip_interface;
            return this;
        }
        
        public Builder inferred_client_ip_is_ipv6(final Boolean inferred_client_ip_is_ipv6) {
            this.inferred_client_ip_is_ipv6 = inferred_client_ip_is_ipv6;
            return this;
        }
        
        public Builder inferred_client_ip_network(final String inferred_client_ip_network) {
            this.inferred_client_ip_network = inferred_client_ip_network;
            return this;
        }
        
        public Builder request_client_ip_interface(final String request_client_ip_interface) {
            this.request_client_ip_interface = request_client_ip_interface;
            return this;
        }
        
        public Builder request_client_ip_is_ipv6(final Boolean request_client_ip_is_ipv6) {
            this.request_client_ip_is_ipv6 = request_client_ip_is_ipv6;
            return this;
        }
        
        public Builder request_client_ip_network(final String request_client_ip_network) {
            this.request_client_ip_network = request_client_ip_network;
            return this;
        }
        
        public void reset() {
            this.request_client_ip_is_ipv6 = null;
            this.request_client_ip_network = null;
            this.request_client_ip_interface = null;
            this.inferred_client_ip_is_ipv6 = null;
            this.inferred_client_ip_network = null;
            this.inferred_client_ip_interface = null;
        }
    }
    
    public static final class IPSplittingAdapter implements a<IPSplitting, Builder>
    {
        private IPSplittingAdapter() {
        }
        
        public IPSplitting read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public IPSplitting read(final e e, final Builder builder) throws IOException {
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
                            builder.inferred_client_ip_interface(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.inferred_client_ip_network(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.inferred_client_ip_is_ipv6(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.request_client_ip_interface(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.request_client_ip_network(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 2) {
                            builder.request_client_ip_is_ipv6(e.b());
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
        
        public void write(final e e, final IPSplitting ipSplitting) throws IOException {
            e.a0();
            if (ipSplitting.request_client_ip_is_ipv6 != null) {
                e.N(1, (byte)2);
                d.z(ipSplitting.request_client_ip_is_ipv6, e);
            }
            if (ipSplitting.request_client_ip_network != null) {
                e.N(2, (byte)11);
                e.Z(ipSplitting.request_client_ip_network);
                e.O();
            }
            if (ipSplitting.request_client_ip_interface != null) {
                e.N(3, (byte)11);
                e.Z(ipSplitting.request_client_ip_interface);
                e.O();
            }
            if (ipSplitting.inferred_client_ip_is_ipv6 != null) {
                e.N(4, (byte)2);
                d.z(ipSplitting.inferred_client_ip_is_ipv6, e);
            }
            if (ipSplitting.inferred_client_ip_network != null) {
                e.N(5, (byte)11);
                e.Z(ipSplitting.inferred_client_ip_network);
                e.O();
            }
            if (ipSplitting.inferred_client_ip_interface != null) {
                e.N(6, (byte)11);
                e.Z(ipSplitting.inferred_client_ip_interface);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
