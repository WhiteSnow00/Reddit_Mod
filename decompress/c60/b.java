// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import okhttp3.OkHttpClient$Builder;
import eg.n0;
import ah2.c;
import okhttp3.ConnectionSpec;
import com.reddit.session.r;
import javax.inject.Inject;
import ah2.f;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import okhttp3.Interceptor;
import bt0.g;

public final class b
{
    public final g a;
    public final Interceptor b;
    public final Interceptor c;
    public final Interceptor d;
    public final Interceptor e;
    public final Interceptor f;
    public final Interceptor g;
    public final Interceptor h;
    public final Interceptor i;
    public final Interceptor j;
    public final Interceptor k;
    public final Interceptor l;
    public final Interceptor m;
    public final Interceptor n;
    public final OkHttpClient o;
    
    @Inject
    public b(final g a, @Named("UserAgentInterceptor") final Interceptor b, @Named("HeaderInterceptor") final Interceptor c, @Named("StagingCookieInterceptor") final Interceptor d, @Named("StethoInterceptor") final Interceptor e, @Named("FlipperInterceptor") final Interceptor f, @Named("OAuthInterceptor") final Interceptor g, @Named("TokenValidityInterceptor") final Interceptor h, @Named("ApiParametersInterceptor") final Interceptor i, @Named("ServiceParametersInterceptor") final Interceptor j, @Named("LegacyQueryParametersInterceptor") final Interceptor k, @Named("AcceptLanguageInterceptor") final Interceptor l, @Named("RequestRetryInterceptor") final Interceptor m, @Named("AnalyticsInterceptor") final Interceptor n, final OkHttpClient o) {
        ah2.f.f((Object)a, "hostSettings");
        ah2.f.f((Object)b, "userAgentInterceptor");
        ah2.f.f((Object)c, "headerInterceptor");
        ah2.f.f((Object)d, "stagingCookieInterceptor");
        ah2.f.f((Object)e, "stethoInterceptor");
        ah2.f.f((Object)f, "flipperInterceptor");
        ah2.f.f((Object)g, "oAuthInterceptor");
        ah2.f.f((Object)h, "tokenValidityInterceptor");
        ah2.f.f((Object)i, "apiParametersInterceptor");
        ah2.f.f((Object)j, "serviceParametersInterceptor");
        ah2.f.f((Object)k, "legacyQueryParametersInterceptor");
        ah2.f.f((Object)l, "acceptLanguageInterceptor");
        ah2.f.f((Object)m, "requestRetryInterceptor");
        ah2.f.f((Object)n, "analyticsInterceptor");
        ah2.f.f((Object)o, "okHttpClient");
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
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public final OkHttpClient a(final r r) {
        return this.o.newBuilder().retryOnConnectionFailure(false).addInterceptor(this.m).addInterceptor((Interceptor)new d(r)).addInterceptor(this.n).connectionSpecs(ah2.c.X((Object)ConnectionSpec.COMPATIBLE_TLS)).addInterceptor(this.b).build();
    }
    
    public final OkHttpClient b(final r r) {
        ah2.f.f((Object)r, "sessionView");
        final OkHttpClient$Builder builder = this.a(r).newBuilder();
        if (this.a.G()) {
            n0.F(builder);
            builder.addNetworkInterceptor(this.d);
        }
        builder.addNetworkInterceptor(this.k);
        builder.addInterceptor(this.g);
        builder.addInterceptor(this.c);
        builder.addInterceptor(this.h);
        builder.addInterceptor(this.i);
        builder.addInterceptor(this.l);
        builder.addNetworkInterceptor(this.j);
        if (this.a.b()) {
            builder.addNetworkInterceptor(this.e);
        }
        if (this.a.d()) {
            builder.addNetworkInterceptor(this.f);
        }
        return builder.build();
    }
}
