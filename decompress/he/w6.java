// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Collections;
import com.google.android.gms.internal.firebase-auth-api.e;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.k;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.i;
import com.google.android.gms.internal.firebase-auth-api.j;

public final class w6 extends e6
{
    public w6() {
        super((Class)j.class);
    }
    
    public final w0 a(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.j j = (com.google.android.gms.internal.firebase_auth_api.j)w0;
        final j7 s = i.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        i.x((com.google.android.gms.internal.firebase-auth-api.i)((z)s).g);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(j.r()));
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        i.y((com.google.android.gms.internal.firebase-auth-api.i)((z)s).g, zzn);
        final k v = j.v();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        i.z((com.google.android.gms.internal.firebase-auth-api.i)((z)s).g, v);
        return (w0)((z)s).c();
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.j.u(zzaau, r.a());
    }
    
    public final Map c() throws GeneralSecurityException {
        final HashMap hashMap = new HashMap();
        final k7 s = com.google.android.gms.internal.firebase_auth_api.j.s();
        s.h();
        final l7 s2 = com.google.android.gms.internal.firebase_auth_api.k.s();
        s2.h();
        s.k((k)((z)s2).c());
        hashMap.put("AES_CMAC", new c6((e)((z)s).c(), 1));
        final k7 s3 = com.google.android.gms.internal.firebase_auth_api.j.s();
        s3.h();
        final l7 s4 = com.google.android.gms.internal.firebase_auth_api.k.s();
        s4.h();
        s3.k((k)((z)s4).c());
        hashMap.put("AES256_CMAC", new c6((e)((z)s3).c(), 1));
        final k7 s5 = com.google.android.gms.internal.firebase_auth_api.j.s();
        s5.h();
        final l7 s6 = com.google.android.gms.internal.firebase_auth_api.k.s();
        s6.h();
        s5.k((k)((z)s6).c());
        hashMap.put("AES256_CMAC_RAW", new c6((e)((z)s5).c(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.j j = (com.google.android.gms.internal.firebase_auth_api.j)w0;
        x3.i(j.v());
        if (j.r() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
