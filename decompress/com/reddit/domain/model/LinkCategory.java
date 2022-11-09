// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import java.io.Serializable;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/LinkCategory;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "component1", "component2", "categoryId", "categoryName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "getCategoryName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkCategory implements Parcelable, Serializable
{
    public static final Parcelable$Creator<LinkCategory> CREATOR;
    private final String categoryId;
    private final String categoryName;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LinkCategory(@n(name = "category_id") final String categoryId, @n(name = "category_name") final String categoryName) {
        f.f((Object)categoryId, "categoryId");
        f.f((Object)categoryName, "categoryName");
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    
    public final String component1() {
        return this.categoryId;
    }
    
    public final String component2() {
        return this.categoryName;
    }
    
    public final LinkCategory copy(@n(name = "category_id") final String s, @n(name = "category_name") final String s2) {
        f.f((Object)s, "categoryId");
        f.f((Object)s2, "categoryName");
        return new LinkCategory(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkCategory)) {
            return false;
        }
        final LinkCategory linkCategory = (LinkCategory)o;
        return f.a((Object)this.categoryId, (Object)linkCategory.categoryId) && f.a((Object)this.categoryName, (Object)linkCategory.categoryName);
    }
    
    public final String getCategoryId() {
        return this.categoryId;
    }
    
    public final String getCategoryName() {
        return this.categoryName;
    }
    
    @Override
    public int hashCode() {
        return this.categoryName.hashCode() + this.categoryId.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LinkCategory(categoryId=");
        k.append(this.categoryId);
        k.append(", categoryName=");
        return b.k(k, this.categoryName, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.categoryId);
        parcel.writeString(this.categoryName);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LinkCategory>
    {
        public final LinkCategory createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new LinkCategory(parcel.readString(), parcel.readString());
        }
        
        public final LinkCategory[] newArray(final int n) {
            return new LinkCategory[n];
        }
    }
}
