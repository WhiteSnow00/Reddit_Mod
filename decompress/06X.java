// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.WindowManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.app.WallpaperManager;
import android.os.Vibrator;
import android.hardware.usb.UsbManager;
import android.app.UiModeManager;
import android.view.textservice.TextServicesManager;
import android.telephony.TelephonyManager;
import android.os.storage.StorageManager;
import android.hardware.SensorManager;
import android.app.SearchManager;
import android.os.PowerManager;
import android.app.NotificationManager;
import android.nfc.NfcManager;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.app.KeyguardManager;
import android.view.inputmethod.InputMethodManager;
import android.os.DropBoxManager;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.net.ConnectivityManager;
import android.media.AudioManager;
import android.app.AlarmManager;
import android.app.ActivityManager;
import android.accounts.AccountManager;
import android.view.accessibility.AccessibilityManager;
import android.net.nsd.NsdManager;
import android.media.MediaRouter;
import android.hardware.input.InputManager;
import android.os.UserManager;
import android.hardware.display.DisplayManager;
import android.bluetooth.BluetoothManager;
import android.print.PrintManager;
import android.hardware.ConsumerIrManager;
import android.view.accessibility.CaptioningManager;
import android.app.AppOpsManager;
import android.media.tv.TvInputManager;
import android.telecom.TelecomManager;
import android.content.RestrictionsManager;
import android.media.session.MediaSessionManager;
import android.media.projection.MediaProjectionManager;
import android.content.pm.LauncherApps;
import android.app.job.JobScheduler;
import android.hardware.camera2.CameraManager;
import android.os.BatteryManager;
import android.appwidget.AppWidgetManager;
import android.app.usage.UsageStatsManager;
import android.telephony.SubscriptionManager;
import java.util.HashMap;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import com.bytedance.ies.abmock.SettingsManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Process;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 06x
{
    static {
        Covode.recordClassIndex(759);
    }
    
    public static int LIZ(final Context context, final String s) {
        if (s != null) {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
    
    public static ComponentName LIZ(Context startService, final Intent ex) {
        Label_0176: {
            if (!(startService instanceof Context)) {
                break Label_0176;
            }
            final boolean liz = KiO.LIZ(startService, (Intent)ex);
            final Context context = null;
            if (liz) {
                return null;
            }
            int i = 0;
            while (true) {
                try {
                    try {
                        if (SettingsManager.LIZ().LIZ("StartServiceLancet_startService", false) && Build$VERSION.SDK_INT >= 26 && NR7.LJIIJJI) {
                            final StringBuilder sb = new StringBuilder("dangerousStartService warning! make sure you are in forground call startService ");
                            sb.append(ex.getClass().getName());
                            VYh.LIZ(sb.toString());
                        }
                        startService = (Context)startService.startService((Intent)ex);
                    }
                    catch (final RuntimeException ex) {
                        final StackTraceElement[] stackTrace = ex.getStackTrace();
                        final int length = stackTrace.length;
                        int n = 0;
                        while (i < length) {
                            startService = (Context)stackTrace[i];
                            int n2 = n;
                            if (((StackTraceElement)startService).getClassName().startsWith("com.ss.android.ugc.aweme.scheduler.PublishService")) {
                                n2 = n;
                                if ("show".equals(((StackTraceElement)startService).getMethodName())) {
                                    n2 = 1;
                                }
                            }
                            ++i;
                            n = n2;
                        }
                        if (n == 0) {
                            throw ex;
                        }
                        startService = context;
                    }
                    return (ComponentName)startService;
                    return startService.startService((Intent)ex);
                }
                catch (final Exception ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static Drawable LIZ(final Context context, final int n) {
        return context.getDrawable(n);
    }
    
    public static void LIZ(final Context context, final Intent intent, final Bundle bundle) {
        Q0z.LIZ(intent, (Object)context);
        LIZIZ(context, intent, bundle);
    }
    
    public static boolean LIZ(final Context context, final Intent[] array, final Bundle bundle) {
        context.startActivities(array, bundle);
        return true;
    }
    
    public static ColorStateList LIZIZ(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n);
        }
        return context.getResources().getColorStateList(n);
    }
    
    public static Object LIZIZ(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
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
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static void LIZIZ(final Context context, final Intent intent, final Bundle bundle) {
        0Qu.LIZ(intent, context);
        context.startActivity(intent, bundle);
    }
    
    public static int LIZJ(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return context.getColor(n);
        }
        return context.getResources().getColor(n);
    }
    
    public static final class a
    {
        public static final HashMap<Class<?>, String> LIZ;
        
        static {
            Covode.recordClassIndex(760);
            final HashMap<Class<?>, String> hashMap = LIZ = new HashMap<Class<?>, String>();
            if (Build$VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }
}
