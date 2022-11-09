// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.nio.charset.Charset;
import com.google.android.gms.internal.measurement.e;
import java.util.concurrent.ConcurrentHashMap;

public final class h7
{
    public static final h7 c;
    public final t6 a;
    public final ConcurrentHashMap b;
    
    static {
        c = new h7();
    }
    
    public h7() {
        this.b = new ConcurrentHashMap();
        this.a = new t6();
    }
    
    public final k7 a(final Class clazz) {
        final Charset a = i6.a;
        if (clazz != null) {
            Object o;
            if ((o = this.b.get(clazz)) == null) {
                final t6 a2 = this.a;
                a2.getClass();
                final Class a3 = e.a;
                if (!c6.class.isAssignableFrom(clazz)) {
                    final Class a4 = e.a;
                    if (a4 != null) {
                        if (!a4.isAssignableFrom(clazz)) {
                            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                        }
                    }
                }
                final x6 a5 = a2.a.a(clazz);
                if (a5.r()) {
                    if (c6.class.isAssignableFrom(clazz)) {
                        o = new d7((u7)e.d, (q5)s5.a, a5.zza());
                    }
                    else {
                        final u7 b = e.b;
                        final q5 b2 = s5.b;
                        if (b2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        o = new d7(b, b2, a5.zza());
                    }
                }
                else {
                    final boolean assignable = c6.class.isAssignableFrom(clazz);
                    final int n = 0;
                    boolean b3 = false;
                    if (assignable) {
                        if (a5.s() == 1) {
                            b3 = true;
                        }
                        if (b3) {
                            final int a6 = f7.a;
                            o = c7.z(a5, (o6)o6.b, (u7)e.d, (q5)s5.a, w6.b);
                        }
                        else {
                            final int a7 = f7.a;
                            o = c7.z(a5, (o6)o6.b, (u7)e.d, (q5)null, w6.b);
                        }
                    }
                    else {
                        int n2 = n;
                        if (a5.s() == 1) {
                            n2 = 1;
                        }
                        if (n2 != 0) {
                            final int a8 = f7.a;
                            final m6 a9 = o6.a;
                            final u7 b4 = e.b;
                            final q5 b5 = s5.b;
                            if (b5 == null) {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                            o = c7.z(a5, (o6)a9, b4, b5, w6.a);
                        }
                        else {
                            final int a10 = f7.a;
                            o = c7.z(a5, (o6)o6.a, e.c, (q5)null, w6.a);
                        }
                    }
                }
                final k7 k7 = this.b.putIfAbsent(clazz, o);
                if (k7 != null) {
                    return k7;
                }
            }
            return (k7)o;
        }
        throw new NullPointerException("messageType");
    }
}
