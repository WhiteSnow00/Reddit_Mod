// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.content.res.AssetManager;

public final class AssetResourceFinder implements ResourceFinder
{
    public final AssetManager mAssetManager;
    public final String mDir;
    
    static {
        Covode.recordClassIndex(2765);
    }
    
    public AssetResourceFinder(final AssetManager mAssetManager, final String mDir) {
        this.mAssetManager = mAssetManager;
        this.mDir = mDir;
    }
    
    public static native long nativeCreateAssetResourceFinder(final long p0, final AssetManager p1, final String p2);
    
    public static native void nativeReleaseAssetResourceFinder(final long p0);
    
    @Override
    public final long createNativeResourceFinder(long nativeCreateAssetResourceFinder) {
        synchronized (this) {
            MethodCollector.i(4973);
            nativeCreateAssetResourceFinder = nativeCreateAssetResourceFinder(nativeCreateAssetResourceFinder, this.mAssetManager, this.mDir);
            MethodCollector.o(4973);
            return nativeCreateAssetResourceFinder;
        }
    }
    
    @Override
    public final void release(final long n) {
        synchronized (this) {
            MethodCollector.i(4981);
            nativeReleaseAssetResourceFinder(n);
            MethodCollector.o(4981);
        }
    }
}
