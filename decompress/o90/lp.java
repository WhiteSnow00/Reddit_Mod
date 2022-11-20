// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import dw0.a;
import wa0.e0;
import zd.b;
import com.reddit.video.player.view.RedditVideoView_MembersInjector;
import com.reddit.video.player.view.RedditVideoView;
import java.util.Map;
import com.reddit.video.player.di.PlayerModule_ProvidesHlsErrorHandlingPolicyFactory;
import com.reddit.video.player.di.PlayerModule_ProvideLiveLoadControlFactory;
import com.reddit.video.player.di.PlayerModule_ProvidesMediaSourceCacheFactory;
import com.reddit.video.player.internal.AppVersionProvider_Factory;
import com.reddit.video.player.internal.player.MimeReader_Factory;
import com.reddit.video.player.di.PlayerModule_ProvidesVideoCacheFactory;
import com.reddit.video.player.di.PlayerModule_ProvidesLoadControlProxyFactory;
import com.reddit.video.player.di.PlayerModule_ProvidesDefaultLoadControlFactory;
import com.reddit.video.player.internal.player.RedditVideoPlayer_Factory;
import com.google.android.exoplayer2.source.i;
import android.net.Uri;
import j0.g;
import com.reddit.video.player.MediaHeaders_Factory;
import com.reddit.video.player.di.PlayerModule_ProvidesExoPlayerFactory;
import com.reddit.video.player.internal.player.VideoCache;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import wa.c;
import javax.inject.Provider;
import com.reddit.video.player.view.RedditVideoViewComponent;

public final class lp implements RedditVideoViewComponent
{
    public final lk a;
    public Provider<c> b;
    public Provider<LoadControlProxy> c;
    public Provider<VideoCache> d;
    public PlayerModule_ProvidesExoPlayerFactory e;
    public MediaHeaders_Factory f;
    public Provider<g<Uri, i>> g;
    public Provider<c> h;
    public RedditVideoPlayer_Factory i;
    
    public lp(final lk a) {
        this.a = a;
        final Provider b = ne2.c.b((Provider)PlayerModule_ProvidesDefaultLoadControlFactory.create());
        this.b = (Provider<c>)b;
        this.c = (Provider<LoadControlProxy>)ne2.c.b((Provider)PlayerModule_ProvidesLoadControlProxyFactory.create(b));
        this.d = (Provider<VideoCache>)ne2.c.b((Provider)PlayerModule_ProvidesVideoCacheFactory.create());
        this.e = PlayerModule_ProvidesExoPlayerFactory.create((Provider)a.c, (Provider)this.c, (Provider)a.V0, (Provider)MimeReader_Factory.create());
        this.f = MediaHeaders_Factory.create((Provider)AppVersionProvider_Factory.create((Provider)a.c), (Provider)a.j3, (Provider)a.V0, (Provider)a.k3);
        this.g = (Provider<g<Uri, i>>)ne2.c.b((Provider)PlayerModule_ProvidesMediaSourceCacheFactory.create());
        this.h = (Provider<c>)ne2.c.b((Provider)PlayerModule_ProvideLiveLoadControlFactory.create());
        this.i = RedditVideoPlayer_Factory.create((Provider)a.c, (Provider)this.c, (Provider)a.o, (Provider)this.d, (Provider)MimeReader_Factory.create(), (Provider)PlayerModule_ProvidesHlsErrorHandlingPolicyFactory.create(), (Provider)this.e, (Provider)a.V0, (Provider)a.i3, (Provider)this.f, (Provider)a.e, (Provider)this.g, (Provider)this.b, (Provider)this.h);
    }
    
    public final Map<Class<?>, dt<?, ?>> getSubFeatureInjectors() {
        return this.a.l();
    }
    
    public final void inject(final RedditVideoView redditVideoView) {
        RedditVideoView_MembersInjector.injectPlayerProvider(redditVideoView, (Provider)this.i);
        final e0 q3 = ((q90.e0)this.a.a).q3();
        zd.b.r(q3);
        RedditVideoView_MembersInjector.injectVideoFeatures(redditVideoView, q3);
        final a a = ((q90.e0)this.a.a).a();
        zd.b.r(a);
        RedditVideoView_MembersInjector.injectRedditLogger(redditVideoView, a);
    }
}
