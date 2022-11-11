// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.databinding;

import com.reddit.video.player.R;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.reddit.video.player.controls.RedditVideoControlsView;
import x5.a;

public final class RedditDefaultVideoControlsBinding implements a
{
    private final RedditVideoControlsView rootView;
    
    private RedditDefaultVideoControlsBinding(final RedditVideoControlsView rootView) {
        this.rootView = rootView;
    }
    
    public static RedditDefaultVideoControlsBinding bind(final View view) {
        if (view != null) {
            return new RedditDefaultVideoControlsBinding((RedditVideoControlsView)view);
        }
        throw new NullPointerException("rootView");
    }
    
    public static RedditDefaultVideoControlsBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RedditDefaultVideoControlsBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R.layout.reddit_default_video_controls, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public RedditVideoControlsView getRoot() {
        return this.rootView;
    }
}
