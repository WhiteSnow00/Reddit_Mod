// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import qd.a1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class e<R extends c> extends BasePendingResult<R>
{
    public final R m;
    
    public e(final Status m) {
        super(null);
        this.m = (R)m;
    }
    
    @Override
    public final R d(final Status status) {
        return this.m;
    }
}
