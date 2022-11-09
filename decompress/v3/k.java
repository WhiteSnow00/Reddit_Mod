// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import android.util.Log;
import android.os.Trace;
import android.os.Build$VERSION;

@Deprecated
public final class k
{
    static {
        if (Build$VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                final Class<Long> type = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", type);
                final Class<Integer> type2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", type, String.class, type2);
                Trace.class.getMethod("asyncTraceEnd", type, String.class, type2);
                Trace.class.getMethod("traceCounter", type, String.class, type2);
            }
            catch (final Exception ex) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", (Throwable)ex);
            }
        }
    }
    
    public static final class a
    {
        public static void a(final String s) {
            Trace.beginSection(s);
        }
        
        public static void b() {
            Trace.endSection();
        }
    }
}
