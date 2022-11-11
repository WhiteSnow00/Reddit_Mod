// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import o90.tt;
import java.util.Map;
import kotlin.Metadata;
import o90.yt;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent;", "Lo90/yt;", "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "target", "Lhg2/j;", "inject", "Factory", "Parent", "player_release" }, k = 1, mv = { 1, 7, 1 })
public interface RedditVideoControlsViewComponent extends yt
{
    void inject(final RedditVideoControlsView p0);
    
    @Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Factory;", "", "create", "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent;", "target", "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public interface Factory
    {
        RedditVideoControlsViewComponent create(final RedditVideoControlsView p0);
    }
    
    @Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Parent;", "", "redditVideoControlsViewComponentFactory", "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Factory;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public interface Parent
    {
        Factory redditVideoControlsViewComponentFactory();
    }
}
