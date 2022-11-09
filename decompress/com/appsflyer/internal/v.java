// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Arrays;
import com.appsflyer.AFLogger;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class v
{
    public final boolean AFInAppEventParameterName;
    public final byte[] AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;
    public final Map<String, String> values;
    
    static {
        Covode.recordClassIndex(2713);
    }
    
    public v() {
    }
    
    public v(final String afKeystoreWrapper, final byte[] afInAppEventType, final String valueOf, final Map<String, String> values) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventType = afInAppEventType;
        this.valueOf = valueOf;
        this.values = values;
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_v_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
        MethodCollector.i(2476);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(2476);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(2476);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static Map<String, String> values(final Context context) {
        final HashMap hashMap = new HashMap();
        try {
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager)INVOKEVIRTUAL_com_appsflyer_internal_v_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
            final int screenLayout = context.getResources().getConfiguration().screenLayout;
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(screenLayout & 0xF));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("Couldn't aggregate screen stats: ", t);
        }
        return hashMap;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final v v = (v)o;
        return this.AFKeystoreWrapper.equals(v.AFKeystoreWrapper) && Arrays.equals(this.AFInAppEventType, v.AFInAppEventType) && this.valueOf.equals(v.valueOf) && this.values.equals(v.values);
    }
    
    @Override
    public final int hashCode() {
        return (((this.AFKeystoreWrapper.hashCode() * 31 + Arrays.hashCode(this.AFInAppEventType)) * 31 + this.valueOf.hashCode()) * 31 + this.values.hashCode()) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Request{url='");
        sb.append(this.AFKeystoreWrapper);
        sb.append('\'');
        sb.append(", body=");
        sb.append(Arrays.toString(this.AFInAppEventType));
        sb.append(", method='");
        sb.append(this.valueOf);
        sb.append('\'');
        sb.append(", headers=");
        sb.append(this.values);
        sb.append(", isEncrypted=false}");
        return sb.toString();
    }
}
