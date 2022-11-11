// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.mediacodec;

import android.text.TextUtils;
import android.media.MediaCodecInfo$CodecProfileLevel;
import a4.f2;
import a4.c1;
import androidx.appcompat.widget.l0;
import a4.b1;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import bd.b;
import java.util.regex.Matcher;
import ad.o;
import android.util.Log;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.n;
import ha.c;
import java.util.Comparator;
import java.util.Collections;
import ob.j;
import ja.k;
import android.media.MediaCodecInfo$CodecCapabilities;
import ad.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class MediaCodecUtil
{
    public static final Pattern a;
    public static final HashMap<b, List<d>> b;
    public static int c;
    
    static {
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap<b, List<d>>();
        MediaCodecUtil.c = -1;
    }
    
    public static void a(String a, final ArrayList list) {
        if ("audio/raw".equals(a)) {
            if (c0.a < 26 && c0.b.equals("R9") && list.size() == 1 && ((d)list.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(d.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort((List<Object>)list, new j(new k(8)));
        }
        final int a2 = c0.a;
        if (a2 < 21 && list.size() > 1) {
            a = ((d)list.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(a) || "OMX.SEC.MP3.Decoder".equals(a) || "OMX.brcm.audio.mp3.decoder".equals(a)) {
                Collections.sort((List<Object>)list, new j((f)new ha.c(7)));
            }
        }
        if (a2 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((d)list.get(0)).a)) {
            list.add(list.remove(0));
        }
    }
    
    public static String b(final n n) {
        if ("audio/eac3-joc".equals(n.q)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(n.q)) {
            final Pair<Integer, Integer> d = d(n);
            if (d != null) {
                final int intValue = (int)d.first;
                if (intValue == 16 || intValue == 256) {
                    return "video/hevc";
                }
                if (intValue == 512) {
                    return "video/avc";
                }
            }
        }
        return null;
    }
    
    public static String c(final MediaCodecInfo mediaCodecInfo, final String s, final String s2) {
        for (final String s3 : mediaCodecInfo.getSupportedTypes()) {
            if (s3.equalsIgnoreCase(s2)) {
                return s3;
            }
        }
        if (s2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(s)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(s) || "OMX.realtek.video.decoder.tunneled".equals(s)) {
                return "video/dv_hevc";
            }
        }
        else {
            if (s2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s)) {
                return "audio/x-lg-alac";
            }
            if (s2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s)) {
                return "audio/x-lg-flac";
            }
        }
        return null;
    }
    
    public static Pair<Integer, Integer> d(n n) {
        final String n2 = n.n;
        if (n2 == null) {
            return null;
        }
        final String[] split = n2.split("\\.");
        final boolean equals = "video/dolby-vision".equals(n.q);
        final int n3 = 512;
        final int n4 = 4;
        final int n5 = 2;
        if (equals) {
            final String n6 = n.n;
            if (split.length < 3) {
                final String value = String.valueOf(n6);
                String concat;
                if (value.length() != 0) {
                    concat = "Ignoring malformed Dolby Vision codec string: ".concat(value);
                }
                else {
                    concat = new String("Ignoring malformed Dolby Vision codec string: ");
                }
                Log.w("MediaCodecUtil", concat);
            }
            else {
                final Matcher matcher = MediaCodecUtil.a.matcher(split[1]);
                if (!matcher.matches()) {
                    final String value2 = String.valueOf(n6);
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "Ignoring malformed Dolby Vision codec string: ".concat(value2);
                    }
                    else {
                        concat2 = new String("Ignoring malformed Dolby Vision codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat2);
                }
                else {
                    final String group = matcher.group(1);
                    Integer n8 = null;
                    Label_0571: {
                        if (group != null) {
                            int n7 = 0;
                            Label_0420: {
                                switch (group) {
                                    case "09": {
                                        n7 = 9;
                                        break Label_0420;
                                    }
                                    case "08": {
                                        n7 = 8;
                                        break Label_0420;
                                    }
                                    case "07": {
                                        n7 = 7;
                                        break Label_0420;
                                    }
                                    case "06": {
                                        n7 = 6;
                                        break Label_0420;
                                    }
                                    case "05": {
                                        n7 = 5;
                                        break Label_0420;
                                    }
                                    case "04": {
                                        n7 = 4;
                                        break Label_0420;
                                    }
                                    case "03": {
                                        n7 = 3;
                                        break Label_0420;
                                    }
                                    case "02": {
                                        n7 = 2;
                                        break Label_0420;
                                    }
                                    case "01": {
                                        n7 = 1;
                                        break Label_0420;
                                    }
                                    case "00": {
                                        n7 = 0;
                                        break Label_0420;
                                    }
                                    default:
                                        break;
                                }
                                n7 = -1;
                            }
                            switch (n7) {
                                case 9: {
                                    n8 = 512;
                                    break Label_0571;
                                }
                                case 8: {
                                    n8 = 256;
                                    break Label_0571;
                                }
                                case 7: {
                                    n8 = 128;
                                    break Label_0571;
                                }
                                case 6: {
                                    n8 = 64;
                                    break Label_0571;
                                }
                                case 5: {
                                    n8 = 32;
                                    break Label_0571;
                                }
                                case 4: {
                                    n8 = 16;
                                    break Label_0571;
                                }
                                case 3: {
                                    n8 = 8;
                                    break Label_0571;
                                }
                                case 2: {
                                    n8 = 4;
                                    break Label_0571;
                                }
                                case 1: {
                                    n8 = 2;
                                    break Label_0571;
                                }
                                case 0: {
                                    n8 = 1;
                                    break Label_0571;
                                }
                            }
                        }
                        n8 = null;
                    }
                    if (n8 == null) {
                        final String value3 = String.valueOf(group);
                        String concat3;
                        if (value3.length() != 0) {
                            concat3 = "Unknown Dolby Vision profile string: ".concat(value3);
                        }
                        else {
                            concat3 = new String("Unknown Dolby Vision profile string: ");
                        }
                        Log.w("MediaCodecUtil", concat3);
                    }
                    else {
                        final String s = split[2];
                        Integer n10 = null;
                        Label_1193: {
                            if (s != null) {
                                int n9 = 0;
                                Label_1000: {
                                    switch (s) {
                                        case "13": {
                                            n9 = 12;
                                            break Label_1000;
                                        }
                                        case "12": {
                                            n9 = 11;
                                            break Label_1000;
                                        }
                                        case "11": {
                                            n9 = 10;
                                            break Label_1000;
                                        }
                                        case "10": {
                                            n9 = 9;
                                            break Label_1000;
                                        }
                                        case "09": {
                                            n9 = 8;
                                            break Label_1000;
                                        }
                                        case "08": {
                                            n9 = 7;
                                            break Label_1000;
                                        }
                                        case "07": {
                                            n9 = 6;
                                            break Label_1000;
                                        }
                                        case "06": {
                                            n9 = 5;
                                            break Label_1000;
                                        }
                                        case "05": {
                                            n9 = 4;
                                            break Label_1000;
                                        }
                                        case "04": {
                                            n9 = 3;
                                            break Label_1000;
                                        }
                                        case "03": {
                                            n9 = 2;
                                            break Label_1000;
                                        }
                                        case "02": {
                                            n9 = 1;
                                            break Label_1000;
                                        }
                                        case "01": {
                                            n9 = 0;
                                            break Label_1000;
                                        }
                                        default:
                                            break;
                                    }
                                    n9 = -1;
                                }
                                switch (n9) {
                                    case 12: {
                                        n10 = 4096;
                                        break Label_1193;
                                    }
                                    case 11: {
                                        n10 = 2048;
                                        break Label_1193;
                                    }
                                    case 10: {
                                        n10 = 1024;
                                        break Label_1193;
                                    }
                                    case 9: {
                                        n10 = 512;
                                        break Label_1193;
                                    }
                                    case 8: {
                                        n10 = 256;
                                        break Label_1193;
                                    }
                                    case 7: {
                                        n10 = 128;
                                        break Label_1193;
                                    }
                                    case 6: {
                                        n10 = 64;
                                        break Label_1193;
                                    }
                                    case 5: {
                                        n10 = 32;
                                        break Label_1193;
                                    }
                                    case 4: {
                                        n10 = 16;
                                        break Label_1193;
                                    }
                                    case 3: {
                                        n10 = 8;
                                        break Label_1193;
                                    }
                                    case 2: {
                                        n10 = 4;
                                        break Label_1193;
                                    }
                                    case 1: {
                                        n10 = 2;
                                        break Label_1193;
                                    }
                                    case 0: {
                                        n10 = 1;
                                        break Label_1193;
                                    }
                                }
                            }
                            n10 = null;
                        }
                        if (n10 != null) {
                            final Pair pair = new Pair((Object)n8, (Object)n10);
                            return (Pair<Integer, Integer>)pair;
                        }
                        final String value4 = String.valueOf(s);
                        String concat4;
                        if (value4.length() != 0) {
                            concat4 = "Unknown Dolby Vision level string: ".concat(value4);
                        }
                        else {
                            concat4 = new String("Unknown Dolby Vision level string: ");
                        }
                        Log.w("MediaCodecUtil", concat4);
                    }
                }
            }
            final Pair pair = null;
            return (Pair<Integer, Integer>)pair;
        }
        final String s2 = split[0];
        s2.getClass();
        int n11 = 0;
        Label_1476: {
            switch (s2) {
                case "vp09": {
                    n11 = 6;
                    break Label_1476;
                }
                case "mp4a": {
                    n11 = 5;
                    break Label_1476;
                }
                case "hvc1": {
                    n11 = 4;
                    break Label_1476;
                }
                case "hev1": {
                    n11 = 3;
                    break Label_1476;
                }
                case "avc2": {
                    n11 = 2;
                    break Label_1476;
                }
                case "avc1": {
                    n11 = 1;
                    break Label_1476;
                }
                case "av01": {
                    n11 = 0;
                    break Label_1476;
                }
                default:
                    break;
            }
            n11 = -1;
        }
        switch (n11) {
            default: {
                return null;
            }
            case 6: {
                n = (n)n.n;
                if (split.length < 3) {
                    final String value5 = String.valueOf(n);
                    String concat5;
                    if (value5.length() != 0) {
                        concat5 = "Ignoring malformed VP9 codec string: ".concat(value5);
                    }
                    else {
                        concat5 = new String("Ignoring malformed VP9 codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat5);
                }
                else {
                    try {
                        final int int1 = Integer.parseInt(split[1]);
                        final int int2 = Integer.parseInt(split[2]);
                        int n12;
                        if (int1 != 0) {
                            if (int1 != 1) {
                                if (int1 != 2) {
                                    if (int1 != 3) {
                                        n12 = -1;
                                    }
                                    else {
                                        n12 = 8;
                                    }
                                }
                                else {
                                    n12 = 4;
                                }
                            }
                            else {
                                n12 = 2;
                            }
                        }
                        else {
                            n12 = 1;
                        }
                        if (n12 == -1) {
                            d.w(32, "Unknown VP9 profile: ", int1, "MediaCodecUtil");
                        }
                        else {
                            int n13;
                            if (int2 != 10) {
                                if (int2 != 11) {
                                    if (int2 != 20) {
                                        if (int2 != 21) {
                                            if (int2 != 30) {
                                                if (int2 != 31) {
                                                    if (int2 != 40) {
                                                        if (int2 != 41) {
                                                            if (int2 != 50) {
                                                                n13 = n3;
                                                                if (int2 != 51) {
                                                                    switch (int2) {
                                                                        default: {
                                                                            n13 = -1;
                                                                            break;
                                                                        }
                                                                        case 62: {
                                                                            n13 = 8192;
                                                                            break;
                                                                        }
                                                                        case 61: {
                                                                            n13 = 4096;
                                                                            break;
                                                                        }
                                                                        case 60: {
                                                                            n13 = 2048;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                n13 = 256;
                                                            }
                                                        }
                                                        else {
                                                            n13 = 128;
                                                        }
                                                    }
                                                    else {
                                                        n13 = 64;
                                                    }
                                                }
                                                else {
                                                    n13 = 32;
                                                }
                                            }
                                            else {
                                                n13 = 16;
                                            }
                                        }
                                        else {
                                            n13 = 8;
                                        }
                                    }
                                    else {
                                        n13 = 4;
                                    }
                                }
                                else {
                                    n13 = 2;
                                }
                            }
                            else {
                                n13 = 1;
                            }
                            if (n13 != -1) {
                                n = (n)new Pair((Object)n12, (Object)n13);
                                return (Pair<Integer, Integer>)n;
                            }
                            d.w(30, "Unknown VP9 level: ", int2, "MediaCodecUtil");
                        }
                    }
                    catch (final NumberFormatException ex) {
                        final String value6 = String.valueOf(n);
                        String concat6;
                        if (value6.length() != 0) {
                            concat6 = "Ignoring malformed VP9 codec string: ".concat(value6);
                        }
                        else {
                            concat6 = new String("Ignoring malformed VP9 codec string: ");
                        }
                        Log.w("MediaCodecUtil", concat6);
                    }
                }
                n = null;
                return (Pair<Integer, Integer>)n;
            }
            case 5: {
                final String n14 = n.n;
                if (split.length != 3) {
                    final String value7 = String.valueOf(n14);
                    String concat7;
                    if (value7.length() != 0) {
                        concat7 = "Ignoring malformed MP4A codec string: ".concat(value7);
                    }
                    else {
                        concat7 = new String("Ignoring malformed MP4A codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat7);
                }
                else {
                    try {
                        if ("audio/mp4a-latm".equals(o.f(Integer.parseInt(split[1], 16)))) {
                            final int int3 = Integer.parseInt(split[2]);
                            int n15 = 17;
                            if (int3 != 17) {
                                n15 = 20;
                                if (int3 != 20) {
                                    n15 = 23;
                                    if (int3 != 23) {
                                        n15 = 29;
                                        if (int3 != 29) {
                                            n15 = 39;
                                            if (int3 != 39) {
                                                n15 = 42;
                                                if (int3 != 42) {
                                                    n15 = n4;
                                                    switch (int3) {
                                                        default: {
                                                            n15 = -1;
                                                            break;
                                                        }
                                                        case 4: {
                                                            break;
                                                        }
                                                        case 6: {
                                                            n15 = 6;
                                                            break;
                                                        }
                                                        case 5: {
                                                            n15 = 5;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n15 = 3;
                                                            break;
                                                        }
                                                        case 2: {
                                                            n15 = 2;
                                                            break;
                                                        }
                                                        case 1: {
                                                            n15 = 1;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (n15 != -1) {
                                final Pair pair2 = new Pair((Object)n15, (Object)0);
                                return (Pair<Integer, Integer>)pair2;
                            }
                        }
                    }
                    catch (final NumberFormatException ex2) {
                        final String value8 = String.valueOf(n14);
                        String concat8;
                        if (value8.length() != 0) {
                            concat8 = "Ignoring malformed MP4A codec string: ".concat(value8);
                        }
                        else {
                            concat8 = new String("Ignoring malformed MP4A codec string: ");
                        }
                        Log.w("MediaCodecUtil", concat8);
                    }
                }
                final Pair pair2 = null;
                return (Pair<Integer, Integer>)pair2;
            }
            case 3:
            case 4: {
                final String n16 = n.n;
                if (split.length < 4) {
                    final String value9 = String.valueOf(n16);
                    String concat9;
                    if (value9.length() != 0) {
                        concat9 = "Ignoring malformed HEVC codec string: ".concat(value9);
                    }
                    else {
                        concat9 = new String("Ignoring malformed HEVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat9);
                }
                else {
                    final Matcher matcher2 = MediaCodecUtil.a.matcher(split[1]);
                    if (!matcher2.matches()) {
                        final String value10 = String.valueOf(n16);
                        String concat10;
                        if (value10.length() != 0) {
                            concat10 = "Ignoring malformed HEVC codec string: ".concat(value10);
                        }
                        else {
                            concat10 = new String("Ignoring malformed HEVC codec string: ");
                        }
                        Log.w("MediaCodecUtil", concat10);
                    }
                    else {
                        final String group2 = matcher2.group(1);
                        int n17;
                        if ("1".equals(group2)) {
                            n17 = 1;
                        }
                        else {
                            if (!"2".equals(group2)) {
                                final String value11 = String.valueOf(group2);
                                String concat11;
                                if (value11.length() != 0) {
                                    concat11 = "Unknown HEVC profile string: ".concat(value11);
                                }
                                else {
                                    concat11 = new String("Unknown HEVC profile string: ");
                                }
                                Log.w("MediaCodecUtil", concat11);
                                return null;
                            }
                            n17 = 2;
                        }
                        final String s3 = split[3];
                        Integer n19 = null;
                        Label_3527: {
                            if (s3 != null) {
                                int n18 = 0;
                                Label_3152: {
                                    switch (s3) {
                                        case "L186": {
                                            n18 = 25;
                                            break Label_3152;
                                        }
                                        case "L183": {
                                            n18 = 24;
                                            break Label_3152;
                                        }
                                        case "L180": {
                                            n18 = 23;
                                            break Label_3152;
                                        }
                                        case "L156": {
                                            n18 = 22;
                                            break Label_3152;
                                        }
                                        case "L153": {
                                            n18 = 21;
                                            break Label_3152;
                                        }
                                        case "L150": {
                                            n18 = 20;
                                            break Label_3152;
                                        }
                                        case "L123": {
                                            n18 = 19;
                                            break Label_3152;
                                        }
                                        case "L120": {
                                            n18 = 18;
                                            break Label_3152;
                                        }
                                        case "H186": {
                                            n18 = 17;
                                            break Label_3152;
                                        }
                                        case "H183": {
                                            n18 = 16;
                                            break Label_3152;
                                        }
                                        case "H180": {
                                            n18 = 15;
                                            break Label_3152;
                                        }
                                        case "H156": {
                                            n18 = 14;
                                            break Label_3152;
                                        }
                                        case "H153": {
                                            n18 = 13;
                                            break Label_3152;
                                        }
                                        case "H150": {
                                            n18 = 12;
                                            break Label_3152;
                                        }
                                        case "H123": {
                                            n18 = 11;
                                            break Label_3152;
                                        }
                                        case "H120": {
                                            n18 = 10;
                                            break Label_3152;
                                        }
                                        case "L93": {
                                            n18 = 9;
                                            break Label_3152;
                                        }
                                        case "L90": {
                                            n18 = 8;
                                            break Label_3152;
                                        }
                                        case "L63": {
                                            n18 = 7;
                                            break Label_3152;
                                        }
                                        case "L60": {
                                            n18 = 6;
                                            break Label_3152;
                                        }
                                        case "L30": {
                                            n18 = 5;
                                            break Label_3152;
                                        }
                                        case "H93": {
                                            n18 = 4;
                                            break Label_3152;
                                        }
                                        case "H90": {
                                            n18 = 3;
                                            break Label_3152;
                                        }
                                        case "H63": {
                                            n18 = 2;
                                            break Label_3152;
                                        }
                                        case "H60": {
                                            n18 = 1;
                                            break Label_3152;
                                        }
                                        case "H30": {
                                            n18 = 0;
                                            break Label_3152;
                                        }
                                        default:
                                            break;
                                    }
                                    n18 = -1;
                                }
                                switch (n18) {
                                    case 25: {
                                        n19 = 16777216;
                                        break Label_3527;
                                    }
                                    case 24: {
                                        n19 = 4194304;
                                        break Label_3527;
                                    }
                                    case 23: {
                                        n19 = 1048576;
                                        break Label_3527;
                                    }
                                    case 22: {
                                        n19 = 262144;
                                        break Label_3527;
                                    }
                                    case 21: {
                                        n19 = 65536;
                                        break Label_3527;
                                    }
                                    case 20: {
                                        n19 = 16384;
                                        break Label_3527;
                                    }
                                    case 19: {
                                        n19 = 4096;
                                        break Label_3527;
                                    }
                                    case 18: {
                                        n19 = 1024;
                                        break Label_3527;
                                    }
                                    case 17: {
                                        n19 = 33554432;
                                        break Label_3527;
                                    }
                                    case 16: {
                                        n19 = 8388608;
                                        break Label_3527;
                                    }
                                    case 15: {
                                        n19 = 2097152;
                                        break Label_3527;
                                    }
                                    case 14: {
                                        n19 = 524288;
                                        break Label_3527;
                                    }
                                    case 13: {
                                        n19 = 131072;
                                        break Label_3527;
                                    }
                                    case 12: {
                                        n19 = 32768;
                                        break Label_3527;
                                    }
                                    case 11: {
                                        n19 = 8192;
                                        break Label_3527;
                                    }
                                    case 10: {
                                        n19 = 2048;
                                        break Label_3527;
                                    }
                                    case 9: {
                                        n19 = 256;
                                        break Label_3527;
                                    }
                                    case 8: {
                                        n19 = 64;
                                        break Label_3527;
                                    }
                                    case 7: {
                                        n19 = 16;
                                        break Label_3527;
                                    }
                                    case 6: {
                                        n19 = 4;
                                        break Label_3527;
                                    }
                                    case 5: {
                                        n19 = 1;
                                        break Label_3527;
                                    }
                                    case 4: {
                                        n19 = 512;
                                        break Label_3527;
                                    }
                                    case 3: {
                                        n19 = 128;
                                        break Label_3527;
                                    }
                                    case 2: {
                                        n19 = 32;
                                        break Label_3527;
                                    }
                                    case 1: {
                                        n19 = 8;
                                        break Label_3527;
                                    }
                                    case 0: {
                                        n19 = 2;
                                        break Label_3527;
                                    }
                                }
                            }
                            n19 = null;
                        }
                        if (n19 != null) {
                            final Pair pair3 = new Pair((Object)n17, (Object)n19);
                            return (Pair<Integer, Integer>)pair3;
                        }
                        final String value12 = String.valueOf(s3);
                        String concat12;
                        if (value12.length() != 0) {
                            concat12 = "Unknown HEVC level string: ".concat(value12);
                        }
                        else {
                            concat12 = new String("Unknown HEVC level string: ");
                        }
                        Log.w("MediaCodecUtil", concat12);
                    }
                }
                final Pair pair3 = null;
                return (Pair<Integer, Integer>)pair3;
            }
            case 1:
            case 2: {
                final String n20 = n.n;
                if (split.length < 2) {
                    final String value13 = String.valueOf(n20);
                    String concat13;
                    if (value13.length() != 0) {
                        concat13 = "Ignoring malformed AVC codec string: ".concat(value13);
                    }
                    else {
                        concat13 = new String("Ignoring malformed AVC codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat13);
                }
                else {
                    try {
                        int n21;
                        int n22;
                        if (split[1].length() == 6) {
                            n21 = Integer.parseInt(split[1].substring(0, 2), 16);
                            n22 = Integer.parseInt(split[1].substring(4), 16);
                        }
                        else {
                            if (split.length < 3) {
                                final String value14 = String.valueOf(n20);
                                String concat14;
                                if (value14.length() != 0) {
                                    concat14 = "Ignoring malformed AVC codec string: ".concat(value14);
                                }
                                else {
                                    concat14 = new String("Ignoring malformed AVC codec string: ");
                                }
                                Log.w("MediaCodecUtil", concat14);
                                return null;
                            }
                            n21 = Integer.parseInt(split[1]);
                            n22 = Integer.parseInt(split[2]);
                        }
                        int n24 = 0;
                        Label_3858: {
                            int n23;
                            if (n21 != 66) {
                                n23 = n5;
                                if (n21 != 77) {
                                    if (n21 != 88) {
                                        if (n21 != 100) {
                                            if (n21 != 110) {
                                                if (n21 != 122) {
                                                    if (n21 != 244) {
                                                        n24 = -1;
                                                        break Label_3858;
                                                    }
                                                    n23 = 64;
                                                }
                                                else {
                                                    n23 = 32;
                                                }
                                            }
                                            else {
                                                n23 = 16;
                                            }
                                        }
                                        else {
                                            n23 = 8;
                                        }
                                    }
                                    else {
                                        n23 = 4;
                                    }
                                }
                            }
                            else {
                                n23 = 1;
                            }
                            n24 = n23;
                        }
                        if (n24 == -1) {
                            d.w(32, "Unknown AVC profile: ", n21, "MediaCodecUtil");
                        }
                        else {
                            int n25 = 0;
                            Label_4143: {
                                switch (n22) {
                                    default: {
                                        switch (n22) {
                                            default: {
                                                n25 = n3;
                                                switch (n22) {
                                                    default: {
                                                        switch (n22) {
                                                            default: {
                                                                switch (n22) {
                                                                    default: {
                                                                        n25 = -1;
                                                                        break Label_4143;
                                                                    }
                                                                    case 52: {
                                                                        n25 = 65536;
                                                                        break Label_4143;
                                                                    }
                                                                    case 51: {
                                                                        n25 = 32768;
                                                                        break Label_4143;
                                                                    }
                                                                    case 50: {
                                                                        n25 = 16384;
                                                                        break Label_4143;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 42: {
                                                                n25 = 8192;
                                                                break Label_4143;
                                                            }
                                                            case 41: {
                                                                n25 = 4096;
                                                                break Label_4143;
                                                            }
                                                            case 40: {
                                                                n25 = 2048;
                                                                break Label_4143;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 31: {
                                                        break Label_4143;
                                                    }
                                                    case 32: {
                                                        n25 = 1024;
                                                        break Label_4143;
                                                    }
                                                    case 30: {
                                                        n25 = 256;
                                                        break Label_4143;
                                                    }
                                                }
                                                break;
                                            }
                                            case 22: {
                                                n25 = 128;
                                                break Label_4143;
                                            }
                                            case 21: {
                                                n25 = 64;
                                                break Label_4143;
                                            }
                                            case 20: {
                                                n25 = 32;
                                                break Label_4143;
                                            }
                                        }
                                        break;
                                    }
                                    case 13: {
                                        n25 = 16;
                                        break;
                                    }
                                    case 12: {
                                        n25 = 8;
                                        break;
                                    }
                                    case 11: {
                                        n25 = 4;
                                        break;
                                    }
                                    case 10: {
                                        n25 = 1;
                                        break;
                                    }
                                }
                            }
                            if (n25 != -1) {
                                final Pair pair4 = new Pair((Object)n24, (Object)n25);
                                return (Pair<Integer, Integer>)pair4;
                            }
                            d.w(30, "Unknown AVC level: ", n22, "MediaCodecUtil");
                        }
                    }
                    catch (final NumberFormatException ex3) {
                        final String value15 = String.valueOf(n20);
                        String concat15;
                        if (value15.length() != 0) {
                            concat15 = "Ignoring malformed AVC codec string: ".concat(value15);
                        }
                        else {
                            concat15 = new String("Ignoring malformed AVC codec string: ");
                        }
                        Log.w("MediaCodecUtil", concat15);
                    }
                }
                final Pair pair4 = null;
                return (Pair<Integer, Integer>)pair4;
            }
            case 0: {
                final String n26 = n.n;
                final bd.b c = n.C;
                if (split.length < 4) {
                    final String value16 = String.valueOf(n26);
                    String concat16;
                    if (value16.length() != 0) {
                        concat16 = "Ignoring malformed AV1 codec string: ".concat(value16);
                    }
                    else {
                        concat16 = new String("Ignoring malformed AV1 codec string: ");
                    }
                    Log.w("MediaCodecUtil", concat16);
                }
                else {
                    try {
                        final int int4 = Integer.parseInt(split[1]);
                        final int int5 = Integer.parseInt(split[2].substring(0, 2));
                        final int int6 = Integer.parseInt(split[3]);
                        if (int4 != 0) {
                            d.w(32, "Unknown AV1 profile: ", int4, "MediaCodecUtil");
                        }
                        else if (int6 != 8 && int6 != 10) {
                            d.w(34, "Unknown AV1 bit depth: ", int6, "MediaCodecUtil");
                        }
                        else {
                            int n27 = 0;
                            Label_4468: {
                                if (int6 == 8) {
                                    n27 = 1;
                                }
                                else {
                                    Label_4465: {
                                        if (c != null) {
                                            if (c.i == null) {
                                                final int h = c.h;
                                                if (h != 7 && h != 6) {
                                                    break Label_4465;
                                                }
                                            }
                                            n27 = 4096;
                                            break Label_4468;
                                        }
                                    }
                                    n27 = 2;
                                }
                            }
                            int n28 = n3;
                            while (true) {
                                switch (int5) {
                                    default: {
                                        n28 = -1;
                                    }
                                    case 9: {
                                        if (n28 == -1) {
                                            d.w(30, "Unknown AV1 level: ", int5, "MediaCodecUtil");
                                            break;
                                        }
                                        final Pair pair5 = new Pair((Object)n27, (Object)n28);
                                        return (Pair<Integer, Integer>)pair5;
                                    }
                                    case 23: {
                                        n28 = 8388608;
                                        continue;
                                    }
                                    case 22: {
                                        n28 = 4194304;
                                        continue;
                                    }
                                    case 21: {
                                        n28 = 2097152;
                                        continue;
                                    }
                                    case 20: {
                                        n28 = 1048576;
                                        continue;
                                    }
                                    case 19: {
                                        n28 = 524288;
                                        continue;
                                    }
                                    case 18: {
                                        n28 = 262144;
                                        continue;
                                    }
                                    case 17: {
                                        n28 = 131072;
                                        continue;
                                    }
                                    case 16: {
                                        n28 = 65536;
                                        continue;
                                    }
                                    case 15: {
                                        n28 = 32768;
                                        continue;
                                    }
                                    case 14: {
                                        n28 = 16384;
                                        continue;
                                    }
                                    case 13: {
                                        n28 = 8192;
                                        continue;
                                    }
                                    case 12: {
                                        n28 = 4096;
                                        continue;
                                    }
                                    case 11: {
                                        n28 = 2048;
                                        continue;
                                    }
                                    case 10: {
                                        n28 = 1024;
                                        continue;
                                    }
                                    case 8: {
                                        n28 = 256;
                                        continue;
                                    }
                                    case 7: {
                                        n28 = 128;
                                        continue;
                                    }
                                    case 6: {
                                        n28 = 64;
                                        continue;
                                    }
                                    case 5: {
                                        n28 = 32;
                                        continue;
                                    }
                                    case 4: {
                                        n28 = 16;
                                        continue;
                                    }
                                    case 3: {
                                        n28 = 8;
                                        continue;
                                    }
                                    case 2: {
                                        n28 = 4;
                                        continue;
                                    }
                                    case 1: {
                                        n28 = 2;
                                        continue;
                                    }
                                    case 0: {
                                        n28 = 1;
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    catch (final NumberFormatException ex4) {
                        final String value17 = String.valueOf(n26);
                        String concat17;
                        if (value17.length() != 0) {
                            concat17 = "Ignoring malformed AV1 codec string: ".concat(value17);
                        }
                        else {
                            concat17 = new String("Ignoring malformed AV1 codec string: ");
                        }
                        Log.w("MediaCodecUtil", concat17);
                    }
                }
                final Pair pair5 = null;
                return (Pair<Integer, Integer>)pair5;
            }
        }
    }
    
    public static d e(final String s) throws DecoderQueryException {
        final List<d> f = f(s, false, false);
        d d;
        if (f.isEmpty()) {
            d = null;
        }
        else {
            d = f.get(0);
        }
        return d;
    }
    
    public static List<d> f(final String s, final boolean b, final boolean b2) throws DecoderQueryException {
        synchronized (MediaCodecUtil.class) {
            final b b3 = new b(s, b, b2);
            final HashMap<b, List<d>> b4 = MediaCodecUtil.b;
            final List list = b4.get(b3);
            if (list != null) {
                return list;
            }
            final int a = c0.a;
            Object o;
            if (a >= 21) {
                o = new MediaCodecUtil.MediaCodecUtil$e(b, b2);
            }
            else {
                o = new MediaCodecUtil.MediaCodecUtil$d();
            }
            ArrayList<d> list3;
            final ArrayList<d> list2 = list3 = g(b3, (c)o);
            if (b) {
                list3 = list2;
                if (list2.isEmpty()) {
                    list3 = list2;
                    if (21 <= a) {
                        list3 = list2;
                        if (a <= 23) {
                            final ArrayList<d> list4 = list3 = g(b3, (c)new MediaCodecUtil.MediaCodecUtil$d());
                            if (!list4.isEmpty()) {
                                final String a2 = list4.get(0).a;
                                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 63 + String.valueOf(a2).length());
                                sb.append("MediaCodecList API didn't list secure decoder for: ");
                                sb.append(s);
                                sb.append(". Assuming: ");
                                sb.append(a2);
                                Log.w("MediaCodecUtil", sb.toString());
                                list3 = list4;
                            }
                        }
                    }
                }
            }
            a(s, list3);
            final ImmutableList copy = ImmutableList.copyOf((Collection)list3);
            b4.put(b3, (List)copy);
            return (List<d>)copy;
        }
    }
    
    public static ArrayList<d> g(final b b, final c c) throws DecoderQueryException {
        try {
            final ArrayList<d> list = new ArrayList<d>();
            final String a = b.a;
            final int d = c.d();
            final boolean e = c.e();
            for (int i = 0; i < d; ++i) {
                final MediaCodecInfo b2 = c.b(i);
                final int a2 = c0.a;
                final String name;
                final String c2;
                Object capabilitiesForType = null;
                Label_0247: {
                    if (a2 >= 29 && b1.h(b2)) {
                        break Label_0247;
                    }
                    name = b2.getName();
                    if (!h(b2, name, e, a)) {
                        break Label_0247;
                    }
                    c2 = c(b2, name, a);
                    if (c2 == null) {
                        break Label_0247;
                    }
                    try {
                        capabilitiesForType = b2.getCapabilitiesForType(c2);
                        final boolean c3 = c.c("tunneled-playback", c2, (MediaCodecInfo$CodecCapabilities)capabilitiesForType);
                        final boolean a3 = c.a("tunneled-playback", (MediaCodecInfo$CodecCapabilities)capabilitiesForType);
                        final boolean c4 = b.c;
                        if (c4 || !a3) {
                            if (!c4 || c3) {
                                final boolean c5 = c.c("secure-playback", c2, (MediaCodecInfo$CodecCapabilities)capabilitiesForType);
                                final boolean a4 = c.a("secure-playback", (MediaCodecInfo$CodecCapabilities)capabilitiesForType);
                                final boolean b3 = b.b;
                                if ((b3 || !a4) && (!b3 || c5)) {
                                    boolean h;
                                    if (a2 >= 29) {
                                        h = l0.h(b2);
                                    }
                                    else {
                                        h = (i(b2, a) ^ true);
                                    }
                                    boolean l = true;
                                    final boolean j = i(b2, a);
                                    if (a2 >= 29) {
                                        l = c1.l(b2);
                                    }
                                    else {
                                        final String p2 = lw0.b.P2(b2.getName());
                                        if (p2.startsWith("omx.google.") || p2.startsWith("c2.android.") || p2.startsWith("c2.google.")) {
                                            l = false;
                                        }
                                    }
                                    Label_0409: {
                                        if (!e || b.b != c5) {
                                            if (e || b.b) {
                                                break Label_0409;
                                            }
                                        }
                                        try {
                                            list.add(com.google.android.exoplayer2.mediacodec.d.g(name, a, c2, (MediaCodecInfo$CodecCapabilities)capabilitiesForType, h, j, l, false));
                                            continue;
                                            list.add(com.google.android.exoplayer2.mediacodec.d.g(String.valueOf(name).concat(".secure"), a, c2, (MediaCodecInfo$CodecCapabilities)capabilitiesForType, h, j, l, true));
                                            return list;
                                            iftrue(Label_0540:)(e || !c5);
                                        }
                                        catch (final Exception capabilitiesForType) {}
                                    }
                                }
                            }
                        }
                        continue;
                    }
                    catch (final Exception ex) {}
                }
                if (c0.a > 23 || list.isEmpty()) {
                    final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + c2.length());
                    sb.append("Failed to query codec ");
                    sb.append(name);
                    sb.append(" (");
                    sb.append(c2);
                    sb.append(")");
                    Log.e("MediaCodecUtil", sb.toString());
                    throw capabilitiesForType;
                }
                capabilitiesForType = new StringBuilder(String.valueOf(name).length() + 46);
                ((StringBuilder)capabilitiesForType).append("Skipping codec ");
                ((StringBuilder)capabilitiesForType).append(name);
                ((StringBuilder)capabilitiesForType).append(" (failed to query capabilities)");
                Log.e("MediaCodecUtil", ((StringBuilder)capabilitiesForType).toString());
            }
            return list;
        }
        catch (final Exception ex2) {
            throw new DecoderQueryException(ex2, null);
        }
    }
    
    public static boolean h(final MediaCodecInfo mediaCodecInfo, final String s, final boolean b, final String s2) {
        if (mediaCodecInfo.isEncoder() || (!b && s.endsWith(".secure"))) {
            return false;
        }
        final int a = c0.a;
        if (a < 21 && ("CIPAACDecoder".equals(s) || "CIPMP3Decoder".equals(s) || "CIPVorbisDecoder".equals(s) || "CIPAMRNBDecoder".equals(s) || "AACDecoder".equals(s) || "MP3Decoder".equals(s))) {
            return false;
        }
        if (a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(s)) {
            final String b2 = c0.b;
            if ("a70".equals(b2) || ("Xiaomi".equals(c0.c) && b2.startsWith("HM"))) {
                return false;
            }
        }
        if (a == 16 && "OMX.qcom.audio.decoder.mp3".equals(s)) {
            final String b3 = c0.b;
            if ("dlxu".equals(b3) || "protou".equals(b3) || "ville".equals(b3) || "villeplus".equals(b3) || "villec2".equals(b3) || b3.startsWith("gee") || "C6602".equals(b3) || "C6603".equals(b3) || "C6606".equals(b3) || "C6616".equals(b3) || "L36h".equals(b3) || "SO-02E".equals(b3)) {
                return false;
            }
        }
        if (a == 16 && "OMX.qcom.audio.decoder.aac".equals(s)) {
            final String b4 = c0.b;
            if ("C1504".equals(b4) || "C1505".equals(b4) || "C1604".equals(b4) || "C1605".equals(b4)) {
                return false;
            }
        }
        if (a < 24 && ("OMX.SEC.aac.dec".equals(s) || "OMX.Exynos.AAC.Decoder".equals(s)) && "samsung".equals(c0.c)) {
            final String b5 = c0.b;
            if (b5.startsWith("zeroflte") || b5.startsWith("zerolte") || b5.startsWith("zenlte") || "SC-05G".equals(b5) || "marinelteatt".equals(b5) || "404SC".equals(b5) || "SC-04G".equals(b5) || "SCV31".equals(b5)) {
                return false;
            }
        }
        if (a <= 19 && "OMX.SEC.vp8.dec".equals(s) && "samsung".equals(c0.c)) {
            final String b6 = c0.b;
            if (b6.startsWith("d2") || b6.startsWith("serrano") || b6.startsWith("jflte") || b6.startsWith("santos") || b6.startsWith("t0")) {
                return false;
            }
        }
        return (a > 19 || !c0.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(s)) && (a > 23 || !"audio/eac3-joc".equals(s2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(s));
    }
    
    public static boolean i(final MediaCodecInfo mediaCodecInfo, final String s) {
        if (c0.a >= 29) {
            return f2.g(mediaCodecInfo);
        }
        final boolean k = o.k(s);
        final boolean b = true;
        if (k) {
            return true;
        }
        final String p2 = lw0.b.P2(mediaCodecInfo.getName());
        if (p2.startsWith("arc.")) {
            return false;
        }
        boolean b2 = b;
        if (!p2.startsWith("omx.google.")) {
            b2 = b;
            if (!p2.startsWith("omx.ffmpeg.")) {
                if (p2.startsWith("omx.sec.")) {
                    b2 = b;
                    if (p2.contains(".sw.")) {
                        return b2;
                    }
                }
                b2 = b;
                if (!p2.equals("omx.qcom.video.decoder.hevcswvdec")) {
                    b2 = b;
                    if (!p2.startsWith("c2.android.")) {
                        b2 = b;
                        if (!p2.startsWith("c2.google.")) {
                            b2 = (!p2.startsWith("omx.") && !p2.startsWith("c2.") && b);
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public static int j() throws DecoderQueryException {
        if (MediaCodecUtil.c == -1) {
            final d e = e("video/avc");
            int max = 0;
            int i = 0;
            if (e != null) {
                final MediaCodecInfo$CodecCapabilities d = e.d;
                MediaCodecInfo$CodecProfileLevel[] profileLevels;
                if (d == null || (profileLevels = d.profileLevels) == null) {
                    profileLevels = new MediaCodecInfo$CodecProfileLevel[0];
                }
                final int length = profileLevels.length;
                int max2 = 0;
                while (i < length) {
                    final int level = profileLevels[i].level;
                    int n = 0;
                    if (level != 1 && level != 2) {
                        switch (level) {
                            default: {
                                n = -1;
                                break;
                            }
                            case 131072:
                            case 262144:
                            case 524288: {
                                n = 35651584;
                                break;
                            }
                            case 32768:
                            case 65536: {
                                n = 9437184;
                                break;
                            }
                            case 16384: {
                                n = 5652480;
                                break;
                            }
                            case 8192: {
                                n = 2228224;
                                break;
                            }
                            case 2048:
                            case 4096: {
                                n = 2097152;
                                break;
                            }
                            case 1024: {
                                n = 1310720;
                                break;
                            }
                            case 512: {
                                n = 921600;
                                break;
                            }
                            case 128:
                            case 256: {
                                n = 414720;
                                break;
                            }
                            case 64: {
                                n = 202752;
                                break;
                            }
                            case 8:
                            case 16:
                            case 32: {
                                n = 101376;
                                break;
                            }
                        }
                    }
                    else {
                        n = 25344;
                    }
                    max2 = Math.max(n, max2);
                    ++i;
                }
                int n2;
                if (c0.a >= 21) {
                    n2 = 345600;
                }
                else {
                    n2 = 172800;
                }
                max = Math.max(max2, n2);
            }
            MediaCodecUtil.c = max;
        }
        return MediaCodecUtil.c;
    }
    
    public static class DecoderQueryException extends Exception
    {
        public DecoderQueryException(final Throwable t, final MediaCodecUtil$a object) {
            super("Failed to query underlying media codecs", t);
        }
    }
    
    public static final class b
    {
        public final String a;
        public final boolean b;
        public final boolean c;
        
        public b(final String a, final boolean b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && o.getClass() == b.class) {
                final b b2 = (b)o;
                if (!TextUtils.equals((CharSequence)this.a, (CharSequence)b2.a) || this.b != b2.b || this.c != b2.c) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int c = b.c(this.a, 31, 31);
            final boolean b = this.b;
            int n = 1231;
            int n2;
            if (b) {
                n2 = 1231;
            }
            else {
                n2 = 1237;
            }
            if (!this.c) {
                n = 1237;
            }
            return (c + n2) * 31 + n;
        }
    }
    
    public interface c
    {
        boolean a(final String p0, final MediaCodecInfo$CodecCapabilities p1);
        
        MediaCodecInfo b(final int p0);
        
        boolean c(final String p0, final String p1, final MediaCodecInfo$CodecCapabilities p2);
        
        int d();
        
        boolean e();
    }
    
    public interface f<T>
    {
        int f(final T p0);
    }
}
