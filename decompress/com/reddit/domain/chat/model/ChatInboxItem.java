// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\u0014H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u008b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00107\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\fH\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0018R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006<" }, d2 = { "Lcom/reddit/domain/chat/model/ChatInboxItem;", "Lcom/reddit/domain/chat/model/ChatInboxItemType;", "titleText", "", "subtitle", "", "url", "accepted", "", "timestamp", "", "unreadCount", "", "unreadMentionsCount", "members", "", "Lcom/reddit/domain/chat/model/UserData;", "inviter", "isOneToOne", "type", "Lcom/reddit/domain/chat/model/InboxItemType;", "id", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;ZJIILjava/util/List;Lcom/reddit/domain/chat/model/UserData;ZLcom/reddit/domain/chat/model/InboxItemType;Ljava/lang/String;)V", "getAccepted", "()Z", "getId", "()Ljava/lang/String;", "getInviter", "()Lcom/reddit/domain/chat/model/UserData;", "getMembers", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/CharSequence;", "getTimestamp", "()J", "getTitleText", "getType", "()Lcom/reddit/domain/chat/model/InboxItemType;", "getUnreadCount", "()I", "getUnreadMentionsCount", "getUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatInboxItem implements ChatInboxItemType
{
    private final boolean accepted;
    private final String id;
    private final UserData inviter;
    private final boolean isOneToOne;
    private final List<UserData> members;
    private final CharSequence subtitle;
    private final long timestamp;
    private final String titleText;
    private final InboxItemType type;
    private final int unreadCount;
    private final int unreadMentionsCount;
    private final String url;
    
    public ChatInboxItem(final String titleText, final CharSequence subtitle, final String url, final boolean accepted, final long timestamp, final int unreadCount, final int unreadMentionsCount, final List<UserData> members, final UserData inviter, final boolean isOneToOne, final InboxItemType type, final String id) {
        f.f((Object)titleText, "titleText");
        f.f((Object)subtitle, "subtitle");
        f.f((Object)url, "url");
        f.f((Object)type, "type");
        f.f((Object)id, "id");
        this.titleText = titleText;
        this.subtitle = subtitle;
        this.url = url;
        this.accepted = accepted;
        this.timestamp = timestamp;
        this.unreadCount = unreadCount;
        this.unreadMentionsCount = unreadMentionsCount;
        this.members = members;
        this.inviter = inviter;
        this.isOneToOne = isOneToOne;
        this.type = type;
        this.id = id;
    }
    
    public final String component1() {
        return this.titleText;
    }
    
    public final boolean component10() {
        return this.isOneToOne;
    }
    
    public final InboxItemType component11() {
        return this.getType();
    }
    
    public final String component12() {
        return this.getId();
    }
    
    public final CharSequence component2() {
        return this.subtitle;
    }
    
    public final String component3() {
        return this.url;
    }
    
    public final boolean component4() {
        return this.accepted;
    }
    
    public final long component5() {
        return this.timestamp;
    }
    
    public final int component6() {
        return this.unreadCount;
    }
    
    public final int component7() {
        return this.unreadMentionsCount;
    }
    
    public final List<UserData> component8() {
        return this.members;
    }
    
    public final UserData component9() {
        return this.inviter;
    }
    
    public final ChatInboxItem copy(final String s, final CharSequence charSequence, final String s2, final boolean b, final long n, final int n2, final int n3, final List<UserData> list, final UserData userData, final boolean b2, final InboxItemType inboxItemType, final String s3) {
        f.f((Object)s, "titleText");
        f.f((Object)charSequence, "subtitle");
        f.f((Object)s2, "url");
        f.f((Object)inboxItemType, "type");
        f.f((Object)s3, "id");
        return new ChatInboxItem(s, charSequence, s2, b, n, n2, n3, list, userData, b2, inboxItemType, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatInboxItem)) {
            return false;
        }
        final ChatInboxItem chatInboxItem = (ChatInboxItem)o;
        return f.a((Object)this.titleText, (Object)chatInboxItem.titleText) && f.a((Object)this.subtitle, (Object)chatInboxItem.subtitle) && f.a((Object)this.url, (Object)chatInboxItem.url) && this.accepted == chatInboxItem.accepted && this.timestamp == chatInboxItem.timestamp && this.unreadCount == chatInboxItem.unreadCount && this.unreadMentionsCount == chatInboxItem.unreadMentionsCount && f.a((Object)this.members, (Object)chatInboxItem.members) && f.a((Object)this.inviter, (Object)chatInboxItem.inviter) && this.isOneToOne == chatInboxItem.isOneToOne && this.getType() == chatInboxItem.getType() && f.a((Object)this.getId(), (Object)chatInboxItem.getId());
    }
    
    public final boolean getAccepted() {
        return this.accepted;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    public final UserData getInviter() {
        return this.inviter;
    }
    
    public final List<UserData> getMembers() {
        return this.members;
    }
    
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    public final String getTitleText() {
        return this.titleText;
    }
    
    @Override
    public InboxItemType getType() {
        return this.type;
    }
    
    public final int getUnreadCount() {
        return this.unreadCount;
    }
    
    public final int getUnreadMentionsCount() {
        return this.unreadMentionsCount;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.url, (this.subtitle.hashCode() + this.titleText.hashCode() * 31) * 31, 31);
        final int accepted = this.accepted ? 1 : 0;
        int n = 1;
        int n2 = accepted;
        if (accepted != 0) {
            n2 = 1;
        }
        final int e = s0.e(this.unreadMentionsCount, s0.e(this.unreadCount, b.c(this.timestamp, (f + n2) * 31, 31), 31), 31);
        final List<UserData> members = this.members;
        int hashCode = 0;
        int hashCode2;
        if (members == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = members.hashCode();
        }
        final UserData inviter = this.inviter;
        if (inviter != null) {
            hashCode = inviter.hashCode();
        }
        final int isOneToOne = this.isOneToOne ? 1 : 0;
        if (isOneToOne == 0) {
            n = isOneToOne;
        }
        return this.getId().hashCode() + (this.getType().hashCode() + (((e + hashCode2) * 31 + hashCode) * 31 + n) * 31) * 31;
    }
    
    public final boolean isOneToOne() {
        return this.isOneToOne;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatInboxItem(titleText=");
        k.append(this.titleText);
        k.append(", subtitle=");
        k.append((Object)this.subtitle);
        k.append(", url=");
        k.append(this.url);
        k.append(", accepted=");
        k.append(this.accepted);
        k.append(", timestamp=");
        k.append(this.timestamp);
        k.append(", unreadCount=");
        k.append(this.unreadCount);
        k.append(", unreadMentionsCount=");
        k.append(this.unreadMentionsCount);
        k.append(", members=");
        k.append(this.members);
        k.append(", inviter=");
        k.append(this.inviter);
        k.append(", isOneToOne=");
        k.append(this.isOneToOne);
        k.append(", type=");
        k.append(this.getType());
        k.append(", id=");
        k.append(this.getId());
        k.append(')');
        return k.toString();
    }
}
