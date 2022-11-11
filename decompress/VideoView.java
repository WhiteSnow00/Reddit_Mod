// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import android.view.SurfaceView;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import tvi.webrtc.VideoFrame;
import tvi.webrtc.RendererCommon$ScalingType;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import android.view.View$OnAttachStateChangeListener;
import tvi.webrtc.RendererCommon$RendererEvents;
import tvi.webrtc.SurfaceViewRenderer;

public class VideoView extends SurfaceViewRenderer
{
    private static final Logger logger;
    private EglBaseProvider eglBaseProvider;
    private final RendererCommon$RendererEvents internalEventListener;
    private RendererCommon$RendererEvents listener;
    private boolean mirror;
    private View$OnAttachStateChangeListener onAttachStateChangeListener;
    private boolean overlaySurface;
    private final Handler uiThreadHandler;
    private VideoScaleType videoScaleType;
    public VideoSinkHintsProducer videoSinkHintsProducer;
    
    static {
        logger = Logger.getLogger((Class)VideoView.class);
    }
    
    public VideoView(final Context context) {
        this(context, null);
    }
    
    public VideoView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.onAttachStateChangeListener = (View$OnAttachStateChangeListener)new VideoView$1(this);
        this.internalEventListener = (RendererCommon$RendererEvents)new VideoView$2(this);
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, R$styleable.VideoView, 0, 0);
        try {
            this.mirror = ((TypedArray)obtainStyledAttributes).getBoolean(R$styleable.VideoView_tviMirror, false);
            this.videoScaleType = VideoScaleType.fromInt(((TypedArray)obtainStyledAttributes).getInteger(R$styleable.VideoView_tviScaleType, 0));
            this.overlaySurface = ((TypedArray)obtainStyledAttributes).getBoolean(R$styleable.VideoView_tviOverlaySurface, false);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private RendererCommon$ScalingType convertToWebRtcScaleType(final VideoScaleType videoScaleType) {
        final int n = VideoView$3.$SwitchMap$com$twilio$video$VideoScaleType[((Enum)videoScaleType).ordinal()];
        if (n == 1) {
            return RendererCommon$ScalingType.SCALE_ASPECT_FILL;
        }
        if (n != 2) {
            return RendererCommon$ScalingType.SCALE_ASPECT_FIT;
        }
        return RendererCommon$ScalingType.SCALE_ASPECT_BALANCED;
    }
    
    private void refreshRenderer() {
        this.uiThreadHandler.post((Runnable)new z((Object)this, 1));
    }
    
    private void setupRenderer() {
        this.init(this.eglBaseProvider.getRootEglBase().getEglBaseContext(), this.internalEventListener);
        this.setMirror(this.mirror);
        this.setScalingType(this.convertToWebRtcScaleType(this.videoScaleType));
        ((SurfaceView)this).setZOrderMediaOverlay(this.overlaySurface);
    }
    
    public void applyZOrder(final boolean overlaySurface) {
        ((SurfaceView)this).setZOrderMediaOverlay(this.overlaySurface = overlaySurface);
    }
    
    public boolean getMirror() {
        return this.mirror;
    }
    
    public long getSinkHintsId() {
        return this.videoSinkHintsProducer.getSinkHintsId();
    }
    
    public VideoScaleType getVideoScaleType() {
        return this.videoScaleType;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!((View)this).isInEditMode()) {
            this.eglBaseProvider = EglBaseProvider.instance((Object)this);
            this.setupRenderer();
        }
    }
    
    public void onDetachedFromWindow() {
        super.release();
        this.eglBaseProvider.release((Object)this);
        super.onDetachedFromWindow();
    }
    
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        super.onFrame(videoFrame);
        videoFrame.release();
    }
    
    public void onSizeChanged(int convertPixelsToDp, int convertPixelsToDp2, final int n, final int n2) {
        super.onSizeChanged(convertPixelsToDp, convertPixelsToDp2, n, n2);
        if (this.videoSinkHintsProducer != null) {
            convertPixelsToDp = UtilKt.convertPixelsToDp(((View)this).getContext(), (float)convertPixelsToDp);
            convertPixelsToDp2 = UtilKt.convertPixelsToDp(((View)this).getContext(), (float)convertPixelsToDp2);
            this.videoSinkHintsProducer.produceSinkHints(convertPixelsToDp, convertPixelsToDp2);
        }
    }
    
    public void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        final VideoSinkHintsProducer videoSinkHintsProducer = this.videoSinkHintsProducer;
        if (videoSinkHintsProducer != null) {
            videoSinkHintsProducer.produceSinkHints(n);
        }
    }
    
    public void removeVideoSinkHintsProducer() {
        this.videoSinkHintsProducer = null;
        ((View)this).removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
    }
    
    public void setListener(final RendererCommon$RendererEvents listener) {
        this.listener = listener;
    }
    
    public void setMirror(final boolean mirror) {
        if (this.mirror != mirror) {
            super.setMirror(this.mirror = mirror);
            this.refreshRenderer();
        }
    }
    
    public void setVideoScaleType(final VideoScaleType videoScaleType) {
        final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
        if (layoutParams != null) {
            final int width = layoutParams.width;
            if (width == -1 || layoutParams.height == -1) {
                VideoScaleType aspect_FILL;
                if (width == -1) {
                    aspect_FILL = VideoScaleType.ASPECT_FILL;
                }
                else {
                    aspect_FILL = videoScaleType;
                }
                VideoScaleType aspect_FILL2;
                if (layoutParams.height == -1) {
                    aspect_FILL2 = VideoScaleType.ASPECT_FILL;
                }
                else {
                    aspect_FILL2 = videoScaleType;
                }
                VideoView.logger.w(String.format("Scale type may not be applied as expected because video view uses MATCH_PARENT. Scaling will be applied as follows: width=%s, height=%s", ((Enum)aspect_FILL).name(), ((Enum)aspect_FILL2).name()));
            }
        }
        this.videoScaleType = videoScaleType;
        this.setScalingType(this.convertToWebRtcScaleType(videoScaleType));
        this.refreshRenderer();
    }
    
    public void setupVideoSinkHintsProducer(final VideoSinkHintsConsumer videoSinkHintsConsumer, final long n) {
        this.videoSinkHintsProducer = new VideoSinkHintsProducer(((View)this).getContext().getResources().getDisplayMetrics().densityDpi, videoSinkHintsConsumer, n, ((View)this).getVisibility(), UtilKt.convertPixelsToDp(((View)this).getContext(), (float)((View)this).getWidth()), UtilKt.convertPixelsToDp(((View)this).getContext(), (float)((View)this).getHeight()));
        ((View)this).addOnAttachStateChangeListener(this.onAttachStateChangeListener);
    }
}
