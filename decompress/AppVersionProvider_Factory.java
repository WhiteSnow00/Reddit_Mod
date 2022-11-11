// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.content.Context;
import javax.inject.Provider;
import kotlin.Metadata;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/player/internal/AppVersionProvider_Factory;", "Lse2/d;", "Lcom/reddit/video/player/internal/AppVersionProvider;", "get", "Ljavax/inject/Provider;", "Landroid/content/Context;", "context", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class AppVersionProvider_Factory implements d<AppVersionProvider>
{
    public static final Companion Companion;
    private final Provider<Context> context;
    
    static {
        Companion = new Companion(null);
    }
    
    public AppVersionProvider_Factory(final Provider<Context> context) {
        e.f((Object)context, "context");
        this.context = context;
    }
    
    public static final AppVersionProvider_Factory create(final Provider<Context> provider) {
        return AppVersionProvider_Factory.Companion.create(provider);
    }
    
    public static final AppVersionProvider newInstance(final Context context) {
        return AppVersionProvider_Factory.Companion.newInstance(context);
    }
    
    public AppVersionProvider get() {
        final Companion companion = AppVersionProvider_Factory.Companion;
        final Object value = this.context.get();
        e.e(value, "context.get()");
        return companion.newInstance((Context)value);
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¨\u0006\n" }, d2 = { "Lcom/reddit/video/player/internal/AppVersionProvider_Factory$Companion;", "", "()V", "create", "Lcom/reddit/video/player/internal/AppVersionProvider_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "newInstance", "Lcom/reddit/video/player/internal/AppVersionProvider;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final AppVersionProvider_Factory create(final Provider<Context> provider) {
            e.f((Object)provider, "context");
            return new AppVersionProvider_Factory(provider);
        }
        
        public final AppVersionProvider newInstance(final Context context) {
            e.f((Object)context, "context");
            return new AppVersionProvider(context);
        }
    }
}
