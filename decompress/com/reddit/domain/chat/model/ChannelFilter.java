// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelFilter;", "", "(Ljava/lang/String;I)V", "ALL", "DMS", "GROUP", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ChannelFilter
{
    ALL;
    
    public static final Companion Companion;
    
    DMS, 
    GROUP;
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelFilter$Companion;", "", "()V", "getChannelFilter", "Lcom/reddit/domain/chat/model/ChannelFilter;", "value", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final ChannelFilter getChannelFilter(final String s) {
            for (final ChannelFilter channelFilter : ChannelFilter.values()) {
                if (f.a((Object)channelFilter.name(), (Object)s)) {
                    return channelFilter;
                }
            }
            return null;
        }
    }
}
