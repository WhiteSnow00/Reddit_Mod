// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.topic;

import android.os.Parcel;
import ak0.m;
import ag0.a;
import ah2.f;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/topic/InterestTopic;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "id", "name", "title", "parentIds", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getTitle", "Ljava/util/List;", "getParentIds", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class InterestTopic implements Parcelable
{
    public static final Parcelable$Creator<InterestTopic> CREATOR;
    private final String id;
    private final String name;
    private final List<String> parentIds;
    private final String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public InterestTopic(final String id, final String name, final String title, final List<String> parentIds) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        f.f((Object)title, "title");
        f.f((Object)parentIds, "parentIds");
        this.id = id;
        this.name = name;
        this.title = title;
        this.parentIds = parentIds;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final List<String> component4() {
        return this.parentIds;
    }
    
    public final InterestTopic copy(final String s, final String s2, final String s3, final List<String> list) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s3, "title");
        f.f((Object)list, "parentIds");
        return new InterestTopic(s, s2, s3, list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InterestTopic)) {
            return false;
        }
        final InterestTopic interestTopic = (InterestTopic)o;
        return f.a((Object)this.id, (Object)interestTopic.id) && f.a((Object)this.name, (Object)interestTopic.name) && f.a((Object)this.title, (Object)interestTopic.title) && f.a((Object)this.parentIds, (Object)interestTopic.parentIds);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final List<String> getParentIds() {
        return this.parentIds;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        return this.parentIds.hashCode() + a.f(this.title, a.f(this.name, this.id.hashCode() * 31, 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("InterestTopic(id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", title=");
        k.append(this.title);
        k.append(", parentIds=");
        return m.n(k, (List)this.parentIds, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeStringList((List)this.parentIds);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<InterestTopic>
    {
        public final InterestTopic createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new InterestTopic(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }
        
        public final InterestTopic[] newArray(final int n) {
            return new InterestTopic[n];
        }
    }
}
