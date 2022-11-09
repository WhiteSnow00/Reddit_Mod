// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Zipkin
{
    public static final a<Zipkin, Builder> ADAPTER;
    public final String trace_id;
    
    static {
        ADAPTER = (a)new ZipkinAdapter(null);
    }
    
    private Zipkin(final Builder builder) {
        this.trace_id = Builder.access$100(builder);
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
        if (!(o instanceof Zipkin)) {
            return false;
        }
        final Zipkin zipkin = (Zipkin)o;
        final String trace_id = this.trace_id;
        final String trace_id2 = zipkin.trace_id;
        boolean b2 = b;
        if (trace_id != trace_id2) {
            b2 = (trace_id != null && trace_id.equals(trace_id2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String trace_id = this.trace_id;
        int hashCode;
        if (trace_id == null) {
            hashCode = 0;
        }
        else {
            hashCode = trace_id.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("Zipkin{trace_id="), this.trace_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Zipkin.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Zipkin>
    {
        private String trace_id;
        
        public Builder() {
        }
        
        public Builder(final Zipkin zipkin) {
            this.trace_id = zipkin.trace_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.trace_id;
        }
        
        public Zipkin build() {
            return new Zipkin(this, null);
        }
        
        public void reset() {
            this.trace_id = null;
        }
        
        public Builder trace_id(final String trace_id) {
            this.trace_id = trace_id;
            return this;
        }
    }
    
    public static final class ZipkinAdapter implements a<Zipkin, Builder>
    {
        private ZipkinAdapter() {
        }
        
        public Zipkin read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Zipkin read(final e e, final Builder builder) throws IOException {
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
                    builder.trace_id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Zipkin zipkin) throws IOException {
            e.a0();
            if (zipkin.trace_id != null) {
                e.N(1, (byte)11);
                e.Z(zipkin.trace_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
