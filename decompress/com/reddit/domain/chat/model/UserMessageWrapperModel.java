// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import aq2.a;
import ng2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0002\u0010\u0016J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\u0092\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u00c6\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020AH\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006C" }, d2 = { "Lcom/reddit/domain/chat/model/UserMessageWrapperModel;", "", "timestamp", "", "author", "", "authorIsNsfw", "", "profileUrl", "avatar", "Lcom/reddit/domain/chat/model/VisibleAvatar;", "horizontalBias", "", "sentStatus", "Lcom/reddit/domain/chat/model/SentStatus;", "isSelf", "showTime", "showUserName", "reactions", "", "Lcom/reddit/domain/chat/model/ReactionUiModel;", "showChangeChatTheme", "(JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/chat/model/VisibleAvatar;FLcom/reddit/domain/chat/model/SentStatus;ZZZLjava/util/List;Z)V", "getAuthor", "()Ljava/lang/String;", "getAuthorIsNsfw", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAvatar", "()Lcom/reddit/domain/chat/model/VisibleAvatar;", "setAvatar", "(Lcom/reddit/domain/chat/model/VisibleAvatar;)V", "getHorizontalBias", "()F", "()Z", "getProfileUrl", "getReactions", "()Ljava/util/List;", "getSentStatus", "()Lcom/reddit/domain/chat/model/SentStatus;", "getShowChangeChatTheme", "getShowTime", "setShowTime", "(Z)V", "getShowUserName", "setShowUserName", "getTimestamp", "()J", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/chat/model/VisibleAvatar;FLcom/reddit/domain/chat/model/SentStatus;ZZZLjava/util/List;Z)Lcom/reddit/domain/chat/model/UserMessageWrapperModel;", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserMessageWrapperModel
{
    private final String author;
    private final Boolean authorIsNsfw;
    private VisibleAvatar avatar;
    private final float horizontalBias;
    private final boolean isSelf;
    private final String profileUrl;
    private final List<ReactionUiModel> reactions;
    private final SentStatus sentStatus;
    private final boolean showChangeChatTheme;
    private boolean showTime;
    private boolean showUserName;
    private final long timestamp;
    
    public UserMessageWrapperModel(final long timestamp, final String author, final Boolean authorIsNsfw, final String profileUrl, final VisibleAvatar avatar, final float horizontalBias, final SentStatus sentStatus, final boolean isSelf, final boolean showTime, final boolean showUserName, final List<ReactionUiModel> reactions, final boolean showChangeChatTheme) {
        e.f((Object)author, "author");
        e.f((Object)avatar, "avatar");
        e.f((Object)reactions, "reactions");
        this.timestamp = timestamp;
        this.author = author;
        this.authorIsNsfw = authorIsNsfw;
        this.profileUrl = profileUrl;
        this.avatar = avatar;
        this.horizontalBias = horizontalBias;
        this.sentStatus = sentStatus;
        this.isSelf = isSelf;
        this.showTime = showTime;
        this.showUserName = showUserName;
        this.reactions = reactions;
        this.showChangeChatTheme = showChangeChatTheme;
    }
    
    public static UserMessageWrapperModel copy$default(final UserMessageWrapperModel userMessageWrapperModel, long timestamp, String author, Boolean authorIsNsfw, String profileUrl, VisibleAvatar avatar, float horizontalBias, SentStatus sentStatus, boolean isSelf, boolean showTime, boolean showUserName, List reactions, boolean showChangeChatTheme, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            timestamp = userMessageWrapperModel.timestamp;
        }
        if ((n & 0x2) != 0x0) {
            author = userMessageWrapperModel.author;
        }
        if ((n & 0x4) != 0x0) {
            authorIsNsfw = userMessageWrapperModel.authorIsNsfw;
        }
        if ((n & 0x8) != 0x0) {
            profileUrl = userMessageWrapperModel.profileUrl;
        }
        if ((n & 0x10) != 0x0) {
            avatar = userMessageWrapperModel.avatar;
        }
        if ((n & 0x20) != 0x0) {
            horizontalBias = userMessageWrapperModel.horizontalBias;
        }
        if ((n & 0x40) != 0x0) {
            sentStatus = userMessageWrapperModel.sentStatus;
        }
        if ((n & 0x80) != 0x0) {
            isSelf = userMessageWrapperModel.isSelf;
        }
        if ((n & 0x100) != 0x0) {
            showTime = userMessageWrapperModel.showTime;
        }
        if ((n & 0x200) != 0x0) {
            showUserName = userMessageWrapperModel.showUserName;
        }
        if ((n & 0x400) != 0x0) {
            reactions = userMessageWrapperModel.reactions;
        }
        if ((n & 0x800) != 0x0) {
            showChangeChatTheme = userMessageWrapperModel.showChangeChatTheme;
        }
        return userMessageWrapperModel.copy(timestamp, author, authorIsNsfw, profileUrl, avatar, horizontalBias, sentStatus, isSelf, showTime, showUserName, reactions, showChangeChatTheme);
    }
    
    public final long component1() {
        return this.timestamp;
    }
    
    public final boolean component10() {
        return this.showUserName;
    }
    
    public final List<ReactionUiModel> component11() {
        return this.reactions;
    }
    
    public final boolean component12() {
        return this.showChangeChatTheme;
    }
    
    public final String component2() {
        return this.author;
    }
    
    public final Boolean component3() {
        return this.authorIsNsfw;
    }
    
    public final String component4() {
        return this.profileUrl;
    }
    
    public final VisibleAvatar component5() {
        return this.avatar;
    }
    
    public final float component6() {
        return this.horizontalBias;
    }
    
    public final SentStatus component7() {
        return this.sentStatus;
    }
    
    public final boolean component8() {
        return this.isSelf;
    }
    
    public final boolean component9() {
        return this.showTime;
    }
    
    public final UserMessageWrapperModel copy(final long n, final String s, final Boolean b, final String s2, final VisibleAvatar visibleAvatar, final float n2, final SentStatus sentStatus, final boolean b2, final boolean b3, final boolean b4, final List<ReactionUiModel> list, final boolean b5) {
        e.f((Object)s, "author");
        e.f((Object)visibleAvatar, "avatar");
        e.f((Object)list, "reactions");
        return new UserMessageWrapperModel(n, s, b, s2, visibleAvatar, n2, sentStatus, b2, b3, b4, list, b5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserMessageWrapperModel)) {
            return false;
        }
        final UserMessageWrapperModel userMessageWrapperModel = (UserMessageWrapperModel)o;
        return this.timestamp == userMessageWrapperModel.timestamp && e.a((Object)this.author, (Object)userMessageWrapperModel.author) && e.a((Object)this.authorIsNsfw, (Object)userMessageWrapperModel.authorIsNsfw) && e.a((Object)this.profileUrl, (Object)userMessageWrapperModel.profileUrl) && e.a((Object)this.avatar, (Object)userMessageWrapperModel.avatar) && e.a((Object)this.horizontalBias, (Object)userMessageWrapperModel.horizontalBias) && this.sentStatus == userMessageWrapperModel.sentStatus && this.isSelf == userMessageWrapperModel.isSelf && this.showTime == userMessageWrapperModel.showTime && this.showUserName == userMessageWrapperModel.showUserName && e.a((Object)this.reactions, (Object)userMessageWrapperModel.reactions) && this.showChangeChatTheme == userMessageWrapperModel.showChangeChatTheme;
    }
    
    public final String getAuthor() {
        return this.author;
    }
    
    public final Boolean getAuthorIsNsfw() {
        return this.authorIsNsfw;
    }
    
    public final VisibleAvatar getAvatar() {
        return this.avatar;
    }
    
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }
    
    public final String getProfileUrl() {
        return this.profileUrl;
    }
    
    public final List<ReactionUiModel> getReactions() {
        return this.reactions;
    }
    
    public final SentStatus getSentStatus() {
        return this.sentStatus;
    }
    
    public final boolean getShowChangeChatTheme() {
        return this.showChangeChatTheme;
    }
    
    public final boolean getShowTime() {
        return this.showTime;
    }
    
    public final boolean getShowUserName() {
        return this.showUserName;
    }
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.author, Long.hashCode(this.timestamp) * 31, 31);
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
        final int b = a.b(this.horizontalBias, (this.avatar.hashCode() + ((e + hashCode) * 31 + hashCode2) * 31) * 31, 31);
        final SentStatus sentStatus = this.sentStatus;
        int hashCode3;
        if (sentStatus == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = sentStatus.hashCode();
        }
        final int isSelf = this.isSelf ? 1 : 0;
        final int n2 = 1;
        int n3 = isSelf;
        if (isSelf != 0) {
            n3 = 1;
        }
        int showTime;
        if ((showTime = (this.showTime ? 1 : 0)) != 0) {
            showTime = 1;
        }
        int showUserName;
        if ((showUserName = (this.showUserName ? 1 : 0)) != 0) {
            showUserName = 1;
        }
        final int b2 = ph0.a.b((List)this.reactions, ((((b + hashCode3) * 31 + n3) * 31 + showTime) * 31 + showUserName) * 31, 31);
        int showChangeChatTheme = this.showChangeChatTheme ? 1 : 0;
        if (showChangeChatTheme != 0) {
            showChangeChatTheme = n2;
        }
        return b2 + showChangeChatTheme;
    }
    
    public final boolean isSelf() {
        return this.isSelf;
    }
    
    public final void setAvatar(final VisibleAvatar avatar) {
        e.f((Object)avatar, "<set-?>");
        this.avatar = avatar;
    }
    
    public final void setShowTime(final boolean showTime) {
        this.showTime = showTime;
    }
    
    public final void setShowUserName(final boolean showUserName) {
        this.showUserName = showUserName;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("UserMessageWrapperModel(timestamp=");
        t.append(this.timestamp);
        t.append(", author=");
        t.append(this.author);
        t.append(", authorIsNsfw=");
        t.append(this.authorIsNsfw);
        t.append(", profileUrl=");
        t.append(this.profileUrl);
        t.append(", avatar=");
        t.append(this.avatar);
        t.append(", horizontalBias=");
        t.append(this.horizontalBias);
        t.append(", sentStatus=");
        t.append(this.sentStatus);
        t.append(", isSelf=");
        t.append(this.isSelf);
        t.append(", showTime=");
        t.append(this.showTime);
        t.append(", showUserName=");
        t.append(this.showUserName);
        t.append(", reactions=");
        t.append(this.reactions);
        t.append(", showChangeChatTheme=");
        return d.n(t, this.showChangeChatTheme, ')');
    }
}
