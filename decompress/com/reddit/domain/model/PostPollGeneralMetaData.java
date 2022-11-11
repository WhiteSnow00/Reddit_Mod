// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;
import com.reddit.domain.model.postsubmit.PostSubmitGeneralMetaData;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b2\u00103J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jm\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0014\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b\u0014\u0010/R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b\u0015\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b0\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b1\u0010'¨\u00064" }, d2 = { "Lcom/reddit/domain/model/PostPollGeneralMetaData;", "Lcom/reddit/domain/model/postsubmit/PostSubmitGeneralMetaData;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "Lcom/reddit/domain/model/DiscussionType;", "component5", "", "component6", "component7", "component8", "component9", "title", "content", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "postSetId", "linkId", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getContent", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getPostSetId", "getLinkId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPollGeneralMetaData implements PostSubmitGeneralMetaData, Parcelable
{
    public static final Parcelable$Creator<PostPollGeneralMetaData> CREATOR;
    private final String content;
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final String linkId;
    private final String postSetId;
    private final String title;
    
    static {
        CREATOR = (Parcelable$Creator)new PostPollGeneralMetaData$Creator();
    }
    
    public PostPollGeneralMetaData(final String title, final String content, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String postSetId, final String linkId) {
        e.f((Object)title, "title");
        e.f((Object)content, "content");
        this.title = title;
        this.content = content;
        this.flairText = flairText;
        this.flairId = flairId;
        this.discussionType = discussionType;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.postSetId = postSetId;
        this.linkId = linkId;
    }
    
    public final String component1() {
        return this.getTitle();
    }
    
    public final String component2() {
        return this.getContent();
    }
    
    public final String component3() {
        return this.getFlairText();
    }
    
    public final String component4() {
        return this.getFlairId();
    }
    
    public final DiscussionType component5() {
        return this.getDiscussionType();
    }
    
    public final boolean component6() {
        return this.isNsfw();
    }
    
    public final boolean component7() {
        return this.isSpoiler();
    }
    
    public final String component8() {
        return this.getPostSetId();
    }
    
    public final String component9() {
        return this.getLinkId();
    }
    
    public final PostPollGeneralMetaData copy(final String s, final String s2, final String s3, final String s4, final DiscussionType discussionType, final boolean b, final boolean b2, final String s5, final String s6) {
        e.f((Object)s, "title");
        e.f((Object)s2, "content");
        return new PostPollGeneralMetaData(s, s2, s3, s4, discussionType, b, b2, s5, s6);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPollGeneralMetaData)) {
            return false;
        }
        final PostPollGeneralMetaData postPollGeneralMetaData = (PostPollGeneralMetaData)o;
        return e.a((Object)this.getTitle(), (Object)postPollGeneralMetaData.getTitle()) && e.a((Object)this.getContent(), (Object)postPollGeneralMetaData.getContent()) && e.a((Object)this.getFlairText(), (Object)postPollGeneralMetaData.getFlairText()) && e.a((Object)this.getFlairId(), (Object)postPollGeneralMetaData.getFlairId()) && this.getDiscussionType() == postPollGeneralMetaData.getDiscussionType() && this.isNsfw() == postPollGeneralMetaData.isNsfw() && this.isSpoiler() == postPollGeneralMetaData.isSpoiler() && e.a((Object)this.getPostSetId(), (Object)postPollGeneralMetaData.getPostSetId()) && e.a((Object)this.getLinkId(), (Object)postPollGeneralMetaData.getLinkId());
    }
    
    public String getContent() {
        return this.content;
    }
    
    public DiscussionType getDiscussionType() {
        return this.discussionType;
    }
    
    public String getFlairId() {
        return this.flairId;
    }
    
    public String getFlairText() {
        return this.flairText;
    }
    
    public String getLinkId() {
        return this.linkId;
    }
    
    public String getPostSetId() {
        return this.postSetId;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getTitle().hashCode();
        final int hashCode2 = this.getContent().hashCode();
        final String flairText = this.getFlairText();
        int hashCode3 = 0;
        int hashCode4;
        if (flairText == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = this.getFlairText().hashCode();
        }
        int hashCode5;
        if (this.getFlairId() == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = this.getFlairId().hashCode();
        }
        int hashCode6;
        if (this.getDiscussionType() == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getDiscussionType().hashCode();
        }
        final int nsfw = this.isNsfw() ? 1 : 0;
        int n = 1;
        int n2 = nsfw;
        if (nsfw != 0) {
            n2 = 1;
        }
        final int spoiler = this.isSpoiler() ? 1 : 0;
        if (spoiler == 0) {
            n = spoiler;
        }
        int hashCode7;
        if (this.getPostSetId() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getPostSetId().hashCode();
        }
        if (this.getLinkId() != null) {
            hashCode3 = this.getLinkId().hashCode();
        }
        return (((((((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n2) * 31 + n) * 31 + hashCode7) * 31 + hashCode3;
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("PostPollGeneralMetaData(title=");
        r.append(this.getTitle());
        r.append(", content=");
        r.append(this.getContent());
        r.append(", flairText=");
        r.append(this.getFlairText());
        r.append(", flairId=");
        r.append(this.getFlairId());
        r.append(", discussionType=");
        r.append(this.getDiscussionType());
        r.append(", isNsfw=");
        r.append(this.isNsfw());
        r.append(", isSpoiler=");
        r.append(this.isSpoiler());
        r.append(", postSetId=");
        r.append(this.getPostSetId());
        r.append(", linkId=");
        r.append(this.getLinkId());
        r.append(')');
        return r.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.flairText);
        parcel.writeString(this.flairId);
        final DiscussionType discussionType = this.discussionType;
        if (discussionType == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(((Enum)discussionType).name());
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.postSetId);
        parcel.writeString(this.linkId);
    }
}
