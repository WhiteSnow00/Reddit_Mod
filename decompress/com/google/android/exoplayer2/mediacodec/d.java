// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo$AudioCapabilities;
import android.util.Log;
import a81.e;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.util.Pair;
import za.g;
import com.google.android.exoplayer2.n;
import android.graphics.Point;
import ad.c0;
import android.media.MediaCodecInfo$VideoCapabilities;
import ad.o;
import android.media.MediaCodecInfo$CodecCapabilities;

public final class d
{
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo$CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    
    public d(final String a, final String b, final String c, final MediaCodecInfo$CodecCapabilities d, final boolean g, final boolean h, final boolean e, final boolean f) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        this.i = o.m(b);
    }
    
    public static boolean a(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int y, int x, final double n) {
        final int widthAlignment = mediaCodecInfo$VideoCapabilities.getWidthAlignment();
        final int heightAlignment = mediaCodecInfo$VideoCapabilities.getHeightAlignment();
        final int a = c0.a;
        final Point point = new Point((y + widthAlignment - 1) / widthAlignment * widthAlignment, (x + heightAlignment - 1) / heightAlignment * heightAlignment);
        x = point.x;
        y = point.y;
        if (n != -1.0 && n >= 1.0) {
            return mediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(x, y, Math.floor(n));
        }
        return mediaCodecInfo$VideoCapabilities.isSizeSupported(x, y);
    }
    
    public static d g(final String s, final String s2, final String s3, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        boolean b6 = false;
        Label_0112: {
            if (mediaCodecInfo$CodecCapabilities != null) {
                final int a = c0.a;
                if (a >= 19 && mediaCodecInfo$CodecCapabilities.isFeatureSupported("adaptive-playback")) {
                    boolean b5 = false;
                    Label_0098: {
                        if (a <= 22) {
                            final String d = c0.d;
                            if (("ODROID-XU3".equals(d) || "Nexus 10".equals(d)) && ("OMX.Exynos.AVC.Decoder".equals(s) || "OMX.Exynos.AVC.Decoder.secure".equals(s))) {
                                b5 = true;
                                break Label_0098;
                            }
                        }
                        b5 = false;
                    }
                    if (!b5) {
                        b6 = true;
                        break Label_0112;
                    }
                }
            }
            b6 = false;
        }
        if (mediaCodecInfo$CodecCapabilities == null || c0.a < 21 || mediaCodecInfo$CodecCapabilities.isFeatureSupported("tunneled-playback")) {}
        return new d(s, s2, s3, mediaCodecInfo$CodecCapabilities, b, b3, b6, b4 || (mediaCodecInfo$CodecCapabilities != null && (c0.a >= 21 && mediaCodecInfo$CodecCapabilities.isFeatureSupported("secure-playback"))));
    }
    
    public final g b(final n n, final n n2) {
        final boolean a = c0.a(n.q, n2.q);
        final boolean b = false;
        int n3;
        if (!a) {
            n3 = 8;
        }
        else {
            n3 = 0;
        }
        int n9;
        if (this.i) {
            int n4 = n3;
            if (n.y != n2.y) {
                n4 = (n3 | 0x400);
            }
            int n5 = n4;
            Label_0104: {
                if (!this.e) {
                    if (n.v == n2.v) {
                        n5 = n4;
                        if (n.w == n2.w) {
                            break Label_0104;
                        }
                    }
                    n5 = (n4 | 0x200);
                }
            }
            int n6 = n5;
            if (!c0.a(n.C, n2.C)) {
                n6 = (n5 | 0x800);
            }
            final String a2 = this.a;
            int n7 = b ? 1 : 0;
            if (c0.d.startsWith("SM-T230")) {
                n7 = (b ? 1 : 0);
                if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(a2)) {
                    n7 = 1;
                }
            }
            int n8 = n6;
            if (n7 != 0) {
                n8 = n6;
                if (!n.c(n2)) {
                    n8 = (n6 | 0x2);
                }
            }
            if ((n9 = n8) == 0) {
                final String a3 = this.a;
                int n10;
                if (n.c(n2)) {
                    n10 = 3;
                }
                else {
                    n10 = 2;
                }
                return new g(a3, n, n2, n10, 0);
            }
        }
        else {
            int n11 = n3;
            if (n.D != n2.D) {
                n11 = (n3 | 0x1000);
            }
            int n12 = n11;
            if (n.E != n2.E) {
                n12 = (n11 | 0x2000);
            }
            int n13 = n12;
            if (n.F != n2.F) {
                n13 = (n12 | 0x4000);
            }
            if (n13 == 0 && "audio/mp4a-latm".equals(this.b)) {
                final Pair<Integer, Integer> d = MediaCodecUtil.d(n);
                final Pair<Integer, Integer> d2 = MediaCodecUtil.d(n2);
                if (d != null && d2 != null) {
                    final int intValue = (int)d.first;
                    final int intValue2 = (int)d2.first;
                    if (intValue == 42 && intValue2 == 42) {
                        return new g(this.a, n, n2, 3, 0);
                    }
                }
            }
            int n14 = n13;
            if (!n.c(n2)) {
                n14 = (n13 | 0x20);
            }
            int n15 = n14;
            if ("audio/opus".equals(this.b)) {
                n15 = (n14 | 0x2);
            }
            if ((n9 = n15) == 0) {
                return new g(this.a, n, n2, 1, 0);
            }
        }
        return new g(this.a, n, n2, 0, n9);
    }
    
    public final boolean c(final n n) throws MediaCodecUtil.DecoderQueryException {
        final boolean equals = this.b.equals(n.q);
        final boolean b = true;
        final boolean b2 = true;
        int n2 = 1;
        if (!equals && !this.b.equals(MediaCodecUtil.b(n))) {
            return false;
        }
        final String n3 = n.n;
        final int n4 = 16;
        boolean b3 = false;
        Label_0597: {
            Label_0543: {
                if (n3 != null) {
                    final Pair<Integer, Integer> d = MediaCodecUtil.d(n);
                    if (d != null) {
                        final int intValue = (int)d.first;
                        final int intValue2 = (int)d.second;
                        final boolean equals2 = "video/dolby-vision".equals(n.q);
                        final int n5 = 2;
                        int n6 = intValue2;
                        int n7 = intValue;
                        Label_0189: {
                            if (equals2) {
                                int n8;
                                if ("video/avc".equals(this.b)) {
                                    n8 = 8;
                                }
                                else {
                                    n6 = intValue2;
                                    n7 = intValue;
                                    if (!"video/hevc".equals(this.b)) {
                                        break Label_0189;
                                    }
                                    n8 = 2;
                                }
                                n6 = 0;
                                n7 = n8;
                            }
                        }
                        if (this.i || n7 == 42) {
                            final MediaCodecInfo$CodecCapabilities d2 = this.d;
                            MediaCodecInfo$CodecProfileLevel[] profileLevels;
                            if (d2 == null || (profileLevels = d2.profileLevels) == null) {
                                profileLevels = new MediaCodecInfo$CodecProfileLevel[0];
                            }
                            MediaCodecInfo$CodecProfileLevel[] array = profileLevels;
                            if (c0.a <= 23) {
                                array = profileLevels;
                                if ("video/x-vnd.on2.vp9".equals(this.b)) {
                                    array = profileLevels;
                                    if (profileLevels.length == 0) {
                                        final MediaCodecInfo$CodecCapabilities d3 = this.d;
                                        int intValue3 = 0;
                                        Label_0322: {
                                            if (d3 != null) {
                                                final MediaCodecInfo$VideoCapabilities videoCapabilities = d3.getVideoCapabilities();
                                                if (videoCapabilities != null) {
                                                    intValue3 = (int)videoCapabilities.getBitrateRange().getUpper();
                                                    break Label_0322;
                                                }
                                            }
                                            intValue3 = 0;
                                        }
                                        int level;
                                        if (intValue3 >= 180000000) {
                                            level = 1024;
                                        }
                                        else if (intValue3 >= 120000000) {
                                            level = 512;
                                        }
                                        else if (intValue3 >= 60000000) {
                                            level = 256;
                                        }
                                        else if (intValue3 >= 30000000) {
                                            level = 128;
                                        }
                                        else if (intValue3 >= 18000000) {
                                            level = 64;
                                        }
                                        else if (intValue3 >= 12000000) {
                                            level = 32;
                                        }
                                        else if (intValue3 >= 7200000) {
                                            level = 16;
                                        }
                                        else if (intValue3 >= 3600000) {
                                            level = 8;
                                        }
                                        else if (intValue3 >= 1800000) {
                                            level = 4;
                                        }
                                        else if (intValue3 >= 800000) {
                                            level = n5;
                                        }
                                        else {
                                            level = 1;
                                        }
                                        final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel = new MediaCodecInfo$CodecProfileLevel();
                                        mediaCodecInfo$CodecProfileLevel.profile = 1;
                                        mediaCodecInfo$CodecProfileLevel.level = level;
                                        array = new MediaCodecInfo$CodecProfileLevel[] { mediaCodecInfo$CodecProfileLevel };
                                    }
                                }
                            }
                            for (final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel2 : array) {
                                if (mediaCodecInfo$CodecProfileLevel2.profile == n7 && mediaCodecInfo$CodecProfileLevel2.level >= n6) {
                                    break Label_0543;
                                }
                            }
                            final String n9 = n.n;
                            final String c = this.c;
                            this.f(b.e(a81.e.h(c, a81.e.h(n9, 22)), "codec.profileLevel, ", n9, ", ", c));
                            b3 = false;
                            break Label_0597;
                        }
                    }
                }
            }
            b3 = true;
        }
        if (!b3) {
            return false;
        }
        if (this.i) {
            final int v = n.v;
            boolean b4 = b;
            if (v > 0) {
                final int w = n.w;
                if (w <= 0) {
                    b4 = b;
                }
                else {
                    if (c0.a >= 21) {
                        return this.e(v, w, n.x);
                    }
                    if (v * w > MediaCodecUtil.j()) {
                        n2 = 0;
                    }
                    b4 = (n2 != 0);
                    if (n2 == 0) {
                        final int v2 = n.v;
                        final int w2 = n.w;
                        final StringBuilder sb = new StringBuilder(40);
                        sb.append("legacyFrameSize, ");
                        sb.append(v2);
                        sb.append("x");
                        sb.append(w2);
                        this.f(sb.toString());
                        b4 = (n2 != 0);
                    }
                }
            }
            return b4;
        }
        final int a = c0.a;
        boolean b5 = b2;
        if (a >= 21) {
            final int e = n.E;
            Label_1345: {
                if (e != -1) {
                    final MediaCodecInfo$CodecCapabilities d4 = this.d;
                    boolean b6 = false;
                    Label_0884: {
                        if (d4 == null) {
                            this.f("sampleRate.caps");
                        }
                        else {
                            final MediaCodecInfo$AudioCapabilities audioCapabilities = d4.getAudioCapabilities();
                            if (audioCapabilities == null) {
                                this.f("sampleRate.aCaps");
                            }
                            else {
                                if (audioCapabilities.isSampleRateSupported(e)) {
                                    b6 = true;
                                    break Label_0884;
                                }
                                final StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("sampleRate.support, ");
                                sb2.append(e);
                                this.f(sb2.toString());
                            }
                        }
                        b6 = false;
                    }
                    if (!b6) {
                        break Label_1345;
                    }
                }
                final int d5 = n.D;
                b5 = b2;
                if (d5 == -1) {
                    return b5;
                }
                final MediaCodecInfo$CodecCapabilities d6 = this.d;
                boolean b8 = false;
                Label_1333: {
                    if (d6 == null) {
                        this.f("channelCount.caps");
                    }
                    else {
                        final MediaCodecInfo$AudioCapabilities audioCapabilities2 = d6.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            this.f("channelCount.aCaps");
                        }
                        else {
                            final String a2 = this.a;
                            final String b7 = this.b;
                            final int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            int n10;
                            if ((n10 = maxInputChannelCount) <= 1) {
                                if (a >= 26 && maxInputChannelCount > 0) {
                                    n10 = maxInputChannelCount;
                                }
                                else {
                                    n10 = maxInputChannelCount;
                                    if (!"audio/mpeg".equals(b7)) {
                                        n10 = maxInputChannelCount;
                                        if (!"audio/3gpp".equals(b7)) {
                                            n10 = maxInputChannelCount;
                                            if (!"audio/amr-wb".equals(b7)) {
                                                n10 = maxInputChannelCount;
                                                if (!"audio/mp4a-latm".equals(b7)) {
                                                    n10 = maxInputChannelCount;
                                                    if (!"audio/vorbis".equals(b7)) {
                                                        n10 = maxInputChannelCount;
                                                        if (!"audio/opus".equals(b7)) {
                                                            n10 = maxInputChannelCount;
                                                            if (!"audio/raw".equals(b7)) {
                                                                n10 = maxInputChannelCount;
                                                                if (!"audio/flac".equals(b7)) {
                                                                    n10 = maxInputChannelCount;
                                                                    if (!"audio/g711-alaw".equals(b7)) {
                                                                        n10 = maxInputChannelCount;
                                                                        if (!"audio/g711-mlaw".equals(b7)) {
                                                                            if ("audio/gsm".equals(b7)) {
                                                                                n10 = maxInputChannelCount;
                                                                            }
                                                                            else {
                                                                                if ("audio/ac3".equals(b7)) {
                                                                                    n10 = 6;
                                                                                }
                                                                                else if ("audio/eac3".equals(b7)) {
                                                                                    n10 = n4;
                                                                                }
                                                                                else {
                                                                                    n10 = 30;
                                                                                }
                                                                                final StringBuilder sb3 = new StringBuilder(a81.e.h(a2, 59));
                                                                                sb3.append("AssumedMaxChannelAdjustment: ");
                                                                                sb3.append(a2);
                                                                                sb3.append(", [");
                                                                                sb3.append(maxInputChannelCount);
                                                                                sb3.append(" to ");
                                                                                sb3.append(n10);
                                                                                sb3.append("]");
                                                                                Log.w("MediaCodecInfo", sb3.toString());
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (n10 >= d5) {
                                b8 = true;
                                break Label_1333;
                            }
                            final StringBuilder sb4 = new StringBuilder(33);
                            sb4.append("channelCount.support, ");
                            sb4.append(d5);
                            this.f(sb4.toString());
                        }
                    }
                    b8 = false;
                }
                if (b8) {
                    b5 = b2;
                    return b5;
                }
            }
            b5 = false;
        }
        return b5;
    }
    
    public final boolean d(final n n) {
        if (this.i) {
            return this.e;
        }
        final Pair<Integer, Integer> d = MediaCodecUtil.d(n);
        return d != null && (int)d.first == 42;
    }
    
    public final boolean e(final int n, final int n2, final double n3) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        if (d == null) {
            this.f("sizeAndRate.caps");
            return false;
        }
        final MediaCodecInfo$VideoCapabilities videoCapabilities = d.getVideoCapabilities();
        if (videoCapabilities == null) {
            this.f("sizeAndRate.vCaps");
            return false;
        }
        if (!a(videoCapabilities, n, n2, n3)) {
            if (n >= n2 || ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(c0.b)) || a(videoCapabilities, n2, n, n3)) {
                final StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(n);
                sb.append("x");
                sb.append(n2);
                sb.append("x");
                sb.append(n3);
                this.f(sb.toString());
                return false;
            }
            final StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(n);
            sb2.append("x");
            sb2.append(n2);
            sb2.append("x");
            sb2.append(n3);
            final String string = sb2.toString();
            final String a = this.a;
            final String b = this.b;
            final String e = c0.e;
            final StringBuilder k = aw.b.k(a81.e.h(e, a81.e.h(b, a81.e.h(a, a81.e.h(string, 25)))), "AssumedSupport [", string, "] [", a);
            d.A(k, ", ", b, "] [", e);
            k.append("]");
            Log.d("MediaCodecInfo", k.toString());
        }
        return true;
    }
    
    public final void f(final String s) {
        final String a = this.a;
        final String b = this.b;
        final String e = c0.e;
        final StringBuilder k = aw.b.k(a81.e.h(e, a81.e.h(b, a81.e.h(a, a81.e.h(s, 20)))), "NoSupport [", s, "] [", a);
        d.A(k, ", ", b, "] [", e);
        k.append("]");
        Log.d("MediaCodecInfo", k.toString());
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
