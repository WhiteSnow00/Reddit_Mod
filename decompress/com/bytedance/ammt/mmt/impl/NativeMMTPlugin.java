// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.ammt.mmt.impl;

import java.io.File;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;
import X.0Qf;

public class NativeMMTPlugin extends 0Qf
{
    public static volatile NativeMMTPlugin LIZIZ;
    public static String LIZJ;
    public String LIZLLL;
    public String LJ;
    
    static {
        Covode.recordClassIndex(4354);
        5pn.LIZ("mmt");
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ("mmt");
        5pn.LIZ(uptimeMillis, "mmt");
        5pn.LIZIZ("mmt");
        NativeMMTPlugin.LIZJ = "nmt";
    }
    
    public static NativeMMTPlugin LIZJ() {
        MethodCollector.i(1182);
        if (NativeMMTPlugin.LIZIZ == null) {
            monitorenter(NativeMMTPlugin.class);
            try {
                NativeMMTPlugin.LIZIZ = new NativeMMTPlugin();
                monitorexit(NativeMMTPlugin.class);
            }
            finally {
                monitorexit(NativeMMTPlugin.class);
                MethodCollector.o(1182);
            }
        }
        final NativeMMTPlugin liziz = NativeMMTPlugin.LIZIZ;
        MethodCollector.o(1182);
        return liziz;
    }
    
    public static native void native_dump(final String p0, final String p1);
    
    public static native void native_setConfigParams(final int p0);
    
    public static native void native_setMemoryThreshold(final long p0, final long p1);
    
    public static native void native_start();
    
    public static native void native_stop();
    
    @Override
    public final void LIZ() {
        MethodCollector.i(1575);
        super.LIZ();
        ByteHook.init();
        native_start();
        super.LIZ = true;
        MethodCollector.o(1575);
    }
    
    @Override
    public final void LIZ(final int n) {
        super.LIZ(n);
    }
    
    @Override
    public final void LIZ(final long n, final long n2) {
        MethodCollector.i(1734);
        super.LIZ(n, n2);
        native_setMemoryThreshold(n, n2);
        MethodCollector.o(1734);
    }
    
    @Override
    public final void LIZ(final String s, final String lj) {
        super.LIZ(s, lj);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(File.separator);
        sb.append(NativeMMTPlugin.LIZJ);
        this.LIZLLL = sb.toString();
        this.LJ = lj;
    }
    
    @Override
    public final void LIZIZ() {
        MethodCollector.i(2240);
        super.LIZIZ();
        native_dump(this.LIZLLL, this.LJ);
        MethodCollector.o(2240);
    }
}
