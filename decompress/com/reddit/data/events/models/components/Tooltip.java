// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Tooltip
{
    public static final a<Tooltip, Builder> ADAPTER;
    public final String id;
    public final String text;
    
    static {
        ADAPTER = (a)new TooltipAdapter(null);
    }
    
    private Tooltip(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.text = Builder.access$200(builder);
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
        if (!(o instanceof Tooltip)) {
            return false;
        }
        final Tooltip tooltip = (Tooltip)o;
        final String id = this.id;
        final String id2 = tooltip.id;
        if (id == id2 || id.equals(id2)) {
            final String text = this.text;
            final String text2 = tooltip.text;
            boolean b2 = b;
            if (text == text2) {
                return b2;
            }
            if (text.equals(text2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.id.hashCode() ^ 0x1000193) * -2128831035 ^ this.text.hashCode()) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Tooltip{id=");
        k.append(this.id);
        k.append(", text=");
        return b.j(k, this.text, "}");
    }
    
    public void write(final e e) throws IOException {
        Tooltip.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Tooltip>
    {
        private String id;
        private String text;
        
        public Builder() {
        }
        
        public Builder(final Tooltip tooltip) {
            this.id = tooltip.id;
            this.text = tooltip.text;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.text;
        }
        
        public Tooltip build() {
            if (this.id == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            if (this.text != null) {
                return new Tooltip(this, null);
            }
            throw new IllegalStateException("Required field 'text' is missing");
        }
        
        public Builder id(final String id) {
            if (id != null) {
                this.id = id;
                return this;
            }
            throw new NullPointerException("Required field 'id' cannot be null");
        }
        
        public void reset() {
            this.id = null;
            this.text = null;
        }
        
        public Builder text(final String text) {
            if (text != null) {
                this.text = text;
                return this;
            }
            throw new NullPointerException("Required field 'text' cannot be null");
        }
    }
    
    public static final class TooltipAdapter implements a<Tooltip, Builder>
    {
        private TooltipAdapter() {
        }
        
        public Tooltip read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Tooltip read(final e e, final Builder builder) throws IOException {
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
                        builder.text(e.F());
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
        
        public void write(final e e, final Tooltip tooltip) throws IOException {
            e.a0();
            e.N(1, (byte)11);
            e.Z(tooltip.id);
            e.O();
            e.N(2, (byte)11);
            e.Z(tooltip.text);
            e.O();
            e.P();
            e.b0();
        }
    }
}
