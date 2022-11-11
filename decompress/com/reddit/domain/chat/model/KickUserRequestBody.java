// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r" }, d2 = { "Lcom/reddit/domain/chat/model/KickUserRequestBody;", "", "userId", "", "channelUrl", "seconds", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getChannelUrl", "()Ljava/lang/String;", "getSeconds", "()I", "getUserId", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class KickUserRequestBody
{
    private final String channelUrl;
    private final int seconds;
    private final String userId;
    
    public KickUserRequestBody(@n(name = "user_id") final String userId, @n(name = "channel_url") final String channelUrl, @n(name = "seconds") final int seconds) {
        e.f((Object)userId, "userId");
        e.f((Object)channelUrl, "channelUrl");
        this.userId = userId;
        this.channelUrl = channelUrl;
        this.seconds = seconds;
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public final int getSeconds() {
        return this.seconds;
    }
    
    public final String getUserId() {
        return this.userId;
    }
}
