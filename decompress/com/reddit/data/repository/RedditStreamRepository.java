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
import dg2.m;
import com.reddit.data.model.StreamCommunityDataModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.streaming.StreamCommunityResult;
import com.reddit.data.model.VoteState;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.streaming.Stream;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import com.reddit.domain.model.streaming.StreamListingType;
import com.reddit.queries.j9;
import y10.w;
import com.reddit.common.ThingType;
import l10.q;
import java.util.Map;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.queries.fa;
import com.reddit.domain.model.streaming.SubscriptionInfo;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.streaming.StreamListingConfiguration;
import com.reddit.domain.model.streaming.StreamLinkState;
import af2.n;
import b60.n0;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import b60.o1;
import com.reddit.domain.model.streaming.StreamingEligibility;
import com.reddit.domain.model.streaming.StreamVideoData;
import b60.g0;
import com.reddit.domain.model.streaming.StreamPrompt;
import java.util.List;
import b60.p1;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import ah0.b;
import gg2.c;
import b60.q0;
import b60.t;
import com.reddit.data.model.StreamChatMessageDataModel;
import com.reddit.domain.model.StreamCommentWithStatus;
import com.reddit.domain.model.Result;
import d60.s;
import com.reddit.domain.model.vote.VoteDirection;
import mg.d0;
import com.reddit.domain.model.streaming.StateType;
import q20.d;
import ff2.o;
import b60.q1;
import com.reddit.domain.model.streaming.StreamBroadcast;
import af2.c0;
import java.util.Set;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import wa0.b0;
import x12.p;
import x40.j0;
import com.reddit.data.mapper.StreamingPostTransformer;
import q20.a;
import com.squareup.moshi.y;
import x40.k0;
import x40.i0;
import com.reddit.data.remote.RemoteStreamDataSource;
import com.reddit.data.remote.RemoteGqlStreamDataSource;
import va0.k;
import xd0.e0;

public final class RedditStreamRepository implements e0
{
    public final k a;
    public final RemoteGqlStreamDataSource b;
    public final RemoteStreamDataSource c;
    public final i0 d;
    public final k0 e;
    public final y f;
    public final a g;
    public final StreamingPostTransformer h;
    public final j0 i;
    public final p j;
    public final b0 k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final f p;
    public final f q;
    
    @Inject
    public RedditStreamRepository(final k a, final RemoteGqlStreamDataSource b, final RemoteStreamDataSource c, final i0 d, final k0 e, final y f, final a g, final StreamingPostTransformer h, final j0 i, final p j, final b0 k) {
        ng2.e.f((Object)a, "userSettings");
        ng2.e.f((Object)b, "remoteGql");
        ng2.e.f((Object)c, "remote");
        ng2.e.f((Object)d, "local");
        ng2.e.f((Object)e, "localStreamStateDataSource");
        ng2.e.f((Object)f, "moshi");
        ng2.e.f((Object)g, "backgroundThread");
        ng2.e.f((Object)h, "streamingPostTransformer");
        ng2.e.f((Object)i, "localStreamLinkStateDataSource");
        ng2.e.f((Object)j, "trackingDelegate");
        ng2.e.f((Object)k, "streamFeatures");
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
        this.l = kotlin.a.b((mg2.a)new RedditStreamRepository$broadcastErrorAdapter$2(this));
        this.m = kotlin.a.b((mg2.a)new RedditStreamRepository$reportedStreamIds$2(this));
        this.n = kotlin.a.b((mg2.a)new RedditStreamRepository$endedStreamIds$2(this));
        this.o = kotlin.a.b((mg2.a)new RedditStreamRepository$store$2(this));
        this.p = kotlin.a.b((mg2.a)new RedditStreamRepository$streamHomeConfigStore$2(this));
        this.q = kotlin.a.b((mg2.a)new RedditStreamRepository$listingStreamConfigStore$2(this));
    }
    
    @Override
    public final void a(final String s) {
        ng2.e.f((Object)s, "streamId");
        ((Set)this.m.getValue()).add(s);
        this.d.a(s);
    }
    
    @Override
    public final void b(final String s) {
        ng2.e.f((Object)s, "streamId");
        ((Set)this.n.getValue()).add(s);
        this.d.b(s);
    }
    
    @Override
    public final c0<StreamBroadcast> broadcastStream(final String s, final String s2) {
        ng2.e.f((Object)s, "title");
        ng2.e.f((Object)s2, "destination");
        final c0 b = this.c.broadcastStream(s2, s).w((o)new q1(this, 1)).B((o)new b60.o((Object)this, 2));
        ng2.e.e((Object)b, "remote\n      .broadcastS\u2026t = Status.ERROR)\n      }");
        return px1.a.K0((c0)b, (d)this.g);
    }
    
    @Override
    public final af2.a c(final long n, final StateType stateType) {
        ng2.e.f((Object)stateType, "type");
        return d0.S0(this.e.c(n, stateType), (d)this.g);
    }
    
    @Override
    public final Set<String> d() {
        return (Set)this.m.getValue();
    }
    
    @Override
    public final af2.a downvote(final String s) {
        ng2.e.f((Object)s, "id");
        final af2.a r = af2.a.r((af2.e)this.c.downvote(s), (af2.e)this.i.a(new s(s, VoteDirection.DOWN.getValue())));
        ng2.e.e((Object)r, "mergeArray(remote, local)");
        return d0.S0(r, (d)this.g);
    }
    
    @Override
    public final c0<Result<StreamCommentWithStatus>> e(final String s, final String s2) {
        ng2.e.f((Object)s, "streamId");
        ng2.e.f((Object)s2, "text");
        final c0 b = this.c.sendCommentV2(s, new StreamChatMessageDataModel(s2)).w((o)new q1(this, 0)).B((o)new t(11));
        ng2.e.e((Object)b, "remote.sendCommentV2(str\u2026= it.message.orEmpty()) }");
        return px1.a.K0((c0)b, (d)this.g);
    }
    
    @Override
    public final c0<String> endBroadcast(final String s) {
        ng2.e.f((Object)s, "streamId");
        final c0 w = this.c.endBroadcast(s).w((o)new q0(9));
        ng2.e.e((Object)w, "remote.endBroadcast(streamId).map { it.status }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<String> f(final String s) {
        ng2.e.f((Object)s, "streamId");
        final c0 w = this.c.getRecommendedViewerPrompts(s).B((o)new q0(8)).w((o)new su.d(16));
        ng2.e.e((Object)w, "remote.getRecommendedVie\u2026.data?.prompt.orEmpty() }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<Boolean> g(final String s) {
        ng2.e.f((Object)s, "streamId");
        return ah0.b.m1((mg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, true, (c)null));
    }
    
    @Override
    public final c0<AutoMuteStatus> getAutoMuteStatus(final String s) {
        ng2.e.f((Object)s, "streamId");
        final c0 w = this.c.getAutoMuteStatus(s).w((o)new p1(this, 1));
        ng2.e.e((Object)w, "remote.getAutoMuteStatus\u2026oMuteStatus.map()\n      }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<List<StreamPrompt>> getRecommendedBroadcastPrompts() {
        final c0 b = this.c.getRecommendedBroadcastPrompts().B((o)new g0(7));
        ng2.e.e((Object)b, "remote.getRecommendedBro\u2026rorReturn { emptyList() }");
        return px1.a.K0((c0)b, (d)this.g);
    }
    
    @Override
    public final c0<StreamVideoData> getStream(final String s) {
        ng2.e.f((Object)s, "id");
        final c0 w = this.c.getStream(s).w((o)new com.reddit.data.repository.a(this, 6));
        ng2.e.e((Object)w, "remote.getStream(id)\n      .map { it.map() }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<StreamingEligibility> getStreamerSubredditEligibility(final String s) {
        ng2.e.f((Object)s, "subredditName");
        final c0 b = this.c.getStreamerSubredditEligibility(s).w((o)new t(9)).B((o)new q0(7));
        ng2.e.e((Object)b, "remote.getStreamerSubred\u2026eamingEligibility.Error }");
        return px1.a.K0((c0)b, (d)this.g);
    }
    
    @Override
    public final c0<List<StreamVideoData>> getSubredditStreams(final String s, final Integer n) {
        ng2.e.f((Object)s, "subredditName");
        final c0 w = this.c.getSubredditStreams(s, n).w((o)new o1(this, 1));
        ng2.e.e((Object)w, "remote.getSubredditStrea\u2026p { it.map { it.map() } }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<List<StreamSubredditPromptState>> h(final StateType stateType) {
        ng2.e.f((Object)stateType, "type");
        final c0 w = this.e.d(stateType).w((o)new n0(4));
        ng2.e.e((Object)w, "localStreamStateDataSour\u2026      )\n        }\n      }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final n<StreamLinkState> i(final String s) {
        ng2.e.f((Object)s, "streamId");
        final n p = this.i.n(s).p((o)new o1(this, 0));
        ng2.e.e((Object)p, "localStreamLinkStateData\u2026\n        it.map()\n      }");
        return px1.a.J0((n)p, (d)this.g);
    }
    
    @Override
    public final c0<StreamListingConfiguration> j(final boolean b) {
        c0 c0;
        if (b) {
            final Object value = this.p.getValue();
            ng2.e.e(value, "<get-streamHomeConfigStore>(...)");
            c0 = ((Store)value).m((Object)"stream_configuration_home");
        }
        else {
            final Object value2 = this.p.getValue();
            ng2.e.e(value2, "<get-streamHomeConfigStore>(...)");
            c0 = ((Store)value2).get((Object)"stream_configuration_home");
        }
        ng2.e.e((Object)c0, "if (refresh) {\n      str\u2026_CONFIGURATION_KEY]\n    }");
        final c0 b2 = px1.a.K0(c0, (d)this.g).B((o)new t(10));
        ng2.e.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return b2;
    }
    
    @Override
    public final af2.a k(final StreamSubredditPromptState streamSubredditPromptState) {
        return d0.S0(this.e.e(streamSubredditPromptState), (d)this.g);
    }
    
    @Override
    public final c0<SubscriptionInfo> l(final String s, final String s2) {
        ng2.e.f((Object)s2, "broadcasterUsername");
        final RemoteGqlStreamDataSource b = this.b;
        b.getClass();
        final c0 w = e$a.a((mr0.e)b.a, (h7.k)new fa(s, s2), (OkHttpClient)null, (Map)null, 14).w((o)new q(7));
        ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026 = iconUrl,\n      )\n    }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<Boolean> m(String e) {
        e.f((Object)e, "id");
        final RemoteGqlStreamDataSource b = this.b;
        e = w.e(e, ThingType.LINK);
        b.getClass();
        e.f((Object)e, "id");
        final c0 w = e$a.a((mr0.e)b.a, (h7.k)new j9(e), (OkHttpClient)null, (Map)null, 14).w((o)new lv.b(9));
        e.e((Object)w, "graphQlClient.execute(\n \u2026Id?.isSaved == true\n    }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<List<StreamVideoData>> n(final StreamListingType streamListingType, final Integer n) {
        ng2.e.f((Object)streamListingType, "listingType");
        final int n2 = RedditStreamRepository.RedditStreamRepository$a.b[((Enum)streamListingType).ordinal()];
        c0 c0;
        if (n2 != 1) {
            if (n2 != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Type not supported: ");
                sb.append(streamListingType);
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.k.yb()) {
                c0 = this.b.a(n);
            }
            else {
                c0 = this.c.getPopularStreams(n);
            }
        }
        else if (this.k.yb()) {
            c0 = this.b.a(n);
        }
        else {
            c0 = this.c.getHomeStreams(n);
        }
        final c0 w = c0.w((o)new p1(this, 0));
        ng2.e.e((Object)w, "when (listingType) {\n   \u2026p { it.map { it.map() } }");
        return px1.a.K0((c0)w, (d)this.g);
    }
    
    @Override
    public final c0<Boolean> o(final String s) {
        ng2.e.f((Object)s, "streamId");
        return ah0.b.m1((mg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, false, (c)null));
    }
    
    @Override
    public final c0<StreamListingConfiguration> p(final String s, final boolean b) {
        ng2.e.f((Object)s, "listing");
        c0 c0;
        if (b) {
            final Object value = this.q.getValue();
            ng2.e.e(value, "<get-listingStreamConfigStore>(...)");
            c0 = ((Store)value).m((Object)s);
        }
        else {
            final Object value2 = this.q.getValue();
            ng2.e.e(value2, "<get-listingStreamConfigStore>(...)");
            c0 = ((Store)value2).get((Object)s);
        }
        ng2.e.e((Object)c0, "if (refresh) {\n      lis\u2026onfigStore[listing]\n    }");
        final c0 b2 = px1.a.K0(c0, (d)this.g).B((o)new n0(5));
        ng2.e.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return b2;
    }
    
    @Override
    public final c0<List<String>> q() {
        final c0 b = this.c.getViewerSubreddits().B((o)new g0(8));
        ng2.e.e((Object)b, "remote\n      .getViewerS\u2026rorReturn { emptyList() }");
        return px1.a.K0((c0)b, (d)this.g);
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
            n = RedditStreamRepository.RedditStreamRepository$a.a[((Enum)voteState).ordinal()];
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
    
    @Override
    public final af2.a removeVote(final String s) {
        ng2.e.f((Object)s, "id");
        final af2.a r = af2.a.r((af2.e)this.c.removeVote(s), (af2.e)this.i.a(new s(s, VoteDirection.NONE.getValue())));
        ng2.e.e((Object)r, "mergeArray(remote, local)");
        return d0.S0(r, (d)this.g);
    }
    
    @Override
    public final Object searchSubreddits(final String s, int online, final Integer n, final c<? super StreamCommunityResult> c) {
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
                    cg.d.b4(result);
                    Object searchSubreddits = result;
                    final StreamCommunityDataModel streamCommunityDataModel;
                    Label_0154: {
                        streamCommunityDataModel = (StreamCommunityDataModel)searchSubreddits;
                    }
                    final List data = streamCommunityDataModel.getData();
                    final ArrayList list = new ArrayList(dg2.m.u4((Iterable)data, 10));
                    for (final StreamCommunityData streamCommunityData : data) {
                        final String name = streamCommunityData.getName();
                        final String description = streamCommunityData.getDescription();
                        final List rules = streamCommunityData.getRules();
                        Object instance;
                        if (rules != null) {
                            instance = new ArrayList(dg2.m.u4((Iterable)rules, 10));
                            for (final CommunityRuleDataModel communityRuleDataModel : rules) {
                                ((Collection)instance).add(new CommunityRule(communityRuleDataModel.getName(), communityRuleDataModel.getDescription()));
                            }
                        }
                        else {
                            instance = EmptyList.INSTANCE;
                        }
                        online = streamCommunityData.getOnline();
                        list.add((Object)new StreamCommunity(name, description, streamCommunityData.getIconUrl(), (List)instance, online, streamCommunityData.getViewing(), streamCommunityData.getReasonToBroadcast(), streamCommunityData.getBroadcasterPrompt()));
                    }
                    streamCommunityResult = new StreamCommunityResult((List)list, streamCommunityDataModel.getNextCursor());
                    return streamCommunityResult;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    cg.d.b4(result);
                    final RemoteStreamDataSource c2 = this.c;
                    ((RedditStreamRepository$searchSubreddits$1)o).label = 1;
                    iftrue(Label_0154:)((searchSubreddits = c2.searchSubreddits(s, online, n, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    streamCommunityResult = new StreamCommunityResult((List)null, 0, 3, (DefaultConstructorMarker)null);
                }
            }
        }
        return streamCommunityResult;
    }
    
    @Override
    public final af2.a sendHeartbeat(final String s) {
        ng2.e.f((Object)s, "id");
        return d0.S0(this.c.sendHeartbeat(s), (d)this.g);
    }
    
    @Override
    public final af2.a upvote(final String s) {
        ng2.e.f((Object)s, "id");
        final af2.a r = af2.a.r((af2.e)this.c.upvote(s), (af2.e)this.i.a(new s(s, VoteDirection.UP.getValue())));
        ng2.e.e((Object)r, "mergeArray(remote, local)");
        return d0.S0(r, (d)this.g);
    }
}
