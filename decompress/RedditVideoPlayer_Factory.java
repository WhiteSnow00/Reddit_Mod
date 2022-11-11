// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va0.f0;
import com.reddit.network.info.NetworkTypeProvider;
import com.google.android.exoplayer2.source.i;
import android.net.Uri;
import j0.g;
import com.reddit.video.player.MediaHeaders;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.j;
import a20.a;
import android.content.Context;
import javax.inject.Provider;
import kotlin.Metadata;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u00d7\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0007¨\u0006&" }, d2 = { "Lcom/reddit/video/player/internal/player/RedditVideoPlayer_Factory;", "Lse2/d;", "Lcom/reddit/video/player/internal/player/RedditVideoPlayer;", "get", "Ljavax/inject/Provider;", "Landroid/content/Context;", "context", "Ljavax/inject/Provider;", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "loadControlProxy", "La20/a;", "dispatcherProvider", "Lcom/reddit/video/player/internal/player/VideoCache;", "videoCache", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "Lcom/google/android/exoplayer2/upstream/f;", "hlsErrorHandlingPolicy", "Lcom/google/android/exoplayer2/j;", "exoPlayer", "Lva0/f0;", "videoFeatures", "Lcom/reddit/network/info/NetworkTypeProvider;", "networkTypeProvider", "Lcom/reddit/video/player/MediaHeaders;", "mediaHeaders", "Lcw0/a;", "redditLogger", "Lj0/g;", "Landroid/net/Uri;", "Lcom/google/android/exoplayer2/source/i;", "mediaSourceCache", "Lva/d;", "defaultLoadControlProvider", "liveLoadControlProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoPlayer_Factory implements d<RedditVideoPlayer>
{
    public static final Companion Companion;
    private final Provider<Context> context;
    private final Provider<va.d> defaultLoadControlProvider;
    private final Provider<a> dispatcherProvider;
    private final Provider<j> exoPlayer;
    private final Provider<f> hlsErrorHandlingPolicy;
    private final Provider<va.d> liveLoadControlProvider;
    private final Provider<LoadControlProxy> loadControlProxy;
    private final Provider<MediaHeaders> mediaHeaders;
    private final Provider<g<Uri, i>> mediaSourceCache;
    private final Provider<MimeReader> mimeReader;
    private final Provider<NetworkTypeProvider> networkTypeProvider;
    private final Provider<cw0.a> redditLogger;
    private final Provider<VideoCache> videoCache;
    private final Provider<f0> videoFeatures;
    
    static {
        Companion = new Companion(null);
    }
    
    public RedditVideoPlayer_Factory(final Provider<Context> context, final Provider<LoadControlProxy> loadControlProxy, final Provider<a> dispatcherProvider, final Provider<VideoCache> videoCache, final Provider<MimeReader> mimeReader, final Provider<f> hlsErrorHandlingPolicy, final Provider<j> exoPlayer, final Provider<f0> videoFeatures, final Provider<NetworkTypeProvider> networkTypeProvider, final Provider<MediaHeaders> mediaHeaders, final Provider<cw0.a> redditLogger, final Provider<g<Uri, i>> mediaSourceCache, final Provider<va.d> defaultLoadControlProvider, final Provider<va.d> liveLoadControlProvider) {
        e.f((Object)context, "context");
        e.f((Object)loadControlProxy, "loadControlProxy");
        e.f((Object)dispatcherProvider, "dispatcherProvider");
        e.f((Object)videoCache, "videoCache");
        e.f((Object)mimeReader, "mimeReader");
        e.f((Object)hlsErrorHandlingPolicy, "hlsErrorHandlingPolicy");
        e.f((Object)exoPlayer, "exoPlayer");
        e.f((Object)videoFeatures, "videoFeatures");
        e.f((Object)networkTypeProvider, "networkTypeProvider");
        e.f((Object)mediaHeaders, "mediaHeaders");
        e.f((Object)redditLogger, "redditLogger");
        e.f((Object)mediaSourceCache, "mediaSourceCache");
        e.f((Object)defaultLoadControlProvider, "defaultLoadControlProvider");
        e.f((Object)liveLoadControlProvider, "liveLoadControlProvider");
        this.context = context;
        this.loadControlProxy = loadControlProxy;
        this.dispatcherProvider = dispatcherProvider;
        this.videoCache = videoCache;
        this.mimeReader = mimeReader;
        this.hlsErrorHandlingPolicy = hlsErrorHandlingPolicy;
        this.exoPlayer = exoPlayer;
        this.videoFeatures = videoFeatures;
        this.networkTypeProvider = networkTypeProvider;
        this.mediaHeaders = mediaHeaders;
        this.redditLogger = redditLogger;
        this.mediaSourceCache = mediaSourceCache;
        this.defaultLoadControlProvider = defaultLoadControlProvider;
        this.liveLoadControlProvider = liveLoadControlProvider;
    }
    
    public static final RedditVideoPlayer_Factory create(final Provider<Context> provider, final Provider<LoadControlProxy> provider2, final Provider<a> provider3, final Provider<VideoCache> provider4, final Provider<MimeReader> provider5, final Provider<f> provider6, final Provider<j> provider7, final Provider<f0> provider8, final Provider<NetworkTypeProvider> provider9, final Provider<MediaHeaders> provider10, final Provider<cw0.a> provider11, final Provider<g<Uri, i>> provider12, final Provider<va.d> provider13, final Provider<va.d> provider14) {
        return RedditVideoPlayer_Factory.Companion.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }
    
    public static final RedditVideoPlayer newInstance(final Context context, final LoadControlProxy loadControlProxy, final a a, final VideoCache videoCache, final MimeReader mimeReader, final f f, final j j, final f0 f2, final NetworkTypeProvider networkTypeProvider, final MediaHeaders mediaHeaders, final cw0.a a2, final g<Uri, i> g, final Provider<va.d> provider, final Provider<va.d> provider2) {
        return RedditVideoPlayer_Factory.Companion.newInstance(context, loadControlProxy, a, videoCache, mimeReader, f, j, f2, networkTypeProvider, mediaHeaders, a2, g, provider, provider2);
    }
    
    public RedditVideoPlayer get() {
        final Companion companion = RedditVideoPlayer_Factory.Companion;
        final Object value = this.context.get();
        e.e(value, "context.get()");
        final Context context = (Context)value;
        final Object value2 = this.loadControlProxy.get();
        e.e(value2, "loadControlProxy.get()");
        final LoadControlProxy loadControlProxy = (LoadControlProxy)value2;
        final Object value3 = this.dispatcherProvider.get();
        e.e(value3, "dispatcherProvider.get()");
        final a a = (a)value3;
        final Object value4 = this.videoCache.get();
        e.e(value4, "videoCache.get()");
        final VideoCache videoCache = (VideoCache)value4;
        final Object value5 = this.mimeReader.get();
        e.e(value5, "mimeReader.get()");
        final MimeReader mimeReader = (MimeReader)value5;
        final Object value6 = this.hlsErrorHandlingPolicy.get();
        e.e(value6, "hlsErrorHandlingPolicy.get()");
        final f f = (f)value6;
        final Object value7 = this.exoPlayer.get();
        e.e(value7, "exoPlayer.get()");
        final j j = (j)value7;
        final Object value8 = this.videoFeatures.get();
        e.e(value8, "videoFeatures.get()");
        final f0 f2 = (f0)value8;
        final Object value9 = this.networkTypeProvider.get();
        e.e(value9, "networkTypeProvider.get()");
        final NetworkTypeProvider networkTypeProvider = (NetworkTypeProvider)value9;
        final Object value10 = this.mediaHeaders.get();
        e.e(value10, "mediaHeaders.get()");
        final MediaHeaders mediaHeaders = (MediaHeaders)value10;
        final Object value11 = this.redditLogger.get();
        e.e(value11, "redditLogger.get()");
        final cw0.a a2 = (cw0.a)value11;
        final Object value12 = this.mediaSourceCache.get();
        e.e(value12, "mediaSourceCache.get()");
        return companion.newInstance(context, loadControlProxy, a, videoCache, mimeReader, f, j, f2, networkTypeProvider, mediaHeaders, a2, (g<Uri, i>)value12, this.defaultLoadControlProvider, this.liveLoadControlProvider);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u00d8\u0001\u0010!\u001a\u00020 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H\u0007J\u0090\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H\u0007¨\u0006&" }, d2 = { "Lcom/reddit/video/player/internal/player/RedditVideoPlayer_Factory$Companion;", "", "Ljavax/inject/Provider;", "Landroid/content/Context;", "context", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "loadControlProxy", "La20/a;", "dispatcherProvider", "Lcom/reddit/video/player/internal/player/VideoCache;", "videoCache", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "Lcom/google/android/exoplayer2/upstream/f;", "hlsErrorHandlingPolicy", "Lcom/google/android/exoplayer2/j;", "exoPlayer", "Lva0/f0;", "videoFeatures", "Lcom/reddit/network/info/NetworkTypeProvider;", "networkTypeProvider", "Lcom/reddit/video/player/MediaHeaders;", "mediaHeaders", "Lcw0/a;", "redditLogger", "Lj0/g;", "Landroid/net/Uri;", "Lcom/google/android/exoplayer2/source/i;", "mediaSourceCache", "Lva/d;", "defaultLoadControlProvider", "liveLoadControlProvider", "Lcom/reddit/video/player/internal/player/RedditVideoPlayer_Factory;", "create", "Lcom/reddit/video/player/internal/player/RedditVideoPlayer;", "newInstance", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final RedditVideoPlayer_Factory create(final Provider<Context> provider, final Provider<LoadControlProxy> provider2, final Provider<a> provider3, final Provider<VideoCache> provider4, final Provider<MimeReader> provider5, final Provider<f> provider6, final Provider<j> provider7, final Provider<f0> provider8, final Provider<NetworkTypeProvider> provider9, final Provider<MediaHeaders> provider10, final Provider<cw0.a> provider11, final Provider<g<Uri, i>> provider12, final Provider<va.d> provider13, final Provider<va.d> provider14) {
            e.f((Object)provider, "context");
            e.f((Object)provider2, "loadControlProxy");
            e.f((Object)provider3, "dispatcherProvider");
            e.f((Object)provider4, "videoCache");
            e.f((Object)provider5, "mimeReader");
            e.f((Object)provider6, "hlsErrorHandlingPolicy");
            e.f((Object)provider7, "exoPlayer");
            e.f((Object)provider8, "videoFeatures");
            e.f((Object)provider9, "networkTypeProvider");
            e.f((Object)provider10, "mediaHeaders");
            e.f((Object)provider11, "redditLogger");
            e.f((Object)provider12, "mediaSourceCache");
            e.f((Object)provider13, "defaultLoadControlProvider");
            e.f((Object)provider14, "liveLoadControlProvider");
            return new RedditVideoPlayer_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
        }
        
        public final RedditVideoPlayer newInstance(final Context context, final LoadControlProxy loadControlProxy, final a a, final VideoCache videoCache, final MimeReader mimeReader, final f f, final j j, final f0 f2, final NetworkTypeProvider networkTypeProvider, final MediaHeaders mediaHeaders, final cw0.a a2, final g<Uri, i> g, final Provider<va.d> provider, final Provider<va.d> provider2) {
            e.f((Object)context, "context");
            e.f((Object)loadControlProxy, "loadControlProxy");
            e.f((Object)a, "dispatcherProvider");
            e.f((Object)videoCache, "videoCache");
            e.f((Object)mimeReader, "mimeReader");
            e.f((Object)f, "hlsErrorHandlingPolicy");
            e.f((Object)j, "exoPlayer");
            e.f((Object)f2, "videoFeatures");
            e.f((Object)networkTypeProvider, "networkTypeProvider");
            e.f((Object)mediaHeaders, "mediaHeaders");
            e.f((Object)a2, "redditLogger");
            e.f((Object)g, "mediaSourceCache");
            e.f((Object)provider, "defaultLoadControlProvider");
            e.f((Object)provider2, "liveLoadControlProvider");
            return new RedditVideoPlayer(context, loadControlProxy, a, videoCache, mimeReader, f, j, f2, networkTypeProvider, mediaHeaders, a2, g, provider, provider2);
        }
    }
}
