// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.e;

public final class y implements v0
{
    public static final y a;
    
    static {
        a = new y();
    }
    
    public final t0 a(final Class clazz) {
        if (e.class.isAssignableFrom(clazz)) {
            try {
                return (t0)((com.google.android.gms.internal.firebase_auth_api.e)com.google.android.gms.internal.firebase_auth_api.e.o((Class)clazz.asSubclass(e.class))).h(3);
            }
            catch (final Exception ex) {
                throw new RuntimeException("Unable to get message info for ".concat(clazz.getName()), ex);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(clazz.getName()));
    }
    
    public final boolean b(final Class clazz) {
        return e.class.isAssignableFrom(clazz);
    }
}
