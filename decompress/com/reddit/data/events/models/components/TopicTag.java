// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class TopicTag
{
    public static final a<TopicTag, TopicTag.TopicTag$Builder> ADAPTER;
    public final String content;
    public final String id;
    public final Boolean is_primary;
    public final String type;
    
    static {
        ADAPTER = (a)new TopicTag.TopicTag$TopicTagAdapter((TopicTag$1)null);
    }
    
    private TopicTag(final TopicTag.TopicTag$Builder topicTag$Builder) {
        this.id = TopicTag.TopicTag$Builder.access$100(topicTag$Builder);
        this.content = TopicTag.TopicTag$Builder.access$200(topicTag$Builder);
        this.type = TopicTag.TopicTag$Builder.access$300(topicTag$Builder);
        this.is_primary = TopicTag.TopicTag$Builder.access$400(topicTag$Builder);
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
        final StringBuilder r = a.r("TopicTag{id=");
        r.append(this.id);
        r.append(", content=");
        r.append(this.content);
        r.append(", type=");
        r.append(this.type);
        r.append(", is_primary=");
        r.append(this.is_primary);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        TopicTag.ADAPTER.write(e, (Object)this);
    }
}
