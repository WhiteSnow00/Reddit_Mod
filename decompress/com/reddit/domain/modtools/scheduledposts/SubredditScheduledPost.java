// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts;

import aq2.a;
import ng2.e;
import java.util.List;
import com.reddit.domain.model.MediaMetaData;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001:\u0002PQB\u00c7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d?\u0006\u0002\u0010\u001eJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u0013\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003?\u0006\u0002\u0010(J\t\u0010;\u001a\u00020\u0016H\u00c6\u0003J\t\u0010<\u001a\u00020\u0016H\u00c6\u0003J\t\u0010=\u001a\u00020\u0016H\u00c6\u0003J\t\u0010>\u001a\u00020\u0016H\u00c6\u0003J\t\u0010?\u001a\u00020\u0016H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003?\u0006\u0002\u00100J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0007H\u00c6\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00f6\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001?\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00162\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020\u0012H\u00d6\u0001J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003?\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f?\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0012?\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0011\u0010\u0017\u001a\u00020\u0016?\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010*R\u0011\u0010\u001a\u001a\u00020\u0016?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010*R\u0011\u0010\u0018\u001a\u00020\u0016?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010*R\u0011\u0010\u0019\u001a\u00020\u0016?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010*R\u0011\u0010\u0015\u001a\u00020\u0016?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010*R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t?\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001b\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011?\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d?\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\f\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003?\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011?\u0006\b\n\u0000\u001a\u0004\b6\u0010.?\u0006R" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "", "id", "", "title", "body", "contentType", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "mediaMetaData", "", "Lcom/reddit/domain/model/MediaMetaData;", "subredditId", "subredditName", "clientTimeZone", "frequency", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$Frequency;", "weekDays", "", "", "monthDays", "interval", "isSticky", "", "isDistinguishedAsMod", "isOriginalContent", "isSpoiler", "isNSFW", "username", "publishAt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$Frequency;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZZZZZLjava/lang/String;Ljava/lang/Long;)V", "getBody", "()Ljava/lang/String;", "getClientTimeZone", "getContentType", "()Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "getFrequency", "()Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$Frequency;", "getId", "getInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getMediaMetaData", "()Ljava/util/Map;", "getMonthDays", "()Ljava/util/List;", "getPublishAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubredditId", "getSubredditName", "getTitle", "getUsername", "getWeekDays", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$Frequency;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZZZZZLjava/lang/String;Ljava/lang/Long;)Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "equals", "other", "hashCode", "toString", "ContentType", "Frequency", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditScheduledPost
{
    private final String body;
    private final String clientTimeZone;
    private final ContentType contentType;
    private final Frequency frequency;
    private final String id;
    private final Integer interval;
    private final boolean isDistinguishedAsMod;
    private final boolean isNSFW;
    private final boolean isOriginalContent;
    private final boolean isSpoiler;
    private final boolean isSticky;
    private final Map<String, MediaMetaData> mediaMetaData;
    private final List<Integer> monthDays;
    private final Long publishAt;
    private final String subredditId;
    private final String subredditName;
    private final String title;
    private final String username;
    private final List<Integer> weekDays;
    
    public SubredditScheduledPost(final String id, final String title, final String body, final ContentType contentType, final Map<String, MediaMetaData> mediaMetaData, final String subredditId, final String subredditName, final String clientTimeZone, final Frequency frequency, final List<Integer> weekDays, final List<Integer> monthDays, final Integer interval, final boolean isSticky, final boolean isDistinguishedAsMod, final boolean isOriginalContent, final boolean isSpoiler, final boolean isNSFW, final String username, final Long publishAt) {
        e.f((Object)id, "id");
        e.f((Object)contentType, "contentType");
        e.f((Object)subredditId, "subredditId");
        e.f((Object)subredditName, "subredditName");
        e.f((Object)clientTimeZone, "clientTimeZone");
        e.f((Object)username, "username");
        this.id = id;
        this.title = title;
        this.body = body;
        this.contentType = contentType;
        this.mediaMetaData = mediaMetaData;
        this.subredditId = subredditId;
        this.subredditName = subredditName;
        this.clientTimeZone = clientTimeZone;
        this.frequency = frequency;
        this.weekDays = weekDays;
        this.monthDays = monthDays;
        this.interval = interval;
        this.isSticky = isSticky;
        this.isDistinguishedAsMod = isDistinguishedAsMod;
        this.isOriginalContent = isOriginalContent;
        this.isSpoiler = isSpoiler;
        this.isNSFW = isNSFW;
        this.username = username;
        this.publishAt = publishAt;
    }
    
    public static SubredditScheduledPost copy$default(final SubredditScheduledPost subredditScheduledPost, String id, String title, String body, ContentType contentType, Map mediaMetaData, String subredditId, String subredditName, String clientTimeZone, Frequency frequency, List weekDays, List monthDays, Integer interval, boolean isSticky, boolean isDistinguishedAsMod, boolean isOriginalContent, boolean isSpoiler, boolean isNSFW, String username, Long publishAt, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = subredditScheduledPost.id;
        }
        if ((n & 0x2) != 0x0) {
            title = subredditScheduledPost.title;
        }
        if ((n & 0x4) != 0x0) {
            body = subredditScheduledPost.body;
        }
        if ((n & 0x8) != 0x0) {
            contentType = subredditScheduledPost.contentType;
        }
        if ((n & 0x10) != 0x0) {
            mediaMetaData = subredditScheduledPost.mediaMetaData;
        }
        if ((n & 0x20) != 0x0) {
            subredditId = subredditScheduledPost.subredditId;
        }
        if ((n & 0x40) != 0x0) {
            subredditName = subredditScheduledPost.subredditName;
        }
        if ((n & 0x80) != 0x0) {
            clientTimeZone = subredditScheduledPost.clientTimeZone;
        }
        if ((n & 0x100) != 0x0) {
            frequency = subredditScheduledPost.frequency;
        }
        if ((n & 0x200) != 0x0) {
            weekDays = subredditScheduledPost.weekDays;
        }
        if ((n & 0x400) != 0x0) {
            monthDays = subredditScheduledPost.monthDays;
        }
        if ((n & 0x800) != 0x0) {
            interval = subredditScheduledPost.interval;
        }
        if ((n & 0x1000) != 0x0) {
            isSticky = subredditScheduledPost.isSticky;
        }
        if ((n & 0x2000) != 0x0) {
            isDistinguishedAsMod = subredditScheduledPost.isDistinguishedAsMod;
        }
        if ((n & 0x4000) != 0x0) {
            isOriginalContent = subredditScheduledPost.isOriginalContent;
        }
        if ((n & 0x8000) != 0x0) {
            isSpoiler = subredditScheduledPost.isSpoiler;
        }
        if ((n & 0x10000) != 0x0) {
            isNSFW = subredditScheduledPost.isNSFW;
        }
        if ((n & 0x20000) != 0x0) {
            username = subredditScheduledPost.username;
        }
        if ((n & 0x40000) != 0x0) {
            publishAt = subredditScheduledPost.publishAt;
        }
        return subredditScheduledPost.copy(id, title, body, contentType, mediaMetaData, subredditId, subredditName, clientTimeZone, frequency, weekDays, monthDays, interval, isSticky, isDistinguishedAsMod, isOriginalContent, isSpoiler, isNSFW, username, publishAt);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final List<Integer> component10() {
        return this.weekDays;
    }
    
    public final List<Integer> component11() {
        return this.monthDays;
    }
    
    public final Integer component12() {
        return this.interval;
    }
    
    public final boolean component13() {
        return this.isSticky;
    }
    
    public final boolean component14() {
        return this.isDistinguishedAsMod;
    }
    
    public final boolean component15() {
        return this.isOriginalContent;
    }
    
    public final boolean component16() {
        return this.isSpoiler;
    }
    
    public final boolean component17() {
        return this.isNSFW;
    }
    
    public final String component18() {
        return this.username;
    }
    
    public final Long component19() {
        return this.publishAt;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.body;
    }
    
    public final ContentType component4() {
        return this.contentType;
    }
    
    public final Map<String, MediaMetaData> component5() {
        return this.mediaMetaData;
    }
    
    public final String component6() {
        return this.subredditId;
    }
    
    public final String component7() {
        return this.subredditName;
    }
    
    public final String component8() {
        return this.clientTimeZone;
    }
    
    public final Frequency component9() {
        return this.frequency;
    }
    
    public final SubredditScheduledPost copy(final String s, final String s2, final String s3, final ContentType contentType, final Map<String, MediaMetaData> map, final String s4, final String s5, final String s6, final Frequency frequency, final List<Integer> list, final List<Integer> list2, final Integer n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final String s7, final Long n2) {
        e.f((Object)s, "id");
        e.f((Object)contentType, "contentType");
        e.f((Object)s4, "subredditId");
        e.f((Object)s5, "subredditName");
        e.f((Object)s6, "clientTimeZone");
        e.f((Object)s7, "username");
        return new SubredditScheduledPost(s, s2, s3, contentType, map, s4, s5, s6, frequency, list, list2, n, b, b2, b3, b4, b5, s7, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditScheduledPost)) {
            return false;
        }
        final SubredditScheduledPost subredditScheduledPost = (SubredditScheduledPost)o;
        return e.a((Object)this.id, (Object)subredditScheduledPost.id) && e.a((Object)this.title, (Object)subredditScheduledPost.title) && e.a((Object)this.body, (Object)subredditScheduledPost.body) && this.contentType == subredditScheduledPost.contentType && e.a((Object)this.mediaMetaData, (Object)subredditScheduledPost.mediaMetaData) && e.a((Object)this.subredditId, (Object)subredditScheduledPost.subredditId) && e.a((Object)this.subredditName, (Object)subredditScheduledPost.subredditName) && e.a((Object)this.clientTimeZone, (Object)subredditScheduledPost.clientTimeZone) && this.frequency == subredditScheduledPost.frequency && e.a((Object)this.weekDays, (Object)subredditScheduledPost.weekDays) && e.a((Object)this.monthDays, (Object)subredditScheduledPost.monthDays) && e.a((Object)this.interval, (Object)subredditScheduledPost.interval) && this.isSticky == subredditScheduledPost.isSticky && this.isDistinguishedAsMod == subredditScheduledPost.isDistinguishedAsMod && this.isOriginalContent == subredditScheduledPost.isOriginalContent && this.isSpoiler == subredditScheduledPost.isSpoiler && this.isNSFW == subredditScheduledPost.isNSFW && e.a((Object)this.username, (Object)subredditScheduledPost.username) && e.a((Object)this.publishAt, (Object)subredditScheduledPost.publishAt);
    }
    
    public final String getBody() {
        return this.body;
    }
    
    public final String getClientTimeZone() {
        return this.clientTimeZone;
    }
    
    public final ContentType getContentType() {
        return this.contentType;
    }
    
    public final Frequency getFrequency() {
        return this.frequency;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Integer getInterval() {
        return this.interval;
    }
    
    public final Map<String, MediaMetaData> getMediaMetaData() {
        return this.mediaMetaData;
    }
    
    public final List<Integer> getMonthDays() {
        return this.monthDays;
    }
    
    public final Long getPublishAt() {
        return this.publishAt;
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
    
    public final String getUsername() {
        return this.username;
    }
    
    public final List<Integer> getWeekDays() {
        return this.weekDays;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        final int n = 0;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        final String body = this.body;
        int hashCode3;
        if (body == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = body.hashCode();
        }
        final int hashCode4 = this.contentType.hashCode();
        final Map<String, MediaMetaData> mediaMetaData = this.mediaMetaData;
        int hashCode5;
        if (mediaMetaData == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = mediaMetaData.hashCode();
        }
        final int e = a.e(this.clientTimeZone, a.e(this.subredditName, a.e(this.subredditId, ((hashCode4 + ((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31) * 31 + hashCode5) * 31, 31), 31), 31);
        final Frequency frequency = this.frequency;
        int hashCode6;
        if (frequency == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = frequency.hashCode();
        }
        final List<Integer> weekDays = this.weekDays;
        int hashCode7;
        if (weekDays == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = weekDays.hashCode();
        }
        final List<Integer> monthDays = this.monthDays;
        int hashCode8;
        if (monthDays == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = monthDays.hashCode();
        }
        final Integer interval = this.interval;
        int hashCode9;
        if (interval == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = interval.hashCode();
        }
        final int isSticky = this.isSticky ? 1 : 0;
        int n2 = 1;
        int n3 = isSticky;
        if (isSticky != 0) {
            n3 = 1;
        }
        int isDistinguishedAsMod;
        if ((isDistinguishedAsMod = (this.isDistinguishedAsMod ? 1 : 0)) != 0) {
            isDistinguishedAsMod = 1;
        }
        int isOriginalContent;
        if ((isOriginalContent = (this.isOriginalContent ? 1 : 0)) != 0) {
            isOriginalContent = 1;
        }
        int isSpoiler;
        if ((isSpoiler = (this.isSpoiler ? 1 : 0)) != 0) {
            isSpoiler = 1;
        }
        final int isNSFW = this.isNSFW ? 1 : 0;
        if (isNSFW == 0) {
            n2 = isNSFW;
        }
        final int e2 = a.e(this.username, (((((((((e + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + n3) * 31 + isDistinguishedAsMod) * 31 + isOriginalContent) * 31 + isSpoiler) * 31 + n2) * 31, 31);
        final Long publishAt = this.publishAt;
        int hashCode10;
        if (publishAt == null) {
            hashCode10 = n;
        }
        else {
            hashCode10 = publishAt.hashCode();
        }
        return e2 + hashCode10;
    }
    
    public final boolean isDistinguishedAsMod() {
        return this.isDistinguishedAsMod;
    }
    
    public final boolean isNSFW() {
        return this.isNSFW;
    }
    
    public final boolean isOriginalContent() {
        return this.isOriginalContent;
    }
    
    public final boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    public final boolean isSticky() {
        return this.isSticky;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SubredditScheduledPost(id=");
        t.append(this.id);
        t.append(", title=");
        t.append(this.title);
        t.append(", body=");
        t.append(this.body);
        t.append(", contentType=");
        t.append(this.contentType);
        t.append(", mediaMetaData=");
        t.append(this.mediaMetaData);
        t.append(", subredditId=");
        t.append(this.subredditId);
        t.append(", subredditName=");
        t.append(this.subredditName);
        t.append(", clientTimeZone=");
        t.append(this.clientTimeZone);
        t.append(", frequency=");
        t.append(this.frequency);
        t.append(", weekDays=");
        t.append(this.weekDays);
        t.append(", monthDays=");
        t.append(this.monthDays);
        t.append(", interval=");
        t.append(this.interval);
        t.append(", isSticky=");
        t.append(this.isSticky);
        t.append(", isDistinguishedAsMod=");
        t.append(this.isDistinguishedAsMod);
        t.append(", isOriginalContent=");
        t.append(this.isOriginalContent);
        t.append(", isSpoiler=");
        t.append(this.isSpoiler);
        t.append(", isNSFW=");
        t.append(this.isNSFW);
        t.append(", username=");
        t.append(this.username);
        t.append(", publishAt=");
        return m5.a.i(t, this.publishAt, ')');
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004?\u0006\u0005" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$ContentType;", "", "(Ljava/lang/String;I)V", "RICH_TEXT", "TEXT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ContentType
    {
        private static final ContentType[] $VALUES;
        
        RICH_TEXT, 
        TEXT;
        
        private static final ContentType[] $values() {
            return new ContentType[] { ContentType.RICH_TEXT, ContentType.TEXT };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006?\u0006\u0007" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost$Frequency;", "", "(Ljava/lang/String;I)V", "HOURLY", "DAILY", "WEEKLY", "MONTHLY", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Frequency
    {
        private static final Frequency[] $VALUES;
        
        DAILY, 
        HOURLY, 
        MONTHLY, 
        WEEKLY;
        
        private static final Frequency[] $values() {
            return new Frequency[] { Frequency.HOURLY, Frequency.DAILY, Frequency.WEEKLY, Frequency.MONTHLY };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
