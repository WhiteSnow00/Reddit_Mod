// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Indexing
{
    public static final a<Indexing, Builder> ADAPTER;
    public final String api;
    
    static {
        ADAPTER = (a)new IndexingAdapter(null);
    }
    
    private Indexing(final Builder builder) {
        this.api = Builder.access$100(builder);
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
        if (!(o instanceof Indexing)) {
            return false;
        }
        final Indexing indexing = (Indexing)o;
        final String api = this.api;
        final String api2 = indexing.api;
        boolean b2 = b;
        if (api != api2) {
            b2 = (api != null && api.equals(api2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String api = this.api;
        int hashCode;
        if (api == null) {
            hashCode = 0;
        }
        else {
            hashCode = api.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Indexing{api="), this.api, "}");
    }
    
    public void write(final e e) throws IOException {
        Indexing.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Indexing>
    {
        private String api;
        
        public Builder() {
        }
        
        public Builder(final Indexing indexing) {
            this.api = indexing.api;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.api;
        }
        
        public Builder api(final String api) {
            this.api = api;
            return this;
        }
        
        public Indexing build() {
            return new Indexing(this, null);
        }
        
        public void reset() {
            this.api = null;
        }
    }
    
    public static final class IndexingAdapter implements a<Indexing, Builder>
    {
        private IndexingAdapter() {
        }
        
        public Indexing read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Indexing read(final e e, final Builder builder) throws IOException {
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
                    builder.api(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Indexing indexing) throws IOException {
            e.a0();
            if (indexing.api != null) {
                e.N(1, (byte)11);
                e.Z(indexing.api);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
