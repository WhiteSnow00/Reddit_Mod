// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.powerups;

import ah2.f;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/powerups/PowerupsBenefit;", "", "", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "SD_VIDEO", "HD_VIDEO", "COMMENTS_WITH_GIFS", "COMMENTS_WITH_EMOJI", "ACHIEVEMENT_FLAIRS", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum PowerupsBenefit
{
    ACHIEVEMENT_FLAIRS("ACHIEVEMENT_FLAIRS"), 
    COMMENTS_WITH_EMOJI("COMMENTS_WITH_EMOJI"), 
    COMMENTS_WITH_GIFS("COMMENTS_WITH_GIFS");
    
    public static final a Companion;
    
    HD_VIDEO("HD_VIDEO"), 
    SD_VIDEO("SD_VIDEO");
    
    private final String rawValue;
    
    static {
        Companion = new a();
    }
    
    private PowerupsBenefit(final String rawValue) {
        this.rawValue = rawValue;
    }
    
    public final String getRawValue() {
        return this.rawValue;
    }
    
    public static final class a
    {
        public static PowerupsBenefit a(final String s) {
            f.f((Object)s, "raw");
            for (final PowerupsBenefit powerupsBenefit : PowerupsBenefit.values()) {
                if (f.a((Object)powerupsBenefit.getRawValue(), (Object)s)) {
                    return powerupsBenefit;
                }
            }
            return null;
        }
    }
}
