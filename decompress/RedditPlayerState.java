// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n" }, d2 = { "Lcom/reddit/video/player/player/RedditPlayerState;", "", "(Ljava/lang/String;I)V", "IDLE", "BUFFERING", "PLAYING", "PAUSED", "ENDED", "TRANSITIONAL", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum RedditPlayerState
{
    BUFFERING;
    
    public static final Companion Companion;
    
    ENDED, 
    IDLE, 
    PAUSED, 
    PLAYING, 
    TRANSITIONAL;
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/video/player/player/RedditPlayerState$Companion;", "", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
