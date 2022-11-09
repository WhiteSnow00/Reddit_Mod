// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.telephony.TelephonyManager;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import com.bytedance.covode.number.Covode;

public final class 0My
{
    static {
        Covode.recordClassIndex(2888);
    }
    
    public static NetworkInfo LIZ(final ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        }
        catch (final Exception ex) {
            4ch.LIZ((Throwable)ex);
            return 4MB.LIZ();
        }
    }
    
    public static Object LIZ(Context context, String declaredField) {
        MethodCollector.i(14411);
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
                    MethodCollector.o(14411);
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
                    MethodCollector.o(14411);
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
    
    public static String LIZ() {
        final Context liz = 0NJ.LJIILJJIL.LIZ;
        if (liz == null) {
            return "unknown";
        }
        final ConnectivityManager connectivityManager = (ConnectivityManager)LIZ(liz, "connectivity");
        if (connectivityManager == null) {
            return "unknown";
        }
        final NetworkInfo liz2 = LIZ(connectivityManager);
        if (liz2 != null && liz2.getType() == 1) {
            return "wifi";
        }
        final TelephonyManager telephonyManager = (TelephonyManager)LIZ(liz, "phone");
        if (telephonyManager == null) {
            return "unknown";
        }
        if (06x.LIZ(liz, "android.permission.READ_PHONE_STATE") != 0) {
            return "unknown";
        }
        int n = 0;
        Label_0185: {
            if (Build$VERSION.SDK_INT >= 29) {
                if (!6TW.LIZ.getAndSet(true)) {
                    6TW.LIZ().LIZIZ();
                }
                n = 6TW.LIZ().LIZIZ.get();
                if (6TW.LIZJ || (n = n) != -1) {
                    break Label_0185;
                }
            }
            else {
                final 5an liz3 = new 5aq().LIZ(102013, "android/telephony/TelephonyManager", "getNetworkType", (Object)telephonyManager, new Object[0], "int", new 5dv(false));
                if (liz3.LIZ) {
                    n = (int)liz3.LIZIZ;
                    break Label_0185;
                }
                n = telephonyManager.getNetworkType();
                break Label_0185;
            }
            return "unknown";
        }
        switch (n) {
            default: {
                return "unknown";
            }
            case 1:
            case 2:
            case 4:
            case 7:
            case 11: {
                return "2G";
            }
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15: {
                return "3G";
            }
            case 13: {
                return "4G";
            }
        }
    }
}
