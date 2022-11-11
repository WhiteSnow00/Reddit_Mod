// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.controls;

import o90.xt;
import rg2.a;
import javax.inject.Inject;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import o90.tt;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "Lcom/reddit/video/player/controls/RedditVideoControlsViewFeatureInjector;", "Lo90/tt;", "Lcom/reddit/video/player/controls/RedditVideoControlsView;", "Lhg2/j;", "target", "Lkotlin/Function0;", "factory", "Lo90/xt;", "inject", "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Factory;", "componentFactory", "Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Factory;", "<init>", "(Lcom/reddit/video/player/controls/RedditVideoControlsViewComponent$Factory;)V", "player_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoControlsViewFeatureInjector implements tt<RedditVideoControlsView, j>
{
    private final RedditVideoControlsViewComponent.Factory componentFactory;
    
    @Inject
    public RedditVideoControlsViewFeatureInjector(final RedditVideoControlsViewComponent.Factory componentFactory) {
        e.f((Object)componentFactory, "componentFactory");
        this.componentFactory = componentFactory;
    }
    
    @Override
    public xt inject(final RedditVideoControlsView redditVideoControlsView, final a<j> a) {
        e.f((Object)redditVideoControlsView, "target");
        e.f((Object)a, "factory");
        final RedditVideoControlsViewComponent create = this.componentFactory.create(redditVideoControlsView);
        create.inject(redditVideoControlsView);
        return new xt((Object)create);
    }
}
