// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/CreateChannelResponse;", "", "channelUrl", "", "subredditId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannelUrl", "()Ljava/lang/String;", "getSubredditId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CreateChannelResponse
{
    private final String channelUrl;
    private final String subredditId;
    
    public CreateChannelResponse(@n(name = "channel_url") final String channelUrl, @n(name = "subreddit_id") final String subredditId) {
        e.f((Object)channelUrl, "channelUrl");
        this.channelUrl = channelUrl;
        this.subredditId = subredditId;
    }
    
    public final String component1() {
        return this.channelUrl;
    }
    
    public final String component2() {
        return this.subredditId;
    }
    
    public final CreateChannelResponse copy(@n(name = "channel_url") final String s, @n(name = "subreddit_id") final String s2) {
        e.f((Object)s, "channelUrl");
        return new CreateChannelResponse(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateChannelResponse)) {
            return false;
        }
        final CreateChannelResponse createChannelResponse = (CreateChannelResponse)o;
        return e.a((Object)this.channelUrl, (Object)createChannelResponse.channelUrl) && e.a((Object)this.subredditId, (Object)createChannelResponse.subredditId);
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.channelUrl.hashCode();
        final String subredditId = this.subredditId;
        int hashCode2;
        if (subredditId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subredditId.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("CreateChannelResponse(channelUrl=");
        r.append(this.channelUrl);
        r.append(", subredditId=");
        return f0.n(r, this.subredditId, ')');
    }
}
