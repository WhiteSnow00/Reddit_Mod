// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelPage;", "", "()V", "Initial", "Ready", "Refresh", "Lcom/reddit/domain/chat/model/ChannelPage$Initial;", "Lcom/reddit/domain/chat/model/ChannelPage$Ready;", "Lcom/reddit/domain/chat/model/ChannelPage$Refresh;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ChannelPage
{
    private ChannelPage() {
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelPage$Initial;", "Lcom/reddit/domain/chat/model/ChannelPage;", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Initial extends ChannelPage
    {
        public static final Initial INSTANCE;
        
        static {
            INSTANCE = new Initial();
        }
        
        private Initial() {
            super(null);
        }
    }
    
    @Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelPage$Ready;", "Lcom/reddit/domain/chat/model/ChannelPage;", "channels", "", "Lcom/reddit/domain/chat/model/ChatChannel;", "hasNextPage", "", "endCursor", "", "(Ljava/util/List;ZLjava/lang/String;)V", "getChannels", "()Ljava/util/List;", "getEndCursor", "()Ljava/lang/String;", "getHasNextPage", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Ready extends ChannelPage
    {
        private final List<ChatChannel> channels;
        private final String endCursor;
        private final boolean hasNextPage;
        
        public Ready(final List<ChatChannel> channels, final boolean hasNextPage, final String endCursor) {
            f.f((Object)channels, "channels");
            super(null);
            this.channels = channels;
            this.hasNextPage = hasNextPage;
            this.endCursor = endCursor;
        }
        
        public final List<ChatChannel> component1() {
            return this.channels;
        }
        
        public final boolean component2() {
            return this.hasNextPage;
        }
        
        public final String component3() {
            return this.endCursor;
        }
        
        public final Ready copy(final List<ChatChannel> list, final boolean b, final String s) {
            f.f((Object)list, "channels");
            return new Ready(list, b, s);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Ready)) {
                return false;
            }
            final Ready ready = (Ready)o;
            return f.a((Object)this.channels, (Object)ready.channels) && this.hasNextPage == ready.hasNextPage && f.a((Object)this.endCursor, (Object)ready.endCursor);
        }
        
        public final List<ChatChannel> getChannels() {
            return this.channels;
        }
        
        public final String getEndCursor() {
            return this.endCursor;
        }
        
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.channels.hashCode();
            int hasNextPage;
            if ((hasNextPage = (this.hasNextPage ? 1 : 0)) != 0) {
                hasNextPage = 1;
            }
            final String endCursor = this.endCursor;
            int hashCode2;
            if (endCursor == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = endCursor.hashCode();
            }
            return (hashCode * 31 + hasNextPage) * 31 + hashCode2;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Ready(channels=");
            k.append(this.channels);
            k.append(", hasNextPage=");
            k.append(this.hasNextPage);
            k.append(", endCursor=");
            return b.k(k, this.endCursor, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelPage$Refresh;", "Lcom/reddit/domain/chat/model/ChannelPage;", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Refresh extends ChannelPage
    {
        public static final Refresh INSTANCE;
        
        static {
            INSTANCE = new Refresh();
        }
        
        private Refresh() {
            super(null);
        }
    }
}
