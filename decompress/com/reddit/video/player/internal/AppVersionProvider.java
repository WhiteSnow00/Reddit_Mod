// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal;

import javax.inject.Inject;
import sg2.e;
import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/player/internal/AppVersionProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppVersionInfo", "Lcom/reddit/video/player/internal/AppVersionInfo;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AppVersionProvider
{
    private final Context context;
    
    @Inject
    public AppVersionProvider(final Context context) {
        e.f((Object)context, "context");
        this.context = context;
    }
    
    public final AppVersionInfo getAppVersionInfo() {
        return AppVersionInfo.Companion.from(this.context);
    }
}
