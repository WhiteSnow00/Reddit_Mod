// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import java.util.List;
import p1.h;
import aq2.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JP\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdConfig;", "", "proxyHost", "", "maxMessageLength", "", "typeAheadMinChars", "autoloadMessagesMaxAttempts", "reactionsConfig", "Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;", "mediaHost", "(Ljava/lang/String;IILjava/lang/Integer;Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;Ljava/lang/String;)V", "getAutoloadMessagesMaxAttempts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxMessageLength", "()I", "getMediaHost", "()Ljava/lang/String;", "getProxyHost", "getReactionsConfig", "()Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;", "getTypeAheadMinChars", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/lang/Integer;Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;Ljava/lang/String;)Lcom/reddit/domain/chat/model/SendBirdConfig;", "equals", "", "other", "hashCode", "toString", "ReactionsConfig", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SendBirdConfig
{
    private final Integer autoloadMessagesMaxAttempts;
    private final int maxMessageLength;
    private final String mediaHost;
    private final String proxyHost;
    private final ReactionsConfig reactionsConfig;
    private final int typeAheadMinChars;
    
    public SendBirdConfig(@n(name = "proxy_host") final String proxyHost, @n(name = "max_message_length") final int maxMessageLength, @n(name = "type_ahead_min_chars") final int typeAheadMinChars, @n(name = "autoload_messages_max_attempts") final Integer autoloadMessagesMaxAttempts, @n(name = "reactions") final ReactionsConfig reactionsConfig, @n(name = "media_host") final String mediaHost) {
        e.f((Object)proxyHost, "proxyHost");
        this.proxyHost = proxyHost;
        this.maxMessageLength = maxMessageLength;
        this.typeAheadMinChars = typeAheadMinChars;
        this.autoloadMessagesMaxAttempts = autoloadMessagesMaxAttempts;
        this.reactionsConfig = reactionsConfig;
        this.mediaHost = mediaHost;
    }
    
    public SendBirdConfig(final String s, final int n, final int n2, Integer n3, ReactionsConfig reactionsConfig, String s2, final int n4, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x8) != 0x0) {
            n3 = null;
        }
        if ((n4 & 0x10) != 0x0) {
            reactionsConfig = null;
        }
        if ((n4 & 0x20) != 0x0) {
            s2 = null;
        }
        this(s, n, n2, n3, reactionsConfig, s2);
    }
    
    public static SendBirdConfig copy$default(final SendBirdConfig sendBirdConfig, String proxyHost, int maxMessageLength, int typeAheadMinChars, Integer autoloadMessagesMaxAttempts, ReactionsConfig reactionsConfig, String mediaHost, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            proxyHost = sendBirdConfig.proxyHost;
        }
        if ((n & 0x2) != 0x0) {
            maxMessageLength = sendBirdConfig.maxMessageLength;
        }
        if ((n & 0x4) != 0x0) {
            typeAheadMinChars = sendBirdConfig.typeAheadMinChars;
        }
        if ((n & 0x8) != 0x0) {
            autoloadMessagesMaxAttempts = sendBirdConfig.autoloadMessagesMaxAttempts;
        }
        if ((n & 0x10) != 0x0) {
            reactionsConfig = sendBirdConfig.reactionsConfig;
        }
        if ((n & 0x20) != 0x0) {
            mediaHost = sendBirdConfig.mediaHost;
        }
        return sendBirdConfig.copy(proxyHost, maxMessageLength, typeAheadMinChars, autoloadMessagesMaxAttempts, reactionsConfig, mediaHost);
    }
    
    public final String component1() {
        return this.proxyHost;
    }
    
    public final int component2() {
        return this.maxMessageLength;
    }
    
    public final int component3() {
        return this.typeAheadMinChars;
    }
    
    public final Integer component4() {
        return this.autoloadMessagesMaxAttempts;
    }
    
    public final ReactionsConfig component5() {
        return this.reactionsConfig;
    }
    
    public final String component6() {
        return this.mediaHost;
    }
    
    public final SendBirdConfig copy(@n(name = "proxy_host") final String s, @n(name = "max_message_length") final int n, @n(name = "type_ahead_min_chars") final int n2, @n(name = "autoload_messages_max_attempts") final Integer n3, @n(name = "reactions") final ReactionsConfig reactionsConfig, @n(name = "media_host") final String s2) {
        e.f((Object)s, "proxyHost");
        return new SendBirdConfig(s, n, n2, n3, reactionsConfig, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendBirdConfig)) {
            return false;
        }
        final SendBirdConfig sendBirdConfig = (SendBirdConfig)o;
        return e.a((Object)this.proxyHost, (Object)sendBirdConfig.proxyHost) && this.maxMessageLength == sendBirdConfig.maxMessageLength && this.typeAheadMinChars == sendBirdConfig.typeAheadMinChars && e.a((Object)this.autoloadMessagesMaxAttempts, (Object)sendBirdConfig.autoloadMessagesMaxAttempts) && e.a((Object)this.reactionsConfig, (Object)sendBirdConfig.reactionsConfig) && e.a((Object)this.mediaHost, (Object)sendBirdConfig.mediaHost);
    }
    
    public final Integer getAutoloadMessagesMaxAttempts() {
        return this.autoloadMessagesMaxAttempts;
    }
    
    public final int getMaxMessageLength() {
        return this.maxMessageLength;
    }
    
    public final String getMediaHost() {
        return this.mediaHost;
    }
    
    public final String getProxyHost() {
        return this.proxyHost;
    }
    
    public final ReactionsConfig getReactionsConfig() {
        return this.reactionsConfig;
    }
    
    public final int getTypeAheadMinChars() {
        return this.typeAheadMinChars;
    }
    
    @Override
    public int hashCode() {
        final int c = a.c(this.typeAheadMinChars, a.c(this.maxMessageLength, this.proxyHost.hashCode() * 31, 31), 31);
        final Integer autoloadMessagesMaxAttempts = this.autoloadMessagesMaxAttempts;
        int hashCode = 0;
        int hashCode2;
        if (autoloadMessagesMaxAttempts == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = autoloadMessagesMaxAttempts.hashCode();
        }
        final ReactionsConfig reactionsConfig = this.reactionsConfig;
        int hashCode3;
        if (reactionsConfig == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = reactionsConfig.hashCode();
        }
        final String mediaHost = this.mediaHost;
        if (mediaHost != null) {
            hashCode = mediaHost.hashCode();
        }
        return ((c + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SendBirdConfig(proxyHost=");
        t.append(this.proxyHost);
        t.append(", maxMessageLength=");
        t.append(this.maxMessageLength);
        t.append(", typeAheadMinChars=");
        t.append(this.typeAheadMinChars);
        t.append(", autoloadMessagesMaxAttempts=");
        t.append(this.autoloadMessagesMaxAttempts);
        t.append(", reactionsConfig=");
        t.append(this.reactionsConfig);
        t.append(", mediaHost=");
        return h.c(t, this.mediaHost, ')');
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J3\u0010\u0010\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdConfig$ReactionsConfig;", "", "defaultReactions", "", "Lcom/reddit/domain/chat/model/ChatReaction;", "doubleTapReaction", "tripleTapReaction", "(Ljava/util/List;Lcom/reddit/domain/chat/model/ChatReaction;Lcom/reddit/domain/chat/model/ChatReaction;)V", "getDefaultReactions", "()Ljava/util/List;", "getDoubleTapReaction", "()Lcom/reddit/domain/chat/model/ChatReaction;", "getTripleTapReaction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ReactionsConfig
    {
        private final List<ChatReaction> defaultReactions;
        private final ChatReaction doubleTapReaction;
        private final ChatReaction tripleTapReaction;
        
        public ReactionsConfig() {
            this(null, null, null, 7, null);
        }
        
        public ReactionsConfig(@n(name = "short_list") final List<ChatReaction> defaultReactions, @n(name = "double_tap") final ChatReaction doubleTapReaction, @n(name = "triple_tap") final ChatReaction tripleTapReaction) {
            this.defaultReactions = defaultReactions;
            this.doubleTapReaction = doubleTapReaction;
            this.tripleTapReaction = tripleTapReaction;
        }
        
        public ReactionsConfig(List list, ChatReaction chatReaction, ChatReaction chatReaction2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x1) != 0x0) {
                list = null;
            }
            if ((n & 0x2) != 0x0) {
                chatReaction = null;
            }
            if ((n & 0x4) != 0x0) {
                chatReaction2 = null;
            }
            this(list, chatReaction, chatReaction2);
        }
        
        public static ReactionsConfig copy$default(final ReactionsConfig reactionsConfig, List defaultReactions, ChatReaction doubleTapReaction, ChatReaction tripleTapReaction, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                defaultReactions = reactionsConfig.defaultReactions;
            }
            if ((n & 0x2) != 0x0) {
                doubleTapReaction = reactionsConfig.doubleTapReaction;
            }
            if ((n & 0x4) != 0x0) {
                tripleTapReaction = reactionsConfig.tripleTapReaction;
            }
            return reactionsConfig.copy(defaultReactions, doubleTapReaction, tripleTapReaction);
        }
        
        public final List<ChatReaction> component1() {
            return this.defaultReactions;
        }
        
        public final ChatReaction component2() {
            return this.doubleTapReaction;
        }
        
        public final ChatReaction component3() {
            return this.tripleTapReaction;
        }
        
        public final ReactionsConfig copy(@n(name = "short_list") final List<ChatReaction> list, @n(name = "double_tap") final ChatReaction chatReaction, @n(name = "triple_tap") final ChatReaction chatReaction2) {
            return new ReactionsConfig(list, chatReaction, chatReaction2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ReactionsConfig)) {
                return false;
            }
            final ReactionsConfig reactionsConfig = (ReactionsConfig)o;
            return e.a((Object)this.defaultReactions, (Object)reactionsConfig.defaultReactions) && e.a((Object)this.doubleTapReaction, (Object)reactionsConfig.doubleTapReaction) && e.a((Object)this.tripleTapReaction, (Object)reactionsConfig.tripleTapReaction);
        }
        
        public final List<ChatReaction> getDefaultReactions() {
            return this.defaultReactions;
        }
        
        public final ChatReaction getDoubleTapReaction() {
            return this.doubleTapReaction;
        }
        
        public final ChatReaction getTripleTapReaction() {
            return this.tripleTapReaction;
        }
        
        @Override
        public int hashCode() {
            final List<ChatReaction> defaultReactions = this.defaultReactions;
            int hashCode = 0;
            int hashCode2;
            if (defaultReactions == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = defaultReactions.hashCode();
            }
            final ChatReaction doubleTapReaction = this.doubleTapReaction;
            int hashCode3;
            if (doubleTapReaction == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = doubleTapReaction.hashCode();
            }
            final ChatReaction tripleTapReaction = this.tripleTapReaction;
            if (tripleTapReaction != null) {
                hashCode = tripleTapReaction.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("ReactionsConfig(defaultReactions=");
            t.append(this.defaultReactions);
            t.append(", doubleTapReaction=");
            t.append(this.doubleTapReaction);
            t.append(", tripleTapReaction=");
            t.append(this.tripleTapReaction);
            t.append(')');
            return t.toString();
        }
    }
}
