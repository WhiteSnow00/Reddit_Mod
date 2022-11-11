// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;

public class g0
{
    public volatile x0 a;
    public volatile zzaau b;
    
    static {
        r.a();
    }
    
    public final zzaau a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
            }
            else {
                this.b = this.a.h();
            }
            return this.b;
        }
    }
    
    public final void b(final x0 x0) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = x0;
                    this.b = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
                }
                catch (final zzacf zzacf) {
                    this.a = x0;
                    this.b = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
                }
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g0)) {
            return false;
        }
        final g0 g0 = (g0)o;
        final x0 a = this.a;
        final x0 a2 = g0.a;
        if (a == null && a2 == null) {
            return ((com.google.android.gms.internal.firebase_auth_api.zzaau)this.a()).equals((Object)g0.a());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            g0.b((x0)((y0)a).j());
            return a.equals(g0.a);
        }
        this.b((x0)((y0)a2).j());
        return this.a.equals(a2);
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
}
