// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.strategy.nativePort;

import X.0NJ;
import com.bytedance.covode.number.Covode;
import X.0NL;

public class ByteBenchStrategyPort
{
    public 0NL LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(3018);
    }
    
    private native boolean native_obtainStaticBoolStrategy(final int p0, final String p1, final boolean p2);
    
    private native float native_obtainStaticFloatStrategy(final int p0, final String p1, final float p2);
    
    private native int native_obtainStaticIntStrategy(final int p0, final String p1, final int p2);
    
    private native long native_obtainStaticLongStrategy(final int p0, final String p1, final long p2);
    
    private native void native_openRepo(final int p0);
    
    private native void native_release(final int p0);
    
    public final int LIZ() {
        final int liziz = this.LIZIZ;
        if (liziz > 0) {
            return liziz;
        }
        final 0NJ ljiiljjil = 0NJ.LJIILJJIL;
        if (ljiiljjil != null) {
            return ljiiljjil.LIZLLL;
        }
        return 0;
    }
    
    public native boolean native_contains(final int p0, final String p1);
    
    public native void native_init(final long p0);
    
    public native boolean native_obtainBoolStrategy(final int p0, final String p1, final boolean p2, final String p3, final boolean p4);
    
    public native float native_obtainFloatStrategy(final int p0, final String p1, final float p2, final String p3, final boolean p4);
    
    public native int native_obtainIntStrategy(final int p0, final String p1, final int p2, final String p3, final boolean p4);
    
    public native long native_obtainLongStrategy(final int p0, final String p1, final long p2, final String p3, final boolean p4);
    
    public native String native_obtainStaticStrStrategy(final int p0, final String p1, final String p2);
    
    public native String native_obtainStrStrategy(final int p0, final String p1, final String p2, final String p3, final boolean p4);
}
