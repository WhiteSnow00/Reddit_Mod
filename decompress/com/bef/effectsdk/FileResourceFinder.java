// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class FileResourceFinder implements ResourceFinder
{
    public final String mDir;
    
    static {
        Covode.recordClassIndex(2779);
    }
    
    public FileResourceFinder(final String mDir) {
        this.mDir = mDir;
    }
    
    public static native long nativeCreateFileResourceFinder(final long p0, final String p1);
    
    @Override
    public final long createNativeResourceFinder(long nativeCreateFileResourceFinder) {
        MethodCollector.i(1553);
        nativeCreateFileResourceFinder = nativeCreateFileResourceFinder(nativeCreateFileResourceFinder, this.mDir);
        MethodCollector.o(1553);
        return nativeCreateFileResourceFinder;
    }
    
    @Override
    public final void release(final long n) {
    }
}
