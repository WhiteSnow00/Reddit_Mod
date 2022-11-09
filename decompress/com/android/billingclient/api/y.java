// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.os.IInterface;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.play_billing.b;
import com.google.android.gms.internal.play_billing.c;
import com.google.android.gms.internal.play_billing.a;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class y implements ServiceConnection
{
    public final Object f = new Object();
    public i g = g;
    public final /* synthetic */ d h;
    
    public final void a(final k k) {
        synchronized (this.f) {
            final i g = this.g;
            if (g != null) {
                g.e(k);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        a.e("BillingClient", "Billing service connected.");
        final d h = this.h;
        final int a = c.a;
        Object f;
        if (binder == null) {
            f = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.d) {
                f = queryLocalInterface;
            }
            else {
                f = new b(binder);
            }
        }
        h.f = (com.google.android.gms.internal.play_billing.d)f;
        final d h2 = this.h;
        if (h2.f((Callable)new x(this, 0), 30000L, (Runnable)new w(this, 0), h2.c()) == null) {
            this.a(this.h.e());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        a.f("BillingClient", "Billing service disconnected.");
        this.h.f = null;
        this.h.a = 0;
        synchronized (this.f) {
            final i g = this.g;
            if (g != null) {
                g.h();
            }
        }
    }
}
