// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/model/PremiumCommunityException;", "Lcom/reddit/domain/model/CommunityException;", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class PremiumCommunityException extends CommunityException
{
    public PremiumCommunityException() {
        super("User must have a premium account to access this community.");
    }
}
