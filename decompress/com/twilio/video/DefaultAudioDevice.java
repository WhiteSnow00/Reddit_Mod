// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public final class DefaultAudioDevice implements AudioDevice
{
    private boolean useHardwareAcousticEchoCanceler;
    private boolean useHardwareNoiseSuppressor;
    
    public DefaultAudioDevice() {
        this.useHardwareAcousticEchoCanceler = true;
        this.useHardwareNoiseSuppressor = true;
    }
    
    private void setUseHardwareAcousticEchoCanceler(final boolean useHardwareAcousticEchoCanceler) {
        this.useHardwareAcousticEchoCanceler = useHardwareAcousticEchoCanceler;
    }
    
    private void setUseHardwareNoiseSuppressor(final boolean useHardwareNoiseSuppressor) {
        this.useHardwareNoiseSuppressor = useHardwareNoiseSuppressor;
    }
    
    private boolean useHardwareAcousticEchoCanceler() {
        return this.useHardwareAcousticEchoCanceler;
    }
    
    private boolean useHardwareNoiseSuppressor() {
        return this.useHardwareNoiseSuppressor;
    }
    
    public AudioFormat getCapturerFormat() {
        return null;
    }
    
    public AudioFormat getRendererFormat() {
        return null;
    }
    
    public boolean onInitCapturer() {
        return false;
    }
    
    public boolean onInitRenderer() {
        return false;
    }
    
    public boolean onStartCapturing(final AudioDeviceContext audioDeviceContext) {
        return false;
    }
    
    public boolean onStartRendering(final AudioDeviceContext audioDeviceContext) {
        return false;
    }
    
    public boolean onStopCapturing() {
        return false;
    }
    
    public boolean onStopRendering() {
        return false;
    }
}
