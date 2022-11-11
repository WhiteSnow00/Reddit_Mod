// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.databinding;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import a92.b;
import com.reddit.video.player.R;
import android.view.View;
import android.widget.ImageView;
import android.view.TextureView;
import android.view.ViewStub;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import x5.a;

public final class RedditVideoViewBinding implements a
{
    public final AspectRatioFrameLayout redditVideo;
    public final ViewStub redditVideoDefaultControls;
    public final TextureView redditVideoTextureView;
    public final ImageView redditVideoThumbnail;
    private final View rootView;
    
    private RedditVideoViewBinding(final View rootView, final AspectRatioFrameLayout redditVideo, final ViewStub redditVideoDefaultControls, final TextureView redditVideoTextureView, final ImageView redditVideoThumbnail) {
        this.rootView = rootView;
        this.redditVideo = redditVideo;
        this.redditVideoDefaultControls = redditVideoDefaultControls;
        this.redditVideoTextureView = redditVideoTextureView;
        this.redditVideoThumbnail = redditVideoThumbnail;
    }
    
    public static RedditVideoViewBinding bind(final View view) {
        int n = R.id.reddit_video;
        final AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout)b.G(n, view);
        if (aspectRatioFrameLayout != null) {
            n = R.id.reddit_video_default_controls;
            final ViewStub viewStub = (ViewStub)b.G(n, view);
            if (viewStub != null) {
                n = R.id.reddit_video_texture_view;
                final TextureView textureView = (TextureView)b.G(n, view);
                if (textureView != null) {
                    n = R.id.reddit_video_thumbnail;
                    final ImageView imageView = (ImageView)b.G(n, view);
                    if (imageView != null) {
                        return new RedditVideoViewBinding(view, aspectRatioFrameLayout, viewStub, textureView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RedditVideoViewBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.reddit_video_view, viewGroup);
            return bind((View)viewGroup);
        }
        throw new NullPointerException("parent");
    }
    
    @Override
    public View getRoot() {
        return this.rootView;
    }
}
