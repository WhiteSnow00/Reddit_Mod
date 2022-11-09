// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.List;
import android.media.MediaCodecInfo;
import ak0.m;
import java.io.IOException;
import android.util.Log;
import android.media.MediaCodec;

class MediaCodecFactory
{
    public static final String OMX_SOFTWARE_AV1_DECODER = "c2.android.av1.decoder";
    public static final String OMX_SOFTWARE_AVC_DECODER = "OMX.google.h264.decoder";
    public static final String OMX_SOFTWARE_VP9_DECODER = "OMX.google.vp9.decoder";
    
    private MediaCodecFactory() {
    }
    
    public static MediaCodec createCodec(String decoder, final boolean b) {
        final String decoder2 = findDecoder(decoder, b);
        MediaCodec mediaCodec;
        if (decoder2 == null) {
            try {
                mediaCodec = MediaCodec.createDecoderByType(decoder);
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to create codec ");
                sb.append(decoder);
                Log.w("AmazonIVS", sb.toString(), (Throwable)ex);
                mediaCodec = null;
            }
        }
        else {
            mediaCodec = createCodecByName(decoder2);
        }
        MediaCodec codecByName = mediaCodec;
        if (mediaCodec == null) {
            codecByName = mediaCodec;
            if (b) {
                decoder = findDecoder(decoder, false);
                codecByName = mediaCodec;
                if (decoder != null) {
                    codecByName = createCodecByName(m.l(decoder, ".secure"));
                }
            }
        }
        return codecByName;
    }
    
    private static MediaCodec createCodecByName(final String s) {
        if (s != null) {
            try {
                return MediaCodec.createByCodecName(s);
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to create codec ");
                sb.append(s);
                Log.w("AmazonIVS", sb.toString(), (Throwable)ex);
            }
        }
        return null;
    }
    
    public static MediaCodec createSoftwareCodec(final String s) {
        s.getClass();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1599127257: {
                if (!s.equals("video/x-vnd.on2.vp9")) {
                    break;
                }
                n = 2;
                break;
            }
            case 1331836730: {
                if (!s.equals("video/avc")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1662735862: {
                if (!s.equals("video/av01")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return createCodecByName("OMX.google.vp9.decoder");
            }
            case 1: {
                return createCodecByName("OMX.google.h264.decoder");
            }
            case 0: {
                return createCodecByName("c2.android.av1.decoder");
            }
        }
    }
    
    public static String findDecoder(final String s, final boolean b) {
        final List<MediaCodecInfo> supportedCodecs = findSupportedCodecs(s, b);
        if (!supportedCodecs.isEmpty()) {
            return ((MediaCodecInfo)supportedCodecs.get(0)).getName();
        }
        return null;
    }
    
    public static List<MediaCodecInfo> findSupportedCodecs(final String s, final boolean b) {
        final ArrayList list = new ArrayList();
        for (final MediaCodecInfo mediaCodecInfo : new MediaCodecList((int)(b ? 1 : 0)).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                if (supportsType(mediaCodecInfo, s)) {
                    int n = (b ^ true) ? 1 : 0;
                    if (b) {
                        n = n;
                        if (mediaCodecInfo.getCapabilitiesForType(s).isFeatureSupported("secure-playback")) {
                            n = 1;
                        }
                    }
                    if (n != 0) {
                        list.add(mediaCodecInfo);
                    }
                }
            }
        }
        return list;
    }
    
    public static boolean limitMaxDecodeSize(final String s) {
        return "OMX.amlogic.avc.decoder.awesome".equals(s);
    }
    
    private static boolean supportsType(final MediaCodecInfo mediaCodecInfo, final String s) {
        final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        for (int length = supportedTypes.length, i = 0; i < length; ++i) {
            if (supportedTypes[i].equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
