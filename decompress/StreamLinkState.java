// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.vote.VoteDirection;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamLinkState;", "", "streamId", "", "voteDirection", "Lcom/reddit/domain/model/vote/VoteDirection;", "(Ljava/lang/String;Lcom/reddit/domain/model/vote/VoteDirection;)V", "getStreamId", "()Ljava/lang/String;", "setStreamId", "(Ljava/lang/String;)V", "getVoteDirection", "()Lcom/reddit/domain/model/vote/VoteDirection;", "setVoteDirection", "(Lcom/reddit/domain/model/vote/VoteDirection;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamLinkState
{
    private String streamId;
    private VoteDirection voteDirection;
    
    public StreamLinkState(final String streamId, final VoteDirection voteDirection) {
        f.f((Object)streamId, "streamId");
        f.f((Object)voteDirection, "voteDirection");
        this.streamId = streamId;
        this.voteDirection = voteDirection;
    }
    
    public final String component1() {
        return this.streamId;
    }
    
    public final VoteDirection component2() {
        return this.voteDirection;
    }
    
    public final StreamLinkState copy(final String s, final VoteDirection voteDirection) {
        f.f((Object)s, "streamId");
        f.f((Object)voteDirection, "voteDirection");
        return new StreamLinkState(s, voteDirection);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamLinkState)) {
            return false;
        }
        final StreamLinkState streamLinkState = (StreamLinkState)o;
        return f.a((Object)this.streamId, (Object)streamLinkState.streamId) && this.voteDirection == streamLinkState.voteDirection;
    }
    
    public final String getStreamId() {
        return this.streamId;
    }
    
    public final VoteDirection getVoteDirection() {
        return this.voteDirection;
    }
    
    @Override
    public int hashCode() {
        return this.voteDirection.hashCode() + this.streamId.hashCode() * 31;
    }
    
    public final void setStreamId(final String streamId) {
        f.f((Object)streamId, "<set-?>");
        this.streamId = streamId;
    }
    
    public final void setVoteDirection(final VoteDirection voteDirection) {
        f.f((Object)voteDirection, "<set-?>");
        this.voteDirection = voteDirection;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamLinkState(streamId=");
        k.append(this.streamId);
        k.append(", voteDirection=");
        k.append(this.voteDirection);
        k.append(')');
        return k.toString();
    }
}
