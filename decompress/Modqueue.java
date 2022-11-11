// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class Modqueue
{
    public static final a<Modqueue, Builder> ADAPTER;
    public final Integer count;
    public final String type;
    
    static {
        ADAPTER = (a)new ModqueueAdapter(null);
    }
    
    private Modqueue(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.count = Builder.access$200(builder);
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
        if (!(o instanceof Modqueue)) {
            return false;
        }
        final Modqueue modqueue = (Modqueue)o;
        final String type = this.type;
        final String type2 = modqueue.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Integer count = this.count;
            final Integer count2 = modqueue.count;
            boolean b2 = b;
            if (count == count2) {
                return b2;
            }
            if (count != null && count.equals(count2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Integer count = this.count;
        if (count != null) {
            hashCode = count.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Modqueue{type=");
        k.append(this.type);
        k.append(", count=");
        k.append(this.count);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Modqueue.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Modqueue>
    {
        private Integer count;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Modqueue modqueue) {
            this.type = modqueue.type;
            this.count = modqueue.count;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ Integer access$200(final Builder builder) {
            return builder.count;
        }
        
        public Modqueue build() {
            return new Modqueue(this, null);
        }
        
        public Builder count(final Integer count) {
            this.count = count;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.count = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ModqueueAdapter implements a<Modqueue, Builder>
    {
        private ModqueueAdapter() {
        }
        
        public Modqueue read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Modqueue read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        mt.a.a(e, a);
                    }
                    else if (a == 8) {
                        builder.count(e.t());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.type(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Modqueue modqueue) throws IOException {
            e.a0();
            if (modqueue.type != null) {
                e.N(1, (byte)11);
                e.Z(modqueue.type);
                e.O();
            }
            if (modqueue.count != null) {
                e.N(2, (byte)8);
                b.r(modqueue.count, e);
            }
            e.P();
            e.b0();
        }
    }
}
