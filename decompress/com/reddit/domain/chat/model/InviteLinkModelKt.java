// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002�\u0006\u0002\u0010\u0003�\u0006\u0004" }, d2 = { "getTimeStamp", "", "Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "(Lcom/reddit/domain/chat/model/InviteLinkExpirations;)Ljava/lang/Long;", "domain_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class InviteLinkModelKt
{
    public static final Long getTimeStamp(final InviteLinkExpirations inviteLinkExpirations) {
        e.f((Object)inviteLinkExpirations, "<this>");
        Long value;
        if (WhenMappings.$EnumSwitchMapping$0[((Enum)inviteLinkExpirations).ordinal()] == 1) {
            value = null;
        }
        else {
            final long currentTimeMillis = System.currentTimeMillis();
            final Long value2 = inviteLinkExpirations.getValue();
            e.c((Object)value2);
            value = value2 + currentTimeMillis;
        }
        return value;
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[InviteLinkExpirations.values().length];
            $EnumSwitchMapping$[((Enum)InviteLinkExpirations.NEVER).ordinal()] = 1;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
