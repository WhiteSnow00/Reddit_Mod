// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.encoder;

import android.media.MediaCodecInfo$VideoCapabilities;
import java.io.IOException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.media.MediaCodecInfo;
import bj2.g$a;
import rg2.l;
import bj2.k;
import kotlin.collections.b;
import android.media.MediaCodecList;
import java.util.ArrayList;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.util.Size;
import sg2.e;
import com.reddit.video.creation.video.videocreator.CompressionConfig;
import su2.a;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u001e" }, d2 = { "Lcom/reddit/video/creation/video/render/encoder/EncoderFactory;", "", "()V", "checkIfCanBeInitialized", "", "encoder", "Landroid/media/MediaCodec;", "mediaFormat", "Landroid/media/MediaFormat;", "clampDimensionsPreservingRatios", "Landroid/util/Size;", "capabilities", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "size", "createEncoder", "Lcom/reddit/video/creation/video/render/encoder/EncoderContainer;", "mime", "", "compressionConfig", "Lcom/reddit/video/creation/video/videocreator/CompressionConfig;", "createEncoderContainerByName", "encoderName", "createEncoderContainerByType", "createVideoFormat", "getEncoderFromSupportedConfigs", "clampDimensions", "getEncoderMediaCodec", "getEncoderName", "getProfile", "Landroid/media/MediaCodecInfo$CodecProfileLevel;", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EncoderFactory
{
    public static final int $stable = 0;
    public static final EncoderFactory INSTANCE;
    
    static {
        INSTANCE = new EncoderFactory();
    }
    
    private EncoderFactory() {
    }
    
    private final boolean checkIfCanBeInitialized(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        try {
            mediaCodec.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 1);
            mediaCodec.release();
            return true;
        }
        catch (final Exception ex) {
            a.a.p((Throwable)ex);
            return false;
        }
    }
    
    public static final EncoderContainer createEncoder(final CompressionConfig compressionConfig) {
        e.f((Object)compressionConfig, "compressionConfig");
        return createEncoder$default(null, compressionConfig, 1, null);
    }
    
    public static final EncoderContainer createEncoder(final String s, final CompressionConfig compressionConfig) {
        e.f((Object)s, "mime");
        e.f((Object)compressionConfig, "compressionConfig");
        final Size size = compressionConfig.getSize();
        final MediaFormat videoFormat = MediaFormat.createVideoFormat(s, size.getWidth(), size.getHeight());
        e.e((Object)videoFormat, "createVideoFormat(mime, size.width, size.height)");
        final EncoderFactory instance = EncoderFactory.INSTANCE;
        String encoderName = instance.getEncoderName(videoFormat);
        final boolean b = encoderName == null;
        Label_0098: {
            if (encoderName != null) {
                final MediaCodec byCodecName = MediaCodec.createByCodecName(encoderName);
                e.e((Object)byCodecName, "createByCodecName(it)");
                if (instance.checkIfCanBeInitialized(byCodecName, instance.createVideoFormat(s, compressionConfig, byCodecName))) {
                    break Label_0098;
                }
            }
            encoderName = null;
        }
        if (encoderName == null) {
            final EncoderContainer encoderFromSupportedConfigs = instance.getEncoderFromSupportedConfigs(s, compressionConfig, b);
            EncoderContainer encoderFromSupportedConfigs2;
            if ((encoderFromSupportedConfigs2 = encoderFromSupportedConfigs) == null) {
                encoderFromSupportedConfigs2 = encoderFromSupportedConfigs;
                if (!b) {
                    encoderFromSupportedConfigs2 = instance.getEncoderFromSupportedConfigs(s, compressionConfig, b);
                }
            }
            if (encoderFromSupportedConfigs2 != null) {
                return encoderFromSupportedConfigs2;
            }
        }
        EncoderContainer encoderContainer;
        if (encoderName != null) {
            encoderContainer = instance.createEncoderContainerByName(s, encoderName, compressionConfig);
        }
        else {
            encoderContainer = instance.createEncoderContainerByType(s, compressionConfig);
        }
        return encoderContainer;
    }
    
    public static /* synthetic */ EncoderContainer createEncoder$default(String s, final CompressionConfig compressionConfig, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            s = "video/avc";
        }
        return createEncoder(s, compressionConfig);
    }
    
    private final EncoderContainer createEncoderContainerByName(final String s, final String s2, final CompressionConfig compressionConfig) {
        final MediaCodec encoderMediaCodec = this.getEncoderMediaCodec(s2);
        EncoderContainer encoderContainerByType;
        if (encoderMediaCodec != null) {
            encoderContainerByType = new EncoderContainer(encoderMediaCodec, this.createVideoFormat(s, compressionConfig, encoderMediaCodec));
        }
        else {
            encoderContainerByType = this.createEncoderContainerByType(s, compressionConfig);
        }
        return encoderContainerByType;
    }
    
    private final EncoderContainer createEncoderContainerByType(final String s, final CompressionConfig compressionConfig) {
        final MediaCodec encoderByType = MediaCodec.createEncoderByType(s);
        e.e((Object)encoderByType, "createEncoderByType(mime)");
        return new EncoderContainer(encoderByType, this.createVideoFormat(s, compressionConfig, encoderByType));
    }
    
    private final MediaFormat createVideoFormat(final String s, final CompressionConfig compressionConfig, final MediaCodec mediaCodec) {
        final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(s);
        e.e((Object)capabilitiesForType, "encoder.codecInfo.getCapabilitiesForType(mime)");
        Size size2;
        final Size size = size2 = this.clampDimensionsPreservingRatios(capabilitiesForType, compressionConfig.getSize());
        if (size.getWidth() >= compressionConfig.getSize().getWidth()) {
            if (size.getHeight() < compressionConfig.getSize().getHeight()) {
                size2 = size;
            }
            else {
                size2 = compressionConfig.getSize();
            }
        }
        final MediaFormat videoFormat = MediaFormat.createVideoFormat(s, size2.getWidth(), size2.getHeight());
        e.e((Object)videoFormat, "createVideoFormat(mime, size.width, size.height)");
        videoFormat.setInteger("color-format", 2130708361);
        videoFormat.setInteger("bitrate", compressionConfig.getKeyBitRate());
        videoFormat.setInteger("frame-rate", compressionConfig.getFrameRate());
        final MediaCodecInfo$CodecProfileLevel profile = EncoderFactory.INSTANCE.getProfile(mediaCodec, s);
        if (profile != null) {
            try {
                videoFormat.setInteger("level", profile.level);
                videoFormat.setInteger("profile", profile.profile);
            }
            finally {
                final Throwable t;
                a.a.p(t);
            }
        }
        videoFormat.setInteger("i-frame-interval", compressionConfig.getIFrameRateInterval());
        return videoFormat;
    }
    
    private final EncoderContainer getEncoderFromSupportedConfigs(String s, CompressionConfig compressionConfig, boolean hasNext) {
        Object next = new ArrayList<EncoderInfo>();
        final MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        e.e((Object)codecInfos, "MediaCodecList(MediaCode\u2026EGULAR_CODECS).codecInfos");
        g$a g$a = new g$a(kotlin.sequences.b.j1((k)kotlin.sequences.b.l1((k)b.R0(codecInfos)), (l)EncoderFactory$getEncoderFromSupportedConfigs$1.INSTANCE));
    Block_6_Outer:
        while (true) {
            Label_0201: {
                if (!g$a.hasNext()) {
                    break Label_0201;
                }
                final MediaCodecInfo mediaCodecInfo = (MediaCodecInfo)g$a.next();
                try {
                    final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(s);
                    CompressionConfig copy$default;
                    if (hasNext) {
                        final EncoderFactory instance = EncoderFactory.INSTANCE;
                        e.e((Object)capabilitiesForType, "capabilities");
                        copy$default = CompressionConfig.copy$default(compressionConfig, 0, 0, 0, instance.clampDimensionsPreservingRatios(capabilitiesForType, compressionConfig.getSize()), 7, (Object)null);
                    }
                    else {
                        copy$default = compressionConfig;
                    }
                    final EncoderFactory instance2 = EncoderFactory.INSTANCE;
                    final String name = mediaCodecInfo.getName();
                    e.e((Object)name, "codecInfo.name");
                    final MediaCodec encoderMediaCodec = instance2.getEncoderMediaCodec(name);
                    if (encoderMediaCodec != null) {
                        final String name2 = mediaCodecInfo.getName();
                        e.e((Object)name2, "codecInfo.name");
                        ((ArrayList<EncoderInfo>)next).add(new EncoderInfo(name2, instance2.createVideoFormat(s, copy$default, encoderMediaCodec)));
                        continue Block_6_Outer;
                    }
                    continue Block_6_Outer;
                    String s2 = null;
                    int integer = 0;
                    int integer2;
                    int n;
                    Label_0330_Outer:Label_0273_Outer:Label_0316_Outer:
                    while (true) {
                        s = null;
                        while (true) {
                        Block_8:
                            while (true) {
                                while (true) {
                                    compressionConfig = (CompressionConfig)s;
                                    s = s2;
                                    iftrue(Label_0370:)(compressionConfig == null);
                                    Block_7: {
                                        Block_9: {
                                            break Block_9;
                                            next = g$a.next();
                                            integer = ((EncoderInfo)next).getFormat().getInteger("width");
                                            n = integer2;
                                            s = (String)compressionConfig;
                                            iftrue(Label_0316:)(integer2 >= integer);
                                            break Block_8;
                                            integer2 = n;
                                            compressionConfig = (CompressionConfig)s;
                                            iftrue(Label_0273:)(g$a.hasNext());
                                            continue Label_0273_Outer;
                                            Label_0239: {
                                                s = (String)g$a.next();
                                            }
                                            iftrue(Label_0256:)(g$a.hasNext());
                                            break Block_7;
                                        }
                                        s = (String)MediaCodec.createByCodecName(((EncoderInfo)compressionConfig).getName());
                                        e.e((Object)s, "createByCodecName(encoderInfo.name)");
                                        s = (String)new EncoderContainer((MediaCodec)s, ((EncoderInfo)compressionConfig).getFormat());
                                        return (EncoderContainer)s;
                                    }
                                    continue Label_0273_Outer;
                                }
                                Label_0256: {
                                    integer2 = ((EncoderInfo)s).getFormat().getInteger("width");
                                }
                                compressionConfig = (CompressionConfig)s;
                                continue Label_0316_Outer;
                            }
                            s = (String)next;
                            n = integer;
                            continue;
                        }
                        g$a = new g$a(kotlin.sequences.b.j1((k)CollectionsKt___CollectionsKt.q3((Iterable)next), (l)EncoderFactory$getEncoderFromSupportedConfigs$3.INSTANCE));
                        hasNext = g$a.hasNext();
                        s2 = null;
                        iftrue(Label_0239:)(hasNext);
                        continue Label_0330_Outer;
                    }
                    Label_0370: {
                        return (EncoderContainer)s;
                    }
                }
                catch (final IllegalArgumentException ex) {}
            }
        }
    }
    
    private final MediaCodec getEncoderMediaCodec(final String s) {
        try {
            return MediaCodec.createByCodecName(s);
        }
        catch (final IllegalArgumentException ex) {
            a.a.p((Throwable)ex);
        }
        catch (final IOException ex2) {
            a.a.p((Throwable)ex2);
        }
        return null;
    }
    
    private final String getEncoderName(final MediaFormat mediaFormat) {
        final MediaCodecList list = new MediaCodecList(0);
        try {
            return list.findEncoderForFormat(mediaFormat);
        }
        catch (final NullPointerException ex) {
            a.a.p((Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            a.a.p((Throwable)ex2);
        }
        return null;
    }
    
    private final MediaCodecInfo$CodecProfileLevel getProfile(final MediaCodec mediaCodec, final String s) {
        MediaCodecInfo$CodecProfileLevel[] profileLevels = mediaCodec.getCodecInfo().getCapabilitiesForType(s).profileLevels;
        final boolean b = profileLevels == null || profileLevels.length == 0;
        final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel = null;
        if (!(b ^ true)) {
            profileLevels = null;
        }
        MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel2 = mediaCodecInfo$CodecProfileLevel;
        if (profileLevels != null) {
            int n = profileLevels.length - 1;
            mediaCodecInfo$CodecProfileLevel2 = mediaCodecInfo$CodecProfileLevel;
            if (n >= 0) {
                while (true) {
                    final int n2 = n - 1;
                    mediaCodecInfo$CodecProfileLevel2 = profileLevels[n];
                    if (mediaCodecInfo$CodecProfileLevel2.profile <= 8) {
                        break;
                    }
                    if (n2 < 0) {
                        mediaCodecInfo$CodecProfileLevel2 = mediaCodecInfo$CodecProfileLevel;
                        break;
                    }
                    n = n2;
                }
            }
        }
        return mediaCodecInfo$CodecProfileLevel2;
    }
    
    public final Size clampDimensionsPreservingRatios(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities, final Size size) {
        e.f((Object)mediaCodecInfo$CodecCapabilities, "capabilities");
        e.f((Object)size, "size");
        final Comparable clamp = mediaCodecInfo$CodecCapabilities.getVideoCapabilities().getSupportedWidths().clamp((Comparable)size.getWidth());
        final MediaCodecInfo$VideoCapabilities videoCapabilities = mediaCodecInfo$CodecCapabilities.getVideoCapabilities();
        Integer n;
        try {
            e.e((Object)clamp, "resultWidth");
            n = (Integer)videoCapabilities.getSupportedHeightsFor(((Number)clamp).intValue()).clamp((Comparable)size.getHeight());
        }
        catch (final IllegalArgumentException ex) {
            a.a.p((Throwable)ex);
            n = (Integer)videoCapabilities.getSupportedHeights().clamp((Comparable)size.getHeight());
        }
        e.e((Object)n, "capabilities.videoCapabi\u2026ize.height)\n      }\n    }");
        int intValue = n.intValue();
        final Number n2 = (Number)clamp;
        final float n3 = (float)n2.intValue();
        final float n4 = (float)intValue;
        final float n5 = n3 / n4;
        final float n6 = size.getWidth() / (float)size.getHeight();
        Integer value;
        if (n5 > n6) {
            value = (int)(n4 * n6);
        }
        else {
            value = (Integer)clamp;
            if (n5 < n6) {
                intValue = (int)(n2.floatValue() / n6);
                value = (Integer)clamp;
            }
        }
        Integer value2 = value;
        if (value.intValue() % 2 != 0) {
            value2 = value - 1;
        }
        int n7 = intValue;
        if (intValue % 2 != 0) {
            n7 = intValue - 1;
        }
        e.e((Object)value2, "resultWidth");
        return new Size(value2.intValue(), n7);
    }
    
    @Metadata(d1 = { "\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\"\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "com/reddit/video/creation/video/render/encoder/EncoderFactory$getEncoderFromSupportedConfigs$EncoderInfo", "", "name", "", "format", "Landroid/media/MediaFormat;", "(Ljava/lang/String;Landroid/media/MediaFormat;)V", "getFormat", "()Landroid/media/MediaFormat;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Landroid/media/MediaFormat;)Lcom/reddit/video/creation/video/render/encoder/EncoderFactory$getEncoderFromSupportedConfigs$EncoderInfo;", "equals", "", "other", "hashCode", "", "toString", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class EncoderInfo
    {
        private final MediaFormat format;
        private final String name;
        
        public EncoderInfo(final String name, final MediaFormat format) {
            e.f((Object)name, "name");
            e.f((Object)format, "format");
            this.name = name;
            this.format = format;
        }
        
        public final String component1() {
            return this.name;
        }
        
        public final MediaFormat component2() {
            return this.format;
        }
        
        public final EncoderInfo copy(final String s, final MediaFormat mediaFormat) {
            e.f((Object)s, "name");
            e.f((Object)mediaFormat, "format");
            return new EncoderInfo(s, mediaFormat);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof EncoderInfo)) {
                return false;
            }
            final EncoderInfo encoderInfo = (EncoderInfo)o;
            return e.a((Object)this.name, (Object)encoderInfo.name) && e.a((Object)this.format, (Object)encoderInfo.format);
        }
        
        public final MediaFormat getFormat() {
            return this.format;
        }
        
        public final String getName() {
            return this.name;
        }
        
        @Override
        public int hashCode() {
            return this.format.hashCode() + this.name.hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("EncoderInfo(name=");
            r.append(this.name);
            r.append(", format=");
            r.append(this.format);
            r.append(')');
            return r.toString();
        }
    }
}
