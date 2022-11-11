// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.di;

import ui.b;
import kotlin.Metadata;
import com.google.android.exoplayer2.source.i;
import android.net.Uri;
import j0.g;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0005\u001a\u00020\u0000H\u0007J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\n" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesMediaSourceCacheFactory;", "Lse2/d;", "Lj0/g;", "Landroid/net/Uri;", "Lcom/google/android/exoplayer2/source/i;", "create", "providesMediaSourceCache", "get", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class PlayerModule_ProvidesMediaSourceCacheFactory implements d<g<Uri, i>>
{
    public static final PlayerModule_ProvidesMediaSourceCacheFactory INSTANCE;
    
    static {
        INSTANCE = new PlayerModule_ProvidesMediaSourceCacheFactory();
    }
    
    private PlayerModule_ProvidesMediaSourceCacheFactory() {
    }
    
    public static final PlayerModule_ProvidesMediaSourceCacheFactory create() {
        return PlayerModule_ProvidesMediaSourceCacheFactory.INSTANCE;
    }
    
    public static final g<Uri, i> providesMediaSourceCache() {
        final g<Uri, i> providesMediaSourceCache = PlayerModule.INSTANCE.providesMediaSourceCache();
        b.m((Object)providesMediaSourceCache);
        return providesMediaSourceCache;
    }
    
    public g<Uri, i> get() {
        return providesMediaSourceCache();
    }
}
