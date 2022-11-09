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
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u00d6\u0001R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/LinkMedia;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/RedditVideo;", "component1", "redditVideo", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/RedditVideo;", "getRedditVideo", "()Lcom/reddit/domain/model/RedditVideo;", "<init>", "(Lcom/reddit/domain/model/RedditVideo;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkMedia implements Parcelable
{
    public static final Parcelable$Creator<LinkMedia> CREATOR;
    private final RedditVideo redditVideo;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LinkMedia(@n(name = "reddit_video") final RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
    }
    
    public final RedditVideo component1() {
        return this.redditVideo;
    }
    
    public final LinkMedia copy(@n(name = "reddit_video") final RedditVideo redditVideo) {
        return new LinkMedia(redditVideo);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LinkMedia && f.a((Object)this.redditVideo, (Object)((LinkMedia)o).redditVideo));
    }
    
    public final RedditVideo getRedditVideo() {
        return this.redditVideo;
    }
    
    @Override
    public int hashCode() {
        final RedditVideo redditVideo = this.redditVideo;
        int hashCode;
        if (redditVideo == null) {
            hashCode = 0;
        }
        else {
            hashCode = redditVideo.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LinkMedia(redditVideo=");
        k.append(this.redditVideo);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        final RedditVideo redditVideo = this.redditVideo;
        if (redditVideo == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            redditVideo.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LinkMedia>
    {
        public final LinkMedia createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = RedditVideo.CREATOR.createFromParcel(parcel);
            }
            return new LinkMedia((RedditVideo)fromParcel);
        }
        
        public final LinkMedia[] newArray(final int n) {
            return new LinkMedia[n];
        }
    }
}
