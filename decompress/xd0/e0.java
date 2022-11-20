// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.streaming.StreamCommunityResult;
import gg2.c;
import com.reddit.domain.model.streaming.StreamListingType;
import com.reddit.domain.model.streaming.SubscriptionInfo;
import com.reddit.domain.model.streaming.StreamListingConfiguration;
import com.reddit.domain.model.streaming.StreamLinkState;
import af2.n;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import com.reddit.domain.model.streaming.StreamingEligibility;
import com.reddit.domain.model.streaming.StreamVideoData;
import com.reddit.domain.model.streaming.StreamPrompt;
import java.util.List;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import com.reddit.domain.model.StreamCommentWithStatus;
import com.reddit.domain.model.Result;
import java.util.Set;
import af2.a;
import com.reddit.domain.model.streaming.StateType;
import com.reddit.domain.model.streaming.StreamBroadcast;
import af2.c0;

public interface e0
{
    void a(final String p0);
    
    void b(final String p0);
    
    c0<StreamBroadcast> broadcastStream(final String p0, final String p1);
    
    a c(final long p0, final StateType p1);
    
    Set<String> d();
    
    a downvote(final String p0);
    
    c0<Result<StreamCommentWithStatus>> e(final String p0, final String p1);
    
    c0<String> endBroadcast(final String p0);
    
    c0<String> f(final String p0);
    
    c0<Boolean> g(final String p0);
    
    c0<AutoMuteStatus> getAutoMuteStatus(final String p0);
    
    c0<List<StreamPrompt>> getRecommendedBroadcastPrompts();
    
    c0<StreamVideoData> getStream(final String p0);
    
    c0<StreamingEligibility> getStreamerSubredditEligibility(final String p0);
    
    c0<List<StreamVideoData>> getSubredditStreams(final String p0, final Integer p1);
    
    c0<List<StreamSubredditPromptState>> h(final StateType p0);
    
    n<StreamLinkState> i(final String p0);
    
    c0<StreamListingConfiguration> j(final boolean p0);
    
    a k(final StreamSubredditPromptState p0);
    
    c0<SubscriptionInfo> l(final String p0, final String p1);
    
    c0<Boolean> m(final String p0);
    
    c0<List<StreamVideoData>> n(final StreamListingType p0, final Integer p1);
    
    c0<Boolean> o(final String p0);
    
    c0<StreamListingConfiguration> p(final String p0, final boolean p1);
    
    c0<List<String>> q();
    
    a removeVote(final String p0);
    
    Object searchSubreddits(final String p0, final int p1, final Integer p2, final c<? super StreamCommunityResult> p3);
    
    a sendHeartbeat(final String p0);
    
    a upvote(final String p0);
}
