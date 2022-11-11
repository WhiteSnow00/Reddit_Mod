// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.p;
import com.reddit.domain.model.streaming.StatusResponse;
import com.reddit.data.model.ChatStatusDataModel;
import com.reddit.data.model.StreamChatMessageV2ResponseDataModel;
import com.reddit.data.model.StreamChatMessageResponseDataModel;
import com.reddit.data.model.StreamChatMessageDataModel;
import com.reddit.data.model.StreamCommunityDataModel;
import tg2.c;
import com.reddit.data.model.StreamEligibilityRemoteDataModel;
import com.reddit.domain.model.streaming.ViewerStreamPrompt;
import com.reddit.data.model.Envelope;
import com.reddit.domain.model.streaming.StreamPrompt;
import com.reddit.data.adapter.Enveloped;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import java.util.List;
import com.reddit.domain.model.streaming.StreamListingConfiguration;
import com.reddit.domain.model.streaming.StreamConfiguration;
import av2.f;
import com.reddit.data.model.AutoMuteStatusResponseModel;
import com.reddit.data.model.StreamEnd;
import nf2.a;
import av2.o;
import com.reddit.data.model.StreamBroadcastRemoteDataModel;
import nf2.c0;
import av2.t;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J1\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u0005H'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0005H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'J\u0012\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0012\u0010\u0017\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0012\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0012\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005H'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010$\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%H'J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%H'J'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b-\u0010,J1\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b.\u0010/J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0005H'J\u001e\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u001c\u00106\u001a\u00020\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H'J'\u0010:\u001a\u0002092\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u000207H§@\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'J5\u0010B\u001a\u00020A2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010?\u001a\u00020\b2\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\bH§@\u00f8\u0001\u0000¢\u0006\u0004\bB\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D" }, d2 = { "Lcom/reddit/data/remote/RemoteStreamDataSource;", "", "", "subreddit", "title", "Lnf2/c0;", "Lcom/reddit/data/model/StreamBroadcastRemoteDataModel;", "broadcastStream", "", "seed", "pageSize", "", "Lcom/reddit/data/model/StreamVideoDataRemoteDataModel;", "getStreams", "(ILjava/lang/Integer;)Lnf2/c0;", "Lcom/reddit/domain/model/streaming/StreamPrompt;", "getRecommendedBroadcastPrompts", "getRecommendedBroadcastSubreddits", "id", "getStream", "streamId", "Lnf2/a;", "upvote", "downvote", "removeVote", "killBroadcast", "Lcom/reddit/data/model/StreamEnd;", "endBroadcast", "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "getConfiguration", "source", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration;", "getListingStreamConfiguration", "getHomeStreamConfiguration", "Lcom/reddit/data/model/StreamEligibilityRemoteDataModel;", "getStreamerSubredditEligibility", "sendHeartbeat", "Lcom/reddit/data/model/StreamChatMessageDataModel;", "model", "Lcom/reddit/data/model/StreamChatMessageResponseDataModel;", "sendComment", "Lcom/reddit/data/model/StreamChatMessageV2ResponseDataModel;", "sendCommentV2", "getHomeStreams", "(Ljava/lang/Integer;)Lnf2/c0;", "getPopularStreams", "getSubredditStreams", "(Ljava/lang/String;Ljava/lang/Integer;)Lnf2/c0;", "getViewerSubreddits", "Lcom/reddit/data/model/Envelope;", "Lcom/reddit/domain/model/streaming/ViewerStreamPrompt;", "getRecommendedViewerPrompts", "", "spam", "modRemove", "Lcom/reddit/data/model/ChatStatusDataModel;", "data", "Lcom/reddit/domain/model/streaming/StatusResponse;", "updateChatStatus", "(Ljava/lang/String;Lcom/reddit/data/model/ChatStatusDataModel;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/data/model/AutoMuteStatusResponseModel;", "getAutoMuteStatus", "query", "count", "cursor", "Lcom/reddit/data/model/StreamCommunityDataModel;", "searchSubreddits", "(Ljava/lang/String;ILjava/lang/Integer;Ltg2/c;)Ljava/lang/Object;", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteStreamDataSource
{
    @o("/r/{subreddit}/broadcasts")
    c0<StreamBroadcastRemoteDataModel> broadcastStream(@s("subreddit") final String p0, @t("title") final String p1);
    
    @o("/videos/{id}/vote/down")
    a downvote(@s("id") final String p0);
    
    @o("/videos/{id}/end")
    c0<StreamEnd> endBroadcast(@s("id") final String p0);
    
    @f("/broadcasts/{id}/auto_mute_status")
    c0<AutoMuteStatusResponseModel> getAutoMuteStatus(@s("id") final String p0);
    
    @f("/rpan_config_v1")
    c0<StreamConfiguration> getConfiguration();
    
    @f("/config")
    c0<StreamListingConfiguration> getHomeStreamConfiguration();
    
    @f("/broadcasts")
    @Enveloped
    c0<List<StreamVideoDataRemoteDataModel>> getHomeStreams(@t("page_size") final Integer p0);
    
    @f("/r/{listing}/config")
    c0<StreamListingConfiguration> getListingStreamConfiguration(@s("listing") final String p0);
    
    @f("r/popular/broadcasts")
    @Enveloped
    c0<List<StreamVideoDataRemoteDataModel>> getPopularStreams(@t("page_size") final Integer p0);
    
    @f("/recommended_broadcaster_prompts")
    @Enveloped
    c0<List<StreamPrompt>> getRecommendedBroadcastPrompts();
    
    @f("/recommended_broadcast_subreddits")
    @Enveloped
    c0<List<String>> getRecommendedBroadcastSubreddits();
    
    @f("/recommended_viewer_prompt")
    c0<Envelope<ViewerStreamPrompt>> getRecommendedViewerPrompts(@t("video_id") final String p0);
    
    @f("/videos/{id}")
    @Enveloped
    c0<StreamVideoDataRemoteDataModel> getStream(@s("id") final String p0);
    
    @f("/r/{subreddit}/broadcast_eligibility")
    @Enveloped
    c0<StreamEligibilityRemoteDataModel> getStreamerSubredditEligibility(@s("subreddit") final String p0);
    
    @f("/videos/seed/{seed}")
    @Enveloped
    c0<List<StreamVideoDataRemoteDataModel>> getStreams(@s("seed") final int p0, @t("page_size") final Integer p1);
    
    @f("r/{subreddit}/broadcasts")
    @Enveloped
    c0<List<StreamVideoDataRemoteDataModel>> getSubredditStreams(@s("subreddit") final String p0, @t("page_size") final Integer p1);
    
    @f("/recommended_viewer_subreddits")
    @Enveloped
    c0<List<String>> getViewerSubreddits();
    
    @o("/videos/{id}/kill")
    a killBroadcast(@s("id") final String p0);
    
    @o("/api/remove")
    a modRemove(@t("id") final String p0, @t("spam") final boolean p1);
    
    @o("/videos/{id}/vote/unset")
    a removeVote(@s("id") final String p0);
    
    @f("/search/subreddits")
    Object searchSubreddits(@t("q") final String p0, @t("count") final int p1, @t("cursor") final Integer p2, final c<? super StreamCommunityDataModel> p3);
    
    @o("/videos/{stream_id}/comment")
    c0<StreamChatMessageResponseDataModel> sendComment(@s("stream_id") final String p0, @av2.a final StreamChatMessageDataModel p1);
    
    @o("/broadcasts/{stream_id}/comment_v2")
    c0<StreamChatMessageV2ResponseDataModel> sendCommentV2(@s("stream_id") final String p0, @av2.a final StreamChatMessageDataModel p1);
    
    @o("/videos/{id}/heartbeat")
    a sendHeartbeat(@s("id") final String p0);
    
    @p("/broadcasts/{broadcast_id}")
    Object updateChatStatus(@s("broadcast_id") final String p0, @av2.a final ChatStatusDataModel p1, final c<? super StatusResponse> p2);
    
    @o("/videos/{id}/vote/up")
    a upvote(@s("id") final String p0);
}
