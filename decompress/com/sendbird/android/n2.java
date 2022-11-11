// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import aw.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import android.content.Context;
import android.content.SharedPreferences;

public final class n2
{
    public static SharedPreferences a;
    
    public static String a(String string) {
        final SharedPreferences a = n2.a;
        final String s = "";
        if (a == null) {
            string = s;
        }
        else {
            string = a.getString(string, "");
        }
        return string;
    }
    
    public static void b(final Context context) {
        synchronized (n2.class) {
            if (n2.a != null) {
                return;
            }
            final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
            try {
                singleThreadExecutor.submit((Callable<Object>)new m2(context)).get();
            }
            catch (final Exception ex) {}
            finally {
                singleThreadExecutor.shutdown();
            }
        }
    }
    
    public static void c(final String s, final String s2) {
        final SharedPreferences a = n2.a;
        if (a == null) {
            return;
        }
        a.v(a, s, s2);
    }
    
    public static void d(final String s) {
        final SharedPreferences a = n2.a;
        if (a == null) {
            return;
        }
        if (a.contains(s)) {
            b.q(n2.a, s);
        }
    }
}
