// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.datasource.remote;

import java.io.IOException;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.h5;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.queries.h5$c;
import kotlin.Result;
import tg2.c;
import o22.j3;
import javax.inject.Inject;
import ah2.f;
import q60.a;

public final class RemoteStorefrontDataSource
{
    public final a a;
    public final jw0.a b;
    
    @Inject
    public RemoteStorefrontDataSource(final a a, final jw0.a b) {
        f.f((Object)a, "gqlClient");
        f.f((Object)b, "logger");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final int n, final String s, final j3 j3, final c<? super Result<h5$c>> c) {
        RemoteStorefrontDataSource$fetchNextListingsPage.RemoteStorefrontDataSource$fetchNextListingsPage$1 remoteStorefrontDataSource$fetchNextListingsPage$2 = null;
        Label_0059: {
            if (c instanceof RemoteStorefrontDataSource$fetchNextListingsPage.RemoteStorefrontDataSource$fetchNextListingsPage$1) {
                final RemoteStorefrontDataSource$fetchNextListingsPage.RemoteStorefrontDataSource$fetchNextListingsPage$1 remoteStorefrontDataSource$fetchNextListingsPage$1 = (RemoteStorefrontDataSource$fetchNextListingsPage.RemoteStorefrontDataSource$fetchNextListingsPage$1)c;
                final int label = remoteStorefrontDataSource$fetchNextListingsPage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteStorefrontDataSource$fetchNextListingsPage$1.label = label + Integer.MIN_VALUE;
                    remoteStorefrontDataSource$fetchNextListingsPage$2 = remoteStorefrontDataSource$fetchNextListingsPage$1;
                    break Label_0059;
                }
            }
            remoteStorefrontDataSource$fetchNextListingsPage$2 = new RemoteStorefrontDataSource$fetchNextListingsPage.RemoteStorefrontDataSource$fetchNextListingsPage$1(this, (c)c);
        }
        final Object result = remoteStorefrontDataSource$fetchNextListingsPage$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteStorefrontDataSource$fetchNextListingsPage$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            remoteStorefrontDataSource$fetchNextListingsPage$2.label = 1;
            if ((o = this.b(n, j3, null, s, (c<? super Result<h5$c>>)remoteStorefrontDataSource$fetchNextListingsPage$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
    
    public final Object b(final int n, final j3 j3, String s, String b, final c<? super Result<h5$c>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1) {
                final RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1 remoteStorefrontDataSource$fetchPaginatedListings$1 = (RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)c;
                final int label = remoteStorefrontDataSource$fetchPaginatedListings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteStorefrontDataSource$fetchPaginatedListings$1.label = label + Integer.MIN_VALUE;
                    o = remoteStorefrontDataSource$fetchPaginatedListings$1;
                    break Label_0059;
                }
            }
            o = new RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1(this, (c)c);
        }
        final Object result = ((RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)o).label;
        Object constructor-impl = null;
        Label_0230: {
            Label_0199: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        s = (String)((RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)o).L$0;
                        try {
                            aj2.c.Q0(result);
                            b = (String)result;
                            break Label_0199;
                        }
                        finally {
                            break Label_0199;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aj2.c.Q0(result);
                final h5 h5 = new h5(h$a.c((Object)j3), gn.a.c0(s), gn.a.c0(b), a.f(n));
                try {
                    final a a = this.a;
                    ((RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)o).L$0 = this;
                    ((RemoteStorefrontDataSource$fetchPaginatedListings.RemoteStorefrontDataSource$fetchPaginatedListings$1)o).label = 1;
                    b = (String)e$a.b(14, (k)h5, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                    if (b == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    constructor-impl = this;
                    Result.constructor-impl((Object)b);
                    break Label_0230;
                }
                finally {
                    s = (String)this;
                }
            }
            constructor-impl = Result.constructor-impl((Object)aj2.c.G((Throwable)constructor-impl));
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(constructor-impl);
        if (exceptionOrNull-impl != null) {
            final jw0.a b2 = ((RemoteStorefrontDataSource)s).b;
            final boolean b3 = exceptionOrNull-impl instanceof IOException;
            b2.c(exceptionOrNull-impl);
        }
        return constructor-impl;
    }
    
    public final Object c(final int n, final String s, final j3 j3, final c<? super Result<h5$c>> c) {
        RemoteStorefrontDataSource$fetchPrevListingsPage.RemoteStorefrontDataSource$fetchPrevListingsPage$1 remoteStorefrontDataSource$fetchPrevListingsPage$2 = null;
        Label_0059: {
            if (c instanceof RemoteStorefrontDataSource$fetchPrevListingsPage.RemoteStorefrontDataSource$fetchPrevListingsPage$1) {
                final RemoteStorefrontDataSource$fetchPrevListingsPage.RemoteStorefrontDataSource$fetchPrevListingsPage$1 remoteStorefrontDataSource$fetchPrevListingsPage$1 = (RemoteStorefrontDataSource$fetchPrevListingsPage.RemoteStorefrontDataSource$fetchPrevListingsPage$1)c;
                final int label = remoteStorefrontDataSource$fetchPrevListingsPage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteStorefrontDataSource$fetchPrevListingsPage$1.label = label + Integer.MIN_VALUE;
                    remoteStorefrontDataSource$fetchPrevListingsPage$2 = remoteStorefrontDataSource$fetchPrevListingsPage$1;
                    break Label_0059;
                }
            }
            remoteStorefrontDataSource$fetchPrevListingsPage$2 = new RemoteStorefrontDataSource$fetchPrevListingsPage.RemoteStorefrontDataSource$fetchPrevListingsPage$1(this, (c)c);
        }
        final Object result = remoteStorefrontDataSource$fetchPrevListingsPage$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteStorefrontDataSource$fetchPrevListingsPage$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            remoteStorefrontDataSource$fetchPrevListingsPage$2.label = 1;
            if ((o = this.b(n, j3, s, null, (c<? super Result<h5$c>>)remoteStorefrontDataSource$fetchPrevListingsPage$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o;
    }
}
