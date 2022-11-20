// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import p1.h;
import aq2.a;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!" }, d2 = { "Lcom/reddit/domain/chat/model/ReactionUiModel;", "", "key", "", "count", "", "hasUserReacted", "", "messageId", "", "imageUrl", "(Ljava/lang/String;IZJLjava/lang/String;)V", "getCount", "()I", "countLabel", "getCountLabel", "()Ljava/lang/String;", "getHasUserReacted", "()Z", "getImageUrl", "getKey", "getMessageId", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ReactionUiModel
{
    private final int count;
    private final String countLabel;
    private final boolean hasUserReacted;
    private final String imageUrl;
    private final String key;
    private final long messageId;
    
    public ReactionUiModel(String value, final int count, final boolean hasUserReacted, final long messageId, final String imageUrl) {
        e.f((Object)value, "key");
        this.key = value;
        this.count = count;
        this.hasUserReacted = hasUserReacted;
        this.messageId = messageId;
        this.imageUrl = imageUrl;
        if (count > 1) {
            value = String.valueOf(count);
        }
        else {
            value = null;
        }
        this.countLabel = value;
    }
    
    public static ReactionUiModel copy$default(final ReactionUiModel reactionUiModel, String key, int count, boolean hasUserReacted, long messageId, String imageUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            key = reactionUiModel.key;
        }
        if ((n & 0x2) != 0x0) {
            count = reactionUiModel.count;
        }
        if ((n & 0x4) != 0x0) {
            hasUserReacted = reactionUiModel.hasUserReacted;
        }
        if ((n & 0x8) != 0x0) {
            messageId = reactionUiModel.messageId;
        }
        if ((n & 0x10) != 0x0) {
            imageUrl = reactionUiModel.imageUrl;
        }
        return reactionUiModel.copy(key, count, hasUserReacted, messageId, imageUrl);
    }
    
    public final String component1() {
        return this.key;
    }
    
    public final int component2() {
        return this.count;
    }
    
    public final boolean component3() {
        return this.hasUserReacted;
    }
    
    public final long component4() {
        return this.messageId;
    }
    
    public final String component5() {
        return this.imageUrl;
    }
    
    public final ReactionUiModel copy(final String s, final int n, final boolean b, final long n2, final String s2) {
        e.f((Object)s, "key");
        return new ReactionUiModel(s, n, b, n2, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReactionUiModel)) {
            return false;
        }
        final ReactionUiModel reactionUiModel = (ReactionUiModel)o;
        return e.a((Object)this.key, (Object)reactionUiModel.key) && this.count == reactionUiModel.count && this.hasUserReacted == reactionUiModel.hasUserReacted && this.messageId == reactionUiModel.messageId && e.a((Object)this.imageUrl, (Object)reactionUiModel.imageUrl);
    }
    
    public final int getCount() {
        return this.count;
    }
    
    public final String getCountLabel() {
        return this.countLabel;
    }
    
    public final boolean getHasUserReacted() {
        return this.hasUserReacted;
    }
    
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    public final String getKey() {
        return this.key;
    }
    
    public final long getMessageId() {
        return this.messageId;
    }
    
    @Override
    public int hashCode() {
        final int c = a.c(this.count, this.key.hashCode() * 31, 31);
        int hasUserReacted;
        if ((hasUserReacted = (this.hasUserReacted ? 1 : 0)) != 0) {
            hasUserReacted = 1;
        }
        final int b = b.b(this.messageId, (c + hasUserReacted) * 31, 31);
        final String imageUrl = this.imageUrl;
        int hashCode;
        if (imageUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = imageUrl.hashCode();
        }
        return b + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReactionUiModel(key=");
        t.append(this.key);
        t.append(", count=");
        t.append(this.count);
        t.append(", hasUserReacted=");
        t.append(this.hasUserReacted);
        t.append(", messageId=");
        t.append(this.messageId);
        t.append(", imageUrl=");
        return h.c(t, this.imageUrl, ')');
    }
}
