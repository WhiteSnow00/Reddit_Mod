// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.p;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.n;

public final class s3 extends f6
{
    public s3() {
        super((Class)n.class, new n6[] { new q3(x9.class, 0) });
    }
    
    public final e6 a() {
        return new r3(this);
    }
    
    public final w0 b(final zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.n.v(zzaau, r.a());
    }
    
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
    
    public final void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.n n = (com.google.android.gms.internal.firebase_auth_api.n)w0;
        ea.c(n.r());
        ea.b(((com.google.android.gms.internal.firebase_auth_api.zzaau)n.x()).zzd());
        final p w2 = n.w();
        if (((com.google.android.gms.internal.firebase_auth_api.p)w2).r() >= 12 && ((com.google.android.gms.internal.firebase_auth_api.p)w2).r() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
    
    public final int f() {
        return 3;
    }
}
