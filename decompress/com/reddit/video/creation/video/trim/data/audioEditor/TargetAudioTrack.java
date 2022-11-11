// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.audioEditor;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;", "", "sourceTrackIndex", "", "shouldInclude", "", "shouldTranscode", "format", "Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "(IZZLcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;)V", "getFormat", "()Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "setFormat", "(Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;)V", "getShouldInclude", "()Z", "setShouldInclude", "(Z)V", "getShouldTranscode", "setShouldTranscode", "getSourceTrackIndex", "()I", "setSourceTrackIndex", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TargetAudioTrack
{
    public static final int $stable = 8;
    private AudioTrackFormat format;
    private boolean shouldInclude;
    private boolean shouldTranscode;
    private int sourceTrackIndex;
    
    public TargetAudioTrack(final int sourceTrackIndex, final boolean shouldInclude, final boolean shouldTranscode, final AudioTrackFormat format) {
        e.f((Object)format, "format");
        this.sourceTrackIndex = sourceTrackIndex;
        this.shouldInclude = shouldInclude;
        this.shouldTranscode = shouldTranscode;
        this.format = format;
    }
    
    public final int component1() {
        return this.sourceTrackIndex;
    }
    
    public final boolean component2() {
        return this.shouldInclude;
    }
    
    public final boolean component3() {
        return this.shouldTranscode;
    }
    
    public final AudioTrackFormat component4() {
        return this.format;
    }
    
    public final TargetAudioTrack copy(final int n, final boolean b, final boolean b2, final AudioTrackFormat audioTrackFormat) {
        e.f((Object)audioTrackFormat, "format");
        return new TargetAudioTrack(n, b, b2, audioTrackFormat);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetAudioTrack)) {
            return false;
        }
        final TargetAudioTrack targetAudioTrack = (TargetAudioTrack)o;
        return this.sourceTrackIndex == targetAudioTrack.sourceTrackIndex && this.shouldInclude == targetAudioTrack.shouldInclude && this.shouldTranscode == targetAudioTrack.shouldTranscode && e.a((Object)this.format, (Object)targetAudioTrack.format);
    }
    
    public final AudioTrackFormat getFormat() {
        return this.format;
    }
    
    public final boolean getShouldInclude() {
        return this.shouldInclude;
    }
    
    public final boolean getShouldTranscode() {
        return this.shouldTranscode;
    }
    
    public final int getSourceTrackIndex() {
        return this.sourceTrackIndex;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = Integer.hashCode(this.sourceTrackIndex);
        final int shouldInclude = this.shouldInclude ? 1 : 0;
        int n = 1;
        int n2 = shouldInclude;
        if (shouldInclude != 0) {
            n2 = 1;
        }
        final int shouldTranscode = this.shouldTranscode ? 1 : 0;
        if (shouldTranscode == 0) {
            n = shouldTranscode;
        }
        return this.format.hashCode() + ((hashCode * 31 + n2) * 31 + n) * 31;
    }
    
    public final void setFormat(final AudioTrackFormat format) {
        e.f((Object)format, "<set-?>");
        this.format = format;
    }
    
    public final void setShouldInclude(final boolean shouldInclude) {
        this.shouldInclude = shouldInclude;
    }
    
    public final void setShouldTranscode(final boolean shouldTranscode) {
        this.shouldTranscode = shouldTranscode;
    }
    
    public final void setSourceTrackIndex(final int sourceTrackIndex) {
        this.sourceTrackIndex = sourceTrackIndex;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TargetAudioTrack(sourceTrackIndex=");
        r.append(this.sourceTrackIndex);
        r.append(", shouldInclude=");
        r.append(this.shouldInclude);
        r.append(", shouldTranscode=");
        r.append(this.shouldTranscode);
        r.append(", format=");
        r.append(this.format);
        r.append(')');
        return r.toString();
    }
}
