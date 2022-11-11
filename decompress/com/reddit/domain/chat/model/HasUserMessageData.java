// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/chat/model/HasUserMessageData;", "Lcom/reddit/domain/chat/model/HasMessageData;", "messageData", "Lcom/reddit/domain/chat/model/UserMessageUiModel;", "getMessageData", "()Lcom/reddit/domain/chat/model/UserMessageUiModel;", "userMessageWrapperUiModel", "Lcom/reddit/domain/chat/model/UserMessageWrapperModel;", "getUserMessageWrapperUiModel", "()Lcom/reddit/domain/chat/model/UserMessageWrapperModel;", "copyWithMessageData", "copyWithUserMessageWrapper", "messageId", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface HasUserMessageData extends HasMessageData
{
    HasUserMessageData copyWithMessageData(final UserMessageUiModel p0);
    
    HasUserMessageData copyWithUserMessageWrapper(final long p0, final UserMessageWrapperModel p1);
    
    UserMessageUiModel getMessageData();
    
    UserMessageWrapperModel getUserMessageWrapperUiModel();
}
