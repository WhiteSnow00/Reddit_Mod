// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import od.a$a;

public final class r implements a$a
{
    public final BasePendingResult a;
    public final s b;
    
    public r(final s b, final a a) {
        this.b = b;
        this.a = (BasePendingResult)a;
    }
    
    public final void a(final Status status) {
        this.b.a.remove(this.a);
    }
}
