// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelMuteStatus;", "", "channelUrl", "", "isMuted", "", "(Ljava/lang/String;Z)V", "getChannelUrl", "()Ljava/lang/String;", "()Z", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChannelMuteStatus
{
    private final String channelUrl;
    private final boolean isMuted;
    
    public ChannelMuteStatus(@n(name = "channel_url") final String channelUrl, @n(name = "is_muted") final boolean isMuted) {
        f.f((Object)channelUrl, "channelUrl");
        this.channelUrl = channelUrl;
        this.isMuted = isMuted;
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public final boolean isMuted() {
        return this.isMuted;
    }
}
