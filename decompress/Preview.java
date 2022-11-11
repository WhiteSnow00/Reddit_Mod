// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.f0;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J%\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u0012\u001a\u00020\fH\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u00d6\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/Preview;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/model/Image;", "component1", "Lcom/reddit/domain/model/RedditVideo;", "component2", "images", "redditVideoPreview", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lcom/reddit/domain/model/RedditVideo;", "getRedditVideoPreview", "()Lcom/reddit/domain/model/RedditVideo;", "<init>", "(Ljava/util/List;Lcom/reddit/domain/model/RedditVideo;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Preview implements Parcelable
{
    public static final Parcelable$Creator<Preview> CREATOR;
    private final List<Image> images;
    private final RedditVideo redditVideoPreview;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Preview(final List<Image> images, @n(name = "reddit_video_preview") final RedditVideo redditVideoPreview) {
        e.f((Object)images, "images");
        this.images = images;
        this.redditVideoPreview = redditVideoPreview;
    }
    
    public final List<Image> component1() {
        return this.images;
    }
    
    public final RedditVideo component2() {
        return this.redditVideoPreview;
    }
    
    public final Preview copy(final List<Image> list, @n(name = "reddit_video_preview") final RedditVideo redditVideo) {
        e.f((Object)list, "images");
        return new Preview(list, redditVideo);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Preview)) {
            return false;
        }
        final Preview preview = (Preview)o;
        return e.a((Object)this.images, (Object)preview.images) && e.a((Object)this.redditVideoPreview, (Object)preview.redditVideoPreview);
    }
    
    public final List<Image> getImages() {
        return this.images;
    }
    
    public final RedditVideo getRedditVideoPreview() {
        return this.redditVideoPreview;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.images.hashCode();
        final RedditVideo redditVideoPreview = this.redditVideoPreview;
        int hashCode2;
        if (redditVideoPreview == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = redditVideoPreview.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Preview(images=");
        r.append(this.images);
        r.append(", redditVideoPreview=");
        r.append(this.redditVideoPreview);
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        final Iterator s = al0.a.s((List)this.images, parcel);
        while (s.hasNext()) {
            ((Image)s.next()).writeToParcel(parcel, n);
        }
        final RedditVideo redditVideoPreview = this.redditVideoPreview;
        if (redditVideoPreview == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            redditVideoPreview.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Preview>
    {
        public final Preview createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = f0.b(Image.CREATOR, parcel, list, i, 1)) {}
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = RedditVideo.CREATOR.createFromParcel(parcel);
            }
            return new Preview((List<Image>)list, (RedditVideo)fromParcel);
        }
        
        public final Preview[] newArray(final int n) {
            return new Preview[n];
        }
    }
}
