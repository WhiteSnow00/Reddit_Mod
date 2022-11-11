// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Transaction
{
    public static final a<Transaction, Transaction.Transaction$Builder> ADAPTER;
    public final String hash;
    
    static {
        ADAPTER = (a)new Transaction.Transaction$TransactionAdapter((Transaction$1)null);
    }
    
    private Transaction(final Transaction.Transaction$Builder transaction$Builder) {
        this.hash = Transaction.Transaction$Builder.access$100(transaction$Builder);
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
        return a.o(a.r("Transaction{hash="), this.hash, "}");
    }
    
    public void write(final e e) throws IOException {
        Transaction.ADAPTER.write(e, (Object)this);
    }
}
