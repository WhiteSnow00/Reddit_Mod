// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va0.f0;
import javax.inject.Provider;
import kotlin.Metadata;
import pe2.b;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView_MembersInjector;", "Lpe2/b;", "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "instance", "Lhg2/j;", "injectMembers", "Ljavax/inject/Provider;", "Lva0/f0;", "videoFeatures", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "Companion", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoControlsView_MembersInjector implements b<RedditVideoControlsView>
{
    public static final Companion Companion;
    private final Provider<f0> videoFeatures;
    
    static {
        Companion = new Companion(null);
    }
    
    public RedditVideoControlsView_MembersInjector(final Provider<f0> videoFeatures) {
        e.f((Object)videoFeatures, "videoFeatures");
        this.videoFeatures = videoFeatures;
    }
    
    public static final b<RedditVideoControlsView> create(final Provider<f0> provider) {
        return RedditVideoControlsView_MembersInjector.Companion.create(provider);
    }
    
    public static final void injectVideoFeatures(final RedditVideoControlsView redditVideoControlsView, final f0 f0) {
        RedditVideoControlsView_MembersInjector.Companion.injectVideoFeatures(redditVideoControlsView, f0);
    }
    
    public void injectMembers(final RedditVideoControlsView redditVideoControlsView) {
        e.f((Object)redditVideoControlsView, "instance");
        final Companion companion = RedditVideoControlsView_MembersInjector.Companion;
        final Object value = this.videoFeatures.get();
        e.e(value, "videoFeatures.get()");
        companion.injectVideoFeatures(redditVideoControlsView, (f0)value);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsView_MembersInjector$Companion;", "", "Ljavax/inject/Provider;", "Lva0/f0;", "videoFeatures", "Lpe2/b;", "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "create", "instance", "Lhg2/j;", "injectVideoFeatures", "<init>", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final b<RedditVideoControlsView> create(final Provider<f0> provider) {
            e.f((Object)provider, "videoFeatures");
            return (b<RedditVideoControlsView>)new RedditVideoControlsView_MembersInjector(provider);
        }
        
        public final void injectVideoFeatures(final RedditVideoControlsView redditVideoControlsView, final f0 videoFeatures) {
            e.f((Object)redditVideoControlsView, "instance");
            e.f((Object)videoFeatures, "videoFeatures");
            redditVideoControlsView.setVideoFeatures(videoFeatures);
        }
    }
}
