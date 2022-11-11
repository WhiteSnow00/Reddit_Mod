// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import ui.b;
import com.reddit.video.player.view.RedditVideoView_MembersInjector;
import com.reddit.video.player.view.RedditVideoView;
import java.util.Map;
import com.reddit.video.player.MediaHeaders;
import com.reddit.network.info.NetworkTypeProvider;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.upstream.f;
import a20.a;
import com.reddit.video.player.di.PlayerModule_ProvidesHlsErrorHandlingPolicyFactory;
import com.reddit.video.player.di.PlayerModule_ProvideLiveLoadControlFactory;
import com.reddit.video.player.di.PlayerModule_ProvidesMediaSourceCacheFactory;
import com.reddit.video.player.internal.AppVersionProvider_Factory;
import com.reddit.video.player.internal.player.MimeReader;
import va0.f0;
import android.content.Context;
import com.reddit.video.player.internal.player.MimeReader_Factory;
import com.reddit.video.player.di.PlayerModule_ProvidesVideoCacheFactory;
import com.reddit.video.player.di.PlayerModule_ProvidesLoadControlProxyFactory;
import se2.c;
import com.reddit.video.player.di.PlayerModule_ProvidesDefaultLoadControlFactory;
import com.reddit.video.player.internal.player.RedditVideoPlayer_Factory;
import com.google.android.exoplayer2.source.i;
import android.net.Uri;
import j0.g;
import com.reddit.video.player.MediaHeaders_Factory;
import com.reddit.video.player.di.PlayerModule_ProvidesExoPlayerFactory;
import com.reddit.video.player.internal.player.VideoCache;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import va.d;
import javax.inject.Provider;
import com.reddit.video.player.view.RedditVideoViewComponent;

public final class aq implements RedditVideoViewComponent
{
    public final dl a;
    public Provider<d> b;
    public Provider<LoadControlProxy> c;
    public Provider<VideoCache> d;
    public PlayerModule_ProvidesExoPlayerFactory e;
    public MediaHeaders_Factory f;
    public Provider<g<Uri, i>> g;
    public Provider<d> h;
    public RedditVideoPlayer_Factory i;
    
    public aq(final dl a) {
        this.a = a;
        final Provider b = se2.c.b((Provider)PlayerModule_ProvidesDefaultLoadControlFactory.create());
        this.b = (Provider<d>)b;
        this.c = (Provider<LoadControlProxy>)se2.c.b((Provider)PlayerModule_ProvidesLoadControlProxyFactory.create((Provider<d>)b));
        this.d = (Provider<VideoCache>)se2.c.b((Provider)PlayerModule_ProvidesVideoCacheFactory.create());
        this.e = PlayerModule_ProvidesExoPlayerFactory.create((Provider<Context>)a.c, this.c, (Provider<f0>)a.T0, (Provider<MimeReader>)MimeReader_Factory.create());
        this.f = MediaHeaders_Factory.create((Provider)AppVersionProvider_Factory.create((Provider<Context>)a.c), (Provider)a.s2, (Provider)a.T0, (Provider)a.t2);
        this.g = (Provider<g<Uri, i>>)se2.c.b((Provider)PlayerModule_ProvidesMediaSourceCacheFactory.create());
        this.h = (Provider<d>)se2.c.b((Provider)PlayerModule_ProvideLiveLoadControlFactory.create());
        this.i = RedditVideoPlayer_Factory.create((Provider<Context>)a.c, this.c, (Provider<a>)a.o, this.d, (Provider<MimeReader>)MimeReader_Factory.create(), (Provider<f>)PlayerModule_ProvidesHlsErrorHandlingPolicyFactory.create(), (Provider<j>)this.e, (Provider<f0>)a.T0, (Provider<NetworkTypeProvider>)a.r2, (Provider<MediaHeaders>)this.f, (Provider<cw0.a>)a.e, this.g, this.b, this.h);
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
    
    public final void inject(final RedditVideoView redditVideoView) {
        RedditVideoView_MembersInjector.injectPlayerProvider(redditVideoView, (Provider)this.i);
        final f0 o3 = ((e0)this.a.a).o3();
        ui.b.n((Object)o3);
        RedditVideoView_MembersInjector.injectVideoFeatures(redditVideoView, o3);
        final cw0.a a = ((e0)this.a.a).a();
        ui.b.n((Object)a);
        RedditVideoView_MembersInjector.injectRedditLogger(redditVideoView, a);
    }
}
