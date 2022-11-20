// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/twilio/live/player/PlayerState;", "", "(Ljava/lang/String;I)V", "isValidTransition", "", "nextState", "isValidTransition$player_release", "IDLE", "READY", "BUFFERING", "PLAYING", "ENDED", "player_release" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public enum PlayerState
{
    private static final PlayerState[] $VALUES;
    
    BUFFERING, 
    ENDED, 
    IDLE, 
    PLAYING, 
    READY;
    
    private static final PlayerState[] $values() {
        return new PlayerState[] { PlayerState.IDLE, PlayerState.READY, PlayerState.BUFFERING, PlayerState.PLAYING, PlayerState.ENDED };
    }
    
    static {
        $VALUES = $values();
    }
    
    public final boolean isValidTransition$player_release(final PlayerState playerState) {
        e.f((Object)playerState, "nextState");
        final int n = a.a[this.ordinal()];
        boolean b = false;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            return b;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    else if (playerState != PlayerState.PLAYING && playerState != PlayerState.IDLE) {
                        if (playerState != PlayerState.ENDED) {
                            return b;
                        }
                    }
                }
                else if (playerState != PlayerState.IDLE && playerState != PlayerState.BUFFERING) {
                    if (playerState != PlayerState.ENDED) {
                        return b;
                    }
                }
            }
            else if (playerState != PlayerState.IDLE && playerState != PlayerState.PLAYING && playerState != PlayerState.BUFFERING) {
                if (playerState != PlayerState.ENDED) {
                    return b;
                }
            }
        }
        else if (playerState != PlayerState.READY && playerState != PlayerState.ENDED) {
            return b;
        }
        b = true;
        return b;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PlayerState.values().length];
            a2[PlayerState.IDLE.ordinal()] = 1;
            a2[PlayerState.READY.ordinal()] = 2;
            a2[PlayerState.PLAYING.ordinal()] = 3;
            a2[PlayerState.BUFFERING.ordinal()] = 4;
            a2[PlayerState.ENDED.ordinal()] = 5;
            a = a2;
        }
    }
}
