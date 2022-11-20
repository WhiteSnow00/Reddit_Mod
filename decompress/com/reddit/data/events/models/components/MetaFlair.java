// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class MetaFlair
{
    public static final a<MetaFlair, Builder> ADAPTER;
    public final String id;
    public final String title;
    
    static {
        ADAPTER = (a)new MetaFlairAdapter(null);
    }
    
    private MetaFlair(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
    }
    
    public MetaFlair(final Builder builder, final MetaFlair$1 metaFlair$1) {
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
        if (!(o instanceof MetaFlair)) {
            return false;
        }
        final MetaFlair metaFlair = (MetaFlair)o;
        final String id = this.id;
        final String id2 = metaFlair.id;
        if (id == id2 || id.equals(id2)) {
            final String title = this.title;
            final String title2 = metaFlair.title;
            boolean b2 = b;
            if (title == title2) {
                return b2;
            }
            if (title != null && title.equals(title2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        return ((hashCode ^ 0x1000193) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("MetaFlair{id=");
        t.append(this.id);
        t.append(", title=");
        return ph0.a.f(t, this.title, "}");
    }
    
    public void write(final e e) throws IOException {
        MetaFlair.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<MetaFlair>
    {
        private String id;
        private String title;
        
        public Builder() {
        }
        
        public Builder(final MetaFlair metaFlair) {
            this.id = metaFlair.id;
            this.title = metaFlair.title;
        }
        
        public static String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.title;
        }
        
        public MetaFlair build() {
            if (this.id != null) {
                return new MetaFlair(this, null);
            }
            throw new IllegalStateException("Required field 'id' is missing");
        }
        
        public /* bridge */ Object build() {
            return this.build();
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
            this.title = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
    }
    
    public static final class MetaFlairAdapter implements a<MetaFlair, Builder>
    {
        private MetaFlairAdapter() {
        }
        
        public MetaFlairAdapter(final MetaFlair$1 metaFlair$1) {
            this();
        }
        
        public MetaFlair read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public MetaFlair read(final e e, final Builder builder) throws IOException {
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
                        ht.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.title(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
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
        
        public void write(final e e, final MetaFlair metaFlair) throws IOException {
            e.X();
            e.O(1, (byte)11);
            e.W(metaFlair.id);
            e.P();
            if (metaFlair.title != null) {
                e.O(2, (byte)11);
                e.W(metaFlair.title);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (MetaFlair)o);
        }
    }
}
