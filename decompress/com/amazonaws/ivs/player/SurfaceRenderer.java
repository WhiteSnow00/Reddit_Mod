// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.nio.ByteBuffer;
import android.util.Log;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Looper;
import android.view.WindowManager;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.view.Surface;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;

class SurfaceRenderer implements MediaRenderer, VideoRenderer, Choreographer$FrameCallback
{
    private static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String FORMAT_KEY_CROP_TOP = "crop-top";
    private Choreographer choreographer;
    private int droppedFrames;
    private long frameTimeNanos;
    private Handler handler;
    private long lastMediaTime;
    private long mediaTime;
    private float playbackRate;
    private long renderPresentationTime;
    private int renderedFrames;
    private Size size;
    private boolean sizeChanged;
    private WeakReference<VideoSizeListener> sizeListener;
    private long startTime;
    private Surface surface;
    private SurfaceChangeListener surfaceChangeListener;
    private final Object surfaceLock;
    private long syncInterval;
    
    public SurfaceRenderer(final Context context, final VideoSizeListener videoSizeListener) {
        this.renderPresentationTime = -1L;
        this.lastMediaTime = -1L;
        this.playbackRate = 1.0f;
        if (context != null) {
            this.surfaceLock = new Object();
            this.size = new Size(0, 0);
            this.sizeListener = new WeakReference<VideoSizeListener>(videoSizeListener);
            this.syncInterval = TimeUnit.MILLISECONDS.toMicros(33L);
            final WindowManager windowManager = (WindowManager)context.getSystemService("window");
            if (windowManager != null) {
                this.syncInterval = (long)(1.0f / windowManager.getDefaultDisplay().getRefreshRate() * TimeUnit.SECONDS.toMicros(1L));
            }
            this.handler = new Handler(Looper.getMainLooper());
            return;
        }
        throw new IllegalArgumentException();
    }
    
    private void addFrameCallback() {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                SurfaceRenderer.this.getChoreographer().postFrameCallback((Choreographer$FrameCallback)SurfaceRenderer.this);
            }
        });
    }
    
    private Choreographer getChoreographer() {
        if (this.choreographer == null) {
            this.choreographer = Choreographer.getInstance();
        }
        return this.choreographer;
    }
    
    private void removeFrameCallback() {
        this.handler.post((Runnable)new Runnable() {
            @Override
            public void run() {
                SurfaceRenderer.this.getChoreographer().removeFrameCallback((Choreographer$FrameCallback)SurfaceRenderer.this);
            }
        });
    }
    
    private void updateVideoSize() {
        if (this.sizeChanged) {
            this.sizeChanged = false;
            final VideoSizeListener videoSizeListener = this.sizeListener.get();
            if (videoSizeListener != null) {
                final Size size = this.size;
                videoSizeListener.onSizeChange(size.width, size.height);
            }
        }
    }
    
    public void configure(final MediaFormat mediaFormat) {
        final int integer = mediaFormat.getInteger("width");
        final int integer2 = mediaFormat.getInteger("height");
        int n = integer;
        int n2 = integer2;
        if (mediaFormat.containsKey("crop-left")) {
            n = integer;
            n2 = integer2;
            if (mediaFormat.containsKey("crop-right")) {
                n = integer;
                n2 = integer2;
                if (mediaFormat.containsKey("crop-top")) {
                    n = integer;
                    n2 = integer2;
                    if (mediaFormat.containsKey("crop-bottom")) {
                        final int integer3 = mediaFormat.getInteger("crop-left");
                        final int integer4 = mediaFormat.getInteger("crop-right");
                        final int integer5 = mediaFormat.getInteger("crop-top");
                        final int integer6 = mediaFormat.getInteger("crop-bottom");
                        n = integer4 - integer3 + 1;
                        n2 = integer6 - integer5 + 1;
                    }
                }
            }
        }
        final Size size = new Size(n, n2);
        final Size size2 = this.size;
        if (size2 == null || !size2.equals(size)) {
            this.size = size;
            this.sizeChanged = true;
        }
    }
    
    public void doFrame(final long frameTimeNanos) {
        this.frameTimeNanos = frameTimeNanos;
        this.getChoreographer().postFrameCallbackDelayed((Choreographer$FrameCallback)this, 1000L);
    }
    
    public void flush() {
        this.droppedFrames = 0;
        this.renderedFrames = 0;
        this.renderPresentationTime = -1L;
        this.lastMediaTime = -1L;
        this.mediaTime = 0L;
        this.startTime = 0L;
    }
    
    public int getDroppedFrames() {
        return this.droppedFrames;
    }
    
    public int getRenderedFrames() {
        return this.renderedFrames;
    }
    
    public long getRenderedPresentationTime() {
        return this.renderPresentationTime;
    }
    
    public Surface getSurface() {
        synchronized (this.surfaceLock) {
            return this.surface;
        }
    }
    
    public Size getVideoSize() {
        return this.size;
    }
    
    public void release() {
        this.removeFrameCallback();
    }
    
    public void render(final MediaCodec mediaCodec, final int n, final long n2) {
        if (this.mediaTime == 0L) {
            this.mediaTime = n2;
            this.startTime = System.nanoTime();
        }
        final long nanoTime = System.nanoTime();
        final long n3 = TimeUnit.NANOSECONDS.toMicros((long)((nanoTime - this.startTime) * this.playbackRate)) + this.mediaTime;
        long n4;
        if (n3 > 0L) {
            n4 = n2 - n3;
        }
        else {
            n4 = 0L;
        }
        long n5;
        boolean b = false;
        if (n4 > 0L && n4 <= this.syncInterval * 3L) {
            n5 = TimeUnit.MICROSECONDS.toNanos(n4) + nanoTime;
            b = true;
        }
        else {
            Label_0298: {
                if (n4 >= -this.syncInterval && this.startTime > 0L) {
                    final long micros = TimeUnit.MILLISECONDS.toMicros(10L);
                    final long micros2 = TimeUnit.SECONDS.toMicros(1L);
                    final long n6 = n4 - micros - this.syncInterval * 2L;
                    if (n6 > micros2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SurfaceRender waiting ");
                        sb.append(n6);
                        sb.append(" us media ");
                        sb.append(n3);
                        sb.append(" presentation ");
                        sb.append(n2);
                        Log.w("AmazonIVS", sb.toString());
                    }
                    if (n6 >= micros) {
                        Clock.sleep(TimeUnit.MICROSECONDS.toMillis(Math.min(n6, micros2)));
                    }
                }
                else if (this.renderedFrames > 0) {
                    b = false;
                    break Label_0298;
                }
                b = true;
            }
            if (b) {
                n5 = TimeUnit.MICROSECONDS.toNanos(n4) + System.nanoTime();
            }
            else {
                n5 = 0L;
            }
        }
        synchronized (this.surfaceLock) {
            if (this.surface == null) {
                b = false;
            }
            if (b) {
                final long nanos = TimeUnit.MICROSECONDS.toNanos(this.syncInterval);
                final long frameTimeNanos = this.frameTimeNanos;
                mediaCodec.releaseOutputBuffer(n, nanos * ((n5 - frameTimeNanos) / nanos) + frameTimeNanos);
            }
            else {
                mediaCodec.releaseOutputBuffer(n, b);
            }
            monitorexit(this.surfaceLock);
            if (b) {
                ++this.renderedFrames;
                this.updateVideoSize();
            }
            else {
                ++this.droppedFrames;
            }
            this.renderPresentationTime = n2;
        }
    }
    
    public void render(final ByteBuffer byteBuffer, final int n, final long renderPresentationTime) {
        this.renderPresentationTime = renderPresentationTime;
        ++this.renderedFrames;
    }
    
    public void setMediaTime(final long lastMediaTime) {
        if (this.lastMediaTime != -1L && lastMediaTime == -1L) {
            this.mediaTime = 0L;
            Log.d("AmazonIVS", "SurfaceRender reset time");
        }
        this.lastMediaTime = lastMediaTime;
        if (this.mediaTime <= 0L || System.nanoTime() - this.startTime > TimeUnit.SECONDS.toNanos(1L) * this.playbackRate) {
            long mediaTime = lastMediaTime;
            if (lastMediaTime == -1L) {
                mediaTime = 0L;
            }
            this.mediaTime = mediaTime;
            this.startTime = System.nanoTime();
        }
    }
    
    public void setPlaybackRate(final float playbackRate) {
        this.playbackRate = playbackRate;
    }
    
    public void setSurface(final Surface surface) {
        synchronized (this.surfaceLock) {
            if (this.surface != surface) {
                this.surface = surface;
                final SurfaceChangeListener surfaceChangeListener = this.surfaceChangeListener;
                if (surfaceChangeListener != null) {
                    surfaceChangeListener.onSurfaceChange(surface);
                }
                this.sizeChanged = true;
            }
        }
    }
    
    public void setSurfaceChangeListener(final SurfaceChangeListener surfaceChangeListener) {
        this.surfaceChangeListener = surfaceChangeListener;
    }
    
    public void start() {
        this.startTime = System.nanoTime();
        this.addFrameCallback();
    }
    
    public void stop() {
        this.startTime = 0L;
        this.mediaTime = 0L;
        this.removeFrameCallback();
    }
}
