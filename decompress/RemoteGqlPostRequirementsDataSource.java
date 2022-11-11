// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.remote;

import com.reddit.fragment.SubredditPowerupTierAndBenefitsFragment$b;
import com.reddit.fragment.SubredditPowerupTierAndBenefitsFragment;
import com.reddit.queries.sb$d$a;
import com.reddit.queries.sb$d;
import com.reddit.queries.sb$a;
import com.reddit.fragment.SubredditDetailsFragment;
import com.reddit.domain.model.Subreddit;
import com.reddit.fragment.UnavailableSubredditFragment;
import kd0.l;
import com.reddit.queries.sb$e;
import com.squareup.moshi.JsonAdapter;
import com.reddit.data.model.graphql.GqlSubredditMapper;
import com.reddit.queries.sb$c;
import com.reddit.queries.sb;
import com.reddit.domain.model.postrequirements.SubredditPostRequirements;
import com.reddit.fragment.PostRequirementsFragment;
import com.reddit.queries.d4$d$a;
import com.reddit.queries.d4$d;
import com.reddit.queries.d4$a;
import com.reddit.queries.d4$e;
import com.reddit.queries.d4$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.d4;
import z10.w;
import com.reddit.common.ThingType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.postrequirements.PostRequirements;
import tg2.c;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import com.reddit.data.model.graphql.GqlFragmentsMapper;
import com.squareup.moshi.y;
import ur0.g;

public final class RemoteGqlPostRequirementsDataSource
{
    public final g a;
    public final y b;
    public final GqlFragmentsMapper c;
    public final f d;
    
    @Inject
    public RemoteGqlPostRequirementsDataSource(final g a, final y b, final GqlFragmentsMapper c) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "moshi");
        ah2.f.f((Object)c, "gqlFragmentsMapper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new RemoteGqlPostRequirementsDataSource$richTextAdapter.RemoteGqlPostRequirementsDataSource$richTextAdapter$2(this));
    }
    
    public final Object a(final String s, final c<? super PostRequirements> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1) {
                final RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1 remoteGqlPostRequirementsDataSource$getPostRequirements$1 = (RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)c;
                final int label = remoteGqlPostRequirementsDataSource$getPostRequirements$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPostRequirementsDataSource$getPostRequirements$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPostRequirementsDataSource$getPostRequirements$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)o).label;
        RemoteGqlPostRequirementsDataSource remoteGqlPostRequirementsDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPostRequirementsDataSource = (RemoteGqlPostRequirementsDataSource)((RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final d4 d4 = new d4(w.e(s, ThingType.SUBREDDIT));
            ((RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)o).L$0 = this;
            ((RemoteGqlPostRequirementsDataSource$getPostRequirements.RemoteGqlPostRequirementsDataSource$getPostRequirements$1)o).label = 1;
            b = e$a.b(14, (k)d4, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPostRequirementsDataSource = this;
        }
        final d4$e a2 = ((d4$c)b).a;
        if (a2 != null) {
            final d4$a b2 = a2.b;
            if (b2 != null) {
                final d4$d b3 = b2.b;
                if (b3 != null) {
                    final d4$d$a b4 = b3.b;
                    if (b4 != null) {
                        final PostRequirementsFragment a3 = b4.a;
                        if (a3 != null) {
                            return remoteGqlPostRequirementsDataSource.c.mapPostRequirements(a3);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public final Object b(final String s, final c<? super SubredditPostRequirements> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1) {
                final RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1 remoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1 = (RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)c;
                final int label = remoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)o).label;
        RemoteGqlPostRequirementsDataSource remoteGqlPostRequirementsDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPostRequirementsDataSource = (RemoteGqlPostRequirementsDataSource)((RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final sb sb = new sb(s);
            ((RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)o).L$0 = this;
            ((RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements.RemoteGqlPostRequirementsDataSource$getSubredditPostRequirements$1)o).label = 1;
            b = e$a.b(14, (k)sb, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPostRequirementsDataSource = this;
        }
        final sb$e a2 = ((sb$c)b).a;
        Object o2 = null;
        final l l = null;
        if (a2 != null) {
            final UnavailableSubredditFragment b2 = a2.b.b;
            Subreddit subreddit;
            if (b2 == null || (subreddit = remoteGqlPostRequirementsDataSource.c.mapUnavailableSubreddit(b2)) == null) {
                final SubredditDetailsFragment a3 = a2.b.a;
                if (a3 != null) {
                    final GqlSubredditMapper instance = GqlSubredditMapper.INSTANCE;
                    final JsonAdapter jsonAdapter = (JsonAdapter)remoteGqlPostRequirementsDataSource.d.getValue();
                    ah2.f.e((Object)jsonAdapter, "richTextAdapter");
                    subreddit = instance.map(a3, jsonAdapter);
                }
                else {
                    subreddit = null;
                }
            }
            final sb$a c2 = a2.c;
            PostRequirements mapPostRequirements = null;
            Label_0303: {
                if (c2 != null) {
                    final sb$d b3 = c2.b;
                    if (b3 != null) {
                        final sb$d$a b4 = b3.b;
                        if (b4 != null) {
                            final PostRequirementsFragment a4 = b4.a;
                            if (a4 != null) {
                                mapPostRequirements = remoteGqlPostRequirementsDataSource.c.mapPostRequirements(a4);
                                break Label_0303;
                            }
                        }
                    }
                }
                mapPostRequirements = null;
            }
            final SubredditPowerupTierAndBenefitsFragment c3 = a2.b.c;
            l mapPowerupsStatus = l;
            if (c3 != null) {
                final SubredditPowerupTierAndBenefitsFragment$b d = c3.d;
                mapPowerupsStatus = l;
                if (d != null) {
                    mapPowerupsStatus = remoteGqlPostRequirementsDataSource.c.mapPowerupsStatus(d, c3.e);
                }
            }
            o2 = new SubredditPostRequirements(subreddit, mapPostRequirements, mapPowerupsStatus);
        }
        return o2;
    }
}
