// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000eJT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\"" }, d2 = { "Lcom/reddit/data/model/MediaAsset;", "", "__typename", "", "mimetype", "userId", "width", "", "id", "height", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "get__typename", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getMimetype", "getUserId", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/reddit/data/model/MediaAsset;", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MediaAsset
{
    private final String __typename;
    private final Long height;
    private final String id;
    private final String mimetype;
    private final String userId;
    private final Long width;
    
    public MediaAsset(final String _typename, final String mimetype, final String userId, final Long width, final String id, final Long height) {
        f.f((Object)_typename, "__typename");
        this.__typename = _typename;
        this.mimetype = mimetype;
        this.userId = userId;
        this.width = width;
        this.id = id;
        this.height = height;
    }
    
    public final String component1() {
        return this.__typename;
    }
    
    public final String component2() {
        return this.mimetype;
    }
    
    public final String component3() {
        return this.userId;
    }
    
    public final Long component4() {
        return this.width;
    }
    
    public final String component5() {
        return this.id;
    }
    
    public final Long component6() {
        return this.height;
    }
    
    public final MediaAsset copy(final String s, final String s2, final String s3, final Long n, final String s4, final Long n2) {
        f.f((Object)s, "__typename");
        return new MediaAsset(s, s2, s3, n, s4, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaAsset)) {
            return false;
        }
        final MediaAsset mediaAsset = (MediaAsset)o;
        return f.a((Object)this.__typename, (Object)mediaAsset.__typename) && f.a((Object)this.mimetype, (Object)mediaAsset.mimetype) && f.a((Object)this.userId, (Object)mediaAsset.userId) && f.a((Object)this.width, (Object)mediaAsset.width) && f.a((Object)this.id, (Object)mediaAsset.id) && f.a((Object)this.height, (Object)mediaAsset.height);
    }
    
    public final Long getHeight() {
        return this.height;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getMimetype() {
        return this.mimetype;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final Long getWidth() {
        return this.width;
    }
    
    public final String get__typename() {
        return this.__typename;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.__typename.hashCode();
        final String mimetype = this.mimetype;
        int hashCode2 = 0;
        int hashCode3;
        if (mimetype == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = mimetype.hashCode();
        }
        final String userId = this.userId;
        int hashCode4;
        if (userId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = userId.hashCode();
        }
        final Long width = this.width;
        int hashCode5;
        if (width == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = width.hashCode();
        }
        final String id = this.id;
        int hashCode6;
        if (id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = id.hashCode();
        }
        final Long height = this.height;
        if (height != null) {
            hashCode2 = height.hashCode();
        }
        return ((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MediaAsset(__typename=");
        k.append(this.__typename);
        k.append(", mimetype=");
        k.append(this.mimetype);
        k.append(", userId=");
        k.append(this.userId);
        k.append(", width=");
        k.append(this.width);
        k.append(", id=");
        k.append(this.id);
        k.append(", height=");
        return a40.f.o(k, this.height, ')');
    }
}
