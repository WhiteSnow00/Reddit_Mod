// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.normalize;

import v40.h;
import com.reddit.video.creation.video.utils.VideoCacheHelper;
import java.util.UUID;
import lw0.b;
import kf2.o;
import i10.f;
import kf2.q;
import ff0.p;
import ff2.c0;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.net.Uri;
import java.util.ArrayList;
import ig2.m;
import com.reddit.video.creation.models.adjustclips.AdjustedClip;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import ff2.g0;
import java.util.List;
import java.io.File;
import com.reddit.video.creation.video.trim.Progress;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import com.reddit.video.creation.video.trim.videoResampler.VideoEditor;
import com.reddit.video.creation.video.VideoDurationChecker;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/reddit/video/creation/video/normalize/MediaNormalizer;", "", "", "Lcom/reddit/video/creation/video/normalize/NormalizationTarget;", "mp4sToNormalize", "Lff2/c0;", "Lcom/reddit/video/creation/models/adjustclips/AdjustedClip;", "normalizeVideos", "Lcom/reddit/video/creation/video/normalize/NormalizationTargetResult;", "generateAdjustableClips", "", "mp4sToMerge", "Ljava/io/File;", "defaultAudioFile", "Lcom/reddit/video/creation/video/normalize/NormalizationResult;", "normalizeAudio", "getFinalSoundFile", "normalizeMp4Files", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/video/creation/video/VideoDurationChecker;", "videoDurationChecker", "Lcom/reddit/video/creation/video/VideoDurationChecker;", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoEditor;", "videoEditor", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoEditor;", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/video/VideoDurationChecker;Lcom/reddit/video/creation/video/trim/videoResampler/VideoEditor;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public class MediaNormalizer
{
    public static final int $stable = 8;
    private final Context context;
    private final VideoDurationChecker videoDurationChecker;
    private final VideoEditor videoEditor;
    
    @Inject
    public MediaNormalizer(@Named("APP_CONTEXT") final Context context, final VideoDurationChecker videoDurationChecker, final VideoEditor videoEditor) {
        e.f((Object)context, "context");
        e.f((Object)videoDurationChecker, "videoDurationChecker");
        e.f((Object)videoEditor, "videoEditor");
        this.context = context;
        this.videoDurationChecker = videoDurationChecker;
        this.videoEditor = videoEditor;
    }
    
    private final List<NormalizationTargetResult> generateAdjustableClips(final List<NormalizationTarget> list) {
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        for (final NormalizationTarget normalizationTarget : list) {
            final File file = new File(normalizationTarget.getFilePath());
            final VideoDurationChecker videoDurationChecker = this.videoDurationChecker;
            final Uri fromFile = Uri.fromFile(file);
            e.e((Object)fromFile, "fromFile(this)");
            final long durationMillis = videoDurationChecker.getDurationMillis(fromFile);
            final String string = file.toURI().toString();
            e.e((Object)string, "file.toURI().toString()");
            list2.add((Object)new NormalizationTargetResult(new AdjustableClip(string, durationMillis, 0L, durationMillis, true, false, 32, (DefaultConstructorMarker)null), normalizationTarget.getRequiresVideoNormalization(), normalizationTarget.getRequestedSize()));
        }
        return (List<NormalizationTargetResult>)list2;
    }
    
    private final c0<NormalizationResult> getFinalSoundFile(final List<String> list, final File file) {
        c0<NormalizationResult> c0;
        if (file != null) {
            c0 = ff2.c0.v(new NormalizationResult(list, file));
            e.e((Object)c0, "{\n      Single.just(Norm\u2026 defaultAudioFile))\n    }");
        }
        else {
            c0 = this.videoEditor.createSoundFileFromMp4Files(list).filter((q)new p(13)).map((o)new f((List)list, 1)).lastOrError();
            e.e((Object)c0, "{\n      videoEditor.crea\u2026    }.lastOrError()\n    }");
        }
        return c0;
    }
    
    private static final boolean getFinalSoundFile$lambda-6(final Progress progress) {
        e.f((Object)progress, "it");
        return progress.isComplete();
    }
    
    private static final NormalizationResult getFinalSoundFile$lambda-7(final List list, final Progress progress) {
        e.f((Object)list, "$mp4sToMerge");
        e.f((Object)progress, "it");
        return new NormalizationResult(list, progress.getOutputFile());
    }
    
    private final c0<NormalizationResult> normalizeAudio(final List<String> list, final File file) {
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Uri parse = Uri.parse((String)iterator.next());
            e.e((Object)parse, "parse(this)");
            final String path = parse.getPath();
            if (path != null) {
                list2.add(path);
            }
        }
        return this.getFinalSoundFile(list2, file);
    }
    
    private static final g0 normalizeMp4Files$lambda-1(final MediaNormalizer mediaNormalizer, final File file, final List list) {
        e.f((Object)mediaNormalizer, "this$0");
        e.f((Object)list, "it");
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((AdjustedClip)iterator.next()).getUri());
        }
        return (g0)mediaNormalizer.normalizeAudio(list2, file);
    }
    
    private final c0<List<AdjustedClip>> normalizeVideos(final List<NormalizationTarget> list) {
        final List<NormalizationTargetResult> generateAdjustableClips = this.generateAdjustableClips(list);
        final ArrayList list2 = new ArrayList<c0<AdjustedClip>>(m.c3((Iterable)generateAdjustableClips, 10));
        final Iterator<Object> iterator = generateAdjustableClips.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final NormalizationTargetResult next = iterator.next();
            if (n < 0) {
                b.I2();
                throw null;
            }
            final NormalizationTargetResult normalizationTargetResult = next;
            final AdjustableClip clip = normalizationTargetResult.getClip();
            c0<AdjustedClip> c0;
            if (normalizationTargetResult.getRequiresVideoNormalization()) {
                final VideoEditor videoEditor = this.videoEditor;
                final Uri parse = Uri.parse(clip.getUri());
                e.e((Object)parse, "parse(this)");
                final StringBuilder r = a.r("adjusted-clip");
                r.append(UUID.randomUUID());
                final String string = r.toString();
                final StringBuilder sb = new StringBuilder();
                sb.append('_');
                sb.append(n);
                sb.append(".mp4");
                final String path = File.createTempFile(string, sb.toString(), VideoCacheHelper.getVideoCacheDirectory(this.context)).getPath();
                e.e((Object)path, "createTempFile(\n        \u2026text),\n            ).path");
                c0 = videoEditor.normalizeVideo(parse, path, normalizationTargetResult.getRequestedSize()).takeLast(1).singleOrError().w((kf2.o<? super Object, ? extends AdjustedClip>)new com.reddit.billing.a((Object)clip, 28));
            }
            else {
                final Uri parse2 = Uri.parse(clip.getUri());
                e.e((Object)parse2, "parse(this)");
                final String string2 = parse2.toString();
                e.e((Object)string2, "clip.uri.toUri().toString()");
                c0 = ff2.c0.v(new AdjustedClip(clip, string2, true, clip.isUploaded()));
            }
            list2.add(c0);
            ++n;
        }
        final c0 singleOrError = c0.g(list2).buffer(generateAdjustableClips.size()).singleOrError();
        e.e((Object)singleOrError, "concat(\n      adjustable\u2026e)\n      .singleOrError()");
        return singleOrError;
    }
    
    private static final AdjustedClip normalizeVideos$lambda-3$lambda-2(final AdjustableClip adjustableClip, final Progress progress) {
        e.f((Object)adjustableClip, "$clip");
        e.f((Object)progress, "it");
        final Uri fromFile = Uri.fromFile(progress.getOutputFile());
        e.e((Object)fromFile, "fromFile(this)");
        final String string = fromFile.toString();
        e.e((Object)string, "it.outputFile.toUri().toString()");
        return new AdjustedClip(adjustableClip, string, true, adjustableClip.isUploaded());
    }
    
    public c0<NormalizationResult> normalizeMp4Files(final List<NormalizationTarget> list, final File file) {
        e.f((Object)list, "mp4sToNormalize");
        final c0<Object> p2 = this.normalizeVideos(list).p((kf2.o<? super List<AdjustedClip>, ? extends ff2.g0<?>>)new h(12, (Object)this, (Object)file));
        e.e((Object)p2, "normalizeVideos(mp4sToNo\u2026defaultAudioFile)\n      }");
        return (c0<NormalizationResult>)p2;
    }
}
