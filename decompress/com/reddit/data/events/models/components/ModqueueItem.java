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

public final class ModqueueItem
{
    public static final a<ModqueueItem, Builder> ADAPTER;
    public final Long created_timestamp;
    public final Long modified_timestamp;
    public final String reason;
    public final Long sort_timestamp;
    public final String type;
    
    static {
        ADAPTER = (a)new ModqueueItemAdapter(null);
    }
    
    private ModqueueItem(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.sort_timestamp = Builder.access$200(builder);
        this.created_timestamp = Builder.access$300(builder);
        this.modified_timestamp = Builder.access$400(builder);
        this.reason = Builder.access$500(builder);
    }
    
    public ModqueueItem(final Builder builder, final ModqueueItem$1 object) {
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
        if (!(o instanceof ModqueueItem)) {
            return false;
        }
        final ModqueueItem modqueueItem = (ModqueueItem)o;
        final String type = this.type;
        final String type2 = modqueueItem.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Long sort_timestamp = this.sort_timestamp;
            final Long sort_timestamp2 = modqueueItem.sort_timestamp;
            if (sort_timestamp == sort_timestamp2 || (sort_timestamp != null && sort_timestamp.equals(sort_timestamp2))) {
                final Long created_timestamp = this.created_timestamp;
                final Long created_timestamp2 = modqueueItem.created_timestamp;
                if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                    final Long modified_timestamp = this.modified_timestamp;
                    final Long modified_timestamp2 = modqueueItem.modified_timestamp;
                    if (modified_timestamp == modified_timestamp2 || (modified_timestamp != null && modified_timestamp.equals(modified_timestamp2))) {
                        final String reason = this.reason;
                        final String reason2 = modqueueItem.reason;
                        boolean b2 = b;
                        if (reason == reason2) {
                            return b2;
                        }
                        if (reason != null && reason.equals(reason2)) {
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
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Long sort_timestamp = this.sort_timestamp;
        int hashCode3;
        if (sort_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = sort_timestamp.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode4;
        if (created_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = created_timestamp.hashCode();
        }
        final Long modified_timestamp = this.modified_timestamp;
        int hashCode5;
        if (modified_timestamp == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = modified_timestamp.hashCode();
        }
        final String reason = this.reason;
        if (reason != null) {
            hashCode = reason.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ModqueueItem{type=");
        t.append(this.type);
        t.append(", sort_timestamp=");
        t.append(this.sort_timestamp);
        t.append(", created_timestamp=");
        t.append(this.created_timestamp);
        t.append(", modified_timestamp=");
        t.append(this.modified_timestamp);
        t.append(", reason=");
        return ph0.a.f(t, this.reason, "}");
    }
    
    public void write(final e e) throws IOException {
        ModqueueItem.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModqueueItem>
    {
        private Long created_timestamp;
        private Long modified_timestamp;
        private String reason;
        private Long sort_timestamp;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final ModqueueItem modqueueItem) {
            this.type = modqueueItem.type;
            this.sort_timestamp = modqueueItem.sort_timestamp;
            this.created_timestamp = modqueueItem.created_timestamp;
            this.modified_timestamp = modqueueItem.modified_timestamp;
            this.reason = modqueueItem.reason;
        }
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static Long access$200(final Builder builder) {
            return builder.sort_timestamp;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.modified_timestamp;
        }
        
        public static String access$500(final Builder builder) {
            return builder.reason;
        }
        
        public ModqueueItem build() {
            return new ModqueueItem(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder modified_timestamp(final Long modified_timestamp) {
            this.modified_timestamp = modified_timestamp;
            return this;
        }
        
        public Builder reason(final String reason) {
            this.reason = reason;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.sort_timestamp = null;
            this.created_timestamp = null;
            this.modified_timestamp = null;
            this.reason = null;
        }
        
        public Builder sort_timestamp(final Long sort_timestamp) {
            this.sort_timestamp = sort_timestamp;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ModqueueItemAdapter implements a<ModqueueItem, Builder>
    {
        private ModqueueItemAdapter() {
        }
        
        public ModqueueItemAdapter(final ModqueueItem$1 object) {
            this();
        }
        
        public ModqueueItem read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModqueueItem read(final e e, final Builder builder) throws IOException {
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
                                if (b != 5) {
                                    ht.a.a(e, a);
                                }
                                else if (a == 11) {
                                    builder.reason(e.F());
                                }
                                else {
                                    ht.a.a(e, a);
                                }
                            }
                            else if (a == 10) {
                                builder.modified_timestamp(e.v());
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 10) {
                            builder.created_timestamp(e.v());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 10) {
                        builder.sort_timestamp(e.v());
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
        
        public void write(final e e, final ModqueueItem modqueueItem) throws IOException {
            e.X();
            if (modqueueItem.type != null) {
                e.O(1, (byte)11);
                e.W(modqueueItem.type);
                e.P();
            }
            if (modqueueItem.sort_timestamp != null) {
                e.O(2, (byte)10);
                k.w(modqueueItem.sort_timestamp, e);
            }
            if (modqueueItem.created_timestamp != null) {
                e.O(3, (byte)10);
                k.w(modqueueItem.created_timestamp, e);
            }
            if (modqueueItem.modified_timestamp != null) {
                e.O(4, (byte)10);
                k.w(modqueueItem.modified_timestamp, e);
            }
            if (modqueueItem.reason != null) {
                e.O(5, (byte)11);
                e.W(modqueueItem.reason);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModqueueItem)o);
        }
    }
}
