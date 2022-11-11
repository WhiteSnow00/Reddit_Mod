// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.view;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import javax.inject.Provider;
import kotlin.Metadata;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/player/view/RedditVideoViewFeatureInjector_Factory;", "Lse2/d;", "Lcom/reddit/video/player/view/RedditVideoViewFeatureInjector;", "get", "Ljavax/inject/Provider;", "Lcom/reddit/video/player/view/RedditVideoViewComponent$Factory;", "componentFactory", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoViewFeatureInjector_Factory implements d<RedditVideoViewFeatureInjector>
{
    public static final Companion Companion;
    private final Provider<RedditVideoViewComponent.Factory> componentFactory;
    
    static {
        Companion = new Companion(null);
    }
    
    public RedditVideoViewFeatureInjector_Factory(final Provider<RedditVideoViewComponent.Factory> componentFactory) {
        e.f((Object)componentFactory, "componentFactory");
        this.componentFactory = componentFactory;
    }
    
    public static final RedditVideoViewFeatureInjector_Factory create(final Provider<RedditVideoViewComponent.Factory> provider) {
        return RedditVideoViewFeatureInjector_Factory.Companion.create(provider);
    }
    
    public static final RedditVideoViewFeatureInjector newInstance(final RedditVideoViewComponent.Factory factory) {
        return RedditVideoViewFeatureInjector_Factory.Companion.newInstance(factory);
    }
    
    public RedditVideoViewFeatureInjector get() {
        final Companion companion = RedditVideoViewFeatureInjector_Factory.Companion;
        final Object value = this.componentFactory.get();
        e.e(value, "componentFactory.get()");
        return companion.newInstance((RedditVideoViewComponent.Factory)value);
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¨\u0006\n" }, d2 = { "Lcom/reddit/video/player/view/RedditVideoViewFeatureInjector_Factory$Companion;", "", "()V", "create", "Lcom/reddit/video/player/view/RedditVideoViewFeatureInjector_Factory;", "componentFactory", "Ljavax/inject/Provider;", "Lcom/reddit/video/player/view/RedditVideoViewComponent$Factory;", "newInstance", "Lcom/reddit/video/player/view/RedditVideoViewFeatureInjector;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final RedditVideoViewFeatureInjector_Factory create(final Provider<RedditVideoViewComponent.Factory> provider) {
            e.f((Object)provider, "componentFactory");
            return new RedditVideoViewFeatureInjector_Factory(provider);
        }
        
        public final RedditVideoViewFeatureInjector newInstance(final RedditVideoViewComponent.Factory factory) {
            e.f((Object)factory, "componentFactory");
            return new RedditVideoViewFeatureInjector(factory);
        }
    }
}
