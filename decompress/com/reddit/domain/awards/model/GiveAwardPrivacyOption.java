// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/awards/model/GiveAwardPrivacyOption;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ANONYMOUS_WITH_PRIVATE_MESSAGE", "NON_ANONYMOUS_WITH_PRIVATE_MESSAGE", "MODERATOR_WITH_PRIVATE_MESSAGE", "PUBLIC", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum GiveAwardPrivacyOption
{
    ANONYMOUS_WITH_PRIVATE_MESSAGE;
    
    public static final a Companion;
    
    MODERATOR_WITH_PRIVATE_MESSAGE, 
    NON_ANONYMOUS_WITH_PRIVATE_MESSAGE, 
    PUBLIC;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
    }
}
