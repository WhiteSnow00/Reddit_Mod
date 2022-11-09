// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout$LayoutParams;
import android.os.Message;
import android.os.Handler$Callback;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class PlayerControlView extends LinearLayout implements View$OnClickListener, SeekBar$OnSeekBarChangeListener
{
    private TextView durationText;
    private ImageButton playPauseButton;
    private Player player;
    private Handler positionHandler;
    private TextView positionText;
    private SeekBar seekBar;
    private Handler visibilityHandler;
    
    public PlayerControlView(final Context context) {
        super(context);
        this.initialize();
    }
    
    public PlayerControlView(final Context context, final AttributeSet set) {
        super(context, set);
        this.initialize();
    }
    
    public PlayerControlView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.initialize();
    }
    
    private static String getDurationString(long minutes) {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        final long hours = milliseconds.toHours(minutes);
        final long n = minutes - TimeUnit.HOURS.toMillis(hours);
        minutes = milliseconds.toMinutes(n);
        final long seconds = milliseconds.toSeconds(n - TimeUnit.MINUTES.toMillis(minutes));
        TimeUnit.SECONDS.toMillis(seconds);
        final StringBuilder sb = new StringBuilder();
        if (hours > 0L) {
            sb.append(String.format(Locale.getDefault(), "%02d", hours));
            sb.append(":");
        }
        sb.append(String.format(Locale.getDefault(), "%02d", minutes));
        sb.append(":");
        sb.append(String.format(Locale.getDefault(), "%02d", seconds));
        return sb.toString();
    }
    
    private void initialize() {
        this.setOrientation(1);
        ((View)this).setBackgroundColor(-16777216);
        ((View)this).getBackground().setAlpha(200);
        this.visibilityHandler = new Handler((Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                ((View)PlayerControlView.this).setVisibility(message.what);
                return true;
            }
        });
        this.positionHandler = new Handler((Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                PlayerControlView.this.updateControls();
                return false;
            }
        });
        (this.seekBar = new SeekBar(((View)this).getContext())).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
        this.positionText = new TextView(((View)this).getContext());
        this.durationText = new TextView(((View)this).getContext());
        this.positionText.setTextAppearance(16974257);
        this.durationText.setTextAppearance(16974257);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        linearLayout$LayoutParams.gravity = 17;
        ((View)(this.playPauseButton = new ImageButton(((View)this).getContext()))).setOnClickListener((View$OnClickListener)this);
        ((View)this.playPauseButton).setBackground((Drawable)null);
        ((ViewGroup)this).addView((View)this.playPauseButton, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, -2);
        linearLayout$LayoutParams2.gravity = 17;
        ((ViewGroup)this).addView((View)this.initializeTimeline(), (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        ((View)this).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
                PlayerControlView.this.updateControls();
            }
            
            public void onViewDetachedFromWindow(final View view) {
            }
        });
    }
    
    private LinearLayout initializeTimeline() {
        final LinearLayout linearLayout = new LinearLayout(((View)this).getContext());
        linearLayout.setOrientation(0);
        final int n = (int)TypedValue.applyDimension(2, 10.0f, ((View)this).getContext().getResources().getDisplayMetrics());
        ((View)linearLayout).setPadding(n, n, 0, n * 3);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        linearLayout$LayoutParams.gravity = 8388627;
        ((ViewGroup)linearLayout).addView((View)this.positionText, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        final LinearLayout$LayoutParams linearLayout$LayoutParams2 = new LinearLayout$LayoutParams(-1, -2);
        linearLayout$LayoutParams2.gravity = 17;
        linearLayout$LayoutParams2.weight = 1.0f;
        ((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams2).setMargins(n, n, n, n);
        ((ViewGroup)linearLayout).addView((View)this.seekBar, (ViewGroup$LayoutParams)linearLayout$LayoutParams2);
        final LinearLayout$LayoutParams linearLayout$LayoutParams3 = new LinearLayout$LayoutParams(-2, -2);
        linearLayout$LayoutParams3.gravity = 8388629;
        ((ViewGroup)linearLayout).addView((View)this.durationText, (ViewGroup$LayoutParams)linearLayout$LayoutParams3);
        return linearLayout;
    }
    
    private void updateControls() {
        final Player player = this.player;
        if (player == null) {
            return;
        }
        final long duration = player.getDuration();
        final long position = this.player.getPosition();
        if (duration == -1L) {
            ((View)this.seekBar).setVisibility(4);
            ((View)this.durationText).setVisibility(4);
        }
        else {
            ((View)this.seekBar).setVisibility(0);
            ((ProgressBar)this.seekBar).setMax((int)duration);
            ((ProgressBar)this.seekBar).setProgress((int)position);
            ((View)this.durationText).setVisibility(0);
            this.durationText.setText((CharSequence)getDurationString(duration));
        }
        this.positionText.setText((CharSequence)getDurationString(position));
        final Player.State state = this.player.getState();
        if (state == Player.State.PLAYING) {
            ((ImageView)this.playPauseButton).setImageResource(17301539);
        }
        else if (state == Player.State.IDLE || state == Player.State.ENDED) {
            ((ImageView)this.playPauseButton).setImageResource(17301540);
        }
        if (((View)this).isAttachedToWindow()) {
            this.positionHandler.removeMessages(0);
            this.positionHandler.sendEmptyMessageDelayed(0, 200L);
        }
    }
    
    public TextView getDurationTextView() {
        return this.durationText;
    }
    
    public ImageButton getPlayButton() {
        return this.playPauseButton;
    }
    
    public TextView getPositionTextView() {
        return this.positionText;
    }
    
    public SeekBar getSeekBar() {
        return this.seekBar;
    }
    
    public void onClick(final View view) {
        final Player player = this.player;
        if (player != null) {
            final Player.State state = player.getState();
            if (state != Player.State.PLAYING && state != Player.State.BUFFERING) {
                this.player.play();
            }
            else {
                this.player.pause();
            }
        }
        this.showControls(true);
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        final Player player = this.player;
        if (player != null && b) {
            final long duration = player.getDuration();
            if (duration > 0L) {
                final long n2 = n;
                if (n2 <= duration) {
                    this.player.seekTo(n2);
                }
            }
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        this.showControls(true);
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
    
    public void setPlayer(final Player player) {
        this.player = player;
        this.updateControls();
    }
    
    public void showControls(final boolean b) {
        this.visibilityHandler.removeMessages(4);
        this.visibilityHandler.removeMessages(0);
        if (b) {
            ((View)this).setVisibility(0);
            this.visibilityHandler.sendMessageDelayed(this.visibilityHandler.obtainMessage(4), 5000L);
        }
        else {
            ((View)this).setVisibility(4);
        }
    }
}
