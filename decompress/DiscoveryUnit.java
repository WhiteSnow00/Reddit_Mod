// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import jt.b;
import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class DiscoveryUnit
{
    public static final a<DiscoveryUnit, Builder> ADAPTER;
    public final String id;
    public final List<String> items;
    public final String name;
    public final String title;
    public final String type;
    
    static {
        ADAPTER = (a)new DiscoveryUnitAdapter(null);
    }
    
    private DiscoveryUnit(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.id = Builder.access$200(builder);
        this.title = Builder.access$300(builder);
        this.name = Builder.access$400(builder);
        List<String> unmodifiableList;
        if (Builder.access$500(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$500(builder));
        }
        this.items = unmodifiableList;
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
        if (!(o instanceof DiscoveryUnit)) {
            return false;
        }
        final DiscoveryUnit discoveryUnit = (DiscoveryUnit)o;
        final String type = this.type;
        final String type2 = discoveryUnit.type;
        if (type == type2 || type.equals(type2)) {
            final String id = this.id;
            final String id2 = discoveryUnit.id;
            if (id == id2 || id.equals(id2)) {
                final String title = this.title;
                final String title2 = discoveryUnit.title;
                if (title == title2 || (title != null && title.equals(title2))) {
                    final String name = this.name;
                    final String name2 = discoveryUnit.name;
                    if (name == name2 || name.equals(name2)) {
                        final List<String> items = this.items;
                        final List<String> items2 = discoveryUnit.items;
                        boolean b2 = b;
                        if (items == items2) {
                            return b2;
                        }
                        if (items != null && items.equals(items2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.type.hashCode();
        final int hashCode2 = this.id.hashCode();
        final String title = this.title;
        int hashCode3 = 0;
        int hashCode4;
        if (title == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = title.hashCode();
        }
        final int hashCode5 = this.name.hashCode();
        final List<String> items = this.items;
        if (items != null) {
            hashCode3 = items.hashCode();
        }
        return (((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode2) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode3) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("DiscoveryUnit{type=");
        k.append(this.type);
        k.append(", id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", name=");
        k.append(this.name);
        k.append(", items=");
        return n.r(k, (List)this.items, "}");
    }
    
    public void write(final e e) throws IOException {
        DiscoveryUnit.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<DiscoveryUnit>
    {
        private String id;
        private List<String> items;
        private String name;
        private String title;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final DiscoveryUnit discoveryUnit) {
            this.type = discoveryUnit.type;
            this.id = discoveryUnit.id;
            this.title = discoveryUnit.title;
            this.name = discoveryUnit.name;
            this.items = discoveryUnit.items;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.title;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ List access$500(final Builder builder) {
            return builder.items;
        }
        
        public DiscoveryUnit build() {
            if (this.type == null) {
                throw new IllegalStateException("Required field 'type' is missing");
            }
            if (this.id == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            if (this.name != null) {
                return new DiscoveryUnit(this, null);
            }
            throw new IllegalStateException("Required field 'name' is missing");
        }
        
        public Builder id(final String id) {
            if (id != null) {
                this.id = id;
                return this;
            }
            throw new NullPointerException("Required field 'id' cannot be null");
        }
        
        public Builder items(final List<String> items) {
            this.items = items;
            return this;
        }
        
        public Builder name(final String name) {
            if (name != null) {
                this.name = name;
                return this;
            }
            throw new NullPointerException("Required field 'name' cannot be null");
        }
        
        public void reset() {
            this.type = null;
            this.id = null;
            this.title = null;
            this.name = null;
            this.items = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
        
        public Builder type(final String type) {
            if (type != null) {
                this.type = type;
                return this;
            }
            throw new NullPointerException("Required field 'type' cannot be null");
        }
    }
    
    public static final class DiscoveryUnitAdapter implements a<DiscoveryUnit, Builder>
    {
        private DiscoveryUnitAdapter() {
        }
        
        public DiscoveryUnit read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public DiscoveryUnit read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 2) {
                    switch (b) {
                        default: {
                            mt.a.a(e, a);
                            break;
                        }
                        case 12: {
                            if (a == 15) {
                                final c w = e.w();
                                final ArrayList list = new ArrayList(w.b);
                                for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                                e.x();
                                builder.items((List<String>)list);
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 11: {
                            if (a == 11) {
                                builder.name(e.F());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 10: {
                            if (a == 11) {
                                builder.title(e.F());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
                        case 9: {
                            if (a == 11) {
                                builder.id(e.F());
                                break;
                            }
                            mt.a.a(e, a);
                            break;
                        }
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
        
        public void write(final e e, final DiscoveryUnit discoveryUnit) throws IOException {
            e.a0();
            e.N(2, (byte)11);
            e.Z(discoveryUnit.type);
            e.O();
            e.N(9, (byte)11);
            e.Z(discoveryUnit.id);
            e.O();
            if (discoveryUnit.title != null) {
                e.N(10, (byte)11);
                e.Z(discoveryUnit.title);
                e.O();
            }
            e.N(11, (byte)11);
            e.Z(discoveryUnit.name);
            e.O();
            if (discoveryUnit.items != null) {
                e.N(12, (byte)15);
                e.V((byte)11, discoveryUnit.items.size());
                final Iterator<String> iterator = discoveryUnit.items.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
