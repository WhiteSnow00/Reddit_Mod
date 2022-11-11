// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.view.Surface;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec$CryptoInfo;
import al0.b;
import al0.a;
import android.util.Range;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.util.Log;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.nio.ByteBuffer;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import java.util.Set;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;

class MediaCodecDecoder implements MediaDecoder, VideoRenderer$SurfaceChangeListener
{
    private static final long DEQUE_TIMEOUT_US;
    private static final Size SIZE_1080P;
    private static final Size SIZE_1088P;
    private static final Size SIZE_2160P;
    private MediaCodec codec;
    private String codecName;
    private boolean configured;
    private MediaCodec$BufferInfo decodeInfo;
    private final Set<Long> decodeOnlyBuffers;
    private MediaFormat format;
    private boolean hasSurface;
    private long initialSampleTime;
    private int inputBufferIndex;
    private boolean isVideo;
    private Size maxDecodeSize;
    private MediaCrypto mediaCrypto;
    private ByteBuffer outputBuffer;
    private boolean outputBufferEnabled;
    private int outputBufferIndex;
    private int queuedBufferCount;
    private boolean reconfigureRetry;
    private long reconfigureRetryTimeMillis;
    private final MediaRenderer renderer;
    private boolean rendererConfigured;
    private boolean runOnEmulator;
    private boolean supportsAdaptivePlayback;
    private boolean useSoftwareDecoder;
    
    static {
        SIZE_1080P = new Size(1920, 1080);
        SIZE_1088P = new Size(1920, 1088);
        SIZE_2160P = new Size(3840, 2160);
        DEQUE_TIMEOUT_US = TimeUnit.MILLISECONDS.toMicros(5L);
    }
    
    public MediaCodecDecoder(final MediaFormat format, final MediaRenderer renderer) {
        this.renderer = renderer;
        this.format = format;
        this.decodeOnlyBuffers = new LinkedHashSet<Long>();
        this.resetDecodeInfo();
        if (renderer == null) {
            this.outputBufferEnabled = true;
        }
    }
    
    public MediaCodecDecoder(final MediaFormat mediaFormat, final SurfaceRenderer surfaceRenderer) {
        this(mediaFormat, (MediaRenderer)surfaceRenderer);
        final boolean b = true;
        this.isVideo = true;
        this.maxDecodeSize = MediaCodecDecoder.SIZE_1080P;
        final String model = Build.MODEL;
        boolean runOnEmulator = b;
        if (!model.startsWith("sdk")) {
            runOnEmulator = b;
            if (!"google_sdk".equals(model)) {
                runOnEmulator = b;
                if (!model.contains("Emulator")) {
                    runOnEmulator = (model.contains("Android SDK") && b);
                }
            }
        }
        this.runOnEmulator = runOnEmulator;
        surfaceRenderer.setSurfaceChangeListener((VideoRenderer$SurfaceChangeListener)this);
    }
    
    private void checkCodecCapabilities(final String s) {
        if (this.isVideo) {
            this.maxDecodeSize = MediaCodecDecoder.SIZE_1080P;
        }
        final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities = null;
        MediaCodecInfo$CodecCapabilities capabilitiesForType;
        try {
            capabilitiesForType = this.codec.getCodecInfo().getCapabilitiesForType(s);
        }
        catch (final IllegalArgumentException ex) {
            Log.e("AmazonIVS", "Failed to get codec capabilities", (Throwable)ex);
            capabilitiesForType = mediaCodecInfo$CodecCapabilities;
        }
        if (capabilitiesForType != null && this.isVideo) {
            this.supportsAdaptivePlayback = capabilitiesForType.isFeatureSupported("adaptive-playback");
            final MediaCodecInfo$VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            final Range supportedWidths = videoCapabilities.getSupportedWidths();
            final Size size_2160P = MediaCodecDecoder.SIZE_2160P;
            if (supportedWidths.contains((Comparable)size_2160P.width) && videoCapabilities.getSupportedHeightsFor(size_2160P.width).contains((Comparable)size_2160P.height)) {
                this.maxDecodeSize = size_2160P;
            }
        }
        if (this.isVideo && MediaCodecFactory.limitMaxDecodeSize(this.codec.getName())) {
            this.maxDecodeSize = MediaCodecDecoder.SIZE_1088P;
        }
    }
    
    private void configureRenderer(final MediaFormat mediaFormat) {
        final MediaRenderer renderer = this.renderer;
        if (renderer != null) {
            renderer.configure(mediaFormat);
            this.rendererConfigured = true;
        }
    }
    
    private void createCodec() {
        final String string = this.format.getString("mime");
        final MediaCrypto mediaCrypto = this.mediaCrypto;
        final boolean b = mediaCrypto != null && mediaCrypto.requiresSecureDecoderComponent(string);
        if (this.isVideo && this.useSoftwareDecoder && !b) {
            this.codec = MediaCodecFactory.createSoftwareCodec(string);
        }
        else {
            this.codec = MediaCodecFactory.createCodec(string, b);
        }
        final MediaCodec codec = this.codec;
        if (codec != null) {
            this.codecName = codec.getName();
            final StringBuilder p = a.p("decode ", string, " using ");
            p.append(this.codecName);
            Log.i("AmazonIVS", p.toString());
            this.checkCodecCapabilities(string);
            return;
        }
        throw new IllegalStateException(al0.b.h("Failed to create codec instance ", string));
    }
    
    private boolean dequeOutput(long n) {
        final int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.decodeInfo, n);
        this.outputBufferIndex = dequeueOutputBuffer;
        boolean b = false;
        if (dequeueOutputBuffer >= 0) {
            --this.queuedBufferCount;
            final MediaCodec$BufferInfo decodeInfo = this.decodeInfo;
            if ((decodeInfo.flags & 0x4) != 0x0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.codecName);
                sb.append(" BUFFER_FLAG_END_OF_STREAM");
                Log.d("AmazonIVS", sb.toString());
                this.resetCodec();
                return false;
            }
            n = this.initialSampleTime + decodeInfo.presentationTimeUs;
            final boolean b2 = this.decodeOnlyBuffers.contains(n) ^ true;
            if (this.isVideo) {
                if (b2 && this.renderer != null) {
                    if (!this.rendererConfigured) {
                        try {
                            this.configureRenderer(this.codec.getOutputFormat(this.outputBufferIndex));
                        }
                        catch (final IllegalStateException ex) {
                            Log.d("AmazonIVS", "Failed to get output format", (Throwable)ex);
                            this.rendererConfigured = true;
                            this.configureRenderer(this.format);
                        }
                    }
                    ((VideoRenderer)this.renderer).render(this.codec, this.outputBufferIndex, n);
                    if (this.inputBufferIndex < 0) {
                        b = true;
                    }
                    return b;
                }
                this.codec.releaseOutputBuffer(this.outputBufferIndex, false);
            }
            else {
                if (this.outputBufferEnabled) {
                    return true;
                }
                final ByteBuffer outputBuffer = this.codec.getOutputBuffer(this.outputBufferIndex);
                if (b2) {
                    final MediaRenderer renderer = this.renderer;
                    if (renderer != null && this.rendererConfigured) {
                        renderer.render(outputBuffer, this.decodeInfo.size, n);
                    }
                }
                this.codec.releaseOutputBuffer(this.outputBufferIndex, false);
            }
        }
        else {
            if (dequeueOutputBuffer == -2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.codecName);
                sb2.append(" INFO_OUTPUT_FORMAT_CHANGED");
                Log.d("AmazonIVS", sb2.toString());
                this.configureRenderer(this.codec.getOutputFormat());
                return true;
            }
            if (dequeueOutputBuffer == -3) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(this.codecName);
                sb3.append(" INFO_OUTPUT_BUFFERS_CHANGED");
                Log.d("AmazonIVS", sb3.toString());
                return true;
            }
        }
        return false;
    }
    
    private void queueInput(final int n, final MediaSample mediaSample) {
        this.codec.getInputBuffer(n).put(mediaSample.buffer);
        final long n2 = mediaSample.presentationTimeUs - this.initialSampleTime;
        final int isSyncSample = mediaSample.isSyncSample ? 1 : 0;
        final MediaCodec$CryptoInfo cryptoInfo = mediaSample.cryptoInfo;
        if (cryptoInfo == null) {
            this.codec.queueInputBuffer(n, 0, mediaSample.size, n2, isSyncSample);
        }
        else {
            this.codec.queueSecureInputBuffer(n, 0, cryptoInfo, n2, isSyncSample);
        }
        ++this.queuedBufferCount;
        if (mediaSample.isDecodeOnly) {
            this.decodeOnlyBuffers.add(mediaSample.presentationTimeUs);
        }
    }
    
    private void reconfigure() {
        this.resetCodec();
        if (this.supportsAdaptivePlayback && this.isVideo && !this.runOnEmulator) {
            this.format.setInteger("max-width", this.maxDecodeSize.width);
            this.format.setInteger("max-height", this.maxDecodeSize.height);
        }
        try {
            Surface surface;
            if (this.isVideo) {
                surface = ((VideoRenderer)this.renderer).getSurface();
            }
            else {
                surface = null;
            }
            this.codec.configure(this.format, surface, this.mediaCrypto, 0);
            this.hasSurface = (surface != null);
            final StringBuilder sb = new StringBuilder();
            sb.append("configured ");
            sb.append(this.codecName);
            sb.append(" format ");
            sb.append(this.format);
            Log.i("AmazonIVS", sb.toString());
            this.codec.start();
            this.configured = true;
        }
        catch (final Exception ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.codecName);
            sb2.append(" configure failed");
            Log.w("AmazonIVS", sb2.toString(), (Throwable)ex);
            if (!this.isVideo) {
                throw ex;
            }
            this.releaseCodec();
            if (!this.useSoftwareDecoder && ex instanceof MediaCodec$CodecException) {
                this.useSoftwareDecoder = (((MediaCodec$CodecException)ex).getErrorCode() == 1100);
            }
            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.reconfigureRetryTimeMillis > 60000L) {
                this.reconfigureRetry = false;
                this.reconfigureRetryTimeMillis = currentTimeMillis;
            }
            if (!this.reconfigureRetry) {
                this.reconfigureRetry = true;
                this.createCodec();
                this.reconfigure();
                return;
            }
            final StringBuilder r = a.r("codecName:");
            r.append(this.codecName);
            r.append(" surface: ");
            r.append(this.hasSurface);
            r.append(" maxDecodeSize:");
            r.append(this.maxDecodeSize.toString());
            r.append(" sap:");
            r.append(this.supportsAdaptivePlayback);
            r.append(" format:");
            r.append(this.format.toString());
            r.append(" e:");
            r.append(ex);
            throw new IllegalArgumentException(r.toString());
        }
    }
    
    private void releaseCodec() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/amazonaws/ivs/player/MediaCodecDecoder.resetDecodeInfo:()V
        //     4: aload_0        
        //     5: getfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          156
        //    13: aload_0        
        //    14: getfield        com/amazonaws/ivs/player/MediaCodecDecoder.configured:Z
        //    17: ifeq            24
        //    20: aload_1        
        //    21: invokevirtual   android/media/MediaCodec.stop:()V
        //    24: aload_0        
        //    25: getfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //    28: invokevirtual   android/media/MediaCodec.release:()V
        //    31: aload_0        
        //    32: aconst_null    
        //    33: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //    36: goto            156
        //    39: astore_1       
        //    40: goto            57
        //    43: astore_1       
        //    44: ldc             "AmazonIVS"
        //    46: ldc_w           "Codec release() failed"
        //    49: aload_1        
        //    50: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    53: pop            
        //    54: goto            31
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //    62: aload_1        
        //    63: athrow         
        //    64: astore_1       
        //    65: goto            114
        //    68: astore_1       
        //    69: ldc             "AmazonIVS"
        //    71: ldc_w           "Codec stop() failed"
        //    74: aload_1        
        //    75: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    78: pop            
        //    79: aload_0        
        //    80: getfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //    83: invokevirtual   android/media/MediaCodec.release:()V
        //    86: goto            31
        //    89: astore_1       
        //    90: goto            107
        //    93: astore_1       
        //    94: ldc             "AmazonIVS"
        //    96: ldc_w           "Codec release() failed"
        //    99: aload_1        
        //   100: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   103: pop            
        //   104: goto            31
        //   107: aload_0        
        //   108: aconst_null    
        //   109: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //   112: aload_1        
        //   113: athrow         
        //   114: aload_0        
        //   115: getfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //   118: invokevirtual   android/media/MediaCodec.release:()V
        //   121: aload_0        
        //   122: aconst_null    
        //   123: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //   126: goto            147
        //   129: astore_1       
        //   130: goto            149
        //   133: astore_2       
        //   134: ldc             "AmazonIVS"
        //   136: ldc_w           "Codec release() failed"
        //   139: aload_2        
        //   140: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   143: pop            
        //   144: goto            121
        //   147: aload_1        
        //   148: athrow         
        //   149: aload_0        
        //   150: aconst_null    
        //   151: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.codec:Landroid/media/MediaCodec;
        //   154: aload_1        
        //   155: athrow         
        //   156: aload_0        
        //   157: iconst_0       
        //   158: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.configured:Z
        //   161: aload_0        
        //   162: iconst_0       
        //   163: putfield        com/amazonaws/ivs/player/MediaCodecDecoder.hasSurface:Z
        //   166: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  13     24     68     114    Ljava/lang/Exception;
        //  13     24     64     156    Any
        //  24     31     43     57     Ljava/lang/Exception;
        //  24     31     39     43     Any
        //  44     54     39     43     Any
        //  69     79     64     156    Any
        //  79     86     93     107    Ljava/lang/Exception;
        //  79     86     89     93     Any
        //  94     104    89     93     Any
        //  114    121    133    147    Ljava/lang/Exception;
        //  114    121    129    133    Any
        //  134    144    129    133    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 89, Size: 89
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void resetCodec() {
        final MediaCodec codec = this.codec;
        if (codec != null) {
            codec.reset();
        }
        this.configured = false;
        this.hasSurface = false;
    }
    
    private void resetDecodeInfo() {
        this.decodeOnlyBuffers.clear();
        this.decodeInfo = new MediaCodec$BufferInfo();
        this.queuedBufferCount = 0;
        this.inputBufferIndex = -1;
        this.outputBufferIndex = -1;
    }
    
    public void configure(final MediaFormat format) {
        this.format = format;
        final DrmSession value = DrmSession.get(format);
        MediaCrypto mediaCrypto;
        if (value == null) {
            mediaCrypto = null;
        }
        else {
            mediaCrypto = value.getMediaCrypto(format);
        }
        if (this.mediaCrypto != mediaCrypto) {
            this.mediaCrypto = mediaCrypto;
            this.releaseCodec();
        }
        if (this.codec == null) {
            this.createCodec();
        }
        if (!this.configured || this.runOnEmulator) {
            this.reconfigure();
        }
    }
    
    public void decode(final MediaSample mediaSample) {
        if (this.initialSampleTime <= 0L) {
            this.initialSampleTime = mediaSample.decodeTimeUs;
        }
        if (this.isVideo) {
            final VideoRenderer videoRenderer = (VideoRenderer)this.renderer;
            if (!this.configured) {
                if (!mediaSample.isSyncSample || videoRenderer.getSurface() == null) {
                    this.configured = false;
                    return;
                }
                Log.w("AmazonIVS", "MediaCodecDecoder switching surface");
                this.releaseCodec();
                this.createCodec();
                this.reconfigure();
                ((MediaRenderer)videoRenderer).configure(this.format);
                try {
                    this.inputBufferIndex = this.codec.dequeueInputBuffer(-1L);
                }
                catch (final Exception ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.codecName);
                    sb.append(" MediaCodecDecoder dequeueInputBuffer failed");
                    Log.w("AmazonIVS", sb.toString(), (Throwable)ex);
                    this.resetCodec();
                }
            }
        }
        final int inputBufferIndex = this.inputBufferIndex;
        if (inputBufferIndex >= 0) {
            try {
                this.queueInput(inputBufferIndex, mediaSample);
            }
            catch (final Exception ex2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.codecName);
                sb2.append(" MediaCodecDecoder queueInput failed");
                Log.w("AmazonIVS", sb2.toString(), (Throwable)ex2);
                this.resetCodec();
            }
            this.inputBufferIndex = -1;
            return;
        }
        throw new PlayerException(ErrorType.ERROR_INVALID_PARAMETER, "invalid buffer index");
    }
    
    public void flush() {
        if (this.codec != null) {
            if (this.configured) {
                if (!this.supportsAdaptivePlayback) {
                    if (this.queuedBufferCount == 0) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.codecName);
                        sb.append(" no buffers queued on flush");
                        Log.w("AmazonIVS", sb.toString());
                        this.resetCodec();
                        return;
                    }
                    int i = -1;
                    while (i < 0) {
                        i = this.codec.dequeueInputBuffer(MediaCodecDecoder.DEQUE_TIMEOUT_US);
                        if (i < 0) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.codecName);
                            sb2.append(" wait to queue EOS");
                            Log.w("AmazonIVS", sb2.toString());
                            this.dequeOutput(0L);
                        }
                        else {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.codecName);
                            sb3.append(" queue BUFFER_FLAG_END_OF_STREAM");
                            Log.i("AmazonIVS", sb3.toString());
                            this.codec.queueInputBuffer(i, 0, 0, 0L, 4);
                        }
                    }
                    while (this.configured) {
                        this.dequeOutput(0L);
                    }
                }
            }
        }
    }
    
    public ByteBuffer getOutput() {
        if (this.outputBufferEnabled) {
            final int outputBufferIndex = this.outputBufferIndex;
            if (outputBufferIndex >= 0) {
                final ByteBuffer outputBuffer = this.codec.getOutputBuffer(outputBufferIndex);
                final ByteBuffer outputBuffer2 = this.outputBuffer;
                if (outputBuffer2 == null || outputBuffer2.capacity() < outputBuffer.capacity()) {
                    this.outputBuffer = ByteBuffer.allocateDirect(outputBuffer.capacity());
                }
                this.outputBuffer.clear();
                this.outputBuffer.put(outputBuffer).flip().limit(this.decodeInfo.size);
                this.codec.releaseOutputBuffer(this.outputBufferIndex, false);
                this.outputBufferIndex = -1;
                return this.outputBuffer;
            }
        }
        return null;
    }
    
    public long getOutputTime() {
        return this.initialSampleTime + this.decodeInfo.presentationTimeUs;
    }
    
    public boolean hasInput() {
        final boolean isVideo = this.isVideo;
        boolean b = true;
        if (isVideo && !this.configured) {
            return true;
        }
        if (this.configured) {
            final MediaCodec codec = this.codec;
            if (codec != null) {
                try {
                    long deque_TIMEOUT_US;
                    if (this.queuedBufferCount > 0) {
                        deque_TIMEOUT_US = MediaCodecDecoder.DEQUE_TIMEOUT_US;
                    }
                    else {
                        deque_TIMEOUT_US = 0L;
                    }
                    this.inputBufferIndex = codec.dequeueInputBuffer(deque_TIMEOUT_US);
                }
                catch (final IllegalStateException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.codecName);
                    sb.append(" MediaCodecDecoder dequeueInputBuffer failed");
                    Log.w("AmazonIVS", sb.toString(), (Throwable)ex);
                    this.resetCodec();
                }
                if (this.inputBufferIndex < 0) {
                    b = false;
                }
                return b;
            }
        }
        return false;
    }
    
    public boolean hasOutput() {
        boolean b = false;
        try {
            if (this.configured) {
                final boolean dequeOutput = this.dequeOutput(0L);
                b = b;
                if (dequeOutput) {
                    b = true;
                }
            }
            return b;
        }
        catch (final IllegalStateException ex) {
            ex.printStackTrace();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.codecName);
            sb.append(" MediaCodecDecoder dequeOutput failed");
            Log.w("AmazonIVS", sb.toString(), (Throwable)ex);
            return false;
        }
    }
    
    public void onSurfaceChange(final Surface outputSurface) {
        if (this.configured) {
            final MediaCodec codec = this.codec;
            if (codec != null) {
                if (this.hasSurface && outputSurface != null) {
                    codec.setOutputSurface(outputSurface);
                }
                else {
                    this.releaseCodec();
                }
            }
        }
    }
    
    public void release() {
        this.releaseCodec();
    }
    
    public void reset() {
        this.initialSampleTime = 0L;
        this.resetDecodeInfo();
        final MediaCodec codec = this.codec;
        if (codec != null && this.configured) {
            if (!this.supportsAdaptivePlayback) {
                this.resetCodec();
            }
            else {
                try {
                    codec.flush();
                }
                catch (final IllegalStateException ex) {
                    ex.printStackTrace();
                    this.resetCodec();
                }
            }
        }
    }
}
