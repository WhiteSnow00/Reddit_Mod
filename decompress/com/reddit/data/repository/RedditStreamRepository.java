// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.collections.EmptyList;
import com.reddit.data.model.CommunityRuleDataModel;
import com.reddit.domain.model.streaming.CommunityRule;
import com.reddit.data.model.StreamCommunityData;
import com.reddit.domain.model.streaming.StreamCommunity;
import java.util.ArrayList;
import qg2.m;
import com.reddit.data.model.StreamCommunityDataModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.streaming.StreamCommunityResult;
import com.reddit.data.model.VoteState;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.streaming.Stream;
import g60.u0;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import com.reddit.domain.model.streaming.StreamListingType;
import com.reddit.queries.g9;
import z10.w;
import com.reddit.common.ThingType;
import java.util.Map;
import okhttp3.OkHttpClient;
import ur0.e$a;
import com.reddit.queries.ca;
import com.reddit.domain.model.streaming.SubscriptionInfo;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.streaming.StreamListingConfiguration;
import com.reddit.domain.model.streaming.StreamLinkState;
import nf2.n;
import com.reddit.domain.model.streaming.StreamSubredditPromptState;
import com.reddit.domain.model.streaming.StreamingEligibility;
import g60.q;
import com.reddit.domain.model.streaming.StreamVideoData;
import com.reddit.domain.model.streaming.StreamPrompt;
import java.util.List;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import tg2.c;
import g60.u;
import g60.d1;
import ch.b;
import com.reddit.data.model.StreamChatMessageDataModel;
import com.reddit.domain.model.StreamCommentWithStatus;
import com.reddit.domain.model.Result;
import i60.s;
import com.reddit.domain.model.vote.VoteDirection;
import nf2.e;
import com.reddit.domain.model.streaming.StateType;
import r20.d;
import a4.u1;
import g60.c2;
import sf2.o;
import g60.b2;
import com.reddit.domain.model.streaming.StreamBroadcast;
import nf2.c0;
import java.util.Set;
import javax.inject.Inject;
import pg2.f;
import db0.d0;
import n22.p;
import c50.n0;
import com.reddit.data.mapper.StreamingPostTransformer;
import r20.a;
import com.squareup.moshi.y;
import c50.o0;
import c50.m0;
import com.reddit.data.remote.RemoteStreamDataSource;
import com.reddit.data.remote.RemoteGqlStreamDataSource;
import cb0.k;
import ge0.l0;

public final class RedditStreamRepository implements l0
{
    public final k a;
    public final RemoteGqlStreamDataSource b;
    public final RemoteStreamDataSource c;
    public final m0 d;
    public final o0 e;
    public final y f;
    public final r20.a g;
    public final StreamingPostTransformer h;
    public final n0 i;
    public final p j;
    public final d0 k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final f p;
    public final f q;
    
    @Inject
    public RedditStreamRepository(final k a, final RemoteGqlStreamDataSource b, final RemoteStreamDataSource c, final m0 d, final o0 e, final y f, final r20.a g, final StreamingPostTransformer h, final n0 i, final p j, final d0 k) {
        ah2.f.f((Object)a, "userSettings");
        ah2.f.f((Object)b, "remoteGql");
        ah2.f.f((Object)c, "remote");
        ah2.f.f((Object)d, "local");
        ah2.f.f((Object)e, "localStreamStateDataSource");
        ah2.f.f((Object)f, "moshi");
        ah2.f.f((Object)g, "backgroundThread");
        ah2.f.f((Object)h, "streamingPostTransformer");
        ah2.f.f((Object)i, "localStreamLinkStateDataSource");
        ah2.f.f((Object)j, "trackingDelegate");
        ah2.f.f((Object)k, "streamFeatures");
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
        this.l = kotlin.a.b((zg2.a)new RedditStreamRepository$broadcastErrorAdapter.RedditStreamRepository$broadcastErrorAdapter$2(this));
        this.m = kotlin.a.b((zg2.a)new RedditStreamRepository$reportedStreamIds.RedditStreamRepository$reportedStreamIds$2(this));
        this.n = kotlin.a.b((zg2.a)new RedditStreamRepository$endedStreamIds.RedditStreamRepository$endedStreamIds$2(this));
        this.o = kotlin.a.b((zg2.a)new RedditStreamRepository$store.RedditStreamRepository$store$2(this));
        this.p = kotlin.a.b((zg2.a)new RedditStreamRepository$streamHomeConfigStore.RedditStreamRepository$streamHomeConfigStore$2(this));
        this.q = kotlin.a.b((zg2.a)new RedditStreamRepository$listingStreamConfigStore.RedditStreamRepository$listingStreamConfigStore$2(this));
    }
    
    public final void a(final String s) {
        ah2.f.f((Object)s, "streamId");
        ((Set)this.m.getValue()).add(s);
        this.d.a(s);
    }
    
    public final void b(final String s) {
        ah2.f.f((Object)s, "streamId");
        ((Set)this.n.getValue()).add(s);
        this.d.b(s);
    }
    
    public final c0<StreamBroadcast> broadcastStream(final String s, final String s2) {
        ah2.f.f((Object)s, "title");
        ah2.f.f((Object)s2, "destination");
        final c0 b = this.c.broadcastStream(s2, s).w((o)new b2(this, 2)).B((o)new c2(this, 1));
        ah2.f.e((Object)b, "remote\n      .broadcastS\u2026t = Status.ERROR)\n      }");
        return (c0<StreamBroadcast>)u1.j1(b, (d)this.g);
    }
    
    public final nf2.a c(final long n, final StateType stateType) {
        ah2.f.f((Object)stateType, "type");
        return o72.f.t(this.e.c(n, stateType), (d)this.g);
    }
    
    public final Set<String> d() {
        return (Set)this.m.getValue();
    }
    
    public final nf2.a downvote(final String s) {
        ah2.f.f((Object)s, "id");
        final nf2.a s2 = nf2.a.s(new e[] { (e)this.c.downvote(s), (e)this.i.m(new s(s, VoteDirection.DOWN.getValue())) });
        ah2.f.e((Object)s2, "mergeArray(remote, local)");
        return o72.f.t(s2, (d)this.g);
    }
    
    public final c0<Result<StreamCommentWithStatus>> e(final String s, final String s2) {
        ah2.f.f((Object)s, "streamId");
        ah2.f.f((Object)s2, "text");
        final c0 b = this.c.sendCommentV2(s, new StreamChatMessageDataModel(s2)).w((o)new c2(this, 0)).B((o)new b(13));
        ah2.f.e((Object)b, "remote.sendCommentV2(str\u2026= it.message.orEmpty()) }");
        return (c0<Result<StreamCommentWithStatus>>)u1.j1(b, (d)this.g);
    }
    
    public final c0<String> endBroadcast(final String s) {
        ah2.f.f((Object)s, "streamId");
        final c0 w = this.c.endBroadcast(s).w((o)new b(14));
        ah2.f.e((Object)w, "remote.endBroadcast(streamId).map { it.status }");
        return (c0<String>)u1.j1(w, (d)this.g);
    }
    
    public final c0<String> f(final String s) {
        ah2.f.f((Object)s, "streamId");
        final c0 w = this.c.getRecommendedViewerPrompts(s).B((o)new d1(8)).w((o)new u(7));
        ah2.f.e((Object)w, "remote.getRecommendedVie\u2026.data?.prompt.orEmpty() }");
        return (c0<String>)u1.j1(w, (d)this.g);
    }
    
    public final c0<Boolean> g(final String s) {
        ah2.f.f((Object)s, "streamId");
        return (c0<Boolean>)u1.W0((zg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, true, (c)null));
    }
    
    public final c0<AutoMuteStatus> getAutoMuteStatus(final String s) {
        ah2.f.f((Object)s, "streamId");
        final c0 w = this.c.getAutoMuteStatus(s).w((o)new g60.o(this, 4));
        ah2.f.e((Object)w, "remote.getAutoMuteStatus\u2026oMuteStatus.map()\n      }");
        return (c0<AutoMuteStatus>)u1.j1(w, (d)this.g);
    }
    
    public final c0<List<StreamPrompt>> getRecommendedBroadcastPrompts() {
        final c0 b = this.c.getRecommendedBroadcastPrompts().B((o)new g60.n0(5));
        ah2.f.e((Object)b, "remote.getRecommendedBro\u2026rorReturn { emptyList() }");
        return (c0<List<StreamPrompt>>)u1.j1(b, (d)this.g);
    }
    
    public final c0<StreamVideoData> getStream(final String s) {
        ah2.f.f((Object)s, "id");
        final c0 w = this.c.getStream(s).w((o)new q(this, 3));
        ah2.f.e((Object)w, "remote.getStream(id)\n      .map { it.map() }");
        return (c0<StreamVideoData>)u1.j1(w, (d)this.g);
    }
    
    public final c0<StreamingEligibility> getStreamerSubredditEligibility(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final c0 b = this.c.getStreamerSubredditEligibility(s).w((o)new d1(7)).B((o)new u(6));
        ah2.f.e((Object)b, "remote.getStreamerSubred\u2026eamingEligibility.Error }");
        return (c0<StreamingEligibility>)u1.j1(b, (d)this.g);
    }
    
    public final c0<List<StreamVideoData>> getSubredditStreams(final String s, final Integer n) {
        ah2.f.f((Object)s, "subredditName");
        final c0 w = this.c.getSubredditStreams(s, n).w((o)new g(this, 3));
        ah2.f.e((Object)w, "remote.getSubredditStrea\u2026p { it.map { it.map() } }");
        return (c0<List<StreamVideoData>>)u1.j1(w, (d)this.g);
    }
    
    public final c0<List<StreamSubredditPromptState>> h(final StateType stateType) {
        ah2.f.f((Object)stateType, "type");
        final c0 w = this.e.d(stateType).w((o)new b(11));
        ah2.f.e((Object)w, "localStreamStateDataSour\u2026      )\n        }\n      }");
        return (c0<List<StreamSubredditPromptState>>)u1.j1(w, (d)this.g);
    }
    
    public final n<StreamLinkState> i(final String s) {
        ah2.f.f((Object)s, "streamId");
        final n p = this.i.l(s).p((o)new b2(this, 0));
        ah2.f.e((Object)p, "localStreamLinkStateData\u2026\n        it.map()\n      }");
        return (n<StreamLinkState>)dg.d.A1(p, (d)this.g);
    }
    
    public final c0<StreamListingConfiguration> j(final boolean b) {
        c0 c0;
        if (b) {
            final Object value = this.p.getValue();
            ah2.f.e(value, "<get-streamHomeConfigStore>(...)");
            c0 = ((Store)value).b((Object)"stream_configuration_home");
        }
        else {
            final Object value2 = this.p.getValue();
            ah2.f.e(value2, "<get-streamHomeConfigStore>(...)");
            c0 = ((Store)value2).get((Object)"stream_configuration_home");
        }
        ah2.f.e((Object)c0, "if (refresh) {\n      str\u2026_CONFIGURATION_KEY]\n    }");
        final c0 b2 = u1.j1(c0, (d)this.g).B((o)new g60.n0(6));
        ah2.f.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return (c0<StreamListingConfiguration>)b2;
    }
    
    public final nf2.a k(final StreamSubredditPromptState streamSubredditPromptState) {
        return o72.f.t(this.e.e(streamSubredditPromptState), (d)this.g);
    }
    
    public final c0<SubscriptionInfo> l(final String s, final String s2) {
        ah2.f.f((Object)s2, "broadcasterUsername");
        final RemoteGqlStreamDataSource b = this.b;
        b.getClass();
        final c0 w = e$a.a((ur0.e)b.a, (h7.k)new ca(s, s2), (OkHttpClient)null, (Map)null, 14).w((o)new wu.e(7));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026 = iconUrl,\n      )\n    }");
        return (c0<SubscriptionInfo>)u1.j1(w, (d)this.g);
    }
    
    public final c0<Boolean> m(String e) {
        ah2.f.f((Object)e, "id");
        final RemoteGqlStreamDataSource b = this.b;
        e = w.e(e, ThingType.LINK);
        b.getClass();
        ah2.f.f((Object)e, "id");
        final c0 w = e$a.a((ur0.e)b.a, (h7.k)new g9(e), (OkHttpClient)null, (Map)null, 14).w((o)new b(5));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026Id?.isSaved == true\n    }");
        return (c0<Boolean>)u1.j1(w, (d)this.g);
    }
    
    public final c0<List<StreamVideoData>> n(final StreamListingType streamListingType, final Integer n) {
        ah2.f.f((Object)streamListingType, "listingType");
        final int n2 = RedditStreamRepository.a.b[streamListingType.ordinal()];
        c0<List<StreamVideoDataRemoteDataModel>> c0;
        if (n2 != 1) {
            if (n2 != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Type not supported: ");
                sb.append(streamListingType);
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.k.xb()) {
                c0 = this.b.a(n);
            }
            else {
                c0 = this.c.getPopularStreams(n);
            }
        }
        else if (this.k.xb()) {
            c0 = this.b.a(n);
        }
        else {
            c0 = this.c.getHomeStreams(n);
        }
        final c0 w = c0.w((o)new b2(this, 1));
        ah2.f.e((Object)w, "when (listingType) {\n   \u2026p { it.map { it.map() } }");
        return (c0<List<StreamVideoData>>)u1.j1(w, (d)this.g);
    }
    
    public final c0<Boolean> o(final String s) {
        ah2.f.f((Object)s, "streamId");
        return (c0<Boolean>)u1.W0((zg2.p)new RedditStreamRepository$changeChatStatus$1(this, s, false, (c)null));
    }
    
    public final c0<StreamListingConfiguration> p(final String s, final boolean b) {
        ah2.f.f((Object)s, "listing");
        c0 c0;
        if (b) {
            final Object value = this.q.getValue();
            ah2.f.e(value, "<get-listingStreamConfigStore>(...)");
            c0 = ((Store)value).b((Object)s);
        }
        else {
            final Object value2 = this.q.getValue();
            ah2.f.e(value2, "<get-listingStreamConfigStore>(...)");
            c0 = ((Store)value2).get((Object)s);
        }
        ah2.f.e((Object)c0, "if (refresh) {\n      lis\u2026onfigStore[listing]\n    }");
        final c0 b2 = u1.j1(c0, (d)this.g).B((o)new u0(5));
        ah2.f.e((Object)b2, "configuration\n      .sub\u2026ngConfiguration.DEFAULT }");
        return (c0<StreamListingConfiguration>)b2;
    }
    
    public final c0<List<String>> q() {
        final c0 b = this.c.getViewerSubreddits().B((o)new b(12));
        ah2.f.e((Object)b, "remote\n      .getViewerS\u2026rorReturn { emptyList() }");
        return (c0<List<String>>)u1.j1(b, (d)this.g);
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
    
    public final nf2.a removeVote(final String s) {
        ah2.f.f((Object)s, "id");
        final nf2.a s2 = nf2.a.s(new e[] { (e)this.c.removeVote(s), (e)this.i.m(new s(s, VoteDirection.NONE.getValue())) });
        ah2.f.e((Object)s2, "mergeArray(remote, local)");
        return o72.f.t(s2, (d)this.g);
    }
    
    public final Object searchSubreddits(final String s, int viewing, final Integer n, final c<? super StreamCommunityResult> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1) {
                final RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1 redditStreamRepository$searchSubreddits$1 = (RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1)c;
                final int label = redditStreamRepository$searchSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditStreamRepository$searchSubreddits$1.label = label + Integer.MIN_VALUE;
                    o = redditStreamRepository$searchSubreddits$1;
                    break Label_0061;
                }
            }
            o = new RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1(this, (c)c);
        }
        final Object result = ((RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1)o).label;
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
                    aj2.c.Q0(result);
                    Object searchSubreddits = result;
                    final StreamCommunityDataModel streamCommunityDataModel;
                    Label_0154: {
                        streamCommunityDataModel = (StreamCommunityDataModel)searchSubreddits;
                    }
                    final List data = streamCommunityDataModel.getData();
                    final ArrayList list = new ArrayList<StreamCommunity>(qg2.m.P0((Iterable)data, 10));
                    for (final StreamCommunityData streamCommunityData : data) {
                        final String name = streamCommunityData.getName();
                        final String description = streamCommunityData.getDescription();
                        final List rules = streamCommunityData.getRules();
                        Object instance;
                        if (rules != null) {
                            instance = new ArrayList<CommunityRule>(qg2.m.P0((Iterable)rules, 10));
                            for (final CommunityRuleDataModel communityRuleDataModel : rules) {
                                ((Collection<CommunityRule>)instance).add(new CommunityRule(communityRuleDataModel.getName(), communityRuleDataModel.getDescription()));
                            }
                        }
                        else {
                            instance = EmptyList.INSTANCE;
                        }
                        final int online = streamCommunityData.getOnline();
                        viewing = streamCommunityData.getViewing();
                        list.add(new StreamCommunity(name, description, streamCommunityData.getIconUrl(), (List<CommunityRule>)instance, online, viewing, streamCommunityData.getReasonToBroadcast(), streamCommunityData.getBroadcasterPrompt()));
                    }
                    streamCommunityResult = new StreamCommunityResult((List<StreamCommunity>)list, streamCommunityDataModel.getNextCursor());
                    return streamCommunityResult;
                    aj2.c.Q0(result);
                    final RemoteStreamDataSource c2 = this.c;
                    ((RedditStreamRepository$searchSubreddits.RedditStreamRepository$searchSubreddits$1)o).label = 1;
                    iftrue(Label_0154:)((searchSubreddits = c2.searchSubreddits(s, viewing, n, (c<? super StreamCommunityDataModel>)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final Exception ex) {
                    streamCommunityResult = new StreamCommunityResult(null, 0, 3, null);
                }
            }
        }
        return streamCommunityResult;
    }
    
    public final nf2.a sendHeartbeat(final String s) {
        ah2.f.f((Object)s, "id");
        return o72.f.t(this.c.sendHeartbeat(s), (d)this.g);
    }
    
    public final nf2.a upvote(final String s) {
        ah2.f.f((Object)s, "id");
        final nf2.a s2 = nf2.a.s(new e[] { (e)this.c.upvote(s), (e)this.i.m(new s(s, VoteDirection.UP.getValue())) });
        ah2.f.e((Object)s2, "mergeArray(remote, local)");
        return o72.f.t(s2, (d)this.g);
    }
}
