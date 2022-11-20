// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.util.SparseArray;
import android.os.PowerManager$WakeLock;
import android.content.ComponentName;
import qe.h3;
import android.os.PowerManager;
import je.a1;
import qe.j4;
import android.content.Intent;
import android.content.Context;
import qe.z3;
import qe.y3;
import t4.a;

public final class AppMeasurementReceiver extends a implements y3
{
    public z3 h;
    
    public final void onReceive(final Context context, Intent f) {
        if (this.h == null) {
            this.h = new z3(this);
        }
        final z3 h = this.h;
        h.getClass();
        final h3 c = j4.t(context, (a1)null, (Long)null).c();
        if (f == null) {
            c.p.a("Receiver called with null intent");
        }
        else {
            final String action = f.getAction();
            c.u.b((Object)action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final Intent setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
                c.u.a("Starting wakeful intent.");
                h.a.getClass();
                f = (Intent)a.f;
                synchronized (f) {
                    final int g = a.g;
                    if ((a.g = g + 1) <= 0) {
                        a.g = 1;
                    }
                    setClassName.putExtra("androidx.contentpager.content.wakelockid", g);
                    final ComponentName startService = context.startService(setClassName);
                    if (startService == null) {
                        return;
                    }
                    final PowerManager powerManager = (PowerManager)context.getSystemService("power");
                    final StringBuilder sb = new StringBuilder();
                    sb.append("androidx.core:wake:");
                    sb.append(startService.flattenToShortString());
                    final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, sb.toString());
                    wakeLock.setReferenceCounted(false);
                    wakeLock.acquire(60000L);
                    ((SparseArray)f).put(g, (Object)wakeLock);
                    return;
                }
            }
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c.p.a("Install Referrer Broadcasts are deprecated");
            }
        }
    }
}
