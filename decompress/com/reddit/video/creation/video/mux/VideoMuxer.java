// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.mux;

import com.coremedia.iso.boxes.Container;
import android.net.Uri;
import java.nio.channels.FileChannel;
import com.googlecode.mp4parser.BasicContainer;
import su2.a$b;
import java.nio.channels.WritableByteChannel;
import java.io.FileOutputStream;
import com.coremedia.iso.boxes.FileTypeBox;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import sj.c;
import java.util.Arrays;
import qj.a;
import com.googlecode.mp4parser.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.io.File;
import com.reddit.video.creation.video.videocreator.VideoCreationPhase;
import com.reddit.video.creation.video.videocreator.Progress;
import com.reddit.video.creation.video.videocreator.VideoCreationPhase$Muxing;
import sg2.e;
import java.io.IOException;
import com.reddit.video.creation.video.videocreator.ProgressListener;
import java.util.List;
import pj.g;
import sj.f;
import java.util.concurrent.TimeUnit;
import pj.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/video/mux/VideoMuxer;", "", "Lpj/d;", "movieToAppendTracksTo", "Lcom/reddit/video/creation/video/mux/VideoMuxer$MuxingConfigs;", "configs", "", "totalVideoDuration", "Lhg2/j;", "appendAudioTracksToMovie", "Lcom/reddit/video/creation/video/videocreator/ProgressListener;", "progressListener", "muxVideos", "", "shouldMuxSound", "Z", "shouldCropSound", "<init>", "(ZZ)V", "Companion", "MuxingConfigs", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoMuxer
{
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final long MOVIE_BOX_MINOR_VERSION = 512L;
    private static final double SAMPLE_BUFFER = 0.5;
    private final boolean shouldCropSound;
    private final boolean shouldMuxSound;
    
    static {
        Companion = new Companion(null);
    }
    
    public VideoMuxer(final boolean shouldMuxSound, final boolean shouldCropSound) {
        this.shouldMuxSound = shouldMuxSound;
        this.shouldCropSound = shouldCropSound;
    }
    
    private final void appendAudioTracksToMovie(final d d, final MuxingConfigs muxingConfigs, final long n) {
        final g aacTrack = muxingConfigs.getAacTrack();
        if (aacTrack != null && this.shouldMuxSound) {
            final long millis = TimeUnit.SECONDS.toMillis((long)muxingConfigs.getRecordingDurationS());
            final List o1 = aacTrack.O1();
            if (n < millis) {
                d.a((g)new f(aacTrack, 0L, (long)(o1.size() * n / (millis * 1.0f) + 0.5)));
            }
            else if (this.shouldCropSound) {
                d.a((g)new f(aacTrack, 0L, (long)o1.size()));
            }
            else {
                d.a(aacTrack);
            }
        }
    }
    
    public final void muxVideos(final MuxingConfigs muxingConfigs, final ProgressListener progressListener) throws IOException, NullPointerException {
        e.f((Object)muxingConfigs, "configs");
        if (progressListener != null) {
            progressListener.onProgressChanged(new Progress((VideoCreationPhase)new VideoCreationPhase$Muxing(), 0.0f, 0, 6, (DefaultConstructorMarker)null));
        }
        final File file = new File(muxingConfigs.getOutputUri().getPath());
        if (file.exists()) {
            file.delete();
        }
        final d d = new d();
        if (muxingConfigs.getH264StreamFiles().size() <= 1 && muxingConfigs.getInputVideoPartsDurations().size() <= 1) {
            final List b = a.a((com.googlecode.mp4parser.a)new b((File)CollectionsKt___CollectionsKt.A3((List)muxingConfigs.getH264StreamFiles()))).b;
            e.e((Object)b, "build(FileDataSourceImpl\u2026t()))\n            .tracks");
            final Object[] array = b.toArray(new g[0]);
            e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final g[] array2 = (g[])array;
            final c c = new c((g[])Arrays.copyOf(array2, array2.length));
            final long n = muxingConfigs.getInputVideoPartsDurations().get(0).intValue();
            d.a((g)c);
            final a$b a = su2.a.a;
            a.a("Added video tracks.", new Object[0]);
            this.appendAudioTracksToMovie(d, muxingConfigs, n);
            a.a("Added (and cropped) audio track.", new Object[0]);
            final BasicContainer a2 = new DefaultMp4Builder().a(d);
            a.a("MP4 container built.", new Object[0]);
            ((FileTypeBox)((Container)a2).getBoxes((Class)FileTypeBox.class).get(0)).setMinorVersion(512L);
            final FileChannel channel = new FileOutputStream(file).getChannel();
            ((Container)a2).writeContainer((WritableByteChannel)channel);
            a.a("Completed building mp4 file", new Object[0]);
            channel.close();
            return;
        }
        su2.a.a.e((Throwable)new IllegalArgumentException("At this point only one file is expected"));
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/creation/video/mux/VideoMuxer$Companion;", "", "()V", "MOVIE_BOX_MINOR_VERSION", "", "SAMPLE_BUFFER", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u00c6\u0003J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R!\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)¨\u0006," }, d2 = { "Lcom/reddit/video/creation/video/mux/VideoMuxer$MuxingConfigs;", "", "Landroid/net/Uri;", "component1", "", "Ljava/io/File;", "component2", "", "", "component3", "", "component4", "Lpj/g;", "component5", "", "component6", "outputUri", "h264StreamFiles", "inputVideoParts", "recordingDurationS", "aacTrack", "inputVideoPartsDurations", "copy", "toString", "hashCode", "other", "", "equals", "Landroid/net/Uri;", "getOutputUri", "()Landroid/net/Uri;", "Ljava/util/List;", "getH264StreamFiles", "()Ljava/util/List;", "getInputVideoParts", "D", "getRecordingDurationS", "()D", "getInputVideoPartsDurations", "Lpj/g;", "getAacTrack", "()Lpj/g;", "<init>", "(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;DLpj/g;Ljava/util/List;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class MuxingConfigs
    {
        public static final int $stable = 8;
        private final g aacTrack;
        private final List<File> h264StreamFiles;
        private final List<String> inputVideoParts;
        private final List<Integer> inputVideoPartsDurations;
        private final Uri outputUri;
        private final double recordingDurationS;
        
        public MuxingConfigs(final Uri outputUri, final List<File> h264StreamFiles, final List<String> inputVideoParts, final double recordingDurationS, final g aacTrack, final List<Integer> inputVideoPartsDurations) {
            e.f((Object)outputUri, "outputUri");
            e.f((Object)h264StreamFiles, "h264StreamFiles");
            e.f((Object)inputVideoPartsDurations, "inputVideoPartsDurations");
            this.outputUri = outputUri;
            this.h264StreamFiles = h264StreamFiles;
            this.inputVideoParts = inputVideoParts;
            this.recordingDurationS = recordingDurationS;
            this.aacTrack = aacTrack;
            this.inputVideoPartsDurations = inputVideoPartsDurations;
        }
        
        public final Uri component1() {
            return this.outputUri;
        }
        
        public final List<File> component2() {
            return this.h264StreamFiles;
        }
        
        public final List<String> component3() {
            return this.inputVideoParts;
        }
        
        public final double component4() {
            return this.recordingDurationS;
        }
        
        public final g component5() {
            return this.aacTrack;
        }
        
        public final List<Integer> component6() {
            return this.inputVideoPartsDurations;
        }
        
        public final MuxingConfigs copy(final Uri uri, final List<File> list, final List<String> list2, final double n, final g g, final List<Integer> list3) {
            e.f((Object)uri, "outputUri");
            e.f((Object)list, "h264StreamFiles");
            e.f((Object)list3, "inputVideoPartsDurations");
            return new MuxingConfigs(uri, list, list2, n, g, list3);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MuxingConfigs)) {
                return false;
            }
            final MuxingConfigs muxingConfigs = (MuxingConfigs)o;
            return e.a((Object)this.outputUri, (Object)muxingConfigs.outputUri) && e.a((Object)this.h264StreamFiles, (Object)muxingConfigs.h264StreamFiles) && e.a((Object)this.inputVideoParts, (Object)muxingConfigs.inputVideoParts) && e.a((Object)this.recordingDurationS, (Object)muxingConfigs.recordingDurationS) && e.a((Object)this.aacTrack, (Object)muxingConfigs.aacTrack) && e.a((Object)this.inputVideoPartsDurations, (Object)muxingConfigs.inputVideoPartsDurations);
        }
        
        public final g getAacTrack() {
            return this.aacTrack;
        }
        
        public final List<File> getH264StreamFiles() {
            return this.h264StreamFiles;
        }
        
        public final List<String> getInputVideoParts() {
            return this.inputVideoParts;
        }
        
        public final List<Integer> getInputVideoPartsDurations() {
            return this.inputVideoPartsDurations;
        }
        
        public final Uri getOutputUri() {
            return this.outputUri;
        }
        
        public final double getRecordingDurationS() {
            return this.recordingDurationS;
        }
        
        @Override
        public int hashCode() {
            final int c = aw.b.c((List)this.h264StreamFiles, this.outputUri.hashCode() * 31, 31);
            final List<String> inputVideoParts = this.inputVideoParts;
            final int n = 0;
            int hashCode;
            if (inputVideoParts == null) {
                hashCode = 0;
            }
            else {
                hashCode = inputVideoParts.hashCode();
            }
            final int c2 = al0.b.c(this.recordingDurationS, (c + hashCode) * 31, 31);
            final g aacTrack = this.aacTrack;
            int hashCode2;
            if (aacTrack == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = aacTrack.hashCode();
            }
            return this.inputVideoPartsDurations.hashCode() + (c2 + hashCode2) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("MuxingConfigs(outputUri=");
            r.append(this.outputUri);
            r.append(", h264StreamFiles=");
            r.append(this.h264StreamFiles);
            r.append(", inputVideoParts=");
            r.append(this.inputVideoParts);
            r.append(", recordingDurationS=");
            r.append(this.recordingDurationS);
            r.append(", aacTrack=");
            r.append(this.aacTrack);
            r.append(", inputVideoPartsDurations=");
            return d.o(r, (List)this.inputVideoPartsDurations, ')');
        }
    }
}
