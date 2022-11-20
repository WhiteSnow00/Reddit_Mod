// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.p;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.x0;
import com.google.android.gms.internal.firebase_auth_api.n;
import com.google.android.gms.internal.firebase_auth_api.t;

public final class q3 extends n6
{
    public final int b;
    
    public q3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final /* bridge */ Object a(final w0 w0) {
        switch (this.b) {
            default: {
                final String u = ((x0)((com.google.android.gms.internal.firebase_auth_api.w0)w0).v()).u();
                return y2.a(u).a(u);
            }
            case 1: {
                return new i9(((zzaau)((t)w0).v()).zzt());
            }
            case 0: {
                final n n = (n)w0;
                return new g9(((zzaau)n.x()).zzt(), ((p)n.w()).r());
            }
        }
    }
}
