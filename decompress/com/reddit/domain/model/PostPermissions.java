// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ng2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b)\u0010\"R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010 \u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"¨\u0006/" }, d2 = { "Lcom/reddit/domain/model/PostPermissions;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/reddit/domain/model/PostPermission;", "component3", "component4", "component5", "component6", "component7", "links", "images", "videos", "text", "spoilers", "polls", "predictionPolls", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Z", "getLinks", "()Z", "getImages", "Lcom/reddit/domain/model/PostPermission;", "getVideos", "()Lcom/reddit/domain/model/PostPermission;", "getText", "getSpoilers", "getPolls", "getPredictionPolls", "getPredictionPolls$annotations", "()V", "<init>", "(ZZLcom/reddit/domain/model/PostPermission;ZZZZ)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPermissions implements Parcelable
{
    public static final Parcelable$Creator<PostPermissions> CREATOR;
    private final boolean images;
    private final boolean links;
    private final boolean polls;
    private final boolean predictionPolls;
    private final boolean spoilers;
    private final boolean text;
    private final PostPermission videos;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostPermissions(final boolean links, final boolean images, final PostPermission videos, final boolean text, final boolean spoilers, final boolean polls, final boolean predictionPolls) {
        e.f((Object)videos, "videos");
        this.links = links;
        this.images = images;
        this.videos = videos;
        this.text = text;
        this.spoilers = spoilers;
        this.polls = polls;
        this.predictionPolls = predictionPolls;
    }
    
    public static PostPermissions copy$default(final PostPermissions postPermissions, boolean links, boolean images, PostPermission videos, boolean text, boolean spoilers, boolean polls, boolean predictionPolls, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            links = postPermissions.links;
        }
        if ((n & 0x2) != 0x0) {
            images = postPermissions.images;
        }
        if ((n & 0x4) != 0x0) {
            videos = postPermissions.videos;
        }
        if ((n & 0x8) != 0x0) {
            text = postPermissions.text;
        }
        if ((n & 0x10) != 0x0) {
            spoilers = postPermissions.spoilers;
        }
        if ((n & 0x20) != 0x0) {
            polls = postPermissions.polls;
        }
        if ((n & 0x40) != 0x0) {
            predictionPolls = postPermissions.predictionPolls;
        }
        return postPermissions.copy(links, images, videos, text, spoilers, polls, predictionPolls);
    }
    
    public static void getPredictionPolls$annotations() {
    }
    
    public final boolean component1() {
        return this.links;
    }
    
    public final boolean component2() {
        return this.images;
    }
    
    public final PostPermission component3() {
        return this.videos;
    }
    
    public final boolean component4() {
        return this.text;
    }
    
    public final boolean component5() {
        return this.spoilers;
    }
    
    public final boolean component6() {
        return this.polls;
    }
    
    public final boolean component7() {
        return this.predictionPolls;
    }
    
    public final PostPermissions copy(final boolean b, final boolean b2, final PostPermission postPermission, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        e.f((Object)postPermission, "videos");
        return new PostPermissions(b, b2, postPermission, b3, b4, b5, b6);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPermissions)) {
            return false;
        }
        final PostPermissions postPermissions = (PostPermissions)o;
        return this.links == postPermissions.links && this.images == postPermissions.images && this.videos == postPermissions.videos && this.text == postPermissions.text && this.spoilers == postPermissions.spoilers && this.polls == postPermissions.polls && this.predictionPolls == postPermissions.predictionPolls;
    }
    
    public final boolean getImages() {
        return this.images;
    }
    
    public final boolean getLinks() {
        return this.links;
    }
    
    public final boolean getPolls() {
        return this.polls;
    }
    
    public final boolean getPredictionPolls() {
        return this.predictionPolls;
    }
    
    public final boolean getSpoilers() {
        return this.spoilers;
    }
    
    public final boolean getText() {
        return this.text;
    }
    
    public final PostPermission getVideos() {
        return this.videos;
    }
    
    @Override
    public int hashCode() {
        final int links = this.links ? 1 : 0;
        int n = 1;
        int n2 = links;
        if (links != 0) {
            n2 = 1;
        }
        int images;
        if ((images = (this.images ? 1 : 0)) != 0) {
            images = 1;
        }
        final int hashCode = this.videos.hashCode();
        int text;
        if ((text = (this.text ? 1 : 0)) != 0) {
            text = 1;
        }
        int spoilers;
        if ((spoilers = (this.spoilers ? 1 : 0)) != 0) {
            spoilers = 1;
        }
        int polls;
        if ((polls = (this.polls ? 1 : 0)) != 0) {
            polls = 1;
        }
        final int predictionPolls = this.predictionPolls ? 1 : 0;
        if (predictionPolls == 0) {
            n = predictionPolls;
        }
        return ((((hashCode + (n2 * 31 + images) * 31) * 31 + text) * 31 + spoilers) * 31 + polls) * 31 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostPermissions(links=");
        t.append(this.links);
        t.append(", images=");
        t.append(this.images);
        t.append(", videos=");
        t.append(this.videos);
        t.append(", text=");
        t.append(this.text);
        t.append(", spoilers=");
        t.append(this.spoilers);
        t.append(", polls=");
        t.append(this.polls);
        t.append(", predictionPolls=");
        return d.n(t, this.predictionPolls, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt((int)(this.links ? 1 : 0));
        parcel.writeInt((int)(this.images ? 1 : 0));
        parcel.writeString(this.videos.name());
        parcel.writeInt((int)(this.text ? 1 : 0));
        parcel.writeInt((int)(this.spoilers ? 1 : 0));
        parcel.writeInt((int)(this.polls ? 1 : 0));
        parcel.writeInt((int)(this.predictionPolls ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostPermissions>
    {
        public final PostPermissions createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new PostPermissions(parcel.readInt() != 0, parcel.readInt() != 0, PostPermission.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final PostPermissions[] newArray(final int n) {
            return new PostPermissions[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
