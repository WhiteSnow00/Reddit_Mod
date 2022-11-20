// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004" }, d2 = { "getReportMessageFieldsFrom", "Lcom/reddit/domain/chat/model/ReportMessageFields;", "message", "Lcom/reddit/domain/chat/model/HasUserMessageData;", "domain_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ReportMessageKt
{
    public static final ReportMessageFields getReportMessageFieldsFrom(final HasUserMessageData hasUserMessageData) {
        e.f((Object)hasUserMessageData, "message");
        final String channelUrl = hasUserMessageData.getMessageData().getChannelUrl();
        final long timestamp = hasUserMessageData.getMessageData().getTimestamp();
        final long messageId = hasUserMessageData.getMessageData().getMessageId();
        final String authorUserId = hasUserMessageData.getMessageData().getAuthorUserId();
        final String author = hasUserMessageData.getMessageData().getAuthor();
        final String customType = hasUserMessageData.getMessageData().getCustomType();
        final String customData = hasUserMessageData.getMessageData().getCustomData();
        String message;
        if (hasUserMessageData instanceof TextMessageData) {
            message = ((TextMessageData)hasUserMessageData).getMessage();
        }
        else {
            message = null;
        }
        return new ReportMessageFields(channelUrl, timestamp, messageId, authorUserId, author, customType, customData, message, null, 256, null);
    }
}
