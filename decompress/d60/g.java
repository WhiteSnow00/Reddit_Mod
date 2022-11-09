// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import ah2.f;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper_Factory;
import db0.z;
import ge0.a0;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import e60.a;
import com.squareup.moshi.y;
import javax.inject.Provider;
import com.reddit.data.remote.RedditRemoteSearchGqlDataSource;
import af2.d;

public final class g implements d<RedditRemoteSearchGqlDataSource>
{
    public final Provider<y> a;
    public final Provider<a> b;
    public final Provider<GqlPostToLinkDomainModelMapper> c;
    public final Provider<f0> d;
    public final Provider<a0> e;
    public final Provider<rr0.a> f;
    public final Provider<ev.a> g;
    public final Provider<z> h;
    
    public g(final Provider a, final Provider b, final GqlPostToLinkDomainModelMapper_Factory c, final Provider e, final Provider f, final Provider g, final Provider h) {
        final g0 a2 = g0.a;
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "graphQlClient");
        ah2.f.f((Object)c, "gqlPostToLinkDomainModelMapper");
        ah2.f.f((Object)e, "preferenceRepository");
        ah2.f.f((Object)f, "goldFeatures");
        ah2.f.f((Object)g, "adOverrider");
        ah2.f.f((Object)h, "searchFeatures");
        this.a = (Provider<y>)a;
        this.b = (Provider<a>)b;
        this.c = (Provider<GqlPostToLinkDomainModelMapper>)c;
        this.d = (Provider<f0>)a2;
        this.e = (Provider<a0>)e;
        this.f = (Provider<rr0.a>)f;
        this.g = (Provider<ev.a>)g;
        this.h = (Provider<z>)h;
    }
    
    public static final g a(final Provider provider, final Provider provider2, final GqlPostToLinkDomainModelMapper_Factory gqlPostToLinkDomainModelMapper_Factory, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6) {
        f.f((Object)provider, "moshi");
        f.f((Object)provider2, "graphQlClient");
        f.f((Object)gqlPostToLinkDomainModelMapper_Factory, "gqlPostToLinkDomainModelMapper");
        f.f((Object)provider3, "preferenceRepository");
        f.f((Object)provider4, "goldFeatures");
        f.f((Object)provider5, "adOverrider");
        f.f((Object)provider6, "searchFeatures");
        return new g(provider, provider2, gqlPostToLinkDomainModelMapper_Factory, provider3, provider4, provider5, provider6);
    }
    
    public final Object get() {
        final Object value = this.a.get();
        ah2.f.e(value, "moshi.get()");
        final y y = (y)value;
        final Object value2 = this.b.get();
        ah2.f.e(value2, "graphQlClient.get()");
        final a a = (a)value2;
        final Object value3 = this.c.get();
        ah2.f.e(value3, "gqlPostToLinkDomainModelMapper.get()");
        final GqlPostToLinkDomainModelMapper gqlPostToLinkDomainModelMapper = (GqlPostToLinkDomainModelMapper)value3;
        final Object value4 = this.d.get();
        ah2.f.e(value4, "gqlSearchCommunityMapper.get()");
        final f0 f0 = (f0)value4;
        final Object value5 = this.e.get();
        ah2.f.e(value5, "preferenceRepository.get()");
        final a0 a2 = (a0)value5;
        final Object value6 = this.f.get();
        ah2.f.e(value6, "goldFeatures.get()");
        final rr0.a a3 = (rr0.a)value6;
        final Object value7 = this.g.get();
        ah2.f.e(value7, "adOverrider.get()");
        final ev.a a4 = (ev.a)value7;
        final Object value8 = this.h.get();
        ah2.f.e(value8, "searchFeatures.get()");
        return new RedditRemoteSearchGqlDataSource(y, a, gqlPostToLinkDomainModelMapper, f0, a2, a3, a4, (z)value8);
    }
}
