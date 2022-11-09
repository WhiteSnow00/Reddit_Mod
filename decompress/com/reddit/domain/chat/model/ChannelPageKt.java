// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004" }, d2 = { "isEmpty", "", "Lcom/reddit/domain/chat/model/ChannelPage$Ready;", "(Lcom/reddit/domain/chat/model/ChannelPage$Ready;)Z", "domain_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ChannelPageKt
{
    public static final boolean isEmpty(final ChannelPage.Ready ready) {
        f.f((Object)ready, "<this>");
        return ready.getChannels().isEmpty();
    }
}
