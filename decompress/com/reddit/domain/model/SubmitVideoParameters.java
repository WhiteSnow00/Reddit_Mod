// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import p1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003Jl\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010&R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b/\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u0010\rR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b2\u0010,¨\u00065" }, d2 = { "Lcom/reddit/domain/model/SubmitVideoParameters;", "Landroid/os/Parcelable;", "", "component1", "Lcom/reddit/domain/model/PostType;", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Long;", "component8", "isChatCommentsType", "postType", "subredditId", "subredditName", "title", "mediaId", "mediaDuration", "mediaType", "copy", "(ZLcom/reddit/domain/model/PostType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/reddit/domain/model/SubmitVideoParameters;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Z", "()Z", "Lcom/reddit/domain/model/PostType;", "getPostType", "()Lcom/reddit/domain/model/PostType;", "Ljava/lang/String;", "getSubredditId", "()Ljava/lang/String;", "getSubredditName", "getTitle", "getMediaId", "Ljava/lang/Long;", "getMediaDuration", "getMediaType", "<init>", "(ZLcom/reddit/domain/model/PostType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitVideoParameters implements Parcelable
{
    public static final Parcelable$Creator<SubmitVideoParameters> CREATOR;
    private final boolean isChatCommentsType;
    private final Long mediaDuration;
    private final String mediaId;
    private final String mediaType;
    private final PostType postType;
    private final String subredditId;
    private final String subredditName;
    private final String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubmitVideoParameters(final boolean isChatCommentsType, final PostType postType, final String subredditId, final String subredditName, final String title, final String mediaId, final Long mediaDuration, final String mediaType) {
        e.f((Object)postType, "postType");
        this.isChatCommentsType = isChatCommentsType;
        this.postType = postType;
        this.subredditId = subredditId;
        this.subredditName = subredditName;
        this.title = title;
        this.mediaId = mediaId;
        this.mediaDuration = mediaDuration;
        this.mediaType = mediaType;
    }
    
    public SubmitVideoParameters(final boolean b, final PostType postType, String s, String s2, String s3, String s4, Long n, String s5, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x4) != 0x0) {
            s = null;
        }
        if ((n2 & 0x8) != 0x0) {
            s2 = null;
        }
        if ((n2 & 0x10) != 0x0) {
            s3 = null;
        }
        if ((n2 & 0x20) != 0x0) {
            s4 = null;
        }
        if ((n2 & 0x40) != 0x0) {
            n = null;
        }
        if ((n2 & 0x80) != 0x0) {
            s5 = null;
        }
        this(b, postType, s, s2, s3, s4, n, s5);
    }
    
    public static SubmitVideoParameters copy$default(final SubmitVideoParameters submitVideoParameters, boolean isChatCommentsType, PostType postType, String subredditId, String subredditName, String title, String mediaId, Long mediaDuration, String mediaType, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            isChatCommentsType = submitVideoParameters.isChatCommentsType;
        }
        if ((n & 0x2) != 0x0) {
            postType = submitVideoParameters.postType;
        }
        if ((n & 0x4) != 0x0) {
            subredditId = submitVideoParameters.subredditId;
        }
        if ((n & 0x8) != 0x0) {
            subredditName = submitVideoParameters.subredditName;
        }
        if ((n & 0x10) != 0x0) {
            title = submitVideoParameters.title;
        }
        if ((n & 0x20) != 0x0) {
            mediaId = submitVideoParameters.mediaId;
        }
        if ((n & 0x40) != 0x0) {
            mediaDuration = submitVideoParameters.mediaDuration;
        }
        if ((n & 0x80) != 0x0) {
            mediaType = submitVideoParameters.mediaType;
        }
        return submitVideoParameters.copy(isChatCommentsType, postType, subredditId, subredditName, title, mediaId, mediaDuration, mediaType);
    }
    
    public final boolean component1() {
        return this.isChatCommentsType;
    }
    
    public final PostType component2() {
        return this.postType;
    }
    
    public final String component3() {
        return this.subredditId;
    }
    
    public final String component4() {
        return this.subredditName;
    }
    
    public final String component5() {
        return this.title;
    }
    
    public final String component6() {
        return this.mediaId;
    }
    
    public final Long component7() {
        return this.mediaDuration;
    }
    
    public final String component8() {
        return this.mediaType;
    }
    
    public final SubmitVideoParameters copy(final boolean b, final PostType postType, final String s, final String s2, final String s3, final String s4, final Long n, final String s5) {
        e.f((Object)postType, "postType");
        return new SubmitVideoParameters(b, postType, s, s2, s3, s4, n, s5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitVideoParameters)) {
            return false;
        }
        final SubmitVideoParameters submitVideoParameters = (SubmitVideoParameters)o;
        return this.isChatCommentsType == submitVideoParameters.isChatCommentsType && this.postType == submitVideoParameters.postType && e.a((Object)this.subredditId, (Object)submitVideoParameters.subredditId) && e.a((Object)this.subredditName, (Object)submitVideoParameters.subredditName) && e.a((Object)this.title, (Object)submitVideoParameters.title) && e.a((Object)this.mediaId, (Object)submitVideoParameters.mediaId) && e.a((Object)this.mediaDuration, (Object)submitVideoParameters.mediaDuration) && e.a((Object)this.mediaType, (Object)submitVideoParameters.mediaType);
    }
    
    public final Long getMediaDuration() {
        return this.mediaDuration;
    }
    
    public final String getMediaId() {
        return this.mediaId;
    }
    
    public final String getMediaType() {
        return this.mediaType;
    }
    
    public final PostType getPostType() {
        return this.postType;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        int isChatCommentsType;
        if ((isChatCommentsType = (this.isChatCommentsType ? 1 : 0)) != 0) {
            isChatCommentsType = 1;
        }
        final int hashCode = this.postType.hashCode();
        final String subredditId = this.subredditId;
        int hashCode2 = 0;
        int hashCode3;
        if (subredditId == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subredditId.hashCode();
        }
        final String subredditName = this.subredditName;
        int hashCode4;
        if (subredditName == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subredditName.hashCode();
        }
        final String title = this.title;
        int hashCode5;
        if (title == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = title.hashCode();
        }
        final String mediaId = this.mediaId;
        int hashCode6;
        if (mediaId == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = mediaId.hashCode();
        }
        final Long mediaDuration = this.mediaDuration;
        int hashCode7;
        if (mediaDuration == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = mediaDuration.hashCode();
        }
        final String mediaType = this.mediaType;
        if (mediaType != null) {
            hashCode2 = mediaType.hashCode();
        }
        return ((((((hashCode + isChatCommentsType * 31) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    public final boolean isChatCommentsType() {
        return this.isChatCommentsType;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SubmitVideoParameters(isChatCommentsType=");
        t.append(this.isChatCommentsType);
        t.append(", postType=");
        t.append(this.postType);
        t.append(", subredditId=");
        t.append(this.subredditId);
        t.append(", subredditName=");
        t.append(this.subredditName);
        t.append(", title=");
        t.append(this.title);
        t.append(", mediaId=");
        t.append(this.mediaId);
        t.append(", mediaDuration=");
        t.append(this.mediaDuration);
        t.append(", mediaType=");
        return h.c(t, this.mediaType, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt((int)(this.isChatCommentsType ? 1 : 0));
        parcel.writeString(this.postType.name());
        parcel.writeString(this.subredditId);
        parcel.writeString(this.subredditName);
        parcel.writeString(this.title);
        parcel.writeString(this.mediaId);
        final Long mediaDuration = this.mediaDuration;
        if (mediaDuration == null) {
            parcel.writeInt(0);
        }
        else {
            b.t(parcel, 1, mediaDuration);
        }
        parcel.writeString(this.mediaType);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubmitVideoParameters>
    {
        public final SubmitVideoParameters createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final boolean b = parcel.readInt() != 0;
            final PostType value = PostType.valueOf(parcel.readString());
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            Long value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readLong();
            }
            return new SubmitVideoParameters(b, value, string, string2, string3, string4, value2, parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final SubmitVideoParameters[] newArray(final int n) {
            return new SubmitVideoParameters[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
