// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.location.Location;
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

public final class x
{
    static {
        Covode.recordClassIndex(2716);
    }
    
    public static boolean AFKeystoreWrapper(final Context context, final String[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (ac.AFKeystoreWrapper(context, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static Object INVOKEVIRTUAL_com_appsflyer_internal_x_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String declaredField) {
        MethodCollector.i(4546);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(4546);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    MethodCollector.o(4546);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)declaredField);
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
    
    public final Location AFInAppEventType(final Context context) {
        try {
            INVOKEVIRTUAL_com_appsflyer_internal_x_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "location");
            AFKeystoreWrapper(context, new String[] { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" });
            AFKeystoreWrapper(context, new String[] { "android.permission.ACCESS_FINE_LOCATION" });
            return null;
        }
        finally {
            return null;
        }
    }
    
    public static final class d
    {
        public static final x AFInAppEventType;
        
        static {
            Covode.recordClassIndex(2717);
            AFInAppEventType = new x();
        }
    }
}
