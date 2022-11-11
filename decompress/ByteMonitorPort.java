// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.bytemonitor.nativePort;

import com.benchmark.bytemonitor.BatteryMonitor;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;

public class ByteMonitorPort
{
    static {
        Covode.recordClassIndex(2891);
        5pn.LIZ("bytemonitor");
        final long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LIZ("bytemonitor");
        5pn.LIZ(uptimeMillis, "bytemonitor");
        5pn.LIZIZ("bytemonitor");
    }
    
    public static native void nativeInit(final BatteryMonitor p0);
}
