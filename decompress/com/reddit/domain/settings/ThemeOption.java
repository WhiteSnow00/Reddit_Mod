// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/settings/ThemeOption;", "", "(Ljava/lang/String;I)V", "isNightModeTheme", "", "()Z", "ALIENBLUE", "MINT", "NIGHT", "PONY", "TREES", "AMOLED", "ANONYMOUSBROWSING", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ThemeOption
{
    private static final ThemeOption[] $VALUES;
    
    ALIENBLUE, 
    AMOLED, 
    ANONYMOUSBROWSING, 
    MINT, 
    NIGHT, 
    PONY, 
    TREES;
    
    private static final ThemeOption[] $values() {
        return new ThemeOption[] { ThemeOption.ALIENBLUE, ThemeOption.MINT, ThemeOption.NIGHT, ThemeOption.PONY, ThemeOption.TREES, ThemeOption.AMOLED, ThemeOption.ANONYMOUSBROWSING };
    }
    
    static {
        $VALUES = $values();
    }
    
    public final boolean isNightModeTheme() {
        return this == ThemeOption.NIGHT || this == ThemeOption.AMOLED || this == ThemeOption.ANONYMOUSBROWSING;
    }
}
