// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/SubredditActionSource;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "toString", "ONBOARDING", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum SubredditActionSource
{
    ONBOARDING("onboarding");
    
    private final String action;
    
    private SubredditActionSource(final String action) {
        this.action = action;
    }
    
    public final String getAction() {
        return this.action;
    }
    
    @Override
    public String toString() {
        return this.action;
    }
}
