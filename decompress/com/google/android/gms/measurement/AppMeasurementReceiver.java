// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement;

import android.util.SparseArray;
import android.os.PowerManager$WakeLock;
import android.content.ComponentName;
import re.c3;
import android.os.PowerManager;
import ke.a1;
import re.h4;
import android.content.Intent;
import android.content.Context;
import re.v3;
import re.u3;
import u4.a;

public final class AppMeasurementReceiver extends a implements u3
{
    public v3 h;
    
    public final void onReceive(final Context context, Intent f) {
        if (this.h == null) {
            this.h = new v3((u3)this);
        }
        final v3 h = this.h;
        h.getClass();
        final c3 f2 = h4.t(context, null, null).f();
        if (f == null) {
            f2.n.a("Receiver called with null intent");
        }
        else {
            final String action = f.getAction();
            f2.s.b(action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                final Intent setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
                f2.s.a("Starting wakeful intent.");
                ((AppMeasurementReceiver)h.a).getClass();
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
                f2.n.a("Install Referrer Broadcasts are deprecated");
            }
        }
    }
}
