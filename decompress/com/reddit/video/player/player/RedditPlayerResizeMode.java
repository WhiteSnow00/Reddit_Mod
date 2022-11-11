// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r" }, d2 = { "Lcom/reddit/video/player/player/RedditPlayerResizeMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FILL", "FIT", "ZOOM", "FIXED_WIDTH", "FIXED_HEIGHT", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum RedditPlayerResizeMode
{
    public static final Companion Companion;
    
    FILL(3), 
    FIT(0), 
    FIXED_HEIGHT(2), 
    FIXED_WIDTH(1), 
    ZOOM(4);
    
    private final int value;
    
    static {
        Companion = new Companion(null);
    }
    
    private RedditPlayerResizeMode(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/player/RedditPlayerResizeMode$Companion;", "", "()V", "fromInt", "Lcom/reddit/video/player/player/RedditPlayerResizeMode;", "value", "", "fromInt$player_release", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final RedditPlayerResizeMode fromInt$player_release(final int n) {
            RedditPlayerResizeMode redditPlayerResizeMode;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                throw new IllegalArgumentException();
                            }
                            redditPlayerResizeMode = RedditPlayerResizeMode.ZOOM;
                        }
                        else {
                            redditPlayerResizeMode = RedditPlayerResizeMode.FILL;
                        }
                    }
                    else {
                        redditPlayerResizeMode = RedditPlayerResizeMode.FIXED_HEIGHT;
                    }
                }
                else {
                    redditPlayerResizeMode = RedditPlayerResizeMode.FIXED_WIDTH;
                }
            }
            else {
                redditPlayerResizeMode = RedditPlayerResizeMode.FIT;
            }
            return redditPlayerResizeMode;
        }
    }
}
