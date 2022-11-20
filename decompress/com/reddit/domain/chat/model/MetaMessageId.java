// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/chat/model/MetaMessageId;", "", "()V", "BOTTOM_PRELOADER_TYPE_ID", "", "DIRECT_HEADER_TYPE_ID", "EMPTY_HEADER_TYPE_ID", "GROUP_HEADER_TYPE_ID", "ONE_ON_ONE_HEADER_TYPE_ID", "TOP_PRELOADER_TYPE_ID", "TYPING_INDICATOR_TYPE_ID", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MetaMessageId
{
    public static final long BOTTOM_PRELOADER_TYPE_ID = -6L;
    public static final long DIRECT_HEADER_TYPE_ID = -2L;
    public static final long EMPTY_HEADER_TYPE_ID = -1L;
    public static final long GROUP_HEADER_TYPE_ID = -3L;
    public static final MetaMessageId INSTANCE;
    public static final long ONE_ON_ONE_HEADER_TYPE_ID = -7L;
    public static final long TOP_PRELOADER_TYPE_ID = -5L;
    public static final long TYPING_INDICATOR_TYPE_ID = -4L;
    
    static {
        INSTANCE = new MetaMessageId();
    }
    
    private MetaMessageId() {
    }
}
