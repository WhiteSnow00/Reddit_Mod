// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bef.effectsdk.ResourceFinder;

public class RectDocDet
{
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;
    
    static {
        Covode.recordClassIndex(2811);
    }
    
    private boolean isFinderHandleValid() {
        return 0L != this.mFinderHandle;
    }
    
    private boolean isNativeHandleValid() {
        return 0L != this.mNativeHandle;
    }
    
    private native long nativeCreate();
    
    private native int nativeDestroy(final long p0);
    
    private native int nativeInit(final long p0, final long p1, final int p2);
    
    private native int nativeInitWithPath(final long p0, final String p1, final int p2);
    
    private native RectDocDetResult nativeProcess(final long p0, final Bitmap p1, final int p2);
    
    private native int nativeSetParamF(final long p0, final int p1, final float p2);
    
    public boolean create() {
        MethodCollector.i(4720);
        this.mNativeHandle = this.nativeCreate();
        final boolean nativeHandleValid = this.isNativeHandleValid();
        MethodCollector.o(4720);
        return nativeHandleValid;
    }
    
    public void destroy() {
        MethodCollector.i(4796);
        if (this.isNativeHandleValid()) {
            this.nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder != null && this.isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0L;
        }
        MethodCollector.o(4796);
    }
    
    public boolean init(final ResourceFinder mFinder, final int n) {
        MethodCollector.i(4757);
        if (mFinder == null || !this.isNativeHandleValid()) {
            MethodCollector.o(4757);
            return false;
        }
        this.mFinder = mFinder;
        this.mFinderHandle = mFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!this.isFinderHandleValid()) {
            this.destroy();
            MethodCollector.o(4757);
            return false;
        }
        if (this.nativeInit(this.mNativeHandle, this.mFinderHandle, n) == 0) {
            MethodCollector.o(4757);
            return true;
        }
        MethodCollector.o(4757);
        return false;
    }
    
    public boolean initWithPath(final String s, final int n) {
        MethodCollector.i(4773);
        if (s == null || s.length() == 0 || !this.isNativeHandleValid()) {
            MethodCollector.o(4773);
            return false;
        }
        if (this.nativeInitWithPath(this.mNativeHandle, s, n) == 0) {
            MethodCollector.o(4773);
            return true;
        }
        MethodCollector.o(4773);
        return false;
    }
    
    public RectDocDetResult process(final Bitmap bitmap, final int n) {
        MethodCollector.i(4787);
        if (!this.isNativeHandleValid() || bitmap == null) {
            final RectDocDetResult rectDocDetResult = new RectDocDetResult();
            MethodCollector.o(4787);
            return rectDocDetResult;
        }
        final RectDocDetResult nativeProcess = this.nativeProcess(this.mNativeHandle, bitmap, n);
        MethodCollector.o(4787);
        return nativeProcess;
    }
    
    public boolean setParamF(final int n, final float n2) {
        MethodCollector.i(4777);
        if (!this.isNativeHandleValid()) {
            MethodCollector.o(4777);
            return false;
        }
        if (this.nativeSetParamF(this.mNativeHandle, n, n2) == 0) {
            MethodCollector.o(4777);
            return true;
        }
        MethodCollector.o(4777);
        return false;
    }
}
