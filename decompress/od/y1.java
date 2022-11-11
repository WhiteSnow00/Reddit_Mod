// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.BaseBundle;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import md.b;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import md.e;
import de.f;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public abstract class y1 extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    public volatile boolean g;
    public final AtomicReference<v1> h;
    public final f i;
    public final e j;
    
    public y1(final h h, final e j) {
        super(h);
        this.h = new AtomicReference<v1>(null);
        this.i = new f(Looper.getMainLooper());
        this.j = j;
    }
    
    public final void d(int n, final int n2, final Intent intent) {
        final v1 v1 = this.h.get();
        if (n != 1) {
            if (n == 2) {
                n = this.j.f((Context)this.b());
                if (n == 0) {
                    this.l();
                    return;
                }
                if (v1 == null) {
                    return;
                }
                if (v1.b.g == 18 && n == 18) {
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
                if (v1 == null) {
                    return;
                }
                n = 13;
                if (intent != null) {
                    n = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                final b b = new b(1, n, (PendingIntent)null, v1.b.toString());
                n = v1.a;
                this.h.set(null);
                this.j(b, n);
                return;
            }
        }
        if (v1 != null) {
            final b b2 = v1.b;
            n = v1.a;
            this.h.set(null);
            this.j(b2, n);
        }
    }
    
    public final void e(final Bundle bundle) {
        if (bundle != null) {
            final AtomicReference<v1> h = this.h;
            v1 v1;
            if (((BaseBundle)bundle).getBoolean("resolving_error", false)) {
                v1 = new v1(new b(((BaseBundle)bundle).getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), ((BaseBundle)bundle).getInt("failed_client_id", -1));
            }
            else {
                v1 = null;
            }
            h.set(v1);
        }
    }
    
    public final void g(final Bundle bundle) {
        final v1 v1 = this.h.get();
        if (v1 == null) {
            return;
        }
        ((BaseBundle)bundle).putBoolean("resolving_error", true);
        ((BaseBundle)bundle).putInt("failed_client_id", v1.a);
        ((BaseBundle)bundle).putInt("failed_status", v1.b.g);
        bundle.putParcelable("failed_resolution", (Parcelable)v1.b.h);
    }
    
    public abstract void j(final b p0, final int p1);
    
    public abstract void k();
    
    public final void l() {
        this.h.set(null);
        this.k();
    }
    
    public final void m(final b b, int n) {
        final v1 v1 = new v1(b, n);
        final AtomicReference<v1> h = this.h;
        while (true) {
            while (!h.compareAndSet(null, v1)) {
                if (h.get() != null) {
                    n = 0;
                    if (n != 0) {
                        this.i.post((Runnable)new x1(this, v1));
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
        final v1 v1 = this.h.get();
        int a;
        if (v1 == null) {
            a = -1;
        }
        else {
            a = v1.a;
        }
        this.h.set(null);
        this.j(b, a);
    }
}
