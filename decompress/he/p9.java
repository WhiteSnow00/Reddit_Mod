// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Iterator;
import com.google.android.gms.internal.firebase-auth-api.h;

public final class p9 implements o1
{
    public final Object f;
    
    public p9(final Object f) {
        this.f = f;
    }
    
    public final /* bridge */ Iterator b(final h h, final CharSequence charSequence) {
        return (Iterator)new n(h, charSequence, ((ia)this.f).zza(charSequence));
    }
}
