// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.util.SparseArray;
import android.os.PowerManager$WakeLock;
import android.content.ComponentName;
import pe.d3;
import android.os.PowerManager;
import ie.c1;
import pe.h4;
import android.content.Intent;
import android.content.Context;
import pe.w3;
import pe.v3;
import u4.a;

public final class AppMeasurementReceiver extends a implements v3
{
    public w3 h;
    
    public final void onReceive(final Context context, Intent f) {
        if (this.h == null) {
            this.h = new w3(this);
        }
        final w3 h = this.h;
        h.getClass();
        final d3 h2 = h4.s(context, (c1)null, (Long)null).h();
        if (f == null) {
            h2.n.a("Receiver called with null intent");
        }
        else {
            final String action = f.getAction();
            h2.s.b((Object)action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final Intent setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
                h2.s.a("Starting wakeful intent.");
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
                h2.n.a("Install Referrer Broadcasts are deprecated");
            }
        }
    }
}
