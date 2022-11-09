// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import a40.f;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class g6
{
    public final Class a;
    public final Map b;
    public final Class c;
    
    @SafeVarargs
    public g6(final Class a, final o6... array) {
        this.a = a;
        final HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; ++i) {
            final o6 o6 = array[i];
            if (hashMap.containsKey(o6.a)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(o6.a.getCanonicalName())));
            }
            hashMap.put(o6.a, o6);
        }
        this.c = array[0].a;
        this.b = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public abstract f6 a();
    
    public abstract x0 b(final zzaau p0) throws zzacf;
    
    public abstract String c();
    
    public abstract void d(final x0 p0) throws GeneralSecurityException;
    
    public int e() {
        return 1;
    }
    
    public abstract int f();
    
    public final Object g(final x0 x0, final Class clazz) throws GeneralSecurityException {
        final o6 o6 = this.b.get(clazz);
        if (o6 != null) {
            return o6.a(x0);
        }
        throw new IllegalArgumentException(f.n("Requested primitive class ", clazz.getCanonicalName(), " not supported."));
    }
}
