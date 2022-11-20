// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.InvalidAlgorithmParameterException;
import aq2.a;
import java.util.Collections;
import com.google.android.gms.internal.firebase-auth-api.e;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.x;
import com.google.android.gms.internal.firebase-auth-api.y;

public final class o4 extends e6
{
    public o4() {
        super((Class)y.class);
    }
    
    public final w0 a(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.y y = (com.google.android.gms.internal.firebase_auth_api.y)w0;
        final z7 s = x.s();
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(y.r()));
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        x.x((com.google.android.gms.internal.firebase-auth-api.x)((z)s).g, zzn);
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        x.w((com.google.android.gms.internal.firebase-auth-api.x)((z)s).g);
        return (w0)((z)s).c();
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.y.u(zzaau, r.a());
    }
    
    public final Map c() throws GeneralSecurityException {
        final HashMap hashMap = new HashMap();
        final b8 s = com.google.android.gms.internal.firebase_auth_api.y.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.y.v((y)((z)s).g);
        hashMap.put("AES256_SIV", new c6((e)((z)s).c(), 1));
        final b8 s2 = com.google.android.gms.internal.firebase_auth_api.y.s();
        if (((z)s2).h) {
            ((z)s2).f();
            ((z)s2).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.y.v((y)((z)s2).g);
        hashMap.put("AES256_SIV_RAW", new c6((e)((z)s2).c(), 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final /* bridge */ void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.y y = (com.google.android.gms.internal.firebase_auth_api.y)w0;
        if (y.r() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException(a.l("invalid key size: ", y.r(), ". Valid keys must have 64 bytes."));
    }
}
