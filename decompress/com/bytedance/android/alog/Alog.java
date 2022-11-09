// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.alog;

import X.0T5;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class Alog
{
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final ArrayList<String> LJI;
    public static boolean LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public long LJIILL;
    
    static {
        Covode.recordClassIndex(4565);
        LIZ = Alog.d.SAFE.value;
        LIZIZ = Alog.g.RAW.value;
        LIZJ = Alog.e.DEFAULT.value;
        LIZLLL = Alog.c.ZSTD.value;
        LJ = Alog.f.TEA_16.value;
        LJFF = Alog.a.EC_SECP256K1.value;
        LJI = new ArrayList<String>();
        Alog.LJII = false;
    }
    
    public Alog(final int ljiiiizz, final boolean b, final String ljiiljjil, final String ljiiiz, final int n, final int n2, final int n3, final String ljiij, final int ljiijji, final int n4, final String s, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final String s2) {
        MethodCollector.i(7149);
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = ljiiiz;
        this.LJIIJ = ljiij;
        this.LJIIJJI = ljiijji;
        this.LJIIL = n4 / ljiijji;
        this.LJIILJJIL = ljiiljjil;
        this.LJIILL = nativeCreate(ljiiiizz, b, ljiiljjil, ljiiiz, n, n2, n3, ljiij, ljiijji, n4, s, n5, n6, n7, n8, n9, n10, s2);
        MethodCollector.o(7149);
    }
    
    public static void LIZ(final 0T5 0t5) {
        synchronized (Alog.class) {
            MethodCollector.i(7146);
            if (Alog.LJII) {
                MethodCollector.o(7146);
                return;
            }
            0t5.LIZ();
            Alog.LJII = true;
            MethodCollector.o(7146);
        }
    }
    
    public static native void nativeAsyncFlush(final long p0);
    
    public static native long nativeCreate(final int p0, final boolean p1, final String p2, final String p3, final int p4, final int p5, final int p6, final String p7, final int p8, final int p9, final String p10, final int p11, final int p12, final int p13, final int p14, final int p15, final int p16, final String p17);
    
    public static native void nativeDestroy(final long p0);
    
    public static native long nativeGetLegacyFlushFuncAddr();
    
    public static native long nativeGetLegacyGetLogFileDirFuncAddr();
    
    public static native long nativeGetLegacyWriteFuncAddr();
    
    public static native long nativeGetNativeWriteFuncAddr();
    
    public static native void nativeSetDefaultInstance(final long p0);
    
    public static native void nativeSetLevel(final long p0, final int p1);
    
    public static native void nativeSetSyslog(final long p0, final boolean p1);
    
    public static native void nativeSyncFlush(final long p0);
    
    public static native void nativeTimedSyncFlush(final long p0, final int p1);
    
    public static native void nativeWrite(final long p0, final int p1, final String p2, final String p3);
    
    public static native void nativeWriteAsyncMsg(final long p0, final int p1, final String p2, final String p3, final long p4, final long p5);
    
    public final void LIZ() {
        MethodCollector.i(7153);
        monitorenter(this);
        try {
            final long ljiill = this.LJIILL;
            if (ljiill != 0L) {
                this.LJIIIIZZ = 6;
                nativeDestroy(ljiill);
                this.LJIILL = 0L;
            }
        }
        finally {
            monitorexit(this);
            MethodCollector.o(7153);
        }
    }
    
    public final void LIZ(final int n) {
        MethodCollector.i(7166);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L) {
            nativeTimedSyncFlush(ljiill, n);
        }
        MethodCollector.o(7166);
    }
    
    public final void LIZ(final int n, final String s, final String s2) {
        MethodCollector.i(7157);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L && n >= this.LJIIIIZZ && s != null && s2 != null) {
            nativeWrite(ljiill, n, s, s2);
        }
        MethodCollector.o(7157);
    }
    
    public final void LIZ(final boolean b) {
        MethodCollector.i(7172);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L) {
            nativeSetSyslog(ljiill, b);
        }
        MethodCollector.o(7172);
    }
    
    public final void LIZIZ() {
        MethodCollector.i(7159);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L) {
            nativeAsyncFlush(ljiill);
        }
        MethodCollector.o(7159);
    }
    
    public final void LIZIZ(final int n) {
        MethodCollector.i(7169);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L) {
            nativeSetLevel(ljiill, n);
        }
        MethodCollector.o(7169);
    }
    
    public final void LIZJ() {
        MethodCollector.i(7163);
        final long ljiill = this.LJIILL;
        if (ljiill != 0L) {
            nativeSyncFlush(ljiill);
        }
        MethodCollector.o(7163);
    }
    
    public void finalize() {
        try {
            super.finalize();
        }
        finally {
            this.LIZ();
        }
    }
}
