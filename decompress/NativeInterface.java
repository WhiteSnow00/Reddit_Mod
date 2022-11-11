// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.game;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import java.util.Iterator;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class NativeInterface
{
    public static final List<String> list;
    
    static {
        Covode.recordClassIndex(2830);
        final List<String> list2 = list = Arrays.asList("effect");
        try {
            final Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                INVOKESTATIC_com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(iterator.next());
            }
        }
        finally {}
    }
    
    public static void INVOKESTATIC_com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(final String s) {
        5pn.LIZ(s);
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ(s);
        5pn.LIZ(uptimeMillis, s);
        5pn.LIZIZ(s);
    }
    
    public static int addMessageListener(final long n, final NativeMessageListener nativeMessageListener) {
        MethodCollector.i(2305);
        final int nativeAddMessageListener = nativeAddMessageListener(n, nativeMessageListener);
        MethodCollector.o(2305);
        return nativeAddMessageListener;
    }
    
    public static void createHandle(final long[] array) {
        MethodCollector.i(2081);
        nativeCreateHandle(array);
        MethodCollector.o(2081);
    }
    
    public static int destroy(final long n) {
        MethodCollector.i(2117);
        final int nativeDestroy = nativeDestroy(n);
        MethodCollector.o(2117);
        return nativeDestroy;
    }
    
    public static int init(final long n, int nativeInit, final int n2) {
        MethodCollector.i(2082);
        nativeInit = nativeInit(n, nativeInit, n2);
        MethodCollector.o(2082);
        return nativeInit;
    }
    
    public static native int nativeAddMessageListener(final long p0, final NativeMessageListener p1);
    
    public static native void nativeCreateHandle(final long[] p0);
    
    public static native int nativeDestroy(final long p0);
    
    public static native int nativeInit(final long p0, final int p1, final int p2);
    
    public static native int nativePause(final long p0);
    
    public static native int nativePostMessage(final long p0, final long p1, final long p2, final long p3, final String p4);
    
    public static native int nativeProcess(final long p0, final int p1, final int p2, final double p3);
    
    public static native int nativeRemoveMessageListener(final long p0, final NativeMessageListener p1);
    
    public static native int nativeResume(final long p0);
    
    public static native int nativeSetSize(final long p0, final int p1, final int p2);
    
    public static native int nativeSetStickerPath(final long p0, final String p1);
    
    public static native int nativeTouchesBegin(final long p0, final int[] p1, final float[] p2, final float[] p3);
    
    public static native int nativeTouchesEnd(final long p0, final int[] p1, final float[] p2, final float[] p3);
    
    public static native int nativeTouchesMove(final long p0, final int[] p1, final float[] p2, final float[] p3);
    
    public static int pause(final long n) {
        MethodCollector.i(2101);
        final int nativePause = nativePause(n);
        MethodCollector.o(2101);
        return nativePause;
    }
    
    public static int postMessage(final long n, final long n2, final long n3, final long n4, final String s) {
        MethodCollector.i(2301);
        final int nativePostMessage = nativePostMessage(n, n2, n3, n4, s);
        MethodCollector.o(2301);
        return nativePostMessage;
    }
    
    public static int processFrame(final long n, int nativeProcess, final int n2, final double n3) {
        MethodCollector.i(2097);
        nativeProcess = nativeProcess(n, nativeProcess, n2, n3);
        MethodCollector.o(2097);
        return nativeProcess;
    }
    
    public static int removeMessageListener(final long n, final NativeMessageListener nativeMessageListener) {
        MethodCollector.i(2310);
        final int nativeRemoveMessageListener = nativeRemoveMessageListener(n, nativeMessageListener);
        MethodCollector.o(2310);
        return nativeRemoveMessageListener;
    }
    
    public static int resume(final long n) {
        MethodCollector.i(2106);
        final int nativeResume = nativeResume(n);
        MethodCollector.o(2106);
        return nativeResume;
    }
    
    public static int setGameBundlePath(final long n, final String s) {
        MethodCollector.i(2088);
        final int nativeSetStickerPath = nativeSetStickerPath(n, s);
        MethodCollector.o(2088);
        return nativeSetStickerPath;
    }
    
    public static int setSize(final long n, int nativeSetSize, final int n2) {
        MethodCollector.i(2093);
        nativeSetSize = nativeSetSize(n, nativeSetSize, n2);
        MethodCollector.o(2093);
        return nativeSetSize;
    }
    
    public static int touchesBegin(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2294);
        final int nativeTouchesBegin = nativeTouchesBegin(n, array, array2, array3);
        MethodCollector.o(2294);
        return nativeTouchesBegin;
    }
    
    public static int touchesEnd(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2297);
        final int nativeTouchesEnd = nativeTouchesEnd(n, array, array2, array3);
        MethodCollector.o(2297);
        return nativeTouchesEnd;
    }
    
    public static int touchesMove(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2295);
        final int nativeTouchesMove = nativeTouchesMove(n, array, array2, array3);
        MethodCollector.o(2295);
        return nativeTouchesMove;
    }
    
    public interface NativeMessageListener
    {
        default static {
            Covode.recordClassIndex(2831);
        }
        
        int nativeOnMsgReceived(final long p0, final long p1, final long p2, final String p3);
    }
}
