// 
// Decompiled by Procyon v0.6.0
// 

package com.bd.cu.fp;

import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;

public class NativeUtils
{
    static {
        Covode.recordClassIndex(2764);
        INVOKESTATIC_com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fileprotect");
    }
    
    public static void INVOKESTATIC_com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(final String s) {
        5pn.LIZ(s);
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ(s);
        5pn.LIZ(uptimeMillis, s);
        5pn.LIZIZ(s);
    }
    
    public static native byte[] crypt(final long p0, final byte[] p1);
    
    public static native long nativeInit(final String p0);
    
    public static native void release(final long p0);
}
