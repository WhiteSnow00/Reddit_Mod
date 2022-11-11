// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import com.reddit.video.creation.usecases.base.SingleUseCase;
import com.reddit.video.creation.widgets.utils.FileUtils;
import com.reddit.video.creation.usecases.render.RenderingConfig;
import com.reddit.video.creation.widgets.utils.VideoEditorUtils;
import eg2.a;
import kf2.o;
import pf1.g;
import lw0.b;
import com.reddit.video.creation.models.adjustclips.AdjustedClip;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.net.Uri;
import java.util.ArrayList;
import com.reddit.video.creation.widgets.widget.clipseekbar.model.AdjustableClip;
import com.reddit.video.creation.api.output.RecordedSegment;
import kotlin.Pair;
import com.reddit.video.creation.models.camera.CameraDirection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.video.creation.models.recording.RecordDubType;
import java.io.File;
import ff2.c0;
import com.reddit.video.creation.api.output.MergedVideo;
import ff2.g0;
import java.util.List;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import com.reddit.video.creation.usecases.trim.VideoTrimmerUseCaseFactory;
import android.util.Size;
import com.reddit.video.creation.usecases.mergesegments.PrepareRenderingConfigUseCaseFactory;
import com.reddit.video.creation.usecases.render.PostVideoConfig;
import com.reddit.video.creation.usecases.mergesegments.MergeVideoFromSegmentsUseCaseFactory;
import android.content.Context;
import com.reddit.video.creation.state.AspectRatioConfig;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00060\u0003H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0016\u0010.\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoConfigMaker;", "", "Lff2/c0;", "", "Lcom/reddit/video/creation/api/output/RecordedSegment;", "trimAdjustableClipsIfNeeded", "Lkotlin/Pair;", "", "adjustablePairs", "Lcom/reddit/video/creation/widgets/widget/clipseekbar/model/AdjustableClip;", "pickAdjustableClips", "Lcom/reddit/video/creation/api/output/MergedVideo;", "getMergeMp4FilesSingle", "Lcom/reddit/video/creation/usecases/render/PostVideoConfig;", "postConfig", "Lcom/reddit/video/creation/usecases/render/RenderingConfig;", "makeRenderingConfig", "", "outputVideoWidth", "outputVideoRate", "Landroid/util/Size;", "calculateOutputVideSize", "calculateOutputVideoRatio", "requestedVideoRatio", "calculateOutputVideoWidth", "segment", "", "requiresModification", "Lhg2/j;", "normalizeRecordedSegments", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/reddit/video/creation/usecases/mergesegments/MergeVideoFromSegmentsUseCaseFactory;", "mergeVideoFromSegmentsUseCaseFactory", "Lcom/reddit/video/creation/usecases/mergesegments/MergeVideoFromSegmentsUseCaseFactory;", "Lcom/reddit/video/creation/usecases/trim/VideoTrimmerUseCaseFactory;", "videoTrimmerUseCaseFactory", "Lcom/reddit/video/creation/usecases/trim/VideoTrimmerUseCaseFactory;", "Lcom/reddit/video/creation/usecases/mergesegments/PrepareRenderingConfigUseCaseFactory;", "prepareRenderingConfigUseCaseFactory", "Lcom/reddit/video/creation/usecases/mergesegments/PrepareRenderingConfigUseCaseFactory;", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "Lcom/reddit/video/creation/usecases/render/PostVideoConfig;", "requestedVideoSize", "Landroid/util/Size;", "<init>", "(Landroid/content/Context;Lcom/reddit/video/creation/usecases/mergesegments/MergeVideoFromSegmentsUseCaseFactory;Lcom/reddit/video/creation/usecases/trim/VideoTrimmerUseCaseFactory;Lcom/reddit/video/creation/usecases/mergesegments/PrepareRenderingConfigUseCaseFactory;Lcom/reddit/video/creation/state/AspectRatioConfig;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoConfigMaker
{
    public static final int $stable = 8;
    private final AspectRatioConfig aspectRatioConfig;
    private final Context context;
    private final MergeVideoFromSegmentsUseCaseFactory mergeVideoFromSegmentsUseCaseFactory;
    private PostVideoConfig postConfig;
    private final PrepareRenderingConfigUseCaseFactory prepareRenderingConfigUseCaseFactory;
    private Size requestedVideoSize;
    private final VideoTrimmerUseCaseFactory videoTrimmerUseCaseFactory;
    
    @Inject
    public VideoConfigMaker(@Named("APP_CONTEXT") final Context context, final MergeVideoFromSegmentsUseCaseFactory mergeVideoFromSegmentsUseCaseFactory, final VideoTrimmerUseCaseFactory videoTrimmerUseCaseFactory, final PrepareRenderingConfigUseCaseFactory prepareRenderingConfigUseCaseFactory, final AspectRatioConfig aspectRatioConfig) {
        e.f((Object)context, "context");
        e.f((Object)mergeVideoFromSegmentsUseCaseFactory, "mergeVideoFromSegmentsUseCaseFactory");
        e.f((Object)videoTrimmerUseCaseFactory, "videoTrimmerUseCaseFactory");
        e.f((Object)prepareRenderingConfigUseCaseFactory, "prepareRenderingConfigUseCaseFactory");
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        this.context = context;
        this.mergeVideoFromSegmentsUseCaseFactory = mergeVideoFromSegmentsUseCaseFactory;
        this.videoTrimmerUseCaseFactory = videoTrimmerUseCaseFactory;
        this.prepareRenderingConfigUseCaseFactory = prepareRenderingConfigUseCaseFactory;
        this.aspectRatioConfig = aspectRatioConfig;
    }
    
    private final c0<MergedVideo> getMergeMp4FilesSingle() {
        final MergeVideoFromSegmentsUseCaseFactory mergeVideoFromSegmentsUseCaseFactory = this.mergeVideoFromSegmentsUseCaseFactory;
        final Context context = this.context;
        final PostVideoConfig postConfig = this.postConfig;
        if (postConfig == null) {
            e.n("postConfig");
            throw null;
        }
        final List recordedSegments = postConfig.getRecordedSegments();
        final PostVideoConfig postConfig2 = this.postConfig;
        if (postConfig2 == null) {
            e.n("postConfig");
            throw null;
        }
        final RecordDubType recordType = postConfig2.getRecordType();
        final Size requestedVideoSize = this.requestedVideoSize;
        if (requestedVideoSize != null) {
            return ((SingleUseCase)mergeVideoFromSegmentsUseCaseFactory.create(context, recordedSegments, (File)null, recordType, requestedVideoSize)).execute();
        }
        e.n("requestedVideoSize");
        throw null;
    }
    
    private static final g0 makeRenderingConfig$lambda-0(final VideoConfigMaker videoConfigMaker, final List list) {
        e.f((Object)videoConfigMaker, "this$0");
        e.f((Object)list, "it");
        return (g0)videoConfigMaker.getMergeMp4FilesSingle();
    }
    
    private static final g0 makeRenderingConfig$lambda-1(final VideoConfigMaker videoConfigMaker, final PostVideoConfig postVideoConfig, final MergedVideo mergedVideo) {
        e.f((Object)videoConfigMaker, "this$0");
        e.f((Object)postVideoConfig, "$postConfig");
        e.f((Object)mergedVideo, "it");
        final PrepareRenderingConfigUseCaseFactory prepareRenderingConfigUseCaseFactory = videoConfigMaker.prepareRenderingConfigUseCaseFactory;
        final RecordDubType recordType = postVideoConfig.getRecordType();
        final boolean wasTimerUsed = postVideoConfig.getWasTimerUsed();
        final boolean wasFlashUsed = postVideoConfig.getWasFlashUsed();
        final List filterNames = postVideoConfig.getFilterNames();
        String s;
        if (filterNames != null) {
            s = (String)CollectionsKt___CollectionsKt.M3(filterNames);
        }
        else {
            s = null;
        }
        final CameraDirection cameraDirection = postVideoConfig.getCameraDirection();
        final boolean addWatermark = postVideoConfig.getAddWatermark();
        final List recordedSegments = postVideoConfig.getRecordedSegments();
        final Size requestedVideoSize = videoConfigMaker.requestedVideoSize;
        if (requestedVideoSize == null) {
            e.n("requestedVideoSize");
            throw null;
        }
        final int width = requestedVideoSize.getWidth();
        final Size requestedVideoSize2 = videoConfigMaker.requestedVideoSize;
        if (requestedVideoSize2 != null) {
            return (g0)((SingleUseCase)prepareRenderingConfigUseCaseFactory.create(mergedVideo, recordType, wasTimerUsed, wasFlashUsed, s, cameraDirection, addWatermark, recordedSegments, width, requestedVideoSize2.getHeight(), postVideoConfig.getTextStickerData(), postVideoConfig.getDrawingBitmapPath(), postVideoConfig.getVoiceoverData())).execute();
        }
        e.n("requestedVideoSize");
        throw null;
    }
    
    private final List<AdjustableClip> pickAdjustableClips(final List<Pair<Integer, RecordedSegment>> list) {
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = (Iterator<Object>)list.iterator();
        while (iterator.hasNext()) {
            final RecordedSegment recordedSegment = (RecordedSegment)iterator.next().component2();
            final AdjustedClip adjustedClip = recordedSegment.getAdjustedClip();
            if (adjustedClip != null) {
                final AdjustableClip adjustableClip = adjustedClip.getAdjustableClip();
                if (adjustableClip != null) {
                    list2.add(adjustableClip);
                    continue;
                }
            }
            if (!recordedSegment.isUploadedSegment() && recordedSegment.getTempVideoFilePath() != null) {
                final String string = Uri.fromFile(new File(recordedSegment.getTempVideoFilePath())).toString();
                e.e((Object)string, "fromFile(File(segment.te\u2026ideoFilePath)).toString()");
                list2.add(new AdjustableClip(string, (long)recordedSegment.getRecordedMs(), 0L, (long)recordedSegment.getRecordedMs(), true, false, 32, (DefaultConstructorMarker)null));
            }
        }
        return list2;
    }
    
    private final c0<List<RecordedSegment>> trimAdjustableClipsIfNeeded() {
        final PostVideoConfig postConfig = this.postConfig;
        if (postConfig != null) {
            final List recordedSegments = postConfig.getRecordedSegments();
            final ArrayList list = new ArrayList();
            int n = 0;
            for (final Object next : recordedSegments) {
                if (n < 0) {
                    b.I2();
                    throw null;
                }
                final RecordedSegment recordedSegment = (RecordedSegment)next;
                Pair pair;
                if (this.requiresModification(recordedSegment)) {
                    pair = new Pair((Object)n, (Object)recordedSegment);
                }
                else {
                    pair = null;
                }
                if (pair != null) {
                    list.add(pair);
                }
                ++n;
            }
            Object o;
            if (list.isEmpty()) {
                this.normalizeRecordedSegments();
                final PostVideoConfig postConfig2 = this.postConfig;
                if (postConfig2 == null) {
                    e.n("postConfig");
                    throw null;
                }
                o = c0.v(postConfig2.getRecordedSegments());
                e.e(o, "{\n      normalizeRecorde\u2026g.recordedSegments)\n    }");
            }
            else {
                o = c0.v(list).p((kf2.o<? super ArrayList, ? extends ff2.g0<?>>)new g((Object)this, 11));
                e.e(o, "{\n      Single.just(item\u2026        }\n        }\n    }");
            }
            return (c0<List<RecordedSegment>>)o;
        }
        e.n("postConfig");
        throw null;
    }
    
    private static final g0 trimAdjustableClipsIfNeeded$lambda-11(final VideoConfigMaker videoConfigMaker, final List list) {
        e.f((Object)videoConfigMaker, "this$0");
        e.f((Object)list, "adjustablePairs");
        final List<AdjustableClip> pickAdjustableClips = videoConfigMaker.pickAdjustableClips(list);
        final VideoTrimmerUseCaseFactory videoTrimmerUseCaseFactory = videoConfigMaker.videoTrimmerUseCaseFactory;
        final Size requestedVideoSize = videoConfigMaker.requestedVideoSize;
        if (requestedVideoSize != null) {
            return (g0)((SingleUseCase)videoTrimmerUseCaseFactory.create(pickAdjustableClips, requestedVideoSize)).execute().y(a.b()).w((o)new g50.g(13, (Object)videoConfigMaker, (Object)list));
        }
        e.n("requestedVideoSize");
        throw null;
    }
    
    private static final List trimAdjustableClipsIfNeeded$lambda-11$lambda-10(final VideoConfigMaker videoConfigMaker, final List list, final List list2) {
        e.f((Object)videoConfigMaker, "this$0");
        e.f((Object)list, "$adjustablePairs");
        e.f((Object)list2, "it");
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list2.iterator();
        final int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n2 < 0) {
                b.I2();
                throw null;
            }
            final RecordedSegment recordedSegment = ((AdjustedClip)next).toRecordedSegment(videoConfigMaker.context, ((RecordedSegment)list.get(n2).getSecond()).getPlayerEndTime());
            if (recordedSegment != null) {
                list3.add(recordedSegment);
            }
            ++n2;
        }
        final Iterator iterator2 = list3.iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            final Object next2 = iterator2.next();
            if (n3 < 0) {
                b.I2();
                throw null;
            }
            final RecordedSegment recordedSegment2 = (RecordedSegment)next2;
            final int intValue = ((Number)list.get(n3).getFirst()).intValue();
            final PostVideoConfig postConfig = videoConfigMaker.postConfig;
            if (postConfig == null) {
                e.n("postConfig");
                throw null;
            }
            postConfig.getRecordedSegments().set(intValue, recordedSegment2);
            ++n3;
        }
        final PostVideoConfig postConfig2 = videoConfigMaker.postConfig;
        if (postConfig2 != null) {
            return postConfig2.getRecordedSegments();
        }
        e.n("postConfig");
        throw null;
    }
    
    public final Size calculateOutputVideSize(final float n, final float n2) {
        return VideoEditorUtils.INSTANCE.getTargetDimension(n, n2);
    }
    
    public final float calculateOutputVideoRatio() {
        final VideoEditorUtils instance = VideoEditorUtils.INSTANCE;
        final PostVideoConfig postConfig = this.postConfig;
        if (postConfig != null) {
            final Size videoSize = instance.getVideoSize((RecordedSegment)CollectionsKt___CollectionsKt.A3(postConfig.getRecordedSegments()), this.context);
            return instance.getTargetRatio(this.aspectRatioConfig.getVideoOrientation(), (float)videoSize.getWidth(), (float)videoSize.getHeight());
        }
        e.n("postConfig");
        throw null;
    }
    
    public final int calculateOutputVideoWidth(final float n) {
        final PostVideoConfig postConfig = this.postConfig;
        if (postConfig != null) {
            final Iterator iterator = postConfig.getRecordedSegments().iterator();
            int max = 0;
            while (iterator.hasNext()) {
                max = Math.max(max, VideoEditorUtils.INSTANCE.getVideoSize((RecordedSegment)iterator.next(), this.context).getWidth());
            }
            int n2;
            if (n > 1.0f) {
                n2 = 1920;
            }
            else {
                n2 = 1080;
            }
            return Math.min(max, n2);
        }
        e.n("postConfig");
        throw null;
    }
    
    public final c0<RenderingConfig> makeRenderingConfig(final PostVideoConfig postConfig) {
        e.f((Object)postConfig, "postConfig");
        this.postConfig = postConfig;
        final float calculateOutputVideoRatio = this.calculateOutputVideoRatio();
        this.requestedVideoSize = this.calculateOutputVideSize((float)this.calculateOutputVideoWidth(calculateOutputVideoRatio), calculateOutputVideoRatio);
        final c0<Object> p = this.trimAdjustableClipsIfNeeded().p((kf2.o<? super List<RecordedSegment>, ? extends ff2.g0<?>>)new m3.b((Object)this, 6)).p((kf2.o<? super Object, ? extends ff2.g0<?>>)new com.reddit.accountutil.a(18, (Object)this, (Object)postConfig));
        e.e((Object)p, "trimAdjustableClipsIfNee\u2026      ).execute()\n      }");
        return (c0<RenderingConfig>)p;
    }
    
    public final void normalizeRecordedSegments() {
        final PostVideoConfig postConfig = this.postConfig;
        if (postConfig != null) {
            final Iterator iterator = postConfig.getRecordedSegments().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (n < 0) {
                    b.I2();
                    throw null;
                }
                final RecordedSegment recordedSegment = (RecordedSegment)next;
                final AdjustedClip adjustedClip = recordedSegment.getAdjustedClip();
                if (adjustedClip != null && !adjustedClip.isAlreadyTrimmed()) {
                    final AdjustedClip adjustedClip2 = recordedSegment.getAdjustedClip();
                    if (adjustedClip2 != null) {
                        final AdjustableClip adjustableClip = adjustedClip2.getAdjustableClip();
                        if (adjustableClip != null) {
                            final Uri parse = Uri.parse(adjustableClip.getUri());
                            final File file = FileUtils.INSTANCE.getFile(this.context, parse);
                            String s;
                            if (file == null || (s = file.getPath()) == null) {
                                s = parse.getPath();
                            }
                            final String string = Uri.fromFile(new File(s)).toString();
                            e.e((Object)string, "fromFile(realFile).toString()");
                            final RecordedSegment recordedSegment$default = AdjustedClip.toRecordedSegment$default(new AdjustedClip(adjustableClip, string, false, adjustableClip.isUploaded()), this.context, 0, 2, (Object)null);
                            if (recordedSegment$default != null) {
                                final PostVideoConfig postConfig2 = this.postConfig;
                                if (postConfig2 == null) {
                                    e.n("postConfig");
                                    throw null;
                                }
                                postConfig2.getRecordedSegments().set(n, recordedSegment$default);
                            }
                        }
                    }
                }
                ++n;
            }
            return;
        }
        e.n("postConfig");
        throw null;
    }
    
    public final boolean requiresModification(final RecordedSegment recordedSegment) {
        e.f((Object)recordedSegment, "segment");
        final AdjustedClip adjustedClip = recordedSegment.getAdjustedClip();
        AdjustableClip adjustableClip;
        if (adjustedClip != null) {
            adjustableClip = adjustedClip.getAdjustableClip();
        }
        else {
            adjustableClip = null;
        }
        final AdjustedClip adjustedClip2 = recordedSegment.getAdjustedClip();
        final boolean b = true;
        final boolean b2 = false;
        final boolean b3 = adjustedClip2 != null && !adjustedClip2.isAlreadyTrimmed();
        boolean requiresTrimming = b2;
        if (b3) {
            requiresTrimming = b2;
            if (adjustableClip != null) {
                requiresTrimming = VideoEditorUtils.INSTANCE.requiresTrimming(adjustableClip);
            }
        }
        final VideoEditorUtils instance = VideoEditorUtils.INSTANCE;
        final Context context = this.context;
        final Size requestedVideoSize = this.requestedVideoSize;
        if (requestedVideoSize != null) {
            if (instance.requiresScaling(recordedSegment, context, requestedVideoSize)) {
                requiresTrimming = b;
            }
            return requiresTrimming;
        }
        e.n("requestedVideoSize");
        throw null;
    }
}
