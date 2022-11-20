// 
// Decompiled by Procyon v0.6.0
// 

package x50;

import okhttp3.OkHttpClient$Builder;
import i10.a;
import okhttp3.ConnectionSpec;
import com.reddit.session.o;
import javax.inject.Inject;
import ng2.e;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import okhttp3.Interceptor;
import ws0.g;

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
        ng2.e.f((Object)a, "hostSettings");
        ng2.e.f((Object)b, "userAgentInterceptor");
        ng2.e.f((Object)c, "headerInterceptor");
        ng2.e.f((Object)d, "stagingCookieInterceptor");
        ng2.e.f((Object)e, "stethoInterceptor");
        ng2.e.f((Object)f, "flipperInterceptor");
        ng2.e.f((Object)g, "oAuthInterceptor");
        ng2.e.f((Object)h, "tokenValidityInterceptor");
        ng2.e.f((Object)i, "apiParametersInterceptor");
        ng2.e.f((Object)j, "serviceParametersInterceptor");
        ng2.e.f((Object)k, "legacyQueryParametersInterceptor");
        ng2.e.f((Object)l, "acceptLanguageInterceptor");
        ng2.e.f((Object)m, "requestRetryInterceptor");
        ng2.e.f((Object)n, "analyticsInterceptor");
        ng2.e.f((Object)o, "okHttpClient");
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
    
    public final OkHttpClient a(final o o) {
        return this.o.newBuilder().retryOnConnectionFailure(false).addInterceptor(this.m).addInterceptor((Interceptor)new d(o)).addInterceptor(this.n).connectionSpecs(cg.d.l3((Object)ConnectionSpec.COMPATIBLE_TLS)).addInterceptor(this.b).build();
    }
    
    public final OkHttpClient b(final o o) {
        ng2.e.f((Object)o, "sessionView");
        final OkHttpClient$Builder builder = this.a(o).newBuilder();
        if (this.a.H()) {
            i10.a.q(builder);
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
