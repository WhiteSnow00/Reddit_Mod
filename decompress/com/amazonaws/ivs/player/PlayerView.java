// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.view.ViewGroup;
import android.view.SurfaceHolder;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.graphics.Typeface;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.SurfaceView;
import android.view.Surface;
import android.widget.ProgressBar;
import android.net.Uri;
import android.widget.TextView;
import android.view.View$OnAttachStateChangeListener;
import android.view.SurfaceHolder$Callback;
import android.widget.FrameLayout;

public class PlayerView extends FrameLayout implements SurfaceHolder$Callback, View$OnAttachStateChangeListener
{
    private AudioFocusHandler audioFocusHandler;
    private boolean captionsEnabled;
    private TextView captionsView;
    private boolean controlsEnabled;
    private PlayerControlView controlsView;
    private Uri mediaUri;
    private Player player;
    private final Player.Listener playerListener;
    private ProgressBar progressView;
    private ResizeMode resizeMode;
    private Surface surface;
    private SurfaceView surfaceView;
    private int videoHeight;
    private int videoWidth;
    
    public PlayerView(final Context context) {
        super(context);
        this.playerListener = (Player.Listener)new PlayerView$1(this);
        this.initialize();
    }
    
    public PlayerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.playerListener = (Player.Listener)new PlayerView$1(this);
        this.initialize();
    }
    
    public PlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.playerListener = (Player.Listener)new PlayerView$1(this);
        this.initialize();
    }
    
    public static /* synthetic */ int access$500(final PlayerView playerView) {
        return playerView.videoWidth;
    }
    
    public static /* synthetic */ int access$600(final PlayerView playerView) {
        return playerView.videoHeight;
    }
    
    public static /* synthetic */ SurfaceView access$700(final PlayerView playerView) {
        return playerView.surfaceView;
    }
    
    public static /* synthetic */ ResizeMode access$800(final PlayerView playerView) {
        return playerView.resizeMode;
    }
    
    private void initialize() {
        this.controlsEnabled = true;
        this.audioFocusHandler = new AudioFocusHandler(((View)this).getContext());
        this.resizeMode = ResizeMode.FIT;
        this.surfaceView = new SurfaceView(((View)this).getContext());
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        frameLayout$LayoutParams.gravity = 17;
        ((ViewGroup)this).addView((View)this.surfaceView, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.surfaceView.getHolder().addCallback((SurfaceHolder$Callback)this);
        ((View)(this.captionsView = new TextView(((View)this).getContext()))).setBackgroundColor(-16777216);
        this.captionsView.setTypeface(Typeface.MONOSPACE);
        this.captionsView.setTextSize(2, 24.0f);
        ((View)this.captionsView).setTextAlignment(4);
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-2, -2);
        frameLayout$LayoutParams2.gravity = 81;
        ((ViewGroup)this).addView((View)this.captionsView, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        (this.progressView = new ProgressBar(((View)this).getContext())).setIndeterminate(true);
        ((View)this.progressView).setVisibility(4);
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(-2, -2);
        frameLayout$LayoutParams3.gravity = 17;
        ((ViewGroup)this).addView((View)this.progressView, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        (this.player = Player.Factory.create(((View)this).getContext())).addListener(this.playerListener);
        ((View)this).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.controlsView = new PlayerControlView(((View)this).getContext());
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-1, -2);
        frameLayout$LayoutParams4.gravity = 80;
        ((ViewGroup)this).addView((View)this.controlsView, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        this.controlsView.setPlayer(this.player);
    }
    
    public boolean getCaptionsEnabled() {
        return this.captionsEnabled;
    }
    
    public PlayerControlView getControls() {
        return this.controlsView;
    }
    
    public boolean getControlsEnabled() {
        return this.controlsEnabled;
    }
    
    public Uri getMediaUri() {
        return this.mediaUri;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public ResizeMode getResizeMode() {
        return this.resizeMode;
    }
    
    public int getVolumeControlStream() {
        return this.audioFocusHandler.getVolumeControlStream();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final Player player = this.player;
        if (player != null) {
            if (n == 126) {
                player.play();
                return true;
            }
            if (n == 86 || n == 127) {
                player.pause();
                return true;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            ((View)this.surfaceView).post((Runnable)new Runnable() {
                @Override
                public void run() {
                    if (PlayerView.access$500(PlayerView.this) > 0 && PlayerView.access$600(PlayerView.this) > 0) {
                        PlayerView.access$800(PlayerView.this).setLayoutParams(PlayerView.access$700(PlayerView.this), PlayerView.access$500(PlayerView.this), PlayerView.access$600(PlayerView.this));
                    }
                }
            });
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent && this.controlsEnabled) {
            this.controlsView.showControls(true);
        }
        return onTouchEvent;
    }
    
    public void onViewAttachedToWindow(final View view) {
        final Uri mediaUri = this.mediaUri;
        if (mediaUri != null) {
            this.player.load(mediaUri);
            this.player.play();
        }
        final Surface surface = this.surface;
        if (surface != null) {
            this.player.setSurface(surface);
        }
    }
    
    public void onViewDetachedFromWindow(final View view) {
        ((View)this.progressView).setVisibility(4);
        this.audioFocusHandler.abandonFocus();
    }
    
    public void setCaptionsEnabled(final boolean captionsEnabled) {
        this.captionsEnabled = captionsEnabled;
        final TextView captionsView = this.captionsView;
        int visibility;
        if (captionsEnabled) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)captionsView).setVisibility(visibility);
    }
    
    public void setControlsEnabled(final boolean controlsEnabled) {
        this.controlsEnabled = controlsEnabled;
        if (controlsEnabled) {
            ((View)this.controlsView).setVisibility(0);
        }
        else {
            ((View)this.controlsView).setVisibility(4);
        }
    }
    
    public void setMediaUri(final Uri mediaUri) {
        this.mediaUri = mediaUri;
        final Player player = this.player;
        if (player != null) {
            player.load(mediaUri);
        }
    }
    
    public void setResizeMode(final ResizeMode resizeMode) {
        this.resizeMode = resizeMode;
        final int videoWidth = this.videoWidth;
        if (videoWidth > 0) {
            final int videoHeight = this.videoHeight;
            if (videoHeight > 0) {
                resizeMode.setLayoutParams(this.surfaceView, videoWidth, videoHeight);
            }
        }
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final Surface surface = surfaceHolder.getSurface();
        this.surface = surface;
        final Player player = this.player;
        if (player != null) {
            player.setSurface(surface);
        }
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.surface = null;
        final Player player = this.player;
        if (player != null) {
            player.setSurface((Surface)null);
        }
    }
}
