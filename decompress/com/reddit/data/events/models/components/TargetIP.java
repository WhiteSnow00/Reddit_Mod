// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class TargetIP
{
    public static final a<TargetIP, TargetIP.TargetIP$Builder> ADAPTER;
    public final String address;
    
    static {
        ADAPTER = (a)new TargetIP.TargetIP$TargetIPAdapter((TargetIP$1)null);
    }
    
    private TargetIP(final TargetIP.TargetIP$Builder targetIP$Builder) {
        this.address = TargetIP.TargetIP$Builder.access$100(targetIP$Builder);
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
        return a.o(a.r("TargetIP{address="), this.address, "}");
    }
    
    public void write(final e e) throws IOException {
        TargetIP.ADAPTER.write(e, (Object)this);
    }
}
