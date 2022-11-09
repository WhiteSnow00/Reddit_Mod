// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.bytehook;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;
import X.0TL;

public class ByteHook
{
    public static final 0TL defaultLibLoader;
    public static final int defaultMode;
    public static int initStatus;
    public static boolean inited;
    
    static {
        Covode.recordClassIndex(4594);
        ByteHook.initStatus = 1;
        defaultMode = ByteHook.c.AUTOMATIC.value;
    }
    
    public static void INVOKESTATIC_com_bytedance_android_bytehook_ByteHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(final String s) {
        5pn.LIZ(s);
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ(s);
        5pn.LIZ(uptimeMillis, s);
        5pn.LIZIZ(s);
    }
    
    public static String getRecords() {
        MethodCollector.i(5758);
        if (ByteHook.initStatus == 0) {
            final String nativeGetRecords = nativeGetRecords();
            MethodCollector.o(5758);
            return nativeGetRecords;
        }
        MethodCollector.o(5758);
        return null;
    }
    
    public static int init() {
        if (ByteHook.inited) {
            return ByteHook.initStatus;
        }
        final ByteHook.b b = new ByteHook.b();
        final ByteHook.a a = new ByteHook.a();
        a.LIZ = b.LIZ;
        a.LIZIZ = b.LIZIZ;
        a.LIZJ = b.LIZJ;
        return init(a);
    }
    
    public static int init(final ByteHook.a a) {
        synchronized (ByteHook.class) {
            MethodCollector.i(5411);
            if (ByteHook.inited) {
                final int initStatus = ByteHook.initStatus;
                MethodCollector.o(5411);
                return initStatus;
            }
            ByteHook.inited = true;
            try {
                if (a.LIZ == null) {
                    INVOKESTATIC_com_bytedance_android_bytehook_ByteHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytehook");
                }
                try {
                    ByteHook.initStatus = nativeInit(a.LIZIZ, a.LIZJ);
                }
                finally {
                    ByteHook.initStatus = 101;
                }
                final int initStatus2 = ByteHook.initStatus;
                MethodCollector.o(5411);
                return initStatus2;
            }
            finally {
                ByteHook.initStatus = 100;
                MethodCollector.o(5411);
                return 100;
            }
        }
    }
    
    public static native String nativeGetRecords();
    
    public static native int nativeInit(final int p0, final boolean p1);
    
    public static native void nativeSetDebug(final boolean p0);
    
    public static void setDebug(final boolean b) {
        MethodCollector.i(5755);
        if (ByteHook.initStatus == 0) {
            nativeSetDebug(b);
        }
        MethodCollector.o(5755);
    }
}
