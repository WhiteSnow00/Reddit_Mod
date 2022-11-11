// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import va0.f0;
import com.reddit.video.player.controls.RedditVideoControlsView_MembersInjector;
import ui.b;
import com.reddit.video.player.controls.RedditVideoControlsView;
import java.util.Map;
import com.reddit.video.player.controls.RedditVideoControlsViewComponent;

public final class yp implements RedditVideoControlsViewComponent
{
    public final dl a;
    
    public yp(final dl a) {
        this.a = a;
    }
    
    @Override
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
    
    @Override
    public final void inject(final RedditVideoControlsView redditVideoControlsView) {
        final f0 o3 = ((e0)this.a.a).o3();
        b.n((Object)o3);
        RedditVideoControlsView_MembersInjector.injectVideoFeatures(redditVideoControlsView, o3);
    }
}
