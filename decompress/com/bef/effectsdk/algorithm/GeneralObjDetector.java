// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bef.effectsdk.ResourceFinder;

public class GeneralObjDetector
{
    public final int ModelType_kPureDetect;
    public final int ParamType_kDetectShortSideLen;
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;
    
    static {
        Covode.recordClassIndex(2809);
    }
    
    public GeneralObjDetector() {
        this.ModelType_kPureDetect = 1;
        this.ParamType_kDetectShortSideLen = 1;
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
    
    private native GeneralObjDetectResult nativeProcess(final long p0, final Bitmap p1, final int p2);
    
    private native int nativeSetParamF(final long p0, final int p1, final float p2);
    
    private native int nativeSetParamS(final long p0, final int p1, final String p2);
    
    public boolean create() {
        MethodCollector.i(4945);
        this.mNativeHandle = this.nativeCreate();
        final boolean nativeHandleValid = this.isNativeHandleValid();
        MethodCollector.o(4945);
        return nativeHandleValid;
    }
    
    public void destroy() {
        MethodCollector.i(9432);
        if (this.isNativeHandleValid()) {
            this.nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder != null && this.isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0L;
        }
        MethodCollector.o(9432);
    }
    
    public boolean init(final ResourceFinder mFinder, final int n) {
        MethodCollector.i(5471);
        if (mFinder == null || !this.isNativeHandleValid()) {
            MethodCollector.o(5471);
            return false;
        }
        this.mFinder = mFinder;
        this.mFinderHandle = mFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!this.isFinderHandleValid()) {
            this.destroy();
            MethodCollector.o(5471);
            return false;
        }
        if (this.nativeInit(this.mNativeHandle, this.mFinderHandle, n) == 0) {
            MethodCollector.o(5471);
            return true;
        }
        MethodCollector.o(5471);
        return false;
    }
    
    public boolean initWithPath(final String s, final int n) {
        MethodCollector.i(8093);
        if (s == null || s.length() == 0 || !this.isNativeHandleValid()) {
            MethodCollector.o(8093);
            return false;
        }
        if (this.nativeInitWithPath(this.mNativeHandle, s, n) == 0) {
            MethodCollector.o(8093);
            return true;
        }
        MethodCollector.o(8093);
        return false;
    }
    
    public GeneralObjDetectResult process(final Bitmap bitmap, final int n) {
        MethodCollector.i(9430);
        if (!this.isNativeHandleValid() || bitmap == null) {
            final GeneralObjDetectResult generalObjDetectResult = new GeneralObjDetectResult();
            MethodCollector.o(9430);
            return generalObjDetectResult;
        }
        final GeneralObjDetectResult nativeProcess = this.nativeProcess(this.mNativeHandle, bitmap, n);
        nativeProcess.logData();
        MethodCollector.o(9430);
        return nativeProcess;
    }
    
    public boolean setParamF(final int n, final float n2) {
        MethodCollector.i(8330);
        if (!this.isNativeHandleValid()) {
            MethodCollector.o(8330);
            return false;
        }
        if (this.nativeSetParamF(this.mNativeHandle, n, n2) == 0) {
            MethodCollector.o(8330);
            return true;
        }
        MethodCollector.o(8330);
        return false;
    }
    
    public boolean setParamS(final int n, final String s) {
        MethodCollector.i(8333);
        if (!this.isNativeHandleValid()) {
            MethodCollector.o(8333);
            return false;
        }
        if (this.nativeSetParamS(this.mNativeHandle, n, s) == 0) {
            MethodCollector.o(8333);
            return true;
        }
        MethodCollector.o(8333);
        return false;
    }
}
