// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/model/v1/LinkMedia;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/data/model/v1/RedditVideo;", "redditVideo", "Lcom/reddit/data/model/v1/RedditVideo;", "getRedditVideo", "()Lcom/reddit/data/model/v1/RedditVideo;", "setRedditVideo", "(Lcom/reddit/data/model/v1/RedditVideo;)V", "<init>", "Lcom/reddit/domain/model/LinkMedia;", "linkMedia", "(Lcom/reddit/domain/model/LinkMedia;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkMedia implements Serializable, Parcelable
{
    public static final Parcelable$Creator<LinkMedia> CREATOR;
    private RedditVideo redditVideo;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LinkMedia() {
        this(null, 1, null);
    }
    
    public LinkMedia(@n(name = "reddit_video") final RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
    }
    
    public LinkMedia(final com.reddit.domain.model.LinkMedia linkMedia) {
        f.f((Object)linkMedia, "linkMedia");
        final com.reddit.domain.model.RedditVideo redditVideo = linkMedia.getRedditVideo();
        RedditVideo redditVideo2;
        if (redditVideo != null) {
            redditVideo2 = new RedditVideo(redditVideo);
        }
        else {
            redditVideo2 = null;
        }
        this(redditVideo2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final RedditVideo getRedditVideo() {
        return this.redditVideo;
    }
    
    public final void setRedditVideo(final RedditVideo redditVideo) {
        this.redditVideo = redditVideo;
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
