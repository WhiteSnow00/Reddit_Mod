// 
// Decompiled by Procyon v0.6.0
// 

package com.byted.mgl.exp.h5game.util;

import X.CTM;
import kotlin.n.y;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class MglLog
{
    public static final MglLog INSTANCE;
    public static volatile boolean sLogged;
    
    static {
        Covode.recordClassIndex(3895);
        INSTANCE = new MglLog();
        MglLog.sLogged = true;
    }
    
    private final String createLog(final Object... array) {
        final int length = array.length;
        final int n = 0;
        if (length == 0) {
            return "empty_log";
        }
        int lineNumber = -1;
        final StringBuilder sb = new StringBuilder();
        String s = "unknown file";
        String s2 = "unknown";
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String s3 = s2;
        String s4 = s;
        if (stackTrace.length > 2) {
            final StackTraceElement stackTraceElement = stackTrace[2];
            kotlin.jvm.internal.n.LIZ((Object)stackTraceElement, "");
            final String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                s = fileName;
            }
            final StackTraceElement stackTraceElement2 = stackTrace[2];
            kotlin.jvm.internal.n.LIZ((Object)stackTraceElement2, "");
            final String methodName = stackTraceElement2.getMethodName();
            if (methodName != null) {
                s2 = methodName;
            }
            final StackTraceElement stackTraceElement3 = stackTrace[2];
            kotlin.jvm.internal.n.LIZ((Object)stackTraceElement3, "");
            lineNumber = stackTraceElement3.getLineNumber();
            s4 = s;
            s3 = s2;
        }
        sb.append(s3);
        sb.append('(');
        sb.append(s4);
        sb.append(':');
        sb.append(lineNumber);
        sb.append(") ");
        for (int length2 = array.length, i = n; i < length2; ++i) {
            final Object o = array[i];
            sb.append(' ');
            if (o != null) {
                sb.append(o);
            }
            else {
                sb.append("null");
            }
        }
        final String string = sb.toString();
        kotlin.jvm.internal.n.LIZ((Object)string, "");
        return string;
    }
    
    private final String formatTag(final String s) {
        if (s == null) {
            return "mgl";
        }
        String concat = s;
        if (!y.LIZIZ(s, "mgl_", false)) {
            concat = "mgl_".concat(String.valueOf(s));
        }
        return concat;
    }
    
    public final void d(final String s, final Object... array) {
        CTM.LIZ((Object)s, (Object)array);
        final boolean sLogged = MglLog.sLogged;
    }
    
    public final void e(final String s, final Object... array) {
        CTM.LIZ((Object)s, (Object)array);
        final boolean sLogged = MglLog.sLogged;
    }
    
    public final void eWithThrowable(final String s, final String s2, final Throwable t) {
        CTM.LIZ((Object)s, (Object)t);
        final boolean sLogged = MglLog.sLogged;
    }
    
    public final boolean getSLogged() {
        return MglLog.sLogged;
    }
    
    public final void i(final String s, final Object... array) {
        CTM.LIZ((Object)s, (Object)array);
        final boolean sLogged = MglLog.sLogged;
    }
    
    public final void setSLogged(final boolean sLogged) {
        MglLog.sLogged = sLogged;
    }
    
    public final void w(final String s, final Object... array) {
        CTM.LIZ((Object)s, (Object)array);
        final boolean sLogged = MglLog.sLogged;
    }
}
