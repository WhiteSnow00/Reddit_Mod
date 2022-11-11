// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import java.util.ArrayList;
import java.util.List;
import com.bytedance.covode.number.Covode;

public class EffectSDKBuildConfig
{
    public static int ENABLE_AUDIO_EFFECT;
    public static int ENABLE_BORINGSSL;
    public static int ENABLE_BYTEBENCH;
    public static int ENABLE_FFMPEG;
    public static int ENABLE_IES_APPLOGGER;
    public static int ENABLE_JAZZ;
    public static int ENABLE_LENS;
    public static int ENABLE_SPEECH_ASR;
    public static int ENABLE_SPEECH_CAPT;
    public static int ENABLE_VC0;
    
    static {
        Covode.recordClassIndex(2775);
        EffectSDKBuildConfig.ENABLE_IES_APPLOGGER = 1;
        EffectSDKBuildConfig.ENABLE_AUDIO_EFFECT = 1;
        EffectSDKBuildConfig.ENABLE_FFMPEG = 1;
        EffectSDKBuildConfig.ENABLE_JAZZ = 1;
        EffectSDKBuildConfig.ENABLE_VC0 = 1;
        EffectSDKBuildConfig.ENABLE_BYTEBENCH = 1;
    }
    
    public static String getAarVersion() {
        return BuildConfig.FULL_VERSION;
    }
    
    public static List<String> getEffectLibs() {
        final ArrayList list = new ArrayList();
        list.add("c++_shared");
        if (EffectSDKBuildConfig.ENABLE_BYTEBENCH == 1) {
            list.add("bytebench");
        }
        if (EffectSDKBuildConfig.ENABLE_BORINGSSL == 1 || EffectSDKBuildConfig.ENABLE_FFMPEG == 1) {
            list.add("ttcrypto");
            list.add("ttboringssl");
        }
        if (EffectSDKBuildConfig.ENABLE_FFMPEG == 1) {
            list.add("ttffmpeg");
        }
        if (EffectSDKBuildConfig.ENABLE_IES_APPLOGGER == 1) {
            list.add("iesapplogger");
        }
        list.add("bytenn");
        if (EffectSDKBuildConfig.ENABLE_AUDIO_EFFECT == 1) {
            list.add("audioeffect");
        }
        if (EffectSDKBuildConfig.ENABLE_SPEECH_CAPT == 1 || EffectSDKBuildConfig.ENABLE_SPEECH_ASR == 1) {
            list.add("speechsdk");
        }
        list.add("gaia_lib");
        list.add("AGFX");
        if (EffectSDKBuildConfig.ENABLE_LENS == 1) {
            list.add("lens");
        }
        if (EffectSDKBuildConfig.ENABLE_JAZZ == 1) {
            list.add("napi");
            list.add("quick");
            list.add("jazz");
        }
        if (EffectSDKBuildConfig.ENABLE_VC0 == 1) {
            list.add("bytevc0");
        }
        list.add("effect");
        return list;
    }
    
    public static String getSdkVersion() {
        return "12.6.0";
    }
}
