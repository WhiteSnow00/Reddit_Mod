// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.a9$d;
import com.reddit.mutations.a9$c;
import com.reddit.mutations.a9$b;
import com.reddit.mutations.a9;
import o22.a5;
import java.util.List;
import com.reddit.mutations.q8$d;
import com.reddit.domain.model.UpdateResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.q8$c;
import com.reddit.mutations.q8$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.q8;
import o22.d5;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class b
{
    public final g a;
    
    @Inject
    public b(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final Boolean b, final String s, final c c, final boolean b2) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1) {
                final RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1 remoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1 = (RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1)c;
                final int label = remoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1(this, (c<? super RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1>)c);
        }
        final Object result = ((RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final q8 q8 = new q8(new d5(h$a.c((Object)b2), h$a.c((Object)b), s));
            ((RemoteGqlFlairDataSource$updateSubredditAuthorFlairSettings$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)q8, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final q8$d a2 = ((q8$b)b3).a;
        final String s2 = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b4 = a2.b;
            final List c2 = a2.c;
            String b5 = s2;
            if (c2 != null) {
                final q8$c q8$c = (q8$c)CollectionsKt___CollectionsKt.s1(c2);
                b5 = s2;
                if (q8$c != null) {
                    b5 = q8$c.b;
                }
            }
            updateResponse = new UpdateResponse(b4, b5);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object b(final Boolean b, final String s, final c c, final boolean b2) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1) {
                final RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1 remoteGqlFlairDataSource$updateSubredditPostFlairSettings$1 = (RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1)c;
                final int label = remoteGqlFlairDataSource$updateSubredditPostFlairSettings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlFlairDataSource$updateSubredditPostFlairSettings$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlFlairDataSource$updateSubredditPostFlairSettings$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1(this, (c<? super RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1>)c);
        }
        final Object result = ((RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final a9 a2 = new a9(new a5(h$a.c((Object)b2), h$a.c((Object)b), s));
            ((RemoteGqlFlairDataSource$updateSubredditPostFlairSettings$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)a2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final a9$d a3 = ((a9$b)b3).a;
        final String s2 = null;
        UpdateResponse updateResponse;
        if (a3 != null) {
            final boolean b4 = a3.b;
            final List c2 = a3.c;
            String b5 = s2;
            if (c2 != null) {
                final a9$c a9$c = (a9$c)CollectionsKt___CollectionsKt.s1(c2);
                b5 = s2;
                if (a9$c != null) {
                    b5 = a9$c.b;
                }
            }
            updateResponse = new UpdateResponse(b4, b5);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
}
