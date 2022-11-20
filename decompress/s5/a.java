// 
// Decompiled by Procyon v0.6.0
// 

package s5;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import a4.u0;
import java.lang.reflect.Method;

public final class a
{
    public static long a;
    public static Method b;
    
    public static boolean a() {
        while (true) {
            try {
                if (s5.a.b == null) {
                    return u0.o();
                }
                final boolean b = false;
                boolean booleanValue;
                try {
                    if (s5.a.b == null) {
                        s5.a.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                        s5.a.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                    }
                    booleanValue = (boolean)s5.a.b.invoke(null, s5.a.a);
                }
                catch (final Exception ex) {
                    if (ex instanceof InvocationTargetException) {
                        final Throwable cause = ex.getCause();
                        if (cause instanceof RuntimeException) {
                            throw (RuntimeException)cause;
                        }
                        throw new RuntimeException(cause);
                    }
                    else {
                        Log.v("Trace", "Unable to call isTagEnabled via reflection", (Throwable)ex);
                        booleanValue = b;
                    }
                }
                return booleanValue;
            }
            catch (final NoSuchMethodError | NoClassDefFoundError noSuchMethodError | NoClassDefFoundError) {
                continue;
            }
            break;
        }
    }
}
