// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.fragment;

import xd.a;
import java.nio.ByteBuffer;

public class SampleFlags
{
    private byte isLeading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;
    
    public SampleFlags() {
    }
    
    public SampleFlags(final ByteBuffer byteBuffer) {
        final long u0 = a.U0(byteBuffer);
        this.reserved = (byte)((0xFFFFFFFFF0000000L & u0) >> 28);
        this.isLeading = (byte)((0xC000000L & u0) >> 26);
        this.sampleDependsOn = (byte)((0x3000000L & u0) >> 24);
        this.sampleIsDependedOn = (byte)((0xC00000L & u0) >> 22);
        this.sampleHasRedundancy = (byte)((0x300000L & u0) >> 20);
        this.samplePaddingValue = (byte)((0xE0000L & u0) >> 17);
        this.sampleIsDifferenceSample = ((0x10000L & u0) >> 16 > 0L);
        this.sampleDegradationPriority = (int)(u0 & 0xFFFFL);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final SampleFlags sampleFlags = (SampleFlags)o;
            return this.isLeading == sampleFlags.isLeading && this.reserved == sampleFlags.reserved && this.sampleDegradationPriority == sampleFlags.sampleDegradationPriority && this.sampleDependsOn == sampleFlags.sampleDependsOn && this.sampleHasRedundancy == sampleFlags.sampleHasRedundancy && this.sampleIsDependedOn == sampleFlags.sampleIsDependedOn && this.sampleIsDifferenceSample == sampleFlags.sampleIsDifferenceSample && this.samplePaddingValue == sampleFlags.samplePaddingValue;
        }
        return false;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.putInt((int)((long)(this.reserved << 28) | 0x0L | (long)(this.isLeading << 26) | (long)(this.sampleDependsOn << 24) | (long)(this.sampleIsDependedOn << 22) | (long)(this.sampleHasRedundancy << 20) | (long)(this.samplePaddingValue << 17) | (long)((this.sampleIsDifferenceSample ? 1 : 0) << 16) | (long)this.sampleDegradationPriority));
    }
    
    public byte getIsLeading() {
        return this.isLeading;
    }
    
    public int getReserved() {
        return this.reserved;
    }
    
    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }
    
    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }
    
    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }
    
    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }
    
    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }
    
    @Override
    public int hashCode() {
        return ((((((this.reserved * 31 + this.isLeading) * 31 + this.sampleDependsOn) * 31 + this.sampleIsDependedOn) * 31 + this.sampleHasRedundancy) * 31 + this.samplePaddingValue) * 31 + (this.sampleIsDifferenceSample ? 1 : 0)) * 31 + this.sampleDegradationPriority;
    }
    
    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }
    
    public void setIsLeading(final byte isLeading) {
        this.isLeading = isLeading;
    }
    
    public void setReserved(final int n) {
        this.reserved = (byte)n;
    }
    
    public void setSampleDegradationPriority(final int sampleDegradationPriority) {
        this.sampleDegradationPriority = sampleDegradationPriority;
    }
    
    public void setSampleDependsOn(final int n) {
        this.sampleDependsOn = (byte)n;
    }
    
    public void setSampleHasRedundancy(final int n) {
        this.sampleHasRedundancy = (byte)n;
    }
    
    public void setSampleIsDependedOn(final int n) {
        this.sampleIsDependedOn = (byte)n;
    }
    
    public void setSampleIsDifferenceSample(final boolean sampleIsDifferenceSample) {
        this.sampleIsDifferenceSample = sampleIsDifferenceSample;
    }
    
    public void setSamplePaddingValue(final int n) {
        this.samplePaddingValue = (byte)n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SampleFlags{reserved=");
        sb.append(this.reserved);
        sb.append(", isLeading=");
        sb.append(this.isLeading);
        sb.append(", depOn=");
        sb.append(this.sampleDependsOn);
        sb.append(", isDepOn=");
        sb.append(this.sampleIsDependedOn);
        sb.append(", hasRedundancy=");
        sb.append(this.sampleHasRedundancy);
        sb.append(", padValue=");
        sb.append(this.samplePaddingValue);
        sb.append(", isDiffSample=");
        sb.append(this.sampleIsDifferenceSample);
        sb.append(", degradPrio=");
        return d.j(sb, this.sampleDegradationPriority, '}');
    }
}
