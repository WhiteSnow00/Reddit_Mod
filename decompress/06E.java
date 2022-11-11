// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Trace;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;

public final class 06e
{
    static {
        Covode.recordClassIndex(737);
        if (Build$VERSION.SDK_INT >= 29) {
            return;
        }
        try {
            Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Trace.class.getMethod("isTagEnabled", Long.TYPE);
            Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
        }
        catch (final Exception ex) {}
    }
    
    public static void LIZ() {
        Trace.endSection();
    }
    
    public static void LIZ(final String s) {
        Trace.beginSection(s);
    }
}
