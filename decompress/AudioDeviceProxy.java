// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.nio.ByteBuffer;
import android.content.Context;
import android.os.Handler;

class AudioDeviceProxy extends AudioDeviceContext implements AudioDevice
{
    private static final Logger logger;
    private static long nativeAudioDeviceProxyHandle;
    private AudioDevice audioDevice;
    private boolean capturingStopped;
    public Handler handler;
    private boolean released;
    private boolean renderingStopped;
    
    static {
        logger = Logger.getLogger((Class)AudioDeviceProxy.class);
    }
    
    private AudioDeviceProxy(final Context context, final long nativeAudioDeviceProxyHandle, final AudioDevice audioDevice) {
        this.released = false;
        this.capturingStopped = false;
        this.renderingStopped = false;
        AudioDeviceProxy.nativeAudioDeviceProxyHandle = nativeAudioDeviceProxyHandle;
        this.audioDevice = audioDevice;
    }
    
    private void checkIsOnValidThread() {
        if (this.handler == null) {
            this.handler = Util.createCallbackHandler();
        }
        ThreadChecker.checkIsValidThread(this.handler);
    }
    
    private boolean isValid() {
        return (!this.renderingStopped && !this.released) || (!this.capturingStopped && !this.released);
    }
    
    private static native void nativeExecuteWorkerBlock(final long p0, final Runnable p1);
    
    private static native void nativeFormatChanged(final long p0, final AudioFormat p1, final AudioFormat p2);
    
    private static native void nativeReadData(final long p0, final ByteBuffer p1, final int p2);
    
    private static native void nativeRelease(final long p0);
    
    private static native void nativeWriteData(final long p0, final ByteBuffer p1, final int p2);
    
    public void executeWorkerBlock(final Runnable runnable) {
        if (this.isValid()) {
            nativeExecuteWorkerBlock(AudioDeviceProxy.nativeAudioDeviceProxyHandle, runnable);
        }
        else {
            AudioDeviceProxy.logger.w("Calling executeWorkerBlock not a valid operation");
        }
    }
    
    public void formatChanged() {
        final Logger logger = AudioDeviceProxy.logger;
        logger.d("formatChanged");
        if (this.isValid()) {
            nativeFormatChanged(AudioDeviceProxy.nativeAudioDeviceProxyHandle, ((AudioDeviceCapturer)this.audioDevice).getCapturerFormat(), ((AudioDeviceRenderer)this.audioDevice).getRendererFormat());
        }
        else {
            logger.w("Calling formatChanged not a valid operation");
        }
    }
    
    public AudioFormat getCapturerFormat() {
        return null;
    }
    
    public AudioFormat getRendererFormat() {
        return null;
    }
    
    public boolean onInitCapturer() {
        AudioDeviceProxy.logger.d("onInitCapturer");
        this.checkIsOnValidThread();
        this.capturingStopped = false;
        if (!this.released) {
            ((AudioDeviceCapturer)this.audioDevice).onInitCapturer();
        }
        return true;
    }
    
    public boolean onInitRenderer() {
        AudioDeviceProxy.logger.d("onInitRenderer");
        this.checkIsOnValidThread();
        this.renderingStopped = false;
        if (!this.released) {
            ((AudioDeviceRenderer)this.audioDevice).onInitRenderer();
        }
        return true;
    }
    
    public boolean onStartCapturing(final AudioDeviceContext audioDeviceContext) {
        AudioDeviceProxy.logger.d("onStartCapturing");
        this.checkIsOnValidThread();
        if (!this.released) {
            ((AudioDeviceCapturer)this.audioDevice).onStartCapturing((AudioDeviceContext)this);
        }
        return true;
    }
    
    public boolean onStartRendering(final AudioDeviceContext audioDeviceContext) {
        AudioDeviceProxy.logger.d("onStartRendering");
        this.checkIsOnValidThread();
        if (!this.released) {
            ((AudioDeviceRenderer)this.audioDevice).onStartRendering((AudioDeviceContext)this);
        }
        return true;
    }
    
    public boolean onStopCapturing() {
        AudioDeviceProxy.logger.d("onStopCapturing");
        this.checkIsOnValidThread();
        this.capturingStopped = true;
        if (!this.released) {
            ((AudioDeviceCapturer)this.audioDevice).onStopCapturing();
        }
        return true;
    }
    
    public boolean onStopRendering() {
        AudioDeviceProxy.logger.d("onStopRendering");
        this.checkIsOnValidThread();
        this.renderingStopped = true;
        if (!this.released) {
            ((AudioDeviceRenderer)this.audioDevice).onStopRendering();
        }
        return true;
    }
    
    public void readRenderData(final ByteBuffer byteBuffer) {
        if (!this.renderingStopped && !this.released) {
            nativeReadData(AudioDeviceProxy.nativeAudioDeviceProxyHandle, byteBuffer, byteBuffer.capacity());
        }
        else {
            AudioDeviceProxy.logger.d("Ignoring readRenderData because either AudioDeviceProxy is released or rendering stopped");
        }
    }
    
    public void release() {
        AudioDeviceProxy.logger.d("release");
        if (!this.released) {
            final long nativeAudioDeviceProxyHandle = AudioDeviceProxy.nativeAudioDeviceProxyHandle;
            if (nativeAudioDeviceProxyHandle != 0L) {
                nativeRelease(nativeAudioDeviceProxyHandle);
                AudioDeviceProxy.nativeAudioDeviceProxyHandle = 0L;
            }
            this.released = true;
        }
    }
    
    public void writeCaptureData(final ByteBuffer byteBuffer) {
        if (!this.capturingStopped && !this.released) {
            nativeWriteData(AudioDeviceProxy.nativeAudioDeviceProxyHandle, byteBuffer, byteBuffer.capacity());
        }
        else {
            AudioDeviceProxy.logger.d("Ignoring writeCaptureData because either AudioDeviceProxy is released or capturing stopped");
        }
    }
}
