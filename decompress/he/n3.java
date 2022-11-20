// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.k0;
import com.google.android.gms.internal.firebase_auth_api.i0;
import com.google.android.gms.internal.firebase_auth_api.s;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.l;
import com.google.android.gms.internal.firebase_auth_api.q;
import com.google.android.gms.internal.firebase_auth_api.x;

public final class n3 extends n6
{
    public final int b;
    
    public n3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final /* bridge */ Object a(final w0 w0) {
        switch (this.b) {
            default: {
                return new j9(((zzaau)((x)w0).v()).zzt());
            }
            case 1: {
                final q q = (q)w0;
                return new h9(((zzaau)q.w()).zzt(), ((s)q.v()).r());
            }
            case 0: {
                final l l = (l)w0;
                return new r9((x9)new s3().g((w0)l.v(), (Class)x9.class), (z2)((f6)new a4(2)).g((w0)l.w(), (Class)z2.class), ((k0)((i0)l.w()).w()).r());
            }
        }
    }
}
