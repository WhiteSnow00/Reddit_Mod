// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkMaxUses;", "", "value", "", "displayValue", "(Ljava/lang/String;III)V", "getDisplayValue", "()I", "getValue", "ONE", "FIVE", "TEN", "FIFTY", "ONE_HUNDRED", "TWO_HUNDRED_AND_FIFTY", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum InviteLinkMaxUses
{
    private static final InviteLinkMaxUses[] $VALUES;
    public static final Companion Companion;
    
    FIFTY(50, 2131954182), 
    FIVE(5, 2131954181), 
    ONE(1, 2131954177), 
    ONE_HUNDRED(100, 2131954179), 
    TEN(10, 2131954178), 
    TWO_HUNDRED_AND_FIFTY(250, 2131954180);
    
    private final int displayValue;
    private final int value;
    
    private static final InviteLinkMaxUses[] $values() {
        return new InviteLinkMaxUses[] { InviteLinkMaxUses.ONE, InviteLinkMaxUses.FIVE, InviteLinkMaxUses.TEN, InviteLinkMaxUses.FIFTY, InviteLinkMaxUses.ONE_HUNDRED, InviteLinkMaxUses.TWO_HUNDRED_AND_FIFTY };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private InviteLinkMaxUses(final int value, final int displayValue) {
        this.value = value;
        this.displayValue = displayValue;
    }
    
    public static final InviteLinkMaxUses getInviteLinkMaxUses(final Integer n) {
        return InviteLinkMaxUses.Companion.getInviteLinkMaxUses(n);
    }
    
    public final int getDisplayValue() {
        return this.displayValue;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkMaxUses$Companion;", "", "()V", "getInviteLinkMaxUses", "Lcom/reddit/domain/chat/model/InviteLinkMaxUses;", "displayValue", "", "(Ljava/lang/Integer;)Lcom/reddit/domain/chat/model/InviteLinkMaxUses;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final InviteLinkMaxUses getInviteLinkMaxUses(final Integer n) {
            while (true) {
                for (final InviteLinkMaxUses inviteLinkMaxUses : InviteLinkMaxUses.values()) {
                    final int displayValue = inviteLinkMaxUses.getDisplayValue();
                    boolean b = false;
                    Label_0052: {
                        if (n != null) {
                            if (displayValue == n) {
                                b = true;
                                break Label_0052;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        final InviteLinkMaxUses inviteLinkMaxUses2 = inviteLinkMaxUses;
                        InviteLinkMaxUses five = inviteLinkMaxUses2;
                        if (inviteLinkMaxUses2 == null) {
                            five = InviteLinkMaxUses.FIVE;
                        }
                        return five;
                    }
                }
                final InviteLinkMaxUses inviteLinkMaxUses2 = null;
                continue;
            }
        }
    }
}
