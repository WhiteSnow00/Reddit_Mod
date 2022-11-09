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

public final class GrapeshotClassification
{
    public static final a<GrapeshotClassification, Builder> ADAPTER;
    public final List<String> categories;
    
    static {
        ADAPTER = (a)new GrapeshotClassificationAdapter(null);
    }
    
    private GrapeshotClassification(final Builder builder) {
        List<String> unmodifiableList;
        if (Builder.access$100(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.categories = unmodifiableList;
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
        if (!(o instanceof GrapeshotClassification)) {
            return false;
        }
        final GrapeshotClassification grapeshotClassification = (GrapeshotClassification)o;
        final List<String> categories = this.categories;
        final List<String> categories2 = grapeshotClassification.categories;
        boolean b2 = b;
        if (categories != categories2) {
            b2 = (categories != null && categories.equals(categories2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final List<String> categories = this.categories;
        int hashCode;
        if (categories == null) {
            hashCode = 0;
        }
        else {
            hashCode = categories.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return n.r(a.k("GrapeshotClassification{categories="), (List)this.categories, "}");
    }
    
    public void write(final e e) throws IOException {
        GrapeshotClassification.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<GrapeshotClassification>
    {
        private List<String> categories;
        
        public Builder() {
        }
        
        public Builder(final GrapeshotClassification grapeshotClassification) {
            this.categories = grapeshotClassification.categories;
        }
        
        public static /* synthetic */ List access$100(final Builder builder) {
            return builder.categories;
        }
        
        public GrapeshotClassification build() {
            return new GrapeshotClassification(this, null);
        }
        
        public Builder categories(final List<String> categories) {
            this.categories = categories;
            return this;
        }
        
        public void reset() {
            this.categories = null;
        }
    }
    
    public static final class GrapeshotClassificationAdapter implements a<GrapeshotClassification, Builder>
    {
        private GrapeshotClassificationAdapter() {
        }
        
        public GrapeshotClassification read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public GrapeshotClassification read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    mt.a.a(e, a);
                }
                else if (a == 15) {
                    final c w = e.w();
                    final ArrayList list = new ArrayList(w.b);
                    for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                    e.x();
                    builder.categories((List<String>)list);
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final GrapeshotClassification grapeshotClassification) throws IOException {
            e.a0();
            if (grapeshotClassification.categories != null) {
                e.N(1, (byte)15);
                e.V((byte)11, grapeshotClassification.categories.size());
                final Iterator<String> iterator = grapeshotClassification.categories.iterator();
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
