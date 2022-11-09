// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class TargetIP
{
    public static final a<TargetIP, Builder> ADAPTER;
    public final String address;
    
    static {
        ADAPTER = (a)new TargetIPAdapter(null);
    }
    
    private TargetIP(final Builder builder) {
        this.address = Builder.access$100(builder);
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
        if (!(o instanceof TargetIP)) {
            return false;
        }
        final TargetIP targetIP = (TargetIP)o;
        final String address = this.address;
        final String address2 = targetIP.address;
        boolean b2 = b;
        if (address != address2) {
            b2 = (address != null && address.equals(address2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String address = this.address;
        int hashCode;
        if (address == null) {
            hashCode = 0;
        }
        else {
            hashCode = address.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("TargetIP{address="), this.address, "}");
    }
    
    public void write(final e e) throws IOException {
        TargetIP.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<TargetIP>
    {
        private String address;
        
        public Builder() {
        }
        
        public Builder(final TargetIP targetIP) {
            this.address = targetIP.address;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.address;
        }
        
        public Builder address(final String address) {
            this.address = address;
            return this;
        }
        
        public TargetIP build() {
            return new TargetIP(this, null);
        }
        
        public void reset() {
            this.address = null;
        }
    }
    
    public static final class TargetIPAdapter implements a<TargetIP, Builder>
    {
        private TargetIPAdapter() {
        }
        
        public TargetIP read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public TargetIP read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    mt.a.a(e, a);
                }
                else if (a == 11) {
                    builder.address(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final TargetIP targetIP) throws IOException {
            e.a0();
            if (targetIP.address != null) {
                e.N(1, (byte)11);
                e.Z(targetIP.address);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
