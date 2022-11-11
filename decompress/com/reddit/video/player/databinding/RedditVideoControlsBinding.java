// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.databinding;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import a92.b;
import com.reddit.video.player.R;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import x5.a;

public final class RedditVideoControlsBinding implements a
{
    public final ConstraintLayout redditVideoControlsBar;
    public final View redditVideoControlsBg;
    public final TextView redditVideoControlsCallToAction;
    public final ImageView redditVideoControlsCallToActionIcon;
    public final ImageView redditVideoControlsFullscreen;
    public final ImageView redditVideoControlsMute;
    public final ImageView redditVideoControlsMuteBg;
    public final ImageView redditVideoControlsPause;
    public final ImageView redditVideoControlsPlay;
    public final TextView redditVideoControlsReplay;
    public final ImageView redditVideoControlsReplayIcon;
    public final TextView redditVideoControlsSeekDuration;
    public final TextView redditVideoControlsSeekPosition;
    public final SeekBar redditVideoControlsSeekbar;
    public final View redditVideoControlsShadow;
    public final ProgressBar redditVideoControlsSpinner;
    private final ConstraintLayout rootView;
    
    private RedditVideoControlsBinding(final ConstraintLayout rootView, final ConstraintLayout redditVideoControlsBar, final View redditVideoControlsBg, final TextView redditVideoControlsCallToAction, final ImageView redditVideoControlsCallToActionIcon, final ImageView redditVideoControlsFullscreen, final ImageView redditVideoControlsMute, final ImageView redditVideoControlsMuteBg, final ImageView redditVideoControlsPause, final ImageView redditVideoControlsPlay, final TextView redditVideoControlsReplay, final ImageView redditVideoControlsReplayIcon, final TextView redditVideoControlsSeekDuration, final TextView redditVideoControlsSeekPosition, final SeekBar redditVideoControlsSeekbar, final View redditVideoControlsShadow, final ProgressBar redditVideoControlsSpinner) {
        this.rootView = rootView;
        this.redditVideoControlsBar = redditVideoControlsBar;
        this.redditVideoControlsBg = redditVideoControlsBg;
        this.redditVideoControlsCallToAction = redditVideoControlsCallToAction;
        this.redditVideoControlsCallToActionIcon = redditVideoControlsCallToActionIcon;
        this.redditVideoControlsFullscreen = redditVideoControlsFullscreen;
        this.redditVideoControlsMute = redditVideoControlsMute;
        this.redditVideoControlsMuteBg = redditVideoControlsMuteBg;
        this.redditVideoControlsPause = redditVideoControlsPause;
        this.redditVideoControlsPlay = redditVideoControlsPlay;
        this.redditVideoControlsReplay = redditVideoControlsReplay;
        this.redditVideoControlsReplayIcon = redditVideoControlsReplayIcon;
        this.redditVideoControlsSeekDuration = redditVideoControlsSeekDuration;
        this.redditVideoControlsSeekPosition = redditVideoControlsSeekPosition;
        this.redditVideoControlsSeekbar = redditVideoControlsSeekbar;
        this.redditVideoControlsShadow = redditVideoControlsShadow;
        this.redditVideoControlsSpinner = redditVideoControlsSpinner;
    }
    
    public static RedditVideoControlsBinding bind(final View view) {
        int n = R.id.reddit_video_controls_bar;
        final ConstraintLayout constraintLayout = (ConstraintLayout)b.G(n, view);
        if (constraintLayout != null) {
            n = R.id.reddit_video_controls_bg;
            final View g = b.G(n, view);
            if (g != null) {
                n = R.id.reddit_video_controls_call_to_action;
                final TextView textView = (TextView)b.G(n, view);
                if (textView != null) {
                    n = R.id.reddit_video_controls_call_to_action_icon;
                    final ImageView imageView = (ImageView)b.G(n, view);
                    if (imageView != null) {
                        n = R.id.reddit_video_controls_fullscreen;
                        final ImageView imageView2 = (ImageView)b.G(n, view);
                        if (imageView2 != null) {
                            n = R.id.reddit_video_controls_mute;
                            final ImageView imageView3 = (ImageView)b.G(n, view);
                            if (imageView3 != null) {
                                n = R.id.reddit_video_controls_mute_bg;
                                final ImageView imageView4 = (ImageView)b.G(n, view);
                                if (imageView4 != null) {
                                    n = R.id.reddit_video_controls_pause;
                                    final ImageView imageView5 = (ImageView)b.G(n, view);
                                    if (imageView5 != null) {
                                        n = R.id.reddit_video_controls_play;
                                        final ImageView imageView6 = (ImageView)b.G(n, view);
                                        if (imageView6 != null) {
                                            n = R.id.reddit_video_controls_replay;
                                            final TextView textView2 = (TextView)b.G(n, view);
                                            if (textView2 != null) {
                                                n = R.id.reddit_video_controls_replay_icon;
                                                final ImageView imageView7 = (ImageView)b.G(n, view);
                                                if (imageView7 != null) {
                                                    n = R.id.reddit_video_controls_seek_duration;
                                                    final TextView textView3 = (TextView)b.G(n, view);
                                                    if (textView3 != null) {
                                                        n = R.id.reddit_video_controls_seek_position;
                                                        final TextView textView4 = (TextView)b.G(n, view);
                                                        if (textView4 != null) {
                                                            n = R.id.reddit_video_controls_seekbar;
                                                            final SeekBar seekBar = (SeekBar)b.G(n, view);
                                                            if (seekBar != null) {
                                                                n = R.id.reddit_video_controls_shadow;
                                                                final View g2 = b.G(n, view);
                                                                if (g2 != null) {
                                                                    n = R.id.reddit_video_controls_spinner;
                                                                    final ProgressBar progressBar = (ProgressBar)b.G(n, view);
                                                                    if (progressBar != null) {
                                                                        return new RedditVideoControlsBinding((ConstraintLayout)view, constraintLayout, g, textView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView2, imageView7, textView3, textView4, seekBar, g2, progressBar);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }
    
    public static RedditVideoControlsBinding inflate(final LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
    
    public static RedditVideoControlsBinding inflate(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final boolean b) {
        final View inflate = layoutInflater.inflate(R.layout.reddit_video_controls, viewGroup, false);
        if (b) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
    
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
