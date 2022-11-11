// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Contract
{
    public static final a<Contract, Contract.Contract$Builder> ADAPTER;
    public final String address;
    
    static {
        ADAPTER = (a)new Contract.Contract$ContractAdapter((Contract$1)null);
    }
    
    private Contract(final Contract.Contract$Builder contract$Builder) {
        this.address = Contract.Contract$Builder.access$100(contract$Builder);
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
        if (!(o instanceof Contract)) {
            return false;
        }
        final Contract contract = (Contract)o;
        final String address = this.address;
        final String address2 = contract.address;
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
        return b.j(a.k("Contract{address="), this.address, "}");
    }
    
    public void write(final e e) throws IOException {
        Contract.ADAPTER.write(e, (Object)this);
    }
}
