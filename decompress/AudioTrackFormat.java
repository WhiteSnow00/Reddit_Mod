// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.audioEditor;

import sg2.e;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "", "index", "", "mimeType", "", "sourceUri", "Landroid/net/Uri;", "channelCount", "samplingRate", "bitrate", "duration", "", "(ILjava/lang/String;Landroid/net/Uri;IIIJ)V", "getBitrate", "()I", "setBitrate", "(I)V", "getChannelCount", "setChannelCount", "getDuration", "()J", "setDuration", "(J)V", "getIndex", "setIndex", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "getSamplingRate", "setSamplingRate", "getSourceUri", "()Landroid/net/Uri;", "setSourceUri", "(Landroid/net/Uri;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AudioTrackFormat
{
    public static final int $stable = 8;
    private int bitrate;
    private int channelCount;
    private long duration;
    private int index;
    private String mimeType;
    private int samplingRate;
    private Uri sourceUri;
    
    public AudioTrackFormat(final int index, final String mimeType, final Uri sourceUri, final int channelCount, final int samplingRate, final int bitrate, final long duration) {
        e.f((Object)mimeType, "mimeType");
        e.f((Object)sourceUri, "sourceUri");
        this.index = index;
        this.mimeType = mimeType;
        this.sourceUri = sourceUri;
        this.channelCount = channelCount;
        this.samplingRate = samplingRate;
        this.bitrate = bitrate;
        this.duration = duration;
    }
    
    public final int component1() {
        return this.index;
    }
    
    public final String component2() {
        return this.mimeType;
    }
    
    public final Uri component3() {
        return this.sourceUri;
    }
    
    public final int component4() {
        return this.channelCount;
    }
    
    public final int component5() {
        return this.samplingRate;
    }
    
    public final int component6() {
        return this.bitrate;
    }
    
    public final long component7() {
        return this.duration;
    }
    
    public final AudioTrackFormat copy(final int n, final String s, final Uri uri, final int n2, final int n3, final int n4, final long n5) {
        e.f((Object)s, "mimeType");
        e.f((Object)uri, "sourceUri");
        return new AudioTrackFormat(n, s, uri, n2, n3, n4, n5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioTrackFormat)) {
            return false;
        }
        final AudioTrackFormat audioTrackFormat = (AudioTrackFormat)o;
        return this.index == audioTrackFormat.index && e.a((Object)this.mimeType, (Object)audioTrackFormat.mimeType) && e.a((Object)this.sourceUri, (Object)audioTrackFormat.sourceUri) && this.channelCount == audioTrackFormat.channelCount && this.samplingRate == audioTrackFormat.samplingRate && this.bitrate == audioTrackFormat.bitrate && this.duration == audioTrackFormat.duration;
    }
    
    public final int getBitrate() {
        return this.bitrate;
    }
    
    public final int getChannelCount() {
        return this.channelCount;
    }
    
    public final long getDuration() {
        return this.duration;
    }
    
    public final int getIndex() {
        return this.index;
    }
    
    public final String getMimeType() {
        return this.mimeType;
    }
    
    public final int getSamplingRate() {
        return this.samplingRate;
    }
    
    public final Uri getSourceUri() {
        return this.sourceUri;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.duration) + a.c(this.bitrate, a.c(this.samplingRate, a.c(this.channelCount, (this.sourceUri.hashCode() + b.c(this.mimeType, Integer.hashCode(this.index) * 31, 31)) * 31, 31), 31), 31);
    }
    
    public final void setBitrate(final int bitrate) {
        this.bitrate = bitrate;
    }
    
    public final void setChannelCount(final int channelCount) {
        this.channelCount = channelCount;
    }
    
    public final void setDuration(final long duration) {
        this.duration = duration;
    }
    
    public final void setIndex(final int index) {
        this.index = index;
    }
    
    public final void setMimeType(final String mimeType) {
        e.f((Object)mimeType, "<set-?>");
        this.mimeType = mimeType;
    }
    
    public final void setSamplingRate(final int samplingRate) {
        this.samplingRate = samplingRate;
    }
    
    public final void setSourceUri(final Uri sourceUri) {
        e.f((Object)sourceUri, "<set-?>");
        this.sourceUri = sourceUri;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("AudioTrackFormat(index=");
        r.append(this.index);
        r.append(", mimeType=");
        r.append(this.mimeType);
        r.append(", sourceUri=");
        r.append(this.sourceUri);
        r.append(", channelCount=");
        r.append(this.channelCount);
        r.append(", samplingRate=");
        r.append(this.samplingRate);
        r.append(", bitrate=");
        r.append(this.bitrate);
        r.append(", duration=");
        return b.i(r, this.duration, ')');
    }
}
