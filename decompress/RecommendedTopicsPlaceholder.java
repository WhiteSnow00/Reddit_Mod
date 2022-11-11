// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R \u0010\u001a\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010\u0016\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0018¨\u0006%" }, d2 = { "Lcom/reddit/domain/model/RecommendedTopicsPlaceholder;", "Lcom/reddit/domain/model/IComment;", "Landroid/os/Parcelable;", "", "component1", "component2", "id", "kindWithId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getKindWithId", "depth", "I", "getDepth", "()I", "getDepth$annotations", "()V", "parentKindWithId", "getParentKindWithId", "getParentKindWithId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendedTopicsPlaceholder extends IComment
{
    public static final Parcelable$Creator<RecommendedTopicsPlaceholder> CREATOR;
    private final int depth;
    private final String id;
    private final String kindWithId;
    private final String parentKindWithId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RecommendedTopicsPlaceholder(final String id, final String kindWithId) {
        e.f((Object)id, "id");
        e.f((Object)kindWithId, "kindWithId");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.kindWithId = kindWithId;
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final String component2() {
        return this.getKindWithId();
    }
    
    public final RecommendedTopicsPlaceholder copy(final String s, final String s2) {
        e.f((Object)s, "id");
        e.f((Object)s2, "kindWithId");
        return new RecommendedTopicsPlaceholder(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedTopicsPlaceholder)) {
            return false;
        }
        final RecommendedTopicsPlaceholder recommendedTopicsPlaceholder = (RecommendedTopicsPlaceholder)o;
        return e.a((Object)this.getId(), (Object)recommendedTopicsPlaceholder.getId()) && e.a((Object)this.getKindWithId(), (Object)recommendedTopicsPlaceholder.getKindWithId());
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public String getParentKindWithId() {
        return this.parentKindWithId;
    }
    
    public int hashCode() {
        return this.getKindWithId().hashCode() + this.getId().hashCode() * 31;
    }
    
    public String toString() {
        final StringBuilder r = a.r("RecommendedTopicsPlaceholder(id=");
        r.append(this.getId());
        r.append(", kindWithId=");
        r.append(this.getKindWithId());
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.kindWithId);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RecommendedTopicsPlaceholder>
    {
        public final RecommendedTopicsPlaceholder createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new RecommendedTopicsPlaceholder(parcel.readString(), parcel.readString());
        }
        
        public final RecommendedTopicsPlaceholder[] newArray(final int n) {
            return new RecommendedTopicsPlaceholder[n];
        }
    }
}
