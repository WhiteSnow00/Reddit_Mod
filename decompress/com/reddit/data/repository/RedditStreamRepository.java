// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.streaming.StreamCommunity;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.streaming.CommunityRule;
import com.reddit.data.model.CommunityRuleDataModel;
import com.reddit.data.model.StreamCommunityData;
import java.util.ArrayList;
import ig2.m;
import com.reddit.data.model.StreamCommunityDataModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.streaming.StreamCommunityResult;
import com.reddit.data.model.VoteState;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.streaming.Stream;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import z50.r;
import com.reddit.domain.model.streaming.StreamListingType;
import com.reddit.queries.j9;
import v10.v;
import com.reddit.common.ThingType;
import java.util.Map;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.queries.fa;
import com.reddit.domain.model.streaming.SubscriptionInfo;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.streaming.StreamListingConfiguration;
import com.reddit.domain.model.streaming.StreamLinkState;
import ff2.n;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import com.reddit.domain.model.streaming.StreamingEligibility;
import z50.q;
import com.reddit.domain.model.streaming.StreamVideoData;
import z50.f0;
import com.reddit.domain.model.streaming.StreamPrompt;
import java.util.List;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import lg2.c;
import z50.n1;
import z50.q0;
import com.reddit.data.model.StreamChatMessageDataModel;
import com.reddit.domain.model.StreamCommentWithStatus;
import com.reddit.domain.model.Result;
import b60.s;
import com.reddit.domain.model.vote.VoteDirection;
import yd.b;
import com.reddit.domain.model.streaming.StateType;
import n20.d;
import z50.r1;
import kf2.o;
import z50.q1;
import com.reddit.domain.model.streaming.StreamBroadcast;
import java.util.Set;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import va0.c0;
import f22.p;
import v40.l0;
import com.reddit.data.mapper.StreamingPostTransformer;
import n20.a;
import com.squareup.moshi.y;
import v40.m0;
import v40.k0;
import com.reddit.data.remote.RemoteStreamDataSource;
import com.reddit.data.remote.RemoteGqlStreamDataSource;
import ua0.k;
import xd0.d0;

public final class RedditStreamRepository implements d0
{
    public final k a;
    public final RemoteGqlStreamDataSource b;
    public final RemoteStreamDataSource c;
    public final k0 d;
    public final m0 e;
    public final y f;
    public final n20.a g;
    public final StreamingPostTransformer h;
    public final l0 i;
    public final p j;
    public final c0 k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final f p;
    public final f q;
    
    @Inject
    public RedditStreamRepository(final k a, final RemoteGqlStreamDataSource b, final RemoteStreamDataSource c, final k0 d, final m0 e, final y f, final n20.a g, final StreamingPostTransformer h, final l0 i, final p j, final c0 k) {
        sg2.e.f((Object)a, "userSettings");
        sg2.e.f((Object)b, "remoteGql");
        sg2.e.f((Object)c, "remote");
        sg2.e.f((Object)d, "local");
        sg2.e.f((Object)e, "localStreamStateDataSource");
        sg2.e.f((Object)f, "moshi");
        sg2.e.f((Object)g, "backgroundThread");
        sg2.e.f((Object)h, "streamingPostTransformer");
        sg2.e.f((Object)i, "localStreamLinkStateDataSource");
        sg2.e.f((Object)j, "trackingDelegate");
        sg2.e.f((Object)k, "streamFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = kotlin.a.b((rg2.a)new RedditStreamRepository$broadcastErrorAdapter$2(this));
        this.m = kotlin.a.b((rg2.a)new RedditStreamRepository$reportedStreamIds$2(this));
        this.n = kotlin.a.b((rg2.a)new RedditStreamRepository$endedStreamIds$2(this));
        this.o = kotlin.a.b((rg2.a)new RedditStreamRepository$store$2(this));
        this.p = kotlin.a.b((rg2.a)new RedditStreamRepository$streamHomeConfigStore$2(this));
        this.q = kotlin.a.b((rg2.a)new RedditStreamRepository$listingStreamConfigStore$2(this));
    }
    
    public final void a(final String s) {
        sg2.e.f((Object)s, "streamId");
        this.m.getValue().add(s);
        this.d.a(s);
    }
    
    public final void b(final String s) {
        sg2.e.f((Object)s, "streamId");
        this.n.getValue().add(s);
        this.d.b(s);
    }
    
    public final ff2.c0<StreamBroadcast> broadcastStream(final String s, final String s2) {
        sg2.e.f((Object)s, "title");
        sg2.e.f((Object)s2, "destination");
        final ff2.c0 b = this.c.broadcastStream(s2, s).w((o)new q1(this, 2)).B((o)new r1(this, 1));
        sg2.e.e((Object)b, "remote\n      .broadcastS\u2026t = Status.ERROR)\n      }");
        return nn0.a.V((ff2.c0)b, (d)this.g);
    }
    
    public final ff2.a c(final long n, final StateType stateType) {
        sg2.e.f((Object)stateType, "type");
        return yd.b.i0(this.e.c(n, stateType), (d)this.g);
    }
    
    public final Set<String> d() {
        return this.m.getValue();
    }
    
    public final ff2.a downvote(final String s) {
        sg2.e.f((Object)s, "id");
        final ff2.a r = ff2.a.r((ff2.e)this.c.downvote(s), (ff2.e)this.i.a(new s(s, VoteDirection.DOWN.getValue())));
        sg2.e.e((Object)r, "mergeArray(remote, local)");
        return yd.b.i0(r, (d)this.g);
    }
    
    public final ff2.c0<Result<StreamCommentWithStatus>> e(final String s, final String s2) {
        sg2.e.f((Object)s, "streamId");
        sg2.e.f((Object)s2, "text");
        final ff2.c0 b = this.c.sendCommentV2(s, new StreamChatMessageDataModel(s2)).w((o)new r1(this, 0)).B((o)new z50.s(6));
        sg2.e.e((Object)b, "remote.sendCommentV2(str\u2026= it.message.orEmpty()) }");
        return nn0.a.V((ff2.c0)b, (d)this.g);
    }
    
    public final ff2.c0<String> endBroadcast(final String s) {
        sg2.e.f((Object)s, "streamId");
        final ff2.c0 w = this.c.endBroadcast(s).w((o)new z50.s(7));
        sg2.e.e((Object)w, "remote.endBroadcast(streamId).map { it.status }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<String> f(final String s) {
        sg2.e.f((Object)s, "streamId");
        final ff2.c0 w = this.c.getRecommendedViewerPrompts(s).B((o)new q0(8)).w((o)new n1(4));
        sg2.e.e((Object)w, "remote.getRecommendedVie\u2026.data?.prompt.orEmpty() }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<Boolean> g(final String s) {
        sg2.e.f((Object)s, "streamId");
        return yd.b.b0((rg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, true, (c)null));
    }
    
    public final ff2.c0<AutoMuteStatus> getAutoMuteStatus(final String s) {
        sg2.e.f((Object)s, "streamId");
        final ff2.c0 w = this.c.getAutoMuteStatus(s).w((o)new z50.o((Object)this, 4));
        sg2.e.e((Object)w, "remote.getAutoMuteStatus\u2026oMuteStatus.map()\n      }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<List<StreamPrompt>> getRecommendedBroadcastPrompts() {
        final ff2.c0 b = this.c.getRecommendedBroadcastPrompts().B((o)new f0(5));
        sg2.e.e((Object)b, "remote.getRecommendedBro\u2026rorReturn { emptyList() }");
        return nn0.a.V((ff2.c0)b, (d)this.g);
    }
    
    public final ff2.c0<StreamVideoData> getStream(final String s) {
        sg2.e.f((Object)s, "id");
        final ff2.c0 w = this.c.getStream(s).w((o)new q((Object)this, 3));
        sg2.e.e((Object)w, "remote.getStream(id)\n      .map { it.map() }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<StreamingEligibility> getStreamerSubredditEligibility(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final ff2.c0 b = this.c.getStreamerSubredditEligibility(s).w((o)new q0(7)).B((o)new n1(3));
        sg2.e.e((Object)b, "remote.getStreamerSubred\u2026eamingEligibility.Error }");
        return nn0.a.V((ff2.c0)b, (d)this.g);
    }
    
    public final ff2.c0<List<StreamVideoData>> getSubredditStreams(final String s, final Integer n) {
        sg2.e.f((Object)s, "subredditName");
        final ff2.c0 w = this.c.getSubredditStreams(s, n).w((o)new com.reddit.data.repository.b(this, 4));
        sg2.e.e((Object)w, "remote.getSubredditStrea\u2026p { it.map { it.map() } }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<List<StreamSubredditPromptState>> h(final StateType stateType) {
        sg2.e.f((Object)stateType, "type");
        final ff2.c0 w = this.e.d(stateType).w((o)new z50.s(4));
        sg2.e.e((Object)w, "localStreamStateDataSour\u2026      )\n        }\n      }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final n<StreamLinkState> i(final String s) {
        sg2.e.f((Object)s, "streamId");
        final n o = this.i.q(s).o((o)new q1(this, 0));
        sg2.e.e((Object)o, "localStreamLinkStateData\u2026\n        it.map()\n      }");
        return (n<StreamLinkState>)a92.b.a0(o, (d)this.g);
    }
    
    public final ff2.c0<StreamListingConfiguration> j(final boolean b) {
        ff2.c0 c0;
        if (b) {
            final Store value = this.p.getValue();
            sg2.e.e((Object)value, "<get-streamHomeConfigStore>(...)");
            c0 = value.j((Object)"stream_configuration_home");
        }
        else {
            final Store value2 = this.p.getValue();
            sg2.e.e((Object)value2, "<get-streamHomeConfigStore>(...)");
            c0 = value2.get((Object)"stream_configuration_home");
        }
        sg2.e.e((Object)c0, "if (refresh) {\n      str\u2026_CONFIGURATION_KEY]\n    }");
        final ff2.c0 b2 = nn0.a.V(c0, (d)this.g).B((o)new f0(6));
        sg2.e.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return b2;
    }
    
    public final ff2.a k(final StreamSubredditPromptState streamSubredditPromptState) {
        return yd.b.i0(this.e.e(streamSubredditPromptState), (d)this.g);
    }
    
    public final ff2.c0<SubscriptionInfo> l(final String s, final String s2) {
        sg2.e.f((Object)s2, "broadcasterUsername");
        final RemoteGqlStreamDataSource b = this.b;
        b.getClass();
        final ff2.c0 w = e$a.a((mr0.e)b.a, (h7.k)new fa(s, s2), (OkHttpClient)null, (Map)null, 14).w((o)new nw.d(15));
        sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026 = iconUrl,\n      )\n    }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<Boolean> m(String e) {
        e.f((Object)e, "id");
        final RemoteGqlStreamDataSource b = this.b;
        e = v.e(e, ThingType.LINK);
        b.getClass();
        e.f((Object)e, "id");
        final ff2.c0 w = e$a.a((mr0.e)b.a, (h7.k)new j9(e), (OkHttpClient)null, (Map)null, 14).w((o)new nw.c(6));
        e.e((Object)w, "graphQlClient.execute(\n \u2026Id?.isSaved == true\n    }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<List<StreamVideoData>> n(final StreamListingType streamListingType, final Integer n) {
        sg2.e.f((Object)streamListingType, "listingType");
        final int n2 = RedditStreamRepository.a.b[((Enum)streamListingType).ordinal()];
        ff2.c0 c0;
        if (n2 != 1) {
            if (n2 != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Type not supported: ");
                sb.append(streamListingType);
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.k.pb()) {
                c0 = this.b.a(n);
            }
            else {
                c0 = this.c.getPopularStreams(n);
            }
        }
        else if (this.k.pb()) {
            c0 = this.b.a(n);
        }
        else {
            c0 = this.c.getHomeStreams(n);
        }
        final ff2.c0 w = c0.w((o)new q1(this, 1));
        sg2.e.e((Object)w, "when (listingType) {\n   \u2026p { it.map { it.map() } }");
        return nn0.a.V((ff2.c0)w, (d)this.g);
    }
    
    public final ff2.c0<Boolean> o(final String s) {
        sg2.e.f((Object)s, "streamId");
        return yd.b.b0((rg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, false, (c)null));
    }
    
    public final ff2.c0<StreamListingConfiguration> p(final String s, final boolean b) {
        sg2.e.f((Object)s, "listing");
        ff2.c0 c0;
        if (b) {
            final Store value = this.q.getValue();
            sg2.e.e((Object)value, "<get-listingStreamConfigStore>(...)");
            c0 = value.j((Object)s);
        }
        else {
            final Store value2 = this.q.getValue();
            sg2.e.e((Object)value2, "<get-listingStreamConfigStore>(...)");
            c0 = value2.get((Object)s);
        }
        sg2.e.e((Object)c0, "if (refresh) {\n      lis\u2026onfigStore[listing]\n    }");
        final ff2.c0 b2 = nn0.a.V(c0, (d)this.g).B((o)new r(6));
        sg2.e.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return b2;
    }
    
    public final ff2.c0<List<String>> q() {
        final ff2.c0 b = this.c.getViewerSubreddits().B((o)new z50.s(5));
        sg2.e.e((Object)b, "remote\n      .getViewerS\u2026rorReturn { emptyList() }");
        return nn0.a.V((ff2.c0)b, (d)this.g);
    }
    
    public final StreamVideoData r(final StreamVideoDataRemoteDataModel streamVideoDataRemoteDataModel) {
        final int unique_watchers = streamVideoDataRemoteDataModel.getUnique_watchers();
        final int continuous_watchers = streamVideoDataRemoteDataModel.getContinuous_watchers();
        final int total_continuous_watchers = streamVideoDataRemoteDataModel.getTotal_continuous_watchers();
        final boolean is_first_broadcast = streamVideoDataRemoteDataModel.is_first_broadcast();
        final Stream stream = streamVideoDataRemoteDataModel.getStream();
        String endedReason;
        if (stream != null) {
            endedReason = stream.getEndedReason();
        }
        else {
            endedReason = null;
        }
        final Link a = this.h.a(streamVideoDataRemoteDataModel.getPost());
        final Stream stream2 = streamVideoDataRemoteDataModel.getStream();
        final int upvotes = streamVideoDataRemoteDataModel.getUpvotes();
        final int downvotes = streamVideoDataRemoteDataModel.getDownvotes();
        final VoteState voteState = streamVideoDataRemoteDataModel.getPost().getVoteState();
        int n;
        if (voteState == null) {
            n = -1;
        }
        else {
            n = RedditStreamRepository.a.a[((Enum)voteState).ordinal()];
        }
        VoteDirection voteDirection;
        if (n != 1) {
            if (n != 2) {
                voteDirection = VoteDirection.NONE;
            }
            else {
                voteDirection = VoteDirection.DOWN;
            }
        }
        else {
            voteDirection = VoteDirection.UP;
        }
        final Integer rank = streamVideoDataRemoteDataModel.getRank();
        int intValue;
        if (rank != null) {
            intValue = rank;
        }
        else {
            intValue = 0;
        }
        final Integer total_streams = streamVideoDataRemoteDataModel.getTotal_streams();
        int intValue2;
        if (total_streams != null) {
            intValue2 = total_streams;
        }
        else {
            intValue2 = 0;
        }
        final boolean chat_disabled = streamVideoDataRemoteDataModel.getChat_disabled();
        final String share_link = streamVideoDataRemoteDataModel.getShare_link();
        final Double estimated_remaining_time = streamVideoDataRemoteDataModel.getEstimated_remaining_time();
        int n2;
        if (estimated_remaining_time != null) {
            n2 = (int)(double)estimated_remaining_time;
        }
        else {
            n2 = 0;
        }
        final Double broadcast_time = streamVideoDataRemoteDataModel.getBroadcast_time();
        float n3;
        if (broadcast_time != null) {
            n3 = (float)(double)broadcast_time;
        }
        else {
            n3 = 0.0f;
        }
        return new StreamVideoData(unique_watchers, continuous_watchers, total_continuous_watchers, is_first_broadcast, endedReason, a, stream2, upvotes, downvotes, voteDirection, intValue, intValue2, chat_disabled, share_link, n2, n3, streamVideoDataRemoteDataModel.getMeter());
    }
    
    public final ff2.a removeVote(final String s) {
        sg2.e.f((Object)s, "id");
        final ff2.a r = ff2.a.r((ff2.e)this.c.removeVote(s), (ff2.e)this.i.a(new s(s, VoteDirection.NONE.getValue())));
        sg2.e.e((Object)r, "mergeArray(remote, local)");
        return yd.b.i0(r, (d)this.g);
    }
    
    public final Object searchSubreddits(final String s, int viewing, final Integer n, final c<? super StreamCommunityResult> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditStreamRepository$searchSubreddits$1) {
                final RedditStreamRepository$searchSubreddits$1 redditStreamRepository$searchSubreddits$1 = (RedditStreamRepository$searchSubreddits$1)c;
                final int label = redditStreamRepository$searchSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditStreamRepository$searchSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = redditStreamRepository$searchSubreddits$1;
                    break Label_0061;
                }
            }
            o = new RedditStreamRepository$searchSubreddits$1(this, (c)c);
        }
        final Object result = ((RedditStreamRepository$searchSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditStreamRepository$searchSubreddits$1)o).label;
        StreamCommunityResult streamCommunityResult = null;
        Label_0113: {
            if (label2 == 0) {
                break Label_0113;
            }
            Label_0102: {
                if (label2 != 1) {
                    break Label_0102;
                }
                try {
                    yd.b.k0(result);
                    Object searchSubreddits = result;
                    final StreamCommunityDataModel streamCommunityDataModel;
                    Label_0154: {
                        streamCommunityDataModel = (StreamCommunityDataModel)searchSubreddits;
                    }
                    final List data = streamCommunityDataModel.getData();
                    final ArrayList list = new ArrayList(ig2.m.c3((Iterable)data, 10));
                    for (final StreamCommunityData streamCommunityData : data) {
                        final String name = streamCommunityData.getName();
                        final String description = streamCommunityData.getDescription();
                        final List rules = streamCommunityData.getRules();
                        Object instance;
                        if (rules != null) {
                            instance = new ArrayList(ig2.m.c3((Iterable)rules, 10));
                            for (final CommunityRuleDataModel communityRuleDataModel : rules) {
                                ((Collection)instance).add(new CommunityRule(communityRuleDataModel.getName(), communityRuleDataModel.getDescription()));
                            }
                        }
                        else {
                            instance = EmptyList.INSTANCE;
                        }
                        final int online = streamCommunityData.getOnline();
                        viewing = streamCommunityData.getViewing();
                        list.add((Object)new StreamCommunity(name, description, streamCommunityData.getIconUrl(), (List)instance, online, viewing, streamCommunityData.getReasonToBroadcast(), streamCommunityData.getBroadcasterPrompt()));
                    }
                    streamCommunityResult = new StreamCommunityResult((List)list, streamCommunityDataModel.getNextCursor());
                    return streamCommunityResult;
                    yd.b.k0(result);
                    final RemoteStreamDataSource c2 = this.c;
                    ((RedditStreamRepository$searchSubreddits$1)o).label = 1;
                    iftrue(Label_0154:)((searchSubreddits = c2.searchSubreddits(s, viewing, n, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final Exception ex) {
                    streamCommunityResult = new StreamCommunityResult((List)null, 0, 3, (DefaultConstructorMarker)null);
                }
            }
        }
        return streamCommunityResult;
    }
    
    public final ff2.a sendHeartbeat(final String s) {
        sg2.e.f((Object)s, "id");
        return yd.b.i0(this.c.sendHeartbeat(s), (d)this.g);
    }
    
    public final ff2.a upvote(final String s) {
        sg2.e.f((Object)s, "id");
        final ff2.a r = ff2.a.r((ff2.e)this.c.upvote(s), (ff2.e)this.i.a(new s(s, VoteDirection.UP.getValue())));
        sg2.e.e((Object)r, "mergeArray(remote, local)");
        return yd.b.i0(r, (d)this.g);
    }
}
