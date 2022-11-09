// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import c6.h;
import n6.a;
import androidx.work.impl.WorkDatabase;
import c6.j;

public final class w implements j
{
    public static final String c;
    public final WorkDatabase a;
    public final a b;
    
    static {
        c = h.e("WorkProgressUpdater");
    }
    
    public w(final WorkDatabase a, final a b) {
        this.a = a;
        this.b = b;
    }
}
