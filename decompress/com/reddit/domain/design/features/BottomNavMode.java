// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.design.features;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005�\u0006\u0006" }, d2 = { "Lcom/reddit/domain/design/features/BottomNavMode;", "", "(Ljava/lang/String;I)V", "WITH_LABELS", "WITHOUT_LABELS", "DYNAMIC", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum BottomNavMode
{
    private static final BottomNavMode[] $VALUES;
    
    DYNAMIC, 
    WITHOUT_LABELS, 
    WITH_LABELS;
    
    private static final BottomNavMode[] $values() {
        return new BottomNavMode[] { BottomNavMode.WITH_LABELS, BottomNavMode.WITHOUT_LABELS, BottomNavMode.DYNAMIC };
    }
    
    static {
        $VALUES = $values();
    }
}
