// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Programmatic
{
    public static final a<Programmatic, Builder> ADAPTER;
    public final String ad_unit;
    public final Long count;
    public final String partner;
    public final String type;
    
    static {
        ADAPTER = (a)new ProgrammaticAdapter(null);
    }
    
    private Programmatic(final Builder builder) {
        this.ad_unit = Builder.access$100(builder);
        this.count = Builder.access$200(builder);
        this.partner = Builder.access$300(builder);
        this.type = Builder.access$400(builder);
    }
    
    public Programmatic(final Builder builder, final Programmatic$1 object) {
        this(builder);
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
        if (!(o instanceof Programmatic)) {
            return false;
        }
        final Programmatic programmatic = (Programmatic)o;
        final String ad_unit = this.ad_unit;
        final String ad_unit2 = programmatic.ad_unit;
        if (ad_unit == ad_unit2 || (ad_unit != null && ad_unit.equals(ad_unit2))) {
            final Long count = this.count;
            final Long count2 = programmatic.count;
            if (count == count2 || (count != null && count.equals(count2))) {
                final String partner = this.partner;
                final String partner2 = programmatic.partner;
                if (partner == partner2 || (partner != null && partner.equals(partner2))) {
                    final String type = this.type;
                    final String type2 = programmatic.type;
                    boolean b2 = b;
                    if (type == type2) {
                        return b2;
                    }
                    if (type != null && type.equals(type2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String ad_unit = this.ad_unit;
        int hashCode = 0;
        int hashCode2;
        if (ad_unit == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ad_unit.hashCode();
        }
        final Long count = this.count;
        int hashCode3;
        if (count == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = count.hashCode();
        }
        final String partner = this.partner;
        int hashCode4;
        if (partner == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = partner.hashCode();
        }
        final String type = this.type;
        if (type != null) {
            hashCode = type.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Programmatic{ad_unit=");
        t.append(this.ad_unit);
        t.append(", count=");
        t.append(this.count);
        t.append(", partner=");
        t.append(this.partner);
        t.append(", type=");
        return ph0.a.f(t, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Programmatic.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Programmatic>
    {
        private String ad_unit;
        private Long count;
        private String partner;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Programmatic programmatic) {
            this.ad_unit = programmatic.ad_unit;
            this.count = programmatic.count;
            this.partner = programmatic.partner;
            this.type = programmatic.type;
        }
        
        public static String access$100(final Builder builder) {
            return builder.ad_unit;
        }
        
        public static Long access$200(final Builder builder) {
            return builder.count;
        }
        
        public static String access$300(final Builder builder) {
            return builder.partner;
        }
        
        public static String access$400(final Builder builder) {
            return builder.type;
        }
        
        public Builder ad_unit(final String ad_unit) {
            this.ad_unit = ad_unit;
            return this;
        }
        
        public Programmatic build() {
            return new Programmatic(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder count(final Long count) {
            this.count = count;
            return this;
        }
        
        public Builder partner(final String partner) {
            this.partner = partner;
            return this;
        }
        
        public void reset() {
            this.ad_unit = null;
            this.count = null;
            this.partner = null;
            this.type = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ProgrammaticAdapter implements a<Programmatic, Builder>
    {
        private ProgrammaticAdapter() {
        }
        
        public ProgrammaticAdapter(final Programmatic$1 object) {
            this();
        }
        
        public Programmatic read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Programmatic read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                ht.a.a(e, a);
                            }
                            else if (a == 11) {
                                builder.type(e.F());
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.partner(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 10) {
                        builder.count(e.v());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.ad_unit(e.F());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final Programmatic programmatic) throws IOException {
            e.X();
            if (programmatic.ad_unit != null) {
                e.O(1, (byte)11);
                e.W(programmatic.ad_unit);
                e.P();
            }
            if (programmatic.count != null) {
                e.O(2, (byte)10);
                k.w(programmatic.count, e);
            }
            if (programmatic.partner != null) {
                e.O(3, (byte)11);
                e.W(programmatic.partner);
                e.P();
            }
            if (programmatic.type != null) {
                e.O(4, (byte)11);
                e.W(programmatic.type);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Programmatic)o);
        }
    }
}
