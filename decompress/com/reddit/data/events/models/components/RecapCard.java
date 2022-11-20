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

public final class RecapCard
{
    public static final a<RecapCard, Builder> ADAPTER;
    public final Long count;
    public final String facts;
    public final Long index;
    public final String type;
    
    static {
        ADAPTER = (a)new RecapCardAdapter(null);
    }
    
    private RecapCard(final Builder builder) {
        this.index = Builder.access$100(builder);
        this.count = Builder.access$200(builder);
        this.type = Builder.access$300(builder);
        this.facts = Builder.access$400(builder);
    }
    
    public RecapCard(final Builder builder, final RecapCard$1 object) {
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
        if (!(o instanceof RecapCard)) {
            return false;
        }
        final RecapCard recapCard = (RecapCard)o;
        final Long index = this.index;
        final Long index2 = recapCard.index;
        if (index == index2 || (index != null && index.equals(index2))) {
            final Long count = this.count;
            final Long count2 = recapCard.count;
            if (count == count2 || (count != null && count.equals(count2))) {
                final String type = this.type;
                final String type2 = recapCard.type;
                if (type == type2 || (type != null && type.equals(type2))) {
                    final String facts = this.facts;
                    final String facts2 = recapCard.facts;
                    boolean b2 = b;
                    if (facts == facts2) {
                        return b2;
                    }
                    if (facts != null && facts.equals(facts2)) {
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
        final Long index = this.index;
        int hashCode = 0;
        int hashCode2;
        if (index == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = index.hashCode();
        }
        final Long count = this.count;
        int hashCode3;
        if (count == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = count.hashCode();
        }
        final String type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final String facts = this.facts;
        if (facts != null) {
            hashCode = facts.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RecapCard{index=");
        t.append(this.index);
        t.append(", count=");
        t.append(this.count);
        t.append(", type=");
        t.append(this.type);
        t.append(", facts=");
        return ph0.a.f(t, this.facts, "}");
    }
    
    public void write(final e e) throws IOException {
        RecapCard.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<RecapCard>
    {
        private Long count;
        private String facts;
        private Long index;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final RecapCard recapCard) {
            this.index = recapCard.index;
            this.count = recapCard.count;
            this.type = recapCard.type;
            this.facts = recapCard.facts;
        }
        
        public static Long access$100(final Builder builder) {
            return builder.index;
        }
        
        public static Long access$200(final Builder builder) {
            return builder.count;
        }
        
        public static String access$300(final Builder builder) {
            return builder.type;
        }
        
        public static String access$400(final Builder builder) {
            return builder.facts;
        }
        
        public RecapCard build() {
            return new RecapCard(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder count(final Long count) {
            this.count = count;
            return this;
        }
        
        public Builder facts(final String facts) {
            this.facts = facts;
            return this;
        }
        
        public Builder index(final Long index) {
            this.index = index;
            return this;
        }
        
        public void reset() {
            this.index = null;
            this.count = null;
            this.type = null;
            this.facts = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class RecapCardAdapter implements a<RecapCard, Builder>
    {
        private RecapCardAdapter() {
        }
        
        public RecapCardAdapter(final RecapCard$1 object) {
            this();
        }
        
        public RecapCard read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public RecapCard read(final e e, final Builder builder) throws IOException {
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
                                builder.facts(e.F());
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.type(e.F());
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
                else if (a == 10) {
                    builder.index(e.v());
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
        
        public void write(final e e, final RecapCard recapCard) throws IOException {
            e.X();
            if (recapCard.index != null) {
                e.O(1, (byte)10);
                k.w(recapCard.index, e);
            }
            if (recapCard.count != null) {
                e.O(2, (byte)10);
                k.w(recapCard.count, e);
            }
            if (recapCard.type != null) {
                e.O(3, (byte)11);
                e.W(recapCard.type);
                e.P();
            }
            if (recapCard.facts != null) {
                e.O(4, (byte)11);
                e.W(recapCard.facts);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (RecapCard)o);
        }
    }
}
