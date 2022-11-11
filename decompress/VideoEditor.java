// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.videoResampler;

import zeroonezero.android.audio_mixer.AudioMixer$a;
import p9.f$b;
import qa.i;
import ff2.w;
import com.reddit.video.creation.video.trim.Progress;
import ff2.t;
import java.util.Iterator;
import com.reddit.video.creation.widgets.utils.VideoUtils;
import java.util.concurrent.TimeUnit;
import zeroonezero.android.audio_mixer.AudioMixer$MixingType;
import uu2.a;
import java.util.ArrayList;
import ig2.m;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.video.creation.state.VideoScale;
import com.daasuu.mp4compose.FillMode;
import com.reddit.video.creation.video.trim.data.audioEditor.AudioTrackFormat;
import com.reddit.comment.ui.presentation.c;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import p9.h;
import p9.g;
import java.util.concurrent.Executors;
import p9.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.reddit.video.creation.widgets.utils.VideoEditorUtils;
import java.io.File;
import android.util.Size;
import android.net.Uri;
import ff2.v;
import java.util.List;
import zeroonezero.android.audio_mixer.AudioMixer;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.api.configuration.FeatureConfig;
import android.content.Context;
import com.reddit.video.creation.video.trim.audioResampler.AudioEditor;
import com.reddit.video.creation.state.AspectRatioConfig;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B3\b\u0007\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J>\u0010\u000e\u001a\u00020\r*\u00020\u00062\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J4\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006." }, d2 = { "Lcom/reddit/video/creation/video/trim/videoResampler/VideoEditor;", "", "", "originalMediaUri", "Lcom/daasuu/mp4compose/FillMode;", "getFillMode", "Lzeroonezero/android/audio_mixer/AudioMixer;", "", "Lkotlin/Pair;", "tracks", "mp4sToExtractSoundFrom", "", "samplingRate", "Lhg2/j;", "mergeAudio", "Landroid/net/Uri;", "sourceUri", "", "cutFromMillis", "cutAtMillis", "destPath", "Landroid/util/Size;", "requestedSize", "Lff2/t;", "Lcom/reddit/video/creation/video/trim/Progress;", "compressAndCutVideo", "normalizeVideo", "createSoundFileFromMp4Files", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;", "audioEditor", "Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;", "Lcom/reddit/video/creation/video/trim/videoResampler/LitrVideoEditor;", "litrVideoEditor", "Lcom/reddit/video/creation/video/trim/videoResampler/LitrVideoEditor;", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "featureConfig", "Lcom/reddit/video/creation/api/configuration/FeatureConfig;", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/state/AspectRatioConfig;Lcom/reddit/video/creation/video/trim/audioResampler/AudioEditor;Lcom/reddit/video/creation/video/trim/videoResampler/LitrVideoEditor;Lcom/reddit/video/creation/api/configuration/FeatureConfig;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoEditor
{
    public static final int $stable;
    public static final Companion Companion;
    public static final String MERGED_AUDIO_PREFIX = "merged_audio_file_";
    public static final int PERCENT_MULTIPLIER = 100;
    public static final long PROCESSING_VIDEO_TIMEOUT_MINUTES = 100L;
    public static final String SOUND_SUFFIX = ".mp3";
    private final AspectRatioConfig aspectRatioConfig;
    private final AudioEditor audioEditor;
    private final Context context;
    private final FeatureConfig featureConfig;
    private final LitrVideoEditor litrVideoEditor;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    @Inject
    public VideoEditor(@Named("APP_CONTEXT") final Context context, final AspectRatioConfig aspectRatioConfig, final AudioEditor audioEditor, final LitrVideoEditor litrVideoEditor, final FeatureConfig featureConfig) {
        e.f((Object)context, "context");
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        e.f((Object)audioEditor, "audioEditor");
        e.f((Object)litrVideoEditor, "litrVideoEditor");
        e.f((Object)featureConfig, "featureConfig");
        this.context = context;
        this.aspectRatioConfig = aspectRatioConfig;
        this.audioEditor = audioEditor;
        this.litrVideoEditor = litrVideoEditor;
        this.featureConfig = featureConfig;
    }
    
    private static final void compressAndCutVideo$lambda-1(final String s, final Uri uri, final Size size, final VideoEditor videoEditor, final long j, final long k, final v v) {
        e.f((Object)s, "$destPath");
        e.f((Object)uri, "$sourceUri");
        e.f((Object)size, "$requestedSize");
        e.f((Object)videoEditor, "this$0");
        e.f((Object)v, "it");
        final VideoEditor$compressAndCutVideo$1$listener$1 g = new VideoEditor$compressAndCutVideo$1$listener$1(v, new File(s));
        final Uri sanitizeUri = VideoEditorUtils.INSTANCE.sanitizeUri(uri);
        final int height = size.getHeight();
        final int width = size.getWidth();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final f element = new f(videoEditor.context, sanitizeUri, s);
        element.j = j;
        element.k = k;
        element.d = new Size(width, height);
        element.e = 2500000;
        element.g = (f$b)g;
        final String string = uri.toString();
        e.e((Object)string, "sourceUri.toString()");
        element.h = videoEditor.getFillMode(string);
        if (element.o == null) {
            if (element.n == null) {
                element.n = Executors.newSingleThreadExecutor();
            }
            element.n.execute((Runnable)new g(element));
        }
        ref$ObjectRef.element = element;
        v.setCancellable((kf2.f)new com.reddit.video.creation.video.trim.videoResampler.f(ref$ObjectRef));
    }
    
    private static final void compressAndCutVideo$lambda-1$lambda-0(final Ref$ObjectRef ref$ObjectRef) {
        e.f((Object)ref$ObjectRef, "$composer");
        final f f = (f)ref$ObjectRef.element;
        if (f != null) {
            final h o = f.o;
            if (o != null) {
                o.h = true;
            }
        }
        ref$ObjectRef.element = null;
    }
    
    private static final void createSoundFileFromMp4Files$lambda-8(final VideoEditor videoEditor, final List list, final v v) {
        e.f((Object)videoEditor, "this$0");
        e.f((Object)list, "$mp4sToExtractSoundFrom");
        e.f((Object)v, "emitter");
        final StringBuilder sb = new StringBuilder();
        sb.append("merged_audio_file_");
        sb.append(System.currentTimeMillis());
        final String path = File.createTempFile(sb.toString(), ".mp3", VideoCacheHelper.getVideoCacheDirectory(videoEditor.context)).getPath();
        final File file = new File(path);
        final AudioMixer audioMixer = new AudioMixer(path);
        final VideoEditor$createSoundFileFromMp4Files$1$processingListener$1 p3 = new VideoEditor$createSoundFileFromMp4Files$1$processingListener$1(v, file, audioMixer);
        final List<AudioTrackFormat> audioTracks$creation_release = videoEditor.audioEditor.getAudioTracks$creation_release(list);
        final int calculateSamplingRate$creation_release = videoEditor.audioEditor.calculateSamplingRate$creation_release(audioTracks$creation_release);
        final List<AudioTrackFormat> tracksToTranscode$creation_release = videoEditor.audioEditor.getTracksToTranscode$creation_release(audioTracks$creation_release, calculateSamplingRate$creation_release);
        audioMixer.p = (AudioMixer$a)p3;
        v.setCancellable((kf2.f)new b((Object)audioMixer, 0));
        if (tracksToTranscode$creation_release.isEmpty()) {
            videoEditor.mergeAudio(audioMixer, (List<Pair<String, String>>)EmptyList.INSTANCE, list, calculateSamplingRate$creation_release);
        }
        else {
            videoEditor.audioEditor.resampleTracks$creation_release(tracksToTranscode$creation_release, calculateSamplingRate$creation_release).F((kf2.g<? super List<Pair<String, String>>>)new c(videoEditor, audioMixer, list, calculateSamplingRate$creation_release), (kf2.g<? super Throwable>)new com.reddit.video.creation.video.trim.videoResampler.c(videoEditor, audioMixer, list, calculateSamplingRate$creation_release));
        }
    }
    
    private static final void createSoundFileFromMp4Files$lambda-8$lambda-7$lambda-4(final AudioMixer audioMixer) {
        e.f((Object)audioMixer, "$this_with");
        audioMixer.d();
    }
    
    private static final void createSoundFileFromMp4Files$lambda-8$lambda-7$lambda-5(final VideoEditor videoEditor, final AudioMixer audioMixer, final List list, final int n, final List list2) {
        e.f((Object)videoEditor, "this$0");
        e.f((Object)audioMixer, "$this_with");
        e.f((Object)list, "$mp4sToExtractSoundFrom");
        videoEditor.mergeAudio(audioMixer, list2, list, n);
    }
    
    private static final void createSoundFileFromMp4Files$lambda-8$lambda-7$lambda-6(final VideoEditor videoEditor, final AudioMixer audioMixer, final List list, final int n, final Throwable t) {
        e.f((Object)videoEditor, "this$0");
        e.f((Object)audioMixer, "$this_with");
        e.f((Object)list, "$mp4sToExtractSoundFrom");
        videoEditor.mergeAudio(audioMixer, (List<Pair<String, String>>)EmptyList.INSTANCE, list, n);
    }
    
    private final FillMode getFillMode(final String s) {
        final VideoScale videoScale = this.aspectRatioConfig.getVideoScales().get(s);
        int n;
        if (videoScale == null) {
            n = -1;
        }
        else {
            n = WhenMappings.$EnumSwitchMapping$0[((Enum)videoScale).ordinal()];
        }
        FillMode fillMode;
        if (n != -1) {
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fillMode = FillMode.PRESERVE_ASPECT_FIT;
            }
            else {
                fillMode = FillMode.PRESERVE_ASPECT_CROP;
            }
        }
        else {
            fillMode = FillMode.PRESERVE_ASPECT_CROP;
        }
        return fillMode;
    }
    
    private final void mergeAudio(final AudioMixer audioMixer, final List<Pair<String, String>> list, final List<String> list2, final int n) {
        final ArrayList list3 = new ArrayList(m.c3((Iterable)list2, 10));
        final Iterator<Object> iterator = list2.iterator();
    Label_0136_Outer:
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                final Iterator iterator2 = list3.iterator();
                while (iterator2.hasNext()) {
                    audioMixer.d.add(iterator2.next());
                }
                audioMixer.f = 64000;
                audioMixer.e = Math.min(48000, n);
                audioMixer.g = 2;
                audioMixer.h = AudioMixer$MixingType.SEQUENTIAL;
                audioMixer.e();
                audioMixer.a();
                audioMixer.m = true;
                ((Thread)(audioMixer.q = new zeroonezero.android.audio_mixer.a(audioMixer))).start();
                return;
            }
            final String s = iterator.next();
        Label_0136:
            while (true) {
                if (list != null) {
                    Object o = null;
                    Label_0139: {
                        try {
                            while (true) {
                                for (final Pair next : list) {
                                    if (e.a(next.getFirst(), (Object)s)) {
                                        final Pair pair = next;
                                        if (pair == null) {
                                            break Label_0136;
                                        }
                                        final String s2;
                                        if ((s2 = (String)pair.getSecond()) == null) {
                                            break Label_0136;
                                        }
                                        break Label_0139;
                                    }
                                }
                                Pair next = null;
                                continue Label_0136_Outer;
                            }
                        }
                        catch (final RuntimeException ex) {
                            final String message = ex.getMessage();
                            if (message == null || !kotlin.text.b.P0((CharSequence)message, (CharSequence)"No audio track", false)) {
                                b = false;
                            }
                            if (!b) {
                                throw ex;
                            }
                            o = new uu2.b(TimeUnit.MICROSECONDS.convert(VideoUtils.realFileDuration(new File(s), this.context), TimeUnit.MILLISECONDS));
                            final String s2 = s;
                            o = new uu2.c(s2);
                        }
                    }
                    list3.add(o);
                    continue Label_0136_Outer;
                }
                continue Label_0136;
            }
        }
    }
    
    private static final void normalizeVideo$lambda-3(final String s, final Uri uri, final VideoEditor videoEditor, final Size size, final v v) {
        e.f((Object)s, "$destPath");
        e.f((Object)uri, "$sourceUri");
        e.f((Object)videoEditor, "this$0");
        e.f((Object)size, "$requestedSize");
        e.f((Object)v, "it");
        final VideoEditor$normalizeVideo$1$listener$1 g = new VideoEditor$normalizeVideo$1$listener$1(v, new File(s));
        final Uri sanitizeUri = VideoEditorUtils.INSTANCE.sanitizeUri(uri);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final f element = new f(videoEditor.context, sanitizeUri, s);
        element.d = new Size(size.getWidth(), size.getHeight());
        element.e = 2500000;
        element.g = (f$b)g;
        if (element.o == null) {
            if (element.n == null) {
                element.n = Executors.newSingleThreadExecutor();
            }
            element.n.execute((Runnable)new g(element));
        }
        ref$ObjectRef.element = element;
        v.setCancellable((kf2.f)new b((Object)ref$ObjectRef, 1));
    }
    
    private static final void normalizeVideo$lambda-3$lambda-2(final Ref$ObjectRef ref$ObjectRef) {
        e.f((Object)ref$ObjectRef, "$composer");
        final f f = (f)ref$ObjectRef.element;
        if (f != null) {
            final h o = f.o;
            if (o != null) {
                o.h = true;
            }
        }
        ref$ObjectRef.element = null;
    }
    
    public final t<Progress> compressAndCutVideo(final Uri uri, final long n, final long n2, final String s, final Size size) {
        e.f((Object)uri, "sourceUri");
        e.f((Object)s, "destPath");
        e.f((Object)size, "requestedSize");
        if (this.featureConfig.getLitrVideoEditorEnabled()) {
            return this.litrVideoEditor.compressAndCutVideo(uri, n, n2, s, size);
        }
        final t timeout = t.create((w)new com.reddit.video.creation.video.trim.videoResampler.e(s, uri, size, this, n, n2)).distinctUntilChanged().subscribeOn(eg2.a.b()).timeout(100L, TimeUnit.MINUTES);
        e.e((Object)timeout, "create<Progress> {\n     \u2026INUTES, TimeUnit.MINUTES)");
        return (t<Progress>)timeout;
    }
    
    public final t<Progress> createSoundFileFromMp4Files(final List<String> list) {
        e.f((Object)list, "mp4sToExtractSoundFrom");
        final t subscribeOn = t.create((w)new i(11, this, list)).distinctUntilChanged().subscribeOn(eg2.a.b());
        e.e((Object)subscribeOn, "create<Progress> { emitt\u2026scribeOn(Schedulers.io())");
        return (t<Progress>)subscribeOn;
    }
    
    public final t<Progress> normalizeVideo(final Uri uri, final String s, final Size size) {
        e.f((Object)uri, "sourceUri");
        e.f((Object)s, "destPath");
        e.f((Object)size, "requestedSize");
        if (this.featureConfig.getLitrVideoEditorEnabled()) {
            return this.litrVideoEditor.normalizeVideo(uri, s, size);
        }
        final t timeout = t.create((w)new d(s, uri, this, size)).distinctUntilChanged().subscribeOn(eg2.a.b()).timeout(100L, TimeUnit.MINUTES);
        e.e((Object)timeout, "create<Progress> {\n     \u2026INUTES, TimeUnit.MINUTES)");
        return (t<Progress>)timeout;
    }
    
    @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/video/trim/videoResampler/VideoEditor$Companion;", "", "()V", "MERGED_AUDIO_PREFIX", "", "PERCENT_MULTIPLIER", "", "PROCESSING_VIDEO_TIMEOUT_MINUTES", "", "SOUND_SUFFIX", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
