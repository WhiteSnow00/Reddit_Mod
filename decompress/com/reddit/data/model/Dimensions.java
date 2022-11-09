// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/model/Dimensions;", "", "width", "", "height", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWidth", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/reddit/data/model/Dimensions;", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Dimensions
{
    private final Long height;
    private final Long width;
    
    public Dimensions(final Long width, final Long height) {
        this.width = width;
        this.height = height;
    }
    
    public final Long component1() {
        return this.width;
    }
    
    public final Long component2() {
        return this.height;
    }
    
    public final Dimensions copy(final Long n, final Long n2) {
        return new Dimensions(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dimensions)) {
            return false;
        }
        final Dimensions dimensions = (Dimensions)o;
        return f.a((Object)this.width, (Object)dimensions.width) && f.a((Object)this.height, (Object)dimensions.height);
    }
    
    public final Long getHeight() {
        return this.height;
    }
    
    public final Long getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final Long width = this.width;
        int hashCode = 0;
        int hashCode2;
        if (width == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = width.hashCode();
        }
        final Long height = this.height;
        if (height != null) {
            hashCode = height.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Dimensions(width=");
        k.append(this.width);
        k.append(", height=");
        return a40.f.o(k, this.height, ')');
    }
}
