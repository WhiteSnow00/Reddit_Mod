// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.nio.charset.Charset;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.f;
import java.util.concurrent.ConcurrentHashMap;

public final class f1
{
    public static final f1 c;
    public final q0 a;
    public final ConcurrentHashMap b;
    
    static {
        c = new f1();
    }
    
    public f1() {
        this.b = new ConcurrentHashMap();
        this.a = new q0();
    }
    
    public final i1 a(final Class clazz) {
        final Charset a = f0.a;
        if (clazz != null) {
            Object o;
            if ((o = this.b.get(clazz)) == null) {
                final q0 a2 = this.a;
                a2.getClass();
                final Class a3 = f.a;
                if (!e.class.isAssignableFrom(clazz)) {
                    final Class a4 = f.a;
                    if (a4 != null) {
                        if (!a4.isAssignableFrom(clazz)) {
                            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                        }
                    }
                }
                final u0 a5 = a2.a.a(clazz);
                if (a5.r()) {
                    if (e.class.isAssignableFrom(clazz)) {
                        o = new b1((s1)f.d, (s)u.a, a5.zza());
                    }
                    else {
                        final s1 b = f.b;
                        final s b2 = u.b;
                        if (b2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        o = new b1(b, b2, a5.zza());
                    }
                }
                else {
                    final boolean assignable = e.class.isAssignableFrom(clazz);
                    final int n = 0;
                    boolean b3 = false;
                    if (assignable) {
                        if (a5.s() == 1) {
                            b3 = true;
                        }
                        if (b3) {
                            final int a6 = d1.a;
                            o = a1.E(a5, (m0)m0.b, (s1)f.d, (s)u.a, t0.b);
                        }
                        else {
                            final int a7 = d1.a;
                            o = a1.E(a5, (m0)m0.b, (s1)f.d, (s)null, t0.b);
                        }
                    }
                    else {
                        int n2 = n;
                        if (a5.s() == 1) {
                            n2 = 1;
                        }
                        if (n2 != 0) {
                            final int a8 = d1.a;
                            final j0 a9 = m0.a;
                            final s1 b4 = f.b;
                            final s b5 = u.b;
                            if (b5 == null) {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                            o = a1.E(a5, (m0)a9, b4, b5, t0.a);
                        }
                        else {
                            final int a10 = d1.a;
                            o = a1.E(a5, (m0)m0.a, f.c, (s)null, t0.a);
                        }
                    }
                }
                final i1 i1 = this.b.putIfAbsent(clazz, o);
                if (i1 != null) {
                    return i1;
                }
            }
            return (i1)o;
        }
        throw new NullPointerException("messageType");
    }
}
