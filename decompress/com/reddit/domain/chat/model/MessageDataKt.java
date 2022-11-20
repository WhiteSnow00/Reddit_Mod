// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0006" }, d2 = { "isFailed", "", "Lcom/reddit/domain/chat/model/HasUserMessageData;", "(Lcom/reddit/domain/chat/model/HasUserMessageData;)Z", "nextState", "Lcom/reddit/domain/chat/model/ContentVisibility;", "domain_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class MessageDataKt
{
    public static final boolean isFailed(final HasUserMessageData hasUserMessageData) {
        e.f((Object)hasUserMessageData, "<this>");
        return hasUserMessageData.getMessageData().getSentStatus() == SentStatus.FAILED;
    }
    
    public static final ContentVisibility nextState(ContentVisibility shown) {
        e.f((Object)shown, "<this>");
        final int n = WhenMappings.$EnumSwitchMapping$0[((Enum)shown).ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            shown = null;
        }
        else {
            shown = ContentVisibility.SHOWN;
        }
        return shown;
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[ContentVisibility.values().length];
            $EnumSwitchMapping$[((Enum)ContentVisibility.BLURRED).ordinal()] = 1;
            $EnumSwitchMapping$[((Enum)ContentVisibility.SHOWN).ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
