// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.tools;

import X.6Fr;
import android.content.SharedPreferences;
import android.content.Context;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.text.TextUtils;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import X.0NJ;
import com.bytedance.covode.number.Covode;

public class DefaultSharedpreference
{
    public static DefaultSharedpreference sInstance;
    public String sFileName;
    
    static {
        Covode.recordClassIndex(3019);
    }
    
    public DefaultSharedpreference() {
        this.setFileName("default_config");
    }
    
    public static boolean Contains(final String s, final String s2) {
        return getInstance().contains(0NJ.LJIILJJIL.LIZ, s, s2);
    }
    
    public static void INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    private boolean checkFileName() {
        return !TextUtils.isEmpty((CharSequence)this.sFileName);
    }
    
    private boolean checkFileName(final String s) {
        return !TextUtils.isEmpty((CharSequence)s);
    }
    
    public static boolean getBoolean(final String s, final String s2, final boolean b) {
        return getInstance().getBoolean(0NJ.LJIILJJIL.LIZ, s, s2, b);
    }
    
    public static float getFloat(final String s, final String s2, final float n) {
        return getInstance().getFloat(0NJ.LJIILJJIL.LIZ, s, s2, n);
    }
    
    public static DefaultSharedpreference getInstance() {
        MethodCollector.i(12430);
        if (DefaultSharedpreference.sInstance == null) {
            monitorenter(DefaultSharedpreference.class);
            try {
                if (DefaultSharedpreference.sInstance == null) {
                    DefaultSharedpreference.sInstance = new DefaultSharedpreference();
                }
                monitorexit(DefaultSharedpreference.class);
            }
            finally {
                monitorexit(DefaultSharedpreference.class);
                MethodCollector.o(12430);
            }
        }
        final DefaultSharedpreference sInstance = DefaultSharedpreference.sInstance;
        MethodCollector.o(12430);
        return sInstance;
    }
    
    public static long getLong(final String s, final String s2, final long n) {
        return getInstance().getLong(0NJ.LJIILJJIL.LIZ, s, s2, n);
    }
    
    private SharedPreferences getSp(final Context context, final String s) {
        if (context == null) {
            return null;
        }
        if (!this.checkFileName(s)) {
            return null;
        }
        return 6Fr.LIZ(context, s, 0);
    }
    
    public static String getString(final String s, final String s2, final String s3) {
        return getInstance().getString(0NJ.LJIILJJIL.LIZ, s, s2, s3);
    }
    
    public static void storeBoolean(final String s, final String s2, final boolean b) {
        getInstance().setBoolean(0NJ.LJIILJJIL.LIZ, s, s2, b);
    }
    
    public static void storeFloat(final String s, final String s2, final float n) {
        getInstance().setFloat(0NJ.LJIILJJIL.LIZ, s, s2, n);
    }
    
    public static void storeLong(final String s, final String s2, final long n) {
        getInstance().setLong(0NJ.LJIILJJIL.LIZ, s, s2, n);
    }
    
    public static void storeString(final String s, final String s2, final String s3) {
        getInstance().setString(0NJ.LJIILJJIL.LIZ, s, s2, s3);
    }
    
    public boolean contains(final Context context, final String s, final String s2) {
        final SharedPreferences sp = this.getSp(context, s);
        return sp != null && sp.contains(s2);
    }
    
    public boolean getBoolean(final Context context, final String s) {
        return this.getBoolean(context, this.sFileName, s, false);
    }
    
    public boolean getBoolean(final Context context, final String s, final String s2, final boolean b) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return b;
        }
        return sp.getBoolean(s2, b);
    }
    
    public boolean getBoolean(final Context context, final String s, final boolean b) {
        return this.getBoolean(context, this.sFileName, s, b);
    }
    
    public float getFloat(final Context context, final String s) {
        return this.getFloat(context, this.sFileName, s, 0.0f);
    }
    
    public float getFloat(final Context context, final String s, final float n) {
        return this.getFloat(context, this.sFileName, s, n);
    }
    
    public float getFloat(final Context context, final String s, final String s2, final float n) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return n;
        }
        return sp.getFloat(s2, n);
    }
    
    public int getInt(final Context context, final String s) {
        final SharedPreferences sp = this.getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(s, 0);
    }
    
    public int getInt(final Context context, final String s, final int n) {
        final SharedPreferences sp = this.getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(s, n);
    }
    
    public long getLong(final Context context, final String s) {
        return this.getLong(context, this.sFileName, s, 0L);
    }
    
    public long getLong(final Context context, final String s, final long n) {
        return this.getLong(context, this.sFileName, s, n);
    }
    
    public long getLong(final Context context, final String s, final String s2, final long n) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return n;
        }
        return sp.getLong(s2, n);
    }
    
    public String getString(final Context context, final String s) {
        return this.getString(context, this.sFileName, s, "");
    }
    
    public String getString(final Context context, final String s, final String s2) {
        return this.getString(context, this.sFileName, s, s2);
    }
    
    public String getString(final Context context, final String s, final String s2, final String s3) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return s3;
        }
        return sp.getString(s2, s3);
    }
    
    public void setBoolean(final Context context, final String s, final String s2, final boolean b) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return;
        }
        final SharedPreferences$Editor edit = sp.edit();
        edit.putBoolean(s2, b);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public void setBoolean(final Context context, final String s, final boolean b) {
        final SharedPreferences sp = this.getSp(context, this.sFileName);
        if (sp == null) {
            return;
        }
        final SharedPreferences$Editor edit = sp.edit();
        edit.putBoolean(s, b);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public void setFileName(final String sFileName) {
        this.sFileName = sFileName;
    }
    
    public void setFloat(final Context context, final String s, final float n) {
        this.setFloat(context, this.sFileName, s, n);
    }
    
    public void setFloat(final Context context, final String s, final String s2, final float n) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return;
        }
        final SharedPreferences$Editor edit = sp.edit();
        edit.putFloat(s2, n);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public void setInt(final Context context, final String s, final int n) {
        final SharedPreferences$Editor edit = 6Fr.LIZ(context, this.sFileName, 0).edit();
        edit.putInt(s, n);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public void setLong(final Context context, final String s, final long n) {
        this.setLong(context, this.sFileName, s, n);
    }
    
    public void setLong(final Context context, final String s, final String s2, final long n) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return;
        }
        final SharedPreferences$Editor edit = sp.edit();
        edit.putLong(s2, n);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
    
    public void setString(final Context context, final String s, final String s2) {
        this.setString(context, this.sFileName, s, s2);
    }
    
    public void setString(final Context context, final String s, final String s2, final String s3) {
        final SharedPreferences sp = this.getSp(context, s);
        if (sp == null) {
            return;
        }
        final SharedPreferences$Editor edit = sp.edit();
        edit.putString(s2, s3);
        INVOKEINTERFACE_com_benchmark_tools_DefaultSharedpreference_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(edit);
    }
}
