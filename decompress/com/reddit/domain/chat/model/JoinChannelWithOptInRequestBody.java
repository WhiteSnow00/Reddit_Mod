// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/JoinChannelWithOptInRequestBody;", "", "channelUrl", "", "(Ljava/lang/String;)V", "getChannelUrl", "()Ljava/lang/String;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class JoinChannelWithOptInRequestBody
{
    private final String channelUrl;
    
    public JoinChannelWithOptInRequestBody(@n(name = "channel_url") final String channelUrl) {
        this.channelUrl = channelUrl;
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
}
