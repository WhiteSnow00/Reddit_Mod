// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001<Bw\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0081\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010#\u001a\u00020\u001eH\u00d6\u0001J\u0019\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eH\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u0014\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0018\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b\u0018\u00107R\u001a\u0010\u0019\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b\u0019\u00107R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b9\u0010.¨\u0006=" }, d2 = { "Lcom/reddit/domain/model/SubmitGeneralParameters;", "Lcom/reddit/domain/model/SubmitParameters;", "Lcom/reddit/domain/model/PostType;", "component1", "", "component2", "component3", "component4", "component5", "component6", "Lcom/reddit/domain/model/DiscussionType;", "component7", "", "component8", "component9", "component10", "component11", "postType", "subreddit", "title", "content", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "postSetId", "linkId", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/PostType;", "getPostType", "()Lcom/reddit/domain/model/PostType;", "Ljava/lang/String;", "getSubreddit", "()Ljava/lang/String;", "getTitle", "getContent", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getPostSetId", "getLinkId", "<init>", "(Lcom/reddit/domain/model/PostType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Ljava/lang/String;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitGeneralParameters extends SubmitParameters
{
    public static final Parcelable$Creator<SubmitGeneralParameters> CREATOR;
    public static final SubmitGeneralParameters.SubmitGeneralParameters$Companion Companion;
    public static final String key = "SubmitGeneralParameters";
    private final String content;
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final String linkId;
    private final String postSetId;
    private final PostType postType;
    private final String subreddit;
    private final String title;
    
    static {
        Companion = new SubmitGeneralParameters.SubmitGeneralParameters$Companion((DefaultConstructorMarker)null);
        CREATOR = (Parcelable$Creator)new SubmitGeneralParameters$Creator();
    }
    
    public SubmitGeneralParameters(final PostType postType, final String subreddit, final String title, final String content, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String postSetId, final String linkId) {
        f.f((Object)postType, "postType");
        f.f((Object)subreddit, "subreddit");
        f.f((Object)title, "title");
        f.f((Object)content, "content");
        super("SubmitGeneralParameters", postType, subreddit, title, content, flairText, flairId, discussionType, isNsfw, isSpoiler, (String)null, (String)null, 3072, (DefaultConstructorMarker)null);
        this.postType = postType;
        this.subreddit = subreddit;
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
    
    public final PostType component1() {
        return this.getPostType();
    }
    
    public final String component10() {
        return this.getPostSetId();
    }
    
    public final String component11() {
        return this.getLinkId();
    }
    
    public final String component2() {
        return this.getSubreddit();
    }
    
    public final String component3() {
        return this.getTitle();
    }
    
    public final String component4() {
        return this.getContent();
    }
    
    public final String component5() {
        return this.getFlairText();
    }
    
    public final String component6() {
        return this.getFlairId();
    }
    
    public final DiscussionType component7() {
        return this.getDiscussionType();
    }
    
    public final boolean component8() {
        return this.isNsfw();
    }
    
    public final boolean component9() {
        return this.isSpoiler();
    }
    
    public final SubmitGeneralParameters copy(final PostType postType, final String s, final String s2, final String s3, final String s4, final String s5, final DiscussionType discussionType, final boolean b, final boolean b2, final String s6, final String s7) {
        f.f((Object)postType, "postType");
        f.f((Object)s, "subreddit");
        f.f((Object)s2, "title");
        f.f((Object)s3, "content");
        return new SubmitGeneralParameters(postType, s, s2, s3, s4, s5, discussionType, b, b2, s6, s7);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitGeneralParameters)) {
            return false;
        }
        final SubmitGeneralParameters submitGeneralParameters = (SubmitGeneralParameters)o;
        return this.getPostType() == submitGeneralParameters.getPostType() && f.a((Object)this.getSubreddit(), (Object)submitGeneralParameters.getSubreddit()) && f.a((Object)this.getTitle(), (Object)submitGeneralParameters.getTitle()) && f.a((Object)this.getContent(), (Object)submitGeneralParameters.getContent()) && f.a((Object)this.getFlairText(), (Object)submitGeneralParameters.getFlairText()) && f.a((Object)this.getFlairId(), (Object)submitGeneralParameters.getFlairId()) && this.getDiscussionType() == submitGeneralParameters.getDiscussionType() && this.isNsfw() == submitGeneralParameters.isNsfw() && this.isSpoiler() == submitGeneralParameters.isSpoiler() && f.a((Object)this.getPostSetId(), (Object)submitGeneralParameters.getPostSetId()) && f.a((Object)this.getLinkId(), (Object)submitGeneralParameters.getLinkId());
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
    
    public PostType getPostType() {
        return this.postType;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int hashCode() {
        final int hashCode = this.getPostType().hashCode();
        final int hashCode2 = this.getSubreddit().hashCode();
        final int hashCode3 = this.getTitle().hashCode();
        final int hashCode4 = this.getContent().hashCode();
        final String flairText = this.getFlairText();
        int hashCode5 = 0;
        int hashCode6;
        if (flairText == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getFlairText().hashCode();
        }
        int hashCode7;
        if (this.getFlairId() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getFlairId().hashCode();
        }
        int hashCode8;
        if (this.getDiscussionType() == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = this.getDiscussionType().hashCode();
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
        int hashCode9;
        if (this.getPostSetId() == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = this.getPostSetId().hashCode();
        }
        if (this.getLinkId() != null) {
            hashCode5 = this.getLinkId().hashCode();
        }
        return (((((((hashCode4 + (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + n2) * 31 + n) * 31 + hashCode9) * 31 + hashCode5;
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    public String toString() {
        final StringBuilder k = a.k("SubmitGeneralParameters(postType=");
        k.append(this.getPostType());
        k.append(", subreddit=");
        k.append(this.getSubreddit());
        k.append(", title=");
        k.append(this.getTitle());
        k.append(", content=");
        k.append(this.getContent());
        k.append(", flairText=");
        k.append(this.getFlairText());
        k.append(", flairId=");
        k.append(this.getFlairId());
        k.append(", discussionType=");
        k.append(this.getDiscussionType());
        k.append(", isNsfw=");
        k.append(this.isNsfw());
        k.append(", isSpoiler=");
        k.append(this.isSpoiler());
        k.append(", postSetId=");
        k.append(this.getPostSetId());
        k.append(", linkId=");
        k.append(this.getLinkId());
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(((Enum)this.postType).name());
        parcel.writeString(this.subreddit);
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
            parcel.writeString(discussionType.name());
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.postSetId);
        parcel.writeString(this.linkId);
    }
}
