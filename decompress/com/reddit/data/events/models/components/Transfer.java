// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Transfer
{
    public static final a<Transfer, Transfer.Transfer$Builder> ADAPTER;
    public final Long amount;
    public final String from_address;
    public final String to_address;
    
    static {
        ADAPTER = (a)new Transfer.Transfer$TransferAdapter((Transfer$1)null);
    }
    
    private Transfer(final Transfer.Transfer$Builder transfer$Builder) {
        this.from_address = Transfer.Transfer$Builder.access$100(transfer$Builder);
        this.to_address = Transfer.Transfer$Builder.access$200(transfer$Builder);
        this.amount = Transfer.Transfer$Builder.access$300(transfer$Builder);
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
        if (!(o instanceof Transfer)) {
            return false;
        }
        final Transfer transfer = (Transfer)o;
        final String from_address = this.from_address;
        final String from_address2 = transfer.from_address;
        if (from_address == from_address2 || (from_address != null && from_address.equals(from_address2))) {
            final String to_address = this.to_address;
            final String to_address2 = transfer.to_address;
            if (to_address == to_address2 || (to_address != null && to_address.equals(to_address2))) {
                final Long amount = this.amount;
                final Long amount2 = transfer.amount;
                boolean b2 = b;
                if (amount == amount2) {
                    return b2;
                }
                if (amount != null && amount.equals(amount2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String from_address = this.from_address;
        int hashCode = 0;
        int hashCode2;
        if (from_address == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = from_address.hashCode();
        }
        final String to_address = this.to_address;
        int hashCode3;
        if (to_address == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = to_address.hashCode();
        }
        final Long amount = this.amount;
        if (amount != null) {
            hashCode = amount.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Transfer{from_address=");
        r.append(this.from_address);
        r.append(", to_address=");
        r.append(this.to_address);
        r.append(", amount=");
        return a.m(r, this.amount, "}");
    }
    
    public void write(final e e) throws IOException {
        Transfer.ADAPTER.write(e, (Object)this);
    }
}
