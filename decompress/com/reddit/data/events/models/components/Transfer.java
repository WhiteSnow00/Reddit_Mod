// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class Transfer
{
    public static final a<Transfer, Builder> ADAPTER;
    public final Long amount;
    public final String from_address;
    public final String to_address;
    
    static {
        ADAPTER = (a)new TransferAdapter(null);
    }
    
    private Transfer(final Builder builder) {
        this.from_address = Builder.access$100(builder);
        this.to_address = Builder.access$200(builder);
        this.amount = Builder.access$300(builder);
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
        final StringBuilder k = a.k("Transfer{from_address=");
        k.append(this.from_address);
        k.append(", to_address=");
        k.append(this.to_address);
        k.append(", amount=");
        return a.h(k, this.amount, "}");
    }
    
    public void write(final e e) throws IOException {
        Transfer.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Transfer>
    {
        private Long amount;
        private String from_address;
        private String to_address;
        
        public Builder() {
        }
        
        public Builder(final Transfer transfer) {
            this.from_address = transfer.from_address;
            this.to_address = transfer.to_address;
            this.amount = transfer.amount;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.from_address;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.to_address;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.amount;
        }
        
        public Builder amount(final Long amount) {
            this.amount = amount;
            return this;
        }
        
        public Transfer build() {
            return new Transfer(this, null);
        }
        
        public Builder from_address(final String from_address) {
            this.from_address = from_address;
            return this;
        }
        
        public void reset() {
            this.from_address = null;
            this.to_address = null;
            this.amount = null;
        }
        
        public Builder to_address(final String to_address) {
            this.to_address = to_address;
            return this;
        }
    }
    
    public static final class TransferAdapter implements a<Transfer, Builder>
    {
        private TransferAdapter() {
        }
        
        public Transfer read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Transfer read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 10) {
                    if (b != 20) {
                        if (b != 30) {
                            mt.a.a(e, a);
                        }
                        else if (a == 10) {
                            builder.amount(e.v());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.to_address(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.from_address(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Transfer transfer) throws IOException {
            e.a0();
            if (transfer.from_address != null) {
                e.N(10, (byte)11);
                e.Z(transfer.from_address);
                e.O();
            }
            if (transfer.to_address != null) {
                e.N(20, (byte)11);
                e.Z(transfer.to_address);
                e.O();
            }
            if (transfer.amount != null) {
                e.N(30, (byte)10);
                a.r(transfer.amount, e);
            }
            e.P();
            e.b0();
        }
    }
}
