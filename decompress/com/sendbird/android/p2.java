// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import android.util.Log;
import java.util.Locale;
import al0.b;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public final class p2
{
    public static final ThreadLocal<SimpleDateFormat> a;
    public static final ArrayList b;
    public static LogLevel c;
    
    static {
        a = new ThreadLocal<SimpleDateFormat>();
        final ArrayList list = b = new ArrayList();
        p2.c = LogLevel.WARN;
        list.add(new u0());
    }
    
    public static void a(final String s, final String s2, final Exception ex) {
        c(LogLevel.DEBUG, s, s2, ex);
    }
    
    public static void b(final String s, final String s2, final Object... array) {
        c(LogLevel.DEBUG, s, String.format(s2, array), null);
    }
    
    public static void c(final LogLevel logLevel, String format, final String s, final Exception ex) {
        if (p2.c.order > logLevel.order) {
            return;
        }
        String h;
        if (format == null) {
            h = "Sendbird";
        }
        else {
            h = al0.b.h("Sendbird:", format);
        }
        for (final o2 o2 : p2.b) {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            final int length = stackTrace.length;
            int n2;
            int n = n2 = 0;
            String s2;
            StackTraceElement stackTraceElement;
            while (true) {
                s2 = null;
                if (n >= length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTrace[n];
                final String className = stackTraceElement.getClassName();
                if (n2 != 0 || className.startsWith(p2.class.getCanonicalName())) {
                    if (!className.startsWith(p2.class.getCanonicalName())) {
                        break;
                    }
                    n2 = 1;
                }
                ++n;
            }
            if (stackTraceElement == null) {
                format = s2;
            }
            else {
                final String[] split = stackTraceElement.getClassName().split("\\.");
                final String methodName = stackTraceElement.getMethodName();
                final int lineNumber = stackTraceElement.getLineNumber();
                final ThreadLocal<SimpleDateFormat> a = p2.a;
                if (a.get() == null) {
                    a.set(new SimpleDateFormat("HH:mm:ss.SSS", Locale.US));
                }
                format = String.format(Locale.US, "[%s %s:%s():%d]", a.get().format(System.currentTimeMillis()), split[split.length - 1], methodName, lineNumber);
            }
            String s3 = format;
            if (format == null) {
                s3 = "";
            }
            o2.a(logLevel, h, String.format("%s\n%s", String.format("%s %s", s3, s), Log.getStackTraceString((Throwable)ex)));
        }
    }
}
