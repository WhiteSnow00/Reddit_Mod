// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.video.player.view.RedditVideoView;
import com.reddit.video.player.view.RedditVideoViewComponent;

public final class zp implements Factory
{
    public final dl a;
    
    public zp(final dl a) {
        this.a = a;
    }
    
    @Override
    public final RedditVideoViewComponent create(final RedditVideoView redditVideoView) {
        redditVideoView.getClass();
        return (RedditVideoViewComponent)new aq(this.a);
    }
}
