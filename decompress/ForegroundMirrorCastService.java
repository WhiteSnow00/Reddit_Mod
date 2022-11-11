// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.service;

import X.1Gp;
import X.67l;
import X.0ba;
import android.os.Binder;
import android.os.IBinder;
import X.06E;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.NotificationChannel;
import android.app.Notification;
import android.content.Context;
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
import com.bytedance.covode.number.Covode;
import android.app.NotificationManager;
import android.app.Service;

public class ForegroundMirrorCastService extends Service
{
    public NotificationManager mNotificationManager;
    
    static {
        Covode.recordClassIndex(5509);
    }
    
    public static Object INVOKEVIRTUAL_com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(ForegroundMirrorCastService foregroundMirrorCastService, String ex) {
        MethodCollector.i(6248);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = foregroundMirrorCastService.getSystemService((String)ex);
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
                    MethodCollector.o(6248);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    foregroundMirrorCastService = (ForegroundMirrorCastService)foregroundMirrorCastService.getSystemService((String)ex);
                    MethodCollector.o(6248);
                    return foregroundMirrorCastService;
                    foregroundMirrorCastService = (ForegroundMirrorCastService)foregroundMirrorCastService.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    foregroundMirrorCastService = (ForegroundMirrorCastService)foregroundMirrorCastService.getSystemService((String)ex);
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
    
    private Notification buildNotification(final Context context) {
        if (Build$VERSION.SDK_INT >= 26 && this.mNotificationManager.getNotificationChannel("ForegroundMirrorCastService.notification") == null) {
            final NotificationChannel notificationChannel = new NotificationChannel("ForegroundMirrorCastService.notification", (CharSequence)"Cast", 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        final Intent intent = new Intent();
        intent.putExtra("enter_from", "mirror_cast_notice");
        intent.putExtra("broadcast_type", 4);
        int n = 134217728;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 201326592;
        }
        final PendingIntent activity = PendingIntent.getActivity(context, 0, intent, n);
        06E.e e;
        if (Build$VERSION.SDK_INT >= 26) {
            e = new 06E.e(context, "ForegroundMirrorCastService.notification");
        }
        else {
            e = new 06E.e(context);
        }
        e.LIZ((CharSequence)"Live");
        e.LIZ(2131234460);
        e.LIZ(2, true);
        e.LIZ(System.currentTimeMillis());
        e.LJFF = activity;
        e.LJJIII = "service";
        e.LIZIZ();
        e.LIZIZ(true);
        e.LIZ(2, true);
        e.LJJIIZ = 0;
        return e.LJ();
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)new Binder();
    }
    
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager)INVOKEVIRTUAL_com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this, "notification");
        this.startForeground(2131368747, this.buildNotification((Context)this));
    }
    
    public void onDestroy() {
        0ba.LIZ(4, "ALogger", "BgBroadcastService onDestroy");
        this.stopForeground(true);
        super.onDestroy();
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        67l.LIZ((Service)this, intent, n, n2);
        return super.onStartCommand(intent, n, n2);
    }
    
    public void onTaskRemoved(final Intent intent) {
        0ba.LIZ(4, "ALogger", "BgBroadcastService onTaskRemoved");
        1Gp.LJIIJ.LIZIZ();
        this.stopForeground(true);
        super.onTaskRemoved(intent);
    }
    
    public void onTrimMemory(final int n) {
        0ba.LIZ(4, "ALogger", "BgBroadcastService onTrimMemory level = ".concat(String.valueOf(n)));
        super.onTrimMemory(n);
    }
}
