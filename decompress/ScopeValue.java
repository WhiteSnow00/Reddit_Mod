// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.annotation;

import com.bytedance.covode.number.Covode;

public enum ScopeValue
{
    BANNER("banner"), 
    BARRAGE("barrage"), 
    BROADCAST("broadcast"), 
    COMMENT("comment"), 
    DECORATION("decoration"), 
    FEED("feed"), 
    GIFT("gift"), 
    HYBRID("hybrid"), 
    LINKMIC("linkmic"), 
    MESSAGE("message"), 
    OTHER("other"), 
    PERFORMANCE("performance"), 
    PUBLICSCREEN("publicscreen"), 
    PULLSTREAM("pullstream"), 
    RANK("rank"), 
    ROOMFUNCTION("roomfunction"), 
    SLOT("slot"), 
    WALLET("wallet"), 
    WATCHLIVE("watchlive");
    
    public String name;
    
    static {
        Covode.recordClassIndex(4885);
    }
    
    public ScopeValue(final String name) {
        this.name = name;
    }
    
    public final String getName() {
        return this.name;
    }
}
