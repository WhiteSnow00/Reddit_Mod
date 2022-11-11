// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import tvi.webrtc.VideoSink;
import android.content.Context;
import tvi.webrtc.VideoSource;
import tvi.webrtc.VideoCapturer;
import tvi.webrtc.SurfaceTextureHelper;

public class LocalVideoTrack extends VideoTrack
{
    public static final VideoFormat DEFAULT_VIDEO_FORMAT;
    private static final Logger logger;
    private final MediaFactory mediaFactory;
    private long nativeLocalVideoTrackHandle;
    private final String nativeTrackHash;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final VideoCapturer videoCapturer;
    private final VideoFormat videoFormat;
    private final VideoSource videoSource;
    
    static {
        logger = Logger.getLogger((Class)LocalVideoTrack.class);
        DEFAULT_VIDEO_FORMAT = new VideoFormat(VideoDimensions.VGA_VIDEO_DIMENSIONS, 30);
    }
    
    public LocalVideoTrack(final long nativeLocalVideoTrackHandle, final boolean b, final VideoCapturer videoCapturer, final VideoFormat videoFormat, final tvi.webrtc.VideoTrack videoTrack, final String nativeTrackHash, final String s, final Context context, final SurfaceTextureHelper surfaceTextureHelper, final VideoSource videoSource) {
        super(videoTrack, b, s);
        this.nativeTrackHash = nativeTrackHash;
        this.nativeLocalVideoTrackHandle = nativeLocalVideoTrackHandle;
        this.videoCapturer = videoCapturer;
        this.videoFormat = videoFormat;
        this.mediaFactory = MediaFactory.instance((Object)this, context);
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.videoSource = videoSource;
    }
    
    public static LocalVideoTrack create(final Context context, final boolean b, final VideoCapturer videoCapturer) {
        return create(context, b, videoCapturer, null, null);
    }
    
    public static LocalVideoTrack create(final Context context, final boolean b, final VideoCapturer videoCapturer, final VideoFormat videoFormat) {
        return create(context, b, videoCapturer, videoFormat, null);
    }
    
    public static LocalVideoTrack create(final Context context, final boolean b, final VideoCapturer videoCapturer, final VideoFormat videoFormat, final String s) {
        return create(context, b, videoCapturer, videoFormat, s, null);
    }
    
    public static LocalVideoTrack create(final Context context, final boolean b, final VideoCapturer videoCapturer, final VideoFormat videoFormat, final String s, final MediaFactory mediaFactory) {
        Preconditions.checkNotNull((Object)context, (Object)"Context must not be null");
        Preconditions.checkNotNull((Object)videoCapturer, (Object)"VideoCapturer must not be null");
        Object o;
        MediaFactory instance;
        if (mediaFactory == null) {
            o = new Object();
            instance = MediaFactory.instance(o, context);
        }
        else {
            o = null;
            instance = mediaFactory;
        }
        VideoFormat videoFormat2 = videoFormat;
        if (videoFormat == null) {
            if (videoCapturer instanceof com.twilio.video.VideoCapturer) {
                videoFormat2 = ((com.twilio.video.VideoCapturer)videoCapturer).getCaptureFormat();
            }
            else {
                videoFormat2 = LocalVideoTrack.DEFAULT_VIDEO_FORMAT;
            }
        }
        final LocalVideoTrack videoTrack = instance.createVideoTrack(context, b, videoCapturer, videoFormat2, s);
        if (videoTrack == null) {
            LocalVideoTrack.logger.e("Failed to create local video track");
        }
        else {
            videoTrack.videoCapturer.initialize(videoTrack.surfaceTextureHelper, context, videoTrack.videoSource.getCapturerObserver());
            final VideoCapturer videoCapturer2 = videoTrack.videoCapturer;
            final VideoDimensions dimensions = videoFormat2.dimensions;
            videoCapturer2.startCapture(dimensions.width, dimensions.height, videoFormat2.framerate);
        }
        if (o != null) {
            instance.release(o);
        }
        return videoTrack;
    }
    
    public static LocalVideoTrack create(final Context context, final boolean b, final VideoCapturer videoCapturer, final String s) {
        return create(context, b, videoCapturer, null, s);
    }
    
    private native long nativeAddSinkWithWants(final long p0, final boolean p1);
    
    private native void nativeEnable(final long p0, final boolean p1);
    
    private native boolean nativeIsEnabled(final long p0);
    
    private native void nativeRelease(final long p0);
    
    private native void nativeRemoveSinkWithWants(final long p0, final long p1);
    
    public void addSink(final VideoSink videoSink) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot add sink to video track that has been released");
            super.addSink(videoSink);
        }
    }
    
    public long addSinkWithWants(final VideoSink videoSink, final boolean b) {
        final long nativeAddSinkWithWants = this.nativeAddSinkWithWants(this.nativeLocalVideoTrackHandle, b);
        super.addSink(videoSink);
        return nativeAddSinkWithWants;
    }
    
    public void enable(final boolean b) {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeEnable(this.nativeLocalVideoTrackHandle, b);
            }
            else {
                LocalVideoTrack.logger.e("Cannot enable a local video track that has been removed");
            }
        }
    }
    
    public String getName() {
        return super.getName();
    }
    
    public long getNativeHandle() {
        synchronized (this) {
            return this.nativeLocalVideoTrackHandle;
        }
    }
    
    public String getNativeTrackHash() {
        return this.nativeTrackHash;
    }
    
    public VideoCapturer getVideoCapturer() {
        return this.videoCapturer;
    }
    
    public VideoFormat getVideoFormat() {
        return this.videoFormat;
    }
    
    public VideoSource getVideoSource() {
        return this.videoSource;
    }
    
    public boolean isEnabled() {
        synchronized (this) {
            if (!this.isReleased()) {
                return this.nativeIsEnabled(this.nativeLocalVideoTrackHandle);
            }
            LocalVideoTrack.logger.e("Local video track is not enabled because it has been released");
            return false;
        }
    }
    
    public boolean isReleased() {
        return this.nativeLocalVideoTrackHandle == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                super.release();
                try {
                    this.videoCapturer.stopCapture();
                }
                catch (final InterruptedException ex) {
                    LocalVideoTrack.logger.e(ex.getMessage(), (Throwable)ex);
                }
                this.videoCapturer.dispose();
                this.videoSource.dispose();
                this.surfaceTextureHelper.dispose();
                this.nativeRelease(this.nativeLocalVideoTrackHandle);
                this.nativeLocalVideoTrackHandle = 0L;
                this.mediaFactory.release((Object)this);
            }
        }
    }
    
    public void removeSink(final VideoSink videoSink) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot remove sink from video track that has been released");
            super.removeSink(videoSink);
        }
    }
    
    public void removeSinkWithWants(final long n) {
        this.nativeRemoveSinkWithWants(this.nativeLocalVideoTrackHandle, n);
    }
}
