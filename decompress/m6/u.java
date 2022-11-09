// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.work.impl.WorkDatabase;
import c6.h;
import l6.r;
import n6.a;
import c6.e;

public final class u implements e
{
    public final a a;
    public final k6.a b;
    public final r c;
    
    static {
        h.e("WMFgUpdater");
    }
    
    public u(final WorkDatabase workDatabase, final k6.a b, final a a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.x();
    }
}
