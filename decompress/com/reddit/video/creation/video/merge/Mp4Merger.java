// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.merge;

import ff2.f0;
import ra.t;
import zeroonezero.android.audio_mixer.AudioMixer$a;
import zeroonezero.android.audio_mixer.AudioMixer$MixingType;
import java.util.concurrent.Callable;
import android.util.Log;
import com.reddit.video.creation.video.trim.data.audioEditor.AudioTrackFormat;
import ym0.h0;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import com.reddit.video.creation.models.voiceover.VoiceoverItem;
import com.reddit.video.creation.widgets.utils.VideoUtils;
import java.util.UUID;
import java.nio.channels.FileChannel;
import com.googlecode.mp4parser.BasicContainer;
import java.nio.channels.WritableByteChannel;
import java.io.RandomAccessFile;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import ff2.c0;
import lw0.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import ig2.m;
import java.util.Collections;
import java.util.LinkedList;
import qj.a;
import java.util.ArrayList;
import sj.f;
import sj.c;
import java.util.Arrays;
import pj.g;
import pj.d;
import java.util.List;
import java.io.File;
import com.reddit.video.creation.models.voiceover.VoiceoverData;
import zeroonezero.android.audio_mixer.AudioMixer;
import ff2.d0;
import javax.inject.Inject;
import java.util.concurrent.TimeUnit;
import sg2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.content.Context;
import com.reddit.video.creation.video.trim.audioResampler.AudioEditor;
import kotlin.Metadata;
import javax.inject.Singleton;

@Singleton
@Metadata(bv = {}, d1 = { "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002=>B\u001b\b\u0007\u0012\b\b\u0001\u00102\u001a\u000201\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0016\u0010\u001d\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bH\u0002J\f\u0010\u001f\u001a\u00020\u001e*\u00020\u0015H\u0002J\f\u0010 \u001a\u00020\u001e*\u00020\u0015H\u0002J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"JJ\u0010-\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u001a\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002J&\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020$2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002JG\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020$2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?" }, d2 = { "Lcom/reddit/video/creation/video/merge/Mp4Merger;", "", "Ljava/io/File;", "getOutputFile", "", "", "mp4FilePaths", "audioFilePaths", "Lcom/reddit/video/creation/video/merge/Mp4Merger$MediaTracks;", "getMediaTracks", "mediaTracks", "audioFiles", "", "audioStartTimeOffsetMillis", "audioEndTimeOffsetMillis", "Lpj/d;", "buildFinalMovie", "(Lcom/reddit/video/creation/video/merge/Mp4Merger$MediaTracks;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lpj/d;", "totalVideoDuration", "", "recordingDurationMs", "Lpj/g;", "soundTrack", "Lsj/f;", "buildSoundTrack", "(JDLpj/g;Ljava/lang/Long;Ljava/lang/Long;)Lsj/f;", "getSoundCroppedToStartAndEnd", "", "videoTracks", "getRecordingDuration", "", "isSound", "isVideo", "inputVideoFilePath", "Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "voiceoverData", "Lff2/c0;", "mergeWithVoiceover", "Lzeroonezero/android/audio_mixer/AudioMixer;", "audioMixer", "Lkotlin/Pair;", "tracks", "", "samplingRate", "voiceoverFile", "mergeAudio", "audioFile", "merge", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lff2/c0;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;", "audioEditor", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;", "oneSecondMs", "J", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;)V", "Companion", "MediaTracks", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class Mp4Merger
{
    public static final int $stable;
    public static final Companion Companion;
    private static final String SOUND_HANDLER = "soun";
    private static final double SOUND_OFFSET = 0.5;
    private static final String TAG = "Mp4Merger";
    private static final String VIDEO_HANDLER = "vide";
    private final AudioEditor audioEditor;
    private final Context context;
    private final long oneSecondMs;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    @Inject
    public Mp4Merger(@Named("APP_CONTEXT") final Context context, final AudioEditor audioEditor) {
        e.f((Object)context, "context");
        e.f((Object)audioEditor, "audioEditor");
        this.context = context;
        this.audioEditor = audioEditor;
        this.oneSecondMs = TimeUnit.SECONDS.toMillis(1L);
    }
    
    private final d buildFinalMovie(final MediaTracks mediaTracks, final List<String> list, final Long n, final Long n2) {
        final d d = new d();
        final List<g> videoTracks = mediaTracks.getVideoTracks();
        if (videoTracks.isEmpty() ^ true) {
            final Object[] array = videoTracks.toArray((Object[])new g[0]);
            e.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final g[] array2 = (g[])array;
            d.a((g)new c((g[])Arrays.copyOf(array2, array2.length)));
        }
        final List<g> soundTracks = mediaTracks.getSoundTracks();
        if (soundTracks.isEmpty() ^ true) {
            if (list == null) {
                final Object[] array3 = soundTracks.toArray((Object[])new g[0]);
                e.d((Object)array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                final g[] array4 = (g[])array3;
                d.a((g)new c((g[])Arrays.copyOf(array4, array4.length)));
            }
            else {
                final Object[] array5 = soundTracks.toArray((Object[])new g[0]);
                e.d((Object)array5, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                final g[] array6 = (g[])array5;
                final c c = new c((g[])Arrays.copyOf(array6, array6.length));
                d.a((g)this.buildSoundTrack(this.getRecordingDuration(videoTracks), this.oneSecondMs * (((pj.a)c).getDuration() / (c.x1().g * 1.0)), (g)c, n, n2));
            }
        }
        return d;
    }
    
    private final f buildSoundTrack(final long n, final double n2, final g g, final Long n3, final Long n4) {
        f soundCroppedToStartAndEnd;
        if (n4 != null && n3 != null) {
            soundCroppedToStartAndEnd = this.getSoundCroppedToStartAndEnd(g, n3, n4);
        }
        else if (n < n2) {
            soundCroppedToStartAndEnd = new f(g, 0L, (long)(g.O1().size() * n / (1.0f * n2) + 0.5));
        }
        else {
            soundCroppedToStartAndEnd = new f(g, 0L, (long)g.O1().size());
        }
        return soundCroppedToStartAndEnd;
    }
    
    private final MediaTracks getMediaTracks(List<String> iterable, final List<String> list) {
        final ArrayList list2 = new ArrayList();
        final Iterator<d> iterator = iterable.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final String next = iterator.next();
            if (next.length() <= 0) {
                b = false;
            }
            if (!b) {
                continue;
            }
            list2.add(next);
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add(a.b((String)iterator2.next()));
        }
        final List<g> synchronizedList = Collections.synchronizedList(new LinkedList<g>());
        final List<g> synchronizedList2 = Collections.synchronizedList(new LinkedList<g>());
        if (true ^ list.isEmpty()) {
            iterable = null;
            try {
                final ArrayList<d> list4 = new ArrayList<d>(m.c3((Iterable)list, 10));
                final Iterator iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    list4.add(a.b((String)iterator3.next()));
                }
                iterable = list4;
            }
            catch (final IOException ex) {
                su2.a.a.e((Throwable)ex);
            }
            final ArrayList list5 = new ArrayList(m.c3((Iterable)list3, 10));
            final Iterator iterator4 = list3.iterator();
            while (iterator4.hasNext()) {
                list5.add((Object)((d)iterator4.next()).b);
            }
            for (final List list6 : list5) {
                final ArrayList m = android.support.v4.media.a.m((List)list6, "tracks");
                for (final Object next2 : list6) {
                    final g g = (g)next2;
                    e.e((Object)g, "it");
                    if (this.isVideo(g)) {
                        m.add(next2);
                    }
                }
                synchronizedList.addAll(m);
            }
            if (iterable != null) {
                final ArrayList list7 = new ArrayList(m.c3((Iterable)iterable, 10));
                final Iterator<d> iterator7 = iterable.iterator();
                while (iterator7.hasNext()) {
                    list7.add((Object)iterator7.next().b);
                }
                for (final List list8 : list7) {
                    final ArrayList i = android.support.v4.media.a.m((List)list8, "it");
                    for (final Object next3 : list8) {
                        final g g2 = (g)next3;
                        e.e((Object)g2, "track");
                        if (this.isSound(g2)) {
                            i.add(next3);
                        }
                    }
                    synchronizedList2.addAll(i);
                }
            }
        }
        else {
            final ArrayList list9 = new ArrayList(m.c3((Iterable)list3, 10));
            final Iterator iterator10 = list3.iterator();
            while (iterator10.hasNext()) {
                list9.add((Object)((d)iterator10.next()).b);
            }
            for (final List list10 : list9) {
                final ArrayList j = android.support.v4.media.a.m((List)list10, "tracks");
                for (final Object next4 : list10) {
                    final g g3 = (g)next4;
                    e.e((Object)g3, "it");
                    if (this.isSound(g3)) {
                        j.add(next4);
                    }
                }
                synchronizedList2.addAll(j);
                final ArrayList list11 = new ArrayList();
                for (final Object next5 : list10) {
                    final g g4 = (g)next5;
                    e.e((Object)g4, "it");
                    if (this.isVideo(g4)) {
                        list11.add(next5);
                    }
                }
                synchronizedList.addAll(list11);
            }
        }
        e.e((Object)synchronizedList2, "soundTracks");
        e.e((Object)synchronizedList, "videoTracks");
        return new MediaTracks(synchronizedList2, synchronizedList);
    }
    
    private final File getOutputFile() {
        final File mergedSegmentsCacheDirectory = VideoCacheHelper.getMergedSegmentsCacheDirectory(this.context);
        final StringBuilder r = a.r("merged_segments_");
        r.append(System.currentTimeMillis());
        r.append(".mp4");
        return new File(mergedSegmentsCacheDirectory, r.toString());
    }
    
    private final long getRecordingDuration(final List<g> list) {
        final ArrayList list2 = new ArrayList<Long>(m.c3((Iterable)list, 10));
        for (final g g : list) {
            list2.add(g.getDuration() * this.oneSecondMs / g.x1().g);
        }
        return CollectionsKt___CollectionsKt.i4((List)list2);
    }
    
    private final f getSoundCroppedToStartAndEnd(final g g, final long n, final long n2) {
        int i = 0;
        double n3 = 0.0;
        int n5;
        int n4 = n5 = 0;
        while (i == 0) {
            n3 += g.c2()[n4] / (g.x1().g * 1.0) * this.oneSecondMs;
            int n6;
            if ((n6 = n5) == 0) {
                n6 = n5;
                if (n3 >= n) {
                    n6 = n4;
                }
            }
            int n7;
            if ((n7 = i) == 0) {
                n7 = i;
                if (n3 >= n2) {
                    n7 = n4;
                }
            }
            ++n4;
            i = n7;
            n5 = n6;
        }
        int l0;
        if ((l0 = i) == 0) {
            final List o1 = g.O1();
            e.e((Object)o1, "soundTrack.samples");
            l0 = b.L0(o1);
        }
        return new f(g, (long)n5, (long)l0);
    }
    
    private final boolean isSound(final g g) {
        return e.a((Object)g.getHandler(), (Object)"soun");
    }
    
    private final boolean isVideo(final g g) {
        return e.a((Object)g.getHandler(), (Object)"vide");
    }
    
    public static /* synthetic */ c0 merge$default(final Mp4Merger mp4Merger, final List list, final List list2, Long n, Long n2, final int n3, final Object o) {
        if ((n3 & 0x4) != 0x0) {
            n = null;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = null;
        }
        return mp4Merger.merge(list, list2, n, n2);
    }
    
    private static final File merge$lambda-8(final List list, final List list2, final Mp4Merger mp4Merger, final Long n, final Long n2) {
        e.f((Object)list, "$mp4FilePaths");
        e.f((Object)list2, "$audioFilePaths");
        e.f((Object)mp4Merger, "this$0");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Passed list of mp4FilePaths shouldn't be empty");
        }
        if (list2.isEmpty() && list.size() == 1) {
            return new File((String)CollectionsKt___CollectionsKt.A3(list));
        }
        final BasicContainer a = new DefaultMp4Builder().a(mp4Merger.buildFinalMovie(mp4Merger.getMediaTracks(list, list2), list2, n, n2));
        final File outputFile = mp4Merger.getOutputFile();
        final FileChannel channel = new RandomAccessFile(outputFile, "rw").getChannel();
        a.writeContainer((WritableByteChannel)channel);
        channel.close();
        return outputFile;
    }
    
    private static final void mergeWithVoiceover$lambda-4(final Mp4Merger mp4Merger, final String s, final VoiceoverData voiceoverData, final d0 d0) {
        e.f((Object)mp4Merger, "this$0");
        e.f((Object)s, "$inputVideoFilePath");
        e.f((Object)voiceoverData, "$voiceoverData");
        e.f((Object)d0, "emitter");
        final StringBuilder sb = new StringBuilder();
        sb.append("merged_audio_file_");
        sb.append(UUID.randomUUID());
        final String path = File.createTempFile(sb.toString(), ".mp3", VideoCacheHelper.getVideoCacheDirectory(mp4Merger.context)).getPath();
        final File file = new File(path);
        final AudioMixer audioMixer = new AudioMixer(path);
        audioMixer.d.add(new uu2.b(TimeUnit.MICROSECONDS.convert(VideoUtils.realFileDuration(new File(s), mp4Merger.context), TimeUnit.MILLISECONDS)));
        final ArrayList list = new ArrayList();
        if (voiceoverData.getKeepSourceAudio()) {
            list.add(s);
        }
        final List items = voiceoverData.getItems();
        final ArrayList list2 = new ArrayList<String>(m.c3((Iterable)items, 10));
        final Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            list2.add(((VoiceoverItem)iterator.next()).getFilePath());
        }
        list.addAll(list2);
        final List<AudioTrackFormat> audioTracks$creation_release = mp4Merger.audioEditor.getAudioTracks$creation_release(list);
        final int calculateSamplingRate$creation_release = mp4Merger.audioEditor.calculateSamplingRate$creation_release(audioTracks$creation_release);
        final List<AudioTrackFormat> tracksToTranscode$creation_release = mp4Merger.audioEditor.getTracksToTranscode$creation_release(audioTracks$creation_release, calculateSamplingRate$creation_release);
        if (tracksToTranscode$creation_release.isEmpty()) {
            if (!d0.isDisposed()) {
                d0.onSuccess((Object)mp4Merger.mergeAudio(audioMixer, (List<Pair<String, String>>)EmptyList.INSTANCE, s, voiceoverData, calculateSamplingRate$creation_release, file));
            }
        }
        else {
            mp4Merger.audioEditor.resampleTracks$creation_release(tracksToTranscode$creation_release, calculateSamplingRate$creation_release).F((kf2.g<? super List<Pair<String, String>>>)new h0(d0, mp4Merger, audioMixer, s, voiceoverData, calculateSamplingRate$creation_release, file), (kf2.g<? super Throwable>)new com.reddit.video.creation.video.merge.a(d0, mp4Merger, audioMixer, s, voiceoverData, calculateSamplingRate$creation_release, file));
        }
    }
    
    private static final void mergeWithVoiceover$lambda-4$lambda-3$lambda-1(final d0 d0, final Mp4Merger mp4Merger, final AudioMixer audioMixer, final String s, final VoiceoverData voiceoverData, final int n, final File file, final List list) {
        e.f((Object)d0, "$emitter");
        e.f((Object)mp4Merger, "this$0");
        e.f((Object)audioMixer, "$audioMixer");
        e.f((Object)s, "$inputVideoFilePath");
        e.f((Object)voiceoverData, "$voiceoverData");
        e.f((Object)file, "$voiceoverFile");
        if (!d0.isDisposed()) {
            d0.onSuccess((Object)mp4Merger.mergeAudio(audioMixer, list, s, voiceoverData, n, file));
        }
    }
    
    private static final void mergeWithVoiceover$lambda-4$lambda-3$lambda-2(final d0 d0, final Mp4Merger mp4Merger, final AudioMixer audioMixer, final String s, final VoiceoverData voiceoverData, final int n, final File file, final Throwable t) {
        e.f((Object)d0, "$emitter");
        e.f((Object)mp4Merger, "this$0");
        e.f((Object)audioMixer, "$audioMixer");
        e.f((Object)s, "$inputVideoFilePath");
        e.f((Object)voiceoverData, "$voiceoverData");
        e.f((Object)file, "$voiceoverFile");
        if (!d0.isDisposed()) {
            d0.onSuccess((Object)mp4Merger.mergeAudio(audioMixer, (List<Pair<String, String>>)EmptyList.INSTANCE, s, voiceoverData, n, file));
        }
    }
    
    public final Context getContext() {
        return this.context;
    }
    
    public final c0<File> merge(final List<String> list, final File file) {
        e.f((Object)list, "mp4FilePaths");
        String absolutePath;
        if (file != null) {
            absolutePath = file.getAbsolutePath();
        }
        else {
            absolutePath = null;
        }
        return merge$default(this, list, b.t1((Object)absolutePath), null, null, 12, null);
    }
    
    public final c0<File> merge(final List<String> list, final List<String> list2, final Long n, final Long n2) {
        e.f((Object)list, "mp4FilePaths");
        e.f((Object)list2, "audioFilePaths");
        final StringBuilder sb = new StringBuilder();
        sb.append("merge() called with: mp4FilePaths = [");
        sb.append(list);
        sb.append("], audioFiles = [");
        sb.append(list2);
        sb.append(']');
        Log.d("Mp4Merger", sb.toString());
        final c0<Object> h = c0.u((Callable<?>)new mr0.a((Object)list, (Object)list2, (Object)this, (Object)n, (Object)n2, 1)).H(eg2.a.b());
        e.e((Object)h, "fromCallable {\n      if \u2026scribeOn(Schedulers.io())");
        return (c0<File>)h;
    }
    
    public final File mergeAudio(final AudioMixer audioMixer, final List<Pair<String, String>> list, final String s, final VoiceoverData voiceoverData, final int e, final File file) {
        e.f((Object)audioMixer, "audioMixer");
        e.f((Object)s, "inputVideoFilePath");
        e.f((Object)voiceoverData, "voiceoverData");
        e.f((Object)file, "voiceoverFile");
        if (voiceoverData.getKeepSourceAudio()) {
            String s2 = null;
            Label_0124: {
                Label_0121: {
                    if (list != null) {
                        while (true) {
                            for (final Pair next : list) {
                                if (e.a(next.getFirst(), (Object)s)) {
                                    final Pair pair = next;
                                    if (pair == null || (s2 = (String)pair.getSecond()) == null) {
                                        break Label_0121;
                                    }
                                    break Label_0124;
                                }
                            }
                            Pair next = null;
                            continue;
                        }
                    }
                }
                s2 = s;
            }
            audioMixer.d.add(new uu2.c(s2));
        }
        for (final VoiceoverItem voiceoverItem : voiceoverData.getItems()) {
            String filePath = null;
            Label_0272: {
                Label_0265: {
                    if (list != null) {
                        while (true) {
                            for (final Pair next2 : list) {
                                if (e.a(next2.getFirst(), (Object)voiceoverItem.getFilePath())) {
                                    final Pair pair2 = next2;
                                    if (pair2 == null) {
                                        break Label_0265;
                                    }
                                    filePath = (String)pair2.getSecond();
                                    if (filePath != null) {
                                        break Label_0272;
                                    }
                                    break Label_0265;
                                }
                            }
                            Pair next2 = null;
                            continue;
                        }
                    }
                }
                filePath = voiceoverItem.getFilePath();
            }
            final uu2.c c = new uu2.c(filePath);
            long convert;
            if ((convert = TimeUnit.MICROSECONDS.convert(voiceoverItem.getParentPositionOffset(), TimeUnit.MILLISECONDS)) < 0L) {
                convert = 0L;
            }
            c.e = convert;
            audioMixer.d.add(c);
        }
        audioMixer.f = 64000;
        audioMixer.e = e;
        audioMixer.g = 2;
        audioMixer.h = AudioMixer$MixingType.PARALLEL;
        audioMixer.e();
        audioMixer.a();
        audioMixer.m = true;
        audioMixer.b(false);
        audioMixer.m = false;
        final AudioMixer$a p6 = audioMixer.p;
        if (p6 != null) {
            p6.onEnd();
        }
        audioMixer.d();
        final List r1 = b.r1((Object)s);
        final List r2 = b.r1((Object)file.getAbsolutePath());
        final BasicContainer a = new DefaultMp4Builder().a(this.buildFinalMovie(this.getMediaTracks(r1, r2), r2, null, null));
        final File outputFile = this.getOutputFile();
        final FileChannel channel = new RandomAccessFile(outputFile, "rw").getChannel();
        a.writeContainer((WritableByteChannel)channel);
        channel.close();
        return outputFile;
    }
    
    public final c0<File> mergeWithVoiceover(final String s, final VoiceoverData voiceoverData) {
        e.f((Object)s, "inputVideoFilePath");
        e.f((Object)voiceoverData, "voiceoverData");
        final c0<Object> h = c0.h((ff2.f0<Object>)new t(this, s, voiceoverData)).H(eg2.a.b());
        e.e((Object)h, "create<File> { emitter -\u2026scribeOn(Schedulers.io())");
        return (c0<File>)h;
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/reddit/video/creation/video/merge/Mp4Merger$Companion;", "", "()V", "SOUND_HANDLER", "", "SOUND_OFFSET", "", "TAG", "VIDEO_HANDLER", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J)\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/reddit/video/creation/video/merge/Mp4Merger$MediaTracks;", "", "", "Lpj/g;", "component1", "component2", "soundTracks", "videoTracks", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getSoundTracks", "()Ljava/util/List;", "getVideoTracks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class MediaTracks
    {
        private final List<g> soundTracks;
        private final List<g> videoTracks;
        
        public MediaTracks(final List<g> soundTracks, final List<g> videoTracks) {
            e.f((Object)soundTracks, "soundTracks");
            e.f((Object)videoTracks, "videoTracks");
            this.soundTracks = soundTracks;
            this.videoTracks = videoTracks;
        }
        
        public final List<g> component1() {
            return this.soundTracks;
        }
        
        public final List<g> component2() {
            return this.videoTracks;
        }
        
        public final MediaTracks copy(final List<g> list, final List<g> list2) {
            e.f((Object)list, "soundTracks");
            e.f((Object)list2, "videoTracks");
            return new MediaTracks(list, list2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MediaTracks)) {
                return false;
            }
            final MediaTracks mediaTracks = (MediaTracks)o;
            return e.a((Object)this.soundTracks, (Object)mediaTracks.soundTracks) && e.a((Object)this.videoTracks, (Object)mediaTracks.videoTracks);
        }
        
        public final List<g> getSoundTracks() {
            return this.soundTracks;
        }
        
        public final List<g> getVideoTracks() {
            return this.videoTracks;
        }
        
        @Override
        public int hashCode() {
            return this.videoTracks.hashCode() + this.soundTracks.hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("MediaTracks(soundTracks=");
            r.append(this.soundTracks);
            r.append(", videoTracks=");
            return d.o(r, (List)this.videoTracks, ')');
        }
    }
}
