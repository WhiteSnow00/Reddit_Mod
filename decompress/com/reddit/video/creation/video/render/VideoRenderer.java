// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import kotlin.collections.EmptyList;
import com.reddit.video.creation.models.video.NoVideoFilter;
import com.reddit.video.creation.video.videocreator.CompressionConfig;
import com.reddit.video.creation.video.render.models.TextStickerData;
import java.util.List;
import com.reddit.video.creation.video.render.encoder.EncoderFactory;
import java.util.UUID;
import com.reddit.video.creation.video.videocreator.VideoCreationPhase;
import com.reddit.video.creation.video.videocreator.Progress;
import com.reddit.video.creation.video.videocreator.VideoCreationPhase$Rendering;
import java.nio.ByteBuffer;
import yd.b;
import kotlin.Result;
import com.reddit.video.creation.models.video.VideoFilter;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.media.MediaCrypto;
import android.view.Surface;
import com.reddit.video.creation.video.render.encoder.EncoderContainer;
import su2.a$b;
import kotlin.Pair;
import al0.g7;
import su2.a;
import android.media.MediaCodec$BufferInfo;
import sg2.e;
import java.io.FileNotFoundException;
import android.media.MediaFormat;
import java.io.IOException;
import android.media.MediaMuxer;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.video.creation.video.videocreator.ProgressListener;
import android.media.MediaExtractor;
import android.media.MediaCodec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 C2\u00020\u0001:\u0003CDEB\u0007¢\u0006\u0004\bA\u0010BJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0006H\u0002J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002J \u0010$\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u001a\u0010(\u001a\u00020'2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002J(\u0010/\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0018H\u0002J \u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020'H\u0002J\u001a\u00107\u001a\u00020\u00062\u0006\u00104\u001a\u00020 2\n\b\u0002\u00106\u001a\u0004\u0018\u000105J\u0006\u00108\u001a\u00020\tR\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00109R\u0016\u0010:\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010;R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010>R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0016\u00104\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010@¨\u0006F" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoRenderer;", "", "Lcom/reddit/video/creation/video/render/encoder/EncoderContainer;", "encoderContainer", "Landroid/media/MediaExtractor;", "mediaExtractor", "Ljava/io/File;", "outputFile", "inputVideoFile", "Lhg2/j;", "initEncoder", "setUpEncoderInfo", "Lcom/reddit/video/creation/video/render/InputSurface;", "inputSurface", "Landroid/media/MediaCodec;", "encoder", "initDecoder", "Landroid/media/MediaFormat;", "mediaFormat", "Lkotlin/Pair;", "Lcom/reddit/video/creation/video/render/OutputSurface;", "prepareDecoder", "", "presentationTimeUs", "", "shouldRender", "Landroid/media/MediaCodec$BufferInfo;", "encoderInfo", "Landroid/media/MediaMuxer;", "mediaMuxer", "writeToH264StreamFromEncoder", "resetState", "Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingConfig;", "config", "currentFrameTimeNs", "nextEncodedFrameTimeNs", "frameCameTooFast", "h264StreamFile", "createMuxer", "", "getTrackIndex", "getSensorOrientation", "getVideoInputFile", "extractor", "trackIndex", "decoder", "noMoreFramesRequired", "shouldExtractNextFrame", "currentFrameTimeUs", "recordingDurationMs", "currentPartNumber", "updateCurrentProgress", "renderingConfig", "Lcom/reddit/video/creation/video/videocreator/ProgressListener;", "progressListener", "renderVideo", "cleanUpResources", "Lcom/reddit/video/creation/video/videocreator/ProgressListener;", "encoderInputDone", "Z", "encoderOutputDone", "decoderDone", "Landroid/media/MediaCodec;", "Landroid/media/MediaExtractor;", "Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingConfig;", "<init>", "()V", "Companion", "RenderingConfig", "RenderingInfo", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoRenderer
{
    public static final int $stable;
    public static final Companion Companion;
    private static final long FRAME_DISTANCE_NS = 33333333L;
    private static final int MAX_PROGRESS = 100;
    private static final int ONE_SECOND_MS = 1000;
    private static final int ROTATION_180 = 180;
    private static final int ROTATION_360 = 360;
    private static final int ROTATION_90 = 90;
    private static final int TIMEOUT_US = 10000;
    private static final String VIDEO_MIME = "video/";
    private static RenderingInfo renderingInfo;
    private MediaCodec decoder;
    private boolean decoderDone;
    private MediaCodec encoder;
    private boolean encoderInputDone;
    private boolean encoderOutputDone;
    private MediaExtractor mediaExtractor;
    private boolean noMoreFramesRequired;
    private ProgressListener progressListener;
    private RenderingConfig renderingConfig;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    public static final /* synthetic */ RenderingInfo access$getRenderingInfo$cp() {
        return VideoRenderer.renderingInfo;
    }
    
    public static final /* synthetic */ void access$setRenderingInfo$cp(final RenderingInfo renderingInfo) {
        VideoRenderer.renderingInfo = renderingInfo;
    }
    
    private final MediaMuxer createMuxer(final File file) throws IOException {
        return new MediaMuxer(file.getPath(), 0);
    }
    
    private final boolean frameCameTooFast(final RenderingConfig renderingConfig, final long n, final long n2) {
        return !renderingConfig.isReadjustFrames() || (n <= 1L + n2 && n > n2 - 33333333L);
    }
    
    private final int getSensorOrientation(final MediaFormat mediaFormat) {
        int integer;
        if (mediaFormat.containsKey("rotation-degrees")) {
            integer = mediaFormat.getInteger("rotation-degrees");
        }
        else {
            integer = 0;
        }
        return integer;
    }
    
    private final int getTrackIndex(final MediaExtractor mediaExtractor, final File file) throws VideoTrackNotFoundException {
        final int selectTrackFromMediaExtractor = VideoDecoder.selectTrackFromMediaExtractor(mediaExtractor, "video/");
        if (selectTrackFromMediaExtractor >= 0) {
            return selectTrackFromMediaExtractor;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No video track found in ");
        sb.append(file);
        throw new VideoTrackNotFoundException(sb.toString());
    }
    
    private final File getVideoInputFile(final RenderingConfig renderingConfig) throws FileNotFoundException, InvalidPathException {
        final String videoFilePath = renderingConfig.getVideoFilePath();
        if (videoFilePath == null) {
            throw new InvalidPathException("The file path provided is null or empty.");
        }
        final File file = new File(videoFilePath);
        if (file.canRead()) {
            return file;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to read ");
        sb.append(file);
        throw new FileNotFoundException(sb.toString());
    }
    
    private final void initDecoder(final InputSurface inputSurface, File file, final MediaExtractor mediaExtractor, final MediaCodec mediaCodec, final File file2) {
        final int trackIndex = this.getTrackIndex(mediaExtractor, file2);
        final MediaFormat trackFormat = mediaExtractor.getTrackFormat(trackIndex);
        e.e((Object)trackFormat, "mediaExtractor.getTrackFormat(trackIndex)");
        final Pair<OutputSurface, MediaCodec> prepareDecoder = this.prepareDecoder(trackFormat, inputSurface);
        final MediaCodec decoder = (MediaCodec)prepareDecoder.getSecond();
        this.decoder = decoder;
        if (decoder != null) {
            final String name = decoder.getName();
            if (name != null) {
                final RenderingInfo renderingInfo = VideoRenderer.renderingInfo;
                RenderingInfo copy$default;
                if (renderingInfo == null || (copy$default = RenderingInfo.copy$default(renderingInfo, null, name, null, null, null, null, 61, null)) == null) {
                    copy$default = new RenderingInfo(null, name, null, null, null, null, 61, null);
                }
                VideoRenderer.renderingInfo = copy$default;
            }
        }
        final MediaCodec decoder2 = this.decoder;
        if (decoder2 != null) {
            decoder2.start();
            final long currentTimeMillis = System.currentTimeMillis();
            final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
            final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = new MediaCodec$BufferInfo();
            Object muxer = this.createMuxer(file);
            long n2;
            long n = n2 = 0L;
            int n3 = 1;
            int n4 = 0;
            int n5 = -1;
            long n6 = n2;
            Object o = mediaCodec$BufferInfo2;
            while (!this.encoderOutputDone) {
                if (!this.decoderDone && this.shouldExtractNextFrame(mediaExtractor, trackIndex, decoder2, this.noMoreFramesRequired)) {
                    this.decoderDone = true;
                }
                if (!this.encoderOutputDone) {
                    this.writeToH264StreamFromEncoder(mediaCodec, mediaCodec$BufferInfo, (MediaMuxer)muxer);
                }
                final OutputSurface outputSurface = (OutputSurface)prepareDecoder.getFirst();
                final RenderingConfig renderingConfig = this.renderingConfig;
                if (renderingConfig == null) {
                    e.n("renderingConfig");
                    throw null;
                }
                long n16 = 0L;
                Object o7 = null;
                long n17 = 0L;
                Label_1093: {
                    if (renderingConfig.isReadjustFrames() && !this.noMoreFramesRequired && n6 + 1L < 1000 * n) {
                        outputSurface.getSurfaceTexture().updateTexImage();
                        outputSurface.drawImage(false, false, n6);
                        inputSurface.setPresentationTime(n6);
                        inputSurface.swapBuffers();
                        n6 += 33333333L;
                    }
                    else {
                        int n7 = n5;
                        if (!this.encoderInputDone) {
                            int dequeueOutputBuffer;
                            int n8;
                            if (n5 < 0) {
                                dequeueOutputBuffer = decoder2.dequeueOutputBuffer((MediaCodec$BufferInfo)o, 10000L);
                                n8 = n5;
                            }
                            else {
                                n8 = n5 - 1;
                                dequeueOutputBuffer = n5;
                            }
                            n7 = n8;
                            if (VideoDecoder.isMediaCodecBufferIndexValid(dequeueOutputBuffer)) {
                                final long presentationTimeUs = ((MediaCodec$BufferInfo)o).presentationTimeUs;
                                if ((((MediaCodec$BufferInfo)o).flags & 0x4) != 0x0) {
                                    this.encoderInputDone = true;
                                }
                                final boolean shouldRender = this.shouldRender(presentationTimeUs);
                                final Object o2 = muxer;
                                int n9 = 0;
                                long n11 = 0L;
                                int n13 = 0;
                                Object o4 = null;
                                int n14 = 0;
                                Label_1032: {
                                    if (shouldRender) {
                                        if (n3 != 0) {
                                            n9 = 0;
                                            n2 = presentationTimeUs;
                                        }
                                        else {
                                            n9 = n3;
                                        }
                                        final long n10 = presentationTimeUs - n2;
                                        final Object o3 = o;
                                        n11 = 1000;
                                        final long n12 = n10 * n11;
                                        final RenderingConfig renderingConfig2 = this.renderingConfig;
                                        if (renderingConfig2 == null) {
                                            e.n("renderingConfig");
                                            throw null;
                                        }
                                        if (renderingConfig2.isReadjustFrames() && !this.noMoreFramesRequired && n6 + 1L < n12) {
                                            muxer = o2;
                                            n = n10;
                                            o = o3;
                                            n3 = n9;
                                            n5 = dequeueOutputBuffer;
                                            continue;
                                        }
                                        if (!this.noMoreFramesRequired && !this.encoderInputDone) {
                                            decoder2.releaseOutputBuffer(dequeueOutputBuffer, true);
                                            inputSurface.makeCurrent();
                                            file = (File)o3;
                                            while (true) {
                                                try {
                                                    outputSurface.awaitNewImage();
                                                    final RenderingConfig renderingConfig3 = this.renderingConfig;
                                                    if (renderingConfig3 != null) {
                                                        if (n10 > renderingConfig3.getRecordingDurationMs() * n11) {
                                                            a.a.a(g7.g("Bailing at ", n10), new Object[0]);
                                                            this.noMoreFramesRequired = true;
                                                        }
                                                        else {
                                                            final RenderingConfig renderingConfig4 = this.renderingConfig;
                                                            if (renderingConfig4 == null) {
                                                                e.n("renderingConfig");
                                                                throw null;
                                                            }
                                                            final long recordingDurationMs = renderingConfig4.getRecordingDurationMs();
                                                            final RenderingConfig renderingConfig5 = this.renderingConfig;
                                                            if (renderingConfig5 == null) {
                                                                e.n("renderingConfig");
                                                                throw null;
                                                            }
                                                            final int currentPartNumber = renderingConfig5.getCurrentPartNumber();
                                                            n11 = n6;
                                                            this.updateCurrentProgress(n10, recordingDurationMs, currentPartNumber);
                                                            outputSurface.getSurfaceTexture().updateTexImage();
                                                            final RenderingConfig renderingConfig6 = this.renderingConfig;
                                                            if (renderingConfig6 == null) {
                                                                e.n("renderingConfig");
                                                                throw null;
                                                            }
                                                            if (this.frameCameTooFast(renderingConfig6, n12, n11)) {
                                                                outputSurface.drawImage(false, false, n12);
                                                                final RenderingConfig renderingConfig7 = this.renderingConfig;
                                                                if (renderingConfig7 == null) {
                                                                    e.n("renderingConfig");
                                                                    throw null;
                                                                }
                                                                if (renderingConfig7.isReadjustFrames()) {
                                                                    n6 = n11;
                                                                }
                                                                else {
                                                                    n6 = n12;
                                                                }
                                                                inputSurface.setPresentationTime(n6);
                                                                inputSurface.swapBuffers();
                                                                n6 = n11 + 33333333L;
                                                            }
                                                        }
                                                        n11 = n6;
                                                        n6 = n2;
                                                        n13 = -1;
                                                        o4 = file;
                                                        n14 = n4;
                                                        file = (File)o2;
                                                        break Label_1032;
                                                    }
                                                    e.n("renderingConfig");
                                                    throw null;
                                                }
                                                catch (final InterruptedException ex) {
                                                    a.a.p((Throwable)ex);
                                                    continue;
                                                }
                                                break;
                                            }
                                        }
                                        if (n4 == 0) {
                                            mediaCodec.signalEndOfInputStream();
                                        }
                                        a.a.a("Enqueue encoder input EOS", new Object[0]);
                                    }
                                    else {
                                        final Object o5 = o2;
                                        final long n15 = n6;
                                        final MediaCodec$BufferInfo mediaCodec$BufferInfo3 = (MediaCodec$BufferInfo)o;
                                        if (!this.encoderInputDone) {
                                            n13 = dequeueOutputBuffer;
                                            o4 = mediaCodec$BufferInfo3;
                                            n9 = n3;
                                            n14 = n4;
                                            n6 = n2;
                                            n11 = n15;
                                            file = (File)o5;
                                            if ((mediaCodec$BufferInfo3.flags & 0x4) != 0x0) {
                                                a.a.a("Received decoder output EOS", new Object[0]);
                                                this.encoderInputDone = true;
                                                n13 = dequeueOutputBuffer;
                                                o4 = mediaCodec$BufferInfo3;
                                                n9 = n3;
                                                n14 = n4;
                                                n6 = n2;
                                                n11 = n15;
                                                file = (File)o5;
                                            }
                                            break Label_1032;
                                        }
                                        else {
                                            if (n4 == 0) {
                                                mediaCodec.signalEndOfInputStream();
                                            }
                                            a.a.a("Enqueue encoder input EOS", new Object[0]);
                                            n9 = n3;
                                        }
                                    }
                                    final Object o6 = muxer;
                                    o4 = o;
                                    n14 = 1;
                                    file = (File)o6;
                                    n11 = n6;
                                    n6 = n2;
                                    n13 = dequeueOutputBuffer;
                                }
                                if (VideoDecoder.isMediaCodecBufferIndexValid(n13)) {
                                    decoder2.releaseOutputBuffer(n13, true);
                                }
                                n16 = n11;
                                n3 = n9;
                                o7 = o4;
                                n4 = n14;
                                n5 = n8;
                                n17 = n6;
                                break Label_1093;
                            }
                        }
                        n5 = n7;
                    }
                    o7 = o;
                    file = (File)muxer;
                    n17 = n2;
                    n16 = n6;
                }
                n6 = n16;
                muxer = file;
                o = o7;
                n2 = n17;
            }
            final a$b a = su2.a.a;
            final StringBuilder r = a.r("Created H264 file in ");
            r.append(System.currentTimeMillis() - currentTimeMillis);
            r.append(" ms!");
            a.a(r.toString(), new Object[0]);
            ((MediaMuxer)muxer).release();
        }
    }
    
    private final void initEncoder(EncoderContainer upEncoderInfo, final MediaExtractor mediaExtractor, final File file, final File file2) {
        this.encoder = upEncoderInfo.getEncoder();
        this.setUpEncoderInfo(upEncoderInfo);
        final MediaCodec encoder = this.encoder;
        if (encoder != null) {
            try {
                encoder.configure(upEncoderInfo.getMediaFormat(), (Surface)null, (MediaCrypto)null, 1);
                upEncoderInfo = (EncoderContainer)new InputSurface(encoder.createInputSurface(), null);
                ((InputSurface)upEncoderInfo).makeCurrent();
                encoder.start();
                this.initDecoder((InputSurface)upEncoderInfo, file, mediaExtractor, encoder, file2);
            }
            catch (final Exception ex) {
                throw new EncoderConfigurationFailedException(upEncoderInfo, ex);
            }
        }
    }
    
    private final Pair<OutputSurface, MediaCodec> prepareDecoder(final MediaFormat mediaFormat, final InputSurface inputSurface) {
        final int sensorOrientation = this.getSensorOrientation(mediaFormat);
        float n = (float)mediaFormat.getInteger("width");
        float n2 = (float)mediaFormat.getInteger("height");
        final RenderingConfig renderingConfig = this.renderingConfig;
        if (renderingConfig == null) {
            e.n("renderingConfig");
            throw null;
        }
        int recordingOrientation = renderingConfig.getRecordingOrientation();
        if (recordingOrientation % 180 == 90) {
            recordingOrientation += 360 - sensorOrientation;
        }
        else {
            final float n3 = n;
            n = n2;
            n2 = n3;
        }
        final MediaCodec decoder = VideoDecoder.createDecoder(mediaFormat.getString("mime"));
        final RenderingConfig renderingConfig2 = this.renderingConfig;
        if (renderingConfig2 == null) {
            e.n("renderingConfig");
            throw null;
        }
        final int width = renderingConfig2.getCompressionConfig().getSize().getWidth();
        final RenderingConfig renderingConfig3 = this.renderingConfig;
        if (renderingConfig3 == null) {
            e.n("renderingConfig");
            throw null;
        }
        final int height = renderingConfig3.getCompressionConfig().getSize().getHeight();
        final RenderingConfig renderingConfig4 = this.renderingConfig;
        if (renderingConfig4 == null) {
            e.n("renderingConfig");
            throw null;
        }
        final Bitmap watermarkBitmap = renderingConfig4.getWatermarkBitmap();
        final EGLContext eglContext = inputSurface.getEglContext();
        final RenderingConfig renderingConfig5 = this.renderingConfig;
        if (renderingConfig5 == null) {
            e.n("renderingConfig");
            throw null;
        }
        final float topOffsetPercentage = renderingConfig5.getTopOffsetPercentage();
        final RenderingConfig renderingConfig6 = this.renderingConfig;
        if (renderingConfig6 == null) {
            e.n("renderingConfig");
            throw null;
        }
        final VideoFilter videoFilter = renderingConfig6.getVideoFilter();
        final RenderingConfig renderingConfig7 = this.renderingConfig;
        if (renderingConfig7 != null) {
            final OutputSurface outputSurface = new OutputSurface(width, height, n2, n, recordingOrientation * -1, watermarkBitmap, eglContext, false, topOffsetPercentage, videoFilter, renderingConfig7.getBitmaps());
            decoder.configure(mediaFormat, outputSurface.getSurface(), (MediaCrypto)null, 0);
            return (Pair<OutputSurface, MediaCodec>)new Pair((Object)outputSurface, (Object)decoder);
        }
        e.n("renderingConfig");
        throw null;
    }
    
    private final void resetState() {
        this.encoderInputDone = false;
        this.encoderOutputDone = false;
        this.decoderDone = false;
        this.noMoreFramesRequired = false;
    }
    
    private final void setUpEncoderInfo(final EncoderContainer encoderContainer) {
        Object constructor-impl = null;
        try {
            Result.constructor-impl((Object)encoderContainer.getMediaFormat().getInteger("level"));
        }
        finally {
            final Throwable t;
            constructor-impl = Result.constructor-impl((Object)b.o(t));
        }
        final boolean failure-impl = Result.isFailure-impl(constructor-impl);
        final Integer n = null;
        if (failure-impl) {
            constructor-impl = null;
        }
        final Integer n2 = (Integer)constructor-impl;
        Object constructor-impl2 = null;
        try {
            Result.constructor-impl((Object)encoderContainer.getMediaFormat().getInteger("profile"));
        }
        finally {
            final Throwable t2;
            constructor-impl2 = Result.constructor-impl((Object)b.o(t2));
        }
        Object o = constructor-impl2;
        if (Result.isFailure-impl(constructor-impl2)) {
            o = null;
        }
        final Integer n3 = (Integer)o;
        Object constructor-impl3 = null;
        try {
            Result.constructor-impl((Object)encoderContainer.getMediaFormat().getInteger("width"));
        }
        finally {
            final Throwable t3;
            constructor-impl3 = Result.constructor-impl((Object)b.o(t3));
        }
        Object o2 = constructor-impl3;
        if (Result.isFailure-impl(constructor-impl3)) {
            o2 = null;
        }
        final Integer n4 = (Integer)o2;
        Object constructor-impl4 = null;
        try {
            Result.constructor-impl((Object)encoderContainer.getMediaFormat().getInteger("height"));
        }
        finally {
            final Throwable t4;
            constructor-impl4 = Result.constructor-impl((Object)b.o(t4));
        }
        if (Result.isFailure-impl(constructor-impl4)) {
            constructor-impl4 = n;
        }
        final Integer n5 = (Integer)constructor-impl4;
        final String name = encoderContainer.getEncoder().getName();
        final RenderingInfo renderingInfo = VideoRenderer.renderingInfo;
        RenderingInfo copy$default;
        if (renderingInfo == null || (copy$default = RenderingInfo.copy$default(renderingInfo, name, null, n3, n2, n4, n5, 2, null)) == null) {
            copy$default = new RenderingInfo(name, null, n3, n2, n4, n5, 2, null);
        }
        VideoRenderer.renderingInfo = copy$default;
    }
    
    private final boolean shouldExtractNextFrame(final MediaExtractor mediaExtractor, final int n, final MediaCodec mediaCodec, final boolean b) {
        final int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
        final boolean b2 = false;
        if (dequeueInputBuffer < 0) {
            return false;
        }
        final ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
        boolean b3 = b2;
        if (inputBuffer != null) {
            inputBuffer.clear();
            final int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
            if (sampleData >= 0 && !b) {
                if (mediaExtractor.getSampleTrackIndex() != n) {
                    final a$b a = su2.a.a;
                    final StringBuilder r = a.r("Got sample from track ");
                    r.append(mediaExtractor.getSampleTrackIndex());
                    r.append(", expected ");
                    r.append(n);
                    a.a(r.toString(), new Object[0]);
                }
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
                b3 = b2;
            }
            else {
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                a.a.a("Enqueue decoder output EOS", new Object[0]);
                b3 = true;
            }
        }
        return b3;
    }
    
    private final boolean shouldRender(final long n) {
        final RenderingConfig renderingConfig = this.renderingConfig;
        if (renderingConfig != null) {
            return n >= renderingConfig.getRecordingOffsetMs() * 1000;
        }
        e.n("renderingConfig");
        throw null;
    }
    
    private final void updateCurrentProgress(final long n, final long n2, final int n3) {
        final ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgressChanged(new Progress((VideoCreationPhase)new VideoCreationPhase$Rendering(), (float)(100 * n / (n2 * 1000)), n3));
        }
    }
    
    private final void writeToH264StreamFromEncoder(final MediaCodec mediaCodec, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final MediaMuxer mediaMuxer) {
        int n;
        if ((n = mediaCodec.dequeueOutputBuffer(mediaCodec$BufferInfo, 10000L)) == -2) {
            mediaMuxer.addTrack(mediaCodec.getOutputFormat());
            mediaMuxer.start();
            return;
        }
        while (VideoDecoder.isMediaCodecBufferIndexValid(n)) {
            final ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(n);
            if (outputBuffer != null) {
                if ((mediaCodec$BufferInfo.flags & 0x2) == 0x0 && mediaCodec$BufferInfo.size != 0) {
                    outputBuffer.position(mediaCodec$BufferInfo.offset);
                    outputBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
                    mediaMuxer.writeSampleData(0, outputBuffer, mediaCodec$BufferInfo);
                }
                this.encoderOutputDone = ((mediaCodec$BufferInfo.flags & 0x4) != 0x0);
                mediaCodec.releaseOutputBuffer(n, false);
                n = mediaCodec.dequeueOutputBuffer(mediaCodec$BufferInfo, 10000L);
            }
        }
    }
    
    public final void cleanUpResources() {
        this.encoderInputDone = true;
        this.encoderOutputDone = true;
        this.decoderDone = true;
        this.noMoreFramesRequired = true;
        final MediaCodec encoder = this.encoder;
        if (encoder != null) {
            MediaCodecExtensionsKt.cleanUp(encoder);
            this.encoder = null;
        }
        final MediaCodec decoder = this.decoder;
        if (decoder != null) {
            MediaCodecExtensionsKt.cleanUp(decoder);
            this.decoder = null;
        }
        final MediaExtractor mediaExtractor = this.mediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mediaExtractor = null;
        }
    }
    
    public final File renderVideo(final RenderingConfig renderingConfig, ProgressListener progressListener) throws FileNotFoundException, RuntimeException, IOException, VideoTrackNotFoundException {
        e.f((Object)renderingConfig, "renderingConfig");
        this.renderingConfig = renderingConfig;
        this.progressListener = progressListener;
        this.resetState();
        final StringBuilder sb = new StringBuilder();
        final String videoFilePath = renderingConfig.getVideoFilePath();
        String i1;
        if (videoFilePath != null) {
            i1 = kotlin.text.b.i1(".mp4", videoFilePath);
        }
        else {
            i1 = null;
        }
        sb.append(i1);
        sb.append('-');
        sb.append(UUID.randomUUID());
        sb.append("-rendered.mp4");
        progressListener = (ProgressListener)new File(sb.toString());
        try {
            final EncoderContainer encoder$default = EncoderFactory.createEncoder$default(null, renderingConfig.getCompressionConfig(), 1, null);
            if (((File)progressListener).exists()) {
                ((File)progressListener).delete();
            }
            final File videoInputFile = this.getVideoInputFile(renderingConfig);
            try {
                final MediaExtractor mediaExtractor = new MediaExtractor();
                (this.mediaExtractor = mediaExtractor).setDataSource(videoInputFile.getPath());
                mediaExtractor.seekTo(renderingConfig.getRecordingOffsetMs() * 1000, 0);
                this.initEncoder(encoder$default, mediaExtractor, (File)progressListener, videoInputFile);
            }
            finally {
                this.cleanUpResources();
            }
        }
        catch (final Exception ex) {
            a.a.p((Throwable)ex);
        }
        return (File)progressListener;
    }
    
    @Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoRenderer$Companion;", "", "()V", "FRAME_DISTANCE_NS", "", "MAX_PROGRESS", "", "ONE_SECOND_MS", "ROTATION_180", "ROTATION_360", "ROTATION_90", "TIMEOUT_US", "VIDEO_MIME", "", "renderingInfo", "Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingInfo;", "getRenderingInfo", "()Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingInfo;", "setRenderingInfo", "(Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingInfo;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final RenderingInfo getRenderingInfo() {
            return VideoRenderer.access$getRenderingInfo$cp();
        }
        
        public final void setRenderingInfo(final RenderingInfo renderingInfo) {
            VideoRenderer.access$setRenderingInfo$cp(renderingInfo);
        }
    }
    
    @Metadata(d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\t\u00105\u001a\u00020\u0011H\u00c6\u0003J\u0081\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0001J\u0013\u00107\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\bH\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006;" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingConfig;", "", "videoFilePath", "", "recordingOffsetMs", "", "recordingDurationMs", "recordingOrientation", "", "currentPartNumber", "topOffsetPercentage", "", "watermarkBitmap", "Landroid/graphics/Bitmap;", "isReadjustFrames", "", "compressionConfig", "Lcom/reddit/video/creation/video/videocreator/CompressionConfig;", "videoFilter", "Lcom/reddit/video/creation/models/video/VideoFilter;", "bitmaps", "", "Lcom/reddit/video/creation/video/render/models/TextStickerData;", "(Ljava/lang/String;JJIIFLandroid/graphics/Bitmap;ZLcom/reddit/video/creation/video/videocreator/CompressionConfig;Lcom/reddit/video/creation/models/video/VideoFilter;Ljava/util/List;)V", "getBitmaps", "()Ljava/util/List;", "getCompressionConfig", "()Lcom/reddit/video/creation/video/videocreator/CompressionConfig;", "getCurrentPartNumber", "()I", "()Z", "getRecordingDurationMs", "()J", "getRecordingOffsetMs", "getRecordingOrientation", "getTopOffsetPercentage", "()F", "getVideoFilePath", "()Ljava/lang/String;", "getVideoFilter", "()Lcom/reddit/video/creation/models/video/VideoFilter;", "getWatermarkBitmap", "()Landroid/graphics/Bitmap;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class RenderingConfig
    {
        public static final int $stable = 8;
        private final List<TextStickerData> bitmaps;
        private final CompressionConfig compressionConfig;
        private final int currentPartNumber;
        private final boolean isReadjustFrames;
        private final long recordingDurationMs;
        private final long recordingOffsetMs;
        private final int recordingOrientation;
        private final float topOffsetPercentage;
        private final String videoFilePath;
        private final VideoFilter videoFilter;
        private final Bitmap watermarkBitmap;
        
        public RenderingConfig(final String videoFilePath, final long recordingOffsetMs, final long recordingDurationMs, final int recordingOrientation, final int currentPartNumber, final float topOffsetPercentage, final Bitmap watermarkBitmap, final boolean isReadjustFrames, final CompressionConfig compressionConfig, final VideoFilter videoFilter, final List<TextStickerData> bitmaps) {
            e.f((Object)compressionConfig, "compressionConfig");
            e.f((Object)videoFilter, "videoFilter");
            e.f((Object)bitmaps, "bitmaps");
            this.videoFilePath = videoFilePath;
            this.recordingOffsetMs = recordingOffsetMs;
            this.recordingDurationMs = recordingDurationMs;
            this.recordingOrientation = recordingOrientation;
            this.currentPartNumber = currentPartNumber;
            this.topOffsetPercentage = topOffsetPercentage;
            this.watermarkBitmap = watermarkBitmap;
            this.isReadjustFrames = isReadjustFrames;
            this.compressionConfig = compressionConfig;
            this.videoFilter = videoFilter;
            this.bitmaps = bitmaps;
        }
        
        public RenderingConfig(final String s, final long n, final long n2, final int n3, final int n4, final float n5, final Bitmap bitmap, final boolean b, final CompressionConfig compressionConfig, VideoFilter videoFilter, List instance, final int n6, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n6 & 0x200) != 0x0) {
                videoFilter = (VideoFilter)new NoVideoFilter();
            }
            if ((n6 & 0x400) != 0x0) {
                instance = EmptyList.INSTANCE;
            }
            this(s, n, n2, n3, n4, n5, bitmap, b, compressionConfig, videoFilter, (List<TextStickerData>)instance);
        }
        
        public final String component1() {
            return this.videoFilePath;
        }
        
        public final VideoFilter component10() {
            return this.videoFilter;
        }
        
        public final List<TextStickerData> component11() {
            return this.bitmaps;
        }
        
        public final long component2() {
            return this.recordingOffsetMs;
        }
        
        public final long component3() {
            return this.recordingDurationMs;
        }
        
        public final int component4() {
            return this.recordingOrientation;
        }
        
        public final int component5() {
            return this.currentPartNumber;
        }
        
        public final float component6() {
            return this.topOffsetPercentage;
        }
        
        public final Bitmap component7() {
            return this.watermarkBitmap;
        }
        
        public final boolean component8() {
            return this.isReadjustFrames;
        }
        
        public final CompressionConfig component9() {
            return this.compressionConfig;
        }
        
        public final RenderingConfig copy(final String s, final long n, final long n2, final int n3, final int n4, final float n5, final Bitmap bitmap, final boolean b, final CompressionConfig compressionConfig, final VideoFilter videoFilter, final List<TextStickerData> list) {
            e.f((Object)compressionConfig, "compressionConfig");
            e.f((Object)videoFilter, "videoFilter");
            e.f((Object)list, "bitmaps");
            return new RenderingConfig(s, n, n2, n3, n4, n5, bitmap, b, compressionConfig, videoFilter, list);
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
            return e.a((Object)this.videoFilePath, (Object)renderingConfig.videoFilePath) && this.recordingOffsetMs == renderingConfig.recordingOffsetMs && this.recordingDurationMs == renderingConfig.recordingDurationMs && this.recordingOrientation == renderingConfig.recordingOrientation && this.currentPartNumber == renderingConfig.currentPartNumber && e.a((Object)this.topOffsetPercentage, (Object)renderingConfig.topOffsetPercentage) && e.a((Object)this.watermarkBitmap, (Object)renderingConfig.watermarkBitmap) && this.isReadjustFrames == renderingConfig.isReadjustFrames && e.a((Object)this.compressionConfig, (Object)renderingConfig.compressionConfig) && e.a((Object)this.videoFilter, (Object)renderingConfig.videoFilter) && e.a((Object)this.bitmaps, (Object)renderingConfig.bitmaps);
        }
        
        public final List<TextStickerData> getBitmaps() {
            return this.bitmaps;
        }
        
        public final CompressionConfig getCompressionConfig() {
            return this.compressionConfig;
        }
        
        public final int getCurrentPartNumber() {
            return this.currentPartNumber;
        }
        
        public final long getRecordingDurationMs() {
            return this.recordingDurationMs;
        }
        
        public final long getRecordingOffsetMs() {
            return this.recordingOffsetMs;
        }
        
        public final int getRecordingOrientation() {
            return this.recordingOrientation;
        }
        
        public final float getTopOffsetPercentage() {
            return this.topOffsetPercentage;
        }
        
        public final String getVideoFilePath() {
            return this.videoFilePath;
        }
        
        public final VideoFilter getVideoFilter() {
            return this.videoFilter;
        }
        
        public final Bitmap getWatermarkBitmap() {
            return this.watermarkBitmap;
        }
        
        @Override
        public int hashCode() {
            final String videoFilePath = this.videoFilePath;
            final int n = 0;
            int hashCode;
            if (videoFilePath == null) {
                hashCode = 0;
            }
            else {
                hashCode = videoFilePath.hashCode();
            }
            final int d = d.d(this.topOffsetPercentage, a.c(this.currentPartNumber, a.c(this.recordingOrientation, b.b(this.recordingDurationMs, b.b(this.recordingOffsetMs, hashCode * 31, 31), 31), 31), 31), 31);
            final Bitmap watermarkBitmap = this.watermarkBitmap;
            int hashCode2;
            if (watermarkBitmap == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = watermarkBitmap.hashCode();
            }
            int isReadjustFrames;
            if ((isReadjustFrames = (this.isReadjustFrames ? 1 : 0)) != 0) {
                isReadjustFrames = 1;
            }
            return this.bitmaps.hashCode() + (this.videoFilter.hashCode() + (this.compressionConfig.hashCode() + ((d + hashCode2) * 31 + isReadjustFrames) * 31) * 31) * 31;
        }
        
        public final boolean isReadjustFrames() {
            return this.isReadjustFrames;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("RenderingConfig(videoFilePath=");
            r.append(this.videoFilePath);
            r.append(", recordingOffsetMs=");
            r.append(this.recordingOffsetMs);
            r.append(", recordingDurationMs=");
            r.append(this.recordingDurationMs);
            r.append(", recordingOrientation=");
            r.append(this.recordingOrientation);
            r.append(", currentPartNumber=");
            r.append(this.currentPartNumber);
            r.append(", topOffsetPercentage=");
            r.append(this.topOffsetPercentage);
            r.append(", watermarkBitmap=");
            r.append(this.watermarkBitmap);
            r.append(", isReadjustFrames=");
            r.append(this.isReadjustFrames);
            r.append(", compressionConfig=");
            r.append(this.compressionConfig);
            r.append(", videoFilter=");
            r.append(this.videoFilter);
            r.append(", bitmaps=");
            return d.o(r, (List)this.bitmaps, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010\u000eJV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006!" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingInfo;", "", "encoderName", "", "decoderName", "encoderProfile", "", "encoderProfileLevel", "encoderWidth", "encoderHeight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDecoderName", "()Ljava/lang/String;", "getEncoderHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEncoderName", "getEncoderProfile", "getEncoderProfileLevel", "getEncoderWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/reddit/video/creation/video/render/VideoRenderer$RenderingInfo;", "equals", "", "other", "hashCode", "toString", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class RenderingInfo
    {
        public static final int $stable = 0;
        private final String decoderName;
        private final Integer encoderHeight;
        private final String encoderName;
        private final Integer encoderProfile;
        private final Integer encoderProfileLevel;
        private final Integer encoderWidth;
        
        public RenderingInfo() {
            this(null, null, null, null, null, null, 63, null);
        }
        
        public RenderingInfo(final String encoderName, final String decoderName, final Integer encoderProfile, final Integer encoderProfileLevel, final Integer encoderWidth, final Integer encoderHeight) {
            this.encoderName = encoderName;
            this.decoderName = decoderName;
            this.encoderProfile = encoderProfile;
            this.encoderProfileLevel = encoderProfileLevel;
            this.encoderWidth = encoderWidth;
            this.encoderHeight = encoderHeight;
        }
        
        public static /* synthetic */ RenderingInfo copy$default(final RenderingInfo renderingInfo, String encoderName, String decoderName, Integer encoderProfile, Integer encoderProfileLevel, Integer encoderWidth, Integer encoderHeight, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                encoderName = renderingInfo.encoderName;
            }
            if ((n & 0x2) != 0x0) {
                decoderName = renderingInfo.decoderName;
            }
            if ((n & 0x4) != 0x0) {
                encoderProfile = renderingInfo.encoderProfile;
            }
            if ((n & 0x8) != 0x0) {
                encoderProfileLevel = renderingInfo.encoderProfileLevel;
            }
            if ((n & 0x10) != 0x0) {
                encoderWidth = renderingInfo.encoderWidth;
            }
            if ((n & 0x20) != 0x0) {
                encoderHeight = renderingInfo.encoderHeight;
            }
            return renderingInfo.copy(encoderName, decoderName, encoderProfile, encoderProfileLevel, encoderWidth, encoderHeight);
        }
        
        public final String component1() {
            return this.encoderName;
        }
        
        public final String component2() {
            return this.decoderName;
        }
        
        public final Integer component3() {
            return this.encoderProfile;
        }
        
        public final Integer component4() {
            return this.encoderProfileLevel;
        }
        
        public final Integer component5() {
            return this.encoderWidth;
        }
        
        public final Integer component6() {
            return this.encoderHeight;
        }
        
        public final RenderingInfo copy(final String s, final String s2, final Integer n, final Integer n2, final Integer n3, final Integer n4) {
            return new RenderingInfo(s, s2, n, n2, n3, n4);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof RenderingInfo)) {
                return false;
            }
            final RenderingInfo renderingInfo = (RenderingInfo)o;
            return e.a((Object)this.encoderName, (Object)renderingInfo.encoderName) && e.a((Object)this.decoderName, (Object)renderingInfo.decoderName) && e.a((Object)this.encoderProfile, (Object)renderingInfo.encoderProfile) && e.a((Object)this.encoderProfileLevel, (Object)renderingInfo.encoderProfileLevel) && e.a((Object)this.encoderWidth, (Object)renderingInfo.encoderWidth) && e.a((Object)this.encoderHeight, (Object)renderingInfo.encoderHeight);
        }
        
        public final String getDecoderName() {
            return this.decoderName;
        }
        
        public final Integer getEncoderHeight() {
            return this.encoderHeight;
        }
        
        public final String getEncoderName() {
            return this.encoderName;
        }
        
        public final Integer getEncoderProfile() {
            return this.encoderProfile;
        }
        
        public final Integer getEncoderProfileLevel() {
            return this.encoderProfileLevel;
        }
        
        public final Integer getEncoderWidth() {
            return this.encoderWidth;
        }
        
        @Override
        public int hashCode() {
            final String encoderName = this.encoderName;
            int hashCode = 0;
            int hashCode2;
            if (encoderName == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = encoderName.hashCode();
            }
            final String decoderName = this.decoderName;
            int hashCode3;
            if (decoderName == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = decoderName.hashCode();
            }
            final Integer encoderProfile = this.encoderProfile;
            int hashCode4;
            if (encoderProfile == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = encoderProfile.hashCode();
            }
            final Integer encoderProfileLevel = this.encoderProfileLevel;
            int hashCode5;
            if (encoderProfileLevel == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = encoderProfileLevel.hashCode();
            }
            final Integer encoderWidth = this.encoderWidth;
            int hashCode6;
            if (encoderWidth == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = encoderWidth.hashCode();
            }
            final Integer encoderHeight = this.encoderHeight;
            if (encoderHeight != null) {
                hashCode = encoderHeight.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("RenderingInfo(encoderName=");
            r.append(this.encoderName);
            r.append(", decoderName=");
            r.append(this.decoderName);
            r.append(", encoderProfile=");
            r.append(this.encoderProfile);
            r.append(", encoderProfileLevel=");
            r.append(this.encoderProfileLevel);
            r.append(", encoderWidth=");
            r.append(this.encoderWidth);
            r.append(", encoderHeight=");
            return aw.b.i(r, this.encoderHeight, ')');
        }
    }
}
