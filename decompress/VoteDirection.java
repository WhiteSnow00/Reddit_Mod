// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.vote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/model/vote/VoteDirection;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UP", "NONE", "DOWN", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum VoteDirection
{
    public static final Companion Companion;
    
    DOWN(-1), 
    NONE(0), 
    UP(1);
    
    private final int value;
    
    static {
        Companion = new Companion(null);
    }
    
    private VoteDirection(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/vote/VoteDirection$Companion;", "", "()V", "fromInt", "Lcom/reddit/domain/model/vote/VoteDirection;", "direction", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final VoteDirection fromInt(final int n) {
            VoteDirection voteDirection;
            if (n != -1) {
                if (n != 0) {
                    if (n != 1) {
                        throw new IllegalArgumentException(d.h("Invalid direction value: ", n));
                    }
                    voteDirection = VoteDirection.UP;
                }
                else {
                    voteDirection = VoteDirection.NONE;
                }
            }
            else {
                voteDirection = VoteDirection.DOWN;
            }
            return voteDirection;
        }
    }
}
