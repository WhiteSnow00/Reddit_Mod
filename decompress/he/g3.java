// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.p0;
import com.google.android.gms.internal.firebase-auth-api.zzaau;

public final class g3 extends m2 implements f3
{
    public final o6 c;
    public final f6 d;
    
    public g3(final o6 c, final f6 d, final Class clazz) {
        super(c, clazz);
        this.c = c;
        this.d = d;
    }
    
    public final p0 e(final zzaau zzaau) throws GeneralSecurityException {
        try {
            final w0 b = this.c.b(zzaau);
            this.c.d(b);
            final w0 h = this.c.h(b);
            this.d.d(h);
            final u8 r = com.google.android.gms.internal.firebase_auth_api.p0.r();
            final String c = this.d.c();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.w((p0)((z)r).g, c);
            final zzaau g = h.g();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.x((p0)((z)r).g, g);
            final int f = this.d.f();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.z((p0)((z)r).g, f);
            return (p0)((z)r).c();
        }
        catch (final zzacf zzacf) {
            throw new GeneralSecurityException("expected serialized proto of type ", (Throwable)zzacf);
        }
    }
}
