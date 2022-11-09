// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class TopicMetadata
{
    public static final a<TopicMetadata, Builder> ADAPTER;
    public final String display_name;
    public final String id;
    
    static {
        ADAPTER = (a)new TopicMetadataAdapter(null);
    }
    
    private TopicMetadata(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.display_name = Builder.access$200(builder);
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
        if (!(o instanceof TopicMetadata)) {
            return false;
        }
        final TopicMetadata topicMetadata = (TopicMetadata)o;
        final String id = this.id;
        final String id2 = topicMetadata.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String display_name = this.display_name;
            final String display_name2 = topicMetadata.display_name;
            boolean b2 = b;
            if (display_name == display_name2) {
                return b2;
            }
            if (display_name != null && display_name.equals(display_name2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String display_name = this.display_name;
        if (display_name != null) {
            hashCode = display_name.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("TopicMetadata{id=");
        k.append(this.id);
        k.append(", display_name=");
        return b.j(k, this.display_name, "}");
    }
    
    public void write(final e e) throws IOException {
        TopicMetadata.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<TopicMetadata>
    {
        private String display_name;
        private String id;
        
        public Builder() {
        }
        
        public Builder(final TopicMetadata topicMetadata) {
            this.id = topicMetadata.id;
            this.display_name = topicMetadata.display_name;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.display_name;
        }
        
        public TopicMetadata build() {
            return new TopicMetadata(this, null);
        }
        
        public Builder display_name(final String display_name) {
            this.display_name = display_name;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.display_name = null;
        }
    }
    
    public static final class TopicMetadataAdapter implements a<TopicMetadata, Builder>
    {
        private TopicMetadataAdapter() {
        }
        
        public TopicMetadata read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public TopicMetadata read(final e e, final Builder builder) throws IOException {
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
                        builder.display_name(e.F());
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
        
        public void write(final e e, final TopicMetadata topicMetadata) throws IOException {
            e.a0();
            if (topicMetadata.id != null) {
                e.N(1, (byte)11);
                e.Z(topicMetadata.id);
                e.O();
            }
            if (topicMetadata.display_name != null) {
                e.N(2, (byte)11);
                e.Z(topicMetadata.display_name);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
