// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class AudioOptions
{
    public final boolean audioJitterBufferFastAccelerate;
    public final boolean autoGainControl;
    public final boolean echoCancellation;
    public final boolean highpassFilter;
    public final boolean noiseSuppression;
    public final boolean stereoSwapping;
    public final boolean typingDetection;
    
    private AudioOptions(final Builder builder) {
        this.echoCancellation = Builder.c(builder);
        this.autoGainControl = Builder.b(builder);
        this.noiseSuppression = Builder.e(builder);
        this.highpassFilter = Builder.d(builder);
        this.stereoSwapping = Builder.f(builder);
        this.audioJitterBufferFastAccelerate = Builder.a(builder);
        this.typingDetection = Builder.g(builder);
    }
    
    public AudioOptions(final Builder builder, final int n) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioOptions)) {
            return false;
        }
        final AudioOptions audioOptions = (AudioOptions)o;
        if (this.echoCancellation != audioOptions.echoCancellation) {
            return false;
        }
        if (this.autoGainControl != audioOptions.autoGainControl) {
            return false;
        }
        if (this.noiseSuppression != audioOptions.noiseSuppression) {
            return false;
        }
        if (this.highpassFilter != audioOptions.highpassFilter) {
            return false;
        }
        if (this.stereoSwapping != audioOptions.stereoSwapping) {
            return false;
        }
        if (this.audioJitterBufferFastAccelerate != audioOptions.audioJitterBufferFastAccelerate) {
            return false;
        }
        if (this.typingDetection != audioOptions.typingDetection) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return ((((((this.echoCancellation ? 1 : 0) * 31 + (this.autoGainControl ? 1 : 0)) * 31 + (this.noiseSuppression ? 1 : 0)) * 31 + (this.highpassFilter ? 1 : 0)) * 31 + (this.stereoSwapping ? 1 : 0)) * 31 + (this.audioJitterBufferFastAccelerate ? 1 : 0)) * 31 + (this.typingDetection ? 1 : 0);
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("AudioOptions{echoCancellation=");
        t.append(this.echoCancellation);
        t.append(", autoGainControl=");
        t.append(this.autoGainControl);
        t.append(", noiseSuppression=");
        t.append(this.noiseSuppression);
        t.append(", highpassFilter=");
        t.append(this.highpassFilter);
        t.append(", stereoSwapping=");
        t.append(this.stereoSwapping);
        t.append(", audioJitterBufferFastAccelerate=");
        t.append(this.audioJitterBufferFastAccelerate);
        t.append(", typingDetection=");
        return d.n(t, this.typingDetection, '}');
    }
    
    public static final class Builder
    {
        private boolean audioJitterBufferFastAccelerate;
        private boolean autoGainControl;
        private boolean echoCancellation;
        private boolean highpassFilter;
        private boolean noiseSuppression;
        private boolean stereoSwapping;
        private boolean typingDetection;
        
        public Builder() {
            this.echoCancellation = true;
            this.autoGainControl = true;
            this.noiseSuppression = true;
            this.highpassFilter = true;
            this.stereoSwapping = false;
            this.audioJitterBufferFastAccelerate = false;
            this.typingDetection = true;
        }
        
        public static /* bridge */ boolean a(final Builder builder) {
            return builder.audioJitterBufferFastAccelerate;
        }
        
        public static /* bridge */ boolean b(final Builder builder) {
            return builder.autoGainControl;
        }
        
        public static /* bridge */ boolean c(final Builder builder) {
            return builder.echoCancellation;
        }
        
        public static /* bridge */ boolean d(final Builder builder) {
            return builder.highpassFilter;
        }
        
        public static /* bridge */ boolean e(final Builder builder) {
            return builder.noiseSuppression;
        }
        
        public static /* bridge */ boolean f(final Builder builder) {
            return builder.stereoSwapping;
        }
        
        public static /* bridge */ boolean g(final Builder builder) {
            return builder.typingDetection;
        }
        
        public Builder audioJitterBufferFastAccelerate(final boolean audioJitterBufferFastAccelerate) {
            this.audioJitterBufferFastAccelerate = audioJitterBufferFastAccelerate;
            return this;
        }
        
        public Builder autoGainControl(final boolean autoGainControl) {
            this.autoGainControl = autoGainControl;
            return this;
        }
        
        public AudioOptions build() {
            return new AudioOptions(this, 0);
        }
        
        public Builder echoCancellation(final boolean echoCancellation) {
            this.echoCancellation = echoCancellation;
            return this;
        }
        
        public Builder highpassFilter(final boolean highpassFilter) {
            this.highpassFilter = highpassFilter;
            return this;
        }
        
        public Builder noiseSuppression(final boolean noiseSuppression) {
            this.noiseSuppression = noiseSuppression;
            return this;
        }
        
        public Builder stereoSwapping(final boolean stereoSwapping) {
            this.stereoSwapping = stereoSwapping;
            return this;
        }
        
        public Builder typingDetection(final boolean typingDetection) {
            this.typingDetection = typingDetection;
            return this;
        }
    }
}
