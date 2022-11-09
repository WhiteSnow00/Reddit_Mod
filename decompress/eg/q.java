// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.app.Service;
import android.os.BaseBundle;
import android.os.RemoteException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import android.app.PendingIntent;
import android.app.Notification$Builder;
import android.app.NotificationChannel;
import android.os.Build$VERSION;
import ig.g0;
import ig.d1;
import android.os.Bundle;
import android.app.NotificationManager;
import com.google.android.play.core.assetpacks.c;
import android.content.Context;
import dg.k;
import ig.c1;

public final class q extends c1
{
    public final k a;
    public final Context b;
    public final c c;
    public final n1 d;
    public final h0 e;
    public final NotificationManager f;
    
    public q(final Context b, final c c, final n1 d, final h0 e) {
        this.a = new k("AssetPackExtractionService");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (NotificationManager)b.getSystemService("notification");
    }
    
    public final void m(Bundle i, final d1 d1) throws RemoteException {
        synchronized (this) {
            this.a.g("updateServiceState AIDL call", new Object[0]);
            if (g0.b(this.b)) {
                if (g0.a(this.b)) {
                    final int int1 = ((BaseBundle)i).getInt("action_type");
                    final h0 e = this.e;
                    Object o = e.g;
                    synchronized (o) {
                        e.g.add(d1);
                        monitorexit(o);
                        if (int1 == 1) {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            if (sdk_INT >= 26) {
                                o = ((BaseBundle)i).getString("notification_channel_name");
                                monitorenter(this);
                                if (o == null) {}
                                try {
                                    o = new NotificationChannel("playcore-assetpacks-service-notification-channel", (CharSequence)o, 2);
                                    this.f.createNotificationChannel((NotificationChannel)o);
                                }
                                finally {
                                    monitorexit(this);
                                }
                            }
                            this.d.a(true);
                            final h0 e2 = this.e;
                            final String string = ((BaseBundle)i).getString("notification_title");
                            final String string2 = ((BaseBundle)i).getString("notification_subtext");
                            final long long1 = ((BaseBundle)i).getLong("notification_timeout", 600000L);
                            o = i.getParcelable("notification_on_click_intent");
                            Notification$Builder notification$Builder;
                            if (sdk_INT >= 26) {
                                notification$Builder = new Notification$Builder(this.b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(long1);
                            }
                            else {
                                notification$Builder = new Notification$Builder(this.b).setPriority(-2);
                            }
                            if (o instanceof PendingIntent) {
                                notification$Builder.setContentIntent((PendingIntent)o);
                            }
                            final Notification$Builder setOngoing = notification$Builder.setSmallIcon(17301633).setOngoing(false);
                            if ((o = string) == null) {
                                o = "Downloading additional file";
                            }
                            final Notification$Builder setContentTitle = setOngoing.setContentTitle((CharSequence)o);
                            if ((o = string2) == null) {
                                o = "Transferring";
                            }
                            setContentTitle.setSubText((CharSequence)o);
                            final int int2 = ((BaseBundle)i).getInt("notification_color");
                            if (int2 != 0) {
                                notification$Builder.setColor(int2).setVisibility(-1);
                            }
                            e2.j = notification$Builder.build();
                            this.b.bindService(new Intent(this.b, (Class)ExtractionForegroundService.class), (ServiceConnection)this.e, 1);
                            return;
                        }
                        if (int1 == 2) {
                            this.d.a(false);
                            final h0 e3 = this.e;
                            e3.f.g("Stopping foreground installation service.", new Object[0]);
                            e3.h.unbindService((ServiceConnection)e3);
                            i = (Bundle)e3.i;
                            if (i != null) {
                                synchronized (i) {
                                    ((Service)i).stopForeground(true);
                                    ((Service)i).stopSelf();
                                }
                            }
                            e3.a();
                            return;
                        }
                        this.a.h("Unknown action type received: %d", new Object[] { int1 });
                        d1.b(new Bundle());
                        return;
                    }
                }
            }
            d1.b(new Bundle());
        }
    }
}
