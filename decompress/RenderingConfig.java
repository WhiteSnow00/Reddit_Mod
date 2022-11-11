// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.usecases.render;

import kotlinx.serialization.internal.EnumSerializer;
import com.reddit.video.creation.models.recording.RecordDubType;
import com.reddit.video.creation.models.recording.SourceType;
import tj2.a$a;
import sg2.h;
import com.reddit.video.creation.models.voiceover.VoiceoverData$$serializer;
import sj2.g0;
import sj2.p0;
import sj2.e1;
import pj2.f;
import com.reddit.video.creation.video.render.models.TextStickerFilePathData$$serializer;
import rj2.b;
import java.util.Iterator;
import yg.a;
import java.util.ArrayList;
import sj2.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.models.voiceover.VoiceoverData;
import com.reddit.video.creation.video.render.models.TextStickerFilePathData;
import java.io.File;
import com.reddit.video.creation.video.render.models.TextStickerFileData;
import java.util.List;
import androidx.annotation.Keep;
import pj2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0003mnlB©\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020\u000e\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010*\u001a\u00020\u0018\u0012\b\b\u0002\u0010+\u001a\u00020\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bf\u0010gB·\u0001\b\u0017\u0012\u0006\u0010h\u001a\u00020\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010+\u001a\u00020\u000e\u0012\b\u0010,\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bf\u0010kJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0019\u001a\u00020\u0018H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u00c2\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001¢\u0006\u0004\b-\u0010.J\t\u0010/\u001a\u00020\u0002H\u00d6\u0001J\t\u00100\u001a\u00020\u0006H\u00d6\u0001J\u0013\u00102\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J!\u00109\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u00c7\u0001R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\bA\u0010@R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\bE\u0010<R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010>\u001a\u0004\bF\u0010@R\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\b$\u0010HR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010:\u001a\u0004\bI\u0010<R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\bJ\u0010<R\u0019\u0010'\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u0010K\u001a\u0004\bL\u0010\u0014R\u0019\u0010(\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b(\u0010K\u001a\u0004\bM\u0010\u0014R\u0019\u0010)\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010N\u001a\u0004\bO\u0010\u0017R\u0017\u0010*\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b*\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010+\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010G\u001a\u0004\bS\u0010HR\u0019\u0010,\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b,\u0010T\u001a\u0004\bU\u0010VR \u0010X\u001a\u00020W8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b\\\u0010]\u001a\u0004\bZ\u0010[R&\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010B\u0012\u0004\bb\u0010]\u001a\u0004\ba\u0010DR\"\u0010c\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bc\u0010Y\u0012\u0004\be\u0010]\u001a\u0004\bd\u0010[¨\u0006o" }, d2 = { "Lcom/reddit/video/creation/usecases/render/RenderingConfig;", "", "", "toJson", "component1", "component2", "", "component3", "component4", "", "Lcom/reddit/video/creation/video/render/models/TextStickerFilePathData;", "component5", "component6", "component7", "", "component8", "component9", "component10", "", "component11", "()Ljava/lang/Long;", "component12", "component13", "()Ljava/lang/Integer;", "Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;", "component14", "component15", "Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "component16", "uniqueFilePrefix", "videoFilePath", "videoWidth", "videoHeight", "textStickerData", "drawingBitmapPath", "cameraOrientation", "isUsingFilters", "uniqueWorkIdentifier", "soundFileToMerge", "startSoundTimeMillis", "endSoundTimeMillis", "numberOfSoundLoops", "analyticsData", "appendWatermark", "voiceoverData", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;ZLcom/reddit/video/creation/models/voiceover/VoiceoverData;)Lcom/reddit/video/creation/usecases/render/RenderingConfig;", "toString", "hashCode", "other", "equals", "self", "Lrj2/b;", "output", "Lqj2/e;", "serialDesc", "Lhg2/j;", "write$Self", "Ljava/lang/String;", "getUniqueFilePrefix", "()Ljava/lang/String;", "getVideoFilePath", "I", "getVideoWidth", "()I", "getVideoHeight", "Ljava/util/List;", "getTextStickerData", "()Ljava/util/List;", "getDrawingBitmapPath", "getCameraOrientation", "Z", "()Z", "getUniqueWorkIdentifier", "getSoundFileToMerge", "Ljava/lang/Long;", "getStartSoundTimeMillis", "getEndSoundTimeMillis", "Ljava/lang/Integer;", "getNumberOfSoundLoops", "Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;", "getAnalyticsData", "()Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;", "getAppendWatermark", "Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "getVoiceoverData", "()Lcom/reddit/video/creation/models/voiceover/VoiceoverData;", "Ljava/io/File;", "videoFile", "Ljava/io/File;", "getVideoFile", "()Ljava/io/File;", "getVideoFile$annotations", "()V", "", "Lcom/reddit/video/creation/video/render/models/TextStickerFileData;", "bitmapFile", "getBitmapFile", "getBitmapFile$annotations", "drawingBitmapFile", "getDrawingBitmapFile", "getDrawingBitmapFile$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;ZLcom/reddit/video/creation/models/voiceover/VoiceoverData;)V", "seen1", "Lsj2/a1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;ZLcom/reddit/video/creation/models/voiceover/VoiceoverData;Lsj2/a1;)V", "Companion", "$serializer", "AnalyticsData", "creation_release" }, k = 1, mv = { 1, 7, 1 })
@e
@Keep
public final class RenderingConfig
{
    public static final int $stable;
    public static final Companion Companion;
    private final AnalyticsData analyticsData;
    private final boolean appendWatermark;
    private final List<TextStickerFileData> bitmapFile;
    private final int cameraOrientation;
    private final File drawingBitmapFile;
    private final String drawingBitmapPath = drawingBitmapPath2;
    private final Long endSoundTimeMillis;
    private final boolean isUsingFilters;
    private final Integer numberOfSoundLoops;
    private final String soundFileToMerge;
    private final Long startSoundTimeMillis;
    private final List<TextStickerFilePathData> textStickerData = textStickerData;
    private final String uniqueFilePrefix = uniqueFilePrefix;
    private final String uniqueWorkIdentifier;
    private final File videoFile;
    private final String videoFilePath = drawingBitmapPath;
    private final int videoHeight = videoHeight;
    private final int videoWidth = videoWidth;
    private final VoiceoverData voiceoverData;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    public RenderingConfig(String drawingBitmapPath, final String videoFilePath, final int videoWidth, final int videoHeight, final List<TextStickerFilePathData> textStickerData, final String drawingBitmapPath2, final int cameraOrientation, final boolean isUsingFilters, final String uniqueWorkIdentifier, final String soundFileToMerge, final Long startSoundTimeMillis, final Long endSoundTimeMillis, final Integer numberOfSoundLoops, final AnalyticsData analyticsData, final boolean appendWatermark, final VoiceoverData voiceoverData) {
        sg2.e.f((Object)drawingBitmapPath, "uniqueFilePrefix");
        sg2.e.f((Object)videoFilePath, "videoFilePath");
        sg2.e.f((Object)textStickerData, "textStickerData");
        sg2.e.f((Object)uniqueWorkIdentifier, "uniqueWorkIdentifier");
        sg2.e.f((Object)analyticsData, "analyticsData");
        this.uniqueFilePrefix = drawingBitmapPath;
        this.videoFilePath = videoFilePath;
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.textStickerData = textStickerData;
        this.drawingBitmapPath = drawingBitmapPath2;
        this.cameraOrientation = cameraOrientation;
        this.isUsingFilters = isUsingFilters;
        this.uniqueWorkIdentifier = uniqueWorkIdentifier;
        this.soundFileToMerge = soundFileToMerge;
        this.startSoundTimeMillis = startSoundTimeMillis;
        this.endSoundTimeMillis = endSoundTimeMillis;
        this.numberOfSoundLoops = numberOfSoundLoops;
        this.analyticsData = analyticsData;
        this.appendWatermark = appendWatermark;
        this.voiceoverData = voiceoverData;
        this.videoFile = new File(videoFilePath);
        final ArrayList bitmapFile = new ArrayList();
        for (final TextStickerFilePathData textStickerFilePathData : textStickerData) {
            bitmapFile.add(new TextStickerFileData(new File(textStickerFilePathData.getPath()), textStickerFilePathData.getStartTime(), textStickerFilePathData.getEndTime()));
        }
        this.bitmapFile = bitmapFile;
        drawingBitmapPath = this.drawingBitmapPath;
        File drawingBitmapFile;
        if (drawingBitmapPath != null) {
            drawingBitmapFile = new File(drawingBitmapPath);
        }
        else {
            drawingBitmapFile = null;
        }
        this.drawingBitmapFile = drawingBitmapFile;
    }
    
    public static final void write$Self(final RenderingConfig renderingConfig, final b b, final qj2.e e) {
        sg2.e.f((Object)renderingConfig, "self");
        sg2.e.f((Object)b, "output");
        sg2.e.f((Object)e, "serialDesc");
        final String uniqueFilePrefix = renderingConfig.uniqueFilePrefix;
        final int n = 0;
        b.B(e, 0, uniqueFilePrefix);
        b.B(e, 1, renderingConfig.videoFilePath);
        b.t(2, renderingConfig.videoWidth, e);
        b.t(3, renderingConfig.videoHeight, e);
        b.z(e, 4, (pj2.f<? super List<TextStickerFilePathData>>)new sj2.e((pj2.b)TextStickerFilePathData$$serializer.INSTANCE), renderingConfig.textStickerData);
        final e1 a = e1.a;
        b.E(e, 5, (pj2.b)a, renderingConfig.drawingBitmapPath);
        boolean b2 = false;
        Label_0142: {
            if (!b.j(e)) {
                if (renderingConfig.cameraOrientation == 0) {
                    b2 = false;
                    break Label_0142;
                }
            }
            b2 = true;
        }
        if (b2) {
            b.t(6, renderingConfig.cameraOrientation, e);
        }
        boolean b3 = false;
        Label_0189: {
            if (!b.j(e)) {
                if (!renderingConfig.isUsingFilters) {
                    b3 = false;
                    break Label_0189;
                }
            }
            b3 = true;
        }
        if (b3) {
            b.y(e, 7, renderingConfig.isUsingFilters);
        }
        b.B(e, 8, renderingConfig.uniqueWorkIdentifier);
        boolean b4 = false;
        Label_0249: {
            if (!b.j(e)) {
                if (renderingConfig.soundFileToMerge == null) {
                    b4 = false;
                    break Label_0249;
                }
            }
            b4 = true;
        }
        if (b4) {
            b.E(e, 9, (pj2.b)a, renderingConfig.soundFileToMerge);
        }
        boolean b5 = false;
        Label_0297: {
            if (!b.j(e)) {
                if (renderingConfig.startSoundTimeMillis == null) {
                    b5 = false;
                    break Label_0297;
                }
            }
            b5 = true;
        }
        if (b5) {
            b.E(e, 10, (pj2.b)p0.a, renderingConfig.startSoundTimeMillis);
        }
        boolean b6 = false;
        Label_0347: {
            if (!b.j(e)) {
                if (renderingConfig.endSoundTimeMillis == null) {
                    b6 = false;
                    break Label_0347;
                }
            }
            b6 = true;
        }
        if (b6) {
            b.E(e, 11, (pj2.b)p0.a, renderingConfig.endSoundTimeMillis);
        }
        boolean b7 = false;
        Label_0409: {
            if (!b.j(e)) {
                final Integer numberOfSoundLoops = renderingConfig.numberOfSoundLoops;
                if (numberOfSoundLoops != null) {
                    if (numberOfSoundLoops == 0) {
                        b7 = false;
                        break Label_0409;
                    }
                }
            }
            b7 = true;
        }
        if (b7) {
            b.E(e, 12, (pj2.b)g0.a, renderingConfig.numberOfSoundLoops);
        }
        b.z(e, 13, (pj2.f<? super AnalyticsData>)RenderingConfig$AnalyticsData$$serializer.INSTANCE, renderingConfig.analyticsData);
        boolean b8 = false;
        Label_0476: {
            if (!b.j(e)) {
                if (renderingConfig.appendWatermark) {
                    b8 = false;
                    break Label_0476;
                }
            }
            b8 = true;
        }
        if (b8) {
            b.y(e, 14, renderingConfig.appendWatermark);
        }
        int n2 = 0;
        Label_0521: {
            if (!b.j(e)) {
                n2 = n;
                if (renderingConfig.voiceoverData == null) {
                    break Label_0521;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            b.E(e, 15, (pj2.b)VoiceoverData$$serializer.INSTANCE, renderingConfig.voiceoverData);
        }
    }
    
    public final String component1() {
        return this.uniqueFilePrefix;
    }
    
    public final String component10() {
        return this.soundFileToMerge;
    }
    
    public final Long component11() {
        return this.startSoundTimeMillis;
    }
    
    public final Long component12() {
        return this.endSoundTimeMillis;
    }
    
    public final Integer component13() {
        return this.numberOfSoundLoops;
    }
    
    public final AnalyticsData component14() {
        return this.analyticsData;
    }
    
    public final boolean component15() {
        return this.appendWatermark;
    }
    
    public final VoiceoverData component16() {
        return this.voiceoverData;
    }
    
    public final String component2() {
        return this.videoFilePath;
    }
    
    public final int component3() {
        return this.videoWidth;
    }
    
    public final int component4() {
        return this.videoHeight;
    }
    
    public final List<TextStickerFilePathData> component5() {
        return this.textStickerData;
    }
    
    public final String component6() {
        return this.drawingBitmapPath;
    }
    
    public final int component7() {
        return this.cameraOrientation;
    }
    
    public final boolean component8() {
        return this.isUsingFilters;
    }
    
    public final String component9() {
        return this.uniqueWorkIdentifier;
    }
    
    public final RenderingConfig copy(final String s, final String s2, final int n, final int n2, final List<TextStickerFilePathData> list, final String s3, final int n3, final boolean b, final String s4, final String s5, final Long n4, final Long n5, final Integer n6, final AnalyticsData analyticsData, final boolean b2, final VoiceoverData voiceoverData) {
        sg2.e.f((Object)s, "uniqueFilePrefix");
        sg2.e.f((Object)s2, "videoFilePath");
        sg2.e.f((Object)list, "textStickerData");
        sg2.e.f((Object)s4, "uniqueWorkIdentifier");
        sg2.e.f((Object)analyticsData, "analyticsData");
        return new RenderingConfig(s, s2, n, n2, list, s3, n3, b, s4, s5, n4, n5, n6, analyticsData, b2, voiceoverData);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenderingConfig)) {
            return false;
        }
        final RenderingConfig renderingConfig = (RenderingConfig)o;
        return sg2.e.a((Object)this.uniqueFilePrefix, (Object)renderingConfig.uniqueFilePrefix) && sg2.e.a((Object)this.videoFilePath, (Object)renderingConfig.videoFilePath) && this.videoWidth == renderingConfig.videoWidth && this.videoHeight == renderingConfig.videoHeight && sg2.e.a((Object)this.textStickerData, (Object)renderingConfig.textStickerData) && sg2.e.a((Object)this.drawingBitmapPath, (Object)renderingConfig.drawingBitmapPath) && this.cameraOrientation == renderingConfig.cameraOrientation && this.isUsingFilters == renderingConfig.isUsingFilters && sg2.e.a((Object)this.uniqueWorkIdentifier, (Object)renderingConfig.uniqueWorkIdentifier) && sg2.e.a((Object)this.soundFileToMerge, (Object)renderingConfig.soundFileToMerge) && sg2.e.a((Object)this.startSoundTimeMillis, (Object)renderingConfig.startSoundTimeMillis) && sg2.e.a((Object)this.endSoundTimeMillis, (Object)renderingConfig.endSoundTimeMillis) && sg2.e.a((Object)this.numberOfSoundLoops, (Object)renderingConfig.numberOfSoundLoops) && sg2.e.a((Object)this.analyticsData, (Object)renderingConfig.analyticsData) && this.appendWatermark == renderingConfig.appendWatermark && sg2.e.a((Object)this.voiceoverData, (Object)renderingConfig.voiceoverData);
    }
    
    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }
    
    public final boolean getAppendWatermark() {
        return this.appendWatermark;
    }
    
    public final List<TextStickerFileData> getBitmapFile() {
        return this.bitmapFile;
    }
    
    public final int getCameraOrientation() {
        return this.cameraOrientation;
    }
    
    public final File getDrawingBitmapFile() {
        return this.drawingBitmapFile;
    }
    
    public final String getDrawingBitmapPath() {
        return this.drawingBitmapPath;
    }
    
    public final Long getEndSoundTimeMillis() {
        return this.endSoundTimeMillis;
    }
    
    public final Integer getNumberOfSoundLoops() {
        return this.numberOfSoundLoops;
    }
    
    public final String getSoundFileToMerge() {
        return this.soundFileToMerge;
    }
    
    public final Long getStartSoundTimeMillis() {
        return this.startSoundTimeMillis;
    }
    
    public final List<TextStickerFilePathData> getTextStickerData() {
        return this.textStickerData;
    }
    
    public final String getUniqueFilePrefix() {
        return this.uniqueFilePrefix;
    }
    
    public final String getUniqueWorkIdentifier() {
        return this.uniqueWorkIdentifier;
    }
    
    public final File getVideoFile() {
        return this.videoFile;
    }
    
    public final String getVideoFilePath() {
        return this.videoFilePath;
    }
    
    public final int getVideoHeight() {
        return this.videoHeight;
    }
    
    public final int getVideoWidth() {
        return this.videoWidth;
    }
    
    public final VoiceoverData getVoiceoverData() {
        return this.voiceoverData;
    }
    
    @Override
    public int hashCode() {
        final int c = aw.b.c((List)this.textStickerData, a.c(this.videoHeight, a.c(this.videoWidth, b.c(this.videoFilePath, this.uniqueFilePrefix.hashCode() * 31, 31), 31), 31), 31);
        final String drawingBitmapPath = this.drawingBitmapPath;
        int hashCode = 0;
        int hashCode2;
        if (drawingBitmapPath == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = drawingBitmapPath.hashCode();
        }
        final int c2 = a.c(this.cameraOrientation, (c + hashCode2) * 31, 31);
        final int isUsingFilters = this.isUsingFilters ? 1 : 0;
        int n = 1;
        int n2 = isUsingFilters;
        if (isUsingFilters != 0) {
            n2 = 1;
        }
        final int c3 = b.c(this.uniqueWorkIdentifier, (c2 + n2) * 31, 31);
        final String soundFileToMerge = this.soundFileToMerge;
        int hashCode3;
        if (soundFileToMerge == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = soundFileToMerge.hashCode();
        }
        final Long startSoundTimeMillis = this.startSoundTimeMillis;
        int hashCode4;
        if (startSoundTimeMillis == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = startSoundTimeMillis.hashCode();
        }
        final Long endSoundTimeMillis = this.endSoundTimeMillis;
        int hashCode5;
        if (endSoundTimeMillis == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = endSoundTimeMillis.hashCode();
        }
        final Integer numberOfSoundLoops = this.numberOfSoundLoops;
        int hashCode6;
        if (numberOfSoundLoops == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = numberOfSoundLoops.hashCode();
        }
        final int hashCode7 = this.analyticsData.hashCode();
        final int appendWatermark = this.appendWatermark ? 1 : 0;
        if (appendWatermark == 0) {
            n = appendWatermark;
        }
        final VoiceoverData voiceoverData = this.voiceoverData;
        if (voiceoverData != null) {
            hashCode = voiceoverData.hashCode();
        }
        return ((hashCode7 + ((((c3 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31) * 31 + n) * 31 + hashCode;
    }
    
    public final boolean isUsingFilters() {
        return this.isUsingFilters;
    }
    
    public final String toJson() {
        final a$a d = tj2.a.d;
        return ((tj2.a)d).b(a.E1(((tj2.a)d).b, h.d((Class)RenderingConfig.class)), (Object)this);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("RenderingConfig(uniqueFilePrefix=");
        r.append(this.uniqueFilePrefix);
        r.append(", videoFilePath=");
        r.append(this.videoFilePath);
        r.append(", videoWidth=");
        r.append(this.videoWidth);
        r.append(", videoHeight=");
        r.append(this.videoHeight);
        r.append(", textStickerData=");
        r.append(this.textStickerData);
        r.append(", drawingBitmapPath=");
        r.append(this.drawingBitmapPath);
        r.append(", cameraOrientation=");
        r.append(this.cameraOrientation);
        r.append(", isUsingFilters=");
        r.append(this.isUsingFilters);
        r.append(", uniqueWorkIdentifier=");
        r.append(this.uniqueWorkIdentifier);
        r.append(", soundFileToMerge=");
        r.append(this.soundFileToMerge);
        r.append(", startSoundTimeMillis=");
        r.append(this.startSoundTimeMillis);
        r.append(", endSoundTimeMillis=");
        r.append(this.endSoundTimeMillis);
        r.append(", numberOfSoundLoops=");
        r.append(this.numberOfSoundLoops);
        r.append(", analyticsData=");
        r.append(this.analyticsData);
        r.append(", appendWatermark=");
        r.append(this.appendWatermark);
        r.append(", voiceoverData=");
        r.append(this.voiceoverData);
        r.append(')');
        return r.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BM\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b5\u00106Bc\b\u0017\u0012\u0006\u00107\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0013H\u00c6\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u0013H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\rH\u00d6\u0001J\t\u0010 \u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\u001c\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b4\u00103¨\u0006=" }, d2 = { "Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;", "", "self", "Lrj2/b;", "output", "Lqj2/e;", "serialDesc", "Lhg2/j;", "write$Self", "Lcom/reddit/video/creation/models/recording/RecordDubType;", "component1", "Lcom/reddit/video/creation/models/recording/SourceType;", "component2", "", "component3", "", "component4", "component5", "component6", "", "component7", "component8", "videoType", "sourceType", "sourceTitle", "hasTimer", "hasFlash", "videoFilterName", "cameraUsed", "segmentCount", "copy", "toString", "hashCode", "other", "equals", "Lcom/reddit/video/creation/models/recording/RecordDubType;", "getVideoType", "()Lcom/reddit/video/creation/models/recording/RecordDubType;", "Lcom/reddit/video/creation/models/recording/SourceType;", "getSourceType", "()Lcom/reddit/video/creation/models/recording/SourceType;", "Ljava/lang/String;", "getSourceTitle", "()Ljava/lang/String;", "Z", "getHasTimer", "()Z", "getHasFlash", "getVideoFilterName", "I", "getCameraUsed", "()I", "getSegmentCount", "<init>", "(Lcom/reddit/video/creation/models/recording/RecordDubType;Lcom/reddit/video/creation/models/recording/SourceType;Ljava/lang/String;ZZLjava/lang/String;II)V", "seen1", "Lsj2/a1;", "serializationConstructorMarker", "(ILcom/reddit/video/creation/models/recording/RecordDubType;Lcom/reddit/video/creation/models/recording/SourceType;Ljava/lang/String;ZZLjava/lang/String;IILsj2/a1;)V", "Companion", "$serializer", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    @e
    public static final class AnalyticsData
    {
        public static final int $stable = 0;
        public static final Companion Companion;
        private final int cameraUsed = cameraUsed;
        private final boolean hasFlash = hasFlash;
        private final boolean hasTimer = hasTimer;
        private final int segmentCount = segmentCount;
        private final String sourceTitle = sourceTitle;
        private final SourceType sourceType = sourceType;
        private final String videoFilterName = videoFilterName;
        private final RecordDubType videoType = videoType;
        
        static {
            Companion = new Companion(null);
        }
        
        public AnalyticsData(final RecordDubType videoType, final SourceType sourceType, final String sourceTitle, final boolean hasTimer, final boolean hasFlash, final String videoFilterName, final int cameraUsed, final int segmentCount) {
            sg2.e.f((Object)videoType, "videoType");
            this.videoType = videoType;
            this.sourceType = sourceType;
            this.sourceTitle = sourceTitle;
            this.hasTimer = hasTimer;
            this.hasFlash = hasFlash;
            this.videoFilterName = videoFilterName;
            this.cameraUsed = cameraUsed;
            this.segmentCount = segmentCount;
        }
        
        public static final void write$Self(final AnalyticsData analyticsData, final b b, final qj2.e e) {
            sg2.e.f((Object)analyticsData, "self");
            sg2.e.f((Object)b, "output");
            sg2.e.f((Object)e, "serialDesc");
            b.z(e, 0, (pj2.f<? super RecordDubType>)new EnumSerializer("com.reddit.video.creation.models.recording.RecordDubType", (Enum[])RecordDubType.values()), analyticsData.videoType);
            b.E(e, 1, (pj2.b)new EnumSerializer("com.reddit.video.creation.models.recording.SourceType", (Enum[])SourceType.values()), analyticsData.sourceType);
            final e1 a = e1.a;
            b.E(e, 2, (pj2.b)a, analyticsData.sourceTitle);
            b.y(e, 3, analyticsData.hasTimer);
            b.y(e, 4, analyticsData.hasFlash);
            b.E(e, 5, (pj2.b)a, analyticsData.videoFilterName);
            b.t(6, analyticsData.cameraUsed, e);
            b.t(7, analyticsData.segmentCount, e);
        }
        
        public final RecordDubType component1() {
            return this.videoType;
        }
        
        public final SourceType component2() {
            return this.sourceType;
        }
        
        public final String component3() {
            return this.sourceTitle;
        }
        
        public final boolean component4() {
            return this.hasTimer;
        }
        
        public final boolean component5() {
            return this.hasFlash;
        }
        
        public final String component6() {
            return this.videoFilterName;
        }
        
        public final int component7() {
            return this.cameraUsed;
        }
        
        public final int component8() {
            return this.segmentCount;
        }
        
        public final AnalyticsData copy(final RecordDubType recordDubType, final SourceType sourceType, final String s, final boolean b, final boolean b2, final String s2, final int n, final int n2) {
            sg2.e.f((Object)recordDubType, "videoType");
            return new AnalyticsData(recordDubType, sourceType, s, b, b2, s2, n, n2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof AnalyticsData)) {
                return false;
            }
            final AnalyticsData analyticsData = (AnalyticsData)o;
            return this.videoType == analyticsData.videoType && this.sourceType == analyticsData.sourceType && sg2.e.a((Object)this.sourceTitle, (Object)analyticsData.sourceTitle) && this.hasTimer == analyticsData.hasTimer && this.hasFlash == analyticsData.hasFlash && sg2.e.a((Object)this.videoFilterName, (Object)analyticsData.videoFilterName) && this.cameraUsed == analyticsData.cameraUsed && this.segmentCount == analyticsData.segmentCount;
        }
        
        public final int getCameraUsed() {
            return this.cameraUsed;
        }
        
        public final boolean getHasFlash() {
            return this.hasFlash;
        }
        
        public final boolean getHasTimer() {
            return this.hasTimer;
        }
        
        public final int getSegmentCount() {
            return this.segmentCount;
        }
        
        public final String getSourceTitle() {
            return this.sourceTitle;
        }
        
        public final SourceType getSourceType() {
            return this.sourceType;
        }
        
        public final String getVideoFilterName() {
            return this.videoFilterName;
        }
        
        public final RecordDubType getVideoType() {
            return this.videoType;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.videoType.hashCode();
            final SourceType sourceType = this.sourceType;
            int hashCode2 = 0;
            int hashCode3;
            if (sourceType == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = sourceType.hashCode();
            }
            final String sourceTitle = this.sourceTitle;
            int hashCode4;
            if (sourceTitle == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = sourceTitle.hashCode();
            }
            final int hasTimer = this.hasTimer ? 1 : 0;
            int n = 1;
            int n2 = hasTimer;
            if (hasTimer != 0) {
                n2 = 1;
            }
            final int hasFlash = this.hasFlash ? 1 : 0;
            if (hasFlash == 0) {
                n = hasFlash;
            }
            final String videoFilterName = this.videoFilterName;
            if (videoFilterName != null) {
                hashCode2 = videoFilterName.hashCode();
            }
            return Integer.hashCode(this.segmentCount) + a.c(this.cameraUsed, (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + n2) * 31 + n) * 31 + hashCode2) * 31, 31);
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("AnalyticsData(videoType=");
            r.append(this.videoType);
            r.append(", sourceType=");
            r.append(this.sourceType);
            r.append(", sourceTitle=");
            r.append(this.sourceTitle);
            r.append(", hasTimer=");
            r.append(this.hasTimer);
            r.append(", hasFlash=");
            r.append(this.hasFlash);
            r.append(", videoFilterName=");
            r.append(this.videoFilterName);
            r.append(", cameraUsed=");
            r.append(this.cameraUsed);
            r.append(", segmentCount=");
            return d.l(r, this.segmentCount, ')');
        }
        
        @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData$Companion;", "", "Lpj2/b;", "Lcom/reddit/video/creation/usecases/render/RenderingConfig$AnalyticsData;", "serializer", "<init>", "()V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class Companion
        {
            private Companion() {
            }
            
            public final pj2.b<AnalyticsData> serializer() {
                return (pj2.b<AnalyticsData>)RenderingConfig$AnalyticsData$$serializer.INSTANCE;
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u00c6\u0001¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/usecases/render/RenderingConfig$Companion;", "", "", "json", "Lcom/reddit/video/creation/usecases/render/RenderingConfig;", "fromJson", "Lpj2/b;", "serializer", "<init>", "()V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final RenderingConfig fromJson(final String s) {
            sg2.e.f((Object)s, "json");
            final a$a d = tj2.a.d;
            return (RenderingConfig)((tj2.a)d).a(a.E1(((tj2.a)d).b, h.d((Class)RenderingConfig.class)), s);
        }
        
        public final pj2.b<RenderingConfig> serializer() {
            return (pj2.b<RenderingConfig>)RenderingConfig$$serializer.INSTANCE;
        }
    }
}
