// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import sf2.o;
import qw.d;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.k7;
import h7.h$a;
import com.reddit.data.model.StreamVideoDataRemoteDataModel;
import java.util.List;
import nf2.c0;
import javax.inject.Inject;
import kotlin.a;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import pg2.f;
import com.squareup.moshi.y;
import ur0.g;

public final class RemoteGqlStreamDataSource
{
    public final g a;
    public final y b;
    public final f c;
    
    @Inject
    public RemoteGqlStreamDataSource(final g a, final y b, final GqlPostToLinkDomainModelMapper gqlPostToLinkDomainModelMapper) {
        ah2.f.f((Object)a, "graphQlClient");
        ah2.f.f((Object)b, "moshi");
        ah2.f.f((Object)gqlPostToLinkDomainModelMapper, "gqlPostToLinkDomainModelMapper");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new RemoteGqlStreamDataSource$richTextAdapter.RemoteGqlStreamDataSource$richTextAdapter$2(this));
    }
    
    public final c0<List<StreamVideoDataRemoteDataModel>> a(final Integer n) {
        final c0 w = e$a.a((e)this.a, (k)new k7(h$a.a(), h$a.a(), h$a.a(), h$a.c((Object)n), h$a.a(), h$a.a()), (OkHttpClient)null, (Map)null, 14).w((o)new d(11));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026\n      }\n      list\n    }");
        return (c0<List<StreamVideoDataRemoteDataModel>>)w;
    }
}
