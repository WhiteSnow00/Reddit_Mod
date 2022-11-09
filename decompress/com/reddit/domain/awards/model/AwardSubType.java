// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/awards/model/AwardSubType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "MODERATOR", "COMMUNITY", "GLOBAL", "APPRECIATION", "PREMIUM", "GROUP", "CHAT_REACTION", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum AwardSubType
{
    @n(name = "APPRECIATION")
    APPRECIATION, 
    @n(name = "CHAT_REACTION")
    CHAT_REACTION, 
    @n(name = "COMMUNITY")
    COMMUNITY;
    
    public static final a Companion;
    
    @n(name = "GLOBAL")
    GLOBAL, 
    @n(name = "GROUP")
    GROUP, 
    @n(name = "MODERATOR")
    MODERATOR, 
    @n(name = "PREMIUM")
    PREMIUM;
    
    private static final String SUB_TYPE_APPRECIATION = "APPRECIATION";
    private static final String SUB_TYPE_CHAT_REACTION = "CHAT_REACTION";
    private static final String SUB_TYPE_COMMUNITY = "COMMUNITY";
    private static final String SUB_TYPE_GLOBAL = "GLOBAL";
    private static final String SUB_TYPE_GROUP = "GROUP";
    private static final String SUB_TYPE_MODERATOR = "MODERATOR";
    private static final String SUB_TYPE_PREMIUM = "PREMIUM";
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
    }
}
