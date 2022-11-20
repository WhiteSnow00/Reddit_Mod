// 
// Decompiled by Procyon v0.6.0
// 

package s60;

import okhttp3.OkHttpClient$Builder;
import com.reddit.data.snoovatar.repository.RedditSnoovatarRepository;
import zi2.c0;
import q60.w;
import com.reddit.data.snoovatar.datasource.remote.RemoteGqlSnoovatarDataSource;
import com.reddit.data.snoovatar.datasource.remote.RemoteSnoovatarDataSource;
import com.reddit.session.n;
import ws0.p;
import ws0.k;
import com.reddit.modtools.scheduledposts.screen.ScheduledPostListingPresenter;
import com.reddit.events.scheduledpost.ScheduledPostAnalytics;
import com.reddit.session.o;
import com.reddit.domain.repository.ModToolsRepository;
import xd0.h0;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import com.reddit.domain.modtools.scheduledposts.usecase.ConvertRichTextToMarkdownUseCase;
import com.reddit.domain.modtools.scheduledposts.usecase.UpdateScheduledPostUseCase;
import com.reddit.domain.modtools.scheduledposts.usecase.SubmitScheduledPostUseCase;
import com.reddit.domain.usecase.GetSubredditScheduledPosts;
import i10.a;
import ng2.e;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import wa0.j;
import ws0.g;
import javax.inject.Provider;
import ne2.d;

public final class b implements d
{
    public final int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    public final Provider k;
    public final Provider l;
    public final Provider m;
    public final Provider n;
    public final Provider o;
    
    public b(final Provider b, final Provider c, final Provider d, final Provider e, final Provider f, final Provider g, final Provider h, final Provider i, final Provider j, final Provider k, final Provider l, final Provider m, final Provider n, final Provider o, final int a) {
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
    
    public final Object get() {
        switch (this.a) {
            default: {
                final g g = (g)this.b.get();
                final j j = (j)this.c.get();
                final OkHttpClient okHttpClient = (OkHttpClient)this.d.get();
                final Interceptor interceptor = (Interceptor)this.e.get();
                final Interceptor interceptor2 = (Interceptor)this.f.get();
                final Interceptor interceptor3 = (Interceptor)this.g.get();
                final Interceptor interceptor4 = (Interceptor)this.h.get();
                final Interceptor interceptor5 = (Interceptor)this.i.get();
                final Interceptor interceptor6 = (Interceptor)this.j.get();
                final Interceptor interceptor7 = (Interceptor)this.k.get();
                final Interceptor interceptor8 = (Interceptor)this.l.get();
                final Interceptor interceptor9 = (Interceptor)this.m.get();
                final Interceptor interceptor10 = (Interceptor)this.n.get();
                final Interceptor interceptor11 = (Interceptor)this.o.get();
                ng2.e.f((Object)g, "hostSettings");
                ng2.e.f((Object)j, "internalFeatures");
                ng2.e.f((Object)okHttpClient, "basicHttpClient");
                ng2.e.f((Object)interceptor, "headerInterceptor");
                ng2.e.f((Object)interceptor2, "stagingCookieInterceptor");
                ng2.e.f((Object)interceptor3, "stethoInterceptor");
                ng2.e.f((Object)interceptor4, "flipperInterceptor");
                ng2.e.f((Object)interceptor5, "oAuthInterceptor");
                ng2.e.f((Object)interceptor6, "tokenValidityInterceptor");
                ng2.e.f((Object)interceptor7, "apiParametersInterceptor");
                ng2.e.f((Object)interceptor8, "serviceParametersInterceptor");
                ng2.e.f((Object)interceptor9, "legacyQueryParametersInterceptor");
                ng2.e.f((Object)interceptor10, "acceptLanguageInterceptor");
                ng2.e.f((Object)interceptor11, "badRestNetworkInterceptor");
                final OkHttpClient$Builder builder = okHttpClient.newBuilder();
                if (g.H()) {
                    i10.a.q(builder);
                    builder.addNetworkInterceptor(interceptor2);
                }
                builder.addNetworkInterceptor(interceptor9);
                builder.addInterceptor(interceptor5);
                builder.addInterceptor(interceptor);
                builder.addInterceptor(interceptor6);
                builder.addInterceptor(interceptor7);
                builder.addInterceptor(interceptor10);
                builder.addNetworkInterceptor(interceptor8);
                if (g.b()) {
                    builder.addNetworkInterceptor(interceptor3);
                }
                if (g.d()) {
                    builder.addNetworkInterceptor(interceptor4);
                }
                j.q();
                final OkHttpClient build = builder.build();
                zd.b.s(build);
                return build;
            }
            case 2: {
                return new ScheduledPostListingPresenter((m31.g)this.b.get(), (GetSubredditScheduledPosts)this.c.get(), (SubmitScheduledPostUseCase)this.d.get(), (UpdateScheduledPostUseCase)this.e.get(), (ConvertRichTextToMarkdownUseCase)this.f.get(), (ScheduledPostRepository)this.g.get(), (m31.e)this.h.get(), (h0)this.i.get(), (ModToolsRepository)this.j.get(), (o)this.k.get(), (ScheduledPostAnalytics)this.l.get(), (l31.a)this.m.get(), (p20.b)this.n.get(), (d20.a)this.o.get());
            }
            case 1: {
                return new qk0.d((ws0.a)this.b.get(), (ka0.b)this.c.get(), (k)this.d.get(), (fd0.d)this.e.get(), (p)this.f.get(), (ws0.b)this.g.get(), this.h, this.i, (n)this.j.get(), (ew1.d)this.k.get(), (hg0.a)this.l.get(), (cj0.a)this.m.get(), this.n, (hj0.b)this.o.get());
            }
            case 0: {
                return new RedditSnoovatarRepository((RemoteSnoovatarDataSource)this.b.get(), (RemoteGqlSnoovatarDataSource)this.c.get(), (xd0.b)this.d.get(), (ge0.b)this.e.get(), (ge0.a)this.f.get(), (q60.k)this.g.get(), (q60.e)this.h.get(), (w)this.i.get(), (t60.g)this.j.get(), (ge0.b)this.k.get(), (j)this.l.get(), (n)this.m.get(), (d20.a)this.n.get(), (c0)this.o.get());
            }
        }
    }
}
