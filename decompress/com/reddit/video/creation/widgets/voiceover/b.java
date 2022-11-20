// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.voiceover;

import java.util.concurrent.TimeUnit;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import com.reddit.data.repository.RedditSubredditRepository;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.domain.chat.model.ChannelMuteStatus;
import cg2.j;
import com.reddit.domain.model.Subreddit;
import ng2.e;
import kotlin.Pair;
import ff2.c;
import ff2.o;

public final class b implements o, c
{
    public final int f;
    
    public b(final int f) {
        this.f = f;
    }
    
    public Object apply(final Object o) {
        switch (this.f) {
            default: {
                final Pair pair = (Pair)o;
                e.f((Object)pair, "<name for destructuring parameter 0>");
                return pair.component1();
            }
            case 0: {
                return VoiceoverPresenter.I((Boolean)o);
            }
        }
    }
    
    public Object apply(final Object o, final Object o2) {
        switch (this.f) {
            default: {
                final Subreddit subreddit = (Subreddit)o;
                final ft1.c c = (ft1.c)o2;
                e.f((Object)subreddit, "it");
                e.f((Object)c, "<anonymous parameter 1>");
                return subreddit;
            }
            case 3: {
                final Boolean b = (Boolean)o2;
                e.f(o, "<anonymous parameter 0>");
                e.f((Object)b, "<anonymous parameter 1>");
                return j.a;
            }
            case 2: {
                final Boolean b2 = (Boolean)o;
                final ChannelMuteStatus channelMuteStatus = (ChannelMuteStatus)o2;
                e.f((Object)b2, "sendbirdEnabled");
                e.f((Object)channelMuteStatus, "channelMuteStatus");
                return !b2 || channelMuteStatus.isMuted();
            }
            case 1: {
                final Subreddit subreddit2 = (Subreddit)o;
                final StructuredStyle structuredStyle = (StructuredStyle)o2;
                final Pair<Long, TimeUnit> g = RedditSubredditRepository.G;
                e.f((Object)subreddit2, "subreddit");
                e.f((Object)structuredStyle, "structuredStyle");
                subreddit2.setStructuredStyle(structuredStyle);
                return subreddit2;
            }
            case 0: {
                final List list = (List)o;
                e.f((Object)list, "a");
                return CollectionsKt___CollectionsKt.p5((Collection)list, o2);
            }
        }
    }
}
