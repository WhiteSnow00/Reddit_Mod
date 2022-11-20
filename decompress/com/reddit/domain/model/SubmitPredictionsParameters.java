// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import b5.k;
import u10.o;
import java.util.ArrayList;
import java.util.Iterator;
import p1.h;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
import aq2.a;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0003678B_\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003Ji\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b\u0014\u0010/R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b\u0015\u0010/R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b0\u0010'R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103¨\u00069" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters;", "Lcom/reddit/domain/model/SubmitParameters;", "", "component1", "component2", "component3", "component4", "Lcom/reddit/domain/model/DiscussionType;", "component5", "", "component6", "component7", "component8", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "component9", "subreddit", "title", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "subredditKindWithId", "postAction", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getSubreddit", "()Ljava/lang/String;", "getTitle", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "getSubredditKindWithId", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "getPostAction", "()Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/lang/String;Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;)V", "Companion", "PostAction", "PredictionDraft", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitPredictionsParameters extends SubmitParameters
{
    public static final Parcelable$Creator<SubmitPredictionsParameters> CREATOR;
    public static final Companion Companion;
    public static final String Key = "SubmitPredictionsParameters";
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isSpoiler;
    private final PostAction postAction;
    private final String subreddit;
    private final String subredditKindWithId;
    private final String title;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubmitPredictionsParameters(final String subreddit, final String title, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final String subredditKindWithId, final PostAction postAction) {
        e.f((Object)subreddit, "subreddit");
        e.f((Object)title, "title");
        e.f((Object)subredditKindWithId, "subredditKindWithId");
        e.f((Object)postAction, "postAction");
        super("SubmitPredictionsParameters", PostType.PREDICTION, subreddit, title, "", flairText, flairId, discussionType, isNsfw, isSpoiler, null, null, 3072, null);
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
    
    public SubmitPredictionsParameters(final String s, final String s2, String s3, String s4, DiscussionType discussionType, boolean b, boolean b2, final String s5, final PostAction postAction, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            s4 = null;
        }
        if ((n & 0x10) != 0x0) {
            discussionType = null;
        }
        if ((n & 0x20) != 0x0) {
            b = false;
        }
        if ((n & 0x40) != 0x0) {
            b2 = false;
        }
        this(s, s2, s3, s4, discussionType, b, b2, s5, postAction);
    }
    
    public static SubmitPredictionsParameters copy$default(final SubmitPredictionsParameters submitPredictionsParameters, String subreddit, String title, String flairText, String flairId, DiscussionType discussionType, boolean nsfw, boolean spoiler, String subredditKindWithId, PostAction postAction, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            subreddit = submitPredictionsParameters.getSubreddit();
        }
        if ((n & 0x2) != 0x0) {
            title = submitPredictionsParameters.getTitle();
        }
        if ((n & 0x4) != 0x0) {
            flairText = submitPredictionsParameters.getFlairText();
        }
        if ((n & 0x8) != 0x0) {
            flairId = submitPredictionsParameters.getFlairId();
        }
        if ((n & 0x10) != 0x0) {
            discussionType = submitPredictionsParameters.getDiscussionType();
        }
        if ((n & 0x20) != 0x0) {
            nsfw = submitPredictionsParameters.isNsfw();
        }
        if ((n & 0x40) != 0x0) {
            spoiler = submitPredictionsParameters.isSpoiler();
        }
        if ((n & 0x80) != 0x0) {
            subredditKindWithId = submitPredictionsParameters.subredditKindWithId;
        }
        if ((n & 0x100) != 0x0) {
            postAction = submitPredictionsParameters.postAction;
        }
        return submitPredictionsParameters.copy(subreddit, title, flairText, flairId, discussionType, nsfw, spoiler, subredditKindWithId, postAction);
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
    
    public final PostAction component9() {
        return this.postAction;
    }
    
    public final SubmitPredictionsParameters copy(final String s, final String s2, final String s3, final String s4, final DiscussionType discussionType, final boolean b, final boolean b2, final String s5, final PostAction postAction) {
        e.f((Object)s, "subreddit");
        e.f((Object)s2, "title");
        e.f((Object)s5, "subredditKindWithId");
        e.f((Object)postAction, "postAction");
        return new SubmitPredictionsParameters(s, s2, s3, s4, discussionType, b, b2, s5, postAction);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitPredictionsParameters)) {
            return false;
        }
        final SubmitPredictionsParameters submitPredictionsParameters = (SubmitPredictionsParameters)o;
        return e.a((Object)this.getSubreddit(), (Object)submitPredictionsParameters.getSubreddit()) && e.a((Object)this.getTitle(), (Object)submitPredictionsParameters.getTitle()) && e.a((Object)this.getFlairText(), (Object)submitPredictionsParameters.getFlairText()) && e.a((Object)this.getFlairId(), (Object)submitPredictionsParameters.getFlairId()) && this.getDiscussionType() == submitPredictionsParameters.getDiscussionType() && this.isNsfw() == submitPredictionsParameters.isNsfw() && this.isSpoiler() == submitPredictionsParameters.isSpoiler() && e.a((Object)this.subredditKindWithId, (Object)submitPredictionsParameters.subredditKindWithId) && e.a((Object)this.postAction, (Object)submitPredictionsParameters.postAction);
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
    
    public final PostAction getPostAction() {
        return this.postAction;
    }
    
    @Override
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    @Override
    public String getTitle() {
        return this.title;
    }
    
    @Override
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
        return this.postAction.hashCode() + a.e(this.subredditKindWithId, ((((((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3) * 31 + n2) * 31 + n) * 31, 31);
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
        final StringBuilder t = a.t("SubmitPredictionsParameters(subreddit=");
        t.append(this.getSubreddit());
        t.append(", title=");
        t.append(this.getTitle());
        t.append(", flairText=");
        t.append(this.getFlairText());
        t.append(", flairId=");
        t.append(this.getFlairId());
        t.append(", discussionType=");
        t.append(this.getDiscussionType());
        t.append(", isNsfw=");
        t.append(this.isNsfw());
        t.append(", isSpoiler=");
        t.append(this.isSpoiler());
        t.append(", subredditKindWithId=");
        t.append(this.subredditKindWithId);
        t.append(", postAction=");
        t.append(this.postAction);
        t.append(')');
        return t.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
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
            parcel.writeString(((Enum)discussionType).name());
        }
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
        parcel.writeInt((int)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.subredditKindWithId);
        parcel.writeParcelable((Parcelable)this.postAction, n);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$Companion;", "", "()V", "Key", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubmitPredictionsParameters>
    {
        public final SubmitPredictionsParameters createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
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
            return new SubmitPredictionsParameters(string, string2, string3, string4, value, b2, b, parcel.readString(), (PostAction)parcel.readParcelable(SubmitPredictionsParameters.class.getClassLoader()));
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final SubmitPredictionsParameters[] newArray(final int n) {
            return new SubmitPredictionsParameters[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "Landroid/os/Parcelable;", "()V", "CreateTournament", "PostStandalone", "PostToExistingTournament", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$CreateTournament;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$PostStandalone;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$PostToExistingTournament;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public abstract static class PostAction implements Parcelable
    {
        private PostAction() {
        }
        
        public PostAction(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        @Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J/\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$CreateTournament;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "", "component1", "", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "component2", "component3", "tournamentName", "predictionDrafts", "themeId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getTournamentName", "()Ljava/lang/String;", "Ljava/util/List;", "getPredictionDrafts", "()Ljava/util/List;", "getThemeId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class CreateTournament extends PostAction
        {
            public static final Parcelable$Creator<CreateTournament> CREATOR;
            private final List<PredictionDraft> predictionDrafts;
            private final String themeId;
            private final String tournamentName;
            
            static {
                CREATOR = (Parcelable$Creator)new Creator();
            }
            
            public CreateTournament(final String tournamentName, final List<PredictionDraft> predictionDrafts, final String themeId) {
                e.f((Object)tournamentName, "tournamentName");
                e.f((Object)predictionDrafts, "predictionDrafts");
                super(null);
                this.tournamentName = tournamentName;
                this.predictionDrafts = predictionDrafts;
                this.themeId = themeId;
            }
            
            public CreateTournament(final String s, final List list, String s2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
                if ((n & 0x4) != 0x0) {
                    s2 = null;
                }
                this(s, list, s2);
            }
            
            public static CreateTournament copy$default(final CreateTournament createTournament, String tournamentName, List predictionDrafts, String themeId, final int n, final Object o) {
                if ((n & 0x1) != 0x0) {
                    tournamentName = createTournament.tournamentName;
                }
                if ((n & 0x2) != 0x0) {
                    predictionDrafts = createTournament.predictionDrafts;
                }
                if ((n & 0x4) != 0x0) {
                    themeId = createTournament.themeId;
                }
                return createTournament.copy(tournamentName, predictionDrafts, themeId);
            }
            
            public final String component1() {
                return this.tournamentName;
            }
            
            public final List<PredictionDraft> component2() {
                return this.predictionDrafts;
            }
            
            public final String component3() {
                return this.themeId;
            }
            
            public final CreateTournament copy(final String s, final List<PredictionDraft> list, final String s2) {
                e.f((Object)s, "tournamentName");
                e.f((Object)list, "predictionDrafts");
                return new CreateTournament(s, list, s2);
            }
            
            public int describeContents() {
                return 0;
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof CreateTournament)) {
                    return false;
                }
                final CreateTournament createTournament = (CreateTournament)o;
                return e.a((Object)this.tournamentName, (Object)createTournament.tournamentName) && e.a((Object)this.predictionDrafts, (Object)createTournament.predictionDrafts) && e.a((Object)this.themeId, (Object)createTournament.themeId);
            }
            
            public final List<PredictionDraft> getPredictionDrafts() {
                return this.predictionDrafts;
            }
            
            public final String getThemeId() {
                return this.themeId;
            }
            
            public final String getTournamentName() {
                return this.tournamentName;
            }
            
            @Override
            public int hashCode() {
                final int b = ph0.a.b((List)this.predictionDrafts, this.tournamentName.hashCode() * 31, 31);
                final String themeId = this.themeId;
                int hashCode;
                if (themeId == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = themeId.hashCode();
                }
                return b + hashCode;
            }
            
            @Override
            public String toString() {
                final StringBuilder t = a.t("CreateTournament(tournamentName=");
                t.append(this.tournamentName);
                t.append(", predictionDrafts=");
                t.append(this.predictionDrafts);
                t.append(", themeId=");
                return h.c(t, this.themeId, ')');
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                e.f((Object)parcel, "out");
                parcel.writeString(this.tournamentName);
                final Iterator r = android.support.v4.media.a.r((List)this.predictionDrafts, parcel);
                while (r.hasNext()) {
                    ((PredictionDraft)r.next()).writeToParcel(parcel, n);
                }
                parcel.writeString(this.themeId);
            }
            
            @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
            public static final class Creator implements Parcelable$Creator<CreateTournament>
            {
                public final CreateTournament createFromParcel(final Parcel parcel) {
                    e.f((Object)parcel, "parcel");
                    final String string = parcel.readString();
                    final int int1 = parcel.readInt();
                    final ArrayList list = new ArrayList(int1);
                    for (int i = 0; i != int1; i = o.c((Parcelable$Creator)PredictionDraft.CREATOR, parcel, list, i, 1)) {}
                    return new CreateTournament(string, (List<PredictionDraft>)list, parcel.readString());
                }
                
                public /* bridge */ Object createFromParcel(final Parcel parcel) {
                    return this.createFromParcel(parcel);
                }
                
                public final CreateTournament[] newArray(final int n) {
                    return new CreateTournament[n];
                }
                
                public /* bridge */ Object[] newArray(final int n) {
                    return this.newArray(n);
                }
            }
        }
        
        @Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$PostStandalone;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "component1", "predictionDraft", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "getPredictionDraft", "()Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "<init>", "(Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class PostStandalone extends PostAction
        {
            public static final Parcelable$Creator<PostStandalone> CREATOR;
            private final PredictionDraft predictionDraft;
            
            static {
                CREATOR = (Parcelable$Creator)new Creator();
            }
            
            public PostStandalone(final PredictionDraft predictionDraft) {
                e.f((Object)predictionDraft, "predictionDraft");
                super(null);
                this.predictionDraft = predictionDraft;
            }
            
            public static PostStandalone copy$default(final PostStandalone postStandalone, PredictionDraft predictionDraft, final int n, final Object o) {
                if ((n & 0x1) != 0x0) {
                    predictionDraft = postStandalone.predictionDraft;
                }
                return postStandalone.copy(predictionDraft);
            }
            
            public final PredictionDraft component1() {
                return this.predictionDraft;
            }
            
            public final PostStandalone copy(final PredictionDraft predictionDraft) {
                e.f((Object)predictionDraft, "predictionDraft");
                return new PostStandalone(predictionDraft);
            }
            
            public int describeContents() {
                return 0;
            }
            
            @Override
            public boolean equals(final Object o) {
                return this == o || (o instanceof PostStandalone && e.a((Object)this.predictionDraft, (Object)((PostStandalone)o).predictionDraft));
            }
            
            public final PredictionDraft getPredictionDraft() {
                return this.predictionDraft;
            }
            
            @Override
            public int hashCode() {
                return this.predictionDraft.hashCode();
            }
            
            @Override
            public String toString() {
                final StringBuilder t = a.t("PostStandalone(predictionDraft=");
                t.append(this.predictionDraft);
                t.append(')');
                return t.toString();
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                e.f((Object)parcel, "out");
                this.predictionDraft.writeToParcel(parcel, n);
            }
            
            @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
            public static final class Creator implements Parcelable$Creator<PostStandalone>
            {
                public final PostStandalone createFromParcel(final Parcel parcel) {
                    e.f((Object)parcel, "parcel");
                    return new PostStandalone((PredictionDraft)PredictionDraft.CREATOR.createFromParcel(parcel));
                }
                
                public /* bridge */ Object createFromParcel(final Parcel parcel) {
                    return this.createFromParcel(parcel);
                }
                
                public final PostStandalone[] newArray(final int n) {
                    return new PostStandalone[n];
                }
                
                public /* bridge */ Object[] newArray(final int n) {
                    return this.newArray(n);
                }
            }
        }
        
        @Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction$PostToExistingTournament;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PostAction;", "", "component1", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "component2", "tournamentId", "predictionDraft", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getTournamentId", "()Ljava/lang/String;", "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "getPredictionDraft", "()Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class PostToExistingTournament extends PostAction
        {
            public static final Parcelable$Creator<PostToExistingTournament> CREATOR;
            private final PredictionDraft predictionDraft;
            private final String tournamentId;
            
            static {
                CREATOR = (Parcelable$Creator)new Creator();
            }
            
            public PostToExistingTournament(final String tournamentId, final PredictionDraft predictionDraft) {
                e.f((Object)tournamentId, "tournamentId");
                e.f((Object)predictionDraft, "predictionDraft");
                super(null);
                this.tournamentId = tournamentId;
                this.predictionDraft = predictionDraft;
            }
            
            public static PostToExistingTournament copy$default(final PostToExistingTournament postToExistingTournament, String tournamentId, PredictionDraft predictionDraft, final int n, final Object o) {
                if ((n & 0x1) != 0x0) {
                    tournamentId = postToExistingTournament.tournamentId;
                }
                if ((n & 0x2) != 0x0) {
                    predictionDraft = postToExistingTournament.predictionDraft;
                }
                return postToExistingTournament.copy(tournamentId, predictionDraft);
            }
            
            public final String component1() {
                return this.tournamentId;
            }
            
            public final PredictionDraft component2() {
                return this.predictionDraft;
            }
            
            public final PostToExistingTournament copy(final String s, final PredictionDraft predictionDraft) {
                e.f((Object)s, "tournamentId");
                e.f((Object)predictionDraft, "predictionDraft");
                return new PostToExistingTournament(s, predictionDraft);
            }
            
            public int describeContents() {
                return 0;
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof PostToExistingTournament)) {
                    return false;
                }
                final PostToExistingTournament postToExistingTournament = (PostToExistingTournament)o;
                return e.a((Object)this.tournamentId, (Object)postToExistingTournament.tournamentId) && e.a((Object)this.predictionDraft, (Object)postToExistingTournament.predictionDraft);
            }
            
            public final PredictionDraft getPredictionDraft() {
                return this.predictionDraft;
            }
            
            public final String getTournamentId() {
                return this.tournamentId;
            }
            
            @Override
            public int hashCode() {
                return this.predictionDraft.hashCode() + this.tournamentId.hashCode() * 31;
            }
            
            @Override
            public String toString() {
                final StringBuilder t = a.t("PostToExistingTournament(tournamentId=");
                t.append(this.tournamentId);
                t.append(", predictionDraft=");
                t.append(this.predictionDraft);
                t.append(')');
                return t.toString();
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                e.f((Object)parcel, "out");
                parcel.writeString(this.tournamentId);
                this.predictionDraft.writeToParcel(parcel, n);
            }
            
            @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
            public static final class Creator implements Parcelable$Creator<PostToExistingTournament>
            {
                public final PostToExistingTournament createFromParcel(final Parcel parcel) {
                    e.f((Object)parcel, "parcel");
                    return new PostToExistingTournament(parcel.readString(), (PredictionDraft)PredictionDraft.CREATOR.createFromParcel(parcel));
                }
                
                public /* bridge */ Object createFromParcel(final Parcel parcel) {
                    return this.createFromParcel(parcel);
                }
                
                public final PostToExistingTournament[] newArray(final int n) {
                    return new PostToExistingTournament[n];
                }
                
                public /* bridge */ Object[] newArray(final int n) {
                    return this.newArray(n);
                }
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J7\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lcom/reddit/domain/model/SubmitPredictionsParameters$PredictionDraft;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "", "component4", "title", "options", "postBody", "endTimeEpochMillis", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "getPostBody", "J", "getEndTimeEpochMillis", "()J", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;J)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class PredictionDraft implements Parcelable
    {
        public static final Parcelable$Creator<PredictionDraft> CREATOR;
        private final long endTimeEpochMillis;
        private final List<String> options;
        private final String postBody;
        private final String title;
        
        static {
            CREATOR = (Parcelable$Creator)new Creator();
        }
        
        public PredictionDraft(final String title, final List<String> options, final String postBody, final long endTimeEpochMillis) {
            e.f((Object)title, "title");
            e.f((Object)options, "options");
            e.f((Object)postBody, "postBody");
            this.title = title;
            this.options = options;
            this.postBody = postBody;
            this.endTimeEpochMillis = endTimeEpochMillis;
        }
        
        public static PredictionDraft copy$default(final PredictionDraft predictionDraft, String title, List options, String postBody, long endTimeEpochMillis, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                title = predictionDraft.title;
            }
            if ((n & 0x2) != 0x0) {
                options = predictionDraft.options;
            }
            if ((n & 0x4) != 0x0) {
                postBody = predictionDraft.postBody;
            }
            if ((n & 0x8) != 0x0) {
                endTimeEpochMillis = predictionDraft.endTimeEpochMillis;
            }
            return predictionDraft.copy(title, options, postBody, endTimeEpochMillis);
        }
        
        public final String component1() {
            return this.title;
        }
        
        public final List<String> component2() {
            return this.options;
        }
        
        public final String component3() {
            return this.postBody;
        }
        
        public final long component4() {
            return this.endTimeEpochMillis;
        }
        
        public final PredictionDraft copy(final String s, final List<String> list, final String s2, final long n) {
            e.f((Object)s, "title");
            e.f((Object)list, "options");
            e.f((Object)s2, "postBody");
            return new PredictionDraft(s, list, s2, n);
        }
        
        public int describeContents() {
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof PredictionDraft)) {
                return false;
            }
            final PredictionDraft predictionDraft = (PredictionDraft)o;
            return e.a((Object)this.title, (Object)predictionDraft.title) && e.a((Object)this.options, (Object)predictionDraft.options) && e.a((Object)this.postBody, (Object)predictionDraft.postBody) && this.endTimeEpochMillis == predictionDraft.endTimeEpochMillis;
        }
        
        public final long getEndTimeEpochMillis() {
            return this.endTimeEpochMillis;
        }
        
        public final List<String> getOptions() {
            return this.options;
        }
        
        public final String getPostBody() {
            return this.postBody;
        }
        
        public final String getTitle() {
            return this.title;
        }
        
        @Override
        public int hashCode() {
            return Long.hashCode(this.endTimeEpochMillis) + a.e(this.postBody, ph0.a.b((List)this.options, this.title.hashCode() * 31, 31), 31);
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("PredictionDraft(title=");
            t.append(this.title);
            t.append(", options=");
            t.append(this.options);
            t.append(", postBody=");
            t.append(this.postBody);
            t.append(", endTimeEpochMillis=");
            return k.k(t, this.endTimeEpochMillis, ')');
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            e.f((Object)parcel, "out");
            parcel.writeString(this.title);
            parcel.writeStringList((List)this.options);
            parcel.writeString(this.postBody);
            parcel.writeLong(this.endTimeEpochMillis);
        }
        
        @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
        public static final class Creator implements Parcelable$Creator<PredictionDraft>
        {
            public final PredictionDraft createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new PredictionDraft(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readLong());
            }
            
            public /* bridge */ Object createFromParcel(final Parcel parcel) {
                return this.createFromParcel(parcel);
            }
            
            public final PredictionDraft[] newArray(final int n) {
                return new PredictionDraft[n];
            }
            
            public /* bridge */ Object[] newArray(final int n) {
                return this.newArray(n);
            }
        }
    }
}
