// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Handler;
import android.os.BaseBundle;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import nd.b;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import nd.e;
import ee.f;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public abstract class x1 extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    public volatile boolean g;
    public final AtomicReference<u1> h;
    public final f i;
    public final e j;
    
    public x1(final h h, final e j) {
        super(h);
        this.h = new AtomicReference<u1>(null);
        this.i = new f(Looper.getMainLooper());
        this.j = j;
    }
    
    public final void d(int n, final int n2, final Intent intent) {
        final u1 u1 = this.h.get();
        if (n != 1) {
            if (n == 2) {
                n = this.j.f((Context)this.b());
                if (n == 0) {
                    this.l();
                    return;
                }
                if (u1 == null) {
                    return;
                }
                if (u1.b.g == 18 && n == 18) {
                    return;
                }
            }
        }
        else {
            if (n2 == -1) {
                this.l();
                return;
            }
            if (n2 == 0) {
                if (u1 == null) {
                    return;
                }
                n = 13;
                if (intent != null) {
                    n = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                final b b = new b(1, n, (PendingIntent)null, u1.b.toString());
                n = u1.a;
                this.h.set(null);
                this.j(b, n);
                return;
            }
        }
        if (u1 != null) {
            final b b2 = u1.b;
            n = u1.a;
            this.h.set(null);
            this.j(b2, n);
        }
    }
    
    public final void e(final Bundle bundle) {
        if (bundle != null) {
            final AtomicReference<u1> h = this.h;
            u1 u1;
            if (((BaseBundle)bundle).getBoolean("resolving_error", false)) {
                u1 = new u1(new b(((BaseBundle)bundle).getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), ((BaseBundle)bundle).getInt("failed_client_id", -1));
            }
            else {
                u1 = null;
            }
            h.set(u1);
        }
    }
    
    public final void g(final Bundle bundle) {
        final u1 u1 = this.h.get();
        if (u1 == null) {
            return;
        }
        ((BaseBundle)bundle).putBoolean("resolving_error", true);
        ((BaseBundle)bundle).putInt("failed_client_id", u1.a);
        ((BaseBundle)bundle).putInt("failed_status", u1.b.g);
        bundle.putParcelable("failed_resolution", (Parcelable)u1.b.h);
    }
    
    public abstract void j(final b p0, final int p1);
    
    public abstract void k();
    
    public final void l() {
        this.h.set(null);
        this.k();
    }
    
    public final void m(final b b, int n) {
        final u1 u1 = new u1(b, n);
        final AtomicReference<u1> h = this.h;
        while (true) {
            while (!h.compareAndSet(null, u1)) {
                if (h.get() != null) {
                    n = 0;
                    if (n != 0) {
                        ((Handler)this.i).post((Runnable)new w1(this, u1));
                    }
                    return;
                }
            }
            n = 1;
            continue;
        }
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final b b = new b(13, (PendingIntent)null);
        final u1 u1 = this.h.get();
        int a;
        if (u1 == null) {
            a = -1;
        }
        else {
            a = u1.a;
        }
        this.h.set(null);
        this.j(b, a);
    }
}
