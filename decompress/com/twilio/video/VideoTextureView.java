// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import android.graphics.SurfaceTexture;
import android.graphics.Point;
import cs1.d;
import tvi.webrtc.VideoFrame;
import tvi.webrtc.ThreadUtils;
import tvi.webrtc.RendererCommon$GlDrawer;
import tvi.webrtc.GlRectDrawer;
import tvi.webrtc.EglBase;
import tvi.webrtc.EglBase$Context;
import android.content.res.Resources$NotFoundException;
import tvi.webrtc.RendererCommon$ScalingType;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import tvi.webrtc.RendererCommon$VideoLayoutMeasure;
import android.os.Handler;
import android.view.View$OnAttachStateChangeListener;
import tvi.webrtc.RendererCommon$RendererEvents;
import tvi.webrtc.EglRenderer;
import android.view.TextureView$SurfaceTextureListener;
import tvi.webrtc.VideoSink;
import android.view.TextureView;

public class VideoTextureView extends TextureView implements VideoSink, TextureView$SurfaceTextureListener
{
    private static final Logger logger;
    private EglBaseProvider eglBaseProvider;
    private final EglRenderer eglRenderer;
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private final Object layoutLock;
    private RendererCommon$RendererEvents listener;
    private boolean mirror;
    private View$OnAttachStateChangeListener onAttachStateChangeListener;
    private RendererCommon$RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private Handler uiThreadHandler;
    private final RendererCommon$VideoLayoutMeasure videoLayoutMeasure;
    private VideoScaleType videoScaleType;
    public VideoSinkHintsProducer videoSinkHintsProducer;
    
    static {
        logger = Logger.getLogger((Class)VideoTextureView.class);
    }
    
    public VideoTextureView(final Context context) {
        this(context, null);
    }
    
    public VideoTextureView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.videoLayoutMeasure = new RendererCommon$VideoLayoutMeasure();
        this.videoScaleType = VideoScaleType.ASPECT_FIT;
        this.rendererEvents = (RendererCommon$RendererEvents)new RendererCommon$RendererEvents(this) {
            public final VideoTextureView this$0;
            
            public void onFirstFrameRendered() {
                if (VideoTextureView.b(this.this$0) != null) {
                    VideoTextureView.b(this.this$0).onFirstFrameRendered();
                }
            }
            
            public void onFrameResolutionChanged(final int n, final int n2, final int n3) {
                if (VideoTextureView.b(this.this$0) != null) {
                    VideoTextureView.b(this.this$0).onFrameResolutionChanged(n, n2, n3);
                }
            }
        };
        this.layoutLock = new Object();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.onAttachStateChangeListener = (View$OnAttachStateChangeListener)new VideoTextureView$2(this);
        this.eglRenderer = new EglRenderer(this.getResourceName());
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, R$styleable.VideoTextureView, 0, 0);
        try {
            this.mirror = ((TypedArray)obtainStyledAttributes).getBoolean(R$styleable.VideoTextureView_tviMirror, false);
            this.videoScaleType = VideoScaleType.fromInt(((TypedArray)obtainStyledAttributes).getInteger(R$styleable.VideoTextureView_tviScaleType, 0));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static void a(final VideoTextureView videoTextureView) {
        videoTextureView.lambda$updateFrameDimensionsAndReportEvents$0();
    }
    
    public static /* bridge */ RendererCommon$RendererEvents b(final VideoTextureView videoTextureView) {
        return videoTextureView.listener;
    }
    
    private RendererCommon$ScalingType convertToWebRtcScaleType(final VideoScaleType videoScaleType) {
        final int n = VideoTextureView$3.$SwitchMap$com$twilio$video$VideoScaleType[((Enum)videoScaleType).ordinal()];
        if (n == 1) {
            return RendererCommon$ScalingType.SCALE_ASPECT_FIT;
        }
        if (n == 2) {
            return RendererCommon$ScalingType.SCALE_ASPECT_FILL;
        }
        if (n != 3) {
            return RendererCommon$ScalingType.SCALE_ASPECT_FIT;
        }
        return RendererCommon$ScalingType.SCALE_ASPECT_BALANCED;
    }
    
    private String getResourceName() {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(((View)this).getResources().getResourceEntryName(((View)this).getId()));
            sb.append(": ");
            return sb.toString();
        }
        catch (final Resources$NotFoundException ex) {
            return "";
        }
    }
    
    private void init(final EglBase$Context eglBase$Context, final RendererCommon$RendererEvents rendererCommon$RendererEvents) {
        this.init(eglBase$Context, rendererCommon$RendererEvents, EglBase.CONFIG_PLAIN, (RendererCommon$GlDrawer)new GlRectDrawer());
    }
    
    private void init(final EglBase$Context eglBase$Context, final RendererCommon$RendererEvents rendererEvents, final int[] array, final RendererCommon$GlDrawer rendererCommon$GlDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
            monitorexit(this.layoutLock);
            this.eglRenderer.init(eglBase$Context, array, rendererCommon$GlDrawer);
        }
    }
    
    private void lambda$updateFrameDimensionsAndReportEvents$0() {
        this.updateSurfaceSize();
        ((View)this).requestLayout();
    }
    
    private void updateFrameDimensionsAndReportEvents(final VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isFirstFrameRendered) {
                this.isFirstFrameRendered = true;
                VideoTextureView.logger.v("Reporting first rendered frame.");
                final RendererCommon$RendererEvents rendererEvents = this.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFirstFrameRendered();
                }
            }
            if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                final Logger logger = VideoTextureView.logger;
                final StringBuilder sb = new StringBuilder();
                sb.append("Reporting frame resolution changed to ");
                sb.append(videoFrame.getBuffer().getWidth());
                sb.append("x");
                sb.append(videoFrame.getBuffer().getHeight());
                sb.append(" with rotation ");
                sb.append(videoFrame.getRotation());
                logger.v(sb.toString());
                final RendererCommon$RendererEvents rendererEvents2 = this.rendererEvents;
                if (rendererEvents2 != null) {
                    rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                }
                this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                this.frameRotation = videoFrame.getRotation();
                this.uiThreadHandler.post((Runnable)new d((Object)this, 12));
            }
        }
    }
    
    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && ((View)this).getWidth() != 0 && ((View)this).getHeight() != 0) {
                final float n = ((View)this).getWidth() / (float)((View)this).getHeight();
                int rotatedFrameWidth = this.rotatedFrameWidth;
                final float n2 = (float)rotatedFrameWidth;
                int rotatedFrameHeight = this.rotatedFrameHeight;
                if (n2 / rotatedFrameHeight > n) {
                    rotatedFrameWidth = (int)(rotatedFrameHeight * n);
                }
                else {
                    rotatedFrameHeight = (int)(rotatedFrameWidth / n);
                }
                final int min = Math.min(((View)this).getWidth(), rotatedFrameWidth);
                final int min2 = Math.min(((View)this).getHeight(), rotatedFrameHeight);
                final Logger logger = VideoTextureView.logger;
                final StringBuilder sb = new StringBuilder();
                sb.append("updateSurfaceSize. Layout size: ");
                sb.append(((View)this).getWidth());
                sb.append("x");
                sb.append(((View)this).getHeight());
                sb.append(", frame size: ");
                sb.append(this.rotatedFrameWidth);
                sb.append("x");
                sb.append(this.rotatedFrameHeight);
                sb.append(", requested surface size: ");
                sb.append(min);
                sb.append("x");
                sb.append(min2);
                sb.append(", old surface size: ");
                sb.append(this.surfaceWidth);
                sb.append("x");
                sb.append(this.surfaceHeight);
                logger.v(sb.toString());
                if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
                    this.surfaceWidth = min;
                    this.surfaceHeight = min2;
                }
            }
            else {
                this.surfaceHeight = 0;
                this.surfaceWidth = 0;
            }
        }
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
            final EglBaseProvider instance = EglBaseProvider.instance(this);
            this.eglBaseProvider = instance;
            this.init(instance.getRootEglBase().getEglBaseContext(), this.rendererEvents);
        }
    }
    
    public void onDetachedFromWindow() {
        this.eglRenderer.release();
        this.eglBaseProvider.release(this);
        super.onDetachedFromWindow();
    }
    
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        this.updateFrameDimensionsAndReportEvents(videoFrame);
        this.eglRenderer.onFrame(videoFrame);
        videoFrame.release();
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((n3 - n) / (float)(n4 - n2));
        this.updateSurfaceSize();
    }
    
    public void onMeasure(final int n, final int n2) {
        ThreadUtils.checkIsOnMainThread();
        Object o = this.layoutLock;
        synchronized (o) {
            final Point measure = this.videoLayoutMeasure.measure(n, n2, this.rotatedFrameWidth, this.rotatedFrameHeight);
            monitorexit(o);
            ((View)this).setMeasuredDimension(measure.x, measure.y);
            o = VideoTextureView.logger;
            final StringBuilder t = a.t("onMeasure(). New size: ");
            t.append(measure.x);
            t.append("x");
            t.append(measure.y);
            ((Logger)o).v(t.toString());
        }
    }
    
    public void onSizeChanged(int convertPixelsToDp, int convertPixelsToDp2, final int n, final int n2) {
        super.onSizeChanged(convertPixelsToDp, convertPixelsToDp2, n, n2);
        if (this.videoSinkHintsProducer != null) {
            convertPixelsToDp = UtilKt.convertPixelsToDp(((View)this).getContext(), (float)convertPixelsToDp);
            convertPixelsToDp2 = UtilKt.convertPixelsToDp(((View)this).getContext(), (float)convertPixelsToDp2);
            this.videoSinkHintsProducer.produceSinkHints(convertPixelsToDp, convertPixelsToDp2);
        }
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int surfaceWidth, final int surfaceHeight) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.createEglSurface(surfaceTexture);
        this.surfaceWidth = surfaceWidth;
        this.surfaceHeight = surfaceHeight;
        this.updateSurfaceSize();
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.eglRenderer.releaseEglSurface((Runnable)new x(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        ThreadUtils.checkIsOnMainThread();
        VideoTextureView.logger.v(b.i("surfaceChanged: size: ", n, "x", n2));
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        VideoTextureView.logger.v("onSurfaceTextureUpdated");
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
    
    public void setMirror(final boolean b) {
        if (this.mirror != b) {
            this.eglRenderer.setMirror(b);
            this.mirror = b;
            ((View)this).requestLayout();
        }
    }
    
    public void setVideoScaleType(final VideoScaleType videoScaleType) {
        ThreadUtils.checkIsOnMainThread();
        final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
        if (layoutParams != null) {
            final int width = layoutParams.width;
            if (width == -1 || layoutParams.height == -1) {
                VideoScaleType videoScaleType2;
                if (width == -1) {
                    videoScaleType2 = VideoScaleType.ASPECT_FILL;
                }
                else {
                    videoScaleType2 = this.videoScaleType;
                }
                VideoScaleType videoScaleType3;
                if (layoutParams.height == -1) {
                    videoScaleType3 = VideoScaleType.ASPECT_FILL;
                }
                else {
                    videoScaleType3 = this.videoScaleType;
                }
                VideoTextureView.logger.w(String.format("Scale type may not be applied as expected because video view uses MATCH_PARENT. Scaling will be applied as follows: width=%s, height=%s", ((Enum)videoScaleType2).name(), ((Enum)videoScaleType3).name()));
            }
        }
        this.videoLayoutMeasure.setScalingType(this.convertToWebRtcScaleType(videoScaleType));
        this.videoScaleType = videoScaleType;
        ((View)this).requestLayout();
    }
    
    public void setupVideoSinkHintsProducer(final VideoSinkHintsConsumer videoSinkHintsConsumer, final long n) {
        this.videoSinkHintsProducer = new VideoSinkHintsProducer(((View)this).getContext().getResources().getDisplayMetrics().densityDpi, videoSinkHintsConsumer, n, ((View)this).getVisibility(), UtilKt.convertPixelsToDp(((View)this).getContext(), (float)((View)this).getWidth()), UtilKt.convertPixelsToDp(((View)this).getContext(), (float)((View)this).getHeight()));
        ((View)this).addOnAttachStateChangeListener(this.onAttachStateChangeListener);
    }
}
