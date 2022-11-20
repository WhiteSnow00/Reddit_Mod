// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.t;
import com.google.android.gms.internal.firebase_auth_api.u;
import com.google.android.gms.internal.firebase_auth_api.x0;

public final class t3 extends e6
{
    public final int b;
    
    public t3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final w0 a(final w0 w0) {
        switch (this.b) {
            default: {
                final x0 x0 = (x0)w0;
                final b9 s = com.google.android.gms.internal.firebase_auth_api.w0.s();
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                com.google.android.gms.internal.firebase_auth_api.w0.x((com.google.android.gms.internal.firebase-auth-api.w0)((z)s).g, (com.google.android.gms.internal.firebase-auth-api.x0)x0);
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                com.google.android.gms.internal.firebase_auth_api.w0.w((com.google.android.gms.internal.firebase-auth-api.w0)((z)s).g);
                return (w0)((z)s).c();
            }
            case 0: {
                final u u = (u)w0;
                final v7 s2 = t.s();
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(u.r()));
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                t.x((com.google.android.gms.internal.firebase-auth-api.t)((z)s2).g, zzn);
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                t.w((com.google.android.gms.internal.firebase-auth-api.t)((z)s2).g);
                return (w0)((z)s2).c();
            }
        }
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) {
        switch (this.b) {
            default: {
                return (w0)x0.t(zzaau, r.a());
            }
            case 0: {
                return (w0)u.u(zzaau, r.a());
            }
        }
    }
    
    public final Map c() {
        switch (this.b) {
            default: {
                return Collections.emptyMap();
            }
            case 0: {
                final HashMap hashMap = new HashMap();
                hashMap.put("AES128_GCM", u3.h(16, 1));
                hashMap.put("AES128_GCM_RAW", u3.h(16, 3));
                hashMap.put("AES256_GCM", u3.h(32, 1));
                hashMap.put("AES256_GCM_RAW", u3.h(32, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
        }
    }
    
    public final void d(final w0 w0) {
        switch (this.b) {
            default: {
                final x0 x0 = (x0)w0;
                return;
            }
            case 0: {
                ea.b(((u)w0).r());
            }
        }
    }
}
