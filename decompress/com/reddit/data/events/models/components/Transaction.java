// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Transaction
{
    public static final a<Transaction, Builder> ADAPTER;
    public final String hash;
    
    static {
        ADAPTER = (a)new TransactionAdapter(null);
    }
    
    private Transaction(final Builder builder) {
        this.hash = Builder.access$100(builder);
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
        if (!(o instanceof Transaction)) {
            return false;
        }
        final Transaction transaction = (Transaction)o;
        final String hash = this.hash;
        final String hash2 = transaction.hash;
        boolean b2 = b;
        if (hash != hash2) {
            b2 = (hash != null && hash.equals(hash2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String hash = this.hash;
        int hashCode;
        if (hash == null) {
            hashCode = 0;
        }
        else {
            hashCode = hash.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Transaction{hash="), this.hash, "}");
    }
    
    public void write(final e e) throws IOException {
        Transaction.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Transaction>
    {
        private String hash;
        
        public Builder() {
        }
        
        public Builder(final Transaction transaction) {
            this.hash = transaction.hash;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.hash;
        }
        
        public Transaction build() {
            return new Transaction(this, null);
        }
        
        public Builder hash(final String hash) {
            this.hash = hash;
            return this;
        }
        
        public void reset() {
            this.hash = null;
        }
    }
    
    public static final class TransactionAdapter implements a<Transaction, Builder>
    {
        private TransactionAdapter() {
        }
        
        public Transaction read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Transaction read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 10) {
                    mt.a.a(e, a);
                }
                else if (a == 11) {
                    builder.hash(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Transaction transaction) throws IOException {
            e.a0();
            if (transaction.hash != null) {
                e.N(10, (byte)11);
                e.Z(transaction.hash);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
