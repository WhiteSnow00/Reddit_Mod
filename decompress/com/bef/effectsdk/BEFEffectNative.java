// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import java.util.Iterator;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class BEFEffectNative
{
    public static final List<String> list;
    
    static {
        Covode.recordClassIndex(2771);
        final List<String> list2 = list = Arrays.asList("effect");
        try {
            final Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                INVOKESTATIC_com_bef_effectsdk_BEFEffectNative_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(iterator.next());
            }
        }
        finally {}
    }
    
    public static void INVOKESTATIC_com_bef_effectsdk_BEFEffectNative_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(final String s) {
        5pn.LIZ(s);
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ(s);
        5pn.LIZ(uptimeMillis, s);
        5pn.LIZIZ(s);
    }
    
    public static long createHandle(final boolean b) {
        MethodCollector.i(4005);
        final long nativeCreateHandle = nativeCreateHandle(b);
        MethodCollector.o(4005);
        return nativeCreateHandle;
    }
    
    public static int destroyHandle(final long n) {
        MethodCollector.i(4009);
        final int nativeDestroyHandle = nativeDestroyHandle(n);
        MethodCollector.o(4009);
        return nativeDestroyHandle;
    }
    
    public static String getEffectSDKVersion() {
        MethodCollector.i(6109);
        final String nativeGetEffectSDKVersion = nativeGetEffectSDKVersion();
        MethodCollector.o(6109);
        return nativeGetEffectSDKVersion;
    }
    
    public static int initResourceFinder(final long n, final ResourceFinder resourceFinder, int nativeInitResourceFinder, final int n2, final String s) {
        MethodCollector.i(4109);
        nativeInitResourceFinder = nativeInitResourceFinder(n, resourceFinder, nativeInitResourceFinder, n2, s);
        MethodCollector.o(4109);
        return nativeInitResourceFinder;
    }
    
    public static native long nativeCreateHandle(final boolean p0);
    
    public static native int nativeDestroyHandle(final long p0);
    
    public static native String nativeGetEffectSDKVersion();
    
    public static native int nativeInitResourceFinder(final long p0, final ResourceFinder p1, final int p2, final int p3, final String p4);
    
    public static native int nativeProcessAlgorithm(final long p0, final int p1, final int p2, final int p3, final double p4);
    
    public static native int nativeProcessFrame(final long p0, final int p1, final int p2, final int p3, final int p4, final double p5);
    
    public static native int nativeReleaseResourceFinder(final long p0, final ResourceFinder p1);
    
    public static native int nativeSendMessage(final long p0, final long p1, final long p2, final long p3, final String p4);
    
    public static native void nativeSetCameraPosition(final long p0, final boolean p1);
    
    public static native void nativeSetFrameOrientation(final long p0, final int p1);
    
    public static native void nativeSetOrientation(final long p0, final int p1);
    
    public static native int nativeSetStickerPath(final long p0, final String p1);
    
    public static native int nativeTouchEvent(final long p0, final int p1, final int[] p2, final float[] p3, final float[] p4);
    
    public static int processAlgorithm(final long n, int nativeProcessAlgorithm, final int n2, final int n3, final double n4) {
        MethodCollector.i(4296);
        nativeProcessAlgorithm = nativeProcessAlgorithm(n, nativeProcessAlgorithm, n2, n3, n4);
        MethodCollector.o(4296);
        return nativeProcessAlgorithm;
    }
    
    public static int processFrame(final long n, int nativeProcessFrame, final int n2, final int n3, final int n4, final double n5) {
        MethodCollector.i(4309);
        nativeProcessFrame = nativeProcessFrame(n, nativeProcessFrame, n2, n3, n4, n5);
        MethodCollector.o(4309);
        return nativeProcessFrame;
    }
    
    public static int releaseResourceFinder(final long n, final ResourceFinder resourceFinder) {
        MethodCollector.i(4273);
        final int nativeReleaseResourceFinder = nativeReleaseResourceFinder(n, resourceFinder);
        MethodCollector.o(4273);
        return nativeReleaseResourceFinder;
    }
    
    public static int sendMessage(final long n, final long n2, final long n3, final long n4, final String s) {
        MethodCollector.i(4314);
        final int nativeSendMessage = nativeSendMessage(n, n2, n3, n4, s);
        MethodCollector.o(4314);
        return nativeSendMessage;
    }
    
    public static void setCameraPosition(final long n, final boolean b) {
        MethodCollector.i(4625);
        nativeSetCameraPosition(n, b);
        MethodCollector.o(4625);
    }
    
    public static void setFrameOrientation(final long n, final int n2) {
        MethodCollector.i(4638);
        nativeSetFrameOrientation(n, n2);
        MethodCollector.o(4638);
    }
    
    public static void setOrientation(final long n, final int n2) {
        MethodCollector.i(4633);
        nativeSetOrientation(n, n2);
        MethodCollector.o(4633);
    }
    
    public static int setStickerPath(final long n, final String s) {
        MethodCollector.i(4281);
        final int nativeSetStickerPath = nativeSetStickerPath(n, s);
        MethodCollector.o(4281);
        return nativeSetStickerPath;
    }
    
    public static int touchBeginEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(4641);
        final int nativeTouchEvent = nativeTouchEvent(n, 0, array, array2, array3);
        MethodCollector.o(4641);
        return nativeTouchEvent;
    }
    
    public static int touchEndEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(4647);
        final int nativeTouchEvent = nativeTouchEvent(n, 2, array, array2, array3);
        MethodCollector.o(4647);
        return nativeTouchEvent;
    }
    
    public static int touchMoveEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(4644);
        final int nativeTouchEvent = nativeTouchEvent(n, 1, array, array2, array3);
        MethodCollector.o(4644);
        return nativeTouchEvent;
    }
}
