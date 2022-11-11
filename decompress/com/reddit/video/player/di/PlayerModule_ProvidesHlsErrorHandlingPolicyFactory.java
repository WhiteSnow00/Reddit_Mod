// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.di;

import ui.b;
import kotlin.Metadata;
import com.google.android.exoplayer2.upstream.f;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0000H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesHlsErrorHandlingPolicyFactory;", "Lse2/d;", "Lcom/google/android/exoplayer2/upstream/f;", "create", "providesHlsErrorHandlingPolicy", "get", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class PlayerModule_ProvidesHlsErrorHandlingPolicyFactory implements d<f>
{
    public static final PlayerModule_ProvidesHlsErrorHandlingPolicyFactory INSTANCE;
    
    static {
        INSTANCE = new PlayerModule_ProvidesHlsErrorHandlingPolicyFactory();
    }
    
    private PlayerModule_ProvidesHlsErrorHandlingPolicyFactory() {
    }
    
    public static final PlayerModule_ProvidesHlsErrorHandlingPolicyFactory create() {
        return PlayerModule_ProvidesHlsErrorHandlingPolicyFactory.INSTANCE;
    }
    
    public static final f providesHlsErrorHandlingPolicy() {
        final f providesHlsErrorHandlingPolicy = PlayerModule.INSTANCE.providesHlsErrorHandlingPolicy();
        b.m((Object)providesHlsErrorHandlingPolicy);
        return providesHlsErrorHandlingPolicy;
    }
    
    public f get() {
        return providesHlsErrorHandlingPolicy();
    }
}
