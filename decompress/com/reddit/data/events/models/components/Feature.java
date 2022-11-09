// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Feature
{
    public static final a<Feature, Builder> ADAPTER;
    public final String name;
    public final String version;
    public final String version_description;
    
    static {
        ADAPTER = (a)new FeatureAdapter(null);
    }
    
    private Feature(final Builder builder) {
        this.name = Builder.access$100(builder);
        this.version = Builder.access$200(builder);
        this.version_description = Builder.access$300(builder);
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
        if (!(o instanceof Feature)) {
            return false;
        }
        final Feature feature = (Feature)o;
        final String name = this.name;
        final String name2 = feature.name;
        if (name == name2 || (name != null && name.equals(name2))) {
            final String version = this.version;
            final String version2 = feature.version;
            if (version == version2 || (version != null && version.equals(version2))) {
                final String version_description = this.version_description;
                final String version_description2 = feature.version_description;
                boolean b2 = b;
                if (version_description == version_description2) {
                    return b2;
                }
                if (version_description != null && version_description.equals(version_description2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String name = this.name;
        int hashCode = 0;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        final String version = this.version;
        int hashCode3;
        if (version == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = version.hashCode();
        }
        final String version_description = this.version_description;
        if (version_description != null) {
            hashCode = version_description.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Feature{name=");
        k.append(this.name);
        k.append(", version=");
        k.append(this.version);
        k.append(", version_description=");
        return b.j(k, this.version_description, "}");
    }
    
    public void write(final e e) throws IOException {
        Feature.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Feature>
    {
        private String name;
        private String version;
        private String version_description;
        
        public Builder() {
        }
        
        public Builder(final Feature feature) {
            this.name = feature.name;
            this.version = feature.version;
            this.version_description = feature.version_description;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.version;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.version_description;
        }
        
        public Feature build() {
            return new Feature(this, null);
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public void reset() {
            this.name = null;
            this.version = null;
            this.version_description = null;
        }
        
        public Builder version(final String version) {
            this.version = version;
            return this;
        }
        
        public Builder version_description(final String version_description) {
            this.version_description = version_description;
            return this;
        }
    }
    
    public static final class FeatureAdapter implements a<Feature, Builder>
    {
        private FeatureAdapter() {
        }
        
        public Feature read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Feature read(final e e, final Builder builder) throws IOException {
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
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.version_description(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.version(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.name(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Feature feature) throws IOException {
            e.a0();
            if (feature.name != null) {
                e.N(1, (byte)11);
                e.Z(feature.name);
                e.O();
            }
            if (feature.version != null) {
                e.N(2, (byte)11);
                e.Z(feature.version);
                e.O();
            }
            if (feature.version_description != null) {
                e.N(3, (byte)11);
                e.Z(feature.version_description);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
