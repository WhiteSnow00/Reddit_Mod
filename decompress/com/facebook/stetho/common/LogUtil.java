// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import java.util.Locale;

public class LogUtil
{
    private static final String TAG = "stetho";
    
    public static void d(final String s) {
        if (isLoggable(3)) {
            LogRedirector.d("stetho", s);
        }
    }
    
    public static void d(final String s, final Object... array) {
        d(format(s, array));
    }
    
    public static void d(final Throwable t, final String s) {
        if (isLoggable(3)) {
            LogRedirector.d("stetho", s, t);
        }
    }
    
    public static void d(final Throwable t, final String s, final Object... array) {
        d(t, format(s, array));
    }
    
    public static void e(final String s) {
        if (isLoggable(6)) {
            LogRedirector.e("stetho", s);
        }
    }
    
    public static void e(final String s, final Object... array) {
        e(format(s, array));
    }
    
    public static void e(final Throwable t, final String s) {
        if (isLoggable(6)) {
            LogRedirector.e("stetho", s, t);
        }
    }
    
    public static void e(final Throwable t, final String s, final Object... array) {
        e(t, format(s, array));
    }
    
    private static String format(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static void i(final String s) {
        if (isLoggable(4)) {
            LogRedirector.i("stetho", s);
        }
    }
    
    public static void i(final String s, final Object... array) {
        i(format(s, array));
    }
    
    public static void i(final Throwable t, final String s) {
        if (isLoggable(4)) {
            LogRedirector.i("stetho", s, t);
        }
    }
    
    public static void i(final Throwable t, final String s, final Object... array) {
        i(t, format(s, array));
    }
    
    public static boolean isLoggable(final int n) {
        return n == 5 || n == 6 || LogRedirector.isLoggable("stetho", n);
    }
    
    public static void v(final String s) {
        if (isLoggable(2)) {
            LogRedirector.v("stetho", s);
        }
    }
    
    public static void v(final String s, final Object... array) {
        v(format(s, array));
    }
    
    public static void v(final Throwable t, final String s) {
        if (isLoggable(2)) {
            LogRedirector.v("stetho", s, t);
        }
    }
    
    public static void v(final Throwable t, final String s, final Object... array) {
        v(t, format(s, array));
    }
    
    public static void w(final String s) {
        if (isLoggable(5)) {
            LogRedirector.w("stetho", s);
        }
    }
    
    public static void w(final String s, final Object... array) {
        w(format(s, array));
    }
    
    public static void w(final Throwable t, final String s) {
        if (isLoggable(5)) {
            LogRedirector.w("stetho", s, t);
        }
    }
    
    public static void w(final Throwable t, final String s, final Object... array) {
        w(t, format(s, array));
    }
}
