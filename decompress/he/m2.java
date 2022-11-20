// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.p0;
import com.google.android.gms.internal.firebase-auth-api.zzaau;

public class m2 implements k2
{
    public final f6 a;
    public final Class b;
    
    public m2(final f6 a, final Class b) {
        if (!a.b.keySet().contains(b) && !Void.class.equals(b)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", a.toString(), b.getName()));
        }
        this.a = a;
        this.b = b;
    }
    
    public final p0 a(final zzaau zzaau) throws GeneralSecurityException {
        try {
            final w0 a = new l2(this.a.a()).a(zzaau);
            final u8 r = com.google.android.gms.internal.firebase_auth_api.p0.r();
            final String c = this.a.c();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.w((p0)((z)r).g, c);
            final zzaau g = a.g();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.x((p0)((z)r).g, g);
            final int f = this.a.f();
            if (((z)r).h) {
                ((z)r).f();
                ((z)r).h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.p0.z((p0)((z)r).g, f);
            return (p0)((z)r).c();
        }
        catch (final zzacf zzacf) {
            throw new GeneralSecurityException("Unexpected proto", (Throwable)zzacf);
        }
    }
    
    public final Object b(final e e) throws GeneralSecurityException {
        final String concat = "Expected proto of type ".concat(this.a.a.getName());
        if (this.a.a.isInstance(e)) {
            return this.f((w0)e);
        }
        throw new GeneralSecurityException(concat);
    }
    
    public final Object c(final zzaau zzaau) throws GeneralSecurityException {
        try {
            return this.f(this.a.b(zzaau));
        }
        catch (final zzacf zzacf) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.a.getName()), (Throwable)zzacf);
        }
    }
    
    public final w0 d(final zzaau zzaau) throws GeneralSecurityException {
        try {
            return new l2(this.a.a()).a(zzaau);
        }
        catch (final zzacf zzacf) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.a().a.getName()), (Throwable)zzacf);
        }
    }
    
    public final Object f(final w0 w0) throws GeneralSecurityException {
        if (!Void.class.equals(this.b)) {
            this.a.d(w0);
            return this.a.g(w0, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
    
    public final String t() {
        return this.a.c();
    }
}
