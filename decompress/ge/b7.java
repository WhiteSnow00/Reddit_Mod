// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.z0;

public final class b7
{
    static {
        new a7();
        final int f = z0.f;
        try {
            a();
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static void a() throws GeneralSecurityException {
        g3.f((d3)new e7());
        g3.e((f6)new a7());
        if (j4.a()) {
            return;
        }
        g3.e((f6)new x6());
        final l6 a = z6.a;
        final i6 b = i6.b;
        final l6 a2 = z6.a;
        synchronized (b) {
            final r6 r6 = new r6((u6)b.a.get());
            r6.d(a2);
            b.a.set(new u6(r6));
            monitorexit(b);
            final j6 b2 = z6.b;
            synchronized (b) {
                final r6 r7 = new r6((u6)b.a.get());
                r7.c(b2);
                b.a.set(new u6(r7));
                monitorexit(b);
                final a6 c = z6.c;
                synchronized (b) {
                    final r6 r8 = new r6((u6)b.a.get());
                    r8.b(c);
                    b.a.set(new u6(r8));
                    monitorexit(b);
                    final y5 d = z6.d;
                    synchronized (b) {
                        final r6 r9 = new r6((u6)b.a.get());
                        r9.a(d);
                        b.a.set(new u6(r9));
                    }
                }
            }
        }
    }
}
