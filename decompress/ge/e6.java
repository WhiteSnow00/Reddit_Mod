// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.Collections;
import java.util.Map;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import java.security.GeneralSecurityException;

public abstract class e6
{
    public final Class a;
    
    public e6(final Class a) {
        this.a = a;
    }
    
    public abstract x0 a(final x0 p0) throws GeneralSecurityException;
    
    public abstract x0 b(final zzaau p0) throws zzacf;
    
    public Map c() throws GeneralSecurityException {
        return Collections.emptyMap();
    }
    
    public abstract void d(final x0 p0) throws GeneralSecurityException;
}
