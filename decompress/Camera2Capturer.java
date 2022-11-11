// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import com.reddit.video.creation.widgets.edit.presenter.e;
import tvi.webrtc.SurfaceTextureHelper;
import android.hardware.camera2.CaptureRequest$Builder;
import s4.a;
import android.os.Handler;
import tvi.webrtc.CapturerObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import tvi.webrtc.CameraVideoCapturer$CameraSwitchHandler;
import tvi.webrtc.CameraVideoCapturer$CameraEventsHandler;
import tvi.webrtc.Camera2Session;
import tvi.webrtc.Camera2Enumerator;
import android.content.Context;

public class Camera2Capturer implements VideoCapturer
{
    private static final String CAMERA_SWITCH_PENDING_ERROR_MESSAGE = "Camera switch already in progress.";
    private static final Logger logger;
    private final Context applicationContext;
    private final Camera2Enumerator camera2Enumerator;
    private Camera2Session camera2Session;
    private final CameraVideoCapturer$CameraEventsHandler cameraEventsHandler;
    private String cameraId;
    private final CameraVideoCapturer$CameraSwitchHandler cameraSwitchHandler;
    private final AtomicBoolean captureRequestUpdatePending;
    private CaptureRequestUpdater captureRequestUpdater;
    private CapturerObserver capturerObserver;
    private final Handler handler;
    private final Camera2Capturer.Camera2Capturer$Listener listener;
    private final CapturerObserver observerAdapter;
    private String pendingCameraId;
    private Camera2Capturer.Camera2Capturer$State state;
    private final Object stateLock;
    private tvi.webrtc.Camera2Capturer webrtcCamera2Capturer;
    
    static {
        logger = Logger.getLogger((Class)Camera2Capturer.class);
    }
    
    public Camera2Capturer(final Context context, final String s) {
        this(context, s, null, Util.createCallbackHandler());
    }
    
    public Camera2Capturer(final Context context, final String s, final Camera2Capturer.Camera2Capturer$Listener camera2Capturer$Listener) {
        this(context, s, camera2Capturer$Listener, Util.createCallbackHandler());
    }
    
    public Camera2Capturer(Context applicationContext, final String cameraId, final Camera2Capturer.Camera2Capturer$Listener listener, final Handler handler) {
        this.stateLock = new Object();
        this.state = Camera2Capturer.Camera2Capturer$State.IDLE;
        this.captureRequestUpdatePending = new AtomicBoolean(false);
        this.cameraEventsHandler = (CameraVideoCapturer$CameraEventsHandler)new Camera2Capturer$1(this);
        this.observerAdapter = (CapturerObserver)new Camera2Capturer$2(this);
        this.cameraSwitchHandler = (CameraVideoCapturer$CameraSwitchHandler)new Camera2Capturer$3(this);
        Preconditions.checkNotNull((Object)applicationContext, (Object)"Context must not be null");
        Preconditions.checkState(isSupported(applicationContext), (Object)"Camera2Capturer is not supported on this device");
        Preconditions.checkNotNull((Object)cameraId, (Object)"Camera ID must not be null");
        Preconditions.checkArgument(cameraId.isEmpty() ^ true, (Object)"Camera ID must not be empty");
        applicationContext = applicationContext.getApplicationContext();
        this.applicationContext = applicationContext;
        this.camera2Enumerator = new Camera2Enumerator(applicationContext);
        this.cameraId = cameraId;
        this.listener = listener;
        this.handler = handler;
    }
    
    private void checkCapturerState() {
        Preconditions.checkState(Util.permissionGranted(this.applicationContext, "android.permission.CAMERA"), (Object)"CAMERA permission must be granted to create videotrack with Camera2Capturer");
        Preconditions.checkState(Camera2Utils.cameraIdSupported(this.applicationContext, this.cameraId), "Camera ID %s is not supported or could not be validated", (Object)this.cameraId);
    }
    
    public static boolean isSupported(final Context context) {
        Preconditions.checkNotNull((Object)context, (Object)"Context must not be null");
        return Camera2Enumerator.isSupported(context);
    }
    
    private void reportError(final Camera2Capturer.Camera2Capturer$Exception ex) {
        Camera2Capturer.logger.e(((Throwable)ex).getMessage(), (Throwable)ex);
        this.handler.post((Runnable)new a(16, this, ex));
    }
    
    private void setSession() {
        Camera2Capturer.logger.d("Camera capture session configured");
        this.camera2Session = (Camera2Session)this.webrtcCamera2Capturer.getCameraSession();
    }
    
    private void updateCaptureRequestOnCameraThread(final CaptureRequestUpdater captureRequestUpdater) {
        Preconditions.checkNotNull((Object)captureRequestUpdater, (Object)"captureRequestUpdate must not be null");
        this.setSession();
        synchronized (this.stateLock) {
            if (this.camera2Session != null) {
                if (this.state == Camera2Capturer.Camera2Capturer$State.RUNNING) {
                    Camera2Capturer.logger.i("Applying custom capture request");
                    final CaptureRequest$Builder configureCaptureRequestBuilder = this.camera2Session.configureCaptureRequestBuilder();
                    if (configureCaptureRequestBuilder == null) {
                        this.reportError(new Camera2Capturer.Camera2Capturer$Exception(3, "Failed to create capture request builder"));
                        this.captureRequestUpdatePending.set(false);
                        return;
                    }
                    captureRequestUpdater.apply(configureCaptureRequestBuilder);
                    if (!this.camera2Session.setSessionRepeatingRequest(configureCaptureRequestBuilder)) {
                        this.reportError(new Camera2Capturer.Camera2Capturer$Exception(3, "Failed to set session repeating request"));
                        this.captureRequestUpdatePending.set(false);
                        return;
                    }
                }
                else {
                    Camera2Capturer.logger.w("Attempted to update camera parameters while camera capturer is not running");
                }
                this.captureRequestUpdatePending.set(false);
            }
        }
    }
    
    public void dispose() {
        final tvi.webrtc.Camera2Capturer webrtcCamera2Capturer = this.webrtcCamera2Capturer;
        if (webrtcCamera2Capturer != null) {
            webrtcCamera2Capturer.dispose();
            this.webrtcCamera2Capturer = null;
        }
    }
    
    public String getCameraId() {
        synchronized (this) {
            return this.cameraId;
        }
    }
    
    public void initialize(final SurfaceTextureHelper surfaceTextureHelper, final Context context, final CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
        (this.webrtcCamera2Capturer = (tvi.webrtc.Camera2Capturer)this.camera2Enumerator.createCapturer(this.cameraId, this.cameraEventsHandler)).initialize(surfaceTextureHelper, context, this.observerAdapter);
    }
    
    public boolean isScreencast() {
        return false;
    }
    
    public void startCapture(final int n, final int n2, final int n3) {
        this.checkCapturerState();
        synchronized (this.stateLock) {
            final Camera2Capturer.Camera2Capturer$State state = this.state;
            if (state != Camera2Capturer.Camera2Capturer$State.IDLE && state != Camera2Capturer.Camera2Capturer$State.STOPPING) {
                if (state == Camera2Capturer.Camera2Capturer$State.STARTING || state == Camera2Capturer.Camera2Capturer$State.RUNNING) {
                    Camera2Capturer.logger.w("attempted to start capturing when capturer is starting or running");
                }
            }
            else {
                Camera2Capturer.logger.i("startCapture");
                this.state = Camera2Capturer.Camera2Capturer$State.STARTING;
                this.webrtcCamera2Capturer.startCapture(n, n2, n3);
            }
        }
    }
    
    public void stopCapture() {
        if (this.webrtcCamera2Capturer != null) {
            synchronized (this.stateLock) {
                this.state = Camera2Capturer.Camera2Capturer$State.STOPPING;
                monitorexit(this.stateLock);
                this.webrtcCamera2Capturer.stopCapture();
            }
        }
    }
    
    public void switchCamera(final String s) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)s, (Object)"Camera ID must not be null");
            final boolean empty = s.isEmpty();
            final boolean b = true;
            Preconditions.checkArgument(!empty, (Object)"Camera ID must not be empty");
            Preconditions.checkArgument(!s.equals(this.cameraId) && b, (Object)"Camera ID must be different from current camera ID");
            Preconditions.checkArgument(Camera2Utils.cameraIdSupported(this.applicationContext, s), "Camera ID %s is not supported or could not be validated", (Object)s);
            synchronized (this.stateLock) {
                if (this.state != Camera2Capturer.Camera2Capturer$State.IDLE) {
                    if (this.pendingCameraId == null) {
                        this.pendingCameraId = s;
                        this.webrtcCamera2Capturer.switchCamera(this.cameraSwitchHandler, s);
                    }
                    else {
                        this.handler.post((Runnable)new e((Object)this, 5));
                    }
                }
                else {
                    this.cameraId = s;
                    final Camera2Capturer.Camera2Capturer$Listener listener = this.listener;
                    if (listener != null) {
                        listener.onCameraSwitched(s);
                    }
                }
            }
        }
    }
    
    public boolean updateCaptureRequest(final CaptureRequestUpdater captureRequestUpdater) {
        synchronized (this) {
            synchronized (this.stateLock) {
                if (this.state != Camera2Capturer.Camera2Capturer$State.RUNNING) {
                    Camera2Capturer.logger.i("Camera2Capturer is not running. The CaptureRequest update will be applied when it is resumed");
                    this.captureRequestUpdater = captureRequestUpdater;
                    return true;
                }
                if (!this.captureRequestUpdatePending.get()) {
                    this.captureRequestUpdatePending.set(true);
                    return this.webrtcCamera2Capturer.getHandler().post((Runnable)new x(1, (Object)this, (Object)captureRequestUpdater));
                }
                Camera2Capturer.logger.w("Parameters will not be applied with parameter update pending");
                return false;
            }
        }
    }
}
