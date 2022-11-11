// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import java.util.List;
import com.reddit.mutations.c9$d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.c9$c;
import com.reddit.mutations.c9$b;
import com.reddit.mutations.c9;
import o22.c5;
import h7.h$a;
import o22.r3;
import com.reddit.type.TaggingState;
import com.reddit.domain.model.UpdateResponse;
import kl0.s5;
import com.reddit.queries.cc$f$a;
import com.reddit.queries.cc$f;
import com.reddit.queries.cc$d;
import com.reddit.queries.cc$a;
import com.reddit.queries.cc$e;
import a2.b;
import com.reddit.queries.cc$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.cc;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.communitycreation.SubredditTopic;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import ur0.g;

public final class RemoteGqlSubredditTopicsDataSource
{
    public final g a;
    public final a b;
    
    @Inject
    public RemoteGqlSubredditTopicsDataSource(final g a, final a b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(String l, final c<? super SubredditTopic> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1) {
                final RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1 remoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1 = (RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1)c;
                final int label = remoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1)o).label;
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
            final cc cc = new cc(l);
            ((RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$getSubredditPrimaryTopic$1)o).label = 1;
            if ((b = e$a.b(14, (k)cc, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final cc$e a2 = ((cc$c)b).a;
        if (a2 != null) {
            final cc$a b2 = a2.b;
            if (b2 != null) {
                final cc$d b3 = b2.b;
                if (b3 != null) {
                    final cc$f b4 = b3.b;
                    if (b4 != null) {
                        final cc$f$a b5 = b4.b;
                        if (b5 != null) {
                            final s5 a3 = b5.a;
                            if (a3 != null) {
                                final String b6 = a3.b;
                                l = a2.b.l(new Object[] { b6 }, 1, "https://www.redditstatic.com/community_tags/%s.png", "format(this, *args)");
                                return new SubredditTopic(b6, a3.d, a3.e, l);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public final Object b(String b, final String s, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1) {
                final RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1 remoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1 = (RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1)c;
                final int label = remoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final c9 c2 = new c9(new c5(b, h$a.c((Object)new r3(s, TaggingState.TAGGED))));
            ((RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic.RemoteGqlSubredditTopicsDataSource$updateSubredditPrimaryTopic$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)c2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final c9$d a2 = ((c9$b)b2).a;
        final boolean b3 = a2 != null && a2.b;
        if (a2 != null) {
            final List c3 = a2.c;
            if (c3 != null) {
                final c9$c c9$c = (c9$c)CollectionsKt___CollectionsKt.s1(c3);
                if (c9$c != null) {
                    b = c9$c.b;
                    return new UpdateResponse(b3, b);
                }
            }
        }
        b = null;
        return new UpdateResponse(b3, b);
    }
}
