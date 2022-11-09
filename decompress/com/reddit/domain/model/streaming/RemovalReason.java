// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ag0.a;
import ah2.f;
import ak0.m;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/streaming/RemovalReason;", "", "id", "", "message", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMessage", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RemovalReason
{
    private final String id;
    private final String message;
    private final String title;
    
    public RemovalReason(final String id, final String message, final String title) {
        m.y(id, "id", message, "message", title, "title");
        this.id = id;
        this.message = message;
        this.title = title;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.message;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final RemovalReason copy(final String s, final String s2, final String s3) {
        f.f((Object)s, "id");
        f.f((Object)s2, "message");
        f.f((Object)s3, "title");
        return new RemovalReason(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemovalReason)) {
            return false;
        }
        final RemovalReason removalReason = (RemovalReason)o;
        return f.a((Object)this.id, (Object)removalReason.id) && f.a((Object)this.message, (Object)removalReason.message) && f.a((Object)this.title, (Object)removalReason.title);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        return this.title.hashCode() + a.f(this.message, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RemovalReason(id=");
        k.append(this.id);
        k.append(", message=");
        k.append(this.message);
        k.append(", title=");
        return b.k(k, this.title, ')');
    }
}
