// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import tvi.webrtc.SurfaceTextureHelper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import tvi.webrtc.ScreenCapturerAndroid;
import android.content.Intent;
import android.media.projection.MediaProjection$Callback;
import android.os.Handler;
import android.content.Context;
import tvi.webrtc.CapturerObserver;

public class ScreenCapturer implements VideoCapturer
{
    private static final int SCREENCAPTURE_FRAME_RATE = 30;
    private static final Logger logger;
    private CapturerObserver capturerObserver;
    private final Context context;
    private boolean firstFrameReported;
    private final Handler listenerHandler;
    private final MediaProjection$Callback mediaProjectionCallback;
    private final CapturerObserver observerAdapter;
    private int orientation;
    private final Intent screenCaptureIntentData;
    private final int screenCaptureIntentResult;
    private final ScreenCapturer.ScreenCapturer$Listener screenCapturerListener;
    private VideoDimensions videoDimensions;
    private ScreenCapturerAndroid webRtcScreenCapturer;
    
    static {
        logger = Logger.getLogger((Class)ScreenCapturer.class);
    }
    
    public ScreenCapturer(final Context context, final int screenCaptureIntentResult, final Intent screenCaptureIntentData, final ScreenCapturer.ScreenCapturer$Listener screenCapturerListener) {
        this.mediaProjectionCallback = (MediaProjection$Callback)new ScreenCapturer$1(this);
        this.observerAdapter = (CapturerObserver)new ScreenCapturer$2(this);
        Preconditions.checkNotNull((Object)context, (Object)"context must not be null");
        Preconditions.checkNotNull((Object)screenCaptureIntentData, (Object)"intent must not be null");
        this.context = context;
        this.screenCaptureIntentData = screenCaptureIntentData;
        this.screenCaptureIntentResult = screenCaptureIntentResult;
        this.screenCapturerListener = screenCapturerListener;
        this.listenerHandler = Util.createCallbackHandler();
        this.orientation = this.getDeviceOrientation();
    }
    
    private int getDeviceOrientation() {
        final int rotation = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getRotation();
        int n;
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    n = 0;
                }
                else {
                    n = 270;
                }
            }
            else {
                n = 180;
            }
        }
        else {
            n = 90;
        }
        return n;
    }
    
    private boolean updateCaptureDimensions(final int n, final int n2) {
        if (n != n2 && Math.abs(n - n2) != 180) {
            ScreenCapturer.logger.d("Orientation change detected");
            return true;
        }
        ScreenCapturer.logger.d("No orientation change detected");
        return false;
    }
    
    public void dispose() {
        final ScreenCapturerAndroid webRtcScreenCapturer = this.webRtcScreenCapturer;
        if (webRtcScreenCapturer != null) {
            webRtcScreenCapturer.dispose();
            this.webRtcScreenCapturer = null;
        }
    }
    
    public VideoFormat getCaptureFormat() {
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return new VideoFormat(new VideoDimensions(displayMetrics.widthPixels, displayMetrics.heightPixels), 30);
    }
    
    public VideoDimensions getVideoDimensions() {
        return this.videoDimensions;
    }
    
    public void initialize(final SurfaceTextureHelper surfaceTextureHelper, final Context context, final CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
        (this.webRtcScreenCapturer = new ScreenCapturerAndroid(this.screenCaptureIntentData, this.mediaProjectionCallback)).initialize(surfaceTextureHelper, context, this.observerAdapter);
    }
    
    public boolean isScreencast() {
        return true;
    }
    
    public void startCapture(final int n, final int n2, final int n3) {
        this.firstFrameReported = false;
        if (this.screenCaptureIntentResult != -1) {
            if (this.screenCapturerListener != null) {
                this.listenerHandler.post((Runnable)new z((Object)this, 0));
            }
            this.observerAdapter.onCapturerStarted(false);
            return;
        }
        this.webRtcScreenCapturer.startCapture(n, n2, n3);
    }
    
    public void stopCapture() {
        final Logger logger = ScreenCapturer.logger;
        logger.d("stopCapture");
        final ScreenCapturerAndroid webRtcScreenCapturer = this.webRtcScreenCapturer;
        if (webRtcScreenCapturer != null) {
            webRtcScreenCapturer.stopCapture();
        }
        logger.d("stopCapture done");
    }
}
