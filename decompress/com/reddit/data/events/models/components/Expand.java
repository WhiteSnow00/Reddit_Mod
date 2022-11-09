// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Expand
{
    public static final a<Expand, Builder> ADAPTER;
    public final String provider;
    
    static {
        ADAPTER = (a)new ExpandAdapter(null);
    }
    
    private Expand(final Builder builder) {
        this.provider = Builder.access$100(builder);
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
        if (!(o instanceof Expand)) {
            return false;
        }
        final Expand expand = (Expand)o;
        final String provider = this.provider;
        final String provider2 = expand.provider;
        boolean b2 = b;
        if (provider != provider2) {
            b2 = (provider != null && provider.equals(provider2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String provider = this.provider;
        int hashCode;
        if (provider == null) {
            hashCode = 0;
        }
        else {
            hashCode = provider.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Expand{provider="), this.provider, "}");
    }
    
    public void write(final e e) throws IOException {
        Expand.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Expand>
    {
        private String provider;
        
        public Builder() {
        }
        
        public Builder(final Expand expand) {
            this.provider = expand.provider;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.provider;
        }
        
        public Expand build() {
            return new Expand(this, null);
        }
        
        public Builder provider(final String provider) {
            this.provider = provider;
            return this;
        }
        
        public void reset() {
            this.provider = null;
        }
    }
    
    public static final class ExpandAdapter implements a<Expand, Builder>
    {
        private ExpandAdapter() {
        }
        
        public Expand read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Expand read(final e e, final Builder builder) throws IOException {
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
                    builder.provider(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Expand expand) throws IOException {
            e.a0();
            if (expand.provider != null) {
                e.N(1, (byte)11);
                e.Z(expand.provider);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
