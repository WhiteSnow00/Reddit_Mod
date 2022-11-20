// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003" }, d2 = { "toAnalyticsString", "", "Lcom/reddit/domain/model/RemovalRate;", "model_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class RelatedSubredditsResponseKt
{
    public static final String toAnalyticsString(final RemovalRate removalRate) {
        e.f((Object)removalRate, "<this>");
        final int n = WhenMappings.$EnumSwitchMapping$0[removalRate.ordinal()];
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "easy";
            }
            else {
                s = "medium";
            }
        }
        else {
            s = "hard";
        }
        return s;
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[RemovalRate.values().length];
            $EnumSwitchMapping$[RemovalRate.HIGH.ordinal()] = 1;
            $EnumSwitchMapping$[RemovalRate.MEDIUM.ordinal()] = 2;
            $EnumSwitchMapping$[RemovalRate.LOW.ordinal()] = 3;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
