// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class TheaterMode
{
    public static final a<TheaterMode, Builder> ADAPTER;
    public final String id;
    public final Long position;
    
    static {
        ADAPTER = (a)new TheaterModeAdapter(null);
    }
    
    private TheaterMode(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.position = Builder.access$200(builder);
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
        if (!(o instanceof TheaterMode)) {
            return false;
        }
        final TheaterMode theaterMode = (TheaterMode)o;
        final String id = this.id;
        final String id2 = theaterMode.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long position = this.position;
            final Long position2 = theaterMode.position;
            boolean b2 = b;
            if (position == position2) {
                return b2;
            }
            if (position != null && position.equals(position2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Long position = this.position;
        if (position != null) {
            hashCode = position.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("TheaterMode{id=");
        k.append(this.id);
        k.append(", position=");
        return a.h(k, this.position, "}");
    }
    
    public void write(final e e) throws IOException {
        TheaterMode.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<TheaterMode>
    {
        private String id;
        private Long position;
        
        public Builder() {
        }
        
        public Builder(final TheaterMode theaterMode) {
            this.id = theaterMode.id;
            this.position = theaterMode.position;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.position;
        }
        
        public TheaterMode build() {
            return new TheaterMode(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder position(final Long position) {
            this.position = position;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.position = null;
        }
    }
    
    public static final class TheaterModeAdapter implements a<TheaterMode, Builder>
    {
        private TheaterModeAdapter() {
        }
        
        public TheaterMode read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public TheaterMode read(final e e, final Builder builder) throws IOException {
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
                    else if (a == 10) {
                        builder.position(e.v());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final TheaterMode theaterMode) throws IOException {
            e.a0();
            if (theaterMode.id != null) {
                e.N(1, (byte)11);
                e.Z(theaterMode.id);
                e.O();
            }
            if (theaterMode.position != null) {
                e.N(2, (byte)10);
                a.r(theaterMode.position, e);
            }
            e.P();
            e.b0();
        }
    }
}
