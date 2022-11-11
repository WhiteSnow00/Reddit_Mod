// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import al0.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J5\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006!" }, d2 = { "Lcom/reddit/domain/model/SubredditCategory;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "id", "name", "color", "icon", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getColor", "getIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditCategory implements Parcelable
{
    public static final Parcelable$Creator<SubredditCategory> CREATOR;
    private final String color;
    private final String icon;
    private final String id;
    private final String name;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditCategory(@n(name = "category_id") final String id, @n(name = "category_name") String name, @n(name = "category_color") final String color, @n(name = "category_icon") final String icon) {
        e.f((Object)id, "id");
        e.f((Object)name, "name");
        this.id = id;
        this.name = name;
        this.color = color;
        this.icon = icon;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.color;
    }
    
    public final String component4() {
        return this.icon;
    }
    
    public final SubredditCategory copy(@n(name = "category_id") final String s, @n(name = "category_name") final String s2, @n(name = "category_color") final String s3, @n(name = "category_icon") final String s4) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        return new SubredditCategory(s, s2, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditCategory)) {
            return false;
        }
        final SubredditCategory subredditCategory = (SubredditCategory)o;
        return e.a((Object)this.id, (Object)subredditCategory.id) && e.a((Object)this.name, (Object)subredditCategory.name) && e.a((Object)this.color, (Object)subredditCategory.color) && e.a((Object)this.icon, (Object)subredditCategory.icon);
    }
    
    public final String getColor() {
        return this.color;
    }
    
    public final String getIcon() {
        return this.icon;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.name, this.id.hashCode() * 31, 31);
        final String color = this.color;
        int hashCode = 0;
        int hashCode2;
        if (color == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = color.hashCode();
        }
        final String icon = this.icon;
        if (icon != null) {
            hashCode = icon.hashCode();
        }
        return (c + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditCategory(id=");
        r.append(this.id);
        r.append(", name=");
        r.append(this.name);
        r.append(", color=");
        r.append(this.color);
        r.append(", icon=");
        return f0.n(r, this.icon, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.color);
        parcel.writeString(this.icon);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditCategory>
    {
        public final SubredditCategory createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new SubredditCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final SubredditCategory[] newArray(final int n) {
            return new SubredditCategory[n];
        }
    }
}
