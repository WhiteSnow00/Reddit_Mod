// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "", "value", "", "displayValue", "", "(Ljava/lang/String;ILjava/lang/Long;I)V", "getDisplayValue", "()I", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "TEN_MINUTES", "ONE_HOUR", "ONE_DAY", "THIRTY_DAYS", "NEVER", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum InviteLinkExpirations
{
    public static final Companion Companion;
    
    NEVER((Long)null, 2131954154), 
    ONE_DAY(Long.valueOf(14400000L), 2131954151), 
    ONE_HOUR(Long.valueOf(3600000L), 2131954152), 
    TEN_MINUTES(Long.valueOf(600000L), 2131954150), 
    THIRTY_DAYS(Long.valueOf(432000000L), 2131954153);
    
    private final int displayValue;
    private final Long value;
    
    static {
        Companion = new Companion(null);
    }
    
    private InviteLinkExpirations(final Long value, final int displayValue) {
        this.value = value;
        this.displayValue = displayValue;
    }
    
    public static final InviteLinkExpirations getInviteLinkExpirations(final Integer n) {
        return InviteLinkExpirations.Companion.getInviteLinkExpirations(n);
    }
    
    public final int getDisplayValue() {
        return this.displayValue;
    }
    
    public final Long getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkExpirations$Companion;", "", "()V", "getInviteLinkExpirations", "Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "displayValue", "", "(Ljava/lang/Integer;)Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final InviteLinkExpirations getInviteLinkExpirations(final Integer n) {
            while (true) {
                for (final InviteLinkExpirations inviteLinkExpirations : InviteLinkExpirations.values()) {
                    final int displayValue = inviteLinkExpirations.getDisplayValue();
                    boolean b = false;
                    Label_0054: {
                        if (n != null) {
                            if (displayValue == n) {
                                b = true;
                                break Label_0054;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final InviteLinkExpirations inviteLinkExpirations2 = inviteLinkExpirations;
                        InviteLinkExpirations never = inviteLinkExpirations2;
                        if (inviteLinkExpirations2 == null) {
                            never = InviteLinkExpirations.NEVER;
                        }
                        return never;
                    }
                }
                final InviteLinkExpirations inviteLinkExpirations2 = null;
                continue;
            }
        }
    }
}
