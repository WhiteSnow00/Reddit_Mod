// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.liveaudio.remote.gql;

import com.reddit.queries.e7$h$a;
import com.reddit.queries.e7$h;
import com.reddit.queries.e7$s;
import com.reddit.queries.e7$w;
import com.reddit.queries.e7$d;
import com.reddit.fragment.TalkRoomFragment;
import com.reddit.queries.e7$a0$a;
import com.reddit.queries.e7$a0;
import com.reddit.queries.e7$t;
import com.reddit.queries.e7$r;
import com.reddit.queries.e7$c;
import com.reddit.queries.e7$o;
import com.reddit.queries.e7$b;
import com.reddit.queries.e7$n;
import com.reddit.queries.e7$k;
import com.reddit.domain.model.liveaudio.AudioRoom;
import com.reddit.fragment.AudioRoomFragment;
import com.reddit.queries.e7$g$a;
import com.reddit.queries.e7$g;
import com.reddit.queries.e7$v;
import com.reddit.queries.e7$y;
import com.reddit.queries.e7$f;
import java.util.Iterator;
import gv0.a$b;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.ads.link.models.AppStoreData;
import com.reddit.domain.model.DiscussionType;
import com.reddit.domain.model.listing.RecommendationContext;
import com.reddit.domain.model.PostGallery;
import com.reddit.domain.model.liveaudio.LegacyAudioRoom;
import com.reddit.domain.model.RpanVideo;
import com.reddit.domain.model.predictions.PostPredictionsTournamentData;
import com.reddit.domain.model.PostPoll;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.OutboundLink;
import com.reddit.ads.domain.PromoLayoutType;
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.model.LinkMedia;
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import java.util.List;
import com.reddit.domain.model.Link;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditDetail;
import z10.w;
import com.reddit.queries.e7$q;
import java.util.ArrayList;
import com.reddit.queries.e7$j;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.e7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import db0.o;
import ur0.g;

public final class a
{
    public final g a;
    public final o b;
    
    @Inject
    public a(final g a, final o b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "liveAudioFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final Serializable a(final c c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlLiveAudioDataSource$fetchLiveContent$1) {
                final RemoteGqlLiveAudioDataSource$fetchLiveContent$1 remoteGqlLiveAudioDataSource$fetchLiveContent$1 = (RemoteGqlLiveAudioDataSource$fetchLiveContent$1)c;
                final int label = remoteGqlLiveAudioDataSource$fetchLiveContent$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLiveAudioDataSource$fetchLiveContent$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLiveAudioDataSource$fetchLiveContent$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlLiveAudioDataSource$fetchLiveContent$1(this, (c<? super RemoteGqlLiveAudioDataSource$fetchLiveContent$1>)c);
        }
        final Object result = ((RemoteGqlLiveAudioDataSource$fetchLiveContent$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLiveAudioDataSource$fetchLiveContent$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final e7 e7 = new e7();
            ((RemoteGqlLiveAudioDataSource$fetchLiveContent$1)o).label = 1;
            if ((b = e$a.b(14, (k)e7, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final List b2 = ((e7$j)b).a.b;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final e7$q e7$q : b2) {
            Object o2 = null;
            Label_0582: {
                if (e7$q != null) {
                    final e7$f e8 = e7$q.e;
                    if (e8 != null) {
                        final String e9 = s20.a.e(e8.e.c);
                        final String g = w.g(e8.b);
                        final String b3 = e8.b;
                        final long c2 = ur0.c.c(e8.d.toString());
                        String c3;
                        if ((c3 = e8.c) == null) {
                            c3 = "";
                        }
                        final e7$y e10 = e8.e;
                        final String c4 = e10.c;
                        final String b4 = e10.b;
                        final e7$y e11 = e8.e;
                        final String b5 = e11.b;
                        final String c5 = e11.c;
                        final e7$v d = e11.d;
                        String string = null;
                        Label_0328: {
                            if (d != null) {
                                final Object b6 = d.b;
                                if (b6 != null) {
                                    string = b6.toString();
                                    break Label_0328;
                                }
                            }
                            string = null;
                        }
                        final SubredditDetail subredditDetail = new SubredditDetail(b5, null, null, null, null, null, null, c5, e9, null, null, string, null, null, null, 0, null, null, 259710, null);
                        final e7$g f = e8.f;
                        Link link = null;
                        Label_0562: {
                            if (f != null) {
                                final e7$g$a b7 = f.b;
                                if (b7 != null) {
                                    final AudioRoomFragment a2 = b7.a;
                                    if (a2 != null) {
                                        final AudioRoom domainAudioRoom = GqlDataToDomainModelMapperKt.toDomainAudioRoom(a2);
                                        if (domainAudioRoom != null) {
                                            link = new Link(g, b3, c2, c3, null, null, null, 0, null, 0, 0.0, 0, 0L, null, c4, b4, e9, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, subredditDetail, false, false, null, null, null, null, null, null, false, null, null, null, null, null, domainAudioRoom, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -114704, -1, -16777729, 134217727, null);
                                            break Label_0562;
                                        }
                                    }
                                }
                            }
                            link = null;
                        }
                        if (link != null) {
                            o2 = new a$b(link, (Integer)null, (String)null);
                            break Label_0582;
                        }
                    }
                }
                o2 = null;
            }
            if (o2 != null) {
                list.add(o2);
            }
        }
        return list;
    }
    
    public final Serializable b(final c c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1) {
                final RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1 remoteGqlLiveAudioDataSource$fetchLiveContentV2$1 = (RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)c;
                final int label = remoteGqlLiveAudioDataSource$fetchLiveContentV2$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlLiveAudioDataSource$fetchLiveContentV2$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlLiveAudioDataSource$fetchLiveContentV2$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1(this, (c<? super RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1>)c);
        }
        final Object result = ((RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)o).label;
        a a;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a = (a)((RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a2 = this.a;
            final e7 e7 = new e7();
            ((RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)o).L$0 = this;
            ((RemoteGqlLiveAudioDataSource$fetchLiveContentV2$1)o).label = 1;
            b = e$a.b(14, (k)e7, (e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            a = this;
        }
        final List b2 = ((e7$j)b).a.c.b;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final e7$k e7$k : b2) {
            Object o2 = null;
            Label_1049: {
                if (e7$k != null) {
                    final e7$n b3 = e7$k.b;
                    if (b3 != null) {
                        final e7$b b4 = b3.b;
                        if (b4 != null) {
                            final boolean z2 = a.b.Z2();
                            final String s = "";
                            Link link = null;
                            Label_0645: {
                                if (z2) {
                                    final e7$o b5 = b4.b;
                                    final e7$c f = b5.f;
                                    if (f != null) {
                                        final String c2 = b5.c;
                                        final boolean z3 = a.b.z9();
                                        final StringBuilder k = a.k("u/");
                                        k.append(s20.a.i(f.e.b));
                                        final String string = k.toString();
                                        final String g = w.g(f.b);
                                        final String b6 = f.b;
                                        final long c3 = ur0.c.c(f.d.toString());
                                        String c4 = f.c;
                                        if (c4 == null) {
                                            c4 = "";
                                        }
                                        final String b7 = f.e.b;
                                        final e7$r e8 = f.e;
                                        final String b8 = e8.b;
                                        final e7$t c5 = e8.c;
                                        Object b9;
                                        if (c5 != null) {
                                            b9 = c5.b;
                                        }
                                        else {
                                            b9 = null;
                                        }
                                        String s2;
                                        if (b9 instanceof String) {
                                            s2 = (String)b9;
                                        }
                                        else {
                                            s2 = null;
                                        }
                                        final SubredditDetail subredditDetail = new SubredditDetail(null, null, null, null, null, null, null, b8, string, null, null, s2, null, null, null, 0, null, null, 259711, null);
                                        final e7$a0 f2 = f.f;
                                        AudioRoom domainAudioRoom$default = null;
                                        Label_0494: {
                                            if (f2 != null) {
                                                final e7$a0$a b10 = f2.b;
                                                if (b10 != null) {
                                                    final TalkRoomFragment a3 = b10.a;
                                                    if (a3 != null) {
                                                        domainAudioRoom$default = GqlDataToDomainModelMapperKt.toDomainAudioRoom$default(a3, c2, z3, false, 4, (Object)null);
                                                        break Label_0494;
                                                    }
                                                }
                                            }
                                            domainAudioRoom$default = null;
                                        }
                                        link = new Link(g, b6, c3, c4, null, null, null, 0, null, 0, 0.0, 0, 0L, null, b7, b7, string, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, subredditDetail, false, false, null, null, null, null, null, null, false, null, null, null, null, null, domainAudioRoom$default, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -114704, -1, -16777729, 134217727, null);
                                        break Label_0645;
                                    }
                                }
                                link = null;
                            }
                            Link link2 = link;
                            if (link == null) {
                                final e7$d e9 = b4.b.e;
                                if (e9 != null) {
                                    final String e10 = s20.a.e(e9.e.c);
                                    final String g2 = w.g(e9.b);
                                    final String b11 = e9.b;
                                    final long c6 = ur0.c.c(e9.d.toString());
                                    String c7 = e9.c;
                                    if (c7 == null) {
                                        c7 = s;
                                    }
                                    final e7$w e11 = e9.e;
                                    final String c8 = e11.c;
                                    final String b12 = e11.b;
                                    final e7$w e12 = e9.e;
                                    final String b13 = e12.b;
                                    final String c9 = e12.c;
                                    final e7$s d = e12.d;
                                    String string2 = null;
                                    Label_0789: {
                                        if (d != null) {
                                            final Object b14 = d.b;
                                            if (b14 != null) {
                                                string2 = b14.toString();
                                                break Label_0789;
                                            }
                                        }
                                        string2 = null;
                                    }
                                    final SubredditDetail subredditDetail2 = new SubredditDetail(b13, null, null, null, null, null, null, c9, e10, null, null, string2, null, null, null, 0, null, null, 259710, null);
                                    final e7$h f3 = e9.f;
                                    AudioRoom domainAudioRoom = null;
                                    Label_0860: {
                                        if (f3 != null) {
                                            final e7$h$a b15 = f3.b;
                                            if (b15 != null) {
                                                final AudioRoomFragment a4 = b15.a;
                                                if (a4 != null) {
                                                    domainAudioRoom = GqlDataToDomainModelMapperKt.toDomainAudioRoom(a4);
                                                    break Label_0860;
                                                }
                                            }
                                        }
                                        domainAudioRoom = null;
                                    }
                                    link2 = new Link(g2, b11, c6, c7, null, null, null, 0, null, 0, 0.0, 0, 0L, null, c8, b12, e10, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, subredditDetail2, false, false, null, null, null, null, null, null, false, null, null, null, null, null, domainAudioRoom, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -114704, -1, -16777729, 134217727, null);
                                }
                                else {
                                    link2 = null;
                                }
                            }
                            if (link2 != null) {
                                o2 = new a$b(link2, new Integer(b4.c), b4.d);
                                break Label_1049;
                            }
                        }
                    }
                }
                o2 = null;
            }
            if (o2 != null) {
                list.add(o2);
            }
        }
        return list;
    }
}
