// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ak0.m;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/CommentPlaceholder;", "Lcom/reddit/domain/model/IComment;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "id", "kindWithId", "parentKindWithId", "depth", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "getParentKindWithId", "I", "getDepth", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommentPlaceholder extends IComment
{
    public static final Parcelable$Creator<CommentPlaceholder> CREATOR;
    private final int depth;
    private final String id;
    private final String kindWithId;
    private final String parentKindWithId;
    
    static {
        CREATOR = (Parcelable$Creator)new CommentPlaceholder$Creator();
    }
    
    public CommentPlaceholder(final String id, final String kindWithId, final String parentKindWithId, final int depth) {
        m.y(id, "id", kindWithId, "kindWithId", parentKindWithId, "parentKindWithId");
        super(null);
        this.id = id;
        this.kindWithId = kindWithId;
        this.parentKindWithId = parentKindWithId;
        this.depth = depth;
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component2() {
        return this.getKindWithId();
    }
    
    public final String component3() {
        return this.getParentKindWithId();
    }
    
    public final int component4() {
        return this.getDepth();
    }
    
    public final CommentPlaceholder copy(final String s, final String s2, final String s3, final int n) {
        f.f((Object)s, "id");
        f.f((Object)s2, "kindWithId");
        f.f((Object)s3, "parentKindWithId");
        return new CommentPlaceholder(s, s2, s3, n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommentPlaceholder)) {
            return false;
        }
        final CommentPlaceholder commentPlaceholder = (CommentPlaceholder)o;
        return f.a((Object)this.getId(), (Object)commentPlaceholder.getId()) && f.a((Object)this.getKindWithId(), (Object)commentPlaceholder.getKindWithId()) && f.a((Object)this.getParentKindWithId(), (Object)commentPlaceholder.getParentKindWithId()) && this.getDepth() == commentPlaceholder.getDepth();
    }
    
    @Override
    public int getDepth() {
        return this.depth;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    @Override
    public String getParentKindWithId() {
        return this.parentKindWithId;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.getDepth()) + (this.getParentKindWithId().hashCode() + (this.getKindWithId().hashCode() + this.getId().hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommentPlaceholder(id=");
        k.append(this.getId());
        k.append(", kindWithId=");
        k.append(this.getKindWithId());
        k.append(", parentKindWithId=");
        k.append(this.getParentKindWithId());
        k.append(", depth=");
        k.append(this.getDepth());
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.parentKindWithId);
        parcel.writeInt(this.depth);
    }
}
