// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/model/MediaSource;", "", "url", "", "dimensions", "Lcom/reddit/data/model/Dimensions;", "(Ljava/lang/String;Lcom/reddit/data/model/Dimensions;)V", "getDimensions", "()Lcom/reddit/data/model/Dimensions;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MediaSource
{
    private final Dimensions dimensions;
    private final String url;
    
    public MediaSource(final String url, final Dimensions dimensions) {
        this.url = url;
        this.dimensions = dimensions;
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final Dimensions component2() {
        return this.dimensions;
    }
    
    public final MediaSource copy(final String s, final Dimensions dimensions) {
        return new MediaSource(s, dimensions);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaSource)) {
            return false;
        }
        final MediaSource mediaSource = (MediaSource)o;
        return f.a((Object)this.url, (Object)mediaSource.url) && f.a((Object)this.dimensions, (Object)mediaSource.dimensions);
    }
    
    public final Dimensions getDimensions() {
        return this.dimensions;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String url = this.url;
        int hashCode = 0;
        int hashCode2;
        if (url == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = url.hashCode();
        }
        final Dimensions dimensions = this.dimensions;
        if (dimensions != null) {
            hashCode = dimensions.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MediaSource(url=");
        k.append(this.url);
        k.append(", dimensions=");
        k.append(this.dimensions);
        k.append(')');
        return k.toString();
    }
}
