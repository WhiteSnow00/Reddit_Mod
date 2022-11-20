// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class ModQueueQuery
{
    public static final a<ModQueueQuery, Builder> ADAPTER;
    public final String sortby;
    
    static {
        ADAPTER = (a)new ModQueueQueryAdapter(null);
    }
    
    private ModQueueQuery(final Builder builder) {
        this.sortby = Builder.access$100(builder);
    }
    
    public ModQueueQuery(final Builder builder, final ModQueueQuery$1 object) {
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
        if (!(o instanceof ModQueueQuery)) {
            return false;
        }
        final ModQueueQuery modQueueQuery = (ModQueueQuery)o;
        final String sortby = this.sortby;
        final String sortby2 = modQueueQuery.sortby;
        boolean b2 = b;
        if (sortby != sortby2) {
            b2 = (sortby != null && sortby.equals(sortby2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String sortby = this.sortby;
        int hashCode;
        if (sortby == null) {
            hashCode = 0;
        }
        else {
            hashCode = sortby.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return ph0.a.f(a.t("ModQueueQuery{sortby="), this.sortby, "}");
    }
    
    public void write(final e e) throws IOException {
        ModQueueQuery.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModQueueQuery>
    {
        private String sortby;
        
        public Builder() {
        }
        
        public Builder(final ModQueueQuery modQueueQuery) {
            this.sortby = modQueueQuery.sortby;
        }
        
        public static String access$100(final Builder builder) {
            return builder.sortby;
        }
        
        public ModQueueQuery build() {
            return new ModQueueQuery(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public void reset() {
            this.sortby = null;
        }
        
        public Builder sortby(final String sortby) {
            this.sortby = sortby;
            return this;
        }
    }
    
    public static final class ModQueueQueryAdapter implements a<ModQueueQuery, Builder>
    {
        private ModQueueQueryAdapter() {
        }
        
        public ModQueueQueryAdapter(final ModQueueQuery$1 object) {
            this();
        }
        
        public ModQueueQuery read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModQueueQuery read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    ht.a.a(e, a);
                }
                else if (a == 11) {
                    builder.sortby(e.F());
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
        
        public void write(final e e, final ModQueueQuery modQueueQuery) throws IOException {
            e.X();
            if (modQueueQuery.sortby != null) {
                e.O(1, (byte)11);
                e.W(modQueueQuery.sortby);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModQueueQuery)o);
        }
    }
}
