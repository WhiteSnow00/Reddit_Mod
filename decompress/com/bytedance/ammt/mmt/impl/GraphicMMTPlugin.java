// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.ammt.mmt.impl;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import X.0Qi;
import java.io.File;
import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;
import X.0Qf;

public class GraphicMMTPlugin extends 0Qf
{
    public static GraphicMMTPlugin LIZIZ;
    public static String LIZJ;
    public static String LJFF;
    public static String LJI;
    public String LIZLLL;
    public String LJ;
    
    static {
        Covode.recordClassIndex(4353);
        5pn.LIZ("mmt");
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ("mmt");
        5pn.LIZ(uptimeMillis, "mmt");
        5pn.LIZIZ("mmt");
        GraphicMMTPlugin.LIZJ = "gmt";
        GraphicMMTPlugin.LJFF = "_usage";
        GraphicMMTPlugin.LJI = "_profile";
    }
    
    public static GraphicMMTPlugin LIZJ() {
        MethodCollector.i(440);
        if (GraphicMMTPlugin.LIZIZ == null) {
            monitorenter(GraphicMMTPlugin.class);
            try {
                GraphicMMTPlugin.LIZIZ = new GraphicMMTPlugin();
                monitorexit(GraphicMMTPlugin.class);
            }
            finally {
                monitorexit(GraphicMMTPlugin.class);
                MethodCollector.o(440);
            }
        }
        final GraphicMMTPlugin liziz = GraphicMMTPlugin.LIZIZ;
        MethodCollector.o(440);
        return liziz;
    }
    
    public static native void gmt_native_dump(final String p0, final String p1);
    
    public static native void gmt_native_setConfigParams(final int p0);
    
    public static native void gmt_native_setMemoryThreshold(final long p0, final long p1);
    
    public static native void gmt_native_start();
    
    public static native void gmt_native_stop();
    
    @Override
    public final void LIZ() {
        MethodCollector.i(639);
        super.LIZ();
        ByteHook.init();
        gmt_native_start();
        super.LIZ = true;
        MethodCollector.o(639);
    }
    
    @Override
    public final void LIZ(final int n) {
        MethodCollector.i(804);
        super.LIZ(n);
        gmt_native_setConfigParams(n);
        MethodCollector.o(804);
    }
    
    @Override
    public final void LIZ(final long n, final long n2) {
        MethodCollector.i(1004);
        super.LIZ(n, n2);
        gmt_native_setMemoryThreshold(n, n2);
        MethodCollector.o(1004);
    }
    
    public final void LIZ(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.LIZLLL);
        sb.append(File.separator);
        sb.append(this.LJ);
        sb.append(GraphicMMTPlugin.LJFF);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.LIZLLL);
        sb2.append(File.separator);
        sb2.append(this.LJ);
        sb2.append(GraphicMMTPlugin.LJI);
        final String string2 = sb2.toString();
        final File file = new File(string);
        final File file2 = new File(string2);
        if (file.exists() && file2.exists()) {
            new PthreadThread((Runnable)new 0Qi(string2, string, context), "UploadManager").start();
        }
    }
    
    @Override
    public final void LIZ(final String s, final String lj) {
        super.LIZ(s, lj);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(File.separator);
        sb.append(GraphicMMTPlugin.LIZJ);
        this.LIZLLL = sb.toString();
        this.LJ = lj;
    }
    
    @Override
    public final void LIZIZ() {
        MethodCollector.i(2197);
        super.LIZIZ();
        gmt_native_dump(this.LIZLLL, this.LJ);
        MethodCollector.o(2197);
    }
}
