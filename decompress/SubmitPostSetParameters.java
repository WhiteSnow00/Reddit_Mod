// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import sg2.e;
import al0.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016Bq\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002�\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003Jw\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010 \u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b+\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0015\u001a\u00020\n8\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b\u0015\u00101R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b\u0016\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004�\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b3\u0010(�\u00067" }, d2 = { "Lcom/reddit/domain/model/SubmitPostSetParameters;", "Lcom/reddit/domain/model/SubmitParameters;", "", "component1", "component2", "component3", "component4", "component5", "Lcom/reddit/domain/model/DiscussionType;", "component6", "", "component7", "component8", "component9", "component10", "subreddit", "title", "content", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "postSetId", "linkId", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getSubreddit", "()Ljava/lang/String;", "getTitle", "getContent", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getPostSetId", "getLinkId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Ljava/lang/String;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitPostSetParameters extends SubmitParameters
{
    public static final Parcelable$Creator<SubmitPostSetParameters> CREATOR;
    public static final Companion Companion;
    public static final String key = "SubmitPostSetParameters";
    private final String content;
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final String linkId;
    private final String postSetId;
    private final String subreddit;
    private final String title;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubmitPostSetParameters(final String subreddit, final String title, final String content, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String postSetId, final String linkId) {
        b.q(subreddit, "subreddit", title, "title", content, "content");
        super("SubmitPostSetParameters", PostType.SELF, subreddit, title, "", null, null, null, false, false, postSetId, linkId, 992, null);
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
    
    public final String component1() {
        return this.getSubreddit();
    }
    
    public final String component10() {
        return this.getLinkId();
    }
    
    public final String component2() {
        return this.getTitle();
    }
    
    public final String component3() {
        return this.getContent();
    }
    
    public final String component4() {
        return this.getFlairText();
    }
    
    public final String component5() {
        return this.getFlairId();
    }
    
    public final DiscussionType component6() {
        return this.getDiscussionType();
    }
    
    public final boolean component7() {
        return this.isNsfw();
    }
    
    public final boolean component8() {
        return this.isSpoiler();
    }
    
    public final String component9() {
        return this.getPostSetId();
    }
    
    public final SubmitPostSetParameters copy(final String s, final String s2, final String s3, final String s4, final String s5, final DiscussionType discussionType, final boolean b, final boolean b2, final String s6, final String s7) {
        e.f((Object)s, "subreddit");
        e.f((Object)s2, "title");
        e.f((Object)s3, "content");
        return new SubmitPostSetParameters(s, s2, s3, s4, s5, discussionType, b, b2, s6, s7);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitPostSetParameters)) {
            return false;
        }
        final SubmitPostSetParameters submitPostSetParameters = (SubmitPostSetParameters)o;
        return e.a((Object)this.getSubreddit(), (Object)submitPostSetParameters.getSubreddit()) && e.a((Object)this.getTitle(), (Object)submitPostSetParameters.getTitle()) && e.a((Object)this.getContent(), (Object)submitPostSetParameters.getContent()) && e.a((Object)this.getFlairText(), (Object)submitPostSetParameters.getFlairText()) && e.a((Object)this.getFlairId(), (Object)submitPostSetParameters.getFlairId()) && this.getDiscussionType() == submitPostSetParameters.getDiscussionType() && this.isNsfw() == submitPostSetParameters.isNsfw() && this.isSpoiler() == submitPostSetParameters.isSpoiler() && e.a((Object)this.getPostSetId(), (Object)submitPostSetParameters.getPostSetId()) && e.a((Object)this.getLinkId(), (Object)submitPostSetParameters.getLinkId());
    }
    
    @Override
    public String getContent() {
        return this.content;
    }
    
    @Override
    public DiscussionType getDiscussionType() {
        return this.discussionType;
    }
    
    @Override
    public String getFlairId() {
        return this.flairId;
    }
    
    @Override
    public String getFlairText() {
        return this.flairText;
    }
    
    @Override
    public String getLinkId() {
        return this.linkId;
    }
    
    @Override
    public String getPostSetId() {
        return this.postSetId;
    }
    
    @Override
    public String getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getSubreddit().hashCode();
        final int hashCode2 = this.getTitle().hashCode();
        final int hashCode3 = this.getContent().hashCode();
        final String flairText = this.getFlairText();
        int hashCode4 = 0;
        int hashCode5;
        if (flairText == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = this.getFlairText().hashCode();
        }
        int hashCode6;
        if (this.getFlairId() == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = this.getFlairId().hashCode();
        }
        int hashCode7;
        if (this.getDiscussionType() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getDiscussionType().hashCode();
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
        int hashCode8;
        if (this.getPostSetId() == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = this.getPostSetId().hashCode();
        }
        if (this.getLinkId() != null) {
            hashCode4 = this.getLinkId().hashCode();
        }
        return (((((((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + n2) * 31 + n) * 31 + hashCode8) * 31 + hashCode4;
    }
    
    @Override
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubmitPostSetParameters(subreddit=");
        r.append(this.getSubreddit());
        r.append(", title=");
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
            parcel.writeString(((Enum)discussionType).name());
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.postSetId);
        parcel.writeString(this.linkId);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T�\u0006\u0002\n\u0000�\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/SubmitPostSetParameters$Companion;", "", "()V", "key", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubmitPostSetParameters>
    {
        public final SubmitPostSetParameters createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            DiscussionType value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = DiscussionType.valueOf(parcel.readString());
            }
            final int int1 = parcel.readInt();
            boolean b = false;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() != 0) {
                b = true;
            }
            return new SubmitPostSetParameters(string, string2, string3, string4, string5, value, b2, b, parcel.readString(), parcel.readString());
        }
        
        public final SubmitPostSetParameters[] newArray(final int n) {
            return new SubmitPostSetParameters[n];
        }
    }
}
