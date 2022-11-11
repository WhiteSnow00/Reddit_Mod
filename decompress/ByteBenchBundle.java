// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import com.bytedance.covode.number.Covode;
import java.util.Queue;

public class ByteBenchBundle
{
    public static final Object sPoolSync;
    public static Queue<ByteBenchBundle> sPools;
    public long mHandle;
    
    static {
        Covode.recordClassIndex(2874);
        ByteBenchBundle.sPools = new ArrayDeque<ByteBenchBundle>(8);
        sPoolSync = new Object();
    }
    
    public ByteBenchBundle() {
        MethodCollector.i(17506);
        this.mHandle = this.nativeCreate();
        MethodCollector.o(17506);
    }
    
    public ByteBenchBundle(final long mHandle) {
        this.mHandle = mHandle;
    }
    
    public static void cleanAll() {
        MethodCollector.i(17504);
        final Object sPoolSync = ByteBenchBundle.sPoolSync;
        monitorenter(sPoolSync);
        try {
            if (!ByteBenchBundle.sPools.isEmpty()) {
                final int size = ByteBenchBundle.sPools.size();
                final long[] array = new long[size];
                for (int i = 0; i < size; ++i) {
                    final ByteBenchBundle byteBenchBundle = ByteBenchBundle.sPools.poll();
                    array[i] = byteBenchBundle.getHandle();
                    byteBenchBundle.mHandle = 0L;
                }
                nativeReleaseAll(array);
            }
        }
        finally {
            monitorexit(sPoolSync);
            MethodCollector.o(17504);
        }
    }
    
    private native long nativeCreate();
    
    private native boolean nativeGetBool(final long p0, final String p1);
    
    private native float nativeGetFloat(final long p0, final String p1);
    
    private native int nativeGetInt(final long p0, final String p1);
    
    private native int[] nativeGetIntArray(final long p0, final String p1);
    
    private native String nativeGetString(final long p0, final String p1);
    
    public static native void nativeRelease(final long p0);
    
    public static native void nativeReleaseAll(final long[] p0);
    
    private native int nativeSetBool(final long p0, final String p1, final boolean p2);
    
    private native int nativeSetBundle(final long p0, final String p1, final long p2);
    
    private native int nativeSetByteArray(final long p0, final String p1, final byte[] p2);
    
    private native int nativeSetDouble(final long p0, final String p1, final double p2);
    
    private native int nativeSetDoubleArray(final long p0, final String p1, final double[] p2);
    
    private native int nativeSetFloat(final long p0, final String p1, final float p2);
    
    private native int nativeSetFloatArray(final long p0, final String p1, final float[] p2);
    
    private native int nativeSetHandle(final long p0, final String p1, final long p2);
    
    private native int nativeSetInt(final long p0, final String p1, final int p2);
    
    private native int nativeSetIntArray(final long p0, final String p1, final int[] p2);
    
    private native int nativeSetIntOrigin(final long p0, final String p1, final int p2);
    
    private native int nativeSetLong(final long p0, final String p1, final long p2);
    
    private native int nativeSetString(final long p0, final String p1, final String p2);
    
    private native int nativeSetStringArray(final long p0, final String p1, final String[] p2);
    
    public static ByteBenchBundle obtain() {
        MethodCollector.i(17497);
        final Object sPoolSync = ByteBenchBundle.sPoolSync;
        monitorenter(sPoolSync);
        try {
            ByteBenchBundle byteBenchBundle;
            if (!ByteBenchBundle.sPools.isEmpty()) {
                byteBenchBundle = ByteBenchBundle.sPools.poll();
            }
            else {
                byteBenchBundle = new ByteBenchBundle();
            }
            monitorexit(sPoolSync);
            MethodCollector.o(17497);
            return byteBenchBundle;
        }
        finally {
            monitorexit(sPoolSync);
            MethodCollector.o(17497);
        }
    }
    
    public void finalize() {
        MethodCollector.i(17502);
        super.finalize();
        final long mHandle = this.mHandle;
        if (mHandle != 0L) {
            nativeRelease(mHandle);
        }
        MethodCollector.o(17502);
    }
    
    public boolean getBool(final String s) {
        MethodCollector.i(9667);
        final boolean nativeGetBool = this.nativeGetBool(this.mHandle, s);
        MethodCollector.o(9667);
        return nativeGetBool;
    }
    
    public float getFloat(final String s) {
        MethodCollector.i(9426);
        final float nativeGetFloat = this.nativeGetFloat(this.mHandle, s);
        MethodCollector.o(9426);
        return nativeGetFloat;
    }
    
    public long getHandle() {
        return this.mHandle;
    }
    
    public int getInt(final String s) {
        MethodCollector.i(10778);
        final int nativeGetInt = this.nativeGetInt(this.mHandle, s);
        MethodCollector.o(10778);
        return nativeGetInt;
    }
    
    public int[] getIntArray(final String s) {
        MethodCollector.i(9664);
        final int[] nativeGetIntArray = this.nativeGetIntArray(this.mHandle, s);
        MethodCollector.o(9664);
        return nativeGetIntArray;
    }
    
    public String getString(String nativeGetString) {
        MethodCollector.i(9429);
        nativeGetString = this.nativeGetString(this.mHandle, nativeGetString);
        MethodCollector.o(9429);
        return nativeGetString;
    }
    
    public void recycle() {
        MethodCollector.i(17500);
        final Object sPoolSync = ByteBenchBundle.sPoolSync;
        monitorenter(sPoolSync);
        try {
            ByteBenchBundle.sPools.add(this);
        }
        finally {
            monitorexit(sPoolSync);
            MethodCollector.o(17500);
        }
    }
    
    public int setBool(final String s, final boolean b) {
        MethodCollector.i(17510);
        final int nativeSetBool = this.nativeSetBool(this.mHandle, s, b);
        MethodCollector.o(17510);
        return nativeSetBool;
    }
    
    public int setBundle(final String s, final ByteBenchBundle byteBenchBundle) {
        MethodCollector.i(19258);
        final int nativeSetBundle = this.nativeSetBundle(this.mHandle, s, byteBenchBundle.mHandle);
        MethodCollector.o(19258);
        return nativeSetBundle;
    }
    
    public int setByteArray(final String s, final byte[] array) {
        MethodCollector.i(18062);
        final int nativeSetByteArray = this.nativeSetByteArray(this.mHandle, s, array);
        MethodCollector.o(18062);
        return nativeSetByteArray;
    }
    
    public int setDouble(final String s, final double n) {
        MethodCollector.i(19249);
        final int nativeSetDouble = this.nativeSetDouble(this.mHandle, s, n);
        MethodCollector.o(19249);
        return nativeSetDouble;
    }
    
    public int setDoubleArray(final String s, final double[] array) {
        MethodCollector.i(19251);
        final int nativeSetDoubleArray = this.nativeSetDoubleArray(this.mHandle, s, array);
        MethodCollector.o(19251);
        return nativeSetDoubleArray;
    }
    
    public int setFloat(final String s, final float n) {
        MethodCollector.i(18064);
        final int nativeSetFloat = this.nativeSetFloat(this.mHandle, s, n);
        MethodCollector.o(18064);
        return nativeSetFloat;
    }
    
    public int setFloatArray(final String s, final float[] array) {
        MethodCollector.i(18725);
        final int nativeSetFloatArray = this.nativeSetFloatArray(this.mHandle, s, array);
        MethodCollector.o(18725);
        return nativeSetFloatArray;
    }
    
    public int setHandle(final String s, final long n) {
        MethodCollector.i(17514);
        final int nativeSetHandle = this.nativeSetHandle(this.mHandle, s, n);
        MethodCollector.o(17514);
        return nativeSetHandle;
    }
    
    public int setInt(final String s, int nativeSetInt) {
        MethodCollector.i(17517);
        nativeSetInt = this.nativeSetInt(this.mHandle, s, nativeSetInt);
        MethodCollector.o(17517);
        return nativeSetInt;
    }
    
    public int setIntArray(final String s, final int[] array) {
        MethodCollector.i(18060);
        final int nativeSetIntArray = this.nativeSetIntArray(this.mHandle, s, array);
        MethodCollector.o(18060);
        return nativeSetIntArray;
    }
    
    public int setIntOrigin(final String s, int nativeSetIntOrigin) {
        MethodCollector.i(18056);
        nativeSetIntOrigin = this.nativeSetIntOrigin(this.mHandle, s, nativeSetIntOrigin);
        MethodCollector.o(18056);
        return nativeSetIntOrigin;
    }
    
    public int setLong(final String s, final long n) {
        MethodCollector.i(18053);
        final int nativeSetLong = this.nativeSetLong(this.mHandle, s, n);
        MethodCollector.o(18053);
        return nativeSetLong;
    }
    
    public int setString(final String s, final String s2) {
        MethodCollector.i(19253);
        final int nativeSetString = this.nativeSetString(this.mHandle, s, s2);
        MethodCollector.o(19253);
        return nativeSetString;
    }
    
    public int setStringArray(final String s, final String[] array) {
        MethodCollector.i(19255);
        final int nativeSetStringArray = this.nativeSetStringArray(this.mHandle, s, array);
        MethodCollector.o(19255);
        return nativeSetStringArray;
    }
}
