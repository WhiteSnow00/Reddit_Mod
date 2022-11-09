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
import java.util.Collections;
import java.util.List;
import jt.a;

public final class GeoBlock
{
    public static final a<GeoBlock, Builder> ADAPTER;
    public final List<String> countries;
    public final String public_note;
    public final String reason;
    public final Integer response_code;
    
    static {
        ADAPTER = (a)new GeoBlockAdapter(null);
    }
    
    private GeoBlock(final Builder builder) {
        List<String> unmodifiableList;
        if (Builder.access$100(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.countries = unmodifiableList;
        this.reason = Builder.access$200(builder);
        this.public_note = Builder.access$300(builder);
        this.response_code = Builder.access$400(builder);
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
        if (!(o instanceof GeoBlock)) {
            return false;
        }
        final GeoBlock geoBlock = (GeoBlock)o;
        final List<String> countries = this.countries;
        final List<String> countries2 = geoBlock.countries;
        if (countries == countries2 || (countries != null && countries.equals(countries2))) {
            final String reason = this.reason;
            final String reason2 = geoBlock.reason;
            if (reason == reason2 || (reason != null && reason.equals(reason2))) {
                final String public_note = this.public_note;
                final String public_note2 = geoBlock.public_note;
                if (public_note == public_note2 || (public_note != null && public_note.equals(public_note2))) {
                    final Integer response_code = this.response_code;
                    final Integer response_code2 = geoBlock.response_code;
                    boolean b2 = b;
                    if (response_code == response_code2) {
                        return b2;
                    }
                    if (response_code != null && response_code.equals(response_code2)) {
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
        final List<String> countries = this.countries;
        int hashCode = 0;
        int hashCode2;
        if (countries == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = countries.hashCode();
        }
        final String reason = this.reason;
        int hashCode3;
        if (reason == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = reason.hashCode();
        }
        final String public_note = this.public_note;
        int hashCode4;
        if (public_note == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = public_note.hashCode();
        }
        final Integer response_code = this.response_code;
        if (response_code != null) {
            hashCode = response_code.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GeoBlock{countries=");
        k.append(this.countries);
        k.append(", reason=");
        k.append(this.reason);
        k.append(", public_note=");
        k.append(this.public_note);
        k.append(", response_code=");
        k.append(this.response_code);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        GeoBlock.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<GeoBlock>
    {
        private List<String> countries;
        private String public_note;
        private String reason;
        private Integer response_code;
        
        public Builder() {
        }
        
        public Builder(final GeoBlock geoBlock) {
            this.countries = geoBlock.countries;
            this.reason = geoBlock.reason;
            this.public_note = geoBlock.public_note;
            this.response_code = geoBlock.response_code;
        }
        
        public static /* synthetic */ List access$100(final Builder builder) {
            return builder.countries;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.reason;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.public_note;
        }
        
        public static /* synthetic */ Integer access$400(final Builder builder) {
            return builder.response_code;
        }
        
        public GeoBlock build() {
            return new GeoBlock(this, null);
        }
        
        public Builder countries(final List<String> countries) {
            this.countries = countries;
            return this;
        }
        
        public Builder public_note(final String public_note) {
            this.public_note = public_note;
            return this;
        }
        
        public Builder reason(final String reason) {
            this.reason = reason;
            return this;
        }
        
        public void reset() {
            this.countries = null;
            this.reason = null;
            this.public_note = null;
            this.response_code = null;
        }
        
        public Builder response_code(final Integer response_code) {
            this.response_code = response_code;
            return this;
        }
    }
    
    public static final class GeoBlockAdapter implements a<GeoBlock, Builder>
    {
        private GeoBlockAdapter() {
        }
        
        public GeoBlock read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public GeoBlock read(final e e, final Builder builder) throws IOException {
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
                        if (b != 3) {
                            if (b != 4) {
                                mt.a.a(e, a);
                            }
                            else if (a == 8) {
                                builder.response_code(e.t());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.public_note(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.reason(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 15) {
                    final c w = e.w();
                    final ArrayList list = new ArrayList(w.b);
                    for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                    e.x();
                    builder.countries((List<String>)list);
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final GeoBlock geoBlock) throws IOException {
            e.a0();
            if (geoBlock.countries != null) {
                e.N(1, (byte)15);
                e.V((byte)11, geoBlock.countries.size());
                final Iterator<String> iterator = geoBlock.countries.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (geoBlock.reason != null) {
                e.N(2, (byte)11);
                e.Z(geoBlock.reason);
                e.O();
            }
            if (geoBlock.public_note != null) {
                e.N(3, (byte)11);
                e.Z(geoBlock.public_note);
                e.O();
            }
            if (geoBlock.response_code != null) {
                e.N(4, (byte)8);
                b.r(geoBlock.response_code, e);
            }
            e.P();
            e.b0();
        }
    }
}
