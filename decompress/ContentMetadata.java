// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class ContentMetadata
{
    public static final a<ContentMetadata, ContentMetadata.ContentMetadata$Builder> ADAPTER;
    public final List<String> categories;
    public final Boolean is_nsfw;
    public final Boolean is_quarantined;
    
    static {
        ADAPTER = (a)new ContentMetadata.ContentMetadata$ContentMetadataAdapter((ContentMetadata$1)null);
    }
    
    private ContentMetadata(final ContentMetadata.ContentMetadata$Builder contentMetadata$Builder) {
        this.is_quarantined = ContentMetadata.ContentMetadata$Builder.access$100(contentMetadata$Builder);
        this.is_nsfw = ContentMetadata.ContentMetadata$Builder.access$200(contentMetadata$Builder);
        List<String> unmodifiableList;
        if (ContentMetadata.ContentMetadata$Builder.access$300(contentMetadata$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ContentMetadata.ContentMetadata$Builder.access$300(contentMetadata$Builder));
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
        if (!(o instanceof ContentMetadata)) {
            return false;
        }
        final ContentMetadata contentMetadata = (ContentMetadata)o;
        final Boolean is_quarantined = this.is_quarantined;
        final Boolean is_quarantined2 = contentMetadata.is_quarantined;
        if (is_quarantined == is_quarantined2 || (is_quarantined != null && is_quarantined.equals(is_quarantined2))) {
            final Boolean is_nsfw = this.is_nsfw;
            final Boolean is_nsfw2 = contentMetadata.is_nsfw;
            if (is_nsfw == is_nsfw2 || (is_nsfw != null && is_nsfw.equals(is_nsfw2))) {
                final List<String> categories = this.categories;
                final List<String> categories2 = contentMetadata.categories;
                boolean b2 = b;
                if (categories == categories2) {
                    return b2;
                }
                if (categories != null && categories.equals(categories2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean is_quarantined = this.is_quarantined;
        int hashCode = 0;
        int hashCode2;
        if (is_quarantined == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = is_quarantined.hashCode();
        }
        final Boolean is_nsfw = this.is_nsfw;
        int hashCode3;
        if (is_nsfw == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = is_nsfw.hashCode();
        }
        final List<String> categories = this.categories;
        if (categories != null) {
            hashCode = categories.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ContentMetadata{is_quarantined=");
        k.append(this.is_quarantined);
        k.append(", is_nsfw=");
        k.append(this.is_nsfw);
        k.append(", categories=");
        return n.r(k, (List)this.categories, "}");
    }
    
    public void write(final e e) throws IOException {
        ContentMetadata.ADAPTER.write(e, (Object)this);
    }
}
