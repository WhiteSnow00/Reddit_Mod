// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Trophy
{
    public static final a<Trophy, Builder> ADAPTER;
    public final String id;
    public final String name;
    
    static {
        ADAPTER = (a)new TrophyAdapter(null);
    }
    
    private Trophy(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.name = Builder.access$200(builder);
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
        if (!(o instanceof Trophy)) {
            return false;
        }
        final Trophy trophy = (Trophy)o;
        final String id = this.id;
        final String id2 = trophy.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String name = this.name;
            final String name2 = trophy.name;
            boolean b2 = b;
            if (name == name2) {
                return b2;
            }
            if (name != null && name.equals(name2)) {
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
        final String name = this.name;
        if (name != null) {
            hashCode = name.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Trophy{id=");
        k.append(this.id);
        k.append(", name=");
        return b.j(k, this.name, "}");
    }
    
    public void write(final e e) throws IOException {
        Trophy.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Trophy>
    {
        private String id;
        private String name;
        
        public Builder() {
        }
        
        public Builder(final Trophy trophy) {
            this.id = trophy.id;
            this.name = trophy.name;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.name;
        }
        
        public Trophy build() {
            return new Trophy(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.name = null;
        }
    }
    
    public static final class TrophyAdapter implements a<Trophy, Builder>
    {
        private TrophyAdapter() {
        }
        
        public Trophy read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Trophy read(final e e, final Builder builder) throws IOException {
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
                    else if (a == 11) {
                        builder.name(e.F());
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
        
        public void write(final e e, final Trophy trophy) throws IOException {
            e.a0();
            if (trophy.id != null) {
                e.N(1, (byte)11);
                e.Z(trophy.id);
                e.O();
            }
            if (trophy.name != null) {
                e.N(2, (byte)11);
                e.Z(trophy.name);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
