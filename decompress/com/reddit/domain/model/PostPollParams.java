// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import aq2.a;
import ng2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003¢\u0006\u0002\u0010\"J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0013H\u00c6\u0003J\t\u00101\u001a\u00020\u0013H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0013H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003¢\u0006\u0002\u0010\u001fJº\u0001\u0010<\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u0013H\u00c6\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\rH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006B" }, d2 = { "Lcom/reddit/domain/model/PostPollParams;", "", "subreddit", "", "title", "text", "apiType", "resubmit", "validateOnSubmit", "showErrorList", "pollOptions", "", "pollDurationDays", "", "pollEndTimestampSeconds", "", "flairId", "flairText", "isNsfw", "", "isSpoiler", "discussionType", "isPredictionPoll", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "getApiType", "()Ljava/lang/String;", "getDiscussionType", "getFlairId", "getFlairText", "()Z", "getPollDurationDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPollEndTimestampSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPollOptions", "()Ljava/util/List;", "getResubmit", "getShowErrorList", "getSubreddit", "getText", "getTitle", "getValidateOnSubmit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)Lcom/reddit/domain/model/PostPollParams;", "equals", "other", "hashCode", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class PostPollParams
{
    private final String apiType;
    private final String discussionType;
    private final String flairId;
    private final String flairText;
    private final boolean isNsfw;
    private final boolean isPredictionPoll;
    private final boolean isSpoiler;
    private final Integer pollDurationDays;
    private final Long pollEndTimestampSeconds;
    private final List<String> pollOptions;
    private final String resubmit;
    private final String showErrorList;
    private final String subreddit;
    private final String text;
    private final String title;
    private final String validateOnSubmit;
    
    public PostPollParams(@n(name = "sr") final String subreddit, final String title, final String text, @n(name = "api_type") final String apiType, final String resubmit, @n(name = "validate_on_submit") final String validateOnSubmit, @n(name = "show_error_list") final String showErrorList, @n(name = "options") final List<String> pollOptions, @n(name = "duration") final Integer pollDurationDays, @n(name = "end_timestamp") final Long pollEndTimestampSeconds, @n(name = "flair_id") final String flairId, @n(name = "flair_text") final String flairText, @n(name = "nsfw") final boolean isNsfw, @n(name = "spoiler") final boolean isSpoiler, @n(name = "discussion_type") final String discussionType, @n(name = "prediction") final boolean isPredictionPoll) {
        e.f((Object)subreddit, "subreddit");
        e.f((Object)title, "title");
        e.f((Object)text, "text");
        e.f((Object)apiType, "apiType");
        e.f((Object)resubmit, "resubmit");
        e.f((Object)validateOnSubmit, "validateOnSubmit");
        e.f((Object)showErrorList, "showErrorList");
        e.f((Object)pollOptions, "pollOptions");
        e.f((Object)flairId, "flairId");
        e.f((Object)flairText, "flairText");
        this.subreddit = subreddit;
        this.title = title;
        this.text = text;
        this.apiType = apiType;
        this.resubmit = resubmit;
        this.validateOnSubmit = validateOnSubmit;
        this.showErrorList = showErrorList;
        this.pollOptions = pollOptions;
        this.pollDurationDays = pollDurationDays;
        this.pollEndTimestampSeconds = pollEndTimestampSeconds;
        this.flairId = flairId;
        this.flairText = flairText;
        this.isNsfw = isNsfw;
        this.isSpoiler = isSpoiler;
        this.discussionType = discussionType;
        this.isPredictionPoll = isPredictionPoll;
    }
    
    public static PostPollParams copy$default(final PostPollParams postPollParams, String subreddit, String title, String text, String apiType, String resubmit, String validateOnSubmit, String showErrorList, List pollOptions, Integer pollDurationDays, Long pollEndTimestampSeconds, String flairId, String flairText, boolean isNsfw, boolean isSpoiler, String discussionType, boolean isPredictionPoll, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            subreddit = postPollParams.subreddit;
        }
        if ((n & 0x2) != 0x0) {
            title = postPollParams.title;
        }
        if ((n & 0x4) != 0x0) {
            text = postPollParams.text;
        }
        if ((n & 0x8) != 0x0) {
            apiType = postPollParams.apiType;
        }
        if ((n & 0x10) != 0x0) {
            resubmit = postPollParams.resubmit;
        }
        if ((n & 0x20) != 0x0) {
            validateOnSubmit = postPollParams.validateOnSubmit;
        }
        if ((n & 0x40) != 0x0) {
            showErrorList = postPollParams.showErrorList;
        }
        if ((n & 0x80) != 0x0) {
            pollOptions = postPollParams.pollOptions;
        }
        if ((n & 0x100) != 0x0) {
            pollDurationDays = postPollParams.pollDurationDays;
        }
        if ((n & 0x200) != 0x0) {
            pollEndTimestampSeconds = postPollParams.pollEndTimestampSeconds;
        }
        if ((n & 0x400) != 0x0) {
            flairId = postPollParams.flairId;
        }
        if ((n & 0x800) != 0x0) {
            flairText = postPollParams.flairText;
        }
        if ((n & 0x1000) != 0x0) {
            isNsfw = postPollParams.isNsfw;
        }
        if ((n & 0x2000) != 0x0) {
            isSpoiler = postPollParams.isSpoiler;
        }
        if ((n & 0x4000) != 0x0) {
            discussionType = postPollParams.discussionType;
        }
        if ((n & 0x8000) != 0x0) {
            isPredictionPoll = postPollParams.isPredictionPoll;
        }
        return postPollParams.copy(subreddit, title, text, apiType, resubmit, validateOnSubmit, showErrorList, pollOptions, pollDurationDays, pollEndTimestampSeconds, flairId, flairText, isNsfw, isSpoiler, discussionType, isPredictionPoll);
    }
    
    public final String component1() {
        return this.subreddit;
    }
    
    public final Long component10() {
        return this.pollEndTimestampSeconds;
    }
    
    public final String component11() {
        return this.flairId;
    }
    
    public final String component12() {
        return this.flairText;
    }
    
    public final boolean component13() {
        return this.isNsfw;
    }
    
    public final boolean component14() {
        return this.isSpoiler;
    }
    
    public final String component15() {
        return this.discussionType;
    }
    
    public final boolean component16() {
        return this.isPredictionPoll;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.text;
    }
    
    public final String component4() {
        return this.apiType;
    }
    
    public final String component5() {
        return this.resubmit;
    }
    
    public final String component6() {
        return this.validateOnSubmit;
    }
    
    public final String component7() {
        return this.showErrorList;
    }
    
    public final List<String> component8() {
        return this.pollOptions;
    }
    
    public final Integer component9() {
        return this.pollDurationDays;
    }
    
    public final PostPollParams copy(@n(name = "sr") final String s, final String s2, final String s3, @n(name = "api_type") final String s4, final String s5, @n(name = "validate_on_submit") final String s6, @n(name = "show_error_list") final String s7, @n(name = "options") final List<String> list, @n(name = "duration") final Integer n, @n(name = "end_timestamp") final Long n2, @n(name = "flair_id") final String s8, @n(name = "flair_text") final String s9, @n(name = "nsfw") final boolean b, @n(name = "spoiler") final boolean b2, @n(name = "discussion_type") final String s10, @n(name = "prediction") final boolean b3) {
        e.f((Object)s, "subreddit");
        e.f((Object)s2, "title");
        e.f((Object)s3, "text");
        e.f((Object)s4, "apiType");
        e.f((Object)s5, "resubmit");
        e.f((Object)s6, "validateOnSubmit");
        e.f((Object)s7, "showErrorList");
        e.f((Object)list, "pollOptions");
        e.f((Object)s8, "flairId");
        e.f((Object)s9, "flairText");
        return new PostPollParams(s, s2, s3, s4, s5, s6, s7, list, n, n2, s8, s9, b, b2, s10, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPollParams)) {
            return false;
        }
        final PostPollParams postPollParams = (PostPollParams)o;
        return e.a((Object)this.subreddit, (Object)postPollParams.subreddit) && e.a((Object)this.title, (Object)postPollParams.title) && e.a((Object)this.text, (Object)postPollParams.text) && e.a((Object)this.apiType, (Object)postPollParams.apiType) && e.a((Object)this.resubmit, (Object)postPollParams.resubmit) && e.a((Object)this.validateOnSubmit, (Object)postPollParams.validateOnSubmit) && e.a((Object)this.showErrorList, (Object)postPollParams.showErrorList) && e.a((Object)this.pollOptions, (Object)postPollParams.pollOptions) && e.a((Object)this.pollDurationDays, (Object)postPollParams.pollDurationDays) && e.a((Object)this.pollEndTimestampSeconds, (Object)postPollParams.pollEndTimestampSeconds) && e.a((Object)this.flairId, (Object)postPollParams.flairId) && e.a((Object)this.flairText, (Object)postPollParams.flairText) && this.isNsfw == postPollParams.isNsfw && this.isSpoiler == postPollParams.isSpoiler && e.a((Object)this.discussionType, (Object)postPollParams.discussionType) && this.isPredictionPoll == postPollParams.isPredictionPoll;
    }
    
    public final String getApiType() {
        return this.apiType;
    }
    
    public final String getDiscussionType() {
        return this.discussionType;
    }
    
    public final String getFlairId() {
        return this.flairId;
    }
    
    public final String getFlairText() {
        return this.flairText;
    }
    
    public final Integer getPollDurationDays() {
        return this.pollDurationDays;
    }
    
    public final Long getPollEndTimestampSeconds() {
        return this.pollEndTimestampSeconds;
    }
    
    public final List<String> getPollOptions() {
        return this.pollOptions;
    }
    
    public final String getResubmit() {
        return this.resubmit;
    }
    
    public final String getShowErrorList() {
        return this.showErrorList;
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getValidateOnSubmit() {
        return this.validateOnSubmit;
    }
    
    @Override
    public int hashCode() {
        final int b = ph0.a.b((List)this.pollOptions, a.e(this.showErrorList, a.e(this.validateOnSubmit, a.e(this.resubmit, a.e(this.apiType, a.e(this.text, a.e(this.title, this.subreddit.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        final Integer pollDurationDays = this.pollDurationDays;
        int hashCode = 0;
        int hashCode2;
        if (pollDurationDays == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = pollDurationDays.hashCode();
        }
        final Long pollEndTimestampSeconds = this.pollEndTimestampSeconds;
        int hashCode3;
        if (pollEndTimestampSeconds == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = pollEndTimestampSeconds.hashCode();
        }
        final int e = a.e(this.flairText, a.e(this.flairId, ((b + hashCode2) * 31 + hashCode3) * 31, 31), 31);
        final int isNsfw = this.isNsfw ? 1 : 0;
        int n = 1;
        int n2 = isNsfw;
        if (isNsfw != 0) {
            n2 = 1;
        }
        int isSpoiler;
        if ((isSpoiler = (this.isSpoiler ? 1 : 0)) != 0) {
            isSpoiler = 1;
        }
        final String discussionType = this.discussionType;
        if (discussionType != null) {
            hashCode = discussionType.hashCode();
        }
        final int isPredictionPoll = this.isPredictionPoll ? 1 : 0;
        if (isPredictionPoll == 0) {
            n = isPredictionPoll;
        }
        return (((e + n2) * 31 + isSpoiler) * 31 + hashCode) * 31 + n;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isPredictionPoll() {
        return this.isPredictionPoll;
    }
    
    public final boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostPollParams(subreddit=");
        t.append(this.subreddit);
        t.append(", title=");
        t.append(this.title);
        t.append(", text=");
        t.append(this.text);
        t.append(", apiType=");
        t.append(this.apiType);
        t.append(", resubmit=");
        t.append(this.resubmit);
        t.append(", validateOnSubmit=");
        t.append(this.validateOnSubmit);
        t.append(", showErrorList=");
        t.append(this.showErrorList);
        t.append(", pollOptions=");
        t.append(this.pollOptions);
        t.append(", pollDurationDays=");
        t.append(this.pollDurationDays);
        t.append(", pollEndTimestampSeconds=");
        t.append(this.pollEndTimestampSeconds);
        t.append(", flairId=");
        t.append(this.flairId);
        t.append(", flairText=");
        t.append(this.flairText);
        t.append(", isNsfw=");
        t.append(this.isNsfw);
        t.append(", isSpoiler=");
        t.append(this.isSpoiler);
        t.append(", discussionType=");
        t.append(this.discussionType);
        t.append(", isPredictionPoll=");
        return d.n(t, this.isPredictionPoll, ')');
    }
}
