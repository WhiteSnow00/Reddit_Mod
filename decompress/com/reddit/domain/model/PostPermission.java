// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/PostPermission;", "", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "LOCKED", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PostPermission
{
    public static final Companion Companion;
    
    DISABLED, 
    ENABLED, 
    LOCKED;
    
    static {
        Companion = new Companion(null);
    }
    
    public static final PostPermission fromBoolean(final boolean b) {
        return PostPermission.Companion.fromBoolean(b);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/PostPermission$Companion;", "", "()V", "fromBoolean", "Lcom/reddit/domain/model/PostPermission;", "enabled", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final PostPermission fromBoolean(final boolean b) {
            PostPermission postPermission;
            if (b) {
                postPermission = PostPermission.ENABLED;
            }
            else {
                postPermission = PostPermission.DISABLED;
            }
            return postPermission;
        }
    }
}
