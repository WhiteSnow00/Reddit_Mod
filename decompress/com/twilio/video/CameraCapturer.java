// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import h.r;
import androidx.appcompat.widget.a1;
import tvi.webrtc.ThreadUtils;
import tvi.webrtc.SurfaceTextureHelper;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import android.hardware.Camera$PreviewCallback;
import java.util.Arrays;
import tvi.webrtc.Camera1Capturer;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import android.content.Context;
import tvi.webrtc.CapturerObserver;
import tvi.webrtc.CameraVideoCapturer$CameraSwitchHandler;
import tvi.webrtc.CameraVideoCapturer$CameraEventsHandler;
import java.util.concurrent.CountDownLatch;
import tvi.webrtc.Camera1Session;
import tvi.webrtc.Camera1Enumerator;

public class CameraCapturer implements VideoCapturer
{
    private static final int CAMERA_CLOSED_TIMEOUT_MS = 3000;
    public static final int ERROR_CAMERA_FREEZE = 0;
    public static final int ERROR_CAMERA_PERMISSION_NOT_GRANTED = 3;
    public static final int ERROR_CAMERA_SERVER_STOPPED = 1;
    public static final int ERROR_CAMERA_SWITCH_FAILED = 5;
    private static final String ERROR_MESSAGE_CAMERA_SERVER_DIED = "Camera server died!";
    private static final String ERROR_MESSAGE_UNKNOWN = "Camera error:";
    public static final int ERROR_UNKNOWN = 6;
    public static final int ERROR_UNSUPPORTED_SOURCE = 2;
    private static final Logger logger;
    private final Camera1Enumerator camera1Enumerator;
    private Camera1Session camera1Session;
    private CountDownLatch cameraClosed;
    private final CameraVideoCapturer$CameraEventsHandler cameraEventsHandler;
    private String cameraId;
    private CameraParameterUpdater cameraParameterUpdater;
    private final CameraVideoCapturer$CameraSwitchHandler cameraSwitchHandler;
    private CapturerObserver capturerObserver;
    private final Context context;
    private final Handler handler;
    private CameraCapturer.CameraCapturer$Listener listener;
    private final CapturerObserver observerAdapter;
    private final AtomicBoolean parameterUpdatePending;
    private String pendingCameraId;
    private CameraCapturer.CameraCapturer$State state;
    private final Object stateLock;
    public Camera1Capturer webRtcCameraCapturer;
    
    static {
        logger = Logger.getLogger((Class)CameraCapturer.class);
    }
    
    public CameraCapturer(final Context context, final String s) {
        this(context, s, null);
    }
    
    public CameraCapturer(final Context context, final String s, final CameraCapturer.CameraCapturer$Listener cameraCapturer$Listener) {
        this(context, s, cameraCapturer$Listener, Util.createCallbackHandler());
    }
    
    public CameraCapturer(final Context context, final String cameraId, final CameraCapturer.CameraCapturer$Listener listener, final Handler handler) {
        this.stateLock = new Object();
        this.state = CameraCapturer.CameraCapturer$State.IDLE;
        this.parameterUpdatePending = new AtomicBoolean(false);
        this.observerAdapter = (CapturerObserver)new CameraCapturer$1(this);
        this.cameraEventsHandler = (CameraVideoCapturer$CameraEventsHandler)new CameraCapturer$2(this);
        this.cameraSwitchHandler = (CameraVideoCapturer$CameraSwitchHandler)new CameraCapturer$3(this);
        Preconditions.checkNotNull((Object)context, (Object)"Context must not be null");
        Preconditions.checkNotNull((Object)cameraId, (Object)"Camera source must not be null");
        Preconditions.checkArgument(cameraId.isEmpty() ^ true, (Object)"Camera ID must not be empty");
        this.context = context;
        this.camera1Enumerator = new Camera1Enumerator(false);
        this.cameraId = cameraId;
        this.listener = listener;
        this.handler = handler;
    }
    
    private static boolean cameraIdSupported(final Camera1Enumerator camera1Enumerator, final String s) {
        return Arrays.asList(camera1Enumerator.getDeviceNames()).contains(s);
    }
    
    private void checkCapturerState() {
        Preconditions.checkState(Util.permissionGranted(this.context, "android.permission.CAMERA"), (Object)"CAMERA permission must be granted to start capturer");
        Preconditions.checkState(cameraIdSupported(this.camera1Enumerator, this.cameraId), "Camera ID %s is not supported or could not be validated", (Object)this.cameraId);
    }
    
    private void setSession() {
        CameraCapturer.logger.d("Camera capture session configured");
        this.camera1Session = (Camera1Session)this.webRtcCameraCapturer.getCameraSession();
    }
    
    private void updateCameraParametersOnCameraThread(final CameraParameterUpdater cameraParameterUpdater) {
        synchronized (this.stateLock) {
            if (this.state == CameraCapturer.CameraCapturer$State.RUNNING) {
                final Camera camera = this.camera1Session.getCamera();
                final Camera$Parameters parameters = camera.getParameters();
                CameraCapturer.logger.i("Applying camera parameters");
                cameraParameterUpdater.apply(parameters);
                camera.stopPreview();
                camera.setPreviewCallbackWithBuffer((Camera$PreviewCallback)null);
                camera.setParameters(parameters);
                Camera1Session.initializeCallbackBuffer(this.camera1Session.getCaptureFormat(), camera);
                this.camera1Session.listenForBytebufferFrames();
                camera.startPreview();
            }
            else {
                CameraCapturer.logger.w("Attempted to update camera parameters while camera capturer is not running");
            }
            this.parameterUpdatePending.set(false);
        }
    }
    
    public void dispose() {
        final Camera1Capturer webRtcCameraCapturer = this.webRtcCameraCapturer;
        if (webRtcCameraCapturer != null) {
            webRtcCameraCapturer.dispose();
            this.webRtcCameraCapturer = null;
        }
    }
    
    public String getCameraId() {
        synchronized (this) {
            return this.cameraId;
        }
    }
    
    public void initialize(final SurfaceTextureHelper surfaceTextureHelper, final Context context, final CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
        (this.webRtcCameraCapturer = (Camera1Capturer)this.camera1Enumerator.createCapturer(this.cameraId, this.cameraEventsHandler)).initialize(surfaceTextureHelper, context, this.observerAdapter);
    }
    
    public boolean isScreencast() {
        return false;
    }
    
    public void startCapture(final int n, final int n2, final int n3) {
        this.checkCapturerState();
        synchronized (this.stateLock) {
            final CameraCapturer.CameraCapturer$State state = this.state;
            if (state != CameraCapturer.CameraCapturer$State.IDLE && state != CameraCapturer.CameraCapturer$State.STOPPING) {
                if (state == CameraCapturer.CameraCapturer$State.STARTING || state == CameraCapturer.CameraCapturer$State.RUNNING) {
                    CameraCapturer.logger.w("attempted to start capturing when capturer is starting or running");
                }
            }
            else {
                CameraCapturer.logger.i("startCapture");
                this.state = CameraCapturer.CameraCapturer$State.STARTING;
                this.webRtcCameraCapturer.startCapture(n, n2, n3);
            }
        }
    }
    
    public void stopCapture() {
        if (this.webRtcCameraCapturer != null) {
            synchronized (this.stateLock) {
                this.state = CameraCapturer.CameraCapturer$State.STOPPING;
                this.cameraClosed = new CountDownLatch(1);
                monitorexit(this.stateLock);
                this.webRtcCameraCapturer.stopCapture();
                if (!ThreadUtils.awaitUninterruptibly(this.cameraClosed, 3000L)) {
                    CameraCapturer.logger.e("Camera closed event not received");
                }
                synchronized (this.stateLock) {
                    this.cameraClosed = null;
                    this.state = CameraCapturer.CameraCapturer$State.IDLE;
                }
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
            Preconditions.checkArgument(cameraIdSupported(this.camera1Enumerator, s), "Camera ID %s is not supported or could not be validated", (Object)s);
            synchronized (this.stateLock) {
                if (this.state != CameraCapturer.CameraCapturer$State.IDLE) {
                    if (this.pendingCameraId == null) {
                        this.pendingCameraId = s;
                        this.webRtcCameraCapturer.switchCamera(this.cameraSwitchHandler, s);
                    }
                    else {
                        this.handler.post((Runnable)new a1((Object)this, 23));
                    }
                }
                else {
                    this.cameraId = s;
                    this.listener.onCameraSwitched(s);
                }
            }
        }
    }
    
    public boolean updateCameraParameters(final CameraParameterUpdater cameraParameterUpdater) {
        synchronized (this) {
            synchronized (this.stateLock) {
                if (this.state != CameraCapturer.CameraCapturer$State.RUNNING) {
                    CameraCapturer.logger.i("Camera capturer is not running. Parameters will be applied when camera capturer is resumed");
                    this.cameraParameterUpdater = cameraParameterUpdater;
                    return true;
                }
                if (!this.parameterUpdatePending.get()) {
                    this.parameterUpdatePending.set(true);
                    return this.webRtcCameraCapturer.getHandler().post((Runnable)new r(27, this, cameraParameterUpdater));
                }
                CameraCapturer.logger.w("Parameters will not be applied with parameter update pending");
                return false;
            }
        }
    }
}
