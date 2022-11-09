// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ak0.m;
import ag0.a;
import com.sendbird.android.BaseMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import com.sendbird.android.t4;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0001\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u000b\u0012\b\b\u0002\u00101\u001a\u00020\u0018\u0012\b\b\u0002\u00102\u001a\u00020\u000b\u0012\b\b\u0002\u00103\u001a\u00020\u000b\u0012\b\b\u0002\u00104\u001a\u00020\u000b\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\bf\u0010gJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0007H\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0018H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u00c6\u0003J\u00f8\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u00c6\u0001¢\u0006\u0004\b7\u00108J\t\u00109\u001a\u00020\u0007H\u00d6\u0001J\t\u0010;\u001a\u00020:H\u00d6\u0001J\u0013\u0010>\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010<H\u00d6\u0003R\u001a\u0010!\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010?\u001a\u0004\b@\u0010AR\"\u0010\"\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010#\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\bG\u0010DR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010%\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\bK\u0010JR\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010H\u001a\u0004\bL\u0010JR\u0019\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010M\u001a\u0004\bN\u0010\rR\u0019\u0010(\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010H\u001a\u0004\bO\u0010JR\u0017\u0010)\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010H\u001a\u0004\bP\u0010JR\u0017\u0010*\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010Q\u001a\u0004\b*\u0010RR$\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0017\u0010,\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010Q\u001a\u0004\b,\u0010RR\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010H\u001a\u0004\bX\u0010JR\u0017\u0010.\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010H\u001a\u0004\bY\u0010JR\u0017\u0010/\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010H\u001a\u0004\bZ\u0010JR\u0017\u00100\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010Q\u001a\u0004\b0\u0010RR\u0017\u00101\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b1\u0010[\u001a\u0004\b\\\u0010]R\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010Q\u001a\u0004\b2\u0010R\"\u0004\b^\u0010_R\u0017\u00103\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010Q\u001a\u0004\b`\u0010RR\u0017\u00104\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010Q\u001a\u0004\ba\u0010RR\u0017\u00105\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010Q\u001a\u0004\bb\u0010RR\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b6\u0010c\u001a\u0004\bd\u0010e¨\u0006h" }, d2 = { "Lcom/reddit/domain/chat/model/UserMessageUiModel;", "Lcom/reddit/domain/chat/model/MessageData;", "Lcom/sendbird/android/t4;", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "Lcom/reddit/domain/chat/model/SentStatus;", "component11", "component12", "component13", "component14", "component15", "component16", "Lcom/reddit/domain/chat/model/PotentiallyOffensive;", "component17", "component18", "component19", "component20", "component21", "", "Lcom/reddit/domain/chat/model/ReactionUiModel;", "component22", "message", "messageId", "timestamp", "requestId", "authorUserId", "author", "authorIsNsfw", "profileUrl", "age", "isRead", "sentStatus", "isSelf", "channelUrl", "customType", "customData", "isHackIsPost", "offensive", "isUserBlockedByMe", "useNoPaddings", "showDate", "showDetails", "reactions", "copy", "(Lcom/sendbird/android/t4;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/SentStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/PotentiallyOffensive;ZZZZLjava/util/List;)Lcom/reddit/domain/chat/model/UserMessageUiModel;", "toString", "", "hashCode", "", "other", "equals", "Lcom/sendbird/android/t4;", "getMessage", "()Lcom/sendbird/android/t4;", "J", "getMessageId", "()J", "setMessageId", "(J)V", "getTimestamp", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getAuthorUserId", "getAuthor", "Ljava/lang/Boolean;", "getAuthorIsNsfw", "getProfileUrl", "getAge", "Z", "()Z", "Lcom/reddit/domain/chat/model/SentStatus;", "getSentStatus", "()Lcom/reddit/domain/chat/model/SentStatus;", "setSentStatus", "(Lcom/reddit/domain/chat/model/SentStatus;)V", "getChannelUrl", "getCustomType", "getCustomData", "Lcom/reddit/domain/chat/model/PotentiallyOffensive;", "getOffensive", "()Lcom/reddit/domain/chat/model/PotentiallyOffensive;", "setUserBlockedByMe", "(Z)V", "getUseNoPaddings", "getShowDate", "getShowDetails", "Ljava/util/List;", "getReactions", "()Ljava/util/List;", "<init>", "(Lcom/sendbird/android/t4;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/SentStatus;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/domain/chat/model/PotentiallyOffensive;ZZZZLjava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserMessageUiModel implements MessageData
{
    private final String age;
    private final String author;
    private final Boolean authorIsNsfw;
    private final String authorUserId;
    private final String channelUrl;
    private final String customData;
    private final String customType;
    private final boolean isHackIsPost;
    private final boolean isRead;
    private final boolean isSelf;
    private boolean isUserBlockedByMe;
    private final t4 message;
    private long messageId;
    private final PotentiallyOffensive offensive;
    private final String profileUrl;
    private final List<ReactionUiModel> reactions;
    private final String requestId;
    private SentStatus sentStatus;
    private final boolean showDate;
    private final boolean showDetails;
    private final long timestamp;
    private final boolean useNoPaddings;
    
    public UserMessageUiModel(final t4 message, final long messageId, final long timestamp, final String requestId, final String authorUserId, final String author, final Boolean authorIsNsfw, final String profileUrl, final String age, final boolean isRead, final SentStatus sentStatus, final boolean isSelf, final String channelUrl, final String customType, final String customData, final boolean isHackIsPost, final PotentiallyOffensive offensive, final boolean isUserBlockedByMe, final boolean useNoPaddings, final boolean showDate, final boolean showDetails, final List<ReactionUiModel> reactions) {
        f.f((Object)message, "message");
        f.f((Object)requestId, "requestId");
        f.f((Object)authorUserId, "authorUserId");
        f.f((Object)author, "author");
        f.f((Object)age, "age");
        f.f((Object)channelUrl, "channelUrl");
        f.f((Object)customType, "customType");
        f.f((Object)customData, "customData");
        f.f((Object)offensive, "offensive");
        f.f((Object)reactions, "reactions");
        this.message = message;
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.requestId = requestId;
        this.authorUserId = authorUserId;
        this.author = author;
        this.authorIsNsfw = authorIsNsfw;
        this.profileUrl = profileUrl;
        this.age = age;
        this.isRead = isRead;
        this.sentStatus = sentStatus;
        this.isSelf = isSelf;
        this.channelUrl = channelUrl;
        this.customType = customType;
        this.customData = customData;
        this.isHackIsPost = isHackIsPost;
        this.offensive = offensive;
        this.isUserBlockedByMe = isUserBlockedByMe;
        this.useNoPaddings = useNoPaddings;
        this.showDate = showDate;
        this.showDetails = showDetails;
        this.reactions = reactions;
    }
    
    public final t4 component1() {
        return this.getMessage();
    }
    
    public final boolean component10() {
        return this.isRead;
    }
    
    public final SentStatus component11() {
        return this.sentStatus;
    }
    
    public final boolean component12() {
        return this.isSelf;
    }
    
    public final String component13() {
        return this.channelUrl;
    }
    
    public final String component14() {
        return this.customType;
    }
    
    public final String component15() {
        return this.customData;
    }
    
    public final boolean component16() {
        return this.isHackIsPost;
    }
    
    public final PotentiallyOffensive component17() {
        return this.offensive;
    }
    
    public final boolean component18() {
        return this.isUserBlockedByMe;
    }
    
    public final boolean component19() {
        return this.useNoPaddings;
    }
    
    public final long component2() {
        return this.getMessageId();
    }
    
    public final boolean component20() {
        return this.showDate;
    }
    
    public final boolean component21() {
        return this.showDetails;
    }
    
    public final List<ReactionUiModel> component22() {
        return this.reactions;
    }
    
    public final long component3() {
        return this.getTimestamp();
    }
    
    public final String component4() {
        return this.requestId;
    }
    
    public final String component5() {
        return this.authorUserId;
    }
    
    public final String component6() {
        return this.author;
    }
    
    public final Boolean component7() {
        return this.authorIsNsfw;
    }
    
    public final String component8() {
        return this.profileUrl;
    }
    
    public final String component9() {
        return this.age;
    }
    
    public final UserMessageUiModel copy(final t4 t4, final long n, final long n2, final String s, final String s2, final String s3, final Boolean b, final String s4, final String s5, final boolean b2, final SentStatus sentStatus, final boolean b3, final String s6, final String s7, final String s8, final boolean b4, final PotentiallyOffensive potentiallyOffensive, final boolean b5, final boolean b6, final boolean b7, final boolean b8, final List<ReactionUiModel> list) {
        f.f((Object)t4, "message");
        f.f((Object)s, "requestId");
        f.f((Object)s2, "authorUserId");
        f.f((Object)s3, "author");
        f.f((Object)s5, "age");
        f.f((Object)s6, "channelUrl");
        f.f((Object)s7, "customType");
        f.f((Object)s8, "customData");
        f.f((Object)potentiallyOffensive, "offensive");
        f.f((Object)list, "reactions");
        return new UserMessageUiModel(t4, n, n2, s, s2, s3, b, s4, s5, b2, sentStatus, b3, s6, s7, s8, b4, potentiallyOffensive, b5, b6, b7, b8, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserMessageUiModel)) {
            return false;
        }
        final UserMessageUiModel userMessageUiModel = (UserMessageUiModel)o;
        return f.a((Object)this.getMessage(), (Object)userMessageUiModel.getMessage()) && this.getMessageId() == userMessageUiModel.getMessageId() && this.getTimestamp() == userMessageUiModel.getTimestamp() && f.a((Object)this.requestId, (Object)userMessageUiModel.requestId) && f.a((Object)this.authorUserId, (Object)userMessageUiModel.authorUserId) && f.a((Object)this.author, (Object)userMessageUiModel.author) && f.a((Object)this.authorIsNsfw, (Object)userMessageUiModel.authorIsNsfw) && f.a((Object)this.profileUrl, (Object)userMessageUiModel.profileUrl) && f.a((Object)this.age, (Object)userMessageUiModel.age) && this.isRead == userMessageUiModel.isRead && this.sentStatus == userMessageUiModel.sentStatus && this.isSelf == userMessageUiModel.isSelf && f.a((Object)this.channelUrl, (Object)userMessageUiModel.channelUrl) && f.a((Object)this.customType, (Object)userMessageUiModel.customType) && f.a((Object)this.customData, (Object)userMessageUiModel.customData) && this.isHackIsPost == userMessageUiModel.isHackIsPost && this.offensive == userMessageUiModel.offensive && this.isUserBlockedByMe == userMessageUiModel.isUserBlockedByMe && this.useNoPaddings == userMessageUiModel.useNoPaddings && this.showDate == userMessageUiModel.showDate && this.showDetails == userMessageUiModel.showDetails && f.a((Object)this.reactions, (Object)userMessageUiModel.reactions);
    }
    
    public final String getAge() {
        return this.age;
    }
    
    public final String getAuthor() {
        return this.author;
    }
    
    public final Boolean getAuthorIsNsfw() {
        return this.authorIsNsfw;
    }
    
    public final String getAuthorUserId() {
        return this.authorUserId;
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public final String getCustomData() {
        return this.customData;
    }
    
    public final String getCustomType() {
        return this.customType;
    }
    
    public t4 getMessage() {
        return this.message;
    }
    
    public long getMessageId() {
        return this.messageId;
    }
    
    public final PotentiallyOffensive getOffensive() {
        return this.offensive;
    }
    
    public final String getProfileUrl() {
        return this.profileUrl;
    }
    
    public final List<ReactionUiModel> getReactions() {
        return this.reactions;
    }
    
    public final String getRequestId() {
        return this.requestId;
    }
    
    public final SentStatus getSentStatus() {
        return this.sentStatus;
    }
    
    public final boolean getShowDate() {
        return this.showDate;
    }
    
    public final boolean getShowDetails() {
        return this.showDetails;
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }
    
    public final boolean getUseNoPaddings() {
        return this.useNoPaddings;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.author, a.f(this.authorUserId, a.f(this.requestId, (Long.hashCode(this.getTimestamp()) + (Long.hashCode(this.getMessageId()) + ((BaseMessage)this.getMessage()).hashCode() * 31) * 31) * 31, 31), 31), 31);
        final Boolean authorIsNsfw = this.authorIsNsfw;
        final int n = 0;
        int hashCode;
        if (authorIsNsfw == null) {
            hashCode = 0;
        }
        else {
            hashCode = authorIsNsfw.hashCode();
        }
        final String profileUrl = this.profileUrl;
        int hashCode2;
        if (profileUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = profileUrl.hashCode();
        }
        final int f2 = a.f(this.age, ((f + hashCode) * 31 + hashCode2) * 31, 31);
        final int isRead = this.isRead ? 1 : 0;
        int n2 = 1;
        int n3 = isRead;
        if (isRead != 0) {
            n3 = 1;
        }
        final SentStatus sentStatus = this.sentStatus;
        int hashCode3;
        if (sentStatus == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = sentStatus.hashCode();
        }
        int isSelf;
        if ((isSelf = (this.isSelf ? 1 : 0)) != 0) {
            isSelf = 1;
        }
        final int f3 = a.f(this.customData, a.f(this.customType, a.f(this.channelUrl, (((f2 + n3) * 31 + hashCode3) * 31 + isSelf) * 31, 31), 31), 31);
        int isHackIsPost;
        if ((isHackIsPost = (this.isHackIsPost ? 1 : 0)) != 0) {
            isHackIsPost = 1;
        }
        final int hashCode4 = this.offensive.hashCode();
        int isUserBlockedByMe;
        if ((isUserBlockedByMe = (this.isUserBlockedByMe ? 1 : 0)) != 0) {
            isUserBlockedByMe = 1;
        }
        int useNoPaddings;
        if ((useNoPaddings = (this.useNoPaddings ? 1 : 0)) != 0) {
            useNoPaddings = 1;
        }
        int showDate;
        if ((showDate = (this.showDate ? 1 : 0)) != 0) {
            showDate = 1;
        }
        final int showDetails = this.showDetails ? 1 : 0;
        if (showDetails == 0) {
            n2 = showDetails;
        }
        return this.reactions.hashCode() + (((((hashCode4 + (f3 + isHackIsPost) * 31) * 31 + isUserBlockedByMe) * 31 + useNoPaddings) * 31 + showDate) * 31 + n2) * 31;
    }
    
    public final boolean isHackIsPost() {
        return this.isHackIsPost;
    }
    
    public final boolean isRead() {
        return this.isRead;
    }
    
    public final boolean isSelf() {
        return this.isSelf;
    }
    
    public final boolean isUserBlockedByMe() {
        return this.isUserBlockedByMe;
    }
    
    public void setMessageId(final long messageId) {
        this.messageId = messageId;
    }
    
    public final void setSentStatus(final SentStatus sentStatus) {
        this.sentStatus = sentStatus;
    }
    
    public final void setUserBlockedByMe(final boolean isUserBlockedByMe) {
        this.isUserBlockedByMe = isUserBlockedByMe;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserMessageUiModel(message=");
        k.append(this.getMessage());
        k.append(", messageId=");
        k.append(this.getMessageId());
        k.append(", timestamp=");
        k.append(this.getTimestamp());
        k.append(", requestId=");
        k.append(this.requestId);
        k.append(", authorUserId=");
        k.append(this.authorUserId);
        k.append(", author=");
        k.append(this.author);
        k.append(", authorIsNsfw=");
        k.append(this.authorIsNsfw);
        k.append(", profileUrl=");
        k.append(this.profileUrl);
        k.append(", age=");
        k.append(this.age);
        k.append(", isRead=");
        k.append(this.isRead);
        k.append(", sentStatus=");
        k.append(this.sentStatus);
        k.append(", isSelf=");
        k.append(this.isSelf);
        k.append(", channelUrl=");
        k.append(this.channelUrl);
        k.append(", customType=");
        k.append(this.customType);
        k.append(", customData=");
        k.append(this.customData);
        k.append(", isHackIsPost=");
        k.append(this.isHackIsPost);
        k.append(", offensive=");
        k.append(this.offensive);
        k.append(", isUserBlockedByMe=");
        k.append(this.isUserBlockedByMe);
        k.append(", useNoPaddings=");
        k.append(this.useNoPaddings);
        k.append(", showDate=");
        k.append(this.showDate);
        k.append(", showDetails=");
        k.append(this.showDetails);
        k.append(", reactions=");
        return m.n(k, (List)this.reactions, ')');
    }
}
