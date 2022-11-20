// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.tweetui.R$string;
import com.twitter.sdk.android.tweetui.R$drawable;
import com.twitter.sdk.android.tweetui.R$id;
import android.view.ViewGroup;
import com.twitter.sdk.android.tweetui.R$layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.util.AttributeSet;
import android.os.Message;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.os.Handler;
import android.widget.TextView;
import android.widget.FrameLayout;

public class VideoControlView extends FrameLayout
{
    public static final int FADE_DURATION_MS = 150;
    public static final long PROGRESS_BAR_TICKS = 1000L;
    private static final int SHOW_PROGRESS_MSG = 1001;
    public TextView currentTime;
    public TextView duration;
    private final Handler handler;
    public MediaPlayerControl player;
    public SeekBar seekBar;
    public ImageButton stateControl;
    
    public VideoControlView(final Context context) {
        super(context);
        this.handler = new Handler(this) {
            public final VideoControlView this$0;
            
            public void handleMessage(final Message message) {
                if (message.what == 1001) {
                    final VideoControlView this$0 = this.this$0;
                    if (this$0.player == null) {
                        return;
                    }
                    this$0.updateProgress();
                    this.this$0.updateStateControl();
                    if (this.this$0.isShowing() && this.this$0.player.isPlaying()) {
                        this.sendMessageDelayed(this.obtainMessage(1001), 500L);
                    }
                }
            }
        };
    }
    
    public VideoControlView(final Context context, final AttributeSet set) {
        super(context, set);
        this.handler = new Handler(this) {
            public final VideoControlView this$0;
            
            public void handleMessage(final Message message) {
                if (message.what == 1001) {
                    final VideoControlView this$0 = this.this$0;
                    if (this$0.player == null) {
                        return;
                    }
                    this$0.updateProgress();
                    this.this$0.updateStateControl();
                    if (this.this$0.isShowing() && this.this$0.player.isPlaying()) {
                        this.sendMessageDelayed(this.obtainMessage(1001), 500L);
                    }
                }
            }
        };
    }
    
    public VideoControlView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.handler = new Handler(this) {
            public final VideoControlView this$0;
            
            public void handleMessage(final Message message) {
                if (message.what == 1001) {
                    final VideoControlView this$0 = this.this$0;
                    if (this$0.player == null) {
                        return;
                    }
                    this$0.updateProgress();
                    this.this$0.updateStateControl();
                    if (this.this$0.isShowing() && this.this$0.player.isPlaying()) {
                        this.sendMessageDelayed(this.obtainMessage(1001), 500L);
                    }
                }
            }
        };
    }
    
    public static Handler access$000(final VideoControlView videoControlView) {
        return videoControlView.handler;
    }
    
    public SeekBar$OnSeekBarChangeListener createProgressChangeListener() {
        return (SeekBar$OnSeekBarChangeListener)new SeekBar$OnSeekBarChangeListener(this) {
            public final VideoControlView this$0;
            
            public void onProgressChanged(final SeekBar seekBar, int currentTime, final boolean b) {
                if (!b) {
                    return;
                }
                final long n = this.this$0.player.getDuration() * currentTime / 1000L;
                final MediaPlayerControl player = this.this$0.player;
                currentTime = (int)n;
                player.seekTo(currentTime);
                this.this$0.setCurrentTime(currentTime);
            }
            
            public void onStartTrackingTouch(final SeekBar seekBar) {
                VideoControlView.access$000(this.this$0).removeMessages(1001);
            }
            
            public void onStopTrackingTouch(final SeekBar seekBar) {
                VideoControlView.access$000(this.this$0).sendEmptyMessage(1001);
            }
        };
    }
    
    public View$OnClickListener createStateControlClickListener() {
        return (View$OnClickListener)new View$OnClickListener(this) {
            public final VideoControlView this$0;
            
            public void onClick(final View view) {
                if (this.this$0.player.isPlaying()) {
                    this.this$0.player.pause();
                }
                else {
                    this.this$0.player.start();
                }
                this.this$0.show();
            }
        };
    }
    
    public void hide() {
        this.handler.removeMessages(1001);
        AnimationUtils.fadeOut((View)this, 150);
    }
    
    public void initSubviews() {
        ((LayoutInflater)((View)this).getContext().getSystemService("layout_inflater")).inflate(R$layout.tw__video_control, (ViewGroup)this);
        this.stateControl = (ImageButton)((View)this).findViewById(R$id.tw__state_control);
        this.currentTime = (TextView)((View)this).findViewById(R$id.tw__current_time);
        this.duration = (TextView)((View)this).findViewById(R$id.tw__duration);
        ((ProgressBar)(this.seekBar = (SeekBar)((View)this).findViewById(R$id.tw__progress))).setMax(1000);
        this.seekBar.setOnSeekBarChangeListener(this.createProgressChangeListener());
        ((View)this.stateControl).setOnClickListener(this.createStateControlClickListener());
        this.setDuration(0);
        this.setCurrentTime(0);
        this.setProgress(0, 0, 0);
    }
    
    public boolean isShowing() {
        return ((View)this).getVisibility() == 0;
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.initSubviews();
    }
    
    public void setCurrentTime(final int n) {
        this.currentTime.setText((CharSequence)MediaTimeUtils.getPlaybackTime(n));
    }
    
    public void setDuration(final int n) {
        this.duration.setText((CharSequence)MediaTimeUtils.getPlaybackTime(n));
    }
    
    public void setMediaPlayer(final MediaPlayerControl player) {
        this.player = player;
    }
    
    public void setPauseDrawable() {
        ((ImageView)this.stateControl).setImageResource(R$drawable.tw__video_pause_btn);
        ((View)this.stateControl).setContentDescription((CharSequence)((View)this).getContext().getString(R$string.tw__pause));
    }
    
    public void setPlayDrawable() {
        ((ImageView)this.stateControl).setImageResource(R$drawable.tw__video_play_btn);
        ((View)this.stateControl).setContentDescription((CharSequence)((View)this).getContext().getString(R$string.tw__play));
    }
    
    public void setProgress(final int n, final int n2, final int n3) {
        long n4;
        if (n2 > 0) {
            n4 = n * 1000L / n2;
        }
        else {
            n4 = 0L;
        }
        ((ProgressBar)this.seekBar).setProgress((int)n4);
        ((ProgressBar)this.seekBar).setSecondaryProgress(n3 * 10);
    }
    
    public void setReplayDrawable() {
        ((ImageView)this.stateControl).setImageResource(R$drawable.tw__video_replay_btn);
        ((View)this.stateControl).setContentDescription((CharSequence)((View)this).getContext().getString(R$string.tw__replay));
    }
    
    public void show() {
        this.handler.sendEmptyMessage(1001);
        AnimationUtils.fadeIn((View)this, 150);
    }
    
    public void update() {
        this.handler.sendEmptyMessage(1001);
    }
    
    public void updateProgress() {
        final int duration = this.player.getDuration();
        final int currentPosition = this.player.getCurrentPosition();
        final int bufferPercentage = this.player.getBufferPercentage();
        this.setDuration(duration);
        this.setCurrentTime(currentPosition);
        this.setProgress(currentPosition, duration, bufferPercentage);
    }
    
    public void updateStateControl() {
        if (this.player.isPlaying()) {
            this.setPauseDrawable();
        }
        else if (this.player.getCurrentPosition() > Math.max(this.player.getDuration() - 500, 0)) {
            this.setReplayDrawable();
        }
        else {
            this.setPlayDrawable();
        }
    }
    
    public interface MediaPlayerControl
    {
        int getBufferPercentage();
        
        int getCurrentPosition();
        
        int getDuration();
        
        boolean isPlaying();
        
        void pause();
        
        void seekTo(final int p0);
        
        void start();
    }
}
