// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import aq2.a;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.x;

public final class p4 extends f6
{
    public p4() {
        super((Class)x.class, new n6[] { new n3(h2.class, 2) });
    }
    
    public final e6 a() {
        return new o4();
    }
    
    public final w0 b(final zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.x.u(zzaau, r.a());
    }
    
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }
    
    public final /* bridge */ void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.x x = (com.google.android.gms.internal.firebase_auth_api.x)w0;
        ea.c(x.r());
        if (((com.google.android.gms.internal.firebase_auth_api.zzaau)x.v()).zzd() == 64) {
            return;
        }
        throw new InvalidKeyException(a.l("invalid key size: ", ((com.google.android.gms.internal.firebase_auth_api.zzaau)x.v()).zzd(), ". Valid keys must have 64 bytes."));
    }
    
    public final int f() {
        return 3;
    }
}
