// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamSubredditPromptState;", "", "subreddit", "", "timestamp", "", "type", "Lcom/reddit/domain/model/streaming/StateType;", "(Ljava/lang/String;JLcom/reddit/domain/model/streaming/StateType;)V", "getSubreddit", "()Ljava/lang/String;", "getTimestamp", "()J", "getType", "()Lcom/reddit/domain/model/streaming/StateType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamSubredditPromptState
{
    private final String subreddit;
    private final long timestamp;
    private final StateType type;
    
    public StreamSubredditPromptState(final String subreddit, final long timestamp, final StateType type) {
        f.f((Object)subreddit, "subreddit");
        f.f((Object)type, "type");
        this.subreddit = subreddit;
        this.timestamp = timestamp;
        this.type = type;
    }
    
    public final String component1() {
        return this.subreddit;
    }
    
    public final long component2() {
        return this.timestamp;
    }
    
    public final StateType component3() {
        return this.type;
    }
    
    public final StreamSubredditPromptState copy(final String s, final long n, final StateType stateType) {
        f.f((Object)s, "subreddit");
        f.f((Object)stateType, "type");
        return new StreamSubredditPromptState(s, n, stateType);
    }
    
    @Override
    public boolean equals(final Object o) {
        final String subreddit = this.subreddit;
        final boolean b = o instanceof StreamSubredditPromptState;
        Object subreddit2 = null;
        StreamSubredditPromptState streamSubredditPromptState;
        if (b) {
            streamSubredditPromptState = (StreamSubredditPromptState)o;
        }
        else {
            streamSubredditPromptState = null;
        }
        if (streamSubredditPromptState != null) {
            subreddit2 = streamSubredditPromptState.subreddit;
        }
        return f.a((Object)subreddit, subreddit2);
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final long getTimestamp() {
        return this.timestamp;
    }
    
    public final StateType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return this.subreddit.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamSubredditPromptState(subreddit=");
        k.append(this.subreddit);
        k.append(", timestamp=");
        k.append(this.timestamp);
        k.append(", type=");
        k.append(this.type);
        k.append(')');
        return k.toString();
    }
}
