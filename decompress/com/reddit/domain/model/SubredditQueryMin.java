// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ag0.a;
import ah2.f;
import ak0.m;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/SubredditQueryMin;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "id", "name", "prefixedName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getPrefixedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditQueryMin implements Parcelable
{
    public static final Parcelable$Creator<SubredditQueryMin> CREATOR;
    private final String id;
    private final String name;
    private final String prefixedName;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditQueryMin(final String id, final String name, final String prefixedName) {
        m.y(id, "id", name, "name", prefixedName, "prefixedName");
        this.id = id;
        this.name = name;
        this.prefixedName = prefixedName;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.prefixedName;
    }
    
    public final SubredditQueryMin copy(final String s, final String s2, final String s3) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s3, "prefixedName");
        return new SubredditQueryMin(s, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditQueryMin)) {
            return false;
        }
        final SubredditQueryMin subredditQueryMin = (SubredditQueryMin)o;
        return f.a((Object)this.id, (Object)subredditQueryMin.id) && f.a((Object)this.name, (Object)subredditQueryMin.name) && f.a((Object)this.prefixedName, (Object)subredditQueryMin.prefixedName);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getPrefixedName() {
        return this.prefixedName;
    }
    
    @Override
    public int hashCode() {
        return this.prefixedName.hashCode() + a.f(this.name, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditQueryMin(id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", prefixedName=");
        return b.k(k, this.prefixedName, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.prefixedName);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditQueryMin>
    {
        public final SubredditQueryMin createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new SubredditQueryMin(parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final SubredditQueryMin[] newArray(final int n) {
            return new SubredditQueryMin[n];
        }
    }
}
