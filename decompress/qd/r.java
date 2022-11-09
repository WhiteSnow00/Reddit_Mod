// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import pd.a;

public final class r implements a
{
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ s b;
    
    public r(final s b, final com.google.android.gms.common.api.internal.a a) {
        this.b = b;
        this.a = (BasePendingResult)a;
    }
    
    @Override
    public final void a(final Status status) {
        this.b.a.remove(this.a);
    }
}
