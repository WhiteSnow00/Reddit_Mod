// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.extensions;

import sg2.e;
import com.reddit.video.player.player.RedditPlayerState;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007" }, d2 = { "fromExoState", "Lcom/reddit/video/player/player/RedditPlayerState;", "Lcom/reddit/video/player/player/RedditPlayerState$Companion;", "playbackState", "", "playWhenReady", "", "player_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ExoExtensionsKt
{
    public static final RedditPlayerState fromExoState(final RedditPlayerState.Companion companion, final int n, final boolean b) {
        e.f((Object)companion, "<this>");
        RedditPlayerState redditPlayerState;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    redditPlayerState = RedditPlayerState.IDLE;
                }
                else {
                    redditPlayerState = RedditPlayerState.ENDED;
                }
            }
            else if (b) {
                redditPlayerState = RedditPlayerState.PLAYING;
            }
            else {
                redditPlayerState = RedditPlayerState.PAUSED;
            }
        }
        else {
            redditPlayerState = RedditPlayerState.BUFFERING;
        }
        return redditPlayerState;
    }
}
