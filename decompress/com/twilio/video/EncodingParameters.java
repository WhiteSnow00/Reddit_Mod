// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class EncodingParameters
{
    public final int maxAudioBitrate;
    public final int maxVideoBitrate;
    
    public EncodingParameters(final int maxAudioBitrate, final int maxVideoBitrate) {
        this.maxAudioBitrate = maxAudioBitrate;
        this.maxVideoBitrate = maxVideoBitrate;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final EncodingParameters encodingParameters = (EncodingParameters)o;
            if (this.maxAudioBitrate != encodingParameters.maxAudioBitrate || this.maxVideoBitrate != encodingParameters.maxVideoBitrate) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.maxAudioBitrate * 31 + this.maxVideoBitrate;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("EncodingParameters{maxAudioBitrate=");
        t.append(this.maxAudioBitrate);
        t.append(", maxVideoBitrate=");
        return d.j(t, this.maxVideoBitrate, '}');
    }
}
