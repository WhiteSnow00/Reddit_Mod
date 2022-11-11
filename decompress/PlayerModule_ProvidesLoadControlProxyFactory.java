// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.di;

import ui.b;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import javax.inject.Provider;
import kotlin.Metadata;
import com.reddit.video.player.internal.player.loadcontrol.LoadControlProxy;
import se2.d;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesLoadControlProxyFactory;", "Lse2/d;", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "get", "Ljavax/inject/Provider;", "Lva/d;", "defaultLoadControl", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class PlayerModule_ProvidesLoadControlProxyFactory implements d<LoadControlProxy>
{
    public static final Companion Companion;
    private final Provider<va.d> defaultLoadControl;
    
    static {
        Companion = new Companion(null);
    }
    
    public PlayerModule_ProvidesLoadControlProxyFactory(final Provider<va.d> defaultLoadControl) {
        e.f((Object)defaultLoadControl, "defaultLoadControl");
        this.defaultLoadControl = defaultLoadControl;
    }
    
    public static final PlayerModule_ProvidesLoadControlProxyFactory create(final Provider<va.d> provider) {
        return PlayerModule_ProvidesLoadControlProxyFactory.Companion.create(provider);
    }
    
    public static final LoadControlProxy providesLoadControlProxy(final va.d d) {
        return PlayerModule_ProvidesLoadControlProxyFactory.Companion.providesLoadControlProxy(d);
    }
    
    public LoadControlProxy get() {
        final Companion companion = PlayerModule_ProvidesLoadControlProxyFactory.Companion;
        final Object value = this.defaultLoadControl.get();
        e.e(value, "defaultLoadControl.get()");
        return companion.providesLoadControlProxy((va.d)value);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000b" }, d2 = { "Lcom/reddit/video/player/di/PlayerModule_ProvidesLoadControlProxyFactory$Companion;", "", "Ljavax/inject/Provider;", "Lva/d;", "defaultLoadControl", "Lcom/reddit/video/player/di/PlayerModule_ProvidesLoadControlProxyFactory;", "create", "Lcom/reddit/video/player/internal/player/loadcontrol/LoadControlProxy;", "providesLoadControlProxy", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final PlayerModule_ProvidesLoadControlProxyFactory create(final Provider<va.d> provider) {
            e.f((Object)provider, "defaultLoadControl");
            return new PlayerModule_ProvidesLoadControlProxyFactory(provider);
        }
        
        public final LoadControlProxy providesLoadControlProxy(final va.d d) {
            e.f((Object)d, "defaultLoadControl");
            final LoadControlProxy providesLoadControlProxy = PlayerModule.INSTANCE.providesLoadControlProxy(d);
            b.m((Object)providesLoadControlProxy);
            return providesLoadControlProxy;
        }
    }
}
