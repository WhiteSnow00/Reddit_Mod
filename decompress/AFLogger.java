// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.ay;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import com.appsflyer.internal.aj;
import com.bytedance.covode.number.Covode;

public final class AFLogger
{
    public static final long AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2541);
        AFKeystoreWrapper = System.currentTimeMillis();
    }
    
    public static String AFInAppEventParameterName(final String s, final boolean b) {
        String s2 = s;
        if (s == null) {
            s2 = "null";
        }
        if (b || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            final StringBuilder sb = new StringBuilder("(");
            sb.append(System.currentTimeMillis() - AFLogger.AFKeystoreWrapper);
            sb.append(") [");
            sb.append(Thread.currentThread().getName());
            sb.append("] ");
            sb.append(s2);
            return sb.toString();
        }
        return s2;
    }
    
    public static void AFInAppEventParameterName(final String s) {
        AFInAppEventParameterName(LogLevel.VERBOSE);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "V", AFInAppEventParameterName(s, true));
    }
    
    public static boolean AFInAppEventParameterName(final LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }
    
    public static void AFInAppEventType(final String s) {
        AFInAppEventParameterName(LogLevel.DEBUG);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "D", AFInAppEventParameterName(s, true));
    }
    
    public static void AFKeystoreWrapper(final String s) {
        valueOf();
        aj.AFInAppEventParameterName().AFInAppEventType(null, "F", s);
    }
    
    public static void AFLogger$LogLevel(final String s) {
        values(s);
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (!3xs.LIZ() || Build$VERSION.SDK_INT < 26) {
            sharedPreferences$Editor.apply();
            return;
        }
        if (!sharedPreferences$Editor.getClass().getName().equals("android.app.SharedPreferencesImpl$EditorImpl")) {
            sharedPreferences$Editor.apply();
            return;
        }
        final Object liz = 46U.LIZ((Object)sharedPreferences$Editor);
        if (liz == null || !46U.LIZIZ((Object)sharedPreferences$Editor, liz)) {
            sharedPreferences$Editor.apply();
            if (liz == null) {
                return;
            }
        }
        46U.LIZ((Object)sharedPreferences$Editor, liz);
    }
    
    public static void valueOf(final String s) {
        values(s, true);
    }
    
    public static void valueOf(final String s, final Throwable t) {
        valueOf(s, t, true, false);
    }
    
    public static void valueOf(String s, final Throwable t, final boolean b, final boolean b2) {
        if (AFInAppEventParameterName(LogLevel.ERROR)) {
            String string;
            if ((string = s) == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(t.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(t.getStackTrace()[0].toString());
                string = sb.toString();
            }
            AFInAppEventParameterName(string, false);
        }
        final aj afInAppEventParameterName = aj.AFInAppEventParameterName();
        final Throwable cause = t.getCause();
        final String simpleName = t.getClass().getSimpleName();
        StackTraceElement[] array;
        if (cause == null) {
            s = t.getMessage();
            array = t.getStackTrace();
        }
        else {
            s = cause.getMessage();
            array = cause.getStackTrace();
        }
        afInAppEventParameterName.AFInAppEventType("exception", simpleName, aj.AFInAppEventType(s, array));
        if (ay.AFKeystoreWrapper != null) {
            final SharedPreferences$Editor edit = ai.values((Context)ay.AFKeystoreWrapper).edit();
            long long1;
            if (ay.AFKeystoreWrapper == null) {
                long1 = -1L;
            }
            else {
                long1 = ai.values((Context)ay.AFKeystoreWrapper).getLong("exception_number", 0L);
            }
            INVOKEINTERFACE_com_appsflyer_AFLogger_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit.putLong("exception_number", long1 + 1L));
        }
    }
    
    public static void valueOf(final Throwable t) {
        valueOf(null, t, false, false);
    }
    
    public static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }
    
    public static void values(final String s) {
        AFInAppEventParameterName(LogLevel.WARNING);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "W", AFInAppEventParameterName(s, true));
    }
    
    public static void values(final String s, final Throwable t) {
        valueOf(s, t, true, true);
    }
    
    public static void values(final String s, final boolean b) {
        AFInAppEventParameterName(LogLevel.INFO);
        if (b) {
            aj.AFInAppEventParameterName().AFInAppEventType(null, "I", AFInAppEventParameterName(s, true));
        }
    }
    
    public enum LogLevel
    {
        DEBUG(4), 
        ERROR(1), 
        INFO(3), 
        NONE(0), 
        VERBOSE(5), 
        WARNING(2);
        
        public int values;
        
        static {
            Covode.recordClassIndex(2542);
        }
        
        public LogLevel(final int values) {
            this.values = values;
        }
        
        public final int getLevel() {
            return this.values;
        }
    }
}
