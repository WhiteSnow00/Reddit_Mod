// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model.livechat;

import p1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/chat/model/livechat/LiveChatPostUiModel;", "", "postTitle", "", "subredditInfo", "Lcom/reddit/domain/chat/model/livechat/LiveChatPostUiModel$SubredditInfo;", "participantCount", "", "(Ljava/lang/String;Lcom/reddit/domain/chat/model/livechat/LiveChatPostUiModel$SubredditInfo;I)V", "getParticipantCount", "()I", "getPostTitle", "()Ljava/lang/String;", "getSubredditInfo", "()Lcom/reddit/domain/chat/model/livechat/LiveChatPostUiModel$SubredditInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SubredditInfo", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LiveChatPostUiModel
{
    private final int participantCount;
    private final String postTitle;
    private final SubredditInfo subredditInfo;
    
    public LiveChatPostUiModel(final String postTitle, final SubredditInfo subredditInfo, final int participantCount) {
        e.f((Object)postTitle, "postTitle");
        e.f((Object)subredditInfo, "subredditInfo");
        this.postTitle = postTitle;
        this.subredditInfo = subredditInfo;
        this.participantCount = participantCount;
    }
    
    public static LiveChatPostUiModel copy$default(final LiveChatPostUiModel liveChatPostUiModel, String postTitle, SubredditInfo subredditInfo, int participantCount, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            postTitle = liveChatPostUiModel.postTitle;
        }
        if ((n & 0x2) != 0x0) {
            subredditInfo = liveChatPostUiModel.subredditInfo;
        }
        if ((n & 0x4) != 0x0) {
            participantCount = liveChatPostUiModel.participantCount;
        }
        return liveChatPostUiModel.copy(postTitle, subredditInfo, participantCount);
    }
    
    public final String component1() {
        return this.postTitle;
    }
    
    public final SubredditInfo component2() {
        return this.subredditInfo;
    }
    
    public final int component3() {
        return this.participantCount;
    }
    
    public final LiveChatPostUiModel copy(final String s, final SubredditInfo subredditInfo, final int n) {
        e.f((Object)s, "postTitle");
        e.f((Object)subredditInfo, "subredditInfo");
        return new LiveChatPostUiModel(s, subredditInfo, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LiveChatPostUiModel)) {
            return false;
        }
        final LiveChatPostUiModel liveChatPostUiModel = (LiveChatPostUiModel)o;
        return e.a((Object)this.postTitle, (Object)liveChatPostUiModel.postTitle) && e.a((Object)this.subredditInfo, (Object)liveChatPostUiModel.subredditInfo) && this.participantCount == liveChatPostUiModel.participantCount;
    }
    
    public final int getParticipantCount() {
        return this.participantCount;
    }
    
    public final String getPostTitle() {
        return this.postTitle;
    }
    
    public final SubredditInfo getSubredditInfo() {
        return this.subredditInfo;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.participantCount) + (this.subredditInfo.hashCode() + this.postTitle.hashCode() * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("LiveChatPostUiModel(postTitle=");
        t.append(this.postTitle);
        t.append(", subredditInfo=");
        t.append(this.subredditInfo);
        t.append(", participantCount=");
        return d.j(t, this.participantCount, ')');
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/livechat/LiveChatPostUiModel$SubredditInfo;", "", "subredditId", "", "subredditName", "subredditIcon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubredditIcon", "()Ljava/lang/String;", "getSubredditId", "getSubredditName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubredditInfo
    {
        private final String subredditIcon;
        private final String subredditId;
        private final String subredditName;
        
        public SubredditInfo(final String subredditId, final String subredditName, final String subredditIcon) {
            e.f((Object)subredditId, "subredditId");
            e.f((Object)subredditName, "subredditName");
            this.subredditId = subredditId;
            this.subredditName = subredditName;
            this.subredditIcon = subredditIcon;
        }
        
        public SubredditInfo(final String s, final String s2, String s3, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x4) != 0x0) {
                s3 = null;
            }
            this(s, s2, s3);
        }
        
        public static SubredditInfo copy$default(final SubredditInfo subredditInfo, String subredditId, String subredditName, String subredditIcon, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                subredditId = subredditInfo.subredditId;
            }
            if ((n & 0x2) != 0x0) {
                subredditName = subredditInfo.subredditName;
            }
            if ((n & 0x4) != 0x0) {
                subredditIcon = subredditInfo.subredditIcon;
            }
            return subredditInfo.copy(subredditId, subredditName, subredditIcon);
        }
        
        public final String component1() {
            return this.subredditId;
        }
        
        public final String component2() {
            return this.subredditName;
        }
        
        public final String component3() {
            return this.subredditIcon;
        }
        
        public final SubredditInfo copy(final String s, final String s2, final String s3) {
            e.f((Object)s, "subredditId");
            e.f((Object)s2, "subredditName");
            return new SubredditInfo(s, s2, s3);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof SubredditInfo)) {
                return false;
            }
            final SubredditInfo subredditInfo = (SubredditInfo)o;
            return e.a((Object)this.subredditId, (Object)subredditInfo.subredditId) && e.a((Object)this.subredditName, (Object)subredditInfo.subredditName) && e.a((Object)this.subredditIcon, (Object)subredditInfo.subredditIcon);
        }
        
        public final String getSubredditIcon() {
            return this.subredditIcon;
        }
        
        public final String getSubredditId() {
            return this.subredditId;
        }
        
        public final String getSubredditName() {
            return this.subredditName;
        }
        
        @Override
        public int hashCode() {
            final int e = aq2.a.e(this.subredditName, this.subredditId.hashCode() * 31, 31);
            final String subredditIcon = this.subredditIcon;
            int hashCode;
            if (subredditIcon == null) {
                hashCode = 0;
            }
            else {
                hashCode = subredditIcon.hashCode();
            }
            return e + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("SubredditInfo(subredditId=");
            t.append(this.subredditId);
            t.append(", subredditName=");
            t.append(this.subredditName);
            t.append(", subredditIcon=");
            return h.c(t, this.subredditIcon, ')');
        }
    }
}
