// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class TopicMetadata
{
    public static final a<TopicMetadata, TopicMetadata.TopicMetadata$Builder> ADAPTER;
    public final String display_name;
    public final String id;
    
    static {
        ADAPTER = (a)new TopicMetadata.TopicMetadata$TopicMetadataAdapter((TopicMetadata$1)null);
    }
    
    private TopicMetadata(final TopicMetadata.TopicMetadata$Builder topicMetadata$Builder) {
        this.id = TopicMetadata.TopicMetadata$Builder.access$100(topicMetadata$Builder);
        this.display_name = TopicMetadata.TopicMetadata$Builder.access$200(topicMetadata$Builder);
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
        final StringBuilder r = a.r("TopicMetadata{id=");
        r.append(this.id);
        r.append(", display_name=");
        return a.o(r, this.display_name, "}");
    }
    
    public void write(final e e) throws IOException {
        TopicMetadata.ADAPTER.write(e, (Object)this);
    }
}
