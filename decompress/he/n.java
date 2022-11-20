// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.h;

public final class n extends u0
{
    public final v9 k;
    
    public n(final h h, final CharSequence charSequence, final v9 k) {
        this.k = k;
        super(h, charSequence);
    }
    
    public final int d(final int n) {
        return ((bb)this.k).a.end();
    }
    
    public final int e(final int n) {
        if (((bb)this.k).a.find(n)) {
            return ((bb)this.k).a.start();
        }
        return -1;
    }
}
