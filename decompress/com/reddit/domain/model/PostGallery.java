// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.Iterator;
import android.os.Parcel;
import p1.h;
import ng2.e;
import com.squareup.moshi.n;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/PostGallery;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/model/PostGalleryItem;", "component1", "items", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostGallery implements Parcelable
{
    public static final Parcelable$Creator<PostGallery> CREATOR;
    private final List<PostGalleryItem> items;
    
    static {
        CREATOR = (Parcelable$Creator)new PostGallery$Creator();
    }
    
    public PostGallery(@n(name = "items") final List<PostGalleryItem> items) {
        e.f((Object)items, "items");
        this.items = items;
    }
    
    public static PostGallery copy$default(final PostGallery postGallery, List items, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            items = postGallery.items;
        }
        return postGallery.copy(items);
    }
    
    public final List<PostGalleryItem> component1() {
        return this.items;
    }
    
    public final PostGallery copy(@n(name = "items") final List<PostGalleryItem> list) {
        e.f((Object)list, "items");
        return new PostGallery(list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof PostGallery && e.a((Object)this.items, (Object)((PostGallery)o).items));
    }
    
    public final List<PostGalleryItem> getItems() {
        return this.items;
    }
    
    @Override
    public int hashCode() {
        return this.items.hashCode();
    }
    
    @Override
    public String toString() {
        return h.d(a.t("PostGallery(items="), (List)this.items, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        final Iterator r = android.support.v4.media.a.r((List)this.items, parcel);
        while (r.hasNext()) {
            ((PostGalleryItem)r.next()).writeToParcel(parcel, n);
        }
    }
}
