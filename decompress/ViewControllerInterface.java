// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.view;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import java.util.Iterator;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class ViewControllerInterface
{
    public static final List<String> list;
    
    static {
        Covode.recordClassIndex(2868);
        final List<String> list2 = list = Arrays.asList("effect");
        try {
            final Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                INVOKESTATIC_com_bef_effectsdk_view_ViewControllerInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(iterator.next());
            }
        }
        finally {}
    }
    
    public static void INVOKESTATIC_com_bef_effectsdk_view_ViewControllerInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(final String s) {
        5pn.LIZ(s);
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ(s);
        5pn.LIZ(uptimeMillis, s);
        5pn.LIZIZ(s);
    }
    
    public static int addMessageListener(final long n, final NativeMessageListener nativeMessageListener) {
        MethodCollector.i(2879);
        final int nativeAddMessageListener = nativeAddMessageListener(n, nativeMessageListener);
        MethodCollector.o(2879);
        return nativeAddMessageListener;
    }
    
    public static int attachEffect(final long n, final long n2) {
        MethodCollector.i(2162);
        final int nativeAttachEffect = nativeAttachEffect(n, n2);
        MethodCollector.o(2162);
        return nativeAttachEffect;
    }
    
    public static void createHandle(final long[] array) {
        MethodCollector.i(2154);
        nativeCreateHandle(array, 0);
        MethodCollector.o(2154);
    }
    
    public static void createHandle(final long[] array, final int n) {
        MethodCollector.i(2155);
        nativeCreateHandle(array, n);
        MethodCollector.o(2155);
    }
    
    public static int createTexture(int nativeCreateTexture, final int n, final int n2, final int n3, final int n4) {
        MethodCollector.i(2891);
        nativeCreateTexture = nativeCreateTexture(nativeCreateTexture, n, n2, n3, n4);
        MethodCollector.o(2891);
        return nativeCreateTexture;
    }
    
    public static int deleteTexture(int nativeDeleteTexture) {
        MethodCollector.i(2902);
        nativeDeleteTexture = nativeDeleteTexture(nativeDeleteTexture);
        MethodCollector.o(2902);
        return nativeDeleteTexture;
    }
    
    public static int destroy(final long n) {
        MethodCollector.i(2697);
        final int nativeDestroy = nativeDestroy(n);
        MethodCollector.o(2697);
        return nativeDestroy;
    }
    
    public static int init(final long n, int nativeInit, final int n2) {
        MethodCollector.i(2160);
        nativeInit = nativeInit(n, nativeInit, n2);
        MethodCollector.o(2160);
        return nativeInit;
    }
    
    public static native int nativeAddMessageListener(final long p0, final NativeMessageListener p1);
    
    public static native int nativeAttachEffect(final long p0, final long p1);
    
    public static native void nativeCreateHandle(final long[] p0);
    
    public static native void nativeCreateHandle(final long[] p0, final int p1);
    
    public static native int nativeCreateTexture(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public static native int nativeDeleteTexture(final int p0);
    
    public static native int nativeDestroy(final long p0);
    
    public static native int nativeInit(final long p0, final int p1, final int p2);
    
    public static native void nativeOnPause(final long p0);
    
    public static native void nativeOnResume(final long p0);
    
    public static native int nativePostMessage(final long p0, final long p1, final long p2, final long p3, final String p4);
    
    public static native int nativeProcess(final long p0, final int p1, final int p2, final int p3, final float[] p4, final float[] p5, final double p6);
    
    public static native int nativeRemoveMessageListener(final long p0, final NativeMessageListener p1);
    
    public static native int nativeSetRenderCacheData(final long p0, final String p1, final String p2);
    
    public static native int nativeSetRenderCacheTexture(final long p0, final String p1, final String p2);
    
    public static native int nativeSetRenderCacheTextureWithBuffer(final long p0, final String p1, final byte[] p2, final int p3, final int p4);
    
    public static native int nativeSetResourceFinder(final long p0, final long p1, final long p2);
    
    public static native int nativeSetStickerPath(final long p0, final String p1);
    
    public static native int nativeTouchEvent(final long p0, final int p1, final int[] p2, final float[] p3, final float[] p4, final int p5);
    
    public static void onPause(final long n) {
        MethodCollector.i(2688);
        nativeOnPause(n);
        MethodCollector.o(2688);
    }
    
    public static void onResume(final long n) {
        MethodCollector.i(2695);
        nativeOnResume(n);
        MethodCollector.o(2695);
    }
    
    public static int postMessage(final long n, final long n2, final long n3, final long n4, final String s) {
        MethodCollector.i(2854);
        final int nativePostMessage = nativePostMessage(n, n2, n3, n4, s);
        MethodCollector.o(2854);
        return nativePostMessage;
    }
    
    public static int processFrame(final long n, int nativeProcess, final int n2, final int n3, final float[] array, final float[] array2, final double n4) {
        MethodCollector.i(2682);
        nativeProcess = nativeProcess(n, nativeProcess, n2, n3, array, array2, n4);
        MethodCollector.o(2682);
        return nativeProcess;
    }
    
    public static int removeMessageListener(final long n, final NativeMessageListener nativeMessageListener) {
        MethodCollector.i(2886);
        final int nativeRemoveMessageListener = nativeRemoveMessageListener(n, nativeMessageListener);
        MethodCollector.o(2886);
        return nativeRemoveMessageListener;
    }
    
    public static int setRenderCacheData(final long n, final String s, final String s2) {
        MethodCollector.i(2920);
        final int nativeSetRenderCacheData = nativeSetRenderCacheData(n, s, s2);
        MethodCollector.o(2920);
        return nativeSetRenderCacheData;
    }
    
    public static int setRenderCacheTexture(final long n, final String s, final String s2) {
        MethodCollector.i(2940);
        final int nativeSetRenderCacheTexture = nativeSetRenderCacheTexture(n, s, s2);
        MethodCollector.o(2940);
        return nativeSetRenderCacheTexture;
    }
    
    public static int setRenderCacheTextureWithBuffer(final long n, final String s, final byte[] array, int nativeSetRenderCacheTextureWithBuffer, final int n2) {
        MethodCollector.i(2956);
        nativeSetRenderCacheTextureWithBuffer = nativeSetRenderCacheTextureWithBuffer(n, s, array, nativeSetRenderCacheTextureWithBuffer, n2);
        MethodCollector.o(2956);
        return nativeSetRenderCacheTextureWithBuffer;
    }
    
    public static int setResourceFinder(final long n, final long n2, final long n3) {
        MethodCollector.i(2972);
        final int nativeSetResourceFinder = nativeSetResourceFinder(n, n2, n3);
        MethodCollector.o(2972);
        return nativeSetResourceFinder;
    }
    
    public static int setStickerPath(final long n, final String s) {
        MethodCollector.i(2676);
        final int nativeSetStickerPath = nativeSetStickerPath(n, s);
        MethodCollector.o(2676);
        return nativeSetStickerPath;
    }
    
    public static int touchBeginEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2736);
        final int nativeTouchEvent = nativeTouchEvent(n, 0, array, array2, array3, array.length);
        MethodCollector.o(2736);
        return nativeTouchEvent;
    }
    
    public static int touchBeginEvent(final long n, final int[] array, final float[] array2, final float[] array3, int nativeTouchEvent) {
        MethodCollector.i(2783);
        nativeTouchEvent = nativeTouchEvent(n, 0, array, array2, array3, nativeTouchEvent);
        MethodCollector.o(2783);
        return nativeTouchEvent;
    }
    
    public static int touchEndEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2770);
        final int nativeTouchEvent = nativeTouchEvent(n, 1, array, array2, array3, array.length);
        MethodCollector.o(2770);
        return nativeTouchEvent;
    }
    
    public static int touchEndEvent(final long n, final int[] array, final float[] array2, final float[] array3, int nativeTouchEvent) {
        MethodCollector.i(2823);
        nativeTouchEvent = nativeTouchEvent(n, 1, array, array2, array3, nativeTouchEvent);
        MethodCollector.o(2823);
        return nativeTouchEvent;
    }
    
    public static int touchMoveEvent(final long n, final int[] array, final float[] array2, final float[] array3) {
        MethodCollector.i(2761);
        final int nativeTouchEvent = nativeTouchEvent(n, 2, array, array2, array3, array.length);
        MethodCollector.o(2761);
        return nativeTouchEvent;
    }
    
    public static int touchMoveEvent(final long n, final int[] array, final float[] array2, final float[] array3, int nativeTouchEvent) {
        MethodCollector.i(2813);
        nativeTouchEvent = nativeTouchEvent(n, 2, array, array2, array3, nativeTouchEvent);
        MethodCollector.o(2813);
        return nativeTouchEvent;
    }
    
    public interface NativeMessageListener
    {
        default static {
            Covode.recordClassIndex(2869);
        }
        
        int nativeOnMsgReceived(final long p0, final long p1, final long p2, final String p3);
    }
}
