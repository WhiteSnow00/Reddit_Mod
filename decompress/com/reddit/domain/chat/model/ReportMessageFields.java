// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.y;
import y10.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import b5.k;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/chat/model/ReportMessageFields;", "", "channelUrl", "", "createdAt", "", "messageId", "userId", "userNickname", "customType", "customData", "messageBody", "fileUrl", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelUrl", "()Ljava/lang/String;", "getCreatedAt", "()J", "getCustomData", "getCustomType", "getFileUrl", "getMessageBody", "getMessageId", "getUserId", "getUserNickname", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ReportMessageFields
{
    private final String channelUrl;
    private final long createdAt;
    private final String customData;
    private final String customType;
    private final String fileUrl;
    private final String messageBody;
    private final long messageId;
    private final String userId;
    private final String userNickname;
    
    public ReportMessageFields(final String channelUrl, final long createdAt, final long messageId, final String userId, final String userNickname, final String customType, final String customData, final String messageBody, final String fileUrl) {
        k.x(channelUrl, "channelUrl", userId, "userId", userNickname, "userNickname", customType, "customType", customData, "customData");
        this.channelUrl = channelUrl;
        this.createdAt = createdAt;
        this.messageId = messageId;
        this.userId = userId;
        this.userNickname = userNickname;
        this.customType = customType;
        this.customData = customData;
        this.messageBody = messageBody;
        this.fileUrl = fileUrl;
    }
    
    public ReportMessageFields(final String s, final long n, final long n2, final String s2, final String s3, final String s4, final String s5, final String s6, String s7, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x100) != 0x0) {
            s7 = null;
        }
        this(s, n, n2, s2, s3, s4, s5, s6, s7);
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public final long getCreatedAt() {
        return this.createdAt;
    }
    
    public final String getCustomData() {
        return this.customData;
    }
    
    public final String getCustomType() {
        return this.customType;
    }
    
    public final String getFileUrl() {
        return this.fileUrl;
    }
    
    public final String getMessageBody() {
        return this.messageBody;
    }
    
    public final long getMessageId() {
        return this.messageId;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUserNickname() {
        return this.userNickname;
    }
    
    @Override
    public String toString() {
        final y a = e.a;
        String json;
        if ((json = e.a.a((Class)ReportMessageFields.class).toJson((Object)this)) == null) {
            json = "";
        }
        return json;
    }
}
