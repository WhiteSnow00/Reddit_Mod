// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.audioEditor;

import al0.g7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import java.io.File;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b1\u00102J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u0007\u0010)R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudio;", "", "Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "sourceTrack", "", "samplingRate", "Lhg2/j;", "setTrack", "Ljava/io/File;", "component1", "Landroid/net/Uri;", "component2", "Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;", "component3", "component4", "", "component5", "targetFile", "contentUri", "track", "backgroundImageUri", "writeToWav", "copy", "", "toString", "hashCode", "other", "equals", "Ljava/io/File;", "getTargetFile", "()Ljava/io/File;", "setTargetFile", "(Ljava/io/File;)V", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "setContentUri", "(Landroid/net/Uri;)V", "Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;", "getTrack", "()Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;", "(Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;)V", "getBackgroundImageUri", "setBackgroundImageUri", "Z", "getWriteToWav", "()Z", "setWriteToWav", "(Z)V", "<init>", "(Ljava/io/File;Landroid/net/Uri;Lcom/reddit/video/creation/video/trim/data/audioEditor/TargetAudioTrack;Landroid/net/Uri;Z)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class TargetAudio
{
    public static final int $stable = 8;
    private Uri backgroundImageUri;
    private Uri contentUri;
    private File targetFile;
    private TargetAudioTrack track;
    private boolean writeToWav;
    
    public TargetAudio(final File targetFile, final Uri contentUri, final TargetAudioTrack track, final Uri backgroundImageUri, final boolean writeToWav) {
        e.f((Object)targetFile, "targetFile");
        this.targetFile = targetFile;
        this.contentUri = contentUri;
        this.track = track;
        this.backgroundImageUri = backgroundImageUri;
        this.writeToWav = writeToWav;
    }
    
    public final File component1() {
        return this.targetFile;
    }
    
    public final Uri component2() {
        return this.contentUri;
    }
    
    public final TargetAudioTrack component3() {
        return this.track;
    }
    
    public final Uri component4() {
        return this.backgroundImageUri;
    }
    
    public final boolean component5() {
        return this.writeToWav;
    }
    
    public final TargetAudio copy(final File file, final Uri uri, final TargetAudioTrack targetAudioTrack, final Uri uri2, final boolean b) {
        e.f((Object)file, "targetFile");
        return new TargetAudio(file, uri, targetAudioTrack, uri2, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetAudio)) {
            return false;
        }
        final TargetAudio targetAudio = (TargetAudio)o;
        return e.a((Object)this.targetFile, (Object)targetAudio.targetFile) && e.a((Object)this.contentUri, (Object)targetAudio.contentUri) && e.a((Object)this.track, (Object)targetAudio.track) && e.a((Object)this.backgroundImageUri, (Object)targetAudio.backgroundImageUri) && this.writeToWav == targetAudio.writeToWav;
    }
    
    public final Uri getBackgroundImageUri() {
        return this.backgroundImageUri;
    }
    
    public final Uri getContentUri() {
        return this.contentUri;
    }
    
    public final File getTargetFile() {
        return this.targetFile;
    }
    
    public final TargetAudioTrack getTrack() {
        return this.track;
    }
    
    public final boolean getWriteToWav() {
        return this.writeToWav;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.targetFile.hashCode();
        final Uri contentUri = this.contentUri;
        int hashCode2 = 0;
        int hashCode3;
        if (contentUri == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = contentUri.hashCode();
        }
        final TargetAudioTrack track = this.track;
        int hashCode4;
        if (track == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = track.hashCode();
        }
        final Uri backgroundImageUri = this.backgroundImageUri;
        if (backgroundImageUri != null) {
            hashCode2 = backgroundImageUri.hashCode();
        }
        int writeToWav;
        if ((writeToWav = (this.writeToWav ? 1 : 0)) != 0) {
            writeToWav = 1;
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2) * 31 + writeToWav;
    }
    
    public final void setBackgroundImageUri(final Uri backgroundImageUri) {
        this.backgroundImageUri = backgroundImageUri;
    }
    
    public final void setContentUri(final Uri contentUri) {
        this.contentUri = contentUri;
    }
    
    public final void setTargetFile(final File targetFile) {
        e.f((Object)targetFile, "<set-?>");
        this.targetFile = targetFile;
    }
    
    public final void setTrack(final AudioTrackFormat audioTrackFormat, final int samplingRate) {
        e.f((Object)audioTrackFormat, "sourceTrack");
        final AudioTrackFormat copy$default = AudioTrackFormat.copy$default(audioTrackFormat, 0, null, null, 0, 0, 0, 0L, 127, null);
        copy$default.setBitrate(64000);
        copy$default.setChannelCount(2);
        copy$default.setSamplingRate(samplingRate);
        this.track = new TargetAudioTrack(audioTrackFormat.getIndex(), true, false, copy$default);
    }
    
    public final void setTrack(final TargetAudioTrack track) {
        this.track = track;
    }
    
    public final void setWriteToWav(final boolean writeToWav) {
        this.writeToWav = writeToWav;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TargetAudio(targetFile=");
        r.append(this.targetFile);
        r.append(", contentUri=");
        r.append(this.contentUri);
        r.append(", track=");
        r.append(this.track);
        r.append(", backgroundImageUri=");
        r.append(this.backgroundImageUri);
        r.append(", writeToWav=");
        return g7.m(r, this.writeToWav, ')');
    }
}
