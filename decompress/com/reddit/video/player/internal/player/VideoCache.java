// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import cg.d;
import kotlin.Result;
import ad.k;
import ng2.e;
import dw0.a;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.google.android.exoplayer2.upstream.cache.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lcom/reddit/video/player/internal/player/VideoCache;", "", "Ljava/io/File;", "cacheDir", "", "isValid", "Landroid/content/Context;", "context", "Ldw0/a;", "redditLogger", "Lcom/google/android/exoplayer2/upstream/cache/c;", "getCache", "Lcg2/j;", "reset$player_release", "()V", "reset", "cache", "Lcom/google/android/exoplayer2/upstream/cache/c;", "initialized", "Z", "<init>", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoCache
{
    private static final String CACHE_DIR = "reddit-video";
    public static final Companion Companion;
    private static final long MAX_CACHE_SIZE = 268435456L;
    private static final VideoCache instance;
    private c cache;
    private boolean initialized;
    
    static {
        Companion = new Companion(null);
        instance = new VideoCache();
    }
    
    private VideoCache() {
    }
    
    public static final VideoCache access$getInstance$cp() {
        return VideoCache.instance;
    }
    
    private final boolean isValid(final File file) {
        if (file.isDirectory()) {
            return true;
        }
        try {
            file.mkdirs();
            return file.isDirectory();
        }
        catch (final SecurityException ex) {
            return false;
        }
    }
    
    public final c getCache(final Context context, final a a) {
        synchronized (this) {
            e.f((Object)context, "context");
            e.f((Object)a, "redditLogger");
            if (this.initialized) {
                return this.cache;
            }
            this.initialized = true;
            final File file = new File(context.getExternalCacheDir(), "reddit-video");
            final boolean valid = this.isValid(file);
            final c c = null;
            if (!valid) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not use cache dir ");
                sb.append(file);
                sb.append(" for video.");
                a.b((Throwable)new RuntimeException(sb.toString()));
                return null;
            }
            Object constructor-impl = null;
            try {
                Result.constructor-impl((Object)new c(file, new k(), new za.c(context)));
            }
            finally {
                final Throwable t;
                constructor-impl = Result.constructor-impl((Object)d.B1(t));
            }
            if (Result.isFailure-impl(constructor-impl)) {
                constructor-impl = c;
            }
            final c cache = (c)constructor-impl;
            this.cache = cache;
            this.initialized = true;
            return cache;
        }
    }
    
    public final void reset$player_release() {
        this.cache = null;
        this.initialized = false;
    }
    
    @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/player/internal/player/VideoCache$Companion;", "", "()V", "CACHE_DIR", "", "MAX_CACHE_SIZE", "", "instance", "Lcom/reddit/video/player/internal/player/VideoCache;", "getInstance", "()Lcom/reddit/video/player/internal/player/VideoCache;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final VideoCache getInstance() {
            return VideoCache.access$getInstance$cp();
        }
    }
}
