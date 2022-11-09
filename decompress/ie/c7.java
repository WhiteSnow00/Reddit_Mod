// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.z0;

public final class c7
{
    static {
        new b7();
        final int f = z0.f;
        try {
            a();
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static void a() throws GeneralSecurityException {
        g3.f((d3)new f7());
        g3.e((g6)new b7());
        if (k4.a()) {
            return;
        }
        g3.e((g6)new y6());
        final m6 a = a7.a;
        final j6 b = j6.b;
        final m6 a2 = a7.a;
        synchronized (b) {
            final s6 s6 = new s6((v6)b.a.get());
            s6.d(a2);
            b.a.set(new v6(s6));
            monitorexit(b);
            final k6 b2 = a7.b;
            synchronized (b) {
                final s6 s7 = new s6((v6)b.a.get());
                s7.c(b2);
                b.a.set(new v6(s7));
                monitorexit(b);
                final b6 c = a7.c;
                synchronized (b) {
                    final s6 s8 = new s6((v6)b.a.get());
                    s8.b(c);
                    b.a.set(new v6(s8));
                    monitorexit(b);
                    final z5 d = a7.d;
                    synchronized (b) {
                        final s6 s9 = new s6((v6)b.a.get());
                        s9.a(d);
                        b.a.set(new v6(s9));
                    }
                }
            }
        }
    }
}
