// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcelable;
import android.os.Parcel;
import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0003678B_\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003Ji\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b\u0014\u0010/R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b\u0015\u0010/R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b0\u0010'R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103¨\u00069" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters;", "Lcom/reddit/domain/model/SubmitParameters;", "", "component1", "component2", "component3", "component4", "Lcom/reddit/domain/model/DiscussionType;", "component5", "", "component6", "component7", "component8", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "component9", "subreddit", "title", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "subredditKindWithId", "postAction", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getSubreddit", "()Ljava/lang/String;", "getTitle", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getSubredditKindWithId", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "getPostAction", "()Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;)V", "Companion", "PostAction", "PredictionDraft", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitPredictionsParameters extends SubmitParameters
{
    public static final Parcelable$Creator<SubmitPredictionsParameters> CREATOR;
    public static final SubmitPredictionsParameters.SubmitPredictionsParameters$Companion Companion;
    public static final String Key = "SubmitPredictionsParameters";
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final SubmitPredictionsParameters.SubmitPredictionsParameters$PostAction postAction;
    private final String subreddit;
    private final String subredditKindWithId;
    private final String title;
    
    static {
        Companion = new SubmitPredictionsParameters.SubmitPredictionsParameters$Companion((DefaultConstructorMarker)null);
        CREATOR = (Parcelable$Creator)new SubmitPredictionsParameters$Creator();
    }
    
    public SubmitPredictionsParameters(final String subreddit, final String title, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String subredditKindWithId, final SubmitPredictionsParameters.SubmitPredictionsParameters$PostAction postAction) {
        f.f((Object)subreddit, "subreddit");
        f.f((Object)title, "title");
        f.f((Object)subredditKindWithId, "subredditKindWithId");
        f.f((Object)postAction, "postAction");
        super("SubmitPredictionsParameters", PostType.PREDICTION, subreddit, title, "", flairText, flairId, discussionType, isNsfw, isSpoiler, (String)null, (String)null, 3072, (DefaultConstructorMarker)null);
        this.subreddit = subreddit;
        this.title = title;
        this.flairText = flairText;
        this.flairId = flairId;
        this.discussionType = discussionType;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.subredditKindWithId = subredditKindWithId;
        this.postAction = postAction;
    }
    
    public final String component1() {
        return this.getSubreddit();
    }
    
    public final String component2() {
        return this.getTitle();
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
        return this.subredditKindWithId;
    }
    
    public final SubmitPredictionsParameters.SubmitPredictionsParameters$PostAction component9() {
        return this.postAction;
    }
    
    public final SubmitPredictionsParameters copy(final String s, final String s2, final String s3, final String s4, final DiscussionType discussionType, final boolean b, final boolean b2, final String s5, final SubmitPredictionsParameters.SubmitPredictionsParameters$PostAction submitPredictionsParameters$PostAction) {
        f.f((Object)s, "subreddit");
        f.f((Object)s2, "title");
        f.f((Object)s5, "subredditKindWithId");
        f.f((Object)submitPredictionsParameters$PostAction, "postAction");
        return new SubmitPredictionsParameters(s, s2, s3, s4, discussionType, b, b2, s5, submitPredictionsParameters$PostAction);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitPredictionsParameters)) {
            return false;
        }
        final SubmitPredictionsParameters submitPredictionsParameters = (SubmitPredictionsParameters)o;
        return f.a((Object)this.getSubreddit(), (Object)submitPredictionsParameters.getSubreddit()) && f.a((Object)this.getTitle(), (Object)submitPredictionsParameters.getTitle()) && f.a((Object)this.getFlairText(), (Object)submitPredictionsParameters.getFlairText()) && f.a((Object)this.getFlairId(), (Object)submitPredictionsParameters.getFlairId()) && this.getDiscussionType() == submitPredictionsParameters.getDiscussionType() && this.isNsfw() == submitPredictionsParameters.isNsfw() && this.isSpoiler() == submitPredictionsParameters.isSpoiler() && f.a((Object)this.subredditKindWithId, (Object)submitPredictionsParameters.subredditKindWithId) && f.a((Object)this.postAction, (Object)submitPredictionsParameters.postAction);
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
    
    public final SubmitPredictionsParameters.SubmitPredictionsParameters$PostAction getPostAction() {
        return this.postAction;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int hashCode() {
        final int hashCode = this.getSubreddit().hashCode();
        final int hashCode2 = this.getTitle().hashCode();
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
        if (this.getDiscussionType() != null) {
            hashCode3 = this.getDiscussionType().hashCode();
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
        return this.postAction.hashCode() + a.f(this.subredditKindWithId, ((((((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3) * 31 + n2) * 31 + n) * 31, 31);
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    public String toString() {
        final StringBuilder k = a.k("SubmitPredictionsParameters(subreddit=");
        k.append(this.getSubreddit());
        k.append(", title=");
        k.append(this.getTitle());
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
        k.append(", subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", postAction=");
        k.append(this.postAction);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.subreddit);
        parcel.writeString(this.title);
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
        parcel.writeString(this.subredditKindWithId);
        parcel.writeParcelable((Parcelable)this.postAction, n);
    }
}
