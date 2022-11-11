// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Chain
{
    public static final a<Chain, Chain.Chain$Builder> ADAPTER;
    public final String id;
    
    static {
        ADAPTER = (a)new Chain.Chain$ChainAdapter((Chain$1)null);
    }
    
    private Chain(final Chain.Chain$Builder chain$Builder) {
        this.id = Chain.Chain$Builder.access$100(chain$Builder);
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
        if (!(o instanceof Chain)) {
            return false;
        }
        final Chain chain = (Chain)o;
        final String id = this.id;
        final String id2 = chain.id;
        boolean b2 = b;
        if (id != id2) {
            b2 = (id != null && id.equals(id2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode;
        if (id == null) {
            hashCode = 0;
        }
        else {
            hashCode = id.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Chain{id="), this.id, "}");
    }
    
    public void write(final e e) throws IOException {
        Chain.ADAPTER.write(e, (Object)this);
    }
}
