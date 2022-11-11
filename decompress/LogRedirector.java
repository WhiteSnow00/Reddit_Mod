// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import android.util.Log;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LogRedirector
{
    private static volatile Logger sLogger;
    
    public static void d(final String s, final String s2) {
        log(3, s, s2);
    }
    
    public static void d(final String s, final String s2, final Throwable t) {
        final StringBuilder q = d.q(s2, "\n");
        q.append(formatThrowable(t));
        d(s, q.toString());
    }
    
    public static void e(final String s, final String s2) {
        log(6, s, s2);
    }
    
    public static void e(final String s, final String s2, final Throwable t) {
        final StringBuilder q = d.q(s2, "\n");
        q.append(formatThrowable(t));
        e(s, q.toString());
    }
    
    private static String formatThrowable(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        t.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }
    
    public static void i(final String s, final String s2) {
        log(4, s, s2);
    }
    
    public static void i(final String s, final String s2, final Throwable t) {
        final StringBuilder q = d.q(s2, "\n");
        q.append(formatThrowable(t));
        i(s, q.toString());
    }
    
    public static boolean isLoggable(final String s, final int n) {
        final Logger sLogger = LogRedirector.sLogger;
        if (sLogger != null) {
            return sLogger.isLoggable(s, n);
        }
        return Log.isLoggable(s, n);
    }
    
    private static void log(final int n, final String s, final String s2) {
        final Logger sLogger = LogRedirector.sLogger;
        if (sLogger != null) {
            sLogger.log(n, s, s2);
        }
        else {
            Log.println(n, s, s2);
        }
    }
    
    public static void setLogger(final Logger sLogger) {
        Util.throwIfNull(sLogger);
        Util.throwIfNotNull(LogRedirector.sLogger);
        LogRedirector.sLogger = sLogger;
    }
    
    public static void v(final String s, final String s2) {
        log(2, s, s2);
    }
    
    public static void v(final String s, final String s2, final Throwable t) {
        final StringBuilder q = d.q(s2, "\n");
        q.append(formatThrowable(t));
        v(s, q.toString());
    }
    
    public static void w(final String s, final String s2) {
        log(5, s, s2);
    }
    
    public static void w(final String s, final String s2, final Throwable t) {
        final StringBuilder q = d.q(s2, "\n");
        q.append(formatThrowable(t));
        w(s, q.toString());
    }
    
    public interface Logger
    {
        boolean isLoggable(final String p0, final int p1);
        
        void log(final int p0, final String p1, final String p2);
    }
}
