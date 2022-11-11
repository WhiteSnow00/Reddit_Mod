// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Zipkin
{
    public static final a<Zipkin, Zipkin.Zipkin$Builder> ADAPTER;
    public final String trace_id;
    
    static {
        ADAPTER = (a)new Zipkin.Zipkin$ZipkinAdapter((Zipkin$1)null);
    }
    
    private Zipkin(final Zipkin.Zipkin$Builder zipkin$Builder) {
        this.trace_id = Zipkin.Zipkin$Builder.access$100(zipkin$Builder);
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
        return a.o(a.r("Zipkin{trace_id="), this.trace_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Zipkin.ADAPTER.write(e, (Object)this);
    }
}
