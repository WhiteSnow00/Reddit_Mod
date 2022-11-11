// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import c6.d;
import android.app.Notification;
import android.app.NotificationChannel;
import android.os.Build$VERSION;
import android.app.NotificationManager;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat$Builder;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/video/render/RenderingNotificationsHelper;", "", "Lhg2/j;", "createNotificationChannel", "Lc6/d;", "createForegroundInfo", "Landroid/app/Notification;", "buildNotification", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "iconResId", "I", "notificationId", "Landroid/app/PendingIntent;", "stopRenderingIntent", "Landroid/app/PendingIntent;", "Landroidx/core/app/NotificationCompat$Builder;", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "<init>", "(Landroid/content/Context;IILandroid/app/PendingIntent;Landroidx/core/app/NotificationCompat$Builder;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class RenderingNotificationsHelper
{
    public static final int $stable;
    public static final String CHANNEL_ID = "Rendering Channel";
    public static final Companion Companion;
    private static final AtomicInteger START_NOTIFICATION_ID;
    public static final String TAG = "PrepareVideoWorker";
    private final Context context;
    private int iconResId;
    private NotificationCompat$Builder notificationBuilder;
    private int notificationId;
    private PendingIntent stopRenderingIntent;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
        START_NOTIFICATION_ID = new AtomicInteger(1000);
    }
    
    public RenderingNotificationsHelper(final Context context, final int iconResId, final int notificationId, final PendingIntent stopRenderingIntent, final NotificationCompat$Builder notificationBuilder) {
        e.f((Object)context, "context");
        e.f((Object)stopRenderingIntent, "stopRenderingIntent");
        e.f((Object)notificationBuilder, "notificationBuilder");
        this.context = context;
        this.iconResId = iconResId;
        this.notificationId = notificationId;
        this.stopRenderingIntent = stopRenderingIntent;
        this.notificationBuilder = notificationBuilder;
    }
    
    public static final /* synthetic */ AtomicInteger access$getSTART_NOTIFICATION_ID$cp() {
        return RenderingNotificationsHelper.START_NOTIFICATION_ID;
    }
    
    private final void createNotificationChannel() {
        final NotificationManager notificationManager = (NotificationManager)this.context.getSystemService((Class)NotificationManager.class);
        if (Build$VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel;
            if (notificationManager != null) {
                notificationChannel = notificationManager.getNotificationChannel("Rendering Channel");
            }
            else {
                notificationChannel = null;
            }
            if (notificationChannel == null) {
                final NotificationChannel notificationChannel2 = new NotificationChannel("Rendering Channel", (CharSequence)"PrepareVideoWorker", 2);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel2);
                }
            }
        }
    }
    
    public final Notification buildNotification() {
        if (this.iconResId == 0) {
            this.iconResId = 2131232700;
        }
        final String string = this.context.getString(2131956900);
        e.e((Object)string, "context.getString(R.string.preparing_video)");
        final String string2 = this.context.getString(2131952326);
        e.e((Object)string2, "context.getString(R.string.cancel)");
        final Notification build = this.notificationBuilder.setContentTitle((CharSequence)string).setTicker((CharSequence)string).setSmallIcon(this.iconResId).setOngoing(true).addAction(2131231527, (CharSequence)string2, this.stopRenderingIntent).build();
        e.e((Object)build, "notificationBuilder\n    \u2026ingIntent)\n      .build()");
        return build;
    }
    
    public final d createForegroundInfo() {
        if (Build$VERSION.SDK_INT >= 26) {
            this.createNotificationChannel();
        }
        return new d(this.notificationId, 0, this.buildNotification());
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/video/render/RenderingNotificationsHelper$Companion;", "", "()V", "CHANNEL_ID", "", "START_NOTIFICATION_ID", "Ljava/util/concurrent/atomic/AtomicInteger;", "getSTART_NOTIFICATION_ID", "()Ljava/util/concurrent/atomic/AtomicInteger;", "TAG", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final AtomicInteger getSTART_NOTIFICATION_ID() {
            return RenderingNotificationsHelper.access$getSTART_NOTIFICATION_ID$cp();
        }
    }
}
