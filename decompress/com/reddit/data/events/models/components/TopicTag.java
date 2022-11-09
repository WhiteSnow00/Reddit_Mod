// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class TopicTag
{
    public static final a<TopicTag, Builder> ADAPTER;
    public final String content;
    public final String id;
    public final Boolean is_primary;
    public final String type;
    
    static {
        ADAPTER = (a)new TopicTagAdapter(null);
    }
    
    private TopicTag(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.content = Builder.access$200(builder);
        this.type = Builder.access$300(builder);
        this.is_primary = Builder.access$400(builder);
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
        if (!(o instanceof TopicTag)) {
            return false;
        }
        final TopicTag topicTag = (TopicTag)o;
        final String id = this.id;
        final String id2 = topicTag.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String content = this.content;
            final String content2 = topicTag.content;
            if (content == content2 || (content != null && content.equals(content2))) {
                final String type = this.type;
                final String type2 = topicTag.type;
                if (type == type2 || (type != null && type.equals(type2))) {
                    final Boolean is_primary = this.is_primary;
                    final Boolean is_primary2 = topicTag.is_primary;
                    boolean b2 = b;
                    if (is_primary == is_primary2) {
                        return b2;
                    }
                    if (is_primary != null && is_primary.equals(is_primary2)) {
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
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String content = this.content;
        int hashCode3;
        if (content == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = content.hashCode();
        }
        final String type = this.type;
        int hashCode4;
        if (type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = type.hashCode();
        }
        final Boolean is_primary = this.is_primary;
        if (is_primary != null) {
            hashCode = is_primary.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("TopicTag{id=");
        k.append(this.id);
        k.append(", content=");
        k.append(this.content);
        k.append(", type=");
        k.append(this.type);
        k.append(", is_primary=");
        k.append(this.is_primary);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        TopicTag.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<TopicTag>
    {
        private String content;
        private String id;
        private Boolean is_primary;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final TopicTag topicTag) {
            this.id = topicTag.id;
            this.content = topicTag.content;
            this.type = topicTag.type;
            this.is_primary = topicTag.is_primary;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.content;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.is_primary;
        }
        
        public TopicTag build() {
            return new TopicTag(this, null);
        }
        
        public Builder content(final String content) {
            this.content = content;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_primary(final Boolean is_primary) {
            this.is_primary = is_primary;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.content = null;
            this.type = null;
            this.is_primary = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class TopicTagAdapter implements a<TopicTag, Builder>
    {
        private TopicTagAdapter() {
        }
        
        public TopicTag read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public TopicTag read(final e e, final Builder builder) throws IOException {
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
                            else if (a == 2) {
                                builder.is_primary(e.b());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.type(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.content(e.F());
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
        
        public void write(final e e, final TopicTag topicTag) throws IOException {
            e.a0();
            if (topicTag.id != null) {
                e.N(1, (byte)11);
                e.Z(topicTag.id);
                e.O();
            }
            if (topicTag.content != null) {
                e.N(2, (byte)11);
                e.Z(topicTag.content);
                e.O();
            }
            if (topicTag.type != null) {
                e.N(3, (byte)11);
                e.Z(topicTag.type);
                e.O();
            }
            if (topicTag.is_primary != null) {
                e.N(4, (byte)2);
                d.z(topicTag.is_primary, e);
            }
            e.P();
            e.b0();
        }
    }
}
