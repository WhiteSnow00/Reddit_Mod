// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.Map;
import java.util.Collections;
import com.google.android.gms.internal.firebase-auth-api.e;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.o0;
import com.google.android.gms.internal.firebase-auth-api.p0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public final class g3
{
    public static final Logger a;
    public static final AtomicReference b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    
    static {
        a = Logger.getLogger(g3.class.getName());
        b = new AtomicReference((V)new q2());
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }
    
    public static o0 a(final p0 p) throws GeneralSecurityException {
        synchronized (g3.class) {
            final k2 r = g3.b.get().d(((com.google.android.gms.internal.firebase_auth_api.p0)p).v()).r();
            if (g3.d.get(((com.google.android.gms.internal.firebase_auth_api.p0)p).v())) {
                return r.a(((com.google.android.gms.internal.firebase_auth_api.p0)p).u());
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(((com.google.android.gms.internal.firebase_auth_api.p0)p).v())));
        }
    }
    
    public static x0 b(final p0 p) throws GeneralSecurityException {
        synchronized (g3.class) {
            final k2 r = g3.b.get().d(((com.google.android.gms.internal.firebase_auth_api.p0)p).v()).r();
            if (g3.d.get(((com.google.android.gms.internal.firebase_auth_api.p0)p).v())) {
                return r.d(((com.google.android.gms.internal.firebase_auth_api.p0)p).u());
            }
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(((com.google.android.gms.internal.firebase_auth_api.p0)p).v())));
        }
    }
    
    public static Object c(final String s, final e e, final Class clazz) throws GeneralSecurityException {
        return g3.b.get().c(clazz, s).b(e);
    }
    
    public static void d(final p6 p2, final g6 g6) throws GeneralSecurityException {
        synchronized (g3.class) {
            final AtomicReference b = g3.b;
            final q2 q2 = new q2((q2)b.get());
            q2.a(p2, g6);
            final String c = ((g6)p2).c();
            final String c2 = g6.c();
            g(c, ((g6)p2).a().c(), true);
            g(c2, Collections.emptyMap(), false);
            if (!b.get().a.containsKey(c)) {
                g3.c.put(c, new r5((Object)p2));
                h(((g6)p2).c(), ((g6)p2).a().c());
            }
            final ConcurrentHashMap d = g3.d;
            d.put(c, Boolean.TRUE);
            d.put(c2, Boolean.FALSE);
            b.set(q2);
        }
    }
    
    public static void e(final g6 g6) throws GeneralSecurityException {
        synchronized (g3.class) {
            final AtomicReference b = g3.b;
            final q2 q2 = new q2((q2)b.get());
            q2.b(g6);
            final String c = g6.c();
            g(c, g6.a().c(), true);
            if (!b.get().a.containsKey(c)) {
                g3.c.put(c, new r5((Object)g6));
                h(c, g6.a().c());
            }
            g3.d.put(c, Boolean.TRUE);
            b.set(q2);
        }
    }
    
    public static void f(final d3 d3) throws GeneralSecurityException {
        synchronized (g3.class) {
            final Class r = d3.r();
            final ConcurrentHashMap e = g3.e;
            if (e.containsKey(r)) {
                final d3 d4 = e.get(r);
                if (!d3.getClass().getName().equals(d4.getClass().getName())) {
                    g3.a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(r.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", r.getName(), d4.getClass().getName(), d3.getClass().getName()));
                }
            }
            e.put(r, d3);
        }
    }
    
    public static void g(final String s, final Map map, final boolean b) throws GeneralSecurityException {
        monitorenter(g3.class);
        Label_0262: {
            if (b) {
                try {
                    final ConcurrentHashMap d = g3.d;
                    if (d.containsKey(s) && !(boolean)d.get(s)) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(s));
                    }
                    if (g3.b.get().a.containsKey(s)) {
                        Label_0120: {
                            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                                if (g3.f.containsKey(entry.getKey())) {
                                    continue;
                                }
                                break Label_0120;
                            }
                            break Label_0262;
                        }
                        final Map.Entry<Object, V> entry;
                        final String s2 = entry.getKey();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Attempted to register a new key template ");
                        sb.append(s2);
                        sb.append(" from an existing key manager of type ");
                        sb.append(s);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    for (final Map.Entry<Object, V> entry2 : map.entrySet()) {
                        if (!g3.f.containsKey(entry2.getKey())) {
                            continue;
                        }
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf(entry2.getKey())));
                    }
                }
                finally {
                    monitorexit(g3.class);
                }
            }
        }
        monitorexit(g3.class);
    }
    
    public static void h(final String s, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            g3.f.put(entry.getKey(), s2.a(s, ((x0)((d6)entry.getValue()).a).j(), ((d6)entry.getValue()).b));
        }
    }
}
