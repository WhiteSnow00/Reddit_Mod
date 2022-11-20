// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.di;

import com.reddit.video.player.internal.player.VideoCache;
import android.net.Uri;
import j0.g;
import wa.y;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.k;
import wa.i;
import wa.d;
import wa.f;
import com.google.android.exoplayer2.j$b;
import ng2.e;
import com.reddit.video.player.internal.player.MimeReader;
import wa0.e0;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import android.content.Context;
import javax.inject.Named;
import ah0.b;
import zc.j;
import wa.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J*\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule;", "", "Lwa/c;", "providesDefaultLoadControl", "provideLiveLoadControl", "defaultLoadControl", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "providesLoadControlProxy", "Lcom/reddit/video/player/internal/player/VideoCache;", "providesVideoCache", "Landroid/content/Context;", "context", "loadControlProxy", "Lwa0/e0;", "videoFeatures", "Lcom/reddit/video/player/internal/player/MimeReader;", "mimeReader", "Lcom/google/android/exoplayer2/j;", "providesExoPlayer", "Lcom/google/android/exoplayer2/upstream/f;", "providesHlsErrorHandlingPolicy", "Lj0/g;", "Landroid/net/Uri;", "Lcom/google/android/exoplayer2/source/i;", "providesMediaSourceCache", "", "DEFAULT_LOAD_CONTROL", "Ljava/lang/String;", "LIVE_LOAD_CONTROL", "MEDIA_SOURCE_CACHE", "", "STREAM_BUFFER_MS", "I", "MEDIA_SOURCES_CACHE_SIZE", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class PlayerModule
{
    public static final String DEFAULT_LOAD_CONTROL = "DEFAULT_LOAD_CONTROL";
    public static final PlayerModule INSTANCE;
    public static final String LIVE_LOAD_CONTROL = "LIVE_LOAD_CONTROL";
    private static final int MEDIA_SOURCES_CACHE_SIZE = 40;
    public static final String MEDIA_SOURCE_CACHE = "MEDIA_SOURCE_CACHE";
    private static final int STREAM_BUFFER_MS = 3000;
    
    static {
        INSTANCE = new PlayerModule();
    }
    
    private PlayerModule() {
    }
    
    @Named("LIVE_LOAD_CONTROL")
    public final c provideLiveLoadControl() {
        final c.a a = new c.a();
        final j a2 = new j();
        b.H(a.h ^ true);
        a.a = a2;
        a.b(3000, 3000, 3000, 2500);
        b.H(a.h ^ true);
        a.f = 5000;
        b.H(a.h ^ true);
        a.g = true;
        return a.a();
    }
    
    @Named("DEFAULT_LOAD_CONTROL")
    public final c providesDefaultLoadControl() {
        final c.a a = new c.a();
        b.H(a.h ^ true);
        a.g = true;
        return a.a();
    }
    
    public final com.google.android.exoplayer2.j providesExoPlayer(final Context context, final LoadControlProxy loadControlProxy, final e0 e0, final MimeReader mimeReader) {
        e.f((Object)context, "context");
        e.f((Object)loadControlProxy, "loadControlProxy");
        e.f((Object)e0, "videoFeatures");
        e.f((Object)mimeReader, "mimeReader");
        final j$b j$b = new j$b(context);
        b.H(j$b.s ^ true);
        j$b.f = (sg.j)new f(loadControlProxy, 0);
        if (e0.C4()) {
            final d d = new d(context);
            d.d = mimeReader.getMediaCodecSelector();
            b.H(j$b.s ^ true);
            j$b.c = (sg.j)new i(d, 0);
        }
        b.H(j$b.s ^ true);
        j$b.s = true;
        return (com.google.android.exoplayer2.j)new k(j$b, (w)null);
    }
    
    public final com.google.android.exoplayer2.upstream.f providesHlsErrorHandlingPolicy() {
        return (com.google.android.exoplayer2.upstream.f)new PlayerModule$providesHlsErrorHandlingPolicy$1();
    }
    
    public final LoadControlProxy providesLoadControlProxy(@Named("DEFAULT_LOAD_CONTROL") final c c) {
        e.f((Object)c, "defaultLoadControl");
        return new LoadControlProxy((y)c);
    }
    
    @Named("MEDIA_SOURCE_CACHE")
    public final g<Uri, com.google.android.exoplayer2.source.i> providesMediaSourceCache() {
        return (g<Uri, com.google.android.exoplayer2.source.i>)new g(40);
    }
    
    public final VideoCache providesVideoCache() {
        return VideoCache.Companion.getInstance();
    }
}
