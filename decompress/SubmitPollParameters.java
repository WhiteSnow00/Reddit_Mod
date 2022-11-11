// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import al0.f0;
import android.os.Parcel;
import aw.b;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB\u007f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\nH\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0096\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012H\u00c6\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002H\u00d6\u0001J\t\u0010$\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010(\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000fH\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b3\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b4\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b\u001b\u00109R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b\u001c\u00109R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u001e\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b\u001f\u00109R\u0019\u0010 \u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\bA\u0010\u0014¨\u0006E" }, d2 = { "Lcom/reddit/domain/model/SubmitPollParameters;", "Lcom/reddit/domain/model/SubmitParameters;", "", "component1", "component2", "component3", "component4", "component5", "Lcom/reddit/domain/model/DiscussionType;", "component6", "", "component7", "component8", "", "component9", "", "component10", "component11", "", "component12", "()Ljava/lang/Long;", "subreddit", "title", "content", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "pollOptions", "pollDurationDays", "isPredictionPoll", "pollEndTimestampSeconds", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/util/List;IZLjava/lang/Long;)Lcom/reddit/domain/model/SubmitPollParameters;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getSubreddit", "()Ljava/lang/String;", "getTitle", "getContent", "getFlairText", "getFlairId", "Lcom/reddit/domain/model/DiscussionType;", "getDiscussionType", "()Lcom/reddit/domain/model/DiscussionType;", "Z", "()Z", "Ljava/util/List;", "getPollOptions", "()Ljava/util/List;", "I", "getPollDurationDays", "()I", "Ljava/lang/Long;", "getPollEndTimestampSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/DiscussionType;ZZLjava/util/List;IZLjava/lang/Long;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitPollParameters extends SubmitParameters
{
    public static final Parcelable$Creator<SubmitPollParameters> CREATOR;
    public static final Companion Companion;
    public static final String key = "SubmitPollParameters";
    private final String content;
    private final DiscussionType discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isPredictionPoll;
    private final boolean isSpoiler;
    private final int pollDurationDays;
    private final Long pollEndTimestampSeconds;
    private final List<String> pollOptions;
    private final String subreddit;
    private final String title;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubmitPollParameters(final String subreddit, final String title, final String content, final String flairText, final String flairId, final DiscussionType discussionType, final boolean isNsfw, final boolean isSpoiler, final List<String> pollOptions, final int pollDurationDays, final boolean isPredictionPoll, final Long pollEndTimestampSeconds) {
        e.f((Object)subreddit, "subreddit");
        e.f((Object)title, "title");
        e.f((Object)content, "content");
        e.f((Object)pollOptions, "pollOptions");
        super("SubmitPollParameters", PostType.POLL, subreddit, title, content, flairText, flairId, discussionType, isNsfw, isSpoiler, null, null, 3072, null);
        this.subreddit = subreddit;
        this.title = title;
        this.content = content;
        this.flairText = flairText;
        this.flairId = flairId;
        this.discussionType = discussionType;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.pollOptions = pollOptions;
        this.pollDurationDays = pollDurationDays;
        this.isPredictionPoll = isPredictionPoll;
        this.pollEndTimestampSeconds = pollEndTimestampSeconds;
    }
    
    public final String component1() {
        return this.getSubreddit();
    }
    
    public final int component10() {
        return this.pollDurationDays;
    }
    
    public final boolean component11() {
        return this.isPredictionPoll;
    }
    
    public final Long component12() {
        return this.pollEndTimestampSeconds;
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
    
    public final List<String> component9() {
        return this.pollOptions;
    }
    
    public final SubmitPollParameters copy(final String s, final String s2, final String s3, final String s4, final String s5, final DiscussionType discussionType, final boolean b, final boolean b2, final List<String> list, final int n, final boolean b3, final Long n2) {
        e.f((Object)s, "subreddit");
        e.f((Object)s2, "title");
        e.f((Object)s3, "content");
        e.f((Object)list, "pollOptions");
        return new SubmitPollParameters(s, s2, s3, s4, s5, discussionType, b, b2, list, n, b3, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitPollParameters)) {
            return false;
        }
        final SubmitPollParameters submitPollParameters = (SubmitPollParameters)o;
        return e.a((Object)this.getSubreddit(), (Object)submitPollParameters.getSubreddit()) && e.a((Object)this.getTitle(), (Object)submitPollParameters.getTitle()) && e.a((Object)this.getContent(), (Object)submitPollParameters.getContent()) && e.a((Object)this.getFlairText(), (Object)submitPollParameters.getFlairText()) && e.a((Object)this.getFlairId(), (Object)submitPollParameters.getFlairId()) && this.getDiscussionType() == submitPollParameters.getDiscussionType() && this.isNsfw() == submitPollParameters.isNsfw() && this.isSpoiler() == submitPollParameters.isSpoiler() && e.a((Object)this.pollOptions, (Object)submitPollParameters.pollOptions) && this.pollDurationDays == submitPollParameters.pollDurationDays && this.isPredictionPoll == submitPollParameters.isPredictionPoll && e.a((Object)this.pollEndTimestampSeconds, (Object)submitPollParameters.pollEndTimestampSeconds);
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
    
    public final int getPollDurationDays() {
        return this.pollDurationDays;
    }
    
    public final Long getPollEndTimestampSeconds() {
        return this.pollEndTimestampSeconds;
    }
    
    public final List<String> getPollOptions() {
        return this.pollOptions;
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
        final int n = 0;
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
        final int n2 = 1;
        int n3 = nsfw;
        if (nsfw != 0) {
            n3 = 1;
        }
        int spoiler;
        if ((spoiler = (this.isSpoiler() ? 1 : 0)) != 0) {
            spoiler = 1;
        }
        final int c = a.c(this.pollDurationDays, b.c((List)this.pollOptions, ((((((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n3) * 31 + spoiler) * 31, 31), 31);
        int isPredictionPoll = this.isPredictionPoll ? 1 : 0;
        if (isPredictionPoll != 0) {
            isPredictionPoll = n2;
        }
        final Long pollEndTimestampSeconds = this.pollEndTimestampSeconds;
        int hashCode7;
        if (pollEndTimestampSeconds == null) {
            hashCode7 = n;
        }
        else {
            hashCode7 = pollEndTimestampSeconds.hashCode();
        }
        return (c + isPredictionPoll) * 31 + hashCode7;
    }
    
    @Override
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isPredictionPoll() {
        return this.isPredictionPoll;
    }
    
    @Override
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubmitPollParameters(subreddit=");
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
        r.append(", pollOptions=");
        r.append(this.pollOptions);
        r.append(", pollDurationDays=");
        r.append(this.pollDurationDays);
        r.append(", isPredictionPoll=");
        r.append(this.isPredictionPoll);
        r.append(", pollEndTimestampSeconds=");
        return a.l(r, this.pollEndTimestampSeconds, ')');
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
        parcel.writeStringList((List)this.pollOptions);
        parcel.writeInt(this.pollDurationDays);
        parcel.writeInt((int)(this.isPredictionPoll ? 1 : 0));
        final Long pollEndTimestampSeconds = this.pollEndTimestampSeconds;
        if (pollEndTimestampSeconds == null) {
            parcel.writeInt(0);
        }
        else {
            f0.w(parcel, 1, pollEndTimestampSeconds);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/SubmitPollParameters$Companion;", "", "()V", "key", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubmitPollParameters>
    {
        public final SubmitPollParameters createFromParcel(final Parcel parcel) {
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
            final boolean b = parcel.readInt() != 0;
            final boolean b2 = parcel.readInt() != 0;
            final ArrayList stringArrayList = parcel.createStringArrayList();
            final int int1 = parcel.readInt();
            final boolean b3 = parcel.readInt() != 0;
            Long value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readLong();
            }
            return new SubmitPollParameters(string, string2, string3, string4, string5, value, b, b2, stringArrayList, int1, b3, value2);
        }
        
        public final SubmitPollParameters[] newArray(final int n) {
            return new SubmitPollParameters[n];
        }
    }
}
