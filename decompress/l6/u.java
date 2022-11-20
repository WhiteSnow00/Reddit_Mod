// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import androidx.work.impl.WorkDatabase;
import b6.j;
import k6.r;
import m6.a;
import b6.e;

public final class u implements e
{
    public final a a;
    public final j6.a b;
    public final r c;
    
    static {
        j.e("WMFgUpdater");
    }
    
    public u(final WorkDatabase workDatabase, final j6.a b, final a a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.x();
    }
}
