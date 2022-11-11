// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.MediaCodecInfo$CodecProfileLevel;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaFormat;
import android.media.MediaCodecList;
import android.media.MediaCodec;
import android.util.Log;
import android.media.MediaCodecInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoCapabilities
{
    private static final Map<String, VideoCapabilities> CAPABILITIES;
    private static final List<String> VP9_SOFTWARE_CODECS;
    public int maxBitrate;
    public int maxFramerate;
    public int maxHeight;
    public int maxInstances;
    public int maxLevel;
    public int maxProfile;
    public int maxWidth;
    
    static {
        CAPABILITIES = new HashMap<String, VideoCapabilities>();
        VP9_SOFTWARE_CODECS = Arrays.asList("OMX.google.vp9.decoder", "c2.android.vp9.decoder", "c2.google.vp9.decoder");
    }
    
    private VideoCapabilities() {
    }
    
    private static int av1LevelIndicationFromOMX(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8388608: {
                return 23;
            }
            case 4194304: {
                return 22;
            }
            case 2097152: {
                return 21;
            }
            case 1048576: {
                return 20;
            }
            case 524288: {
                return 19;
            }
            case 262144: {
                return 18;
            }
            case 131072: {
                return 17;
            }
            case 65536: {
                return 16;
            }
            case 32768: {
                return 15;
            }
            case 16384: {
                return 14;
            }
            case 8192: {
                return 13;
            }
            case 4096: {
                return 12;
            }
            case 2048: {
                return 11;
            }
            case 1024: {
                return 10;
            }
            case 512: {
                return 9;
            }
            case 256: {
                return 8;
            }
            case 128: {
                return 7;
            }
            case 64: {
                return 6;
            }
            case 32: {
                return 5;
            }
            case 16: {
                return 4;
            }
            case 8: {
                return 3;
            }
            case 4: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
    }
    
    private static int av1ProfileIndicationFromOMX(final int n) {
        return 0;
    }
    
    private static int avcLevelIndicationFromOMX(final int n) {
        if (n == 1) {
            return 10;
        }
        if (n == 2) {
            return 9;
        }
        switch (n) {
            default: {
                return 42;
            }
            case 524288: {
                return 62;
            }
            case 262144: {
                return 61;
            }
            case 131072: {
                return 60;
            }
            case 65536: {
                return 52;
            }
            case 32768: {
                return 51;
            }
            case 16384: {
                return 50;
            }
            case 4096: {
                return 41;
            }
            case 2048: {
                return 40;
            }
            case 1024: {
                return 32;
            }
            case 512: {
                return 31;
            }
            case 256: {
                return 30;
            }
            case 128: {
                return 22;
            }
            case 64: {
                return 21;
            }
            case 32: {
                return 20;
            }
            case 16: {
                return 13;
            }
            case 8: {
                return 12;
            }
            case 4: {
                return 11;
            }
        }
    }
    
    private static int avcProfileIndicationFromOMX(final int n) {
        if (n == 1) {
            return 66;
        }
        if (n == 4) {
            return 88;
        }
        if (n == 8) {
            return 100;
        }
        if (n == 16) {
            return 110;
        }
        if (n == 32) {
            return 122;
        }
        if (n != 64) {
            return 77;
        }
        return 244;
    }
    
    public static VideoCapabilities getCapabilities(final String s) {
        final Map<String, VideoCapabilities> capabilities = VideoCapabilities.CAPABILITIES;
        if (capabilities.containsKey(s)) {
            return (VideoCapabilities)capabilities.get(s);
        }
        final VideoCapabilities videoCapabilities = new VideoCapabilities();
        videoCapabilities.maxBitrate = Integer.MAX_VALUE;
        videoCapabilities.maxWidth = 1920;
        videoCapabilities.maxHeight = 1280;
        videoCapabilities.maxFramerate = 30;
        videoCapabilities.maxProfile = 100;
        videoCapabilities.maxLevel = 42;
        videoCapabilities.maxInstances = 1;
        try {
            final List<MediaCodecInfo> supportedCodecs = MediaCodecFactory.findSupportedCodecs(s, false);
            if (!supportedCodecs.isEmpty()) {
                videoCapabilities.setVideoCapabilities(s, (MediaCodecInfo)supportedCodecs.get(0));
                return videoCapabilities;
            }
        }
        catch (final Exception ex) {
            Log.e("AmazonIVS", "Failed to get codec capabilities", (Throwable)ex);
        }
        MediaCodec mediaCodec = null;
        MediaCodec mediaCodec2 = null;
        try {
            while (true) {
                Label_0190: {
                    try {
                        final MediaCodec codec = MediaCodecFactory.createCodec(s, false);
                        if (codec != null) {
                            mediaCodec2 = codec;
                            mediaCodec = codec;
                            videoCapabilities.setVideoCapabilities(s, codec.getCodecInfo());
                        }
                        if (codec != null) {
                            mediaCodec = codec;
                            mediaCodec.release();
                        }
                        break Label_0190;
                    }
                    finally {
                        if (mediaCodec2 != null) {
                            mediaCodec2.release();
                        }
                        continue;
                        VideoCapabilities.CAPABILITIES.put(s, videoCapabilities);
                        return videoCapabilities;
                    }
                }
                break;
            }
        }
        catch (final Exception ex2) {}
    }
    
    public static boolean isTypeSupported(String decoderForFormat) {
        if (decoderForFormat.equalsIgnoreCase("video/avc")) {
            return true;
        }
        decoderForFormat = new MediaCodecList(0).findDecoderForFormat(MediaFormat.createVideoFormat(decoderForFormat, 1920, 1080));
        return VideoCapabilities.VP9_SOFTWARE_CODECS.contains(decoderForFormat) ^ true;
    }
    
    public static boolean isVP9Supported() {
        return isTypeSupported("video/x-vnd.on2.vp9");
    }
    
    private void setVideoCapabilities(final String s, final MediaCodecInfo mediaCodecInfo) {
        final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(s);
        final MediaCodecInfo$VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        this.maxBitrate = (int)videoCapabilities.getBitrateRange().getUpper();
        this.maxWidth = (int)videoCapabilities.getSupportedWidths().getUpper();
        this.maxHeight = (int)videoCapabilities.getSupportedHeights().getUpper();
        this.maxFramerate = (int)videoCapabilities.getSupportedFrameRates().getUpper();
        this.maxInstances = capabilitiesForType.getMaxSupportedInstances();
        if (MediaCodecFactory.limitMaxDecodeSize(mediaCodecInfo.getName())) {
            this.maxWidth = 1920;
            this.maxHeight = 1088;
        }
        int n = 0;
        int n3;
        int n2 = n3 = 0;
        while (true) {
            final MediaCodecInfo$CodecProfileLevel[] profileLevels = capabilitiesForType.profileLevels;
            if (n >= profileLevels.length) {
                break;
            }
            final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel = profileLevels[n];
            final int profile = mediaCodecInfo$CodecProfileLevel.profile;
            final int level = mediaCodecInfo$CodecProfileLevel.level;
            int n4 = 0;
            Label_0190: {
                if (profile > (n4 = n2)) {
                    if (s.equals("video/avc")) {
                        n4 = n2;
                        if (profile > 64) {
                            break Label_0190;
                        }
                    }
                    n4 = profile;
                }
            }
            int n5;
            if (level > (n5 = n3)) {
                n5 = level;
            }
            ++n;
            n2 = n4;
            n3 = n5;
        }
        int n7;
        int n8;
        if (s.equals("video/avc")) {
            int n6;
            if ((n6 = n2) == 0) {
                n6 = 8;
            }
            n7 = n6;
            if ((n8 = n3) == 0) {
                n8 = 8192;
                n7 = n6;
            }
        }
        else if (s.equals("video/x-vnd.on2.vp9")) {
            int n9;
            if ((n9 = n2) == 0) {
                n9 = 1;
            }
            n7 = n9;
            if ((n8 = n3) == 0) {
                n8 = 128;
                n7 = n9;
            }
        }
        else {
            n7 = n2;
            n8 = n3;
            if (s.equals("video/av01")) {
                n7 = n2;
                if ((n8 = n3) == 0) {
                    n8 = 2;
                    n7 = n2;
                }
            }
        }
        if (s.equals("video/avc")) {
            this.maxProfile = avcProfileIndicationFromOMX(n7);
            this.maxLevel = avcLevelIndicationFromOMX(n8);
        }
        else if (s.equals("video/x-vnd.on2.vp9")) {
            this.maxProfile = vp9ProfileIndicationFromOMX(n7);
            this.maxLevel = vp9LevelIndicationFromOMX(n8);
        }
        else if (s.equals("video/av01")) {
            this.maxProfile = av1ProfileIndicationFromOMX(n7);
            this.maxLevel = av1LevelIndicationFromOMX(n8);
        }
    }
    
    private static int vp9LevelIndicationFromOMX(final int n) {
        if (n == 1) {
            return 10;
        }
        if (n == 2) {
            return 11;
        }
        if (n == 4) {
            return 20;
        }
        if (n == 8) {
            return 21;
        }
        if (n == 16) {
            return 30;
        }
        if (n == 32) {
            return 31;
        }
        if (n == 64) {
            return 40;
        }
        if (n == 128) {
            return 41;
        }
        if (n == 256) {
            return 50;
        }
        if (n == 2048) {
            return 60;
        }
        if (n == 4096) {
            return 61;
        }
        if (n != 8192) {
            return 51;
        }
        return 62;
    }
    
    private static int vp9ProfileIndicationFromOMX(final int n) {
        if (n != 2) {
            if (n != 4) {
                if (n != 8) {
                    if (n == 4096) {
                        return 2;
                    }
                    if (n != 8192) {
                        return 0;
                    }
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }
    
    public int getMaxBitrate() {
        return this.maxBitrate;
    }
    
    public int getMaxFramerate() {
        return this.maxFramerate;
    }
    
    public int getMaxHeight() {
        return this.maxHeight;
    }
    
    public int getMaxInstances() {
        return this.maxInstances;
    }
    
    public int getMaxLevel() {
        return this.maxLevel;
    }
    
    public int getMaxProfile() {
        return this.maxProfile;
    }
    
    public int getMaxWidth() {
        return this.maxWidth;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("maxBitrate=");
        k.append(this.maxBitrate);
        k.append(", maxFramerate=");
        k.append(this.maxFramerate);
        k.append(", maxWidth=");
        k.append(this.maxWidth);
        k.append(", maxHeight=");
        k.append(this.maxHeight);
        k.append(", maxProfile=");
        k.append(this.maxProfile);
        k.append(", maxLevel=");
        k.append(this.maxLevel);
        return k.toString();
    }
}
