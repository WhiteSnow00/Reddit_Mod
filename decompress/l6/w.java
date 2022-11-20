// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import b6.j;
import m6.a;
import androidx.work.impl.WorkDatabase;
import b6.l;

public final class w implements l
{
    public static final String c;
    public final WorkDatabase a;
    public final a b;
    
    static {
        c = j.e("WorkProgressUpdater");
    }
    
    public w(final WorkDatabase a, final a b) {
        this.a = a;
        this.b = b;
    }
}
