// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.di;

import ui.b;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va0.f0;
import com.reddit.video.player.internal.player.MimeReader;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import android.content.Context;
import javax.inject.Provider;
import kotlin.Metadata;
import com.google.android.exoplayer2.j;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B?\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0011" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesExoPlayerFactory;", "Lse2/d;", "Lcom/google/android/exoplayer2/j;", "get", "Ljavax/inject/Provider;", "Landroid/content/Context;", "context", "Ljavax/inject/Provider;", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "loadControlProxy", "Lva0/f0;", "videoFeatures", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class PlayerModule_ProvidesExoPlayerFactory implements d<j>
{
    public static final Companion Companion;
    private final Provider<Context> context;
    private final Provider<LoadControlProxy> loadControlProxy;
    private final Provider<MimeReader> mimeReader;
    private final Provider<f0> videoFeatures;
    
    static {
        Companion = new Companion(null);
    }
    
    public PlayerModule_ProvidesExoPlayerFactory(final Provider<Context> context, final Provider<LoadControlProxy> loadControlProxy, final Provider<f0> videoFeatures, final Provider<MimeReader> mimeReader) {
        e.f((Object)context, "context");
        e.f((Object)loadControlProxy, "loadControlProxy");
        e.f((Object)videoFeatures, "videoFeatures");
        e.f((Object)mimeReader, "mimeReader");
        this.context = context;
        this.loadControlProxy = loadControlProxy;
        this.videoFeatures = videoFeatures;
        this.mimeReader = mimeReader;
    }
    
    public static final PlayerModule_ProvidesExoPlayerFactory create(final Provider<Context> provider, final Provider<LoadControlProxy> provider2, final Provider<f0> provider3, final Provider<MimeReader> provider4) {
        return PlayerModule_ProvidesExoPlayerFactory.Companion.create(provider, provider2, provider3, provider4);
    }
    
    public static final j providesExoPlayer(final Context context, final LoadControlProxy loadControlProxy, final f0 f0, final MimeReader mimeReader) {
        return PlayerModule_ProvidesExoPlayerFactory.Companion.providesExoPlayer(context, loadControlProxy, f0, mimeReader);
    }
    
    public j get() {
        final Companion companion = PlayerModule_ProvidesExoPlayerFactory.Companion;
        final Object value = this.context.get();
        e.e(value, "context.get()");
        final Context context = (Context)value;
        final Object value2 = this.loadControlProxy.get();
        e.e(value2, "loadControlProxy.get()");
        final LoadControlProxy loadControlProxy = (LoadControlProxy)value2;
        final Object value3 = this.videoFeatures.get();
        e.e(value3, "videoFeatures.get()");
        final f0 f0 = (f0)value3;
        final Object value4 = this.mimeReader.get();
        e.e(value4, "mimeReader.get()");
        return companion.providesExoPlayer(context, loadControlProxy, f0, (MimeReader)value4);
    }
    
    @Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0011" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesExoPlayerFactory$Companion;", "", "Ljavax/inject/Provider;", "Landroid/content/Context;", "context", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "loadControlProxy", "Lva0/f0;", "videoFeatures", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "Lcom/reddit/video/player/di/PlayerModule_ProvidesExoPlayerFactory;", "create", "Lcom/google/android/exoplayer2/j;", "providesExoPlayer", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final PlayerModule_ProvidesExoPlayerFactory create(final Provider<Context> provider, final Provider<LoadControlProxy> provider2, final Provider<f0> provider3, final Provider<MimeReader> provider4) {
            e.f((Object)provider, "context");
            e.f((Object)provider2, "loadControlProxy");
            e.f((Object)provider3, "videoFeatures");
            e.f((Object)provider4, "mimeReader");
            return new PlayerModule_ProvidesExoPlayerFactory(provider, provider2, provider3, provider4);
        }
        
        public final j providesExoPlayer(final Context context, final LoadControlProxy loadControlProxy, final f0 f0, final MimeReader mimeReader) {
            e.f((Object)context, "context");
            e.f((Object)loadControlProxy, "loadControlProxy");
            e.f((Object)f0, "videoFeatures");
            e.f((Object)mimeReader, "mimeReader");
            final j providesExoPlayer = PlayerModule.INSTANCE.providesExoPlayer(context, loadControlProxy, f0, mimeReader);
            b.m((Object)providesExoPlayer);
            return providesExoPlayer;
        }
    }
}
