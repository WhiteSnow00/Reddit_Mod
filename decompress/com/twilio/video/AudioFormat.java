// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.Arrays;

public class AudioFormat
{
    public static int AUDIO_SAMPLE_MONO = 1;
    public static final int AUDIO_SAMPLE_RATE_16000 = 16000;
    public static final int AUDIO_SAMPLE_RATE_24000 = 24000;
    public static final int AUDIO_SAMPLE_RATE_32000 = 32000;
    public static final int AUDIO_SAMPLE_RATE_44100 = 44100;
    public static final int AUDIO_SAMPLE_RATE_48000 = 48000;
    public static final int AUDIO_SAMPLE_RATE_8000 = 8000;
    public static final int AUDIO_SAMPLE_STEREO = 2;
    public static final Integer[] validChannelCounts;
    public static final Integer[] validSampleRates;
    private final int channelCount;
    private final int sampleRate;
    
    static {
        validSampleRates = new Integer[] { 8000, 16000, 24000, 32000, 44100, 48000 };
        validChannelCounts = new Integer[] { AudioFormat.AUDIO_SAMPLE_MONO, 2 };
    }
    
    public AudioFormat(final int sampleRate, final int channelCount) {
        Preconditions.checkArgument(Arrays.asList(AudioFormat.validSampleRates).contains(sampleRate), (Object)String.format("Unsupported sample rate %s", sampleRate));
        Preconditions.checkArgument(Arrays.asList(AudioFormat.validChannelCounts).contains(channelCount), (Object)String.format("Unsupported channel count %s", channelCount));
        this.sampleRate = sampleRate;
        this.channelCount = channelCount;
    }
    
    public int getChannelCount() {
        return this.channelCount;
    }
    
    public int getSampleRate() {
        return this.sampleRate;
    }
}
