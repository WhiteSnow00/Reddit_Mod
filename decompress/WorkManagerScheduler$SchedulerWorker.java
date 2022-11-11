// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ext.workmanager;

import androidx.work.b;
import androidx.work.ListenableWorker$a$b;
import android.util.Log;
import androidx.work.ListenableWorker$a$c;
import a4.u;
import ad.c0;
import android.content.Intent;
import zb.a;
import androidx.work.ListenableWorker$a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.Worker;

public final class WorkManagerScheduler$SchedulerWorker extends Worker
{
    public final WorkerParameters g;
    public final Context h;
    
    public WorkManagerScheduler$SchedulerWorker(final Context h, final WorkerParameters g) {
        super(h, g);
        this.g = g;
        this.h = h;
    }
    
    public final ListenableWorker$a a() {
        final b b = this.g.b;
        b.getClass();
        final int a = new a(b.b("requirements", 0)).a(this.h);
        if (a == 0) {
            final String d = b.d("service_action");
            d.getClass();
            final String d2 = b.d("service_package");
            d2.getClass();
            final Intent setPackage = new Intent(d).setPackage(d2);
            final Context h = this.h;
            if (c0.a >= 26) {
                u.b(h, setPackage);
            }
            else {
                h.startService(setPackage);
            }
            return (ListenableWorker$a)new ListenableWorker$a$c();
        }
        final StringBuilder sb = new StringBuilder(33);
        sb.append("Requirements not met: ");
        sb.append(a);
        Log.w("WorkManagerScheduler", sb.toString());
        return (ListenableWorker$a)new ListenableWorker$a$b();
    }
}
