// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import androidx.appcompat.widget.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/chat/model/GifStub;", "Lcom/reddit/domain/chat/model/Gif;", "id", "", "height", "", "width", "(Ljava/lang/String;II)V", "getHeight", "()I", "getId", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GifStub extends Gif
{
    private final int height;
    private final String id;
    private final int width;
    
    public GifStub(final String id, final int height, final int width) {
        f.f((Object)id, "id");
        super(null);
        this.id = id;
        this.height = height;
        this.width = width;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final int component2() {
        return this.height;
    }
    
    public final int component3() {
        return this.width;
    }
    
    public final GifStub copy(final String s, final int n, final int n2) {
        f.f((Object)s, "id");
        return new GifStub(s, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GifStub)) {
            return false;
        }
        final GifStub gifStub = (GifStub)o;
        return f.a((Object)this.id, (Object)gifStub.id) && this.height == gifStub.height && this.width == gifStub.width;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.width) + s0.e(this.height, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GifStub(id=");
        k.append(this.id);
        k.append(", height=");
        k.append(this.height);
        k.append(", width=");
        return d.k(k, this.width, ')');
    }
}
